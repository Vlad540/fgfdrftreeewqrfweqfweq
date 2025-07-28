package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: zs7  reason: default package */
public final class zs7 extends tt0 {
    public final Handler i = new Handler(Looper.getMainLooper());

    public final void c(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zs7.super.c(obj);
        } else {
            this.i.post(new ys7(this, obj, 0));
        }
    }

    public final void d(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                zs7.super.d(obj);
            } catch (Exception unused) {
            }
        } else {
            this.i.post(new ys7(this, obj, 1));
        }
    }

    public final void f(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                zs7.super.f(obj);
            } catch (Exception unused) {
            }
        } else {
            this.i.post(new ys7(this, obj, 2));
        }
    }
}
