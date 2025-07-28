package defpackage;

/* renamed from: s58  reason: default package */
public abstract class s58 implements lt0 {
    public static final x48 Y = new x48(2);
    public final boolean X;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean o;

    static {
        new r58().b();
    }

    public s58(r58 r58) {
        this.a = r58.a;
        this.b = r58.b;
        this.c = r58.c;
        this.o = r58.d;
        this.X = r58.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s58)) {
            return false;
        }
        s58 s58 = (s58) obj;
        return this.a == s58.a && this.b == s58.b && this.c == s58.c && this.o == s58.o && this.X == s58.X;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.X ? 1 : 0);
    }
}
