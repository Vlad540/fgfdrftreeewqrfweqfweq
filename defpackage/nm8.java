package defpackage;

import java.util.ArrayList;

/* renamed from: nm8  reason: default package */
public final class nm8 implements ww3 {
    public static final n93 b;
    public final ArrayList a = new ArrayList();

    static {
        og9 og9 = og9.a;
        be8 be8 = new be8(7);
        og9.getClass();
        lu0 lu0 = new lu0(be8, og9);
        xcc xcc = xcc.a;
        be8 be82 = new be8(8);
        xcc.getClass();
        b = new n93(lu0, new lu0(be82, xcc));
    }

    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((xw3) arrayList.get(i)).b;
            long j4 = ((xw3) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    public final boolean b(xw3 xw3, long j) {
        long j2 = xw3.b;
        oyb.d(j2 != -9223372036854775807L);
        oyb.d(xw3.c != -9223372036854775807L);
        boolean z = j2 <= j && j < xw3.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((xw3) arrayList.get(size)).b) {
                arrayList.add(size + 1, xw3);
                return z;
            }
        }
        arrayList.add(0, xw3);
        return z;
    }

    public final ws6 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((xw3) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    xw3 xw3 = (xw3) arrayList.get(i);
                    if (j >= xw3.b && j < xw3.d) {
                        arrayList2.add(xw3);
                    }
                    if (j < xw3.b) {
                        break;
                    }
                }
                e8c r = ws6.r(b, arrayList2);
                ts6 i2 = ws6.i();
                for (int i3 = 0; i3 < r.size(); i3++) {
                    i2.f(((xw3) r.get(i3)).a);
                }
                return i2.j();
            }
        }
        return ws6.m();
    }

    public final void clear() {
        this.a.clear();
    }

    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((xw3) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((xw3) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((xw3) arrayList.get(i)).b;
            long j4 = ((xw3) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                int i2 = (j > ((xw3) arrayList.get(i)).b ? 1 : (j == ((xw3) arrayList.get(i)).b ? 0 : -1));
                if (i2 > 0 && j > ((xw3) arrayList.get(i)).d) {
                    arrayList.remove(i);
                    i--;
                } else if (i2 < 0) {
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
