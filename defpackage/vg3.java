package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vg3  reason: default package */
public final class vg3 extends l5e implements i26 {
    public final /* synthetic */ int A0;
    public b9c X;
    public long Y;
    public int Z;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ bh3 y0;
    public final /* synthetic */ bg3 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vg3(bh3 bh3, bg3 bg3, int i, Continuation continuation) {
        super(2, continuation);
        this.y0 = bh3;
        this.z0 = bg3;
        this.A0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vg3 vg3 = new vg3(this.y0, this.z0, this.A0, continuation);
        vg3.x0 = obj;
        return vg3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4 A[Catch:{ all -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9 A[Catch:{ all -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1 A[Catch:{ all -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            pu3 r0 = pu3.a
            int r2 = r1.w0
            jue r3 = jue.a
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x002b
            if (r2 != r5) goto L_0x0023
            int r0 = r1.Z
            long r7 = r1.Y
            b9c r2 = r1.X
            java.lang.Object r5 = r1.x0
            bh3 r5 = (defpackage.bh3) r5
            wx3.H(r18)     // Catch:{ all -> 0x0020 }
            goto L_0x009c
        L_0x0020:
            r0 = move-exception
            goto L_0x0130
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            int r2 = r1.Z
            long r7 = r1.Y
            java.lang.Object r9 = r1.x0
            bh3 r9 = (defpackage.bh3) r9
            wx3.H(r18)     // Catch:{ all -> 0x0020 }
            r10 = r18
            goto L_0x0074
        L_0x0039:
            wx3.H(r18)
            java.lang.Object r2 = r1.x0
            ou3 r2 = (ou3) r2
            bh3 r2 = r1.y0
            l05 r2 = r2.A0
            tg3 r7 = defpackage.tg3.a
            defpackage.taf.o(r2, r7)
            bg3 r2 = r1.z0
            long r7 = r2.a
            bh3 r2 = r1.y0
            int r9 = r1.A0
            t97 r10 = r2.Y     // Catch:{ all -> 0x0020 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x0020 }
            pk r10 = (defpackage.pk) r10     // Catch:{ all -> 0x0020 }
            bm9 r11 = new bm9     // Catch:{ all -> 0x0020 }
            r11.<init>((long) r7)     // Catch:{ all -> 0x0020 }
            r1.x0 = r2     // Catch:{ all -> 0x0020 }
            r1.Y = r7     // Catch:{ all -> 0x0020 }
            r1.Z = r9     // Catch:{ all -> 0x0020 }
            r1.w0 = r4     // Catch:{ all -> 0x0020 }
            gy9 r10 = (defpackage.gy9) r10     // Catch:{ all -> 0x0020 }
            java.lang.Object r10 = r10.K(r11, r1)     // Catch:{ all -> 0x0020 }
            if (r10 != r0) goto L_0x006f
            return r0
        L_0x006f:
            r16 = r9
            r9 = r2
            r2 = r16
        L_0x0074:
            b9c r10 = (defpackage.b9c) r10     // Catch:{ all -> 0x0020 }
            t97 r11 = r9.X     // Catch:{ all -> 0x0020 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x0020 }
            ap3 r11 = (defpackage.ap3) r11     // Catch:{ all -> 0x0020 }
            uj3 r12 = r10.c     // Catch:{ all -> 0x0020 }
            java.util.List r12 = java.util.Collections.singletonList(r12)     // Catch:{ all -> 0x0020 }
            mi3 r13 = defpackage.mi3.a     // Catch:{ all -> 0x0020 }
            r1.x0 = r9     // Catch:{ all -> 0x0020 }
            r1.X = r10     // Catch:{ all -> 0x0020 }
            r1.Y = r7     // Catch:{ all -> 0x0020 }
            r1.Z = r2     // Catch:{ all -> 0x0020 }
            r1.w0 = r5     // Catch:{ all -> 0x0020 }
            di3 r5 = r11.a     // Catch:{ all -> 0x0020 }
            java.util.List r5 = r5.t(r12, r13)     // Catch:{ all -> 0x0020 }
            if (r5 != r0) goto L_0x0099
            return r0
        L_0x0099:
            r0 = r2
            r5 = r9
            r2 = r10
        L_0x009c:
            grd r9 = r5.y0     // Catch:{ all -> 0x0020 }
        L_0x009e:
            java.lang.Object r10 = r9.getValue()     // Catch:{ all -> 0x0020 }
            r11 = r10
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0020 }
            r12.<init>()     // Catch:{ all -> 0x0020 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0020 }
        L_0x00ae:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x0020 }
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x0020 }
            r14 = r13
            bg3 r14 = (defpackage.bg3) r14     // Catch:{ all -> 0x0020 }
            long r14 = r14.a     // Catch:{ all -> 0x0020 }
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x00ae
            r12.add(r13)     // Catch:{ all -> 0x0020 }
            goto L_0x00ae
        L_0x00c5:
            boolean r10 = r9.b(r10, r12)     // Catch:{ all -> 0x0020 }
            if (r10 == 0) goto L_0x009e
            grd r7 = r5.y0     // Catch:{ all -> 0x0020 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0020 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0020 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r7 == 0) goto L_0x00f1
            t97 r0 = r5.X     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0020 }
            ap3 r0 = (defpackage.ap3) r0     // Catch:{ all -> 0x0020 }
            di3 r0 = r0.a     // Catch:{ all -> 0x0020 }
            r2 = 0
            r7 = 0
            r0.d(r7, r2, r2)     // Catch:{ all -> 0x0020 }
            l05 r0 = r5.A0     // Catch:{ all -> 0x0020 }
            og3 r2 = defpackage.og3.a     // Catch:{ all -> 0x0020 }
            defpackage.taf.o(r0, r2)     // Catch:{ all -> 0x0020 }
            goto L_0x012e
        L_0x00f1:
            int r7 = r5.x0     // Catch:{ all -> 0x0020 }
            if (r0 != r7) goto L_0x012e
            grd r0 = r5.y0     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0020 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0020 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0020 }
            r7 = r6
        L_0x0102:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0020 }
            if (r8 == 0) goto L_0x011c
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0020 }
            bg3 r8 = (defpackage.bg3) r8     // Catch:{ all -> 0x0020 }
            long r8 = r8.a     // Catch:{ all -> 0x0020 }
            uj3 r10 = r2.c     // Catch:{ all -> 0x0020 }
            long r10 = r10.Y     // Catch:{ all -> 0x0020 }
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            int r7 = r7 + 1
            goto L_0x0102
        L_0x011c:
            r7 = -1
        L_0x011d:
            if (r7 >= 0) goto L_0x0120
            r7 = r6
        L_0x0120:
            r5.x0 = r7     // Catch:{ all -> 0x0020 }
            l05 r0 = r5.A0     // Catch:{ all -> 0x0020 }
            sg3 r2 = new sg3     // Catch:{ all -> 0x0020 }
            int r5 = r5.x0     // Catch:{ all -> 0x0020 }
            r2.<init>(r5)     // Catch:{ all -> 0x0020 }
            defpackage.taf.o(r0, r2)     // Catch:{ all -> 0x0020 }
        L_0x012e:
            r2 = r3
            goto L_0x0135
        L_0x0130:
            kcc r2 = new kcc
            r2.<init>(r0)
        L_0x0135:
            boolean r0 = r2 instanceof kcc
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x014e
            bh3 r0 = r1.y0
            l05 r0 = r0.A0
            qg3 r2 = new qg3
            int r4 = defpackage.cic.p2
            hge r5 = new hge
            r5.<init>(r4)
            r2.<init>(r5, r6)
            defpackage.taf.o(r0, r2)
            goto L_0x015f
        L_0x014e:
            java.lang.Throwable r0 = mcc.a(r2)
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L_0x015f
            bh3 r2 = r1.y0
            java.lang.String r2 = r2.o
            java.lang.String r4 = "delete: failed"
            udd.s(r2, r4, r0)
        L_0x015f:
            bh3 r0 = r1.y0
            l05 r0 = r0.A0
            pg3 r1 = defpackage.pg3.a
            defpackage.taf.o(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg3.o(java.lang.Object):java.lang.Object");
    }
}
