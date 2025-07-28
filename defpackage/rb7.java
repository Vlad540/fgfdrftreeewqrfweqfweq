package defpackage;

import java.util.Iterator;

/* renamed from: rb7  reason: default package */
public final class rb7 extends st1 {
    public nc7 E;

    public final qb7 p() {
        jg8 jg8;
        if (this.E == null || this.n == null) {
            return null;
        }
        if (!i() || this.p == null || this.o == null) {
            jg8 = null;
        } else {
            tye tye = new tye();
            tye.a(this.c);
            gt0.i();
            if ((this.b & 1) != 0) {
                tye.a(this.d);
            } else {
                this.n.a(this.d);
            }
            gt0.i();
            if ((this.b & 2) != 0) {
                tye.a(this.e);
            } else {
                this.n.a(this.e);
            }
            gt0.i();
            if ((this.b & 4) != 0) {
                tye.a(this.f);
            } else {
                this.n.a(this.f);
            }
            tye.a = this.o;
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                tye.c.add((k5f) it.next());
            }
            jg8 = tye.b();
        }
        if (jg8 == null) {
            return null;
        }
        try {
            return this.n.a.c(this.E, this.a, jg8);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }
}
