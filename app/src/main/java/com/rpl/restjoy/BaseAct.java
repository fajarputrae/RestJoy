package com.rpl.restjoy;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import butterknife.ButterKnife;

public class BaseAct extends AppCompatActivity {
    private static Boolean isVisible;
    private static boolean mIsInForegroundMode;

    Activity mActivity = this;

    @Override
    protected void onStart() {
        super.onStart();
        isVisible = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        isVisible = false;
        mIsInForegroundMode = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        isVisible = true;
        mIsInForegroundMode = true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        isVisible = false;
    }

    public static boolean isViewVisible() {
        return isVisible;
    }

    public static boolean isInForeground() {
        return mIsInForegroundMode;
    }

}
