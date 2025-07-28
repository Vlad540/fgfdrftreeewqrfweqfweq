package defpackage;

/* renamed from: oqf  reason: default package */
public final class oqf implements Comparable {
    public final int a;
    public final gqf b;

    public oqf(int i, gqf gqf) {
        this.a = i;
        this.b = gqf;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((oqf) obj).a);
    }
}
