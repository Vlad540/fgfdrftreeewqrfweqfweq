package defpackage;

import java.util.ArrayList;

/* renamed from: hic  reason: default package */
public final class hic {
    public lrf a;
    public ArrayList b;

    public static long a(se4 se4, long j) {
        lrf lrf = se4.d;
        if (lrf instanceof pf6) {
            return j;
        }
        ArrayList arrayList = se4.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            pe4 pe4 = (pe4) arrayList.get(i);
            if (pe4 instanceof se4) {
                se4 se42 = (se4) pe4;
                if (se42.d != lrf) {
                    j2 = Math.min(j2, a(se42, ((long) se42.f) + j));
                }
            }
        }
        if (se4 != lrf.i) {
            return j2;
        }
        long j3 = lrf.j();
        se4 se43 = lrf.h;
        long j4 = j - j3;
        return Math.min(Math.min(j2, a(se43, j4)), j4 - ((long) se43.f));
    }

    public static long b(se4 se4, long j) {
        lrf lrf = se4.d;
        if (lrf instanceof pf6) {
            return j;
        }
        ArrayList arrayList = se4.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            pe4 pe4 = (pe4) arrayList.get(i);
            if (pe4 instanceof se4) {
                se4 se42 = (se4) pe4;
                if (se42.d != lrf) {
                    j2 = Math.max(j2, b(se42, ((long) se42.f) + j));
                }
            }
        }
        if (se4 != lrf.h) {
            return j2;
        }
        long j3 = lrf.j();
        se4 se43 = lrf.i;
        long j4 = j + j3;
        return Math.max(Math.max(j2, b(se43, j4)), j4 - ((long) se43.f));
    }
}
