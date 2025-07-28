package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@kj4
@TargetApi(18)
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String i = me4.i(str, str2, str3);
        if (i.length() > 127 && str2 != null) {
            StringBuilder l = hr1.l(str);
            l.append(str2.substring(0, (127 - str.length()) - str3.length()));
            l.append(str3);
            i = l.toString();
        }
        Trace.beginSection(i);
    }
}
