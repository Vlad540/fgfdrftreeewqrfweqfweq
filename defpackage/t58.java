package defpackage;

/* renamed from: t58  reason: default package */
public class t58 {
    public static final t58 h = new r58().a();
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public t58(r58 r58) {
        this.a = oze.h0(r58.a);
        this.c = oze.h0(r58.b);
        this.b = r58.a;
        this.d = r58.b;
        this.e = r58.c;
        this.f = r58.d;
        this.g = r58.e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r58, java.lang.Object] */
    public final r58 a() {
        ? obj = new Object();
        obj.a = this.b;
        obj.b = this.d;
        obj.c = this.e;
        obj.d = this.f;
        obj.e = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t58)) {
            return false;
        }
        t58 t58 = (t58) obj;
        return this.b == t58.b && this.d == t58.d && this.e == t58.e && this.f == t58.f && this.g == t58.g;
    }

    public final int hashCode() {
        long j2 = this.b;
        long j3 = this.d;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
