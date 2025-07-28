package defpackage;

import android.graphics.Typeface;

/* renamed from: yee  reason: default package */
public final class yee extends vx3 {
    public final /* synthetic */ hwf g;
    public final /* synthetic */ afe h;

    public yee(afe afe, hwf hwf) {
        this.h = afe;
        this.g = hwf;
    }

    public final void D(int i) {
        this.h.m = true;
        this.g.p(i);
    }

    public final void E(Typeface typeface) {
        afe afe = this.h;
        afe.n = Typeface.create(typeface, afe.c);
        afe.m = true;
        this.g.q(afe.n, false);
    }
}
