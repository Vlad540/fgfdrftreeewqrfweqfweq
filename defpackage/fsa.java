package defpackage;

/* renamed from: fsa  reason: default package */
public final class fsa implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ ksa c;

    public /* synthetic */ fsa(rj5 rj5, ksa ksa, int i) {
        this.a = i;
        this.b = rj5;
        this.c = ksa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r0.a
            switch(r3) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0058;
                default: goto L_0x000b;
            }
        L_0x000b:
            boolean r3 = r2 instanceof defpackage.isa
            if (r3 == 0) goto L_0x001e
            r3 = r2
            isa r3 = (defpackage.isa) r3
            int r4 = r3.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.X = r4
            goto L_0x0023
        L_0x001e:
            isa r3 = new isa
            r3.<init>(r0, r2)
        L_0x0023:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            jue r6 = defpackage.jue.a
            r7 = 1
            if (r5 == 0) goto L_0x003c
            if (r5 != r7) goto L_0x0034
            defpackage.wx3.H(r2)
            goto L_0x0056
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            defpackage.wx3.H(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            ksa r1 = r0.c
            ok3 r1 = r1.o
            r1.b()
            r3.X = r7
            rj5 r0 = r0.b
            java.lang.Object r0 = r0.a(r6, r3)
            if (r0 != r4) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r4 = r6
        L_0x0057:
            return r4
        L_0x0058:
            boolean r3 = r2 instanceof defpackage.hsa
            if (r3 == 0) goto L_0x006b
            r3 = r2
            hsa r3 = (defpackage.hsa) r3
            int r4 = r3.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x006b
            int r4 = r4 - r5
            r3.X = r4
            goto L_0x0070
        L_0x006b:
            hsa r3 = new hsa
            r3.<init>(r0, r2)
        L_0x0070:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            r6 = 1
            if (r5 == 0) goto L_0x0088
            if (r5 != r6) goto L_0x0080
            defpackage.wx3.H(r2)
            goto L_0x0136
        L_0x0080:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0088:
            defpackage.wx3.H(r2)
            rj5 r2 = r0.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            ksa r0 = r0.c
            java.lang.String r5 = r0.b
            java.lang.String r7 = "all.chat.folder"
            boolean r5 = defpackage.hhd.f(r5, r7)
            if (r5 != 0) goto L_0x009d
            goto L_0x012d
        L_0x009d:
            t97 r5 = r0.z0
            java.lang.Object r5 = r5.getValue()
            xzc r5 = (xzc) r5
            vqc r5 = (vqc) r5
            boolean r5 = r5.u()
            if (r5 != 0) goto L_0x00af
            goto L_0x012d
        L_0x00af:
            t97 r0 = r0.A0
            java.lang.Object r0 = r0.getValue()
            qkc r0 = (qkc) r0
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            i22 r0 = (i22) r0
            if (r0 != 0) goto L_0x00c3
            goto L_0x012d
        L_0x00c3:
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ r6
            r7 = 0
            if (r5 == 0) goto L_0x00ef
            java.util.Iterator r5 = r1.iterator()
            r8 = r7
        L_0x00d0:
            boolean r9 = r5.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x00e9
            java.lang.Object r9 = r5.next()
            ira r9 = (defpackage.ira) r9
            long r11 = r9.a
            long r13 = r0.a
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00e6
            goto L_0x00ea
        L_0x00e6:
            int r8 = r8 + 1
            goto L_0x00d0
        L_0x00e9:
            r8 = r10
        L_0x00ea:
            if (r8 == r10) goto L_0x00ef
            r1.remove(r8)
        L_0x00ef:
            ira r5 = new ira
            long r12 = r0.a
            long r14 = r0.e()
            r0.h0()
            java.lang.CharSequence r8 = r0.y0
            fj0 r9 = fj0.c
            ej0 r10 = ej0.a
            java.lang.String r9 = r0.f(r9, r10)
            if (r9 == 0) goto L_0x010d
            android.net.Uri r9 = android.net.Uri.parse(r9)
        L_0x010a:
            r18 = r9
            goto L_0x010f
        L_0x010d:
            r9 = 0
            goto L_0x010a
        L_0x010f:
            zta r9 = new zta
            long r10 = r0.a
            yta r0 = defpackage.yta.a
            r9.<init>(r10, r0)
            r23 = 1
            r17 = 0
            r19 = 0
            r20 = 0
            java.lang.String r22 = ""
            r11 = r5
            r16 = r8
            r21 = r9
            r11.<init>(r12, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.add(r7, r5)
        L_0x012d:
            r3.X = r6
            java.lang.Object r0 = r2.a(r1, r3)
            if (r0 != r4) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            jue r4 = defpackage.jue.a
        L_0x0138:
            return r4
        L_0x0139:
            boolean r3 = r2 instanceof defpackage.esa
            if (r3 == 0) goto L_0x014c
            r3 = r2
            esa r3 = (defpackage.esa) r3
            int r4 = r3.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x014c
            int r4 = r4 - r5
            r3.X = r4
            goto L_0x0151
        L_0x014c:
            esa r3 = new esa
            r3.<init>(r0, r2)
        L_0x0151:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            r6 = 1
            if (r5 == 0) goto L_0x0168
            if (r5 != r6) goto L_0x0160
            defpackage.wx3.H(r2)
            goto L_0x019c
        L_0x0160:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0168:
            defpackage.wx3.H(r2)
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            ksa r2 = r0.c
            s16 r5 = r2.Y
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x019c
            t0c r2 = r2.E0
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x019c
            r3.X = r6
            rj5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            jue r4 = defpackage.jue.a
        L_0x019e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsa.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
