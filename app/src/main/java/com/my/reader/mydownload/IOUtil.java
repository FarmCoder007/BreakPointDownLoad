package com.my.reader.mydownload;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by xiaobai on 2018/3/30/030.
 */

public class IOUtil {
    public static void closeAll(Closeable... closeables){
        if(closeables == null){
            return;
        }
        for (Closeable closeable : closeables) {
            if(closeable!=null){
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
