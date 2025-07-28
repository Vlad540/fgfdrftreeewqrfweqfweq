package defpackage;

/* renamed from: o2c  reason: default package */
public final class o2c implements Comparable {
    public final i22 a;
    public final tf3 b;

    public o2c(i22 i22, tf3 tf3) {
        this.a = i22;
        this.b = tf3;
    }

    public final int compareTo(Object obj) {
        o2c o2c = (o2c) obj;
        i22 i22 = this.a;
        long j = i22 != null ? i22.b.Y : this.b.a.c.r;
        i22 i222 = o2c.a;
        return pfa.f(i222 != null ? i222.b.Y : o2c.b.a.c.r, j);
    }
}
