package defpackage;

/* renamed from: rv1  reason: default package */
public final class rv1 {
    public static final /* synthetic */ k77[] e;
    public static final String f;
    public final nj4 a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;

    static {
        Class<rv1> cls = rv1.class;
        k77 khb = new khb(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0);
        n7c n7c = m7c.a;
        e = new k77[]{khb, wn6.e(n7c, cls, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0), wn6.f(cls, "messageReactionsUpdateLogic", "getMessageReactionsUpdateLogic()Lru/ok/tamtam/messages/reactions/MessageReactionsUpdateLogic;", 0, n7c), wn6.f(cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0, n7c)};
        f = cls.getName();
    }

    public rv1(nj4 nj4, nj4 nj42, nj4 nj43, nj4 nj44) {
        this.a = nj4;
        this.b = nj42;
        this.c = nj43;
        this.d = nj44;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r23, long r25, long r27, long r29, defpackage.yyb r31, kotlin.coroutines.Continuation r32) {
        /*
            r22 = this;
            r1 = r22
            r0 = r32
            boolean r2 = r0 instanceof defpackage.qv1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            qv1 r2 = (defpackage.qv1) r2
            int r3 = r2.z0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.z0 = r3
            goto L_0x001c
        L_0x0017:
            qv1 r2 = new qv1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.x0
            pu3 r3 = pu3.a
            int r4 = r2.z0
            jue r5 = jue.a
            java.lang.String r7 = f
            k77[] r8 = e
            r9 = 1
            if (r4 == 0) goto L_0x0050
            if (r4 != r9) goto L_0x0048
            long r3 = r2.w0
            long r9 = r2.Z
            long r11 = r2.Y
            long r13 = r2.X
            rv1 r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x0044 }
            r2 = r3
            r4 = r7
            r16 = r9
            r20 = r11
            r12 = r13
            r14 = r20
            goto L_0x009d
        L_0x0044:
            r0 = move-exception
            r4 = r7
            goto L_0x00db
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            wx3.H(r0)
            r0 = r8[r9]
            nj4 r0 = r1.b
            java.lang.Object r0 = r0.get()
            xzc r0 = (defpackage.xzc) r0
            r0.getClass()
            java.lang.String r0 = "reactions, msgCancelReaction"
            udd.q(r7, r0)
            r0 = 2
            r0 = r8[r0]     // Catch:{ all -> 0x0044 }
            nj4 r0 = r1.c     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0044 }
            r10 = r0
            bs8 r10 = (defpackage.bs8) r10     // Catch:{ all -> 0x0044 }
            r2.o = r1     // Catch:{ all -> 0x0044 }
            r13 = r23
            r2.X = r13     // Catch:{ all -> 0x0044 }
            r11 = r25
            r2.Y = r11     // Catch:{ all -> 0x0044 }
            r4 = r7
            r6 = r27
            r2.Z = r6     // Catch:{ all -> 0x00da }
            r15 = r10
            r9 = r29
            r2.w0 = r9     // Catch:{ all -> 0x00da }
            r0 = 1
            r2.z0 = r0     // Catch:{ all -> 0x00da }
            r10 = r15
            r11 = r23
            r13 = r25
            r15 = r31
            r10.e(r11, r13, r15)     // Catch:{ all -> 0x00da }
            if (r5 != r3) goto L_0x0095
            return r3
        L_0x0095:
            r12 = r23
            r14 = r25
            r2 = r29
            r16 = r6
        L_0x009d:
            r1.getClass()     // Catch:{ all -> 0x00da }
            r6 = 0
            r0 = r8[r6]     // Catch:{ all -> 0x00da }
            nj4 r0 = r1.a     // Catch:{ all -> 0x00da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00da }
            pk r0 = (defpackage.pk) r0     // Catch:{ all -> 0x00da }
            gy9 r0 = (defpackage.gy9) r0     // Catch:{ all -> 0x00da }
            boolean r6 = r0.o(r12)     // Catch:{ all -> 0x00da }
            if (r6 != 0) goto L_0x00b4
            goto L_0x00f4
        L_0x00b4:
            boolean r6 = r0.p(r14)     // Catch:{ all -> 0x00da }
            if (r6 != 0) goto L_0x00bb
            goto L_0x00f4
        L_0x00bb:
            boolean r6 = r0.q(r2)     // Catch:{ all -> 0x00da }
            if (r6 != 0) goto L_0x00c2
            goto L_0x00f4
        L_0x00c2:
            g89 r6 = new g89     // Catch:{ all -> 0x00da }
            g2b r7 = r0.z()     // Catch:{ all -> 0x00da }
            j2b r7 = (defpackage.j2b) r7     // Catch:{ all -> 0x00da }
            i03 r7 = r7.a     // Catch:{ all -> 0x00da }
            long r10 = r7.n()     // Catch:{ all -> 0x00da }
            r9 = r6
            r18 = r2
            r9.<init>(r10, r12, r14, r16, r18)     // Catch:{ all -> 0x00da }
            defpackage.gy9.w(r0, r6)     // Catch:{ all -> 0x00da }
            goto L_0x00f4
        L_0x00da:
            r0 = move-exception
        L_0x00db:
            java.lang.String r2 = "reactions, cancelReaction async query failed"
            udd.s(r4, r2, r0)
            r1.getClass()
            r2 = 3
            r2 = r8[r2]
            nj4 r1 = r1.d
            java.lang.Object r1 = r1.get()
            g15 r1 = (defpackage.g15) r1
            r4a r1 = (r4a) r1
            r2 = 0
            r1.c(r0, r2)
        L_0x00f4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv1.a(long, long, long, long, yyb, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
