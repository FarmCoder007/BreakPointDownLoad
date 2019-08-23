package com.my.reader.mydownload;

import android.content.Context;
import android.util.Log;

import java.io.File;

public class AppStoragePath {
    //文件存储路径
    private static String CACHE_PATH = "";


    public static void setCachePath(String path) {
        AppStoragePath.CACHE_PATH = path;
        Log.e("flag", "----路径为path：" + path);
        File mFile = new File(path);
        if (!mFile.exists()) {
            mFile.mkdirs();
        }
    }

    public static String getCachePath() {
        return AppStoragePath.CACHE_PATH;
    }

    public static String getFrescoCachePath(Context context) {
        return context.getExternalCacheDir() + "/" + "imageCache";
    }

}
