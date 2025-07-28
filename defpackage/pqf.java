package defpackage;

/* renamed from: pqf  reason: default package */
public final class pqf implements Comparable {
    public final int a;
    public final hqf b;

    public pqf(int i, hqf hqf) {
        this.a = i;
        this.b = hqf;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((pqf) obj).a);
    }
}
