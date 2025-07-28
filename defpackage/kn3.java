package defpackage;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: kn3  reason: default package */
public final class kn3 {
    public final ghd a;
    public final o2b b;
    public final di3 c;
    public final t52 d;
    public final rf4 e;
    public final f3d f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public kn3(g2b g2b, o2b o2b, di3 di3, t52 t52, rf4 rf4, f3d f3d, qmc qmc) {
        ghd ghd = new ghd(new mv9(1, new zx1(21, g2b)).m(qmc));
        this.a = ghd;
        ghd.k(new ex7(1, new ak0(29)));
        this.b = o2b;
        this.c = di3;
        this.d = t52;
        this.e = rf4;
        this.f = f3d;
    }

    public static int a(tf3 tf3, tf3 tf32, Collator collator) {
        CollationKey collationKey = tf3.X;
        if (collationKey == null) {
            collationKey = collator.getCollationKey(tf3.d().toLowerCase());
            tf3.X = collationKey;
        }
        CollationKey collationKey2 = tf32.X;
        if (collationKey2 == null) {
            collationKey2 = collator.getCollationKey(tf32.d().toLowerCase());
            tf32.X = collationKey2;
        }
        boolean z = false;
        boolean z2 = !r1g.p(tf3.d()) && Character.isLetter(tf3.d().charAt(0));
        if (!r1g.p(tf32.d()) && Character.isLetter(tf32.d().charAt(0))) {
            z = true;
        }
        return ((!z2 || !z) && (z2 || z)) ? z2 ? -1 : 1 : collationKey.compareTo(collationKey2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c4, code lost:
        r6 = r3.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            rf4 r0 = r8.e     // Catch:{ all -> 0x003e }
            boolean r0 = r0.d()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x009f
            f3d r0 = r8.f     // Catch:{ all -> 0x003e }
            h3d r0 = (defpackage.h3d) r0     // Catch:{ all -> 0x003e }
            int r0 = r0.h     // Catch:{ all -> 0x003e }
            r1 = 3
            if (r0 == r1) goto L_0x0014
            goto L_0x009f
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003e }
            r0.<init>()     // Catch:{ all -> 0x003e }
            java.util.concurrent.ConcurrentHashMap r1 = r8.g     // Catch:{ all -> 0x003e }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x003e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003e }
        L_0x0023:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x003e }
            di3 r3 = r8.c     // Catch:{ all -> 0x003e }
            long r4 = r2.longValue()     // Catch:{ all -> 0x003e }
            r2 = 1
            tf3 r2 = r3.i(r4, r2)     // Catch:{ all -> 0x003e }
            r0.add(r2)     // Catch:{ all -> 0x003e }
            goto L_0x0023
        L_0x003e:
            r9 = move-exception
            goto L_0x010c
        L_0x0041:
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x003e }
        L_0x0045:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003e }
            tf3 r2 = (defpackage.tf3) r2     // Catch:{ all -> 0x003e }
            java.util.concurrent.ConcurrentHashMap r3 = r8.g     // Catch:{ all -> 0x003e }
            long r4 = r2.n()     // Catch:{ all -> 0x003e }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x003e }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x0045
            r0.add(r2)     // Catch:{ all -> 0x003e }
            goto L_0x0045
        L_0x0065:
            o2b r1 = r8.b     // Catch:{ all -> 0x003e }
            yr r1 = r1.d()     // Catch:{ all -> 0x003e }
            ghd r2 = r8.a     // Catch:{ all -> 0x003e }
            java.lang.Object r2 = r2.e()     // Catch:{ all -> 0x003e }
            java.text.Collator r2 = (java.text.Collator) r2     // Catch:{ all -> 0x003e }
            jn3 r3 = new jn3     // Catch:{ all -> 0x003e }
            r4 = 0
            r3.<init>(r8, r1, r2, r4)     // Catch:{ all -> 0x003e }
            java.util.Collections.sort(r0, r3)     // Catch:{ all -> 0x003e }
            r1 = 0
        L_0x007d:
            int r2 = r0.size()     // Catch:{ all -> 0x003e }
            if (r1 >= r2) goto L_0x009d
            java.util.concurrent.ConcurrentHashMap r2 = r8.g     // Catch:{ all -> 0x003e }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x003e }
            tf3 r3 = (defpackage.tf3) r3     // Catch:{ all -> 0x003e }
            long r3 = r3.n()     // Catch:{ all -> 0x003e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x003e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003e }
            r2.put(r3, r4)     // Catch:{ all -> 0x003e }
            int r1 = r1 + 1
            goto L_0x007d
        L_0x009d:
            monitor-exit(r8)
            goto L_0x00a0
        L_0x009f:
            monitor-exit(r8)
        L_0x00a0:
            xb9 r0 = new xb9
            r1 = 6
            r0.<init>(r1)
            java.util.Iterator r1 = r9.iterator()
        L_0x00aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0102
            java.lang.Object r2 = r1.next()
            tf3 r2 = (defpackage.tf3) r2
            t52 r3 = r8.d
            long r4 = r2.n()
            i22 r3 = r3.E(r4)
            r4 = 0
            if (r3 == 0) goto L_0x00d5
            xm8 r6 = r3.c
            if (r6 == 0) goto L_0x00d5
            vo8 r6 = r6.a
            boolean r6 = r6.v()
            if (r6 != 0) goto L_0x00d5
            long r6 = r3.l()
            goto L_0x00d6
        L_0x00d5:
            r6 = r4
        L_0x00d6:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00e3
            long r2 = r2.n()
            long r4 = -r6
            r0.d(r2, r4)
            goto L_0x00aa
        L_0x00e3:
            java.util.concurrent.ConcurrentHashMap r3 = r8.g
            long r6 = r2.n()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r3 = r3.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            long r6 = r2.n()
            if (r3 == 0) goto L_0x00fe
            int r2 = r3.intValue()
            long r4 = (long) r2
        L_0x00fe:
            r0.d(r6, r4)
            goto L_0x00aa
        L_0x0102:
            i63 r8 = new i63
            r1 = 1
            r8.<init>(r1, r0)
            r9.sort(r8)
            return
        L_0x010c:
            monitor-exit(r8)     // Catch:{ all -> 0x003e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn3.b(java.util.List):void");
    }

    public final void c(ArrayList arrayList, u16 u16) {
        Collections.sort(arrayList, new jn3(this, u16, new HashMap(), 1));
    }
}
