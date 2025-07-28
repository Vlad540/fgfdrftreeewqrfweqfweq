package defpackage;

/* renamed from: cd6  reason: default package */
public final class cd6 extends lrf {
    public final void a(pe4 pe4) {
        se4 se4 = this.h;
        if (se4.c && !se4.j) {
            se4.d((int) ((((float) ((se4) se4.l.get(0)).g) * ((bd6) this.b).q0) + 0.5f));
        }
    }

    public final void d() {
        ff3 ff3 = this.b;
        bd6 bd6 = (bd6) ff3;
        int i = bd6.r0;
        int i2 = bd6.s0;
        int i3 = bd6.u0;
        se4 se4 = this.h;
        if (i3 == 1) {
            if (i != -1) {
                se4.l.add(ff3.T.d.h);
                this.b.T.d.h.k.add(se4);
                se4.f = i;
            } else if (i2 != -1) {
                se4.l.add(ff3.T.d.i);
                this.b.T.d.i.k.add(se4);
                se4.f = -i2;
            } else {
                se4.b = true;
                se4.l.add(ff3.T.d.i);
                this.b.T.d.i.k.add(se4);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            se4.l.add(ff3.T.e.h);
            this.b.T.e.h.k.add(se4);
            se4.f = i;
        } else if (i2 != -1) {
            se4.l.add(ff3.T.e.i);
            this.b.T.e.i.k.add(se4);
            se4.f = -i2;
        } else {
            se4.b = true;
            se4.l.add(ff3.T.e.i);
            this.b.T.e.i.k.add(se4);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void e() {
        ff3 ff3 = this.b;
        int i = ((bd6) ff3).u0;
        se4 se4 = this.h;
        if (i == 1) {
            ff3.Y = se4.g;
        } else {
            ff3.Z = se4.g;
        }
    }

    public final void f() {
        this.h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(se4 se4) {
        se4 se42 = this.h;
        se42.k.add(se4);
        se4.l.add(se42);
    }
}
