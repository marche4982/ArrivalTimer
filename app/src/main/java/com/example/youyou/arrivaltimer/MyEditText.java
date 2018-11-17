package com.example.youyou.arrivaltimer;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

/**
 * Created by youyou on 2018/11/17.
 */

public class MyEditText extends android.support.v7.widget.AppCompatEditText {

    private boolean bIsTouched = false; // タッチフラグ

    MyEditText(Context context){
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
}
