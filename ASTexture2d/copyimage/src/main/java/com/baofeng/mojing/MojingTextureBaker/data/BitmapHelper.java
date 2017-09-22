package com.baofeng.mojing.MojingTextureBaker.data;

import android.content.Context;

import com.baofeng.mojing.MojingTextureBaker.R;
import com.baofeng.mojing.MojingTextureBaker.util.TextureHelper;

import java.nio.IntBuffer;

/**
 * Created by zhangxingang on 2017/9/19.
 */

public class BitmapHelper {
    private static int[] mBitmapResource = {
            R.drawable.right,
            R.drawable.left,
            R.drawable.top,
            R.drawable.bottom,
            R.drawable.back,
            R.drawable.front,
            R.drawable.choose_icon_remember_highlight,
            R.drawable.choose_icon_simple,
            R.drawable.choose_icon_simple_highlight,
            R.drawable.clear_btn_normal,
            R.drawable.default_fly_screen_video,
            R.drawable.devlist_loading_icon,
            R.drawable.dialog_success_icon,
            R.drawable.empty_icon_warning,
            R.drawable.empty_img_subscribe_icon,
            R.drawable.enter_blueteeth_img3,
            R.drawable.enter_blueteeth_usb,
            R.drawable.enter_control_icon_hand,
            R.drawable.enter_control_icon_head,
            R.drawable.enter_icon_scan,
            R.drawable.enter_icon_setting,
            R.drawable.enter_img_phone,
            R.drawable.fast_forward_icon,
            R.drawable.fly_device_item,
            R.drawable.fly_device_item_pressed,
            R.drawable.fly_screen_device_search_nor,
            R.drawable.fly_screen_device_search_selected,
            R.drawable.fly_screen_guide_img_3,
            R.drawable.fly_screen_search_background,
            R.drawable.fly_screen_search_foreground,
            R.drawable.gameinf_icon_share_normal,
            R.drawable.game_rank_list_no_icon,
            R.drawable.guide_button,
            R.drawable.guide_icon1_highlight,
            R.drawable.guide_icon1_normal,
            R.drawable.guide_icon2_highlight,
            R.drawable.guide_icon2_normal,
            R.drawable.guide_icon_choose_highlight,
            R.drawable.guide_icon_choose_normal,
            R.drawable.handle_back,
            R.drawable.handle_menu,
            R.drawable.help_feedback_pressed,
            R.drawable.help_icon_successful,
            R.drawable.icon_cate_label,
            R.drawable.icon_choose_normal,
            R.drawable.icon_choose_selected,
            R.drawable.icon_close_black,
            R.drawable.icon_motion_handle_has_match,
            R.drawable.icon_motion_handle_no_match,
            R.drawable.icon_search,
            R.drawable.icon_selected,
            R.drawable.icon_unlock,
            R.drawable.icon_video_360,
            R.drawable.ic_launcher,
            R.drawable.img_common_problem,
            R.drawable.img_default_1n_cross,
            R.drawable.img_default_2n_cross,
            R.drawable.img_default_2n_vertical,
            R.drawable.img_default_3n_cross,
            R.drawable.img_default_3n_vertical,
            R.drawable.img_default_4n,
            R.drawable.img_default_banner,
            R.drawable.img_default_icon_classification,
            R.drawable.invr_icon_back_normal,
            R.drawable.invr_image_glasses1,
            R.drawable.invr_image_glasses2,
            R.drawable.invr_image_phone,
            R.drawable.iv_file_image_360_label,
            R.drawable.iv_file_image_360_label_bg,
            R.drawable.label_activity,
            R.drawable.label_first,
            R.drawable.label_live,
            R.drawable.label_sole,
            R.drawable.label_toukong,
            R.drawable.laber_dan,
            R.drawable.laber_guanfang,
            R.drawable.laber_leixing,
            R.drawable.laber_sanfang,
            R.drawable.laber_shuang,
            R.drawable.laber_wuguanggao,
            R.drawable.laber_youguanggao,
            R.drawable.laber_zhuanti,
            R.drawable.live_icon,
            R.drawable.loading_10_small,
            R.drawable.local_airplay_icon_screen,
            R.drawable.local_airplay_icon_share,
            R.drawable.local_airplay_share_icon_help,
//            R.drawable.local_airplay_share_icon_loading,
//            R.drawable.local_airplay_share_icon_reload,
//            R.drawable.local_airplay_share_icon_win,
//            R.drawable.local_download_null_icon,
//            R.drawable.local_file_browse_back_icon,
//            R.drawable.local_file_icon,
//            R.drawable.local_file_icon_back,
//            R.drawable.local_file_image_arrow,
//            R.drawable.local_file_image_http,
//            R.drawable.local_file_list_icon_fly,
//            R.drawable.local_file_list_icon_http,
//            R.drawable.local_file_list_icon_network,
//            R.drawable.local_file_switchoff,
//            R.drawable.local_file_switchon,
//            R.drawable.local_folder_icon,
//            R.drawable.local_icon_sort_normal,
//            R.drawable.local_image_default,
//            R.drawable.local_screen_img_0,
//            R.drawable.local_screen_img_help_1,
//            R.drawable.local_screen_img_help_2,
//            R.drawable.local_screen_img_help_3,
//            R.drawable.local_screen_img_nothing,
//            R.drawable.local_text_icon,
//            R.drawable.local_video_icon,
//            R.drawable.local_video_menu,
//            R.drawable.local_video_perview_icon_close,
//            R.drawable.local_video_perview_icon_play,
//            R.drawable.local_video_perview_icon_vrplay,
//            R.drawable.local_video__folder,
//            R.drawable.market_icon_game,
//            R.drawable.market_ranking_icon_1,
//            R.drawable.mask_bg,
//            R.drawable.microtutor_pen_progressdot,
//            R.drawable.mj_5_icon,
//            R.drawable.mj_contraller_pop_icon,
//            R.drawable.mj_pause_checked,
//            R.drawable.mj_pause_unchecked,
//            R.drawable.mj_play_checked,
//            R.drawable.mj_play_unchecked,
//            R.drawable.mj_rank_icon_top1,
//            R.drawable.mj_rank_icon_top2,
//            R.drawable.mj_rank_icon_top3,
//            R.drawable.mj_rank_title_bg,
//            R.drawable.mojing_default,
//            R.drawable.motion_handle_home,
//            R.drawable.motion_handle_touch,
//            R.drawable.my_about_img_logo,
//            R.drawable.my_icon_bean,
//            R.drawable.my_icon_cardboard,
//            R.drawable.my_icon_coin,
//            R.drawable.my_icon_equipment,
//            R.drawable.my_icon_handle,
//            R.drawable.my_icon_help,
//            R.drawable.my_icon_mission,
//            R.drawable.my_icon_otherhandle,
//            R.drawable.my_icon_pay,
//            R.drawable.my_icon_question,
//            R.drawable.my_icon_read,
//            R.drawable.my_icon_scan,
//            R.drawable.my_icon_set,
//            R.drawable.my_icon_shop,
//            R.drawable.my_icon_time,
//            R.drawable.my_right_arrow,
//            R.drawable.my_scan_close,
//            R.drawable.my_scan_lightline,
//            R.drawable.my_setting_switchoff,
//            R.drawable.my_setting_switchon,
//            R.drawable.nav_icon_add,
//            R.drawable.nav_icon_arrow_down,
//            R.drawable.nav_icon_arrow_up,
//            R.drawable.nav_icon_back,
//            R.drawable.nav_icon_back2,
//            R.drawable.nav_icon_invr,
//            R.drawable.nav_icon_invr_home,
//            R.drawable.nav_icon_invr_white,
//            R.drawable.nav_icon_me,
//            R.drawable.nav_icon_search,
//            R.drawable.nav_logo,
//            R.drawable.playbar_progressbar,
//            R.drawable.player_preview_button_play,
//            R.drawable.player_preview_button_play_press,
//            R.drawable.play_bg_control_hover_130_60,
//            R.drawable.play_bg_control_hover_140_60,
//            R.drawable.play_bg_control_hover_150_45,
//            R.drawable.play_bg_control_hover_150_60,
//            R.drawable.play_bg_control_hover_400_60,
//            R.drawable.play_bg_control_hover_440_60,
//            R.drawable.play_bg_control_hover_890_80,
//            R.drawable.play_bg_control_normal_130_60,
//            R.drawable.play_bg_control_normal_140_60,
//            R.drawable.play_bg_control_normal_150_45,
//            R.drawable.play_bg_control_normal_150_60,
//            R.drawable.play_bg_control_normal_400_60,
//            R.drawable.play_bg_control_normal_440_60,
//            R.drawable.play_bg_control_normal_740_60,
//            R.drawable.play_bg_control_normal_890_80,
//            R.drawable.play_bg_scene_hover,
//            R.drawable.play_bg_scene_normal,
//            R.drawable.play_bg_scene_ph_cinema,
//            R.drawable.play_bg_scene_ph_home,
//            R.drawable.play_button_bg_ok_hover,
//            R.drawable.play_button_bg_ok_normal,
//            R.drawable.play_button_down_disable,
//            R.drawable.play_button_down_hover,
//            R.drawable.play_button_down_normal,
//            R.drawable.play_button_up_disable,
//            R.drawable.play_button_up_hover,
//            R.drawable.play_button_up_normal,
//            R.drawable.play_control_cursor_hover,
//            R.drawable.play_control_cursor_normal,
//            R.drawable.play_control_slider_bg,
//            R.drawable.play_control_slider_progress,
//            R.drawable.play_control_slider_progress_1,
//            R.drawable.play_cursor,
//            R.drawable.play_cursor_hover,
//            R.drawable.play_icon_function_definition_click,
//            R.drawable.play_icon_function_definition_disable,
//            R.drawable.play_icon_function_definition_hover,
//            R.drawable.play_icon_function_definition_normal,
//            R.drawable.play_icon_function_model_click,
//            R.drawable.play_icon_function_model_hover,
//            R.drawable.play_icon_function_model_normal,
//            R.drawable.play_icon_function_number_click,
//            R.drawable.play_icon_function_number_disable,
//            R.drawable.play_icon_function_number_hover,
//            R.drawable.play_icon_function_number_normal,
//            R.drawable.play_icon_function_pause_click,
//            R.drawable.play_icon_function_pause_hover,
//            R.drawable.play_icon_function_pause_normal,
//            R.drawable.play_icon_function_play_click,
//            R.drawable.play_icon_function_play_hover,
//            R.drawable.play_icon_function_play_normal,
//            R.drawable.play_icon_function_setting_click,
//            R.drawable.play_icon_function_setting_hover,
//            R.drawable.play_icon_function_setting_normal,
//            R.drawable.play_icon_function_video_click,
//            R.drawable.play_icon_function_video_disable,
//            R.drawable.play_icon_function_video_hover,
//            R.drawable.play_icon_function_video_normal,
//            R.drawable.play_icon_function_voice_click,
//            R.drawable.play_icon_function_voice_hover,
//            R.drawable.play_icon_function_voice_normal,
//            R.drawable.play_icon_loading,
//            R.drawable.play_icon_model_180_click,
//            R.drawable.play_icon_model_180_hover,
//            R.drawable.play_icon_model_180_normal,
//            R.drawable.play_icon_model_2d_click,
//            R.drawable.play_icon_model_2d_hover,
//            R.drawable.play_icon_model_2d_normal,
//            R.drawable.play_icon_model_360_click,
//            R.drawable.play_icon_model_360_hover,
//            R.drawable.play_icon_model_360_normal,
//            R.drawable.play_icon_model_3dside_click,
//            R.drawable.play_icon_model_3dside_hover,
//            R.drawable.play_icon_model_3dside_normal,
//            R.drawable.play_icon_model_3dtop_click,
//            R.drawable.play_icon_model_3dtop_hover,
//            R.drawable.play_icon_model_3dtop_normal,
//            R.drawable.play_icon_model_plane_click,
//            R.drawable.play_icon_model_plane_hover,
//            R.drawable.play_icon_model_plane_normal,
//            R.drawable.play_icon_mute_hover1,
//            R.drawable.play_icon_mute_normal,
//            R.drawable.play_icon_setting_go_hover,
//            R.drawable.play_icon_setting_go_normal,
//            R.drawable.play_icon_setting_high_hover,
//            R.drawable.play_icon_setting_high_normal,
//            R.drawable.play_icon_setting_return_hover,
//            R.drawable.play_icon_setting_return_normal,
//            R.drawable.play_icon_setting_scene_hover,
//            R.drawable.play_icon_setting_scene_normal,
//            R.drawable.play_icon_setting_switch_disable,
//            R.drawable.play_icon_setting_switch_hover,
//            R.drawable.play_lock_button_lock_hover,
//            R.drawable.play_lock_button_lock_normal,
//            R.drawable.play_lock_button_unlock_hover,
//            R.drawable.play_lock_button_unlock_normal,
//            R.drawable.play_lock_tips_bg,
//            R.drawable.play_menu_button_launch_hover,
//            R.drawable.play_menu_button_launch_normal,
//            R.drawable.play_menu_button_quit_hover,
//            R.drawable.play_menu_button_quit_normal,
//            R.drawable.play_menu_button_view_hover,
//            R.drawable.play_menu_button_view_normal,
//            R.drawable.play_rec_bg2_hover,
//            R.drawable.play_rec_bg2_normal,
//            R.drawable.play_rec_button_play_hover,
//            R.drawable.play_rec_button_play_normal,
//            R.drawable.play_rec_last_disable,
//            R.drawable.play_rec_last_hover,
//            R.drawable.play_rec_last_normal,
//            R.drawable.play_rec_next_disable,
//            R.drawable.play_rec_next_hover,
//            R.drawable.play_rec_next_normal,
//            R.drawable.play_rec_txt_mask_bg,
//            R.drawable.play_slider_bg,
//            R.drawable.play_slider_progress,
//            R.drawable.play_toast_icon_fastforward,
//            R.drawable.play_toast_icon_model,
//            R.drawable.play_toast_icon_mute,
//            R.drawable.play_toast_icon_rewind,
//            R.drawable.play_toast_icon_voice,
//            R.drawable.play_touch_bg_black,
//            R.drawable.play_touch_cursor_normal,
//            R.drawable.play_touch_icon_back_normal,
//            R.drawable.play_touch_icon_double_normal,
//            R.drawable.play_touch_icon_loading,
//            R.drawable.play_touch_icon_lock_normal,
//            R.drawable.play_touch_icon_pause_normal,
//            R.drawable.play_touch_icon_play_normal,
//            R.drawable.play_touch_icon_setting_normal,
//            R.drawable.play_touch_icon_setting_vr,
//            R.drawable.play_touch_icon_single_normal,
//            R.drawable.play_touch_icon_unlock_normal,
//            R.drawable.play_touch_mask_down,
//            R.drawable.play_touch_mask_up,
//            R.drawable.play_touch_model_icon_180_click,
//            R.drawable.play_touch_model_icon_180_normal,
//            R.drawable.play_touch_model_icon_2d_click,
//            R.drawable.play_touch_model_icon_2d_normal,
//            R.drawable.play_touch_model_icon_360_click,
//            R.drawable.play_touch_model_icon_360_normal,
//            R.drawable.play_touch_model_icon_3dside_click,
//            R.drawable.play_touch_model_icon_3dside_normal,
//            R.drawable.play_touch_model_icon_3dtop_click,
//            R.drawable.play_touch_model_icon_3dtop_normal,
//            R.drawable.play_touch_model_icon_plane_click,
//            R.drawable.play_touch_model_icon_plane_normal,
//            R.drawable.play_touch_number_icon_open_normal,
//            R.drawable.play_touch_popup_icon_close_normal,
//            R.drawable.play_touch_recommend_icon_loading,
//            R.drawable.play_touch_setting_icon_change_disable,
//            R.drawable.play_touch_setting_icon_change_normal,
//            R.drawable.play_touch_toast_icon_light,
//            R.drawable.play_touch_toast_icon_mute,
//            R.drawable.play_touch_toast_icon_voice,
//            R.drawable.play_video_button_play_hover,
//            R.drawable.play_video_button_play_normal,
//            R.drawable.play_video_local_bg_click,
//            R.drawable.play_video_local_bg_empty,
//            R.drawable.play_video_local_bg_hover,
//            R.drawable.play_video_local_bg_mask,
//            R.drawable.play_video_local_icon_play,
//            R.drawable.play_video_local_ph_bg,
//            R.drawable.play_video_online_bg_empty,
//            R.drawable.play_video_online_bg_hover,
//            R.drawable.play_video_online_bg_mask,
//            R.drawable.play_video_online_continue_bg,
//            R.drawable.play_video_online_continue_bg_mask,
//            R.drawable.play_video_online_continue_ph_bg,
//            R.drawable.play_video_online_ph_bg,
//            R.drawable.play_volume_cursor_hover,
//            R.drawable.play_volume_cursor_normal,
//            R.drawable.play_volume_slider_bg,
//            R.drawable.play_volume_slider_progress,
//            R.drawable.play_welcome_image_handle,
//            R.drawable.play_welcome_image_otherhandle,
//            R.drawable.pubilc_tab_line_higlight,
//            R.drawable.public_arrow_down,
//            R.drawable.public_arrow_right,
//            R.drawable.public_arrow_up,
//            R.drawable.public_bg_gradient,
//            R.drawable.public_bg_nav,
//            R.drawable.public_label_jumu,
//            R.drawable.public_label_ruanjian,
//            R.drawable.public_label_youxi,
//            R.drawable.public_label_zhibo,
//            R.drawable.public_label_zhuanti,
//            R.drawable.public_page_lighlight,
//            R.drawable.public_page_normal,
//            R.drawable.purple_round_bg,
//            R.drawable.push_icon_close_normal,
//            R.drawable.push_icon_cup,
//            R.drawable.push_icon_moon,
//            R.drawable.push_icon_pushlist,
//            R.drawable.push_icon_up,
//            R.drawable.push_list_icon_360,
//            R.drawable.push_list_icon_play,
//            R.drawable.push_logo,
//            R.drawable.push_tips_bg,
//            R.drawable.question_down,
//            R.drawable.question_normal,
//            R.drawable.recommend_content_default_bg,
//            R.drawable.recommend_download,
//            R.drawable.recommend_icon_play,
//            R.drawable.recommend_icon_search,
//            R.drawable.recommend_icon_suspended,
//            R.drawable.recommend_nav_icon_vr,
//            R.drawable.recommend_star,
//            R.drawable.rec_handleplay_icon_close_normal,
//            R.drawable.rec_icon_download_normal,
//            R.drawable.rec_icon_download_ok_normal,
//            R.drawable.rec_icon_play,
//            R.drawable.rec_play_icon_close_normal,
//            R.drawable.rec_play_mask_down,
//            R.drawable.rec_play_mask_up,
//            R.drawable.remote_controller_pause,
//            R.drawable.remote_controller_volume,
//            R.drawable.resource_dialog_failure_icon,
//            R.drawable.res_fly_screen_fragment_file_img,
//            R.drawable.res_local_btn_check_off_focused_holo_light,
//            R.drawable.rewind_icon,
//            R.drawable.save_waiting,
//            R.drawable.save_warning,
//            R.drawable.search_icon_delete,
//            R.drawable.seekbar_play_icon,
//            R.drawable.seekbar_progress_thumb,
//            R.drawable.seekbar_suspended_icon,
//            R.drawable.share_icon_discover,
//            R.drawable.share_icon_kongjian,
//            R.drawable.share_icon_link,
//            R.drawable.share_icon_qq,
//            R.drawable.share_icon_sina,
//            R.drawable.share_icon_wechat,
//            R.drawable.share_logo,
//            R.drawable.sliding,
//            R.drawable.smb_login_delete_checked,
//            R.drawable.smb_login_delete_unchecked,
//            R.drawable.surfaceview_tip_bg,
//            R.drawable.tab_icon_more,
//            R.drawable.tab_more_bg,
//            R.drawable.toolbar_icon_amplification,
//            R.drawable.toolbar_icon_home_highlight,
//            R.drawable.toolbar_icon_home_normal,
//            R.drawable.toolbar_icon_local_highlight,
//            R.drawable.toolbar_icon_local_normal,
//            R.drawable.toolbar_icon_market_highlight,
//            R.drawable.toolbar_icon_market_normal,
//            R.drawable.toolbar_icon_my_highlight,
//            R.drawable.toolbar_icon_my_normal,
//            R.drawable.toolbar_icon_play,
//            R.drawable.toolbar_icon_rec_highlight,
//            R.drawable.toolbar_icon_rec_normal,
//            R.drawable.toolbar_icon_suspended,
//            R.drawable.toolbar_icon_top_highlight,
//            R.drawable.toolbar_icon_video_highlight,
//            R.drawable.toolbar_icon_video_normal,
//            R.drawable.umeng_convastion_reply,
//            R.drawable.umeng_convationg_dialog_default_btn,
//            R.drawable.umeng_convationg_dialog_pressed_btn,
//            R.drawable.umeng_fb_logo,
//            R.drawable.unity_back_icon,
//            R.drawable.user_default_head_portrait,
//            R.drawable.videoinf_button_download_icon_normal,
//            R.drawable.videoinf_button_vrplay_bg_normal,
//            R.drawable.videoinf_icon_close_normal,
//            R.drawable.videoinf_icon_download_normal,
//            R.drawable.videoinf_icon_download_ok_normal,
//            R.drawable.videoinf_icon_more_normal,
//            R.drawable.videoinf_icon_number,
//            R.drawable.videoinf_icon_score,
//            R.drawable.videoinf_icon_share_normal,
//            R.drawable.videoinf_icon_vrplay_normal,
//            R.drawable.videoinf_mask_bg,
//            R.drawable.videoinf_rec_ph,
//            R.drawable.video_3d,
//            R.drawable.video_hot,
//            R.drawable.video_icon_close,
//            R.drawable.video_icon_play,
//            R.drawable.video_new,
//            R.drawable.video_vr,
//            R.drawable.video_vr_3d,
//            R.drawable.warning_icon,
//            R.drawable.wifi_disconnect,
//            R.drawable.zhifubao_icon,
    };
    private static BitmapInfo[] mBitmapInfos = new BitmapInfo[mBitmapResource.length];

    public static BitmapInfo[] getBitmapTexture(Context context) {
        for (int i = 0; i < mBitmapInfos.length; i++) {
            mBitmapInfos[i] = TextureHelper.loadTextureOutBitmapInfo(context, mBitmapResource[i]);
        }
        return mBitmapInfos;
    }
}
