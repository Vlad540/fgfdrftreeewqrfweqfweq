package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ijc  reason: default package */
public class ijc implements Iterable {
    public fjc a;
    public fjc b;
    public final WeakHashMap c = new WeakHashMap();
    public int o = 0;

    public fjc a(Object obj) {
        fjc fjc = this.a;
        while (fjc != null && !fjc.a.equals(obj)) {
            fjc = fjc.c;
        }
        return fjc;
    }

    public Object b(Object obj, Object obj2) {
        fjc a2 = a(obj);
        if (a2 != null) {
            return a2.b;
        }
        fjc fjc = new fjc(obj, obj2);
        this.o++;
        fjc fjc2 = this.b;
        if (fjc2 == null) {
            this.a = fjc;
            this.b = fjc;
            return null;
        }
        fjc2.c = fjc;
        fjc.o = fjc2;
        this.b = fjc;
        return null;
    }

    public Object c(Object obj) {
        fjc a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.o--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            for (hjc a3 : weakHashMap.keySet()) {
                a3.a(a2);
            }
        }
        fjc fjc = a2.o;
        if (fjc != null) {
            fjc.c = a2.c;
        } else {
            this.a = a2.c;
        }
        fjc fjc2 = a2.c;
        if (fjc2 != null) {
            fjc2.o = fjc;
        } else {
            this.b = fjc;
        }
        a2.c = null;
        a2.o = null;
        return a2.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r1.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((defpackage.ejc) r6).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.ijc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ijc r6 = (defpackage.ijc) r6
            int r1 = r5.o
            int r3 = r6.o
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            r1 = r5
            ejc r1 = (defpackage.ejc) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0044
            r3 = r6
            ejc r3 = (defpackage.ejc) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L_0x003b
            if (r3 != 0) goto L_0x0043
        L_0x003b:
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x0053
            ejc r6 = (defpackage.ejc) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            ejc ejc = (ejc) it;
            if (!ejc.hasNext()) {
                return i;
            }
            i += ((Map.Entry) ejc.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        ejc ejc = new ejc(this.a, this.b, 0);
        this.c.put(ejc, Boolean.FALSE);
        return ejc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ejc ejc = (ejc) it;
            if (ejc.hasNext()) {
                sb.append(((Map.Entry) ejc.next()).toString());
                if (ejc.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
