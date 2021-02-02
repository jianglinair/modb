package com.jianglin.libbusb;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jianglin.libexpa.BusaPath;
import com.jianglin.libexpb.BusbPath;

@Route(path = BusbPath.BUSB)
public class BusbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busb);
    }

    public void click(View view) {
        ARouter.getInstance().build(BusaPath.BUSA).navigation(this);
    }
}