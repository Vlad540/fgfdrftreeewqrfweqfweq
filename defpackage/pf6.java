package defpackage;

import java.util.Iterator;

/* renamed from: pf6  reason: default package */
public final class pf6 extends lrf {
    public final void a(pe4 pe4) {
        jg0 jg0 = (jg0) this.b;
        int i = jg0.s0;
        se4 se4 = this.h;
        Iterator it = se4.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((se4) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            se4.d(i3 + jg0.u0);
        } else {
            se4.d(i2 + jg0.u0);
        }
    }

    public final void d() {
        ff3 ff3 = this.b;
        if (ff3 instanceof jg0) {
            se4 se4 = this.h;
            se4.b = true;
            jg0 jg0 = (jg0) ff3;
            int i = jg0.s0;
            boolean z = jg0.t0;
            int i2 = 0;
            if (i == 0) {
                se4.e = 4;
                while (i2 < jg0.r0) {
                    ff3 ff32 = jg0.q0[i2];
                    if (z || ff32.g0 != 8) {
                        se4 se42 = ff32.d.h;
                        se42.k.add(se4);
                        se4.l.add(se42);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 1) {
                se4.e = 5;
                while (i2 < jg0.r0) {
                    ff3 ff33 = jg0.q0[i2];
                    if (z || ff33.g0 != 8) {
                        se4 se43 = ff33.d.i;
                        se43.k.add(se4);
                        se4.l.add(se43);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 2) {
                se4.e = 6;
                while (i2 < jg0.r0) {
                    ff3 ff34 = jg0.q0[i2];
                    if (z || ff34.g0 != 8) {
                        se4 se44 = ff34.e.h;
                        se44.k.add(se4);
                        se4.l.add(se44);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            } else if (i == 3) {
                se4.e = 7;
                while (i2 < jg0.r0) {
                    ff3 ff35 = jg0.q0[i2];
                    if (z || ff35.g0 != 8) {
                        se4 se45 = ff35.e.i;
                        se45.k.add(se4);
                        se4.l.add(se45);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            }
        }
    }

    public final void e() {
        ff3 ff3 = this.b;
        if (ff3 instanceof jg0) {
            int i = ((jg0) ff3).s0;
            se4 se4 = this.h;
            if (i == 0 || i == 1) {
                ff3.Y = se4.g;
            } else {
                ff3.Z = se4.g;
            }
        }
    }

    public final void f() {
        this.c = null;
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
