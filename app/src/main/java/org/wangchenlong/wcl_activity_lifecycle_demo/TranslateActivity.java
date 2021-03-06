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
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 透明Activity
 * <p/>
 * Created by wangchenlong on 16/2/15.
 */
public class TranslateActivity extends AppCompatActivity {
    private static final String TAG = "DEBUG-WCL: " + TranslateActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.e(TAG, "onCreate"); // 生命周期
    }

    // Activity的恢复
    @Override
    protected void onResume() {
        super.onResume();

        Log.e(TAG, "onResume");
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
