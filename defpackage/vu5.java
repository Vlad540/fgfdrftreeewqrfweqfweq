package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: vu5  reason: default package */
public final class vu5 implements lt0 {
    public static final vu5 V0 = new vu5(new tu5());
    public static final yc5 W0 = new yc5(17);
    public final String A0;
    public final int B0;
    public final List C0;
    public final wn4 D0;
    public final long E0;
    public final int F0;
    public final int G0;
    public final float H0;
    public final int I0;
    public final float J0;
    public final byte[] K0;
    public final int L0;
    public final y23 M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    public final int S0;
    public final int T0;
    public int U0;
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int o;
    public final int w0;
    public final String x0;
    public final y29 y0;
    public final String z0;

    public vu5(tu5 tu5) {
        this.a = tu5.a;
        this.b = tu5.b;
        this.c = mze.E(tu5.c);
        this.o = tu5.d;
        this.X = tu5.e;
        int i = tu5.f;
        this.Y = i;
        int i2 = tu5.g;
        this.Z = i2;
        this.w0 = i2 != -1 ? i2 : i;
        this.x0 = tu5.h;
        this.y0 = tu5.i;
        this.z0 = tu5.j;
        this.A0 = tu5.k;
        this.B0 = tu5.l;
        List list = tu5.m;
        this.C0 = list == null ? Collections.emptyList() : list;
        wn4 wn4 = tu5.n;
        this.D0 = wn4;
        this.E0 = tu5.o;
        this.F0 = tu5.p;
        this.G0 = tu5.q;
        this.H0 = tu5.r;
        int i3 = tu5.s;
        int i4 = 0;
        this.I0 = i3 == -1 ? 0 : i3;
        float f = tu5.t;
        this.J0 = f == -1.0f ? 1.0f : f;
        this.K0 = tu5.u;
        this.L0 = tu5.v;
        this.M0 = tu5.w;
        this.N0 = tu5.x;
        this.O0 = tu5.y;
        this.P0 = tu5.z;
        int i5 = tu5.A;
        this.Q0 = i5 == -1 ? 0 : i5;
        int i6 = tu5.B;
        this.R0 = i6 != -1 ? i6 : i4;
        this.S0 = tu5.C;
        int i7 = tu5.D;
        if (i7 != 0 || wn4 == null) {
            this.T0 = i7;
        } else {
            this.T0 = 1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [tu5, java.lang.Object] */
    public final tu5 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.o;
        obj.e = this.X;
        obj.f = this.Y;
        obj.g = this.Z;
        obj.h = this.x0;
        obj.i = this.y0;
        obj.j = this.z0;
        obj.k = this.A0;
        obj.l = this.B0;
        obj.m = this.C0;
        obj.n = this.D0;
        obj.o = this.E0;
        obj.p = this.F0;
        obj.q = this.G0;
        obj.r = this.H0;
        obj.s = this.I0;
        obj.t = this.J0;
        obj.u = this.K0;
        obj.v = this.L0;
        obj.w = this.M0;
        obj.x = this.N0;
        obj.y = this.O0;
        obj.z = this.P0;
        obj.A = this.Q0;
        obj.B = this.R0;
        obj.C = this.S0;
        obj.D = this.T0;
        return obj;
    }

    public final int b() {
        int i;
        int i2 = this.F0;
        if (i2 == -1 || (i = this.G0) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(vu5 vu5) {
        List list = this.C0;
        if (list.size() != vu5.C0.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) vu5.C0.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final vu5 d(vu5 vu5) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        vu5 vu52 = vu5;
        if (this == vu52) {
            return this;
        }
        int g = b49.g(this.A0);
        String str3 = vu52.a;
        String str4 = vu52.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (!(g == 3 || g == 1) || (str = vu52.c) == null) {
            str = this.c;
        }
        int i4 = this.Y;
        if (i4 == -1) {
            i4 = vu52.Y;
        }
        int i5 = this.Z;
        if (i5 == -1) {
            i5 = vu52.Z;
        }
        String str5 = this.x0;
        if (str5 == null) {
            String q = mze.q(g, vu52.x0);
            if (mze.L(q).length == 1) {
                str5 = q;
            }
        }
        y29 y29 = vu52.y0;
        y29 y292 = this.y0;
        if (y292 != null) {
            if (y29 != null) {
                w29[] w29Arr = y29.a;
                if (w29Arr.length != 0) {
                    int i6 = mze.a;
                    w29[] w29Arr2 = y292.a;
                    Object[] copyOf = Arrays.copyOf(w29Arr2, w29Arr2.length + w29Arr.length);
                    System.arraycopy(w29Arr, 0, copyOf, w29Arr2.length, w29Arr.length);
                    y292 = new y29((w29[]) copyOf);
                }
            }
            y29 = y292;
        }
        float f = this.H0;
        if (f == -1.0f && g == 2) {
            f = vu52.H0;
        }
        int i7 = this.o | vu52.o;
        int i8 = this.X | vu52.X;
        ArrayList arrayList = new ArrayList();
        wn4 wn4 = vu52.D0;
        if (wn4 != null) {
            un4[] un4Arr = wn4.a;
            int length = un4Arr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = length;
                un4 un4 = un4Arr[i9];
                un4[] un4Arr2 = un4Arr;
                if (un4.X != null) {
                    arrayList.add(un4);
                }
                i9++;
                length = i10;
                un4Arr = un4Arr2;
            }
            str2 = wn4.c;
        } else {
            str2 = null;
        }
        wn4 wn42 = this.D0;
        if (wn42 != null) {
            if (str2 == null) {
                str2 = wn42.c;
            }
            int size = arrayList.size();
            un4[] un4Arr3 = wn42.a;
            int length2 = un4Arr3.length;
            int i11 = 0;
            while (true) {
                String str6 = str2;
                if (i11 >= length2) {
                    break;
                }
                un4 un42 = un4Arr3[i11];
                un4[] un4Arr4 = un4Arr3;
                if (un42.X != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            i = size;
                            i2 = length2;
                            i3 = 1;
                            arrayList.add(un42);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((un4) arrayList.get(i12)).b.equals(un42.b)) {
                            break;
                        }
                        i12++;
                        length2 = i2;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i3 = 1;
                i11 += i3;
                str2 = str6;
                un4Arr3 = un4Arr4;
                length2 = i2;
                size = i;
            }
        }
        wn4 wn43 = arrayList.isEmpty() ? null : new wn4(str2, arrayList);
        tu5 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = str;
        a2.d = i7;
        a2.e = i8;
        a2.f = i4;
        a2.g = i5;
        a2.h = str5;
        a2.i = y29;
        a2.n = wn43;
        a2.r = f;
        return new vu5(a2);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || vu5.class != obj.getClass()) {
            return false;
        }
        vu5 vu5 = (vu5) obj;
        int i2 = this.U0;
        if (i2 == 0 || (i = vu5.U0) == 0 || i2 == i) {
            return this.o == vu5.o && this.X == vu5.X && this.Y == vu5.Y && this.Z == vu5.Z && this.B0 == vu5.B0 && this.E0 == vu5.E0 && this.F0 == vu5.F0 && this.G0 == vu5.G0 && this.I0 == vu5.I0 && this.L0 == vu5.L0 && this.N0 == vu5.N0 && this.O0 == vu5.O0 && this.P0 == vu5.P0 && this.Q0 == vu5.Q0 && this.R0 == vu5.R0 && this.S0 == vu5.S0 && this.T0 == vu5.T0 && Float.compare(this.H0, vu5.H0) == 0 && Float.compare(this.J0, vu5.J0) == 0 && mze.a(this.a, vu5.a) && mze.a(this.b, vu5.b) && mze.a(this.x0, vu5.x0) && mze.a(this.z0, vu5.z0) && mze.a(this.A0, vu5.A0) && mze.a(this.c, vu5.c) && Arrays.equals(this.K0, vu5.K0) && mze.a(this.y0, vu5.y0) && mze.a(this.M0, vu5.M0) && mze.a(this.D0, vu5.D0) && c(vu5);
        }
        return false;
    }

    public final int hashCode() {
        if (this.U0 == 0) {
            int i = 0;
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31;
            String str4 = this.x0;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            y29 y29 = this.y0;
            int hashCode5 = (hashCode4 + (y29 == null ? 0 : Arrays.hashCode(y29.a))) * 31;
            String str5 = this.z0;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.A0;
            if (str6 != null) {
                i = str6.hashCode();
            }
            this.U0 = ((((((((((((((((Float.floatToIntBits(this.J0) + ((((Float.floatToIntBits(this.H0) + ((((((((((hashCode6 + i) * 31) + this.B0) * 31) + ((int) this.E0)) * 31) + this.F0) * 31) + this.G0) * 31)) * 31) + this.I0) * 31)) * 31) + this.L0) * 31) + this.N0) * 31) + this.O0) * 31) + this.P0) * 31) + this.Q0) * 31) + this.R0) * 31) + this.S0) * 31) + this.T0;
        }
        return this.U0;
    }

    public final String toString() {
        String str = this.a;
        int e = me4.e(104, str);
        String str2 = this.b;
        int e2 = me4.e(e, str2);
        String str3 = this.z0;
        int e3 = me4.e(e2, str3);
        String str4 = this.A0;
        int e4 = me4.e(e3, str4);
        String str5 = this.x0;
        int e5 = me4.e(e4, str5);
        String str6 = this.c;
        StringBuilder sb = new StringBuilder(me4.e(e5, str6));
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(this.w0);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(this.F0);
        sb.append(", ");
        sb.append(this.G0);
        sb.append(", ");
        sb.append(this.H0);
        sb.append("], [");
        sb.append(this.N0);
        sb.append(", ");
        return wn6.j(sb, this.O0, "])");
    }
}
