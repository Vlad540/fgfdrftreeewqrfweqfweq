package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* renamed from: e3b  reason: default package */
public final class e3b implements ls9 {
    public final fu1 a;
    public final vb9 b;
    public j3b c;
    public final io9 d;
    public j36 e;
    public boolean f = false;

    public e3b(fu1 fu1, vb9 vb9, io9 io9) {
        this.a = fu1;
        this.b = vb9;
        this.d = io9;
        synchronized (this) {
            this.c = (j3b) vb9.d();
        }
    }

    public final void a(Object obj) {
        gu1 gu1 = (gu1) obj;
        gu1 gu12 = gu1.CLOSING;
        j3b j3b = j3b.a;
        if (gu1 == gu12 || gu1 == gu1.CLOSED || gu1 == gu1.RELEASING || gu1 == gu1.RELEASED) {
            b(j3b);
            if (this.f) {
                this.f = false;
                j36 j36 = this.e;
                if (j36 != null) {
                    j36.cancel(false);
                    this.e = null;
                }
            }
        } else if ((gu1 == gu1.OPENING || gu1 == gu1.OPEN || gu1 == gu1.PENDING_OPEN) && !this.f) {
            b(j3b);
            ArrayList arrayList = new ArrayList();
            fu1 fu1 = this.a;
            j36 a2 = j36.a(hwf.f(new xz(this, fu1, arrayList, 23)));
            ss8 ss8 = new ss8(19, this);
            mh4 j = pa2.j();
            a2.getClass();
            oy1 N = ct0.N(a2, ss8, j);
            pt1 pt1 = new pt1(2, this);
            oy1 N2 = ct0.N(N, new e3(pt1), pa2.j());
            this.e = N2;
            ct0.a(N2, new w4g(this, arrayList, fu1), pa2.j());
            this.f = true;
        }
    }

    public final void b(j3b j3b) {
        synchronized (this) {
            try {
                if (!this.c.equals(j3b)) {
                    this.c = j3b;
                    Objects.toString(j3b);
                    this.b.i(j3b);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void onError(Throwable th) {
        j36 j36 = this.e;
        if (j36 != null) {
            j36.cancel(false);
            this.e = null;
        }
        b(j3b.a);
    }
}
