package defpackage;

import java.io.Closeable;

/* renamed from: xbc  reason: default package */
public final class xbc implements Closeable {
    public final long A0;
    public final pd B0;
    public final be6 X;
    public final ye6 Y;
    public final f1c Z;
    public final lac a;
    public final vhb b;
    public final String c;
    public final int o;
    public final xbc w0;
    public final xbc x0;
    public final xbc y0;
    public final long z0;

    public xbc(lac lac, vhb vhb, String str, int i, be6 be6, ye6 ye6, f1c f1c, xbc xbc, xbc xbc2, xbc xbc3, long j, long j2, pd pdVar) {
        this.a = lac;
        this.b = vhb;
        this.c = str;
        this.o = i;
        this.X = be6;
        this.Y = ye6;
        this.Z = f1c;
        this.w0 = xbc;
        this.x0 = xbc2;
        this.y0 = xbc3;
        this.z0 = j;
        this.A0 = j2;
        this.B0 = pdVar;
    }

    public static String a(xbc xbc, String str) {
        String a2 = xbc.Y.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public final void close() {
        f1c f1c = this.Z;
        if (f1c != null) {
            f1c.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean m() {
        int i = this.o;
        return 200 <= i && 299 >= i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [wbc, java.lang.Object] */
    public final wbc n() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.o;
        obj.d = this.c;
        obj.e = this.X;
        obj.f = this.Y.c();
        obj.g = this.Z;
        obj.h = this.w0;
        obj.i = this.x0;
        obj.j = this.y0;
        obj.k = this.z0;
        obj.l = this.A0;
        obj.m = this.B0;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.o + ", message=" + this.c + ", url=" + this.a.b + '}';
    }
}
