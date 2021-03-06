//====================================================================
//
//      Copyright (C) 2016-2017 王辰龙
//      All rights reserved
//
//      Created by 王辰龙
//      https://github.com/SpikeKing
//
//====================================================================

package org.wangchenlong.wcl_activity_lifecycle_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 第二个Activity
 * <p/>
 * Created by wangchenlong on 16/2/15.
 */
public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "DEBUG-WCL: " + SecondActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG, "onCreate"); // 生命周期
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause"); // 生命周期
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop"); // 生命周期
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy"); // 生命周期
    }
}
