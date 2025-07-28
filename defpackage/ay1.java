package defpackage;

/* renamed from: ay1  reason: default package */
public final class ay1 extends n1e implements Comparable {
    public long z0;

    public final int compareTo(Object obj) {
        ay1 ay1 = (ay1) obj;
        if (f(4) == ay1.f(4)) {
            long j = this.Y - ay1.Y;
            if (j == 0) {
                j = this.z0 - ay1.z0;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!f(4)) {
            return -1;
        }
        return 1;
    }
}
