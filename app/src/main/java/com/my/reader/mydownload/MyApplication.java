package com.my.reader.mydownload;

import android.app.Application;
import android.content.Context;

/**
 * Created by xiaobai on 2018/3/29/029.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        initConfig();
    }

    public static Context getContext() {
        return context;
    }

    void initConfig() {
        //初始化文件缓存路径
        String cache = StorageUtils.getCacheDirectory(this) + "/down" ;
        AppStoragePath.setCachePath(cache);
    }
}
