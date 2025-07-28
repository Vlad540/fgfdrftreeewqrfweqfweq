package defpackage;

/* renamed from: sn7  reason: default package */
public final class sn7 implements Comparable {
    public static final sn7 X = new sn7(z9d.Y);
    public static final sn7 Y = new sn7(z9d.Z);
    public static final sn7 Z = new sn7(z9d.w0);
    public static final sn7 b = new sn7(z9d.c);
    public static final sn7 c = new sn7(z9d.o);
    public static final sn7 o = new sn7(z9d.X);
    public final z9d a;

    public sn7(z9d z9d) {
        this.a = z9d;
    }

    public final int compareTo(Object obj) {
        return hhd.o(this.a.b, ((sn7) obj).a.b);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a;
    }
}
