package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: yq6  reason: default package */
public final class yq6 extends dh0 {
    public final zq6 b;
    public long c = -1;

    public yq6(r14 r14) {
        this.b = r14;
    }

    public final void a(String str, oq6 oq6, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        zq6 zq6 = this.b;
        if (zq6 != null) {
            r14 r14 = (r14) zq6;
            r14.H0 = currentTimeMillis - this.c;
            r14.invalidateSelf();
        }
    }

    public final void e(Object obj, String str) {
        this.c = System.currentTimeMillis();
    }
}
