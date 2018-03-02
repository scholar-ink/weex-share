package org.weex.plugin.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.alibaba.weex.plugin.annotation.WeexModule;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import java.util.HashMap;
import java.util.Map;

import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.qzone.QZone;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;

@WeexModule(name = "share")
public class ShareModule extends WXModule {

    public static String shareText,shareUrl,shareTitle,shareImage;
    private JSCallback onChooseCallBack;
    //sync ret example
    //TODO: Auto-generated method example
    @JSMethod
    public String syncRet(String param) {
        Log.e("shareShow: ", param);
        return param;
    }

    //async ret example
    //TODO: Auto-generated method example
    @JSMethod
    public void asyncRet(String param, JSCallback callback) {
        callback.invoke(param);
    }
    @JSMethod
    public void showShare(HashMap<String,Object> options, JSCallback callback){
        this.onChooseCallBack = callback;
        String shareType = (String) options.get("shareType");
        shareTitle = (String) options.get("shareTitle");
        shareImage = (String) options.get("shareImage");
        shareUrl = (String) options.get("shareUrl");
        shareText = (String) options.get("shareText");
        Log.e("showShare: ",shareType );
            switch (shareType) {
                case "qq":
                    qq();
                    break;
                case "QZone":
                    QZone();
                    break;
                case "wechatmoments":
                    wechatmoments();
                    break;
                case "wechat":
                    wechat();
                    break;
                case "SinaWeibo":
//                    SinaWeibo();
            }
    }


    public void qq() {
        Log.e("shareShow: ", "111");
        OnekeyShare oks = new OnekeyShare();
        oks.setImageUrl("http://f1.sharesdk.cn/imgs/2014/02/26/owWpLZo_638x960.jpg");
        oks.setTitleUrl("http://www.baidu.com");
        oks.setText("22222");
        oks.setTitle("1111111");
        oks.setPlatform(QQ.NAME);
        oks.show(mWXSDKInstance.getContext());
    }


    /**
     * 分享QQ空间
     */
    public void QZone() {

        OnekeyShare oks = new OnekeyShare();
        oks.setImageUrl("http://f1.sharesdk.cn/imgs/2014/02/26/owWpLZo_638x960.jpg");
        oks.setTitleUrl("http://www.baidu.com");
        oks.setText(shareText);
        oks.setTitle(shareTitle);
        oks.setPlatform(QZone.NAME);
        oks.show(mWXSDKInstance.getContext());
    }

    /**
     * 分享微信朋友圈
     */
    public void wechatmoments() {
        OnekeyShare oks = new OnekeyShare();
        oks.setImageUrl(shareImage);
        oks.setUrl(shareUrl);
        oks.setText(shareText);
        oks.setTitle(shareTitle);
        oks.setPlatform(WechatMoments.NAME);
        oks.show(mWXSDKInstance.getContext());
    }


    /**
     * 分享微信
     */
    public void wechat() {
        OnekeyShare oks = new OnekeyShare();
        oks.setImageUrl(shareImage);
        oks.setUrl(shareUrl);
//        oks.setTitleUrl(shareUrl);
        oks.setText(shareText);
        oks.setTitle(shareTitle);

        oks.setPlatform(Wechat.NAME);
        oks.show(mWXSDKInstance.getContext());
    }


    /**
     * 分享新浪微博
     */
//    public static void SinaWeibo() {
//        SinaWeibo.ShareParams sp = new SinaWeibo.ShareParams();
//        sp.setText(shareTitle+":"+shareText+shareUrl);
//        Platform weibo = ShareSDK.getPlatform(SinaWeibo.NAME);
//        weibo.setPlatformActionListener(myPlatformActionListener); // 设置分享事件回调
//        weibo.share(sp);
////        getShareSDK();
//    }
}