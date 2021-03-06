cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -fexceptions -Wall -fno-rtti")



add_definitions(-DGLM_ENABLE_EXPERIMENTAL)
#add_definitions(-DGLM_LANG_STL11_FORCED)

#ModelAssimpNative
add_library(ModelAssimpNative SHARED
            jniCalls/assimpActivity.cpp
            jniCalls/gestureClass.cpp
            jniCalls/myGLRenderer.cpp
            nativeCode/common/assimpLoader.cpp
            nativeCode/common/misc.cpp
            nativeCode/common/myGLCamera.cpp
            nativeCode/common/myGLFunctions.cpp
            nativeCode/common/myJNIHelper.cpp
            nativeCode/common/myShader.cpp
            nativeCode/modelAssimp/Mesh.cpp
            nativeCode/modelAssimp/Model.cpp
            nativeCode/modelAssimp/modelAssimp.cpp
            nativeCode/modelAssimp/Shader.cpp
            ndk_helper/gestureDetector.cpp
            ndk_helper/gl3stub.c
            ndk_helper/GLContext.cpp
            ndk_helper/interpolator.cpp
            ndk_helper/JNIHelper.cpp
            ndk_helper/perfMonitor.cpp
            ndk_helper/shader.cpp
            ndk_helper/tapCamera.cpp
            ndk_helper/vecmath.cpp

            )

target_include_directories(ModelAssimpNative PRIVATE
                          ${CMAKE_CURRENT_SOURCE_DIR}
                          ${CMAKE_CURRENT_SOURCE_DIR}/externals
                          ${CMAKE_CURRENT_SOURCE_DIR}/jniCalls
                          ${CMAKE_CURRENT_SOURCE_DIR}/nativeCode/common
                          ${CMAKE_CURRENT_SOURCE_DIR}/nativeCode/modelAssimp
                          ${CMAKE_CURRENT_SOURCE_DIR}/ndk_helper
                     )

add_library(lib_assimp SHARED IMPORTED)
set_target_properties(lib_assimp PROPERTIES IMPORTED_LOCATION
    ${CMAKE_CURRENT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI}/libassimp.so)

add_library(lib_opencv SHARED IMPORTED)
set_target_properties(lib_opencv PROPERTIES IMPORTED_LOCATION
    ${CMAKE_CURRENT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI}/libopencv_java3.so)


target_link_libraries(ModelAssimpNative
                      android
                      log
                      EGL
                      GLESv2
                      lib_assimp
                      lib_opencv
                  )


