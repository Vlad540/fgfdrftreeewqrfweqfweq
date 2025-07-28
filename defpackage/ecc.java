package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ecc  reason: default package */
public final class ecc implements ot1 {
    public final ot1 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ecc(ot1 ot1) {
        this(ot1, (byte) 0);
        this.c = 0;
        this.d = ot1;
    }

    public final void a() {
        this.b.a();
    }

    public ch7 b(float f) {
        switch (this.c) {
            case 0:
                return ((ot1) this.d).b(f);
            default:
                return q(f);
        }
    }

    public final void c(ia3 ia3) {
        this.b.c(ia3);
    }

    public ch7 d(float f) {
        switch (this.c) {
            case 0:
                return ((ot1) this.d).d(f);
            default:
                return r(f);
        }
    }

    public final Rect e() {
        return this.b.e();
    }

    public final void f(int i) {
        this.b.f(i);
    }

    public final void g(aq6 aq6) {
        this.b.g(aq6);
    }

    public ch7 h(ws4 ws4) {
        switch (this.c) {
            case 0:
                return ((ot1) this.d).h(ws4);
            default:
                return s(ws4);
        }
    }

    public ch7 i(ArrayList arrayList, int i, int i2) {
        switch (this.c) {
            case 1:
                boolean z = true;
                if (arrayList.size() != 1) {
                    z = false;
                }
                e07.j("Only support one capture config.", z);
                ch7 l = this.b.l(i, i2);
                j36 a = j36.a(l);
                n36 n36 = new n36(l, 2);
                mh4 j = pa2.j();
                a.getClass();
                return ct0.b(Collections.singletonList(ct0.N(ct0.N(ct0.N(a, n36, j), new joc(this, 24, arrayList), pa2.j()), new n36(l, 3), pa2.j())));
            default:
                return t(arrayList, i, i2);
        }
    }

    public final void j(y1d y1d) {
        this.b.j(y1d);
    }

    public ch7 k(boolean z) {
        switch (this.c) {
            case 0:
                return ((ot1) this.d).k(z);
            default:
                return p(z);
        }
    }

    public final ch7 l(int i, int i2) {
        return this.b.l(i, i2);
    }

    public final ia3 m() {
        return this.b.m();
    }

    public final void n() {
        this.b.n();
    }

    public final void o() {
        this.b.o();
    }

    public final ch7 p(boolean z) {
        return this.b.k(z);
    }

    public final ch7 q(float f) {
        return this.b.b(f);
    }

    public final ch7 r(float f) {
        return this.b.d(f);
    }

    public final ch7 s(ws4 ws4) {
        return this.b.h(ws4);
    }

    public final ch7 t(ArrayList arrayList, int i, int i2) {
        return this.b.i(arrayList, i, i2);
    }

    public ecc(ot1 ot1, byte b2) {
        this.b = ot1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ecc(ot1 ot1, sic sic) {
        this(ot1, (byte) 0);
        this.c = 1;
        this.d = sic;
    }
}
