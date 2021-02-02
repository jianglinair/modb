package com.jianglin.libbusb;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jianglin.libexpb.BInfo;
import com.jianglin.libexpb.BService;
import com.jianglin.libexpb.BusbPath;

/**
 * Author: Jianglin
 * Time: 2021/2/2
 * Description: todo
 *
 * @author jiang
 */@Route(path = BusbPath.BSERVICE)
public class ServiceProvider implements BService {

    private static final String TAG = "ServiceProvider";

    @Override
    public BInfo getInfo() {
        Log.d(TAG, "[NAIPIQ]getInfo: IN");
        BInfo info = new BInfo();
        info.info = "这是一条来自业务组件B的消息";
        return info;
    }

    @Override
    public void init(Context context) {
        Log.d(TAG, "[NAIPIQ]init: ");
    }
}
