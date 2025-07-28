package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: mpe  reason: default package */
public class mpe {
    public static final mpe C = new mpe(new kpe());
    public static final String D = Integer.toString(1, 36);
    public static final String E = Integer.toString(2, 36);
    public static final String F = Integer.toString(3, 36);
    public static final String G = Integer.toString(4, 36);
    public static final String H = Integer.toString(5, 36);
    public static final String I = Integer.toString(6, 36);
    public static final String J = Integer.toString(7, 36);
    public static final String K = Integer.toString(8, 36);
    public static final String L = Integer.toString(9, 36);
    public static final String M = Integer.toString(10, 36);
    public static final String N = Integer.toString(11, 36);
    public static final String O = Integer.toString(12, 36);
    public static final String P = Integer.toString(13, 36);
    public static final String Q = Integer.toString(14, 36);
    public static final String R = Integer.toString(15, 36);
    public static final String S = Integer.toString(16, 36);
    public static final String T = Integer.toString(17, 36);
    public static final String U = Integer.toString(18, 36);
    public static final String V = Integer.toString(19, 36);
    public static final String W = Integer.toString(20, 36);
    public static final String X = Integer.toString(21, 36);
    public static final String Y = Integer.toString(22, 36);
    public static final String Z = Integer.toString(23, 36);
    public static final String a0 = Integer.toString(24, 36);
    public static final String b0 = Integer.toString(25, 36);
    public static final String c0 = Integer.toString(26, 36);
    public static final String d0 = Integer.toString(27, 36);
    public static final String e0 = Integer.toString(28, 36);
    public static final String f0 = Integer.toString(29, 36);
    public static final String g0 = Integer.toString(30, 36);
    public static final String h0 = Integer.toString(31, 36);
    public final zs6 A;
    public final gt6 B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final ws6 l;
    public final int m;
    public final ws6 n;
    public final int o;
    public final int p;
    public final int q;
    public final ws6 r;
    public final ipe s;
    public final ws6 t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        int i2 = oze.a;
    }

    public mpe(kpe kpe) {
        this.a = kpe.a;
        this.b = kpe.b;
        this.c = kpe.c;
        this.d = kpe.d;
        this.e = kpe.e;
        this.f = kpe.f;
        this.g = kpe.g;
        this.h = kpe.h;
        this.i = kpe.i;
        this.j = kpe.j;
        this.k = kpe.k;
        this.l = kpe.l;
        this.m = kpe.m;
        this.n = kpe.n;
        this.o = kpe.o;
        this.p = kpe.p;
        this.q = kpe.q;
        this.r = kpe.r;
        this.s = kpe.s;
        this.t = kpe.t;
        this.u = kpe.u;
        this.v = kpe.v;
        this.w = kpe.w;
        this.x = kpe.x;
        this.y = kpe.y;
        this.z = kpe.z;
        this.A = zs6.b(kpe.A);
        this.B = gt6.j(kpe.B);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kpe, java.lang.Object] */
    public static mpe b(Bundle bundle) {
        ipe ipe;
        e8c e8c;
        ? obj = new Object();
        mpe mpe = C;
        obj.a = bundle.getInt(I, mpe.a);
        obj.b = bundle.getInt(J, mpe.b);
        obj.c = bundle.getInt(K, mpe.c);
        obj.d = bundle.getInt(L, mpe.d);
        obj.e = bundle.getInt(M, mpe.e);
        obj.f = bundle.getInt(N, mpe.f);
        obj.g = bundle.getInt(O, mpe.g);
        obj.h = bundle.getInt(P, mpe.h);
        obj.i = bundle.getInt(Q, mpe.i);
        obj.j = bundle.getInt(R, mpe.j);
        obj.k = bundle.getBoolean(S, mpe.k);
        String[] stringArray = bundle.getStringArray(T);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        obj.l = ws6.k(stringArray);
        obj.m = bundle.getInt(b0, mpe.m);
        String[] stringArray2 = bundle.getStringArray(D);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        obj.n = kpe.e(stringArray2);
        obj.o = bundle.getInt(E, mpe.o);
        obj.p = bundle.getInt(U, mpe.p);
        obj.q = bundle.getInt(V, mpe.q);
        String[] stringArray3 = bundle.getStringArray(W);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        obj.r = ws6.k(stringArray3);
        Bundle bundle2 = bundle.getBundle(g0);
        if (bundle2 != null) {
            me9 me9 = new me9();
            ipe ipe2 = ipe.d;
            me9.a = bundle2.getInt(ipe.e, ipe2.a);
            me9.b = bundle2.getBoolean(ipe.f, ipe2.b);
            me9.c = bundle2.getBoolean(ipe.g, ipe2.c);
            ipe = new ipe(me9);
        } else {
            me9 me92 = new me9();
            ipe ipe3 = ipe.d;
            me92.a = bundle.getInt(d0, ipe3.a);
            me92.b = bundle.getBoolean(e0, ipe3.b);
            me92.c = bundle.getBoolean(f0, ipe3.c);
            ipe = new ipe(me92);
        }
        obj.s = ipe;
        String[] stringArray4 = bundle.getStringArray(F);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        obj.t = kpe.e(stringArray4);
        obj.u = bundle.getInt(G, mpe.u);
        obj.v = bundle.getInt(c0, mpe.v);
        obj.w = bundle.getBoolean(H, mpe.w);
        obj.x = bundle.getBoolean(h0, mpe.x);
        obj.y = bundle.getBoolean(X, mpe.y);
        obj.z = bundle.getBoolean(Y, mpe.z);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Z);
        if (parcelableArrayList == null) {
            e8c = e8c.X;
        } else {
            ts6 i2 = ws6.i();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i3);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(fpe.c);
                bundle4.getClass();
                uoe b2 = uoe.b(bundle4);
                int[] intArray = bundle3.getIntArray(fpe.d);
                intArray.getClass();
                i2.a(new fpe(b2, xie.f(intArray)));
            }
            e8c = i2.j();
        }
        obj.A = new HashMap();
        for (int i4 = 0; i4 < e8c.o; i4++) {
            fpe fpe = (fpe) e8c.get(i4);
            obj.A.put(fpe.a, fpe);
        }
        int[] intArray2 = bundle.getIntArray(a0);
        int[] iArr = new int[0];
        if (intArray2 == null) {
            intArray2 = iArr;
        }
        obj.B = new HashSet();
        for (int valueOf : intArray2) {
            obj.B.add(Integer.valueOf(valueOf));
        }
        return new mpe(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kpe, java.lang.Object] */
    public kpe a() {
        ? obj = new Object();
        obj.d(this);
        return obj;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(I, this.a);
        bundle.putInt(J, this.b);
        bundle.putInt(K, this.c);
        bundle.putInt(L, this.d);
        bundle.putInt(M, this.e);
        bundle.putInt(N, this.f);
        bundle.putInt(O, this.g);
        bundle.putInt(P, this.h);
        bundle.putInt(Q, this.i);
        bundle.putInt(R, this.j);
        bundle.putBoolean(S, this.k);
        ws6 ws6 = this.l;
        bundle.putStringArray(T, (String[]) ws6.toArray(new String[0]));
        bundle.putInt(b0, this.m);
        bundle.putStringArray(D, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(E, this.o);
        bundle.putInt(U, this.p);
        bundle.putInt(V, this.q);
        bundle.putStringArray(W, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(F, (String[]) this.t.toArray(new String[0]));
        bundle.putInt(G, this.u);
        bundle.putInt(c0, this.v);
        bundle.putBoolean(H, this.w);
        ipe ipe = this.s;
        bundle.putInt(d0, ipe.a);
        bundle.putBoolean(e0, ipe.b);
        bundle.putBoolean(f0, ipe.c);
        ipe.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(ipe.e, ipe.a);
        bundle2.putBoolean(ipe.f, ipe.b);
        bundle2.putBoolean(ipe.g, ipe.c);
        bundle.putBundle(g0, bundle2);
        bundle.putBoolean(h0, this.x);
        bundle.putBoolean(X, this.y);
        bundle.putBoolean(Y, this.z);
        bundle.putParcelableArrayList(Z, gt0.M(this.A.values(), new kce(22)));
        bundle.putIntArray(a0, xie.H(this.B));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mpe mpe = (mpe) obj;
        if (this.a == mpe.a && this.b == mpe.b && this.c == mpe.c && this.d == mpe.d && this.e == mpe.e && this.f == mpe.f && this.g == mpe.g && this.h == mpe.h && this.k == mpe.k && this.i == mpe.i && this.j == mpe.j && this.l.equals(mpe.l) && this.m == mpe.m && this.n.equals(mpe.n) && this.o == mpe.o && this.p == mpe.p && this.q == mpe.q && this.r.equals(mpe.r) && this.s.equals(mpe.s) && this.t.equals(mpe.t) && this.u == mpe.u && this.v == mpe.v && this.w == mpe.w && this.x == mpe.x && this.y == mpe.y && this.z == mpe.z) {
            zs6 zs6 = this.A;
            zs6.getClass();
            if (ct0.j(zs6, mpe.A) && this.B.equals(mpe.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.l.hashCode();
        int hashCode2 = this.n.hashCode();
        int hashCode3 = this.r.hashCode();
        int hashCode4 = this.s.hashCode();
        int hashCode5 = this.t.hashCode();
        int hashCode6 = this.A.hashCode();
        return this.B.hashCode() + ((hashCode6 + ((((((((((((((hashCode5 + ((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31)) * 31) + this.m) * 31)) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31)) * 31)) * 31)) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31)) * 31);
    }
}
