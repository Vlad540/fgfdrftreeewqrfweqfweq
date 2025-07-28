package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eg2  reason: default package */
public final class eg2 extends l5e implements i26 {
    public final /* synthetic */ String A0;
    public Object X;
    public cg2 Y;
    public i22 Z;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ ah2 y0;
    public final /* synthetic */ long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eg2(ah2 ah2, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.y0 = ah2;
        this.z0 = j;
        this.A0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eg2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eg2 eg2 = new eg2(this.y0, this.z0, this.A0, continuation);
        eg2.x0 = obj;
        return eg2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: cg2} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e0, code lost:
        r4 = r3.D0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r8 = r16
            pu3 r0 = defpackage.pu3.a
            int r1 = r8.w0
            r9 = 0
            r10 = 5
            r2 = 3
            r3 = 2
            r11 = 1
            if (r1 == 0) goto L_0x0055
            if (r1 == r11) goto L_0x0045
            if (r1 == r3) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            java.lang.Object r0 = r8.X
            r1 = r0
            cg2 r1 = (defpackage.cg2) r1
            java.lang.Object r0 = r8.x0
            r2 = r0
            i68 r2 = (defpackage.i68) r2
            defpackage.wx3.H(r17)     // Catch:{ all -> 0x0025 }
            r12 = r1
            r1 = r17
            goto L_0x0116
        L_0x0025:
            r0 = move-exception
            goto L_0x011f
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            i22 r1 = r8.Z
            cg2 r3 = r8.Y
            java.lang.Object r4 = r8.X
            i68 r4 = (defpackage.i68) r4
            java.lang.Object r5 = r8.x0
            ou3 r5 = (defpackage.ou3) r5
            defpackage.wx3.H(r17)
            r12 = r3
            r13 = r4
            r3 = r17
            goto L_0x00dc
        L_0x0045:
            cg2 r1 = r8.Y
            java.lang.Object r4 = r8.X
            i68 r4 = (defpackage.i68) r4
            java.lang.Object r5 = r8.x0
            ou3 r5 = (defpackage.ou3) r5
            defpackage.wx3.H(r17)
            r6 = r17
            goto L_0x00c0
        L_0x0055:
            defpackage.wx3.H(r17)
            java.lang.Object r1 = r8.x0
            r5 = r1
            ou3 r5 = (defpackage.ou3) r5
            ah2 r1 = r8.y0
            grd r1 = r1.T0
            java.lang.Object r1 = r1.getValue()
            ag2 r1 = (defpackage.ag2) r1
            java.util.List r1 = r1.a
            long r6 = r8.z0
            java.lang.String r4 = r8.A0
            java.util.Iterator r1 = r1.iterator()
        L_0x0071:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0091
            java.lang.Object r12 = r1.next()
            r13 = r12
            k68 r13 = (defpackage.k68) r13
            long r14 = r13.j()
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0071
            java.lang.String r13 = r13.x()
            boolean r13 = defpackage.hhd.f(r4, r13)
            if (r13 == 0) goto L_0x0071
            goto L_0x0092
        L_0x0091:
            r12 = r9
        L_0x0092:
            boolean r1 = r12 instanceof defpackage.i68
            if (r1 == 0) goto L_0x009a
            i68 r12 = (defpackage.i68) r12
            r4 = r12
            goto L_0x009b
        L_0x009a:
            r4 = r9
        L_0x009b:
            cg2 r1 = new cg2
            r1.<init>((defpackage.i68) r4, (int) r3)
            ah2 r6 = r8.y0
            grd r6 = r6.Z0
            r6.m(r9, r1)
            ah2 r6 = r8.y0
            bv2 r6 = r6.w()
            ah2 r7 = r8.y0
            long r12 = r7.b
            r8.x0 = r5
            r8.X = r4
            r8.Y = r1
            r8.w0 = r11
            java.lang.Object r6 = r6.d(r12, r8)
            if (r6 != r0) goto L_0x00c0
            return r0
        L_0x00c0:
            i22 r6 = (i22) r6
            ah2 r7 = r8.y0
            b29 r7 = r7.w0
            long r12 = r8.z0
            r8.x0 = r5
            r8.X = r4
            r8.Y = r1
            r8.Z = r6
            r8.w0 = r3
            java.lang.Object r3 = r7.a(r12, r8)
            if (r3 != r0) goto L_0x00d9
            return r0
        L_0x00d9:
            r12 = r1
            r13 = r4
            r1 = r6
        L_0x00dc:
            vo8 r3 = (vo8) r3
            if (r3 == 0) goto L_0x00eb
            jj7 r4 = r3.D0
            if (r4 == 0) goto L_0x00eb
            java.lang.String r5 = r8.A0
            o10 r4 = r4.w(r5)
            goto L_0x00ec
        L_0x00eb:
            r4 = r9
        L_0x00ec:
            if (r4 == 0) goto L_0x0184
            ah2 r5 = r8.y0
            t97 r5 = r5.F0     // Catch:{ all -> 0x011c }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x011c }
            c4f r5 = (c4f) r5     // Catch:{ all -> 0x011c }
            o62 r1 = r1.b     // Catch:{ all -> 0x011c }
            long r6 = r1.a     // Catch:{ all -> 0x011c }
            long r14 = r3.c     // Catch:{ all -> 0x011c }
            r8.x0 = r13     // Catch:{ all -> 0x011c }
            r8.X = r12     // Catch:{ all -> 0x011c }
            r8.Y = r9     // Catch:{ all -> 0x011c }
            r8.Z = r9     // Catch:{ all -> 0x011c }
            r8.w0 = r2     // Catch:{ all -> 0x011c }
            r1 = r5
            r2 = r4
            r3 = r6
            r5 = r14
            r7 = r16
            java.lang.Object r1 = r1.b(r2, r3, r5, r7)     // Catch:{ all -> 0x011c }
            if (r1 != r0) goto L_0x0115
            return r0
        L_0x0115:
            r2 = r13
        L_0x0116:
            v2f r1 = (v2f) r1     // Catch:{ all -> 0x0119 }
            goto L_0x0126
        L_0x0119:
            r0 = move-exception
            r1 = r12
            goto L_0x011f
        L_0x011c:
            r0 = move-exception
            r1 = r12
            r2 = r13
        L_0x011f:
            kcc r3 = new kcc
            r3.<init>(r0)
            r12 = r1
            r1 = r3
        L_0x0126:
            boolean r0 = r1 instanceof defpackage.kcc
            if (r0 == 0) goto L_0x012b
            r1 = r9
        L_0x012b:
            v2f r1 = (v2f) r1
            if (r1 != 0) goto L_0x013b
            ah2 r0 = r8.y0
            l05 r0 = r0.R0
            c05 r3 = new c05
            r3.<init>(r10, r11)
            taf.o(r0, r3)
        L_0x013b:
            ah2 r0 = r8.y0
            java.lang.String r0 = r0.A0
            long r3 = r8.z0
            java.lang.String r5 = r8.A0
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x0148
            goto L_0x0167
        L_0x0148:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0167
            tn7 r7 = tn7.X
            java.lang.String r10 = "Media viewer. Get video content msg:"
            java.lang.String r11 = ", attach:"
            java.lang.StringBuilder r3 = m4b.j(r10, r3, r11, r5)
            java.lang.String r4 = ", content:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r6.d(r7, r0, r3, r9)
        L_0x0167:
            ah2 r0 = r8.y0
            k68 r0 = r0.x()
            if (r0 == 0) goto L_0x0190
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0190
            ah2 r0 = r8.y0
            grd r0 = r0.Z0
            k68 r2 = r12.a
            cg2 r3 = new cg2
            r3.<init>((defpackage.k68) r2, (v2f) r1)
            r0.m(r9, r3)
            goto L_0x0190
        L_0x0184:
            ah2 r0 = r8.y0
            l05 r0 = r0.R0
            c05 r1 = new c05
            r1.<init>(r10, r11)
            taf.o(r0, r1)
        L_0x0190:
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg2.o(java.lang.Object):java.lang.Object");
    }
}
