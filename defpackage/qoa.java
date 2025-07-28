package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: qoa  reason: default package */
public final class qoa extends l5e implements i26 {
    public final /* synthetic */ voa A0;
    public List X;
    public List Y;
    public List Z;
    public List w0;
    public long x0;
    public int y0;
    public /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qoa(voa voa, Continuation continuation) {
        super(2, continuation);
        this.A0 = voa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qoa qoa = new qoa(this.A0, continuation);
        qoa.z0 = obj;
        return qoa;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: ou3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0204 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0299 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x029a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = 3
            pu3 r2 = pu3.a
            int r3 = r0.y0
            jue r4 = jue.a
            java.lang.String r5 = "Phonebook"
            r7 = 10
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L_0x006b
            if (r3 == r9) goto L_0x0054
            if (r3 == r8) goto L_0x0036
            if (r3 != r1) goto L_0x002e
            long r2 = r0.x0
            java.util.List r7 = r0.Z
            java.util.List r8 = r0.Y
            java.util.List r10 = r0.X
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r11 = r0.z0
            ou3 r11 = (ou3) r11
            wx3.H(r36)
            r1 = r36
            r31 = r5
            goto L_0x0291
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            long r10 = r0.x0
            java.util.List r3 = r0.w0
            java.util.List r8 = r0.Z
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.List r12 = r0.Y
            java.util.List r13 = r0.X
            java.lang.Object r14 = r0.z0
            ou3 r14 = (ou3) r14
            wx3.H(r36)
            r1 = r36
            r31 = r5
            r33 = r8
            r8 = r3
            r3 = r33
            goto L_0x01fb
        L_0x0054:
            long r10 = r0.x0
            java.util.List r3 = r0.Z
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r12 = r0.Y
            java.util.List r13 = r0.X
            java.lang.Object r14 = r0.z0
            ou3 r14 = (ou3) r14
            wx3.H(r36)
            r31 = r5
            r5 = r36
            goto L_0x0177
        L_0x006b:
            wx3.H(r36)
            java.lang.Object r3 = r0.z0
            r14 = r3
            ou3 r14 = (ou3) r14
            java.lang.String r3 = "checkUpdatesWorker"
            udd.q(r5, r3)
            voa r3 = r0.A0
            t97 r3 = r3.Y
            java.lang.Object r3 = r3.getValue()
            zy9 r3 = (defpackage.zy9) r3
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x0098
            voa r3 = r0.A0
            t97 r3 = r3.Y
            java.lang.Object r3 = r3.getValue()
            zy9 r3 = (defpackage.zy9) r3
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x009b
        L_0x0098:
            r7 = r5
            goto L_0x035b
        L_0x009b:
            voa r3 = r0.A0
            t97 r3 = r3.X
            java.lang.Object r3 = r3.getValue()
            zz9 r3 = (zz9) r3
            t97 r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            qna r3 = (defpackage.qna) r3
            java.lang.String[] r10 = defpackage.qna.f
            boolean r3 = r3.b(r10)
            if (r3 != 0) goto L_0x00bb
            java.lang.String r0 = "checkUpdates: no permission"
            udd.q(r5, r0)
            return r4
        L_0x00bb:
            voa r3 = r0.A0
            r3.d()
            int r3 = zp4.o
            long r10 = android.os.SystemClock.elapsedRealtime()
            eq4 r3 = eq4.c
            long r10 = mt0.Q(r10, r3)
            voa r3 = r0.A0
            android.content.Context r12 = r3.a
            g15 r3 = r3.c
            java.util.Collection r3 = xie.s(r12, r3)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = q23.H(r3, r7)
            r12.<init>(r13)
            java.util.Iterator r3 = r3.iterator()
        L_0x00e3:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0131
            java.lang.Object r13 = r3.next()
            hoa r13 = (defpackage.hoa) r13
            ioa r15 = new ioa
            long r7 = r13.a
            int r1 = r13.b
            java.lang.String r6 = r13.c
            r29 = r10
            long r9 = r13.d
            java.lang.String r11 = r13.e
            r36 = r3
            java.lang.String r3 = r13.f
            r31 = r5
            java.lang.String r5 = r13.g
            int r13 = r13.h
            r16 = 0
            r24 = 0
            r32 = r15
            r18 = r7
            r20 = r1
            r21 = r6
            r22 = r9
            r25 = r11
            r26 = r3
            r27 = r5
            r28 = r13
            r15.<init>(r16, r18, r20, r21, r22, r24, r25, r26, r27, r28)
            r1 = r32
            r12.add(r1)
            r3 = r36
            r10 = r29
            r5 = r31
            r1 = 3
            r7 = 10
            r8 = 2
            r9 = 1
            goto L_0x00e3
        L_0x0131:
            r31 = r5
            r29 = r10
            boolean r1 = n1g.A(r14)
            if (r1 != 0) goto L_0x013c
            return r4
        L_0x013c:
            voa r1 = r0.A0
            t97 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            oec r1 = r1.e
            java.util.ArrayList r1 = r1.e()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            voa r5 = r0.A0
            r0.z0 = r14
            r0.X = r12
            r0.Y = r1
            r0.Z = r3
            r6 = r29
            r0.x0 = r6
            r8 = 1
            r0.y0 = r8
            r5.getClass()
            toa r8 = new toa
            r9 = 0
            r8.<init>(r12, r5, r1, r9)
            java.lang.Object r5 = n1g.f(r8, r0)
            if (r5 != r2) goto L_0x0174
            return r2
        L_0x0174:
            r10 = r6
            r13 = r12
            r12 = r1
        L_0x0177:
            java.util.List r5 = (java.util.List) r5
            boolean r1 = n1g.A(r14)
            if (r1 != 0) goto L_0x0180
            return r4
        L_0x0180:
            boolean r1 = r5.isEmpty()
            r6 = 1
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x01d9
            voa r1 = r0.A0
            t97 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            oec r1 = r1.e
            dpa r6 = r1.c()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = q23.H(r5, r8)
            r7.<init>(r9)
            java.util.Iterator r8 = r5.iterator()
        L_0x01a9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01bd
            java.lang.Object r9 = r8.next()
            ioa r9 = (defpackage.ioa) r9
            joa r9 = defpackage.oec.b(r1, r9)
            r7.add(r9)
            goto L_0x01a9
        L_0x01bd:
            aec r1 = r6.a
            r1.b()
            r1.c()
            f74 r6 = r6.c     // Catch:{ all -> 0x01d4 }
            r6.C(r7)     // Catch:{ all -> 0x01d4 }
            r1.r()     // Catch:{ all -> 0x01d4 }
            r1.l()
            r3.addAll(r5)
            goto L_0x01d9
        L_0x01d4:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x01d9:
            voa r1 = r0.A0
            r0.z0 = r14
            r0.X = r13
            r0.Y = r12
            r0.Z = r3
            r0.w0 = r5
            r0.x0 = r10
            r6 = 2
            r0.y0 = r6
            r1.getClass()
            roa r6 = new roa
            r7 = 0
            r6.<init>(r12, r1, r13, r7)
            java.lang.Object r1 = n1g.f(r6, r0)
            if (r1 != r2) goto L_0x01fa
            return r2
        L_0x01fa:
            r8 = r5
        L_0x01fb:
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            boolean r1 = n1g.A(r14)
            if (r1 != 0) goto L_0x0205
            return r4
        L_0x0205:
            boolean r1 = r7.isEmpty()
            r5 = 1
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0264
            voa r1 = r0.A0
            t97 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            oec r1 = r1.e
            dpa r1 = r1.c()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = q23.H(r7, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L_0x022e:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x024a
            java.lang.Object r9 = r6.next()
            ioa r9 = (defpackage.ioa) r9
            r15 = r12
            r16 = r13
            long r12 = r9.b
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r5.add(r9)
            r12 = r15
            r13 = r16
            goto L_0x022e
        L_0x024a:
            r15 = r12
            r16 = r13
            aec r6 = r1.a
            r6.c()
            defpackage.dpa.a(r1, r5)     // Catch:{ all -> 0x025f }
            r6.r()     // Catch:{ all -> 0x025f }
            r6.l()
            r3.addAll(r7)
            goto L_0x0267
        L_0x025f:
            r0 = move-exception
            r6.l()
            throw r0
        L_0x0264:
            r15 = r12
            r16 = r13
        L_0x0267:
            voa r1 = r0.A0
            r0.z0 = r14
            r0.X = r3
            r0.Y = r8
            r0.Z = r7
            r5 = 0
            r0.w0 = r5
            r0.x0 = r10
            r6 = 3
            r0.y0 = r6
            r1.getClass()
            soa r6 = new soa
            r12 = r15
            r13 = r16
            r6.<init>(r13, r1, r12, r5)
            java.lang.Object r1 = n1g.f(r6, r0)
            if (r1 != r2) goto L_0x028b
            return r2
        L_0x028b:
            r33 = r10
            r10 = r3
            r2 = r33
            r11 = r14
        L_0x0291:
            java.util.List r1 = (java.util.List) r1
            boolean r5 = n1g.A(r11)
            if (r5 != 0) goto L_0x029a
            return r4
        L_0x029a:
            boolean r5 = r1.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x02d7
            voa r5 = r0.A0
            t97 r5 = r5.o
            java.lang.Object r5 = r5.getValue()
            a04 r5 = (defpackage.a04) r5
            hz3 r5 = (defpackage.hz3) r5
            oec r5 = r5.e
            bec r6 = r5.a
            aec r6 = r6.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r6 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r6
            sbc r9 = new sbc
            r12 = 3
            r9.<init>(r1, r12, r5)
            r6.q(r9)
            boolean r5 = n1g.A(r11)
            if (r5 != 0) goto L_0x02c8
            return r4
        L_0x02c8:
            r10.addAll(r1)
            voa r5 = r0.A0
            tt0 r5 = r5.b
            epa r6 = new epa
            r6.<init>()
            r5.c(r6)
        L_0x02d7:
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x02de
        L_0x02db:
            r7 = r31
            goto L_0x0309
        L_0x02de:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x02db
            tn7 r6 = defpackage.tn7.X
            int r8 = r8.size()
            int r7 = r7.size()
            int r1 = r1.size()
            java.lang.String r9 = "updatePhones="
            java.lang.String r12 = ",deletedPhones="
            java.lang.String r13 = ",newPhones="
            java.lang.StringBuilder r7 = defpackage.rf0.i(r9, r8, r12, r7, r13)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r7 = r31
            r8 = 0
            r5.d(r6, r7, r1, r8)
        L_0x0309:
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x030e
            goto L_0x0334
        L_0x030e:
            boolean r5 = r1.c()
            if (r5 == 0) goto L_0x0334
            tn7 r5 = defpackage.tn7.X
            int r6 = zp4.o
            long r8 = android.os.SystemClock.elapsedRealtime()
            eq4 r6 = eq4.c
            long r8 = mt0.Q(r8, r6)
            long r2 = zp4.g(r8, r2)
            java.lang.String r2 = zp4.j(r2)
            java.lang.String r3 = "checkUpdates completed in time="
            java.lang.String r2 = r3.concat(r2)
            r3 = 0
            r1.d(r5, r7, r2, r3)
        L_0x0334:
            boolean r1 = n1g.A(r11)
            if (r1 == 0) goto L_0x035a
            boolean r1 = r10.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x035a
            voa r0 = r0.A0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.Z
            java.util.Iterator r0 = r0.iterator()
        L_0x034a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x035a
            java.lang.Object r1 = r0.next()
            moa r1 = (defpackage.moa) r1
            r1.a(r10)
            goto L_0x034a
        L_0x035a:
            return r4
        L_0x035b:
            java.lang.String r0 = "checkUpdates: not authorized"
            udd.q(r7, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoa.o(java.lang.Object):java.lang.Object");
    }
}
