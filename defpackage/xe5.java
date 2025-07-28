package defpackage;

/* renamed from: xe5  reason: default package */
public final class xe5 implements Runnable {
    public final /* synthetic */ ye5 a;

    public xe5(ye5 ye5) {
        this.a = ye5;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[SYNTHETIC, Splitter:B:31:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r0 = r28
            ye5 r0 = r0.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicReference r1 = r0.d
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)
            jc9 r1 = (defpackage.jc9) r1
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            dy r3 = r0.a
            java.io.File r4 = r3.c
            java.io.File r4 = r4.getParentFile()
            if (r4 == 0) goto L_0x0027
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x0024
            goto L_0x0073
        L_0x0024:
            r4.mkdirs()     // Catch:{ SecurityException -> 0x0027 }
        L_0x0027:
            e3 r0 = r0.b
            java.io.File r5 = r3.c
            if (r4 == 0) goto L_0x0033
            boolean r6 = r4.exists()
            if (r6 != 0) goto L_0x005e
        L_0x0033:
            r6 = 0
            r8 = -1
        L_0x0036:
            if (r4 == 0) goto L_0x003e
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x005e
        L_0x003e:
            long[] r4 = defpackage.ye5.h
            int r8 = r8 + 1
            r9 = 4
            int r9 = java.lang.Math.min(r8, r9)
            r9 = r4[r9]
            android.os.SystemClock.sleep(r9)
            java.io.File r4 = r5.getParentFile()
            long r6 = r6 + r9
            r9 = 200(0xc8, double:9.9E-322)
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0036
            if (r0 == 0) goto L_0x005e
            java.lang.String r4 = "checkFilesDirAvailable: waiting max time! break"
            r0.e(r4)
        L_0x005e:
            java.io.File r4 = r5.getParentFile()
            if (r4 == 0) goto L_0x01d0
            boolean r5 = r4.exists()
            if (r5 != 0) goto L_0x006c
            goto L_0x01d0
        L_0x006c:
            if (r0 == 0) goto L_0x0073
            java.lang.String r4 = "checkFilesDirAvailable: dir is created!"
            r0.e(r4)
        L_0x0073:
            java.io.FileOutputStream r4 = r3.f()     // Catch:{ all -> 0x01cf }
            if (r4 != 0) goto L_0x007b
            goto L_0x01cf
        L_0x007b:
            java.io.DataOutputStream r11 = new java.io.DataOutputStream     // Catch:{ all -> 0x01be }
            r11.<init>(r4)     // Catch:{ all -> 0x01be }
            qe4 r0 = new qe4     // Catch:{ all -> 0x00e6 }
            r5 = 29
            r0.<init>((int) r5)     // Catch:{ all -> 0x00e6 }
            java.lang.Object[] r12 = r1.b     // Catch:{ all -> 0x00e6 }
            java.lang.Object[] r13 = r1.c     // Catch:{ all -> 0x00e6 }
            long[] r1 = r1.a     // Catch:{ all -> 0x00e6 }
            int r5 = r1.length     // Catch:{ all -> 0x00e6 }
            int r14 = r5 + -2
            if (r14 < 0) goto L_0x01aa
            r10 = 0
        L_0x0093:
            r5 = r1[r10]     // Catch:{ all -> 0x00e6 }
            long r7 = ~r5     // Catch:{ all -> 0x00e6 }
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r16
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x01ac
            int r7 = r10 - r14
            int r7 = ~r7     // Catch:{ all -> 0x00e6 }
            int r7 = r7 >>> 31
            r9 = 8
            int r8 = 8 - r7
            r16 = r5
            r7 = 0
        L_0x00b0:
            if (r7 >= r8) goto L_0x01a1
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r16 & r5
            r18 = 128(0x80, double:6.32E-322)
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x0190
            int r5 = r10 << 3
            int r5 = r5 + r7
            r6 = r12[r5]     // Catch:{ all -> 0x00e6 }
            r5 = r13[r5]     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00e6 }
            if (r6 == 0) goto L_0x0190
            if (r5 != 0) goto L_0x00cb
            goto L_0x0190
        L_0x00cb:
            boolean r9 = r5 instanceof java.lang.Boolean     // Catch:{ all -> 0x00e6 }
            if (r9 == 0) goto L_0x00ea
            dte r9 = defpackage.dte.BOOLEAN     // Catch:{ all -> 0x00e6 }
            ct0.Q(r11, r6, r9)     // Catch:{ all -> 0x00e6 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x00e6 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x00e6 }
            r11.writeBoolean(r5)     // Catch:{ all -> 0x00e6 }
        L_0x00dd:
            r20 = r7
            r2 = r8
            r21 = r10
            r15 = 8
            goto L_0x0196
        L_0x00e6:
            r0 = move-exception
            r1 = r0
            goto L_0x01c1
        L_0x00ea:
            boolean r9 = r5 instanceof java.lang.Float     // Catch:{ all -> 0x00e6 }
            if (r9 == 0) goto L_0x00fd
            dte r9 = defpackage.dte.FLOAT     // Catch:{ all -> 0x00e6 }
            ct0.Q(r11, r6, r9)     // Catch:{ all -> 0x00e6 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00e6 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x00e6 }
            r11.writeFloat(r5)     // Catch:{ all -> 0x00e6 }
            goto L_0x00dd
        L_0x00fd:
            boolean r9 = r5 instanceof java.lang.Integer     // Catch:{ all -> 0x00e6 }
            if (r9 == 0) goto L_0x0110
            dte r9 = defpackage.dte.INTEGER     // Catch:{ all -> 0x00e6 }
            ct0.Q(r11, r6, r9)     // Catch:{ all -> 0x00e6 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00e6 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x00e6 }
            r11.writeInt(r5)     // Catch:{ all -> 0x00e6 }
            goto L_0x00dd
        L_0x0110:
            boolean r9 = r5 instanceof java.lang.Long     // Catch:{ all -> 0x00e6 }
            if (r9 == 0) goto L_0x0123
            dte r9 = defpackage.dte.LONG     // Catch:{ all -> 0x00e6 }
            ct0.Q(r11, r6, r9)     // Catch:{ all -> 0x00e6 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00e6 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x00e6 }
            r11.writeLong(r5)     // Catch:{ all -> 0x00e6 }
            goto L_0x00dd
        L_0x0123:
            boolean r9 = r5 instanceof java.lang.String     // Catch:{ all -> 0x00e6 }
            if (r9 == 0) goto L_0x0142
            dte r9 = defpackage.dte.STRING     // Catch:{ all -> 0x00e6 }
            dte r18 = defpackage.dte.BIG_STRING     // Catch:{ all -> 0x00e6 }
            r19 = r5
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ all -> 0x00e6 }
            r5 = r11
            r20 = r7
            r7 = r9
            r9 = r8
            r8 = r18
            r2 = r9
            r15 = 8
            r9 = r19
            r21 = r10
            r10 = r0
            ct0.R(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x0196
        L_0x0142:
            r20 = r7
            r2 = r8
            r21 = r10
            r15 = 8
            boolean r7 = r5 instanceof java.util.Set     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x0196
            r7 = r5
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x00e6 }
            java.lang.Object r7 = defpackage.o23.W(r7)     // Catch:{ all -> 0x00e6 }
            boolean r7 = r7 instanceof java.lang.String     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x016c
            r22 = r5
            java.util.Set r22 = (java.util.Set) r22     // Catch:{ all -> 0x00e6 }
            java.lang.String r23 = ","
            r26 = 0
            r27 = 62
            r24 = 0
            r25 = 0
            java.lang.String r5 = defpackage.o23.c0(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x00e6 }
        L_0x016a:
            r9 = r5
            goto L_0x0186
        L_0x016c:
            r22 = r5
            java.lang.Iterable r22 = (java.lang.Iterable) r22     // Catch:{ all -> 0x00e6 }
            java.lang.String r23 = ","
            qq9 r5 = new qq9     // Catch:{ all -> 0x00e6 }
            r7 = 29
            r5.<init>(r7)     // Catch:{ all -> 0x00e6 }
            r27 = 30
            r24 = 0
            r25 = 0
            r26 = r5
            java.lang.String r5 = defpackage.o23.c0(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x00e6 }
            goto L_0x016a
        L_0x0186:
            dte r7 = defpackage.dte.STRINGS_SET     // Catch:{ all -> 0x00e6 }
            dte r8 = defpackage.dte.BIG_STRINGS_SET     // Catch:{ all -> 0x00e6 }
            r5 = r11
            r10 = r0
            ct0.R(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x0196
        L_0x0190:
            r20 = r7
            r2 = r8
            r15 = r9
            r21 = r10
        L_0x0196:
            long r16 = r16 >> r15
            int r7 = r20 + 1
            r8 = r2
            r9 = r15
            r10 = r21
            r2 = 0
            goto L_0x00b0
        L_0x01a1:
            r2 = r8
            r15 = r9
            r21 = r10
            if (r2 != r15) goto L_0x01aa
            r15 = r21
            goto L_0x01ad
        L_0x01aa:
            r2 = 0
            goto L_0x01b4
        L_0x01ac:
            r15 = r10
        L_0x01ad:
            if (r15 == r14) goto L_0x01aa
            int r10 = r15 + 1
            r2 = 0
            goto L_0x0093
        L_0x01b4:
            defpackage.urd.l(r11, r2)     // Catch:{ all -> 0x01be }
            r3.b(r4)     // Catch:{ all -> 0x01be }
            defpackage.urd.l(r4, r2)     // Catch:{ all -> 0x01cf }
            goto L_0x01cf
        L_0x01be:
            r0 = move-exception
            r1 = r0
            goto L_0x01c8
        L_0x01c1:
            throw r1     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            r0 = move-exception
            r2 = r0
            defpackage.urd.l(r11, r1)     // Catch:{ all -> 0x01be }
            throw r2     // Catch:{ all -> 0x01be }
        L_0x01c8:
            throw r1     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r0 = move-exception
            r2 = r0
            defpackage.urd.l(r4, r1)     // Catch:{ all -> 0x01cf }
            throw r2     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            return
        L_0x01d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkFilesDirAvailable: filesDir returns "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " which is not an existing directory. See https://issuetracker.google.com/issues/36918154"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r0 == 0) goto L_0x01f3
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            java.lang.Object r0 = r0.a
            f3 r0 = (f3) r0
            java.lang.String r0 = r0.e
            defpackage.udd.s(r0, r1, r2)
        L_0x01f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.run():void");
    }
}
