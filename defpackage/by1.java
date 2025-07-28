package defpackage;

/* renamed from: by1  reason: default package */
public final class by1 extends o1e implements Comparable {
    public long A0;

    public final int compareTo(Object obj) {
        by1 by1 = (by1) obj;
        if (f(4) == by1.f(4)) {
            long j = this.Z - by1.Z;
            if (j == 0) {
                j = this.A0 - by1.A0;
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
