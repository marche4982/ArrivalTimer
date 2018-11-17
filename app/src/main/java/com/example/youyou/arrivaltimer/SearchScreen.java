package com.example.youyou.arrivaltimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by youyou on 2018/11/17.
 */

public class SearchScreen extends AppCompatActivity {

    private ImageButton imgBtnSearchFrom;   // 検索ボタン（From）
    private ImageButton imgBtnSearchTo;     // 検索ボタン（To)

    private MyEditText editText_SearchFrom; // 検索テキスト(From)
    private MyEditText editText_SearchTo;    // 検索テキスト(To)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_SearchFrom = (MyEditText)findViewById(R.id.editText_searchScreen_from);
        editText_SearchTo = (MyEditText)findViewById(R.id.editText_searchScreen_to);

        imgBtnSearchFrom = (ImageButton)findViewById(R.id.imageButton_searchScreen_from);
        imgBtnSearchFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // テキスト内の文言からGoogleMap 検索
            }
        });

        imgBtnSearchTo = (ImageButton)findViewById(R.id.imageButton_searchScreen_to);
        imgBtnSearchTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // テキスト内の文言からGoogleMap 検索
            }
        });
    }
}
