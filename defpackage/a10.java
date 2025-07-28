package defpackage;

import java.io.Serializable;

/* renamed from: a10  reason: default package */
public final class a10 implements Serializable {
    public static final a10 A0 = new Object().a();
    public final boolean X;
    public final byte[] Y;
    public final String Z;
    public final String a;
    public final String b;
    public final int c;
    public final int o;
    public final long w0;
    public final String x0;
    public final String y0;
    public final String z0;

    public a10(z00 z00) {
        this.a = z00.a;
        this.b = z00.b;
        this.c = z00.c;
        this.o = z00.d;
        this.X = z00.e;
        this.Y = z00.f;
        this.Z = z00.g;
        this.w0 = z00.h;
        this.x0 = z00.i;
        this.y0 = z00.j;
        this.z0 = z00.k;
    }

    public final String a() {
        String str = this.b;
        if (!r1g.p(str)) {
            return str;
        }
        String str2 = this.a;
        if (!r1g.p(str2)) {
            return vx3.t(str2, fj0.X, ej0.b);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, z00] */
    public final z00 b() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.o;
        obj.e = this.X;
        obj.f = this.Y;
        obj.g = this.Z;
        obj.h = this.w0;
        obj.i = this.x0;
        obj.j = this.y0;
        obj.k = this.z0;
        return obj;
    }
}
