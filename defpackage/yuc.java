package defpackage;

/* renamed from: yuc  reason: default package */
public final class yuc implements Comparable {
    public final long a;
    public final yz3 b;

    public yuc(long j, yz3 yz3) {
        this.a = j;
        this.b = yz3;
    }

    public final int compareTo(Object obj) {
        long j = ((yuc) obj).a;
        int i = oze.a;
        int i2 = (this.a > j ? 1 : (this.a == j ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }
}
