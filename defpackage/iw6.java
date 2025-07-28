package defpackage;

import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: iw6  reason: default package */
public final class iw6 extends gr8 {
    public static volatile iw6[] u;
    public long a = 0;
    public String b = BuildConfig.FLAVOR;
    public String c = BuildConfig.FLAVOR;
    public String d = BuildConfig.FLAVOR;
    public String e = BuildConfig.FLAVOR;
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public long l = 0;
    public long m = 0;
    public String n = BuildConfig.FLAVOR;
    public byte[] o = iu7.o;
    public String p = BuildConfig.FLAVOR;
    public mw6[] q = mw6.a();
    public long r = 0;
    public String s = BuildConfig.FLAVOR;
    public boolean t = false;

    public iw6() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long j2 = this.a;
        int i2 = 0;
        int h2 = j2 != 0 ? o13.h(1, j2) : 0;
        if (!this.b.equals(BuildConfig.FLAVOR)) {
            h2 += o13.l(2, this.b);
        }
        if (!this.c.equals(BuildConfig.FLAVOR)) {
            h2 += o13.l(3, this.c);
        }
        if (!this.d.equals(BuildConfig.FLAVOR)) {
            h2 += o13.l(4, this.d);
        }
        if (!this.e.equals(BuildConfig.FLAVOR)) {
            h2 += o13.l(5, this.e);
        }
        long j3 = this.f;
        if (j3 != 0) {
            h2 += o13.k(j3) + o13.m(6);
        }
        int i3 = this.g;
        if (i3 != 0) {
            h2 += o13.f(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            h2 += o13.f(8, i4);
        }
        if (this.i) {
            h2 += o13.a(9);
        }
        if (this.j) {
            h2 += o13.a(10);
        }
        if (this.k) {
            h2 += o13.a(11);
        }
        long j4 = this.l;
        if (j4 != 0) {
            h2 += o13.k(j4) + o13.m(12);
        }
        long j5 = this.m;
        if (j5 != 0) {
            h2 += o13.h(13, j5);
        }
        if (!this.n.equals(BuildConfig.FLAVOR)) {
            h2 += o13.l(14, this.n);
        }
        if (!Arrays.equals(this.o, iu7.o)) {
            h2 += o13.b(15, this.o);
        }
        if (!this.p.equals(BuildConfig.FLAVOR)) {
            h2 += o13.l(16, this.p);
        }
        mw6[] mw6Arr = this.q;
        if (mw6Arr != null && mw6Arr.length > 0) {
            while (true) {
                mw6[] mw6Arr2 = this.q;
                if (i2 >= mw6Arr2.length) {
                    break;
                }
                mw6 mw6 = mw6Arr2[i2];
                if (mw6 != null) {
                    h2 = o13.i(17, mw6) + h2;
                }
                i2++;
            }
        }
        long j6 = this.r;
        if (j6 != 0) {
            h2 += o13.h(18, j6);
        }
        if (!this.s.equals(BuildConfig.FLAVOR)) {
            h2 += o13.l(19, this.s);
        }
        return this.t ? h2 + o13.a(20) : h2;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s2 = n13.s();
            switch (s2) {
                case 0:
                    break;
                case 8:
                    this.a = n13.q();
                    continue;
                case 18:
                    this.b = n13.r();
                    continue;
                case 26:
                    this.c = n13.r();
                    continue;
                case 34:
                    this.d = n13.r();
                    continue;
                case 42:
                    this.e = n13.r();
                    continue;
                case 48:
                    this.f = n13.q();
                    continue;
                case 56:
                    this.g = n13.p();
                    continue;
                case 64:
                    this.h = n13.p();
                    continue;
                case 72:
                    this.i = n13.f();
                    continue;
                case 80:
                    this.j = n13.f();
                    continue;
                case 88:
                    this.k = n13.f();
                    continue;
                case 96:
                    this.l = n13.q();
                    continue;
                case 104:
                    this.m = n13.q();
                    continue;
                case 114:
                    this.n = n13.r();
                    continue;
                case 122:
                    this.o = n13.g();
                    continue;
                case 130:
                    this.p = n13.r();
                    continue;
                case 138:
                    int z = iu7.z(n13, 138);
                    mw6[] mw6Arr = this.q;
                    int length = mw6Arr == null ? 0 : mw6Arr.length;
                    int i2 = z + length;
                    mw6[] mw6Arr2 = new mw6[i2];
                    if (length != 0) {
                        System.arraycopy(mw6Arr, 0, mw6Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        mw6 mw6 = new mw6();
                        mw6Arr2[length] = mw6;
                        n13.j(mw6);
                        n13.s();
                        length++;
                    }
                    mw6 mw62 = new mw6();
                    mw6Arr2[length] = mw62;
                    n13.j(mw62);
                    this.q = mw6Arr2;
                    continue;
                case 144:
                    this.r = n13.q();
                    continue;
                case 154:
                    this.s = n13.r();
                    continue;
                case 160:
                    this.t = n13.f();
                    continue;
                default:
                    if (!n13.u(s2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        long j2 = this.a;
        if (j2 != 0) {
            o13.x(1, j2);
        }
        if (!this.b.equals(BuildConfig.FLAVOR)) {
            o13.E(2, this.b);
        }
        if (!this.c.equals(BuildConfig.FLAVOR)) {
            o13.E(3, this.c);
        }
        if (!this.d.equals(BuildConfig.FLAVOR)) {
            o13.E(4, this.d);
        }
        if (!this.e.equals(BuildConfig.FLAVOR)) {
            o13.E(5, this.e);
        }
        long j3 = this.f;
        int i2 = 0;
        if (j3 != 0) {
            o13.F(6, 0);
            o13.D(j3);
        }
        int i3 = this.g;
        if (i3 != 0) {
            o13.w(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            o13.w(8, i4);
        }
        boolean z = this.i;
        if (z) {
            o13.r(9, z);
        }
        boolean z2 = this.j;
        if (z2) {
            o13.r(10, z2);
        }
        boolean z3 = this.k;
        if (z3) {
            o13.r(11, z3);
        }
        long j4 = this.l;
        if (j4 != 0) {
            o13.F(12, 0);
            o13.D(j4);
        }
        long j5 = this.m;
        if (j5 != 0) {
            o13.x(13, j5);
        }
        if (!this.n.equals(BuildConfig.FLAVOR)) {
            o13.E(14, this.n);
        }
        if (!Arrays.equals(this.o, iu7.o)) {
            o13.s(15, this.o);
        }
        if (!this.p.equals(BuildConfig.FLAVOR)) {
            o13.E(16, this.p);
        }
        mw6[] mw6Arr = this.q;
        if (mw6Arr != null && mw6Arr.length > 0) {
            while (true) {
                mw6[] mw6Arr2 = this.q;
                if (i2 >= mw6Arr2.length) {
                    break;
                }
                mw6 mw6 = mw6Arr2[i2];
                if (mw6 != null) {
                    o13.y(17, mw6);
                }
                i2++;
            }
        }
        long j6 = this.r;
        if (j6 != 0) {
            o13.x(18, j6);
        }
        if (!this.s.equals(BuildConfig.FLAVOR)) {
            o13.E(19, this.s);
        }
        boolean z4 = this.t;
        if (z4) {
            o13.r(20, z4);
        }
    }
}
