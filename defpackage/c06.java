package defpackage;

/* renamed from: c06  reason: default package */
public final class c06 extends whd {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c06(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [kv2, java.lang.Object] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x012b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(w4 r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 17
            int r2 = r13.b
            switch(r2) {
                case 0: goto L_0x003e;
                case 1: goto L_0x0028;
                default: goto L_0x0008;
            }
        L_0x0008:
            i03 r0 = new i03
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = r14.c(r1)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r13 = r13.c
            t97 r13 = (defpackage.t97) r13
            java.lang.Object r13 = r13.getValue()
            cg4 r13 = (defpackage.cg4) r13
            java.lang.Class<we5> r2 = defpackage.we5.class
            java.lang.Object r14 = r14.c(r2)
            we5 r14 = (defpackage.we5) r14
            r0.<init>(r1, r13, r14)
            return r0
        L_0x0028:
            en0 r0 = new en0
            java.lang.Class<fr6> r1 = defpackage.fr6.class
            r7e r1 = r14.d(r1)
            java.lang.Class<ir6> r2 = defpackage.ir6.class
            r7e r14 = r14.d(r2)
            java.lang.Object r13 = r13.c
            gvf r13 = (defpackage.gvf) r13
            r0.<init>(r13, r1, r14)
            return r0
        L_0x003e:
            java.lang.Object r2 = r13.c
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Class<g2b> r3 = g2b.class
            java.lang.Object r3 = r14.c(r3)
            g2b r3 = (g2b) r3
            j2b r3 = (j2b) r3
            i03 r3 = r3.a
            java.lang.String r4 = "app.debug.fresco"
            x97 r3 = r3.g
            boolean r3 = r3.getBoolean(r4, r0)
            r2.set(r3)
            j06 r2 = defpackage.j06.a
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object r4 = r14.c(r3)
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Class<hr6> r5 = defpackage.hr6.class
            java.lang.Object r5 = r14.c(r5)
            hr6 r5 = (defpackage.hr6) r5
            java.lang.Class<x4a> r6 = x4a.class
            java.lang.Object r14 = r14.c(r6)
            x4a r14 = (x4a) r14
            java.lang.Object r13 = r13.c
            java.util.concurrent.atomic.AtomicBoolean r13 = (java.util.concurrent.atomic.AtomicBoolean) r13
            bk7 r6 = new bk7
            r6.<init>()
            java.util.List r6 = java.util.Collections.singletonList(r6)
            g06 r7 = new g06
            r7.<init>()
            defpackage.m75.a = r7
            boolean r7 = r13.get()
            if (r7 == 0) goto L_0x008f
            r7 = 2
            goto L_0x0090
        L_0x008f:
            r7 = 6
        L_0x0090:
            eo7 r8 = defpackage.m75.a
            r8.j(r7)
            y76 r7 = new y76
            r8 = 11
            r7.<init>(r8)
            defpackage.n06.a = r7
            kv2 r7 = new kv2
            r7.<init>()
            ydc r8 = new ydc
            r9 = 7
            r8.<init>(r9, r0)
            h06 r9 = new h06
            r9.<init>(r13)
            r8.c = r9
            r8.o = r7
            java.util.Iterator r6 = r6.iterator()
        L_0x00b6:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00d7
            java.lang.Object r9 = r6.next()
            wm4 r9 = (defpackage.wm4) r9
            java.lang.Object r10 = r8.b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x00cf
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r8.b = r10
        L_0x00cf:
            java.lang.Object r10 = r8.b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.add(r9)
            goto L_0x00b6
        L_0x00d7:
            duf r6 = new duf
            r6.<init>((ydc) r8)
            defpackage.n06.s()
            boolean r8 = defpackage.a06.b
            r9 = 5
            r10 = 1
            if (r8 == 0) goto L_0x00fb
            java.lang.Class<a06> r8 = defpackage.a06.class
            java.lang.String r11 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            eo7 r12 = defpackage.m75.a
            boolean r12 = r12.i(r9)
            if (r12 == 0) goto L_0x00fd
            eo7 r12 = defpackage.m75.a
            java.lang.String r8 = r8.getSimpleName()
            r12.w(r8, r11)
            goto L_0x00fd
        L_0x00fb:
            defpackage.a06.b = r10
        L_0x00fd:
            defpackage.wx3.g = r10
            java.lang.Class<kjd> r8 = defpackage.kjd.class
            monitor-enter(r8)
            dg9 r11 = defpackage.kjd.b     // Catch:{ all -> 0x01ce }
            if (r11 == 0) goto L_0x0107
            r0 = r10
        L_0x0107:
            monitor-exit(r8)     // Catch:{ all -> 0x01ce }
            r8 = 0
            if (r0 != 0) goto L_0x0153
            defpackage.n06.s()
            java.lang.String r0 = "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0146, IllegalAccessException -> 0x013d, InvocationTargetException -> 0x0134, NoSuchMethodException -> 0x012b }
            java.lang.String r10 = "init"
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ ClassNotFoundException -> 0x0146, IllegalAccessException -> 0x013d, InvocationTargetException -> 0x0134, NoSuchMethodException -> 0x012b }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r3)     // Catch:{ ClassNotFoundException -> 0x0146, IllegalAccessException -> 0x013d, InvocationTargetException -> 0x0134, NoSuchMethodException -> 0x012b }
            java.lang.Object[] r3 = new java.lang.Object[]{r4}     // Catch:{ ClassNotFoundException -> 0x0146, IllegalAccessException -> 0x013d, InvocationTargetException -> 0x0134, NoSuchMethodException -> 0x012b }
            r0.invoke(r8, r3)     // Catch:{ ClassNotFoundException -> 0x0146, IllegalAccessException -> 0x013d, InvocationTargetException -> 0x0134, NoSuchMethodException -> 0x012b }
        L_0x0125:
            defpackage.n06.s()
            goto L_0x0153
        L_0x0129:
            r13 = move-exception
            goto L_0x014f
        L_0x012b:
            smc r0 = new smc     // Catch:{ all -> 0x0129 }
            r0.<init>(r1)     // Catch:{ all -> 0x0129 }
            defpackage.kjd.A(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x0134:
            smc r0 = new smc     // Catch:{ all -> 0x0129 }
            r0.<init>(r1)     // Catch:{ all -> 0x0129 }
            defpackage.kjd.A(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x013d:
            smc r0 = new smc     // Catch:{ all -> 0x0129 }
            r0.<init>(r1)     // Catch:{ all -> 0x0129 }
            defpackage.kjd.A(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x0146:
            smc r0 = new smc     // Catch:{ all -> 0x0129 }
            r0.<init>(r1)     // Catch:{ all -> 0x0129 }
            defpackage.kjd.A(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x014f:
            defpackage.n06.s()
            throw r13
        L_0x0153:
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.Class<ir6> r1 = defpackage.ir6.class
            monitor-enter(r1)
            ir6 r3 = defpackage.ir6.p     // Catch:{ all -> 0x0174 }
            if (r3 == 0) goto L_0x0176
            java.lang.Class<ir6> r3 = defpackage.ir6.class
            java.lang.String r8 = "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."
            eo7 r10 = defpackage.m75.a     // Catch:{ all -> 0x0174 }
            boolean r9 = r10.i(r9)     // Catch:{ all -> 0x0174 }
            if (r9 == 0) goto L_0x0176
            eo7 r9 = defpackage.m75.a     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0174 }
            r9.w(r3, r8)     // Catch:{ all -> 0x0174 }
            goto L_0x0176
        L_0x0174:
            r13 = move-exception
            goto L_0x01cc
        L_0x0176:
            ir6 r3 = new ir6     // Catch:{ all -> 0x0174 }
            r3.<init>(r5)     // Catch:{ all -> 0x0174 }
            defpackage.ir6.p = r3     // Catch:{ all -> 0x0174 }
            monitor-exit(r1)
            defpackage.n06.s()
            zwa r1 = new zwa
            r1.<init>(r0, r6)
            defpackage.a06.a = r1
            com.facebook.drawee.view.SimpleDraweeView.A0 = r1
            defpackage.n06.s()
            defpackage.n06.s()
            ir6 r0 = defpackage.ir6.g()
            android.content.res.Resources r1 = r4.getResources()
            bd4 r3 = defpackage.bd4.d()
            h54 r4 = r0.a()
            hr6 r5 = r0.b
            di9 r5 = r5.v
            r5.getClass()
            i06 r5 = new i06
            java.util.concurrent.ExecutorService r14 = r14.a()
            r5.<init>(r14)
            qe4 r14 = r0.d()
            java.lang.Object r0 = r6.a
            zy r0 = (zy) r0
            h06 r6 = new h06
            r6.<init>(r13)
            r7.a = r1
            r7.b = r3
            r7.c = r4
            r7.o = r5
            r7.X = r14
            r7.Y = r0
            r7.Z = r6
            return r2
        L_0x01cc:
            monitor-exit(r1)     // Catch:{ all -> 0x0174 }
            throw r13
        L_0x01ce:
            r13 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01ce }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c06.b(w4):java.lang.Object");
    }
}
