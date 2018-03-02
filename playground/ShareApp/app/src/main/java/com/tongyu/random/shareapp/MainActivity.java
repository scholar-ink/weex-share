package com.tongyu.random.shareapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;

public class MainActivity extends AppCompatActivity {
    public static Context mContext;
    @BindView(R.id.share)
    TextView share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mContext = this;
        init();
    }

    private void init() {
        showShare();
        Log.e("qq:", "0000000");
    }


    public static void showShare() {
//        OnekeyShare oks = new OnekeyShare();
//        oks.setImageUrl("http://f1.sharesdk.cn/imgs/2014/02/26/owWpLZo_638x960.jpg");
//        oks.setTitleUrl("http://www.baidu.com");
//        oks.setText("text");
//        oks.setTitle("标题");
//        oks.setPlatform(Wechat.NAME);
//        oks.show(mContext);
//
        Log.e("qq:", "22222222");
        OnekeyShare oks = new OnekeyShare();
        oks.setImageUrl("http://f1.sharesdk.cn/imgs/2014/02/26/owWpLZo_638x960.jpg");
        oks.setTitleUrl("http://www.baidu.com");
        oks.setText("11111");
        oks.setTitle("1111111");
        oks.setPlatform(QQ.NAME);
        oks.show(mContext);
    }

    @OnClick(R.id.share)
    public void onViewClicked() {
        Log.e("qq:", "1111111");
        showShare();
    }


}
