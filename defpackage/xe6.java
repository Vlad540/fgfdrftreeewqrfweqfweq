package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xe6  reason: default package */
public final class xe6 implements ww3 {
    public final ArrayList a;

    public xe6(List list) {
        this.a = new ArrayList(list);
    }

    public static void o(xe6 xe6) {
        ArrayList arrayList = new ArrayList();
        Iterator it = xe6.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((zkb) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    public long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((xw3) arrayList.get(0)).b) {
            return ((xw3) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            xw3 xw3 = (xw3) arrayList.get(i);
            if (j < xw3.b) {
                long j2 = ((xw3) arrayList.get(i - 1)).d;
                int i2 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
                long j3 = xw3.b;
                return (i2 == 0 || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((xw3) gwf.t(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(defpackage.xw3 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x000f
            r4 = r6
            goto L_0x0010
        L_0x000f:
            r4 = r5
        L_0x0010:
            defpackage.oyb.d(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0023
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0023
        L_0x0021:
            r2 = r6
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            java.util.ArrayList r9 = r9.a
            int r3 = r9.size()
            int r3 = r3 - r6
        L_0x002b:
            if (r3 < 0) goto L_0x004e
            java.lang.Object r4 = r9.get(r3)
            xw3 r4 = (defpackage.xw3) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x003e
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L_0x003e:
            java.lang.Object r4 = r9.get(r3)
            xw3 r4 = (defpackage.xw3) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x004b
            r2 = r5
        L_0x004b:
            int r3 = r3 + -1
            goto L_0x002b
        L_0x004e:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe6.b(xw3, long):boolean");
    }

    public ws6 c(long j) {
        int l = l(j);
        if (l == 0) {
            po5 po5 = ws6.b;
            return e8c.X;
        }
        xw3 xw3 = (xw3) this.a.get(l - 1);
        long j2 = xw3.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return xw3.a;
        }
        po5 po52 = ws6.b;
        return e8c.X;
    }

    public void clear() {
        this.a.clear();
    }

    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((xw3) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((xw3) arrayList.get(i)).b;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                return j2;
            }
            if (i2 < 0) {
                xw3 xw3 = (xw3) arrayList.get(i - 1);
                long j3 = xw3.d;
                return (j3 == -9223372036854775807L || j3 > j) ? xw3.b : j3;
            }
        }
        xw3 xw32 = (xw3) gwf.t(arrayList);
        long j4 = xw32.d;
        return (j4 == -9223372036854775807L || j < j4) ? xw32.b : j4;
    }

    public void e(long j) {
        int l = l(j);
        if (l > 0) {
            this.a.subList(0, l).clear();
        }
    }

    public void f(String str, String str2) {
        z3d.j(str);
        z3d.l(str2, str);
        g(str, str2);
    }

    public void g(String str, String str2) {
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(h0e.B0(str2).toString());
    }

    public ye6 h() {
        Object[] array = this.a.toArray(new String[0]);
        if (array != null) {
            return new ye6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean i(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((zkb) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public zkb j(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zkb zkb = (zkb) it.next();
            if (zkb.getClass() == cls) {
                return zkb;
            }
        }
        return null;
    }

    public ArrayList k(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zkb zkb = (zkb) it.next();
            if (cls.isAssignableFrom(zkb.getClass())) {
                arrayList.add(zkb);
            }
        }
        return arrayList;
    }

    public int l(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((xw3) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public void m(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public void n(String str, String str2) {
        z3d.j(str);
        z3d.l(str2, str);
        m(str);
        g(str, str2);
    }

    public xe6(int i) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList(20);
                return;
        }
    }
}
