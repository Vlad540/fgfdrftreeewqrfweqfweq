package defpackage;

/* renamed from: lvc  reason: default package */
public final class lvc implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ qvc c;

    public /* synthetic */ lvc(rj5 rj5, qvc qvc, int i) {
        this.a = i;
        this.b = rj5;
        this.c = qvc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00da A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L_0x009c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r11 instanceof defpackage.nvc
            if (r0 == 0) goto L_0x0018
            r0 = r11
            nvc r0 = (defpackage.nvc) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            nvc r0 = new nvc
            r0.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            wx3.H(r11)
            goto L_0x0099
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            wx3.H(r11)
            wia r10 = (wia) r10
            java.lang.Object r11 = r10.a
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r10.b
            o46 r10 = (defpackage.o46) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = q23.H(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0050:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r11.next()
            o46 r4 = (defpackage.o46) r4
            p46 r5 = new p46
            qvc r6 = r9.c
            gl7 r6 = r6.b
            n46 r7 = r4.a
            bv6 r6 = (defpackage.bv6) r6
            java.util.concurrent.ConcurrentHashMap r6 = r6.F0
            java.lang.Object r6 = r6.get(r7)
            yk7 r6 = (defpackage.yk7) r6
            r7 = 0
            if (r6 == 0) goto L_0x0074
            android.net.Uri r6 = r6.z0
            goto L_0x0075
        L_0x0074:
            r6 = r7
        L_0x0075:
            if (r10 == 0) goto L_0x007d
            n46 r7 = r10.a
            java.lang.String r7 = r7.b()
        L_0x007d:
            n46 r8 = r4.a
            java.lang.String r8 = r8.b()
            boolean r7 = hhd.f(r7, r8)
            r5.<init>(r4, r6, r7)
            r2.add(r5)
            goto L_0x0050
        L_0x008e:
            r0.X = r3
            rj5 r9 = r9.b
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            jue r1 = jue.a
        L_0x009b:
            return r1
        L_0x009c:
            boolean r0 = r11 instanceof defpackage.kvc
            if (r0 == 0) goto L_0x00af
            r0 = r11
            kvc r0 = (defpackage.kvc) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00af
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00b4
        L_0x00af:
            kvc r0 = new kvc
            r0.<init>(r9, r11)
        L_0x00b4:
            java.lang.Object r11 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00cc
            if (r2 != r3) goto L_0x00c4
            wx3.H(r11)
            goto L_0x0127
        L_0x00c4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x00cc:
            wx3.H(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00da:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x011c
            java.lang.Object r2 = r10.next()
            o46 r2 = (defpackage.o46) r2
            boolean r4 = r2.d
            if (r4 == 0) goto L_0x00ff
            k46 r4 = defpackage.k46.a
            n46 r5 = r2.a
            boolean r4 = hhd.f(r5, r4)
            if (r4 != 0) goto L_0x00ff
            l46 r4 = defpackage.l46.a
            boolean r4 = hhd.f(r5, r4)
            if (r4 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r4 = 0
            goto L_0x0100
        L_0x00ff:
            r4 = r3
        L_0x0100:
            qvc r5 = r9.c
            evc r5 = r5.c
            boolean r6 = r5.a
            r7 = 0
            if (r6 == 0) goto L_0x010d
            if (r4 == 0) goto L_0x010d
        L_0x010b:
            r2 = r7
            goto L_0x0116
        L_0x010d:
            boolean r4 = r5.b
            if (r4 != 0) goto L_0x0116
            int r4 = r2.b
            if (r4 != 0) goto L_0x0116
            goto L_0x010b
        L_0x0116:
            if (r2 == 0) goto L_0x00da
            r11.add(r2)
            goto L_0x00da
        L_0x011c:
            r0.X = r3
            rj5 r9 = r9.b
            java.lang.Object r9 = r9.a(r11, r0)
            if (r9 != r1) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            jue r1 = jue.a
        L_0x0129:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvc.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
