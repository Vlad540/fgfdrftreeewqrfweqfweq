package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: j59  reason: default package */
public final class j59 extends l5e implements i26 {
    public final /* synthetic */ long A0;
    public Object X;
    public Object Y;
    public r59 Z;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ List y0;
    public final /* synthetic */ r59 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j59(List list, r59 r59, long j, Continuation continuation) {
        super(2, continuation);
        this.y0 = list;
        this.z0 = r59;
        this.A0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j59 j59 = new j59(this.y0, this.z0, this.A0, continuation);
        j59.x0 = obj;
        return j59;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            pu3 r0 = pu3.a
            int r1 = r14.w0
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x004f
            if (r1 == r5) goto L_0x003b
            if (r1 == r4) goto L_0x002b
            if (r1 != r3) goto L_0x0023
            java.lang.Object r1 = r14.Y
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r14.X
            r59 r4 = (defpackage.r59) r4
            java.lang.Object r5 = r14.x0
            zb9 r5 = (zb9) r5
            wx3.H(r15)
            r15 = r4
            r10 = r5
            goto L_0x0113
        L_0x0023:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x002b:
            java.lang.Object r1 = r14.X
            bs r1 = (bs) r1
            java.lang.Object r4 = r14.x0
            ou3 r4 = (ou3) r4
            wx3.H(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x00dd
        L_0x0038:
            r15 = move-exception
            goto L_0x00e4
        L_0x003b:
            r59 r1 = r14.Z
            java.lang.Object r5 = r14.Y
            qc9 r5 = (qc9) r5
            java.lang.Object r6 = r14.X
            bs r6 = (bs) r6
            java.lang.Object r7 = r14.x0
            ou3 r7 = (ou3) r7
            wx3.H(r15)
        L_0x004c:
            r15 = r1
            r1 = r6
            goto L_0x0080
        L_0x004f:
            wx3.H(r15)
            java.lang.Object r15 = r14.x0
            ou3 r15 = (ou3) r15
            java.util.List r1 = r14.y0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0061
            zb9 r14 = tq7.a
            return r14
        L_0x0061:
            java.util.List r1 = r14.y0
            bs r6 = new bs
            r6.<init>(r1)
            r59 r1 = r14.z0
            tc9 r7 = r1.w0
            r14.x0 = r15
            r14.X = r6
            r14.Y = r7
            r14.Z = r1
            r14.w0 = r5
            java.lang.Object r5 = r7.d(r14)
            if (r5 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r5 = r7
            r7 = r15
            goto L_0x004c
        L_0x0080:
            bs r6 = r15.x0     // Catch:{ all -> 0x0160 }
            r1.c(r6)     // Catch:{ all -> 0x0160 }
            bs r15 = r15.x0     // Catch:{ all -> 0x0160 }
            r15.a(r1)     // Catch:{ all -> 0x0160 }
            tc9 r5 = (tc9) r5
            r5.e(r2)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x00be
            java.util.List r8 = r14.y0
            fn6 r14 = udd.e
            if (r14 != 0) goto L_0x009c
            goto L_0x00bb
        L_0x009c:
            boolean r15 = r14.c()
            if (r15 == 0) goto L_0x00bb
            tn7 r15 = defpackage.tn7.Y
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = 63
            java.lang.String r0 = o23.c0(r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "requestContacts: idsForRequest skipped! missedIds=["
            java.lang.String r3 = "]"
            java.lang.String r0 = defpackage.wn6.i(r1, r0, r3)
            java.lang.String r1 = "MissedContactsController"
            r14.d(r15, r1, r0, r2)
        L_0x00bb:
            zb9 r14 = tq7.a
            return r14
        L_0x00be:
            long r5 = r14.A0     // Catch:{ all -> 0x00e2 }
            i59 r15 = new i59     // Catch:{ all -> 0x00e2 }
            r59 r8 = r14.z0     // Catch:{ all -> 0x00e2 }
            r15.<init>(r1, r8, r2)     // Catch:{ all -> 0x00e2 }
            r14.x0 = r7     // Catch:{ all -> 0x00e2 }
            r14.X = r1     // Catch:{ all -> 0x00e2 }
            r14.Y = r2     // Catch:{ all -> 0x00e2 }
            r14.Z = r2     // Catch:{ all -> 0x00e2 }
            r14.w0 = r4     // Catch:{ all -> 0x00e2 }
            long r4 = defpackage.ek8.b0(r5)     // Catch:{ all -> 0x00e2 }
            java.lang.Object r15 = ez3.l0(r4, r15, r14)     // Catch:{ all -> 0x00e2 }
            if (r15 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r4 = r7
        L_0x00dd:
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x0038 }
            goto L_0x00ed
        L_0x00e0:
            r4 = r7
            goto L_0x00e4
        L_0x00e2:
            r15 = move-exception
            goto L_0x00e0
        L_0x00e4:
            boolean r5 = r15 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L_0x0158
            boolean r5 = r15 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r5 != 0) goto L_0x0158
            r15 = r2
        L_0x00ed:
            boolean r4 = n1g.A(r4)
            if (r4 == 0) goto L_0x014c
            if (r15 == 0) goto L_0x014c
            boolean r4 = r15.isEmpty()
            if (r4 == 0) goto L_0x00fc
            goto L_0x014c
        L_0x00fc:
            r59 r4 = r14.z0
            boolean r4 = r4.i()
            if (r4 != 0) goto L_0x0105
            goto L_0x014c
        L_0x0105:
            zb9 r1 = new zb9
            r1.<init>(r2)
            r59 r4 = r14.z0
            java.util.Iterator r15 = r15.iterator()
            r10 = r1
            r1 = r15
            r15 = r4
        L_0x0113:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x014b
            java.lang.Object r4 = r1.next()
            wia r4 = (wia) r4
            java.lang.Object r5 = r4.a
            r7 = r5
            long[] r7 = (long[]) r7
            java.lang.Object r4 = r4.b
            r5 = r4
            wia r5 = (wia) r5
            r14.x0 = r10
            r14.X = r15
            r14.Y = r1
            r14.Z = r2
            r14.w0 = r3
            r15.getClass()
            g59 r11 = new g59
            r9 = 0
            r4 = r11
            r6 = r15
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r4 = n1g.f(r11, r14)
            if (r4 != r0) goto L_0x0146
            goto L_0x0148
        L_0x0146:
            jue r4 = jue.a
        L_0x0148:
            if (r4 != r0) goto L_0x0113
            return r0
        L_0x014b:
            return r10
        L_0x014c:
            r59 r14 = r14.z0
            bs r14 = r14.x0
            r14.c(r1)
            zb9 r14 = lp.V(r1)
            return r14
        L_0x0158:
            r59 r14 = r14.z0
            bs r14 = r14.x0
            r14.c(r1)
            throw r15
        L_0x0160:
            r14 = move-exception
            tc9 r5 = (tc9) r5
            r5.e(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j59.o(java.lang.Object):java.lang.Object");
    }
}
