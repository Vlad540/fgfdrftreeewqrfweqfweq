package defpackage;

import android.content.Context;

/* renamed from: yc8  reason: default package */
public abstract class yc8 {
    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }
}
