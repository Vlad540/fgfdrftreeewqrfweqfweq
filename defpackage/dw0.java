package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: dw0  reason: default package */
public final class dw0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public z54 e;

    public dw0(int i, String str, z54 z54) {
        this.a = i;
        this.b = str;
        this.e = z54;
    }

    public final long a(long j, long j2) {
        oyb.d(j >= 0);
        oyb.d(j2 >= 0);
        pgd b2 = b(j, j2);
        boolean z = true ^ b2.o;
        long j3 = Long.MAX_VALUE;
        long j4 = b2.c;
        if (z) {
            if (j4 != -1) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = b2.b + j4;
        if (j6 < j3) {
            for (pgd pgd : this.c.tailSet(b2, false)) {
                long j7 = pgd.b;
                if (j7 <= j6) {
                    j6 = Math.max(j6, j7 + pgd.c);
                    if (j6 >= j3) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final pgd b(long j, long j2) {
        wv0 wv0 = new wv0(this.b, j, -1, -9223372036854775807L, (File) null);
        TreeSet treeSet = this.c;
        pgd pgd = (pgd) treeSet.floor(wv0);
        if (pgd != null && pgd.b + pgd.c > j) {
            return pgd;
        }
        pgd pgd2 = (pgd) treeSet.ceiling(wv0);
        if (pgd2 != null) {
            long j3 = pgd2.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new wv0(this.b, j, j2, -9223372036854775807L, (File) null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            bw0 bw0 = (bw0) arrayList.get(i);
            long j3 = bw0.b;
            int i2 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
            long j4 = bw0.a;
            if (i2 == 0) {
                if (j >= j4) {
                    return true;
                }
            } else if (j2 != -1 && j4 <= j && j + j2 <= j4 + j3) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dw0.class != obj.getClass()) {
            return false;
        }
        dw0 dw0 = (dw0) obj;
        return this.a == dw0.a && this.b.equals(dw0.b) && this.c.equals(dw0.c) && this.e.equals(dw0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + me4.d(this.a * 31, 31, this.b);
    }
}
