package defpackage;

/* renamed from: r01  reason: default package */
public final class r01 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ t97 c;

    public /* synthetic */ r01(rj5 rj5, t97 t97, int i) {
        this.a = i;
        this.b = rj5;
        this.c = t97;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x0078;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r7 instanceof ky6
            if (r0 == 0) goto L_0x0018
            r0 = r7
            ky6 r0 = (ky6) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            ky6 r0 = new ky6
            r0.<init>(r5, r7)
        L_0x001d:
            java.lang.Object r7 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            defpackage.wx3.H(r7)
            goto L_0x0075
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            defpackage.wx3.H(r7)
            v3a r6 = (v3a) r6
            java.lang.String r7 = r6.a
            java.lang.String r2 = ""
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x0045
            r6 = -1
            goto L_0x0065
        L_0x0045:
            t97 r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            loa r7 = (defpackage.loa) r7
            java.lang.String r6 = r6.a
            cpa r6 = r7.e(r6)
            boolean r2 = r7.m(r6)
            if (r2 != 0) goto L_0x005d
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0065
        L_0x005d:
            java.lang.String r6 = r7.d(r6, r3)
            int r6 = r6.length()
        L_0x0065:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            r0.X = r3
            rj5 r5 = r5.b
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            jue r1 = defpackage.jue.a
        L_0x0077:
            return r1
        L_0x0078:
            boolean r0 = r7 instanceof defpackage.sd1
            if (r0 == 0) goto L_0x008b
            r0 = r7
            sd1 r0 = (defpackage.sd1) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x008b
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0090
        L_0x008b:
            sd1 r0 = new sd1
            r0.<init>(r5, r7)
        L_0x0090:
            java.lang.Object r7 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00a7
            if (r2 != r3) goto L_0x009f
            defpackage.wx3.H(r7)
            goto L_0x00da
        L_0x009f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x00a7:
            defpackage.wx3.H(r7)
            bka r6 = (defpackage.bka) r6
            t97 r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            xk1 r7 = (defpackage.xk1) r7
            java.util.Map r6 = r6.c
            int r6 = r6.size()
            int r6 = r6 + r3
            android.content.Context r7 = r7.a
            android.content.res.Resources r7 = r7.getResources()
            int r2 = defpackage.hsb.call_users_info_count
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = r7.getQuantityString(r2, r6, r4)
            r0.X = r3
            rj5 r5 = r5.b
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            jue r1 = defpackage.jue.a
        L_0x00dc:
            return r1
        L_0x00dd:
            boolean r0 = r7 instanceof defpackage.q01
            if (r0 == 0) goto L_0x00f0
            r0 = r7
            q01 r0 = (defpackage.q01) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00f0
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00f5
        L_0x00f0:
            q01 r0 = new q01
            r0.<init>(r5, r7)
        L_0x00f5:
            java.lang.Object r7 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x010c
            if (r2 != r3) goto L_0x0104
            defpackage.wx3.H(r7)
            goto L_0x0148
        L_0x0104:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x010c:
            defpackage.wx3.H(r7)
            java.lang.Number r6 = (java.lang.Number) r6
            r6.longValue()
            t97 r6 = r5.c
            java.lang.Object r6 = r6.getValue()
            po1 r6 = (defpackage.po1) r6
            so1 r6 = r6.a
            ep1 r6 = (defpackage.ep1) r6
            ru.ok.android.externcalls.sdk.Conversation r7 = r6.o()
            r2 = 0
            if (r7 == 0) goto L_0x0138
            ru.ok.android.externcalls.sdk.ConversationParticipant r7 = r7.getMe()
            if (r7 != 0) goto L_0x012e
            goto L_0x0138
        L_0x012e:
            ru.ok.android.externcalls.sdk.Conversation r6 = r6.o()
            if (r6 == 0) goto L_0x0138
            float r2 = r6.getAdjustedAudioLevel(r7)
        L_0x0138:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r2)
            r0.X = r3
            rj5 r5 = r5.b
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            jue r1 = defpackage.jue.a
        L_0x014a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r01.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
