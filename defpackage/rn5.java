package defpackage;

import java.util.Iterator;

/* renamed from: rn5  reason: default package */
public final class rn5 extends p0 {
    public final j26 c;
    public final int o;

    public rn5(dx7 dx7, dd9 dd9, int i) {
        super(dx7);
        this.c = dd9;
        this.o = i;
    }

    public final void g(b1e b1e) {
        an5 an5 = this.b;
        boolean z = an5 instanceof q3e;
        j26 j26 = this.c;
        if (z) {
            try {
                Object obj = ((q3e) an5).get();
                if (obj == null) {
                    vw4.a(b1e);
                    return;
                }
                try {
                    Iterator it = ((Iterable) j26.apply(obj)).iterator();
                    try {
                        if (!it.hasNext()) {
                            vw4.a(b1e);
                        } else {
                            b1e.e(new tn5(b1e, it));
                        }
                    } catch (Throwable th) {
                        ek8.a0(th);
                        vw4.b(th, b1e);
                    }
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    vw4.b(th2, b1e);
                }
            } catch (Throwable th3) {
                ek8.a0(th3);
                vw4.b(th3, b1e);
            }
        } else {
            an5.d(new qn5(b1e, j26, this.o));
        }
    }
}
