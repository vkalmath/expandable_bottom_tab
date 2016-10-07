package com.vk.dev;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.vk.dev.android.ExpandableBottomTabBar;


public class TabFiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_lab_layout);

        ExpandableBottomTabBar tabBarView = (ExpandableBottomTabBar) findViewById(R.id.tab_bar);

        tabBarView.setOnTabClickedListener(new ExpandableBottomTabBar.OnTabClickedListener() {
            @Override
            public void onTabClicked(View view, int pos) {
                Toast.makeText(getApplicationContext(),
                        "Clicked on Tab "+pos, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
