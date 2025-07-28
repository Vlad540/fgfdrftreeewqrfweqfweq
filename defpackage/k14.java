package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k14  reason: default package */
public final class k14 extends l5e implements u16 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k14(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.X = i;
        this.Z = obj;
        this.w0 = obj2;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new k14((m14) this.Z, (zb9) this.w0, continuation, 0).o(jue.a);
            case 1:
                return new k14((rj5) this.Z, (l7c) this.w0, continuation, 1).o(jue.a);
            default:
                return new k14((zec) this.Z, (u16) this.w0, continuation, 2).o(jue.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.X
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00a5;
                default: goto L_0x0005;
            }
        L_0x0005:
            pu3 r0 = pu3.a
            int r1 = r10.Y
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r5) goto L_0x0016
            wx3.H(r11)
            goto L_0x0059
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001e:
            wx3.H(r11)
            r6 = r3
        L_0x0022:
            hu3 r11 = r10.b
            boolean r11 = lp.u(r11)
            if (r11 == 0) goto L_0x00a2
            java.lang.Object r11 = r10.Z
            zec r11 = (defpackage.zec) r11
            dsd r11 = r11.a()
            r10.Y = r5
            r11.getClass()
            java.lang.String r1 = "\n            SELECT id FROM events\n            WHERE status = 0\n                AND id > ?\n            ORDER BY id ASC\n            LIMIT ?\n        "
            r8 = 2
            pec r1 = pec.a(r8, r1)
            r1.j(r5, r6)
            long r6 = (long) r2
            r1.j(r8, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            csd r7 = new csd
            r8 = 2
            r7.<init>(r11, r1, r8)
            aec r11 = r11.a
            java.lang.Object r11 = r1g.g(r11, r6, r7, r10)
            if (r11 != r0) goto L_0x0059
            goto L_0x00a4
        L_0x0059:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r1 = r10.Z
            zec r1 = (defpackage.zec) r1
            java.lang.String r1 = r1.c
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0066
            goto L_0x007c
        L_0x0066:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x007c
            tn7 r7 = defpackage.tn7.X
            int r8 = r11.size()
            java.lang.String r9 = "Selecting batch of waiting to send logs, ids size="
            java.lang.String r8 = defpackage.wn6.h(r8, r9)
            r9 = 0
            r6.d(r7, r1, r8, r9)
        L_0x007c:
            java.lang.Object r1 = r10.w0
            u16 r1 = (u16) r1
            r1.invoke(r11)
            java.lang.Object r1 = o23.f0(r11)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0090
            long r6 = r1.longValue()
            goto L_0x0091
        L_0x0090:
            r6 = r3
        L_0x0091:
            int r11 = r11.size()
            if (r11 >= r2) goto L_0x0022
            java.lang.Object r10 = r10.Z
            zec r10 = (defpackage.zec) r10
            java.lang.String r10 = r10.c
            java.lang.String r11 = "Last batch is not size of limit, stopping cycle"
            udd.q(r10, r11)
        L_0x00a2:
            jue r0 = jue.a
        L_0x00a4:
            return r0
        L_0x00a5:
            pu3 r0 = pu3.a
            int r1 = r10.Y
            r2 = 0
            java.lang.Object r3 = r10.w0
            l7c r3 = (l7c) r3
            r4 = 1
            if (r1 == 0) goto L_0x00bf
            if (r1 != r4) goto L_0x00b7
            wx3.H(r11)
            goto L_0x00d6
        L_0x00b7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x00bf:
            wx3.H(r11)
            kotlinx.coroutines.internal.Symbol r11 = wr9.a
            java.lang.Object r1 = r3.a
            if (r1 != r11) goto L_0x00c9
            r1 = r2
        L_0x00c9:
            r10.Y = r4
            java.lang.Object r11 = r10.Z
            rj5 r11 = (rj5) r11
            java.lang.Object r10 = r11.a(r1, r10)
            if (r10 != r0) goto L_0x00d6
            goto L_0x00da
        L_0x00d6:
            r3.a = r2
            jue r0 = jue.a
        L_0x00da:
            return r0
        L_0x00db:
            pu3 r0 = pu3.a
            int r1 = r10.Y
            r2 = 1
            if (r1 == 0) goto L_0x00f0
            if (r1 != r2) goto L_0x00e8
            wx3.H(r11)
            goto L_0x0118
        L_0x00e8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x00f0:
            wx3.H(r11)
            java.lang.Object r11 = r10.Z
            m14 r11 = (defpackage.m14) r11
            d14 r1 = r11.g
            d14 r9 = new d14
            zb9 r6 = r1.e
            java.lang.Object r3 = r10.w0
            zb9 r3 = (zb9) r3
            r6.b(r3)
            r8 = 0
            boolean r4 = r1.a
            boolean r5 = r1.b
            boolean r7 = r1.c
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r10.Y = r2
            java.lang.Object r10 = defpackage.m14.a(r11, r9, r10)
            if (r10 != r0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            jue r0 = jue.a
        L_0x011a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k14.o(java.lang.Object):java.lang.Object");
    }
}
