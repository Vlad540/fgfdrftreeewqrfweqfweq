package defpackage;

import android.view.View;

/* renamed from: q0b  reason: default package */
public final class q0b {
    public final t0b a;
    public int b;

    public q0b(t0b t0b) {
        this.a = t0b;
    }

    public final void a(int i) {
        View d;
        t0b t0b = this.a;
        if (t0b != null && (d = t0b.d()) != null) {
            int j = gwf.j(i - t0b.c(), 0, Integer.MAX_VALUE);
            this.b = j;
            d.offsetTopAndBottom(j - this.b);
        }
    }
}
