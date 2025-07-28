package defpackage;

/* renamed from: y18  reason: default package */
public abstract class y18 extends zx2 {
    public final long y0;

    public y18(qz3 qz3, yz3 yz3, xu5 xu5, int i, Object obj, long j, long j2, long j3) {
        super(qz3, yz3, 1, xu5, i, obj, j, j2);
        xu5.getClass();
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
