package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import java.io.File;
import java.util.Locale;

/* renamed from: wce  reason: default package */
public class wce {
    public static final r7e a0 = new r7e(new opd(19));
    public static the b0;
    public static final grd c0;
    public static final t0c d0;
    public final int A;
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
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final Integer V;
    public final Integer W;
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final k33 f;
    public final dr0 g;
    public final dr0 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        grd a2 = hrd.a((Object) null);
        c0 = a2;
        d0 = new t0c(a2);
    }

    public wce(String str, String str2, boolean z2, int i2, String str3, k33 k33, dr0 dr0, dr0 dr02) {
        this.a = str;
        this.b = str2;
        this.c = z2;
        this.d = i2;
        this.e = str3;
        this.f = k33;
        this.g = dr0;
        this.h = dr02;
        int i3 = k33.v;
        this.i = n1g.c0(i3, 0.15f);
        this.j = z2 ? ovb.darkPopup : ovb.defaultPopup;
        this.k = k33.a;
        this.l = k33.b;
        this.m = k33.c;
        this.n = k33.e;
        this.o = k33.f;
        this.p = k33.Q;
        this.q = k33.R;
        this.r = k33.S;
        this.s = k33.h;
        this.t = k33.j;
        this.u = k33.k;
        this.v = k33.l;
        this.w = k33.m;
        this.x = k33.n;
        this.y = k33.o;
        this.z = k33.p;
        this.A = k33.q;
        this.B = k33.r;
        this.C = k33.s;
        this.D = k33.t;
        this.E = k33.u;
        this.F = i3;
        this.G = k33.w;
        this.H = k33.x;
        this.I = k33.y;
        this.J = k33.z;
        this.K = k33.A;
        this.L = k33.B;
        this.M = k33.C;
        this.N = k33.D;
        this.O = k33.E;
        this.P = k33.F;
        this.Q = k33.G;
        this.R = k33.H;
        this.S = k33.I;
        this.T = k33.J;
        this.U = k33.K;
        this.V = k33.L;
        this.W = k33.M;
        this.X = k33.N;
        this.Y = k33.O;
        this.Z = k33.P;
    }

    public static final boolean b(String str, boolean z2) {
        File file = new File(str);
        if (z2 && !file.isFile()) {
            return false;
        }
        if (!z2 || file.exists()) {
            return file.getName().toLowerCase(Locale.getDefault()).endsWith(".ttstyle");
        }
        return false;
    }

    public final RippleDrawable a() {
        return new RippleDrawable(ColorStateList.valueOf(this.i), (Drawable) null, (Drawable) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wce)) {
            return false;
        }
        wce wce = (wce) obj;
        if (hhd.f(this.a, wce.a) && hhd.f(this.b, wce.b) && this.c == wce.c && this.d == wce.d && hhd.f(this.e, wce.e)) {
            return hhd.f(this.f, wce.f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + me4.d((th2.f(me4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e);
    }
}
