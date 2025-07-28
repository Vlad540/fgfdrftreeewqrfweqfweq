package defpackage;

/* renamed from: xtc  reason: default package */
public final class xtc {
    public static final xtc c;
    public final long a;
    public final long b;

    static {
        xtc xtc = new xtc(0, 0);
        new xtc(Long.MAX_VALUE, Long.MAX_VALUE);
        new xtc(Long.MAX_VALUE, 0);
        new xtc(0, Long.MAX_VALUE);
        c = xtc;
    }

    public xtc(long j, long j2) {
        boolean z = false;
        oyb.d(j >= 0);
        oyb.d(j2 >= 0 ? true : z);
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
        int i2 = oze.a;
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
        if (obj == null || xtc.class != obj.getClass()) {
            return false;
        }
        xtc xtc = (xtc) obj;
        return this.a == xtc.a && this.b == xtc.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
