package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: hv8  reason: default package */
public final class hv8 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ hv8(rj5 rj5, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = rj5;
        this.c = messageWriteWidget;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            jue r0 = jue.a
            rj5 r1 = r11.b
            one.me.sdk.messagewrite.MessageWriteWidget r2 = r11.c
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            pu3 r6 = pu3.a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r11.a
            switch(r8) {
                case 0: goto L_0x011a;
                case 1: goto L_0x00a4;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r8 = r13 instanceof defpackage.kv8
            if (r8 == 0) goto L_0x0024
            r8 = r13
            kv8 r8 = (defpackage.kv8) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x0024
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x0029
        L_0x0024:
            kv8 r8 = new kv8
            r8.<init>(r11, r13)
        L_0x0029:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x003c
            if (r13 != r5) goto L_0x0036
            wx3.H(r11)
            goto L_0x00a3
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x003c:
            wx3.H(r11)
            r11 = r12
            pt8 r11 = (defpackage.pt8) r11
            if (r11 != 0) goto L_0x0046
            r11 = r5
            goto L_0x0047
        L_0x0046:
            r11 = r3
        L_0x0047:
            k77[] r13 = one.me.sdk.messagewrite.MessageWriteWidget.J0
            nu8 r13 = r2.u0()
            t0c r13 = r13.N0
            zqd r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            if (r13 == 0) goto L_0x0059
            r13 = r5
            goto L_0x005a
        L_0x0059:
            r13 = r3
        L_0x005a:
            nu8 r4 = r2.u0()
            t0c r4 = r4.P0
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x0069
            r3 = r5
        L_0x0069:
            if (r11 == 0) goto L_0x007f
            if (r13 == 0) goto L_0x007f
            nu8 r4 = r2.u0()
            t0c r4 = r4.N0
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            tt8 r4 = (defpackage.tt8) r4
            one.me.sdk.messagewrite.MessageWriteWidget.n0(r2, r4)
            goto L_0x0094
        L_0x007f:
            if (r11 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x0094
            nu8 r4 = r2.u0()
            t0c r4 = r4.P0
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            nt8 r4 = (defpackage.nt8) r4
            one.me.sdk.messagewrite.MessageWriteWidget.l0(r2, r4)
        L_0x0094:
            if (r11 == 0) goto L_0x009a
            if (r13 != 0) goto L_0x00a3
            if (r3 != 0) goto L_0x00a3
        L_0x009a:
            r8.X = r5
            java.lang.Object r11 = r1.a(r12, r8)
            if (r11 != r6) goto L_0x00a3
            r0 = r6
        L_0x00a3:
            return r0
        L_0x00a4:
            boolean r8 = r13 instanceof defpackage.jv8
            if (r8 == 0) goto L_0x00b5
            r8 = r13
            jv8 r8 = (defpackage.jv8) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x00b5
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x00ba
        L_0x00b5:
            jv8 r8 = new jv8
            r8.<init>(r11, r13)
        L_0x00ba:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x00cc
            if (r13 != r5) goto L_0x00c6
            wx3.H(r11)
            goto L_0x0119
        L_0x00c6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x00cc:
            wx3.H(r11)
            r11 = r12
            nt8 r11 = (defpackage.nt8) r11
            if (r11 != 0) goto L_0x00d6
            r11 = r5
            goto L_0x00d7
        L_0x00d6:
            r11 = r3
        L_0x00d7:
            k77[] r13 = one.me.sdk.messagewrite.MessageWriteWidget.J0
            nu8 r13 = r2.u0()
            t0c r13 = r13.N0
            zqd r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            if (r13 == 0) goto L_0x00e9
            r13 = r5
            goto L_0x00ea
        L_0x00e9:
            r13 = r3
        L_0x00ea:
            nu8 r4 = r2.u0()
            t0c r4 = r4.V0
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x00f9
            r3 = r5
        L_0x00f9:
            if (r11 == 0) goto L_0x010a
            if (r13 != 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            nu8 r4 = r2.u0()
            pt8 r4 = r4.v()
            one.me.sdk.messagewrite.MessageWriteWidget.m0(r2, r4)
        L_0x010a:
            if (r11 == 0) goto L_0x0110
            if (r13 != 0) goto L_0x0119
            if (r3 != 0) goto L_0x0119
        L_0x0110:
            r8.X = r5
            java.lang.Object r11 = r1.a(r12, r8)
            if (r11 != r6) goto L_0x0119
            r0 = r6
        L_0x0119:
            return r0
        L_0x011a:
            boolean r8 = r13 instanceof defpackage.gv8
            if (r8 == 0) goto L_0x012b
            r8 = r13
            gv8 r8 = (defpackage.gv8) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x012b
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x0130
        L_0x012b:
            gv8 r8 = new gv8
            r8.<init>(r11, r13)
        L_0x0130:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x0142
            if (r13 != r5) goto L_0x013c
            wx3.H(r11)
            goto L_0x018f
        L_0x013c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x0142:
            wx3.H(r11)
            r11 = r12
            tt8 r11 = (defpackage.tt8) r11
            if (r11 != 0) goto L_0x014c
            r11 = r5
            goto L_0x014d
        L_0x014c:
            r11 = r3
        L_0x014d:
            k77[] r13 = one.me.sdk.messagewrite.MessageWriteWidget.J0
            nu8 r13 = r2.u0()
            t0c r13 = r13.P0
            zqd r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            if (r13 == 0) goto L_0x015f
            r13 = r5
            goto L_0x0160
        L_0x015f:
            r13 = r3
        L_0x0160:
            nu8 r4 = r2.u0()
            t0c r4 = r4.V0
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x016f
            r3 = r5
        L_0x016f:
            if (r11 == 0) goto L_0x0180
            if (r13 != 0) goto L_0x0180
            if (r3 == 0) goto L_0x0180
            nu8 r4 = r2.u0()
            pt8 r4 = r4.v()
            one.me.sdk.messagewrite.MessageWriteWidget.m0(r2, r4)
        L_0x0180:
            if (r11 == 0) goto L_0x0186
            if (r13 != 0) goto L_0x018f
            if (r3 != 0) goto L_0x018f
        L_0x0186:
            r8.X = r5
            java.lang.Object r11 = r1.a(r12, r8)
            if (r11 != r6) goto L_0x018f
            r0 = r6
        L_0x018f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv8.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
