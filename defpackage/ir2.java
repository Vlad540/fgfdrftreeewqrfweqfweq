package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ir2  reason: default package */
public final class ir2 implements pj5 {
    public static final /* synthetic */ k77[] o;
    public final AtomicInteger a = new AtomicInteger(0);
    public final e3 b = hwf.t();
    public final /* synthetic */ kr2 c;

    static {
        hc9 hc9 = new hc9(ir2.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        o = new k77[]{hc9};
    }

    public ir2(kr2 kr2) {
        this.c = kr2;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [i26, l5e] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.rj5 r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            r2 = 5
            r3 = 0
            boolean r4 = r0 instanceof defpackage.gr2
            if (r4 == 0) goto L_0x0019
            r4 = r0
            gr2 r4 = (defpackage.gr2) r4
            int r5 = r4.Z
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.Z = r5
            goto L_0x001e
        L_0x0019:
            gr2 r4 = new gr2
            r4.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r4.X
            pu3 r5 = defpackage.pu3.a
            int r6 = r4.Z
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0040
            if (r6 == r8) goto L_0x0032
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0032:
            ir2 r1 = r4.o
            defpackage.wx3.H(r0)     // Catch:{ all -> 0x003d }
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            goto L_0x0159
        L_0x0040:
            defpackage.wx3.H(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a
            int r0 = r0.incrementAndGet()
            if (r0 != r8) goto L_0x0144
            k77[] r0 = o
            r6 = r0[r3]
            e3 r9 = r1.b
            java.lang.Object r6 = r9.T0(r1, r6)
            g37 r6 = (defpackage.g37) r6
            if (r6 == 0) goto L_0x0061
            boolean r6 = r6.isActive()
            if (r6 != r8) goto L_0x0061
            goto L_0x0144
        L_0x0061:
            kr2 r6 = r1.c
            r6.getClass()
            h37 r15 = defpackage.lp.a()
            jh6 r9 = r6.a
            r9.j = r6
            xg0 r9 = r6.o
            ck5 r9 = r9.b()
            er2 r10 = new er2
            r14 = 2
            r10.<init>(r14, r7)
            ck5 r13 = new ck5
            r13.<init>(r9, r10)
            zv r12 = new zv
            java.lang.Class<kr2> r16 = defpackage.kr2.class
            java.lang.String r17 = "handleEvent"
            r10 = 2
            java.lang.String r18 = "handleEvent(Lru/ok/tamtam/chats/ChatsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r19 = 0
            r20 = 9
            r9 = r12
            r11 = r6
            r3 = r12
            r12 = r16
            r7 = r13
            r13 = r17
            r14 = r18
            r8 = r15
            r15 = r19
            r16 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            ck5 r9 = new ck5
            r9.<init>(r7, r3, r2)
            boolean r3 = r9 instanceof defpackage.cw1
            if (r3 == 0) goto L_0x00a8
            goto L_0x00ae
        L_0x00a8:
            ew1 r3 = new ew1
            r3.<init>(r9)
            r9 = r3
        L_0x00ae:
            cw1 r9 = (defpackage.cw1) r9
            kotlinx.coroutines.internal.ContextScope r3 = r6.E0
            kotlinx.coroutines.internal.ContextScope r3 = defpackage.n1g.M(r3, r8)
            defpackage.ez3.N(r9, r3)
            rj3 r3 = r6.X
            pj5 r3 = r3.a()
            zi1 r7 = new zi1
            r9 = 15
            r7.<init>(r3, r9)
            zi1 r3 = new zi1
            r9 = 14
            r3.<init>(r7, r9)
            int r7 = defpackage.zp4.o
            r7 = 300(0x12c, float:4.2E-43)
            eq4 r9 = defpackage.eq4.MILLISECONDS
            long r9 = defpackage.mt0.P(r7, r9)
            vg0 r7 = new vg0
            r11 = 7
            r7.<init>(r11)
            ck5 r3 = defpackage.vx3.h(r3, r9, r7)
            pj5 r3 = defpackage.ez3.z(r3)
            zv r7 = new zv
            java.lang.Class<kr2> r12 = defpackage.kr2.class
            java.lang.String r13 = "handleContactsUpdateEvent"
            r10 = 2
            java.lang.String r14 = "handleContactsUpdateEvent(Lru/ok/tamtam/contacts/ContactEvent$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r15 = 0
            r16 = 10
            r9 = r7
            r11 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            ck5 r9 = new ck5
            r9.<init>(r3, r7, r2)
            pae r2 = r6.b
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.a()
            java.lang.String r3 = "contactEvents-stream"
            r7 = 1
            ju3 r2 = r2.limitedParallelism(r7, r3)
            pj5 r2 = defpackage.ez3.J(r9, r2)
            boolean r3 = r2 instanceof defpackage.cw1
            if (r3 == 0) goto L_0x0113
            goto L_0x0119
        L_0x0113:
            ew1 r3 = new ew1
            r3.<init>(r2)
            r2 = r3
        L_0x0119:
            cw1 r2 = (defpackage.cw1) r2
            kotlinx.coroutines.internal.ContextScope r3 = r6.E0
            kotlinx.coroutines.internal.ContextScope r3 = defpackage.n1g.M(r3, r8)
            defpackage.ez3.N(r2, r3)
            kotlinx.coroutines.internal.ContextScope r2 = r6.E0
            pae r3 = r6.b
            n3a r3 = (defpackage.n3a) r3
            ju3 r3 = r3.a()
            hu3 r3 = r3.plus(r8)
            fr2 r7 = new fr2
            r9 = 0
            r7.<init>(r6, r9)
            r6 = 2
            defpackage.xs7.E(r2, r3, r9, r7, r6)
            r2 = 0
            r0 = r0[r2]
            e3 r2 = r1.b
            r2.o1(r1, r0, r8)
        L_0x0144:
            kr2 r0 = r1.c     // Catch:{ all -> 0x003d }
            grd r0 = r0.B0     // Catch:{ all -> 0x003d }
            hr2 r2 = new hr2     // Catch:{ all -> 0x003d }
            r3 = r22
            r6 = 0
            r2.<init>(r6, r3)     // Catch:{ all -> 0x003d }
            r4.o = r1     // Catch:{ all -> 0x003d }
            r3 = 1
            r4.Z = r3     // Catch:{ all -> 0x003d }
            r0.c(r2, r4)     // Catch:{ all -> 0x003d }
            return r5
        L_0x0159:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.a
            int r2 = r2.decrementAndGet()
            if (r2 != 0) goto L_0x017f
            k77[] r2 = o
            r3 = 0
            r4 = r2[r3]
            e3 r5 = r1.b
            java.lang.Object r4 = r5.T0(r1, r4)
            g37 r4 = (defpackage.g37) r4
            if (r4 == 0) goto L_0x017f
            boolean r4 = r4.isActive()
            r5 = 1
            if (r4 != r5) goto L_0x017f
            r2 = r2[r3]
            e3 r3 = r1.b
            r4 = 0
            r3.o1(r1, r2, r4)
        L_0x017f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir2.c(rj5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
