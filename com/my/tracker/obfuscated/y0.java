package com.my.tracker.obfuscated;

import com.my.tracker.MyTrackerConfig;
import me.leolin.shortcutbadger.BuildConfig;

public abstract class y0 {
    private static volatile boolean a = false;
    private static volatile MyTrackerConfig.Logger b;

    public static boolean a() {
        return a;
    }

    public static void b(String str) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            logger.log(6, str, (Throwable) null);
        }
    }

    public static void c(String str) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            logger.log(4, str, (Throwable) null);
        }
    }

    public static void a(boolean z) {
        a = z;
    }

    public static void a(MyTrackerConfig.Logger logger) {
        b = logger;
    }

    public static void b(String str, Throwable th) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            logger.log(6, str, th);
        }
    }

    public static void a(String str) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            logger.log(3, str, (Throwable) null);
        }
    }

    public static void a(String str, Throwable th) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            logger.log(3, str, th);
        }
    }
}
