package defpackage;

import android.content.Context;

/* renamed from: rne  reason: default package */
public final /* synthetic */ class rne implements Runnable {
    public final /* synthetic */ yn7 X;
    public final /* synthetic */ mv4 Y;
    public final /* synthetic */ ik Z;
    public final /* synthetic */ ov3 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ i3d c;
    public final /* synthetic */ u9e o;
    public final /* synthetic */ j3d w0;
    public final /* synthetic */ oa2 x0;

    public /* synthetic */ rne(ov3 ov3, Context context, i3d i3d, u9e u9e, yn7 yn7, mv4 mv4, ik ikVar, j3d j3d, oa2 oa2) {
        this.a = ov3;
        this.b = context;
        this.c = i3d;
        this.o = u9e;
        this.X = yn7;
        this.Y = mv4;
        this.Z = ikVar;
        this.w0 = j3d;
        this.x0 = oa2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03a2, code lost:
        if ((r7.i + ((long) 14400000)) <= java.lang.System.currentTimeMillis()) goto L_0x03a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0271 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0115 A[Catch:{ all -> 0x0178 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r0 = r32
            r4 = 1
            ov3 r5 = r0.a
            android.content.Context r6 = r0.b
            i3d r7 = r0.c
            u9e r8 = r0.o
            yn7 r9 = r0.X
            mv4 r15 = r0.Y
            ik r14 = r0.Z
            j3d r13 = r0.w0
            oa2 r12 = r0.x0
            hw4 r16 = hw4.a
            boolean r0 = r5.b
            java.lang.String r17 = "Cannot get prev tags after clear"
            java.lang.String r18 = "Cannot get prev logs after clear"
            r10 = 0
            if (r0 == 0) goto L_0x027f
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 >= r3) goto L_0x0028
            goto L_0x027f
        L_0x0028:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = d4.t(r0)     // Catch:{ Exception -> 0x027f }
            java.lang.String r3 = xs7.B()
            java.util.Iterator r19 = r0.iterator()
        L_0x003c:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x027f
            java.lang.Object r0 = r19.next()
            android.app.ApplicationExitInfo r20 = d4.e(r0)
            int r0 = d4.b(r20)
            r1 = 6
            if (r0 == r1) goto L_0x0052
            goto L_0x003c
        L_0x0052:
            java.lang.String r0 = d4.o(r20)
            boolean r0 = hhd.f(r0, r3)
            if (r0 != 0) goto L_0x0060
            d4.v(r20)
            goto L_0x003c
        L_0x0060:
            r7.b()
            long r1 = r7.g
            long r23 = d4.d(r20)
            int r0 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            d4.B(r20)
            goto L_0x003c
        L_0x0071:
            java.io.InputStream r0 = d4.n(r20)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0097
            java.nio.charset.Charset r1 = e22.a     // Catch:{ Exception -> 0x0097 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0097 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0097 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0097 }
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = n1g.S(r1)     // Catch:{ all -> 0x008d }
            urd.l(r1, r10)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0098
        L_0x008d:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            r23 = r0
            urd.l(r1, r2)     // Catch:{ Exception -> 0x0097 }
            throw r23     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            r0 = r10
        L_0x0098:
            if (r0 == 0) goto L_0x00a0
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00ae
        L_0x00a0:
            r25 = r3
            r22 = r12
            r30 = r13
            r1 = r14
            r4 = r15
            r2 = 3
            r3 = 2
            r21 = -1
            goto L_0x027b
        L_0x00ae:
            d4.B(r20)
            r7.b()
            c9e r1 = r7.h
            if (r1 != 0) goto L_0x00b9
            goto L_0x003c
        L_0x00b9:
            long r23 = d4.d(r20)
            java.io.File r2 = r14.a()
            boolean r20 = r2.exists()
            if (r20 == 0) goto L_0x00cd
            boolean r20 = r2.isDirectory()
            if (r20 != 0) goto L_0x00d7
        L_0x00cd:
            r25 = r3
            r28 = r12
            r29 = r13
            r21 = -1
            goto L_0x01a4
        L_0x00d7:
            java.io.File[] r10 = r2.listFiles()     // Catch:{ all -> 0x0184 }
            if (r10 == 0) goto L_0x018d
            r11 = r10
            java.lang.Comparable[] r11 = (java.lang.Comparable[]) r11     // Catch:{ all -> 0x0184 }
            r25 = r3
            int r3 = r11.length     // Catch:{ all -> 0x0186 }
            if (r3 <= r4) goto L_0x00e8
            java.util.Arrays.sort(r11)     // Catch:{ all -> 0x0186 }
        L_0x00e8:
            int r3 = r10.length     // Catch:{ all -> 0x0186 }
            r11 = 2
            int r3 = r3 / r11
            int r3 = r3 - r4
            if (r3 >= 0) goto L_0x00f1
        L_0x00ee:
            r21 = -1
            goto L_0x010d
        L_0x00f1:
            int r11 = r10.length     // Catch:{ all -> 0x0186 }
            int r11 = r11 - r4
            if (r3 < 0) goto L_0x00ee
            r4 = 0
        L_0x00f6:
            r20 = r10[r4]     // Catch:{ all -> 0x0109 }
            r26 = r10[r11]     // Catch:{ all -> 0x0109 }
            r10[r4] = r26     // Catch:{ all -> 0x0109 }
            r10[r11] = r20     // Catch:{ all -> 0x0109 }
            r21 = -1
            int r11 = r11 + -1
            if (r4 == r3) goto L_0x010d
            r20 = 1
            int r4 = r4 + 1
            goto L_0x00f6
        L_0x0109:
            r21 = -1
            goto L_0x0178
        L_0x010d:
            lg7 r3 = hwf.c()     // Catch:{ all -> 0x0178 }
            int r4 = r10.length     // Catch:{ all -> 0x0178 }
            r11 = 0
        L_0x0113:
            if (r11 >= r4) goto L_0x017b
            r20 = r10[r11]     // Catch:{ all -> 0x0178 }
            r26 = r4
            java.lang.String r4 = r20.getName()     // Catch:{ all -> 0x0178 }
            r27 = r10
            p7c r10 = defpackage.ik.b     // Catch:{ all -> 0x0178 }
            java.util.regex.Pattern r10 = r10.a     // Catch:{ all -> 0x0178 }
            java.util.regex.Matcher r4 = r10.matcher(r4)     // Catch:{ all -> 0x0178 }
            boolean r10 = r4.matches()     // Catch:{ all -> 0x0178 }
            if (r10 != 0) goto L_0x0131
            r28 = r12
            r10 = 0
            goto L_0x013a
        L_0x0131:
            mn r10 = new mn     // Catch:{ all -> 0x0178 }
            r28 = r12
            r12 = 21
            r10.<init>(r12, r4)     // Catch:{ all -> 0x0175 }
        L_0x013a:
            if (r10 != 0) goto L_0x0140
            r29 = r13
        L_0x013e:
            r4 = 1
            goto L_0x016b
        L_0x0140:
            java.lang.Object r4 = r10.c     // Catch:{ all -> 0x0175 }
            nv7 r4 = (nv7) r4     // Catch:{ all -> 0x0175 }
            if (r4 != 0) goto L_0x014d
            nv7 r4 = new nv7     // Catch:{ all -> 0x0175 }
            r4.<init>(r10)     // Catch:{ all -> 0x0175 }
            r10.c = r4     // Catch:{ all -> 0x0175 }
        L_0x014d:
            java.lang.Object r4 = r10.c     // Catch:{ all -> 0x0175 }
            nv7 r4 = (nv7) r4     // Catch:{ all -> 0x0175 }
            r10 = 1
            java.lang.Object r4 = r4.get(r10)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0175 }
            r29 = r13
            long r12 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x01a1 }
            hk r4 = new hk     // Catch:{ all -> 0x01a1 }
            java.lang.String r10 = ng5.M(r20)     // Catch:{ all -> 0x01a1 }
            r4.<init>(r12, r10)     // Catch:{ all -> 0x01a1 }
            r3.add(r4)     // Catch:{ all -> 0x01a1 }
            goto L_0x013e
        L_0x016b:
            int r11 = r11 + r4
            r4 = r26
            r10 = r27
            r12 = r28
            r13 = r29
            goto L_0x0113
        L_0x0175:
            r29 = r13
            goto L_0x01a1
        L_0x0178:
            r28 = r12
            goto L_0x0175
        L_0x017b:
            r28 = r12
            r29 = r13
            lg7 r2 = hwf.a(r3)     // Catch:{ all -> 0x01a1 }
            goto L_0x01a6
        L_0x0184:
            r25 = r3
        L_0x0186:
            r28 = r12
            r29 = r13
            r21 = -1
            goto L_0x01a1
        L_0x018d:
            r25 = r3
            r28 = r12
            r29 = r13
            r21 = -1
            java.lang.String r3 = "Required value was null."
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a1 }
            r4.<init>(r3)     // Catch:{ all -> 0x01a1 }
            throw r4     // Catch:{ all -> 0x01a1 }
        L_0x01a1:
            ng5.J(r2)
        L_0x01a4:
            r2 = r16
        L_0x01a6:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x01b1
            r10 = 10
            r11 = 4
            goto L_0x022a
        L_0x01b1:
            java.lang.String r3 = "\nDALVIK THREADS"
            r4 = 6
            r10 = 0
            int r3 = h0e.a0(r0, r3, r10, r10, r4)
            if (r3 >= 0) goto L_0x01bf
            r3 = r21
            r11 = 4
            goto L_0x01e1
        L_0x01bf:
            java.lang.String r4 = "\n\"main\""
            r11 = 4
            int r4 = h0e.a0(r0, r4, r3, r10, r11)
            if (r4 >= 0) goto L_0x01d7
            r12 = 1
            int r3 = r3 + r12
            java.lang.String r4 = "\n"
            int r3 = h0e.a0(r0, r4, r3, r10, r11)
            if (r3 >= 0) goto L_0x01d5
            r3 = r21
            goto L_0x01e1
        L_0x01d5:
            int r3 = r3 + r12
            goto L_0x01e1
        L_0x01d7:
            r12 = 1
            int r4 = r4 + r12
            java.lang.String r3 = "\n\n\""
            int r3 = h0e.a0(r0, r3, r4, r10, r11)
            r4 = 2
            int r3 = r3 + r4
        L_0x01e1:
            if (r3 >= 0) goto L_0x01e6
            r10 = 10
            goto L_0x022a
        L_0x01e6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0, r10, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x01f2:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x021a
            java.lang.Object r10 = r2.next()
            hk r10 = (defpackage.hk) r10
            java.lang.String r12 = "\"SNAPSHOT main\" tid=1 ("
            r4.append(r12)
            long r12 = r10.a
            long r12 = r23 - r12
            r4.append(r12)
            java.lang.String r12 = "ms before)\n"
            r4.append(r12)
            java.lang.String r10 = r10.b
            r4.append(r10)
            r10 = 10
            r4.append(r10)
            goto L_0x01f2
        L_0x021a:
            r10 = 10
            r4.append(r10)
            int r2 = r0.length()
            r4.append(r0, r3, r2)
            java.lang.String r0 = r4.toString()
        L_0x022a:
            java.nio.charset.Charset r2 = e22.a
            byte[] r12 = r0.getBytes(r2)
            r2 = 3
            r9.a(r2)
            lr r0 = r9.d
            if (r0 == 0) goto L_0x0271
            r3 = 2
            r8.a(r3)
            java.util.List r4 = r8.d
            if (r4 == 0) goto L_0x0267
            r13 = 10
            r3 = r10
            r31 = r11
            r11 = r2
            r2 = r31
            r10 = r15
            r2 = r11
            r3 = 2
            r11 = r13
            r22 = r28
            r30 = r29
            r13 = r1
            r1 = r14
            r14 = r4
            r4 = r15
            r15 = r0
            r10.N(r11, r12, r13, r14, iw4.a, r15)
            r7.g(r2)
        L_0x025b:
            r14 = r1
            r15 = r4
            r12 = r22
            r3 = r25
            r13 = r30
            r4 = 1
            r10 = 0
            goto L_0x003c
        L_0x0267:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0271:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r18.toString()
            r0.<init>(r1)
            throw r0
        L_0x027b:
            d4.D(r20)
            goto L_0x025b
        L_0x027f:
            r22 = r12
            r30 = r13
            r4 = r15
            r2 = 3
            r3 = 2
            boolean r0 = r5.a
            r1 = 45
            r5 = 58
            java.lang.String r15 = "tracer-"
            java.lang.String r19 = "tracer"
            if (r0 == 0) goto L_0x033f
            java.lang.String r0 = xs7.B()
            java.lang.String r10 = r6.getPackageName()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x02a3
            r0 = r19
            goto L_0x02b7
        L_0x02a3:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r15)
            java.lang.String r0 = r0.replace(r5, r1)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
        L_0x02b7:
            java.io.File r10 = new java.io.File
            java.io.File r6 = r6.getCacheDir()
            r10.<init>(r6, r0)
            java.lang.String r0 = "minidump"
            java.io.File r0 = ng5.N(r10, r0)
            boolean r6 = r0.exists()
            if (r6 != 0) goto L_0x02ce
            goto L_0x033f
        L_0x02ce:
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x033f
            int r6 = r0.length
            if (r6 != 0) goto L_0x02d9
            goto L_0x033f
        L_0x02d9:
            r7.b()
            c9e r6 = r7.h
            if (r6 != 0) goto L_0x02e1
            goto L_0x033f
        L_0x02e1:
            int r14 = r0.length
            r13 = 0
        L_0x02e3:
            if (r13 >= r14) goto L_0x033f
            r10 = r0[r13]
            byte[] r12 = ng5.K(r10)     // Catch:{ Exception -> 0x02f4 }
            h2g.h(r10)     // Catch:{ Exception -> 0x02f4 }
            int r11 = r12.length
            if (r11 != 0) goto L_0x02fb
            r10.toString()
        L_0x02f4:
            r20 = r13
            r24 = r14
            r3 = r15
        L_0x02f9:
            r10 = 1
            goto L_0x0338
        L_0x02fb:
            r8.a(r3)
            java.util.List r11 = r8.d
            if (r11 == 0) goto L_0x032e
            r9.a(r2)
            lr r10 = r9.d
            if (r10 == 0) goto L_0x0324
            r20 = 9
            r21 = r10
            r10 = r4
            r23 = r11
            r11 = r20
            r20 = r13
            r13 = r6
            r24 = r14
            r14 = r23
            r3 = r15
            r15 = r21
            r10.N(r11, r12, r13, r14, iw4.a, r15)
            r10 = 4
            r7.g(r10)
            goto L_0x02f9
        L_0x0324:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r18.toString()
            r0.<init>(r1)
            throw r0
        L_0x032e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0338:
            int r13 = r20 + 1
            r15 = r3
            r14 = r24
            r3 = 2
            goto L_0x02e3
        L_0x033f:
            r3 = r15
            nne r0 = defpackage.nne.a
            java.util.Map r0 = defpackage.nne.c()
            x3a r6 = ete.a
            java.lang.Object r0 = r0.get(r6)
            boolean r10 = r0 instanceof defpackage.nv3
            if (r10 == 0) goto L_0x0354
            r10 = r0
            nv3 r10 = (defpackage.nv3) r10
            goto L_0x0355
        L_0x0354:
            r10 = 0
        L_0x0355:
            if (r10 != 0) goto L_0x0364
            x3a r0 = new x3a
            r10 = 8
            r11 = 0
            r0.<init>(r10, r11)
            nv3 r10 = new nv3
            r10.<init>(r0)
        L_0x0364:
            boolean r0 = r10.a
            if (r0 == 0) goto L_0x03b1
            r7.b()
            c9e r0 = r7.h
            if (r0 == 0) goto L_0x03b1
            boolean r6 = defpackage.xhd.h(r6)
            if (r6 == 0) goto L_0x0378
        L_0x0375:
            r6 = r16
            goto L_0x03a4
        L_0x0378:
            r7.b()
            java.util.List r6 = r7.j
            r10 = 1
            java.util.List r6 = o23.S(r10, r6)
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x0389
            goto L_0x03a4
        L_0x0389:
            int r10 = r6.size()
            r11 = 10
            if (r10 < r11) goto L_0x0392
            goto L_0x03a4
        L_0x0392:
            r7.b()
            long r10 = r7.i
            long r12 = java.lang.System.currentTimeMillis()
            r14 = 14400000(0xdbba00, float:2.0178698E-38)
            long r14 = (long) r14
            long r10 = r10 + r14
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0375
        L_0x03a4:
            boolean r10 = r6.isEmpty()
            r11 = 1
            r10 = r10 ^ r11
            if (r10 == 0) goto L_0x03b1
            r10 = r30
            r10.a(r0, r6, r7)     // Catch:{ Exception -> 0x03b1 }
        L_0x03b1:
            boolean r0 = defpackage.nne.b
            java.lang.Object r4 = r4.b
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r6 = "crashes"
            if (r0 == 0) goto L_0x03fb
            java.lang.String r0 = xs7.B()
            java.lang.String r2 = r4.getPackageName()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x03cc
        L_0x03c9:
            r0 = r19
            goto L_0x03e1
        L_0x03cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r0 = r0.replace(r5, r1)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r2.append(r0)
            java.lang.String r19 = r2.toString()
            goto L_0x03c9
        L_0x03e1:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r4.getCacheDir()
            r1.<init>(r2, r0)
            java.io.File r0 = ng5.N(r1, r6)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x03f6
            goto L_0x04ec
        L_0x03f6:
            ng5.J(r0)
            goto L_0x04ec
        L_0x03fb:
            java.lang.String r0 = xs7.B()
            java.lang.String r7 = r4.getPackageName()
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x040c
        L_0x0409:
            r0 = r19
            goto L_0x0421
        L_0x040c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            java.lang.String r0 = r0.replace(r5, r1)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r7.append(r0)
            java.lang.String r19 = r7.toString()
            goto L_0x0409
        L_0x0421:
            java.io.File r1 = new java.io.File
            java.io.File r3 = r4.getCacheDir()
            r1.<init>(r3, r0)
            java.io.File r0 = ng5.N(r1, r6)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0436
            goto L_0x04d7
        L_0x0436:
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x04d7
            int r1 = r0.length
            if (r1 != 0) goto L_0x0441
            goto L_0x04d7
        L_0x0441:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0448:
            if (r4 >= r3) goto L_0x0456
            r5 = r0[r4]
            mv3 r5 = defpackage.mv4.L(r5)     // Catch:{ Exception -> 0x0453 }
            r1.add(r5)     // Catch:{ Exception -> 0x0453 }
        L_0x0453:
            r5 = 1
            int r4 = r4 + r5
            goto L_0x0448
        L_0x0456:
            r5 = 1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x045f
            goto L_0x04d7
        L_0x045f:
            long r3 = java.lang.System.currentTimeMillis()
            r6 = 14400000(0xdbba00, double:7.1145453E-317)
            long r3 = r3 - r6
            int r0 = r1.size()
            if (r0 <= r5) goto L_0x0477
            zo4 r0 = new zo4
            r5 = 21
            r0.<init>(r5)
            t23.J(r1, r0)
        L_0x0477:
            int r0 = r1.size()
            java.lang.String r5 = "List is empty."
            r6 = 10
            if (r0 <= r6) goto L_0x04a2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x049c
            r7 = 0
            java.lang.Object r0 = r1.remove(r7)
            mv3 r0 = (defpackage.mv3) r0
            r0.getClass()
            java.io.File r5 = new java.io.File
            java.lang.String r0 = r0.c
            r5.<init>(r0)
            ng5.J(r5)
            goto L_0x0477
        L_0x049c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r5)
            throw r0
        L_0x04a2:
            java.lang.Object r0 = o23.V(r1)
            mv3 r0 = (defpackage.mv3) r0
            long r6 = r0.a
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x04d5
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04cf
            r6 = 0
            java.lang.Object r0 = r1.remove(r6)
            mv3 r0 = (defpackage.mv3) r0
            r0.getClass()
            java.io.File r7 = new java.io.File
            java.lang.String r0 = r0.c
            r7.<init>(r0)
            ng5.J(r7)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x04a2
            goto L_0x04d5
        L_0x04cf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r5)
            throw r0
        L_0x04d5:
            r16 = r1
        L_0x04d7:
            boolean r0 = r16.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x04e5
            r22.getClass()
            defpackage.oa2.I(r16)
        L_0x04e5:
            r1 = 4
            r9.a(r1)
            r8.a(r2)
        L_0x04ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rne.run():void");
    }
}
