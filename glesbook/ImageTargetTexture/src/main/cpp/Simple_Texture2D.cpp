
#include <stdlib.h>
#include "esUtil.h"
#include "GraphicBuffer.h"
#include "android/native_window.h"
#include "my_log.h"
#include <GLES2/gl2ext.h>


typedef struct
{
   // Handle to a program object
   GLuint programObject;

   // Sampler location
   GLint samplerLoc;

   // Texture handle
   GLuint textureId;

} UserData;

///
// Create a simple 2x2 texture image with four different colors
//
GLuint CreateSimpleTexture2D( ESContext *esContext)
{
   // Texture object handle
   GLuint textureId;

   // 2x2 Image, 3 bytes per pixel (R, G, B)
   GLubyte pixels[4 * 4] =
   {
      255,   0,   0, 255, // Red
        0, 255,   0, 255, // Green
        0,   0, 255, 255, // Blue
      255, 255,   0, 255  // Yellow
   };

    ANativeWindowBuffer *pbuffer;

    int usage = GraphicBuffer::USAGE_HW_TEXTURE | GraphicBuffer::USAGE_SW_READ_OFTEN | GraphicBuffer::USAGE_SW_WRITE_RARELY;
    GraphicBuffer *graphicBuffer = new GraphicBuffer( 2, 2, PIXEL_FORMAT_RGBA_8888, usage);
    graphicBuffer->initCheck();
    EGLClientBuffer clientBuffer = graphicBuffer->getNativeBuffer();

    const EGLint buffer_att[] = {
            EGL_WIDTH, 2,
            EGL_HEIGHT, 2,
            EGL_RED_SIZE, 8,
            EGL_GREEN_SIZE, 8,
            EGL_BLUE_SIZE, 8,
            EGL_ALPHA_SIZE, 8,
            EGL_NATIVE_BUFFER_USAGE_ANDROID, EGL_NATIVE_BUFFER_USAGE_TEXTURE_ANDROID,
            EGL_NONE
    };
    EGLClientBuffer buffer = eglCreateNativeClientBufferANDROID(buffer_att);
    EGLint attrs[] = {
            EGL_IMAGE_PRESERVED_KHR,        EGL_TRUE,
            EGL_IMAGE_CROP_LEFT_ANDROID,    0,
            EGL_IMAGE_CROP_TOP_ANDROID,     0,
            EGL_IMAGE_CROP_RIGHT_ANDROID,   2,
            EGL_IMAGE_CROP_BOTTOM_ANDROID,  2,
            EGL_NONE,
    };
    esContext->pEGLImage = eglCreateImageKHR(eglGetCurrentDisplay(), EGL_NO_CONTEXT,
                                             EGL_NATIVE_BUFFER_ANDROID,
//                                             EGL_GL_TEXTURE_2D_KHR,
                                             (EGLClientBuffer)buffer, NULL);

//    status_t err = graphicBuffer->initCheck();
//    if (err != OK)
//    {
//        LOGI("Error: %sn", strerror(-err));
//        return 0;
//    }
//
//    memcpy(buffer, pixels, 4*4);
    // Use tightly packed data
    glPixelStorei ( GL_UNPACK_ALIGNMENT, 1 );
    // Generate a texture object
    glGenTextures ( 1, &textureId );
    // Bind the texture object
    glBindTexture ( GL_TEXTURE_2D, textureId );
//    glTexImage2D ( GL_TEXTURE_2D, 0, GL_RGBA, 2, 2, 0, GL_RGBA, GL_UNSIGNED_BYTE, pixels );
    glTexParameteri ( GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST );
    glTexParameteri ( GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST );
    glEGLImageTargetTexture2DOES(GL_TEXTURE_2D, esContext->pEGLImage);

    // Load the texture
//   glTexImage2D ( GL_TEXTURE_2D, 0, GL_RGB, 2, 2, 0, GL_RGB, GL_UNSIGNED_BYTE, pixels );
    // Set the filtering mode


//    EGLint lockAttribList[] = {
//            EGL_LOCK_USAGE_HINT_KHR,
//            EGL_WRITE_SURFACE_BIT_KHR,
//            EGL_NONE
//    };
//    EGLBoolean lockResult = eglLockSurfaceKHR(esContext->eglDisplay, esContext->pEGLImage, lockAttribList);
//    EGLBoolean unlockResult = eglUnlockSurfaceKHR(esContext->eglDisplay, esContext->pEGLImage);

//    GLubyte *pdata;
//    graphicBuffer->lock(GraphicBuffer::USAGE_SW_WRITE_OFTEN, (void**)&pdata);
////    memset(pdata,128, 2*2);
//    memcpy(pdata, pixels, 3);
//    graphicBuffer->unlock();

   return textureId;

}


///
// Initialize the shader and program object
//
int Init ( ESContext *esContext )
{
   UserData *userData = (UserData *)esContext->userData;
   char vShaderStr[] =
      "#version 300 es                            \n"
      "layout(location = 0) in vec4 a_position;   \n"
      "layout(location = 1) in vec2 a_texCoord;   \n"
      "out vec2 v_texCoord;                       \n"
      "void main()                                \n"
      "{                                          \n"
      "   gl_Position = a_position;               \n"
      "   v_texCoord = a_texCoord;                \n"
      "   gl_PointSize = 200.0;                   \n"
      "}                                          \n";

   char fShaderStr[] =
      "#version 300 es                                     \n"
      "precision mediump float;                            \n"
      "in vec2 v_texCoord;                                 \n"
      "layout(location = 0) out vec4 outColor;             \n"
      "uniform sampler2D s_texture;                        \n"
      "void main()                                         \n"
      "{                                                   \n"
      "  outColor = texture( s_texture, gl_PointCoord );   \n"
      "}                                                   \n";

   // Load the shaders and get a linked program object
   userData->programObject = esLoadProgram ( vShaderStr, fShaderStr );

   // Get the sampler location
   userData->samplerLoc = glGetUniformLocation ( userData->programObject, "s_texture" );

   // Load the texture
   userData->textureId = CreateSimpleTexture2D (esContext);

   glClearColor ( 1.0f, 1.0f, 1.0f, 0.0f );
   return TRUE;
}

///
// Draw a triangle using the shader pair created in Init()
//
void Draw ( ESContext *esContext )
{
   UserData *userData = (UserData *)esContext->userData;
   GLfloat vVertices[] = { -0.5f,  0.5f, 0.0f,  // Position 0
                            0.0f,  0.0f,        // TexCoord 0 
                           -0.5f, -0.5f, 0.0f,  // Position 1
                            0.0f,  1.0f,        // TexCoord 1
                            0.5f, -0.5f, 0.0f,  // Position 2
                            1.0f,  1.0f,        // TexCoord 2
                            0.5f,  0.5f, 0.0f,  // Position 3
                            1.0f,  0.0f         // TexCoord 3
                         };
   GLushort indices[] = { 0, 1, 2, 0, 2, 3 };

   // Set the viewport
   glViewport ( 0, 0, esContext->width, esContext->height );

   // Clear the color buffer
   glClear ( GL_COLOR_BUFFER_BIT );

   // Use the program object
   glUseProgram ( userData->programObject );

   // Load the vertex position
   glVertexAttribPointer ( 0, 3, GL_FLOAT, GL_FALSE, 5 * sizeof ( GLfloat ), vVertices );
   // Load the texture coordinate
   glVertexAttribPointer ( 1, 2, GL_FLOAT, GL_FALSE, 5 * sizeof ( GLfloat ), &vVertices[3] );

   glEnableVertexAttribArray ( 0 );
   glEnableVertexAttribArray ( 1 );

   // Bind the texture
   glActiveTexture ( GL_TEXTURE0 );
   glBindTexture ( GL_TEXTURE_2D, userData->textureId );

   // Set the sampler texture unit to 0
   glUniform1i ( userData->samplerLoc, 0 );

//   glDrawElements ( GL_TRIANGLES, 6, GL_UNSIGNED_SHORT, indices );
    glDrawArrays ( GL_POINTS, 0, 6 );
}

///
// Cleanup
//
void ShutDown ( ESContext *esContext )
{
   UserData *userData = (UserData *)esContext->userData;

   // Delete texture object
   glDeleteTextures ( 1, &userData->textureId );

   // Delete program object
   glDeleteProgram ( userData->programObject );

    eglDestroyImageKHR(esContext->eglDisplay,esContext->pEGLImage);
}


int esMain ( ESContext *esContext )
{
   esContext->userData = malloc ( sizeof ( UserData ) );

   esCreateWindow ( esContext, "Simple Texture 2D", 320, 240, ES_WINDOW_RGB );

   if ( !Init ( esContext ) )
   {
      return GL_FALSE;
   }

   esRegisterDrawFunc ( esContext, Draw );
   esRegisterShutdownFunc ( esContext, ShutDown );

   return GL_TRUE;
}