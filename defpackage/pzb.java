package defpackage;

/* renamed from: pzb  reason: default package */
public final /* synthetic */ class pzb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pzb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 2
            r3 = 1
            int r4 = r7.a
            switch(r4) {
                case 0: goto L_0x03cc;
                case 1: goto L_0x03c4;
                case 2: goto L_0x03b2;
                case 3: goto L_0x037b;
                case 4: goto L_0x0371;
                case 5: goto L_0x0369;
                case 6: goto L_0x0361;
                case 7: goto L_0x0359;
                case 8: goto L_0x0351;
                case 9: goto L_0x0343;
                case 10: goto L_0x02ce;
                case 11: goto L_0x02c6;
                case 12: goto L_0x027d;
                case 13: goto L_0x0259;
                case 14: goto L_0x0251;
                case 15: goto L_0x023f;
                case 16: goto L_0x0154;
                case 17: goto L_0x0144;
                case 18: goto L_0x0113;
                case 19: goto L_0x010b;
                case 20: goto L_0x0103;
                case 21: goto L_0x00e0;
                case 22: goto L_0x00d8;
                case 23: goto L_0x00d0;
                case 24: goto L_0x009b;
                case 25: goto L_0x0043;
                case 26: goto L_0x003b;
                case 27: goto L_0x0021;
                case 28: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r7 = r7.b
            xce r7 = (defpackage.xce) r7
            r7.b(r3)
            return
        L_0x0011:
            java.lang.Object r7 = r7.b
            bce r7 = (defpackage.bce) r7
            t97 r7 = r7.l
            java.lang.Object r7 = r7.getValue()
            zy9 r7 = (defpackage.zy9) r7
            r7.g(r3)
            return
        L_0x0021:
            java.lang.Object r7 = r7.b
            ybe r7 = (defpackage.ybe) r7
            r7.getClass()
            java.lang.String r0 = defpackage.ybe.F0
            java.lang.String r1 = "handleIntent: close and re-create session"
            udd.n(r0, r1)
            t97 r7 = r7.B0
            java.lang.Object r7 = r7.getValue()
            dce r7 = (defpackage.dce) r7
            r7.i()
            return
        L_0x003b:
            java.lang.Object r7 = r7.b
            y0c r7 = (y0c) r7
            r7.d()
            return
        L_0x0043:
            java.lang.Object r7 = r7.b
            u9e r7 = (defpackage.u9e) r7
            r7.a(r2)
            android.content.Context r0 = r7.a     // Catch:{ Exception -> 0x009a }
            java.lang.String r1 = xs7.B()     // Catch:{ Exception -> 0x009a }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x009a }
            boolean r2 = r1.equals(r2)     // Catch:{ Exception -> 0x009a }
            if (r2 == 0) goto L_0x005d
            java.lang.String r1 = "tracer"
            goto L_0x0077
        L_0x005d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a }
            java.lang.String r3 = "tracer-"
            r2.<init>(r3)     // Catch:{ Exception -> 0x009a }
            r3 = 58
            r4 = 45
            java.lang.String r1 = r1.replace(r3, r4)     // Catch:{ Exception -> 0x009a }
            java.lang.String r1 = android.net.Uri.encode(r1)     // Catch:{ Exception -> 0x009a }
            r2.append(r1)     // Catch:{ Exception -> 0x009a }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x009a }
        L_0x0077:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x009a }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ Exception -> 0x009a }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x009a }
            h2g.t(r2)     // Catch:{ Exception -> 0x009a }
            java.lang.String r0 = "tags"
            java.io.File r0 = ng5.N(r2, r0)     // Catch:{ Exception -> 0x009a }
            java.util.ArrayList r1 = r7.e     // Catch:{ Exception -> 0x009a }
            monitor-enter(r1)     // Catch:{ Exception -> 0x009a }
            java.util.ArrayList r7 = r7.e     // Catch:{ all -> 0x0097 }
            java.util.List r7 = o23.s0(r7)     // Catch:{ all -> 0x0097 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x009a }
            jjd.c(r0, r7)     // Catch:{ Exception -> 0x009a }
            goto L_0x009a
        L_0x0097:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x009a }
            throw r7     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            return
        L_0x009b:
            java.lang.Object r7 = r7.b
            q7e r7 = (q7e) r7
            ea6 r0 = r7.f
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            e07.o(r0, r1)
            s30 r0 = r7.b
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x00cd }
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0     // Catch:{ all -> 0x00cd }
            r0.add(r7)     // Catch:{ all -> 0x00cd }
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            ea6 r0 = r7.f
            java.lang.Object r0 = r0.b
            b2b r0 = (b2b) r0
            java.lang.Object r0 = r0.b
            android.hardware.camera2.CameraCaptureSession r0 = (android.hardware.camera2.CameraCaptureSession) r0
            r0.close()
            java.util.concurrent.Executor r0 = r7.c
            pzb r1 = new pzb
            r2 = 23
            r1.<init>(r2, r7)
            r0.execute(r1)
            return
        L_0x00cd:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            throw r7
        L_0x00d0:
            java.lang.Object r7 = r7.b
            p7e r7 = (p7e) r7
            r7.g(r7)
            return
        L_0x00d8:
            java.lang.Object r7 = r7.b
            xz r7 = (defpackage.xz) r7
            r7.h()
            return
        L_0x00e0:
            java.lang.Object r7 = r7.b
            ydc r7 = (defpackage.ydc) r7
            java.lang.Object r7 = r7.o
            rp4 r7 = (rp4) r7
            if (r7 == 0) goto L_0x0102
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x00f2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = r7.next()
            o4e r0 = (o4e) r0
            r0.c()
            goto L_0x00f2
        L_0x0102:
            return
        L_0x0103:
            java.lang.Object r7 = r7.b
            java.util.concurrent.CountDownLatch r7 = (java.util.concurrent.CountDownLatch) r7
            r7.countDown()
            return
        L_0x010b:
            java.lang.Object r7 = r7.b
            qzd r7 = (qzd) r7
            r7.b()
            return
        L_0x0113:
            java.lang.Object r7 = r7.b
            nmd r7 = (nmd) r7
            android.view.Surface r0 = r7.z0
            if (r0 == 0) goto L_0x0133
            java.util.concurrent.CopyOnWriteArrayList r2 = r7.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0121:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0133
            java.lang.Object r3 = r2.next()
            g45 r3 = (g45) r3
            m45 r3 = r3.a
            r3.m2(r1)
            goto L_0x0121
        L_0x0133:
            android.graphics.SurfaceTexture r2 = r7.y0
            if (r2 == 0) goto L_0x013a
            r2.release()
        L_0x013a:
            if (r0 == 0) goto L_0x013f
            r0.release()
        L_0x013f:
            r7.y0 = r1
            r7.z0 = r1
            return
        L_0x0144:
            java.lang.Object r7 = r7.b
            xw2 r7 = (xw2) r7
            java.lang.Object r0 = r7.c
            vhd r0 = (vhd) r0
            z4f r0 = r0.o
            long r1 = r7.b
            r0.i(r1)
            return
        L_0x0154:
            java.lang.Object r7 = r7.b
            v2b r7 = (defpackage.v2b) r7
            r7.getClass()
            java.lang.Object r0 = r7.c     // Catch:{ Exception -> 0x023e }
            r7e r0 = (r7e) r0     // Catch:{ Exception -> 0x023e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x023e }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ Exception -> 0x023e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x023e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x023e }
            java.util.Map r0 = ju7.W(r0)     // Catch:{ Exception -> 0x023e }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x023e }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x023e }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x023e }
            java.lang.Object r7 = r7.b     // Catch:{ Exception -> 0x023e }
            s16 r7 = (s16) r7     // Catch:{ Exception -> 0x023e }
            java.lang.Object r7 = r7.invoke()     // Catch:{ Exception -> 0x023e }
            java.io.File r7 = (java.io.File) r7     // Catch:{ Exception -> 0x023e }
            r6.<init>(r7)     // Catch:{ Exception -> 0x023e }
            r5.<init>(r6)     // Catch:{ Exception -> 0x023e }
            r4.<init>(r5)     // Catch:{ Exception -> 0x023e }
            r4.writeInt(r3)     // Catch:{ all -> 0x01c4 }
            int r7 = r0.size()     // Catch:{ all -> 0x01c4 }
            r4.writeInt(r7)     // Catch:{ all -> 0x01c4 }
            java.util.Set r7 = r0.entrySet()     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01c4 }
        L_0x019a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x01c4 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01c4 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ all -> 0x01c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01c4 }
            r4.writeUTF(r5)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01c4 }
            boolean r5 = r0 instanceof java.lang.Boolean     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x01c7
            r4.writeInt(r2)     // Catch:{ all -> 0x01c4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c4 }
            r4.writeBoolean(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x019a
        L_0x01c4:
            r7 = move-exception
            goto L_0x0238
        L_0x01c7:
            boolean r5 = r0 instanceof java.lang.Integer     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x01d9
            r5 = 3
            r4.writeInt(r5)     // Catch:{ all -> 0x01c4 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c4 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01c4 }
            r4.writeInt(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x019a
        L_0x01d9:
            boolean r5 = r0 instanceof java.lang.Long     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x01eb
            r5 = 4
            r4.writeInt(r5)     // Catch:{ all -> 0x01c4 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c4 }
            long r5 = r0.longValue()     // Catch:{ all -> 0x01c4 }
            r4.writeLong(r5)     // Catch:{ all -> 0x01c4 }
            goto L_0x019a
        L_0x01eb:
            boolean r5 = r0 instanceof java.lang.Float     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x01fd
            r5 = 5
            r4.writeInt(r5)     // Catch:{ all -> 0x01c4 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c4 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x01c4 }
            r4.writeFloat(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x019a
        L_0x01fd:
            boolean r5 = r0 instanceof java.lang.Double     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x020f
            r5 = 6
            r4.writeInt(r5)     // Catch:{ all -> 0x01c4 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01c4 }
            double r5 = r0.doubleValue()     // Catch:{ all -> 0x01c4 }
            r4.writeDouble(r5)     // Catch:{ all -> 0x01c4 }
            goto L_0x019a
        L_0x020f:
            boolean r5 = r0 instanceof java.lang.String     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x021d
            r4.writeInt(r3)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01c4 }
            r4.writeUTF(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x019a
        L_0x021d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r1.<init>()     // Catch:{ all -> 0x01c4 }
            java.lang.String r2 = "Write unknown type of value "
            r1.append(r2)     // Catch:{ all -> 0x01c4 }
            r1.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c4 }
            r7.<init>(r0)     // Catch:{ all -> 0x01c4 }
            throw r7     // Catch:{ all -> 0x01c4 }
        L_0x0234:
            urd.l(r4, r1)     // Catch:{ Exception -> 0x023e }
            goto L_0x023e
        L_0x0238:
            throw r7     // Catch:{ all -> 0x0239 }
        L_0x0239:
            r0 = move-exception
            urd.l(r4, r7)     // Catch:{ Exception -> 0x023e }
            throw r0     // Catch:{ Exception -> 0x023e }
        L_0x023e:
            return
        L_0x023f:
            java.lang.Object r7 = r7.b
            nfc r7 = (nfc) r7
            java.lang.Object r7 = r7.b
            d60 r7 = (d60) r7
            r7.q = r3
            int r0 = r7.g
            if (r0 != r2) goto L_0x0250
            r7.a()
        L_0x0250:
            return
        L_0x0251:
            java.lang.Object r7 = r7.b
            mfd r7 = (defpackage.mfd) r7
            r7.g()
            return
        L_0x0259:
            java.lang.Object r7 = r7.b
            bq0 r7 = (bq0) r7
            r7.c = r0
            java.lang.Object r0 = r7.e
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            iaf r1 = r0.i
            if (r1 == 0) goto L_0x0273
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0273
            int r0 = r7.b
            r7.b(r0)
            goto L_0x027c
        L_0x0273:
            int r1 = r0.h
            if (r1 != r2) goto L_0x027c
            int r7 = r7.b
            r0.y(r7)
        L_0x027c:
            return
        L_0x027d:
            java.lang.Object r7 = r7.b
            bd4 r7 = (bd4) r7
            java.lang.Object r0 = r7.X
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            monitor-enter(r0)
            java.lang.Object r1 = r7.b     // Catch:{ all -> 0x02c3 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x02c3 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x02c3 }
            java.lang.Object r2 = r7.c     // Catch:{ all -> 0x02c3 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02c3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c3 }
            r3.<init>()     // Catch:{ all -> 0x02c3 }
            java.lang.Object r4 = r7.X     // Catch:{ all -> 0x02c3 }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x02c3 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x02c3 }
        L_0x029f:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x02c3 }
            if (r5 == 0) goto L_0x02b6
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x02c3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02c3 }
            r3.append(r5)     // Catch:{ all -> 0x02c3 }
            java.lang.Object r5 = r7.o     // Catch:{ all -> 0x02c3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02c3 }
            r3.append(r5)     // Catch:{ all -> 0x02c3 }
            goto L_0x029f
        L_0x02b6:
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x02c3 }
            android.content.SharedPreferences$Editor r7 = r1.putString(r2, r7)     // Catch:{ all -> 0x02c3 }
            r7.commit()     // Catch:{ all -> 0x02c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x02c3 }
            return
        L_0x02c3:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02c3 }
            throw r7
        L_0x02c6:
            java.lang.Object r7 = r7.b
            k96 r7 = (k96) r7
            r7.j()
            return
        L_0x02ce:
            java.lang.Object r7 = r7.b
            eyc r7 = (eyc) r7
            r7.getClass()
            fyc r1 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            boolean r1 = r1.u     // Catch:{ RuntimeException -> 0x030c }
            if (r1 == 0) goto L_0x02dc
            goto L_0x0342
        L_0x02dc:
            fyc r1 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            r1.h()     // Catch:{ RuntimeException -> 0x030c }
            long r1 = r7.c     // Catch:{ RuntimeException -> 0x030c }
            fyc r4 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            long r4 = r4.w     // Catch:{ RuntimeException -> 0x030c }
            long r1 = r1 + r4
            r7.c = r1     // Catch:{ RuntimeException -> 0x030c }
            fyc r1 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            at r1 = r1.o     // Catch:{ RuntimeException -> 0x030c }
            r1.release()     // Catch:{ RuntimeException -> 0x030c }
            fyc r1 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            r1.m = r0     // Catch:{ RuntimeException -> 0x030c }
            int r2 = r1.n     // Catch:{ RuntimeException -> 0x030c }
            int r2 = r2 + r3
            r1.n = r2     // Catch:{ RuntimeException -> 0x030c }
            ws6 r1 = r1.a     // Catch:{ RuntimeException -> 0x030c }
            int r1 = r1.size()     // Catch:{ RuntimeException -> 0x030c }
            if (r2 != r1) goto L_0x030e
            fyc r1 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            r1.n = r0     // Catch:{ RuntimeException -> 0x030c }
            int r0 = r1.s     // Catch:{ RuntimeException -> 0x030c }
            int r0 = r0 + r3
            r1.s = r0     // Catch:{ RuntimeException -> 0x030c }
            goto L_0x030e
        L_0x030c:
            r0 = move-exception
            goto L_0x0337
        L_0x030e:
            fyc r0 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            ws6 r1 = r0.a     // Catch:{ RuntimeException -> 0x030c }
            int r0 = r0.n     // Catch:{ RuntimeException -> 0x030c }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ RuntimeException -> 0x030c }
            gs4 r0 = (gs4) r0     // Catch:{ RuntimeException -> 0x030c }
            fyc r1 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            ys r2 = r1.d     // Catch:{ RuntimeException -> 0x030c }
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ RuntimeException -> 0x030c }
            r3.getClass()     // Catch:{ RuntimeException -> 0x030c }
            fyc r4 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            s93 r5 = r4.e     // Catch:{ RuntimeException -> 0x030c }
            at r0 = r2.l(r0, r3, r4, r5)     // Catch:{ RuntimeException -> 0x030c }
            r1.o = r0     // Catch:{ RuntimeException -> 0x030c }
            fyc r0 = r7.f     // Catch:{ RuntimeException -> 0x030c }
            at r0 = r0.o     // Catch:{ RuntimeException -> 0x030c }
            r0.start()     // Catch:{ RuntimeException -> 0x030c }
            goto L_0x0342
        L_0x0337:
            fyc r7 = r7.f
            r1 = 1000(0x3e8, float:1.401E-42)
            androidx.media3.transformer.ExportException r0 = androidx.media3.transformer.ExportException.a(r0, r1)
            r7.d(r0)
        L_0x0342:
            return
        L_0x0343:
            k77[] r0 = one.me.sdk.gallery.selectalbum.SelectAlbumWidget.Y
            java.lang.Object r7 = r7.b
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r7 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r7
            z0b r7 = r7.m0()
            r7.k()
            return
        L_0x0351:
            java.lang.Object r7 = r7.b
            ru.ok.tamtam.workmanager.SdkCoroutineWorker r7 = (ru.ok.tamtam.workmanager.SdkCoroutineWorker) r7
            ru.ok.tamtam.workmanager.SdkCoroutineWorker.b(r7)
            return
        L_0x0359:
            java.lang.Object r7 = r7.b
            cs1 r7 = (cs1) r7
            r7.a()
            return
        L_0x0361:
            java.lang.Object r7 = r7.b
            pnc r7 = (defpackage.pnc) r7
            r7.c()
            return
        L_0x0369:
            java.lang.Object r7 = r7.b
            sgc r7 = (sgc) r7
            r7.A()
            return
        L_0x0371:
            java.lang.Object r7 = r7.b
            pfc r7 = (defpackage.pfc) r7
            org.webrtc.VideoFrame$TextureBuffer r7 = r7.a
            r7.release()
            return
        L_0x037b:
            java.lang.Object r7 = r7.b
            v2b r7 = (defpackage.v2b) r7
            java.lang.Object r7 = r7.c
            ug4 r7 = (ug4) r7
            boolean r0 = r7.b
            if (r0 != 0) goto L_0x03b1
            java.lang.Object r0 = r7.g
            y5c r0 = (y5c) r0
            hx4 r1 = r0.F
            java.util.Objects.toString(r1)
            vj4 r1 = r0.a0
            r1.e()
            java.lang.Object r1 = r1.k
            ch7 r1 = (ch7) r1
            ch7 r1 = defpackage.ct0.A(r1)
            px4 r2 = new px4
            java.lang.Object r3 = r7.d
            y4e r3 = (y4e) r3
            java.io.Serializable r4 = r7.e
            kje r4 = (kje) r4
            r5 = 25
            r2.<init>(r7, r3, r4, r5)
            ryc r7 = r0.e
            r1.c(r2, r7)
        L_0x03b1:
            return
        L_0x03b2:
            java.lang.Object r7 = r7.b
            hx4 r7 = (hx4) r7
            xe6 r0 = xf4.a
            java.lang.Class<androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk> r1 = androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class
            zkb r0 = r0.j(r1)
            if (r0 == 0) goto L_0x03c3
            y5c.r(r7)
        L_0x03c3:
            return
        L_0x03c4:
            java.lang.Object r7 = r7.b
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl r7 = (ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl) r7
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl.onRecordStarted$lambda$5(r7)
            return
        L_0x03cc:
            java.lang.Object r7 = r7.b
            rzb r7 = (defpackage.rzb) r7
            androidx.recyclerview.widget.RecyclerView r7 = r7.d
            r7.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzb.run():void");
    }
}
