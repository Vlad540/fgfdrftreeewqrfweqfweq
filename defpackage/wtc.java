package defpackage;

/* renamed from: wtc  reason: default package */
public final class wtc {
    public static final wtc c;
    public final long a;
    public final long b;

    static {
        wtc wtc = new wtc(0, 0);
        new wtc(Long.MAX_VALUE, Long.MAX_VALUE);
        new wtc(Long.MAX_VALUE, 0);
        new wtc(0, Long.MAX_VALUE);
        c = wtc;
    }

    public wtc(long j, long j2) {
        boolean z = false;
        swb.e(j >= 0);
        swb.e(j2 >= 0 ? true : z);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        long j5 = this.b;
        if (i == 0 && j5 == 0) {
            return j;
        }
        int i2 = mze.a;
        long j6 = j - j4;
        if (((j ^ j4) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : j6 : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wtc.class != obj.getClass()) {
            return false;
        }
        wtc wtc = (wtc) obj;
        return this.a == wtc.a && this.b == wtc.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
