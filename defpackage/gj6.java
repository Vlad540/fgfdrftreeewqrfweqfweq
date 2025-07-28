package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: gj6  reason: default package */
public final class gj6 implements xjc {
    public final int a;
    public final oj6 b;
    public int c = -1;

    public gj6(oj6 oj6, int i) {
        this.b = oj6;
        this.a = i;
    }

    public final void a() {
        swb.e(this.c == -1);
        oj6 oj6 = this.b;
        oj6.d();
        oj6.Z0.getClass();
        int[] iArr = oj6.Z0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = oj6.c1;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.c = i2;
            }
        } else if (oj6.Y0.contains(oj6.X0.a(i))) {
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
        oj6 oj6 = this.b;
        if (i == -2) {
            oj6.d();
            String str = oj6.X0.a(this.a).c[0].A0;
            StringBuilder sb = new StringBuilder(me4.e(60, str));
            sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
            sb.append(str);
            sb.append(".");
            throw new IOException(sb.toString());
        } else if (i == -1) {
            oj6.v();
        } else if (i != -3) {
            oj6.v();
            oj6.K0[i].v();
        }
    }

    public final boolean d() {
        if (this.c != -3) {
            if (b()) {
                int i = this.c;
                oj6 oj6 = this.b;
                if (oj6.n() || !oj6.K0[i].t(oj6.i1)) {
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
        oj6 oj6 = this.b;
        if (oj6.n()) {
            return 0;
        }
        mj6 mj6 = oj6.K0[i2];
        int q = mj6.q(j, oj6.i1);
        zh6 zh6 = (zh6) gwf.u(oj6.C0);
        if (zh6 == null || zh6.Z0) {
            i = q;
        } else {
            i = Math.min(q, zh6.f(i2) - mj6.o());
        }
        mj6.B(i);
        return i;
    }

    public final int h(otf otf, m24 m24, int i) {
        vu5 vu5;
        otf otf2 = otf;
        m24 m242 = m24;
        int i2 = -3;
        if (this.c == -3) {
            m242.a(4);
            return -4;
        }
        if (b()) {
            int i3 = this.c;
            oj6 oj6 = this.b;
            if (!oj6.n()) {
                ArrayList arrayList = oj6.C0;
                int i4 = 0;
                if (!arrayList.isEmpty()) {
                    int i5 = 0;
                    loop0:
                    while (i5 < arrayList.size() - 1) {
                        int i6 = ((zh6) arrayList.get(i5)).z0;
                        int length = oj6.K0.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (oj6.c1[i7] && oj6.K0[i7].x() == i6) {
                                break loop0;
                            }
                        }
                        i5++;
                    }
                    mze.I(arrayList, 0, i5);
                    zh6 zh6 = (zh6) arrayList.get(0);
                    vu5 vu52 = zh6.o;
                    if (!vu52.equals(oj6.V0)) {
                        oj6.z0.b(oj6.b, vu52, zh6.X, zh6.Y, zh6.Z);
                    }
                    oj6.V0 = vu52;
                }
                if ((arrayList.isEmpty() || ((zh6) arrayList.get(0)).Z0) && (i2 = oj6.K0[i3].y(otf2, m242, i, oj6.i1)) == -5) {
                    vu5 vu53 = (vu5) otf2.b;
                    vu53.getClass();
                    if (i3 == oj6.Q0) {
                        int x = oj6.K0[i3].x();
                        while (i4 < arrayList.size() && ((zh6) arrayList.get(i4)).z0 != x) {
                            i4++;
                        }
                        if (i4 < arrayList.size()) {
                            vu5 = ((zh6) arrayList.get(i4)).o;
                        } else {
                            vu5 = oj6.U0;
                            vu5.getClass();
                        }
                        vu53 = vu53.d(vu5);
                    }
                    otf2.b = vu53;
                }
            }
        }
        return i2;
    }
}
