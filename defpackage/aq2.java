package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aq2  reason: default package */
public final class aq2 implements pz3 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public aq2(t97 t97, r7e r7e, r7e r7e2) {
        this.a = r7e;
        this.b = t97;
        this.c = r7e2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable a(java.util.Set r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.zp2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            zp2 r0 = (defpackage.zp2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            zp2 r0 = new zp2
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            aq2 r5 = r0.o
            defpackage.wx3.H(r7)
            goto L_0x00ad
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            defpackage.wx3.H(r7)
            t97 r7 = r5.b
            java.lang.Object r7 = r7.getValue()
            tr2 r7 = (tr2) r7
            or2 r2 = r5.b()
            r0.o = r5
            r0.Z = r3
            aw2 r7 = (aw2) r7
            t52 r0 = r7.l()
            r0.getClass()
            if (r6 == 0) goto L_0x0098
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0057
            goto L_0x0098
        L_0x0057:
            r0.e()
            java.util.concurrent.ConcurrentHashMap r0 = r0.f
            java.util.Objects.requireNonNull(r0)
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x006a
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x009c
        L_0x006a:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r6.size()
            r3.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L_0x0077:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0096
            java.lang.Object r4 = r6.next()
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x008f }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x008f }
            i22 r4 = (i22) r4     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0077
            r3.add(r4)     // Catch:{ all -> 0x008f }
            goto L_0x0077
        L_0x008f:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x0096:
            r6 = r3
            goto L_0x009c
        L_0x0098:
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x009c:
            es r0 = new es
            r3 = 2
            r0.<init>(r3, r6)
            dyc r6 = r7.h(r0, r2)
            java.util.List r7 = defpackage.myc.U(r6)
            if (r7 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r7.next()
            r1 = r0
            i22 r1 = (i22) r1
            boolean r2 = r1.e0()
            if (r2 == 0) goto L_0x00b8
            boolean r2 = r1.b0()
            if (r2 == 0) goto L_0x00b8
            o62 r1 = r1.b
            long r1 = r1.k
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00b8
            r6.add(r0)
            goto L_0x00b8
        L_0x00df:
            java.util.ArrayList r5 = r5.c(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq2.a(java.util.Set, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final or2 b() {
        ep5 a2 = ((rq2) this.a.getValue()).a();
        if (a2.b()) {
            return mr2.a;
        }
        return new nr2(a2.z0, a2.Y, a2.A0, a2.B0, a2.E0);
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qr2) this.c.getValue()).a((i22) it.next()));
        }
        return arrayList;
    }

    public final List h(long j, rg6 rg6, int i, int i2, long j2, long j3) {
        return c(((tr2) this.b.getValue()).s(b(), j, rg6 != null ? Long.valueOf(rg6.getId()) : null, i2));
    }
}
