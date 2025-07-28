package defpackage;

/* renamed from: x18  reason: default package */
public abstract class x18 extends xx2 {
    public final long y0;

    public x18(oz3 oz3, xz3 xz3, vu5 vu5, int i, Object obj, long j, long j2, long j3) {
        super(oz3, xz3, 1, vu5, i, obj, j, j2);
        vu5.getClass();
        this.y0 = j3;
    }

    public long b() {
        long j = this.y0;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    public abstract boolean c();
}
