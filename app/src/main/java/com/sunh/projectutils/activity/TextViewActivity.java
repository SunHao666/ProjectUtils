package com.sunh.projectutils.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.sunh.projectutils.R;
import com.sunh.projectutils.view.SettingView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * TextView
 */

public class TextViewActivity extends Activity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.set1)
    SettingView set1;
    @BindView(R.id.set2)
    SettingView set2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        ButterKnife.bind(this);
        set1.setRightImg(R.drawable.right_success);
        set1.hideRightText();
        set1.setLeftText("分享");

        set2.hideRightImg();
        set2.setRightText("已完成");
        set2.setLeftText("设置");
    }
}
