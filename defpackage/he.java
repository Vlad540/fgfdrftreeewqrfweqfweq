package defpackage;

import android.os.Process;

/* renamed from: he  reason: default package */
public final class he implements eie {
    public static final he a = new Object();
    public static final rb9 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, he] */
    static {
        rb9 rb9 = new rb9(10);
        rb9.e(1, 10);
        rb9.e(2, 16);
        rb9.e(3, 13);
        rb9.e(4, 16);
        rb9.e(5, 0);
        rb9.e(6, -2);
        rb9.e(7, -4);
        rb9.e(8, -6);
        rb9.e(9, -5);
        rb9.e(10, -8);
        b = rb9;
    }

    public final void a(int i) {
        rb9 rb9 = b;
        int b2 = rb9.b(i);
        int i2 = b2 >= 0 ? rb9.c[b2] : -1;
        if (i2 != -1) {
            try {
                Process.setThreadPriority(i2);
            } catch (Throwable unused) {
            }
        }
    }
}
