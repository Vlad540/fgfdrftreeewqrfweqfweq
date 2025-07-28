package defpackage;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* renamed from: bo6  reason: default package */
public abstract class bo6 {
    public static int a(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri d(Object obj) {
        return ((Icon) obj).getUri();
    }
}
