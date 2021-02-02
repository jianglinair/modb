package com.jianglin.libbusb;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jianglin.libcommon.BaseActivity;
import com.jianglin.libexpa.BusaPath;
import com.jianglin.libexpb.BusbPath;

@Route(path = BusbPath.BUSB)
public class BusbActivity extends BaseActivity {
    private static final String TAG = "BusbActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busb);
    }

    @Override
    protected String tag() {
        return TAG;
    }

    public void click(View view) {
        ARouter.getInstance().build(BusaPath.BUSA).navigation(this);
    }
}