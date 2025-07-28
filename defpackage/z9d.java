package defpackage;

/* renamed from: z9d  reason: default package */
public final class z9d implements Comparable {
    public static final z9d X = new z9d("WARNING", 5000);
    public static final z9d Y = new z9d("NOTICE", 4000);
    public static final z9d Z = new z9d("INFO", 3000);
    public static final z9d c = new z9d("FATAL", 9000);
    public static final z9d o = new z9d("ERROR", 6000);
    public static final z9d w0 = new z9d("DEBUG", 2000);
    public final String a;
    public final int b;

    public z9d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int compareTo(Object obj) {
        return hhd.o(this.b, ((z9d) obj).b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
