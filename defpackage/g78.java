package defpackage;

import java.util.HashSet;

/* renamed from: g78  reason: default package */
public abstract class g78 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (g78.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (g78.class) {
            str = b;
        }
        return str;
    }
}
