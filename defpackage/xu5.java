package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: xu5  reason: default package */
public final class xu5 {
    public static final xu5 M = new uu5().a();
    public static final String N = Integer.toString(0, 36);
    public static final String O = Integer.toString(1, 36);
    public static final String P = Integer.toString(2, 36);
    public static final String Q = Integer.toString(3, 36);
    public static final String R = Integer.toString(4, 36);
    public static final String S = Integer.toString(5, 36);
    public static final String T = Integer.toString(6, 36);
    public static final String U = Integer.toString(7, 36);
    public static final String V = Integer.toString(8, 36);
    public static final String W = Integer.toString(9, 36);
    public static final String X = Integer.toString(10, 36);
    public static final String Y = Integer.toString(11, 36);
    public static final String Z = Integer.toString(12, 36);
    public static final String a0 = Integer.toString(13, 36);
    public static final String b0 = Integer.toString(14, 36);
    public static final String c0 = Integer.toString(15, 36);
    public static final String d0 = Integer.toString(16, 36);
    public static final String e0 = Integer.toString(17, 36);
    public static final String f0 = Integer.toString(18, 36);
    public static final String g0 = Integer.toString(19, 36);
    public static final String h0 = Integer.toString(20, 36);
    public static final String i0 = Integer.toString(21, 36);
    public static final String j0 = Integer.toString(22, 36);
    public static final String k0 = Integer.toString(23, 36);
    public static final String l0 = Integer.toString(24, 36);
    public static final String m0 = Integer.toString(25, 36);
    public static final String n0 = Integer.toString(26, 36);
    public static final String o0 = Integer.toString(27, 36);
    public static final String p0 = Integer.toString(28, 36);
    public static final String q0 = Integer.toString(29, 36);
    public static final String r0 = Integer.toString(30, 36);
    public static final String s0 = Integer.toString(31, 36);
    public static final String t0 = Integer.toString(32, 36);
    public final z23 A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final a39 k;
    public final Object l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final xn4 r;
    public final long s;
    public final int t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final byte[] y;
    public final int z;

    public xu5(uu5 uu5) {
        boolean z2;
        String str;
        this.a = uu5.a;
        String T2 = oze.T(uu5.d);
        this.d = T2;
        int i2 = 0;
        if (uu5.c.isEmpty() && uu5.b != null) {
            this.c = ws6.n(new y87(T2, uu5.b));
            this.b = uu5.b;
        } else if (uu5.c.isEmpty() || uu5.b != null) {
            if (!uu5.c.isEmpty() || uu5.b != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= uu5.c.size()) {
                        z2 = false;
                        break;
                    } else if (((y87) uu5.c.get(i3)).b.equals(uu5.b)) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z2 = true;
            oyb.k(z2);
            this.c = uu5.c;
            this.b = uu5.b;
        } else {
            List list = uu5.c;
            this.c = list;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((y87) list.get(0)).b;
                    break;
                }
                y87 y87 = (y87) it.next();
                if (TextUtils.equals(y87.a, T2)) {
                    str = y87.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = uu5.e;
        this.f = uu5.f;
        int i4 = uu5.g;
        this.g = i4;
        int i5 = uu5.h;
        this.h = i5;
        this.i = i5 != -1 ? i5 : i4;
        this.j = uu5.i;
        this.k = uu5.j;
        this.l = uu5.k;
        this.m = uu5.l;
        this.n = uu5.m;
        this.o = uu5.n;
        this.p = uu5.o;
        List list2 = uu5.p;
        this.q = list2 == null ? Collections.emptyList() : list2;
        xn4 xn4 = uu5.q;
        this.r = xn4;
        this.s = uu5.r;
        this.t = uu5.s;
        this.u = uu5.t;
        this.v = uu5.u;
        int i6 = uu5.v;
        this.w = i6 == -1 ? 0 : i6;
        float f2 = uu5.w;
        this.x = f2 == -1.0f ? 1.0f : f2;
        this.y = uu5.x;
        this.z = uu5.y;
        this.A = uu5.z;
        this.B = uu5.A;
        this.C = uu5.B;
        this.D = uu5.C;
        int i7 = uu5.D;
        this.E = i7 == -1 ? 0 : i7;
        int i8 = uu5.E;
        this.F = i8 != -1 ? i8 : i2;
        this.G = uu5.F;
        this.H = uu5.G;
        this.I = uu5.H;
        this.J = uu5.I;
        int i9 = uu5.J;
        if (i9 != 0 || xn4 == null) {
            this.K = i9;
        } else {
            this.K = 1;
        }
    }

    public static String e(xu5 xu5) {
        String str;
        String str2;
        int i2;
        if (xu5 == null) {
            return "null";
        }
        StringBuilder l2 = hr1.l("id=");
        l2.append(xu5.a);
        l2.append(", mimeType=");
        l2.append(xu5.n);
        String str3 = xu5.m;
        if (str3 != null) {
            l2.append(", container=");
            l2.append(str3);
        }
        int i3 = xu5.i;
        if (i3 != -1) {
            l2.append(", bitrate=");
            l2.append(i3);
        }
        String str4 = xu5.j;
        if (str4 != null) {
            l2.append(", codecs=");
            l2.append(str4);
        }
        xn4 xn4 = xu5.r;
        if (xn4 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < xn4.o; i4++) {
                UUID uuid = xn4.a[i4].b;
                if (uuid.equals(yu0.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(yu0.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(yu0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(yu0.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(yu0.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            l2.append(", drm=[");
            new o15(String.valueOf(','), 1).a(l2, linkedHashSet.iterator());
            l2.append(']');
        }
        int i5 = xu5.t;
        if (!(i5 == -1 || (i2 = xu5.u) == -1)) {
            l2.append(", res=");
            l2.append(i5);
            l2.append("x");
            l2.append(i2);
        }
        z23 z23 = xu5.A;
        if (z23 != null) {
            int i6 = z23.f;
            int i7 = z23.e;
            if (!(i7 == -1 || i6 == -1) || z23.e()) {
                l2.append(", color=");
                if (z23.e()) {
                    String c2 = z23.c(z23.a);
                    String b2 = z23.b(z23.b);
                    String d2 = z23.d(z23.c);
                    int i8 = oze.a;
                    Locale locale = Locale.US;
                    str = c2 + "/" + b2 + "/" + d2;
                } else {
                    str = "NA/NA/NA";
                }
                if (i7 == -1 || i6 == -1) {
                    str2 = "NA/NA";
                } else {
                    str2 = i7 + "/" + i6;
                }
                l2.append(str + "/" + str2);
            }
        }
        float f2 = xu5.v;
        if (f2 != -1.0f) {
            l2.append(", fps=");
            l2.append(f2);
        }
        int i9 = xu5.B;
        if (i9 != -1) {
            l2.append(", channels=");
            l2.append(i9);
        }
        int i10 = xu5.C;
        if (i10 != -1) {
            l2.append(", sample_rate=");
            l2.append(i10);
        }
        String str5 = xu5.d;
        if (str5 != null) {
            l2.append(", language=");
            l2.append(str5);
        }
        List list = xu5.c;
        if (!list.isEmpty()) {
            l2.append(", labels=[");
            new o15(String.valueOf(','), 1).a(l2, list.iterator());
            l2.append("]");
        }
        int i11 = xu5.e;
        if (i11 != 0) {
            l2.append(", selectionFlags=[");
            o15 o15 = new o15(String.valueOf(','), 1);
            int i12 = oze.a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            o15.a(l2, arrayList.iterator());
            l2.append("]");
        }
        int i13 = xu5.f;
        if (i13 != 0) {
            l2.append(", roleFlags=[");
            o15 o152 = new o15(String.valueOf(','), 1);
            int i14 = oze.a;
            ArrayList arrayList2 = new ArrayList();
            if ((1 & i13) != 0) {
                arrayList2.add("main");
            }
            if ((i13 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i13 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i13 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i13 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i13 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i13 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i13 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i13 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i13 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i13 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i13 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i13 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i13 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i13 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            o152.a(l2, arrayList2.iterator());
            l2.append("]");
        }
        Object obj = xu5.l;
        if (obj != null) {
            l2.append(", customData=");
            l2.append(obj);
        }
        return l2.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [uu5, java.lang.Object] */
    public final uu5 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        return obj;
    }

    public final int b() {
        int i2;
        int i3 = this.t;
        if (i3 == -1 || (i2 = this.u) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final boolean c(xu5 xu5) {
        List list = this.q;
        if (list.size() != xu5.q.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) xu5.q.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final Bundle d(boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString(N, this.a);
        bundle.putString(O, this.b);
        List<y87> list = this.c;
        ArrayList arrayList = new ArrayList(list.size());
        for (y87 y87 : list) {
            y87.getClass();
            Bundle bundle2 = new Bundle();
            String str = y87.a;
            if (str != null) {
                bundle2.putString(y87.c, str);
            }
            bundle2.putString(y87.d, y87.b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(t0, arrayList);
        bundle.putString(P, this.d);
        bundle.putInt(Q, this.e);
        bundle.putInt(R, this.f);
        bundle.putInt(S, this.g);
        bundle.putInt(T, this.h);
        bundle.putString(U, this.j);
        if (!z2) {
            bundle.putParcelable(V, this.k);
        }
        bundle.putString(W, this.m);
        bundle.putString(X, this.n);
        bundle.putInt(Y, this.o);
        int i2 = 0;
        while (true) {
            List list2 = this.q;
            if (i2 >= list2.size()) {
                break;
            }
            bundle.putByteArray(Z + "_" + Integer.toString(i2, 36), (byte[]) list2.get(i2));
            i2++;
        }
        bundle.putParcelable(a0, this.r);
        bundle.putLong(b0, this.s);
        bundle.putInt(c0, this.t);
        bundle.putInt(d0, this.u);
        bundle.putFloat(e0, this.v);
        bundle.putInt(f0, this.w);
        bundle.putFloat(g0, this.x);
        bundle.putByteArray(h0, this.y);
        bundle.putInt(i0, this.z);
        z23 z23 = this.A;
        if (z23 != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt(z23.j, z23.a);
            bundle3.putInt(z23.k, z23.b);
            bundle3.putInt(z23.l, z23.c);
            bundle3.putByteArray(z23.m, z23.d);
            bundle3.putInt(z23.n, z23.e);
            bundle3.putInt(z23.o, z23.f);
            bundle.putBundle(j0, bundle3);
        }
        bundle.putInt(k0, this.B);
        bundle.putInt(l0, this.C);
        bundle.putInt(m0, this.D);
        bundle.putInt(n0, this.E);
        bundle.putInt(o0, this.F);
        bundle.putInt(p0, this.G);
        bundle.putInt(r0, this.I);
        bundle.putInt(s0, this.J);
        bundle.putInt(q0, this.K);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || xu5.class != obj.getClass()) {
            return false;
        }
        xu5 xu5 = (xu5) obj;
        int i3 = this.L;
        if (i3 == 0 || (i2 = xu5.L) == 0 || i3 == i2) {
            return this.e == xu5.e && this.f == xu5.f && this.g == xu5.g && this.h == xu5.h && this.o == xu5.o && this.s == xu5.s && this.t == xu5.t && this.u == xu5.u && this.w == xu5.w && this.z == xu5.z && this.B == xu5.B && this.C == xu5.C && this.D == xu5.D && this.E == xu5.E && this.F == xu5.F && this.G == xu5.G && this.I == xu5.I && this.J == xu5.J && this.K == xu5.K && Float.compare(this.v, xu5.v) == 0 && Float.compare(this.x, xu5.x) == 0 && Objects.equals(this.a, xu5.a) && Objects.equals(this.b, xu5.b) && this.c.equals(xu5.c) && Objects.equals(this.j, xu5.j) && Objects.equals(this.m, xu5.m) && Objects.equals(this.n, xu5.n) && Objects.equals(this.d, xu5.d) && Arrays.equals(this.y, xu5.y) && Objects.equals(this.k, xu5.k) && Objects.equals(this.A, xu5.A) && Objects.equals(this.r, xu5.r) && c(xu5) && Objects.equals(this.l, xu5.l);
        }
        return false;
    }

    public final xu5 f(xu5 xu5) {
        String str;
        float f2;
        String str2;
        int i2;
        int i3;
        xu5 xu52 = xu5;
        if (this == xu52) {
            return this;
        }
        int g2 = c49.g(this.n);
        String str3 = xu52.a;
        String str4 = xu52.b;
        if (str4 == null) {
            str4 = this.b;
        }
        List list = xu52.c;
        if (list.isEmpty()) {
            list = this.c;
        }
        if (!(g2 == 3 || g2 == 1) || (str = xu52.d) == null) {
            str = this.d;
        }
        int i4 = this.g;
        if (i4 == -1) {
            i4 = xu52.g;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = xu52.h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String v2 = oze.v(g2, xu52.j);
            if (oze.e0(v2).length == 1) {
                str5 = v2;
            }
        }
        a39 a39 = xu52.k;
        a39 a392 = this.k;
        if (a392 != null) {
            a39 = a392.b(a39);
        }
        float f3 = this.v;
        if (f3 == -1.0f && g2 == 2) {
            f3 = xu52.v;
        }
        int i6 = this.e | xu52.e;
        int i7 = this.f | xu52.f;
        ArrayList arrayList = new ArrayList();
        xn4 xn4 = xu52.r;
        if (xn4 != null) {
            vn4[] vn4Arr = xn4.a;
            int length = vn4Arr.length;
            f2 = f3;
            int i8 = 0;
            while (i8 < length) {
                int i9 = length;
                vn4 vn4 = vn4Arr[i8];
                vn4[] vn4Arr2 = vn4Arr;
                if (vn4.X != null) {
                    arrayList.add(vn4);
                }
                i8++;
                length = i9;
                vn4Arr = vn4Arr2;
            }
            str2 = xn4.c;
        } else {
            f2 = f3;
            str2 = null;
        }
        xn4 xn42 = this.r;
        if (xn42 != null) {
            if (str2 == null) {
                str2 = xn42.c;
            }
            int size = arrayList.size();
            vn4[] vn4Arr3 = xn42.a;
            int length2 = vn4Arr3.length;
            int i10 = 0;
            while (true) {
                String str6 = str2;
                if (i10 >= length2) {
                    break;
                }
                vn4 vn42 = vn4Arr3[i10];
                vn4[] vn4Arr4 = vn4Arr3;
                if (vn42.X != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            i2 = size;
                            i3 = length2;
                            arrayList.add(vn42);
                            break;
                        }
                        i2 = size;
                        i3 = length2;
                        if (((vn4) arrayList.get(i11)).b.equals(vn42.b)) {
                            break;
                        }
                        i11++;
                        length2 = i3;
                        size = i2;
                    }
                } else {
                    i2 = size;
                    i3 = length2;
                }
                i10++;
                str2 = str6;
                vn4Arr3 = vn4Arr4;
                length2 = i3;
                size = i2;
            }
        }
        xn4 xn43 = arrayList.isEmpty() ? null : new xn4(str2, arrayList);
        uu5 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = ws6.j(list);
        a2.d = str;
        a2.e = i6;
        a2.f = i7;
        a2.g = i4;
        a2.h = i5;
        a2.i = str5;
        a2.j = a39;
        a2.q = xn43;
        a2.u = f2;
        xu5 xu53 = xu5;
        a2.H = xu53.I;
        a2.I = xu53.J;
        return new xu5(a2);
    }

    public final int hashCode() {
        if (this.L == 0) {
            int i2 = 0;
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            a39 a39 = this.k;
            int hashCode5 = (hashCode4 + (a39 == null ? 0 : a39.hashCode())) * 31;
            Object obj = this.l;
            int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.m;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.L = ((((((((((((((((((((Float.floatToIntBits(this.x) + ((((Float.floatToIntBits(this.v) + ((((((((((hashCode7 + i2) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.t) * 31) + this.u) * 31)) * 31) + this.w) * 31)) * 31) + this.z) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K;
        }
        return this.L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.A);
        sb.append("], [");
        sb.append(this.B);
        sb.append(", ");
        return wn6.j(sb, this.C, "])");
    }
}
