package defpackage;

import android.view.View;

/* renamed from: ub6  reason: default package */
public final class ub6 extends yb6 {
    public int d;

    public final int a(dc6 dc6, View view, n1g n1g, int i, boolean z) {
        return Math.max(0, super.a(dc6, view, n1g, i, z));
    }

    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    public final void c() {
        super.c();
        this.d = Integer.MIN_VALUE;
    }

    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
