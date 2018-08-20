package com.example.spannablestring;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        textView2 = findViewById(R.id.textview2);
        textView3 = findViewById(R.id.textview3);
        textView4 = findViewById(R.id.textview4);
        textView5 = findViewById(R.id.textview5);
        textView6 = findViewById(R.id.textview6);
        textView7 = findViewById(R.id.textview7);
        textView8 = findViewById(R.id.textview8);
        textView9 = findViewById(R.id.textview9);
        textView10 = findViewById(R.id.textview10);
        SpannableString spannableString = new SpannableString("前景色是蓝色");
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#0099EE"));
        spannableString.setSpan(colorSpan,4,spannableString.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        textView.setText(spannableString);

        SpannableString spannableString2 = new SpannableString("背景色是绿色");
        BackgroundColorSpan colorSpan2 = new BackgroundColorSpan(Color.parseColor("#AC00FF30"));
        spannableString2.setSpan(colorSpan2,4,spannableString2.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        textView2.setText(spannableString2);

        SpannableString spannableString3 = new SpannableString("万丈高楼平地起");

        RelativeSizeSpan sizeSpan01 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan sizeSpan02 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan03 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan04 = new RelativeSizeSpan(1.8f);
        RelativeSizeSpan sizeSpan05 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan06 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan07 = new RelativeSizeSpan(1.2f);

        spannableString3.setSpan(sizeSpan01, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(sizeSpan02, 1, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(sizeSpan03, 2, 3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(sizeSpan04, 3, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(sizeSpan05, 4, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(sizeSpan06, 5, 6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(sizeSpan07, 6, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView3.setText(spannableString3);

        SpannableString spannableString4 = new SpannableString("为文字设置删除线");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        spannableString4.setSpan(strikethroughSpan, 5, spannableString4.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        textView4.setText(spannableString4);

        SpannableString spannableString5 = new SpannableString("为文字设置下划线");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableString5.setSpan(underlineSpan, 5, spannableString5.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        textView5.setText(spannableString5);

        SpannableString spannableString6 = new SpannableString("为文字设置上标");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        spannableString6.setSpan(superscriptSpan, 5, spannableString6.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView6.setText(spannableString6);

        SpannableString spannableString7 = new SpannableString("为文字设置下标");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        spannableString7.setSpan(subscriptSpan, 5, spannableString7.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView7.setText(spannableString7);

        SpannableString spannableString8 = new SpannableString("为文字设置粗体、斜体风格");
        StyleSpan styleSpan_B  = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan_I  = new StyleSpan(Typeface.ITALIC);
        spannableString8.setSpan(styleSpan_B, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString8.setSpan(styleSpan_I, 8, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView8.setHighlightColor(Color.parseColor("#36969696"));
        textView8.setText(spannableString8);

        SpannableString spannableString9 = new SpannableString("在文本中添加表情（表情）");
        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher);
        drawable.setBounds(0, 0, 42, 42);
        ImageSpan imageSpan = new ImageSpan(drawable);
        spannableString9.setSpan(imageSpan, 6, 8, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView9.setText(spannableString9);

    }
}
