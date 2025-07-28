package defpackage;

/* renamed from: xu0  reason: default package */
public final class xu0 {
    public boolean a;
    public long b;
    public long c;

    public synchronized long a() {
        return this.b;
    }

    public synchronized void b(long j, long j2) {
        if (this.a) {
            this.b += j;
            this.c += j2;
        }
    }
}
