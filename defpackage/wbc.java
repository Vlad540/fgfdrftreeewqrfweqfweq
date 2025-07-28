package defpackage;

/* renamed from: wbc  reason: default package */
public final class wbc {
    public lac a;
    public vhb b;
    public int c = -1;
    public String d;
    public be6 e;
    public xe6 f = new xe6(0);
    public f1c g;
    public xbc h;
    public xbc i;
    public xbc j;
    public long k;
    public long l;
    public pd m;

    public static void b(xbc xbc, String str) {
        if (xbc == null) {
            return;
        }
        if (xbc.Z != null) {
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        } else if (xbc.w0 != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
        } else if (xbc.x0 != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
        } else if (xbc.y0 != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
        }
    }

    public final xbc a() {
        int i2 = this.c;
        if (i2 >= 0) {
            lac lac = this.a;
            if (lac != null) {
                vhb vhb = this.b;
                if (vhb != null) {
                    String str = this.d;
                    if (str != null) {
                        return new xbc(lac, vhb, str, i2, this.e, this.f.h(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.c).toString());
    }
}
