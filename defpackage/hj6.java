package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: hj6  reason: default package */
public final class hj6 implements yjc {
    public final int a;
    public final pj6 b;
    public int c = -1;

    public hj6(pj6 pj6, int i) {
        this.b = pj6;
        this.a = i;
    }

    public final void a() {
        oyb.d(this.c == -1);
        pj6 pj6 = this.b;
        pj6.d();
        pj6.Z0.getClass();
        int[] iArr = pj6.Z0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = pj6.c1;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.c = i2;
            }
        } else if (pj6.Y0.contains(pj6.X0.a(i))) {
            i2 = -3;
            this.c = i2;
        }
        i2 = -2;
        this.c = i2;
    }

    public final boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public final void c() {
        int i = this.c;
        pj6 pj6 = this.b;
        if (i == -2) {
            pj6.d();
            throw new IOException(wn6.i("Unable to bind a sample queue to TrackGroup with MIME type ", pj6.X0.a(this.a).d[0].n, "."));
        } else if (i == -1) {
            pj6.A();
        } else if (i != -3) {
            pj6.A();
            pj6.K0[i].u();
        }
    }

    public final boolean d() {
        if (this.c != -3) {
            if (b()) {
                int i = this.c;
                pj6 pj6 = this.b;
                if (pj6.y() || !pj6.K0[i].s(pj6.i1)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int e(long j) {
        int i;
        if (!b()) {
            return 0;
        }
        int i2 = this.c;
        pj6 pj6 = this.b;
        if (pj6.y()) {
            return 0;
        }
        nj6 nj6 = pj6.K0[i2];
        int p = nj6.p(j, pj6.i1);
        ai6 ai6 = (ai6) gwf.u(pj6.C0);
        if (ai6 == null || ai6.a1) {
            i = p;
        } else {
            i = Math.min(p, ai6.f(i2) - nj6.n());
        }
        nj6.B(i);
        return i;
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        xu5 xu5;
        qe4 qe42 = qe4;
        n24 n242 = n24;
        int i2 = -3;
        if (this.c == -3) {
            n242.a(4);
            return -4;
        }
        if (b()) {
            int i3 = this.c;
            pj6 pj6 = this.b;
            if (!pj6.y()) {
                ArrayList arrayList = pj6.C0;
                int i4 = 0;
                if (!arrayList.isEmpty()) {
                    int i5 = 0;
                    loop0:
                    while (i5 < arrayList.size() - 1) {
                        int i6 = ((ai6) arrayList.get(i5)).z0;
                        int length = pj6.K0.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (pj6.c1[i7] && pj6.K0[i7].w() == ((long) i6)) {
                                break loop0;
                            }
                        }
                        i5++;
                    }
                    oze.X(arrayList, 0, i5);
                    ai6 ai6 = (ai6) arrayList.get(0);
                    xu5 xu52 = ai6.o;
                    if (!xu52.equals(pj6.V0)) {
                        pj6.z0.n(pj6.b, xu52, ai6.X, ai6.Y, ai6.Z);
                    }
                    pj6.V0 = xu52;
                }
                if ((arrayList.isEmpty() || ((ai6) arrayList.get(0)).a1) && (i2 = pj6.K0[i3].x(qe42, n242, i, pj6.i1)) == -5) {
                    xu5 xu53 = (xu5) qe42.c;
                    xu53.getClass();
                    if (i3 == pj6.Q0) {
                        int l = xie.l(pj6.K0[i3].w());
                        while (i4 < arrayList.size() && ((ai6) arrayList.get(i4)).z0 != l) {
                            i4++;
                        }
                        if (i4 < arrayList.size()) {
                            xu5 = ((ai6) arrayList.get(i4)).o;
                        } else {
                            xu5 = pj6.U0;
                            xu5.getClass();
                        }
                        xu53 = xu53.f(xu5);
                    }
                    qe42.c = xu53;
                }
            }
        }
        return i2;
    }
}
