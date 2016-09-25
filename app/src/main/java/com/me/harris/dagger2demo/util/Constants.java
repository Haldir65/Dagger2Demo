package com.me.harris.dagger2demo.util;

/**
 * Created by Harris on 2016/6/10.
 */

public class Constants {
    public static final String BASE_URL = "http://gank.io/api/";
    public static final String IMAGE_COMPRESSION = "?imageView2/0/w/100";


    public static class Config {
        public static final String CHARSET = "UTF-8";

        public static final String DATABASE_NAME = "DailyDB";
        public static final int DATABASE_VERSION = 1;

        public static final int IMAGE_CACHE_SIZE = 50 * 1024 * 1024;

        public static final int HTTP_CACHE_SIZE = 20 * 1024 * 1024;
        public static final int HTTP_CONNECT_TIMEOUT = 15 * 1000;
        public static final int HTTP_READ_TIMEOUT = 20 * 1000;


    }
}
