package com.example.youyou.arrivaltimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by youyou on 2018/11/17.
 */

public class SearchScreen extends AppCompatActivity{

    private MyLatLong mLatLongFrom; // 緯度経度(From)
    private MyLatLong mLatLongTo;   // 緯度経度(To)

    private MyTextView textView_SearchFrom; // 検索テキスト(From)
    private MyTextView textView_SearchTo;    // 検索テキスト(To)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_SearchFrom = (MyTextView)findViewById(R.id.editText_searchScreen_from);
        textView_SearchFrom.setOnClickListener(textView_SearchFrom);

        textView_SearchTo = (MyTextView)findViewById(R.id.editText_searchScreen_to);
        textView_SearchTo.setOnClickListener(textView_SearchTo);

    }
}
