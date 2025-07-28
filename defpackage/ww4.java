package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: ww4  reason: default package */
public final class ww4 extends gf {
    public final View l;
    public final Rect m = new Rect();
    public int n;
    public int o;
    public int p;
    public boolean q;

    public ww4(ih0 ih0, View view) {
        super(ih0, new sy6(0, (up0) null, 3), 1, (u16) null, 56);
        this.l = view;
    }

    public final void g(nsf nsf, s5c s5c) {
        lsf lsf = nsf.a;
        int i = lsf.f(8).d;
        int i2 = lsf.f(7).d;
        boolean z = i == 0;
        int i3 = ((qy6) s5c.c).d;
        this.p = i3;
        Rect rect = this.m;
        this.o = Math.abs(((this.a.getHeight() + ((z ? (rect.bottom + i2) - i3 : (rect.bottom + i3) - i2) - rect.top)) / 2) - this.n);
    }

    public final nsf h(nsf nsf) {
        if (this.q) {
            return nsf;
        }
        lsf lsf = nsf.a;
        qy6 f = lsf.f(this.j);
        qy6 f2 = lsf.f(this.d);
        int i = f.d;
        int i2 = f2.d;
        qy6 b = qy6.b(f.a - f2.a, f.b - f2.b, f.c - f2.c, i - i2);
        this.a.setTranslationY((((float) qy6.b(Math.max(b.a, 0), Math.max(b.b, 0), Math.max(b.c, 0), Math.max(b.d, 0)).d) / ((float) (this.p - i2))) * ((float) this.o));
        return nsf;
    }

    public final void i() {
        this.a.setTranslationY(0.0f);
        this.q = false;
    }

    public final void j() {
        this.l.getGlobalVisibleRect(this.m);
        this.n = this.a.getBottom();
    }
}
