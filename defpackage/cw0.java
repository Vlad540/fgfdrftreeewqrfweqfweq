package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: cw0  reason: default package */
public final class cw0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public y54 e;

    public cw0(int i, String str, y54 y54) {
        this.a = i;
        this.b = str;
        this.e = y54;
    }

    public final ogd a(long j, long j2) {
        vv0 vv0 = new vv0(this.b, j, -1, -9223372036854775807L, (File) null);
        TreeSet treeSet = this.c;
        ogd ogd = (ogd) treeSet.floor(vv0);
        if (ogd != null && ogd.b + ogd.c > j) {
            return ogd;
        }
        ogd ogd2 = (ogd) treeSet.ceiling(vv0);
        if (ogd2 != null) {
            long j3 = ogd2.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new vv0(this.b, j, j2, -9223372036854775807L, (File) null);
    }

    public final boolean b(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            aw0 aw0 = (aw0) arrayList.get(i);
            long j3 = aw0.b;
            int i2 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
            long j4 = aw0.a;
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
        if (obj == null || cw0.class != obj.getClass()) {
            return false;
        }
        cw0 cw0 = (cw0) obj;
        return this.a == cw0.a && this.b.equals(cw0.b) && this.c.equals(cw0.c) && this.e.equals(cw0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + me4.d(this.a * 31, 31, this.b);
    }
}
