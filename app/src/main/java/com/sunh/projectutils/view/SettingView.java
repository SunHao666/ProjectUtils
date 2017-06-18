package com.sunh.projectutils.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sunh.projectutils.R;

/**
 * Created by Administrator on 2017/6/18/018.
 */

public class SettingView extends RelativeLayout{
    /**
     * 左边文字大小
     */
    private int DEFAULTLEFTTEXTSIZE = dp2px(12);
    /**
     * 右边边文字大小
     */
    private int DEFAULTRIGHTTEXTSIZE = dp2px(12);
    /**
     * 左边图片是否显示
     */
    private boolean DEFAULTLEFTIMGVISIBLE = true;
    /**
     * 左边边文字是否显示
     */
    private boolean DEFAULTLEFTTEXTVISIBLE = true;
    /**
     * 右边边图片是否显示
     */
    private boolean DEFAULTRIGHTIMGVISIBLE = true;
    /**
     * 右边边边文字是否显示
     */
    private boolean DEFAULTRIGHTTEXTVISIBLE = true;
    private String leftText;
    private int leftTextSize;
    private int leftImg;
    private boolean leftTextVisible;
    private boolean leftImgVisible;
    private String rightText;
    private int rightTextSize;
    private int rightImg;
    private boolean rightTextVisible;
    private boolean rightImgVisible;
    private Context context;
    private ImageView left_img;
    private TextView left_text;
    private ImageView right_img;
    private TextView right_text;

    public SettingView(Context context) {
        this(context,null);
    }


    public SettingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.SettingView);
        leftText = typedArray.getString(R.styleable.SettingView_leftText);
        leftTextSize = (int) typedArray.getDimension(R.styleable.SettingView_leftTextSize,DEFAULTLEFTTEXTSIZE);
        leftImg = typedArray.getResourceId(R.styleable.SettingView_leftImg,R.drawable.left);
        leftTextVisible = typedArray.getBoolean(R.styleable.SettingView_leftTextVisible,DEFAULTLEFTTEXTVISIBLE);
        leftImgVisible = typedArray.getBoolean(R.styleable.SettingView_leftImgVisible,DEFAULTLEFTIMGVISIBLE);

        rightText = typedArray.getString(R.styleable.SettingView_righttext);
        rightTextSize = (int) typedArray.getDimension(R.styleable.SettingView_rightTextSize,DEFAULTRIGHTTEXTSIZE);
        rightImg = typedArray.getResourceId(R.styleable.SettingView_rightImg,R.drawable.right);
        rightTextVisible = typedArray.getBoolean(R.styleable.SettingView_rightTextVisible,DEFAULTRIGHTTEXTVISIBLE);
        rightImgVisible = typedArray.getBoolean(R.styleable.SettingView_rightImgVisible,DEFAULTRIGHTIMGVISIBLE);

        initView();
    }

    private void initView() {
        View view = LayoutInflater.from(context).inflate(R.layout.setting_view,this,true);
        left_img = (ImageView) view.findViewById(R.id.left_img);
        left_text = (TextView) view.findViewById(R.id.left_text);
        right_img = (ImageView) view.findViewById(R.id.right_img);
        right_text = (TextView) view.findViewById(R.id.right_text);

        if(leftTextVisible){
            left_text.setText(leftText);
            left_text.setTextSize(leftTextSize);
        }


        if(leftImgVisible){
            left_img.setBackgroundResource(leftImg);
        }

        if(rightTextVisible){
            right_text.setText(rightText);
            right_text.setTextSize(rightTextSize);
        }

        if(rightImgVisible){
            right_img.setBackgroundResource(rightImg);
        }
    }

    public void setLeftText(String text){
        if(left_text.getVisibility() != VISIBLE)
            left_text.setVisibility(VISIBLE);
        left_text.setText(text);
    }

    public void setLeftText(int text){
        if(left_text.getVisibility() != VISIBLE)
            left_text.setVisibility(VISIBLE);
        left_text.setText(text);
    }

    public void setLeftImg(int img){
        if(left_img.getVisibility() != VISIBLE)
            left_img.setVisibility(VISIBLE);
        left_img.setBackgroundResource(img);
    }

    public void setRightText(String text){
        if(right_text.getVisibility() != VISIBLE)
            right_text.setVisibility(VISIBLE);
        right_text.setText(text);
    }

    public void setRightText(int text){
        if(right_text.getVisibility() != VISIBLE)
            right_text.setVisibility(VISIBLE);
        right_text.setText(text);
    }

    public void setRightImg(int img){
        if(right_img.getVisibility() != VISIBLE)
            right_img.setVisibility(VISIBLE);
        right_img.setBackgroundResource(img);
    } 
    
    
    public TextView getLeft_text(){
        return left_text;
    }

    public ImageView getLeft_img(){
        return  left_img;
    }

    public TextView getRight_text(){
        return  right_text;
    }

    public ImageView getRight_img(){
        return right_img;
    }

    public void hideRightText(){
        right_text.setVisibility(GONE);
    }

    public void hideRightImg(){
        right_img.setVisibility(GONE);
    }

    /**
     * dp 2 px
     */
    protected int dp2px(int dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, getResources().getDisplayMetrics());
    }

    /**
     * sp 2 px
     */
    protected int sp2px(int spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, getResources().getDisplayMetrics());

    }
}
