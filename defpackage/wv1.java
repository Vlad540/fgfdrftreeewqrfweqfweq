package defpackage;

import android.graphics.Typeface;

/* renamed from: wv1  reason: default package */
public final class wv1 extends hwf {
    public final Typeface d;
    public final vv1 e;
    public boolean f;

    public wv1(vv1 vv1, Typeface typeface) {
        this.d = typeface;
        this.e = vv1;
    }

    public final void p(int i) {
        if (!this.f) {
            this.e.r(this.d);
        }
    }

    public final void q(Typeface typeface, boolean z) {
        if (!this.f) {
            this.e.r(typeface);
        }
    }
}
