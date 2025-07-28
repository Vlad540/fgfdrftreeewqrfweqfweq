package defpackage;

import android.util.Log;

/* renamed from: n75  reason: default package */
public final class n75 implements eo7 {
    public static final n75 b;
    public int a;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, n75] */
    static {
        ? obj = new Object();
        obj.a = 5;
        b = obj;
    }

    public final void b(String str) {
    }

    public final void c(String str, String str2, Throwable th) {
        Log.getStackTraceString(th);
    }

    public final void d(String str, String str2) {
    }

    public final void e(String str, String str2) {
    }

    public final void f(String str, String str2) {
    }

    public final boolean i(int i) {
        return this.a <= i;
    }

    public final void j(int i) {
        this.a = i;
    }

    public final void w(String str, String str2) {
    }

    public final void d(String str, String str2, Throwable th) {
        Log.getStackTraceString(th);
    }

    public final void e(String str, String str2, Throwable th) {
        Log.getStackTraceString(th);
    }

    public final void w(String str, String str2, Throwable th) {
        if (th != null) {
            Log.getStackTraceString(th);
        }
    }
}
