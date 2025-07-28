package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: kpe  reason: default package */
public class kpe {
    public HashMap A;
    public HashSet B;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public ws6 l;
    public int m;
    public ws6 n;
    public int o;
    public int p;
    public int q;
    public ws6 r;
    public ipe s;
    public ws6 t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public kpe() {
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        this.l = e8c;
        this.m = 0;
        this.n = e8c;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = e8c;
        this.s = ipe.d;
        this.t = e8c;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = new HashMap();
        this.B = new HashSet();
    }

    public static e8c e(String[] strArr) {
        ts6 i2 = ws6.i();
        for (String str : strArr) {
            str.getClass();
            i2.a(oze.T(str));
        }
        return i2.j();
    }

    public void a(fpe fpe) {
        this.A.put(fpe.a, fpe);
    }

    public mpe b() {
        return new mpe(this);
    }

    public kpe c() {
        this.A.clear();
        return this;
    }

    public final void d(mpe mpe) {
        this.a = mpe.a;
        this.b = mpe.b;
        this.c = mpe.c;
        this.d = mpe.d;
        this.e = mpe.e;
        this.f = mpe.f;
        this.g = mpe.g;
        this.h = mpe.h;
        this.i = mpe.i;
        this.j = mpe.j;
        this.k = mpe.k;
        this.l = mpe.l;
        this.m = mpe.m;
        this.n = mpe.n;
        this.o = mpe.o;
        this.p = mpe.p;
        this.q = mpe.q;
        this.r = mpe.r;
        this.s = mpe.s;
        this.t = mpe.t;
        this.u = mpe.u;
        this.v = mpe.v;
        this.w = mpe.w;
        this.x = mpe.x;
        this.y = mpe.y;
        this.z = mpe.z;
        this.B = new HashSet(mpe.B);
        this.A = new HashMap(mpe.A);
    }

    public kpe f(int i2, int i3) {
        this.i = i2;
        this.j = i3;
        this.k = true;
        return this;
    }
}
