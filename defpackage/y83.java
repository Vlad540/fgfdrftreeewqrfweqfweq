package defpackage;

import java.util.List;

/* renamed from: y83  reason: default package */
public final class y83 implements kyc {
    public final e8c a;
    public long b;

    public y83(List list, List list2) {
        ts6 i = ws6.i();
        oyb.d(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            i.a(new x83((kyc) list.get(i2), (List) list2.get(i2)));
        }
        this.a = i.j();
        this.b = -9223372036854775807L;
    }

    public final boolean b() {
        int i = 0;
        while (true) {
            e8c e8c = this.a;
            if (i >= e8c.size()) {
                return false;
            }
            if (((x83) e8c.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    public final long f() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            e8c e8c = this.a;
            if (i >= e8c.size()) {
                break;
            }
            long f = ((x83) e8c.get(i)).f();
            if (f != Long.MIN_VALUE) {
                j = Math.min(j, f);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean m(qj7 qj7) {
        boolean z;
        boolean z2 = false;
        do {
            long f = f();
            if (f == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                e8c e8c = this.a;
                if (i >= e8c.size()) {
                    break;
                }
                long f2 = ((x83) e8c.get(i)).f();
                boolean z3 = f2 != Long.MIN_VALUE && f2 <= qj7.a;
                if (f2 == f || z3) {
                    z |= ((x83) e8c.get(i)).m(qj7);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long r() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            e8c e8c = this.a;
            if (i >= e8c.size()) {
                break;
            }
            x83 x83 = (x83) e8c.get(i);
            long r = x83.r();
            if ((x83.a().contains(1) || x83.a().contains(2) || x83.a().contains(4)) && r != Long.MIN_VALUE) {
                j = Math.min(j, r);
            }
            if (r != Long.MIN_VALUE) {
                j2 = Math.min(j2, r);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        } else if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.b;
            return j3 != -9223372036854775807L ? j3 : j2;
        }
    }

    public final void u(long j) {
        int i = 0;
        while (true) {
            e8c e8c = this.a;
            if (i < e8c.size()) {
                ((x83) e8c.get(i)).u(j);
                i++;
            } else {
                return;
            }
        }
    }
}
