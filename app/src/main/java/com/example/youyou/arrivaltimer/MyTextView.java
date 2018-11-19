package com.example.youyou.arrivaltimer;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by youyou on 2018/11/17.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView implements View.OnClickListener {

    private boolean bIsTouched = false; // タッチフラグ

    MyTextView(Context context){
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if( bIsTouched == false ){
            // 初回タッチの場合、文字色を黒に変えて文字を消す
            this.setText("");
            this.setTextColor(getResources().getColor(R.color.textColor_black));
            bIsTouched = true;
        }
        else{
            // 初回ではない場合は処理なし
        }

        return true;    // タッチイベントの消化
    }

    @Override
    public void onClick(View v) {
        TextView textView = (TextView)v;
        String myText = textView.getText().toString();

        // Google Map を開く。
    }
}
