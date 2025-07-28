package defpackage;

/* renamed from: as0  reason: default package */
public final /* synthetic */ class as0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ as0(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.o = obj;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0178, code lost:
        r12 = r9.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bd, code lost:
        defpackage.urd.l(r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.a
            switch(r0) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x007d;
                case 2: goto L_0x006b;
                case 3: goto L_0x005b;
                case 4: goto L_0x0049;
                case 5: goto L_0x0029;
                case 6: goto L_0x001d;
                case 7: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r14.b
            int r1 = r14.c
            java.lang.Object r14 = r14.o
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r14 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r14
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer.a(r14, r0, r1)
            return
        L_0x0011:
            int r0 = r14.b
            int r1 = r14.c
            java.lang.Object r14 = r14.o
            org.webrtc.SurfaceViewRenderer r14 = (org.webrtc.SurfaceViewRenderer) r14
            org.webrtc.SurfaceViewRenderer.a(r14, r0, r1)
            return
        L_0x001d:
            int r0 = r14.b
            int r1 = r14.c
            java.lang.Object r14 = r14.o
            org.webrtc.SurfaceTextureHelper r14 = (org.webrtc.SurfaceTextureHelper) r14
            org.webrtc.SurfaceTextureHelper.e(r14, r0, r1)
            return
        L_0x0029:
            java.lang.Object r0 = r14.o
            o4e r0 = (defpackage.o4e) r0
            int r1 = r0.i
            int r2 = r14.b
            r3 = 1
            if (r1 == r2) goto L_0x0038
            r0.i = r2
            r1 = r3
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            int r2 = r0.h
            int r14 = r14.c
            if (r2 == r14) goto L_0x0042
            r0.h = r14
            goto L_0x0043
        L_0x0042:
            r3 = r1
        L_0x0043:
            if (r3 == 0) goto L_0x0048
            r0.f()
        L_0x0048:
            return
        L_0x0049:
            java.lang.Object r0 = r14.o
            xw2 r0 = (defpackage.xw2) r0
            java.lang.Object r0 = r0.c
            vhd r0 = (defpackage.vhd) r0
            z4f r0 = r0.o
            int r1 = r14.b
            int r14 = r14.c
            r0.o(r1, r14)
            return
        L_0x005b:
            java.lang.Object r0 = r14.o
            noc r0 = (noc) r0
            py5 r0 = r0.o
            if (r0 == 0) goto L_0x006a
            int r1 = r14.b
            int r14 = r14.c
            r0.a(r1, r14)
        L_0x006a:
            return
        L_0x006b:
            java.lang.Object r0 = r14.o
            mod r0 = (defpackage.mod) r0
            java.lang.Object r0 = r0.b
            pqe r0 = (defpackage.pqe) r0
            z4f r0 = r0.X
            int r1 = r14.b
            int r14 = r14.c
            r0.o(r1, r14)
            return
        L_0x007d:
            java.lang.Object r0 = r14.o
            py5 r0 = (py5) r0
            int r1 = r14.b
            int r14 = r14.c
            boolean r2 = r0.x0
            if (r2 == 0) goto L_0x00a9
            boolean r2 = r0.y0
            if (r2 == 0) goto L_0x00a9
            org.webrtc.ScreenCapturerAndroid r2 = r0.Y
            if (r2 == 0) goto L_0x00a9
            org.webrtc.ScreenCapturerAndroid r2 = r0.Y     // Catch:{ all -> 0x0098 }
            r3 = 0
            r2.changeCaptureFormat(r1, r14, r3)     // Catch:{ all -> 0x0098 }
            goto L_0x00a9
        L_0x0098:
            r14 = move-exception
            xwb r0 = r0.c
            ru.ok.android.webrtc.protocol.screenshare.send.impl.ScreenShareException r1 = new ru.ok.android.webrtc.protocol.screenshare.send.impl.ScreenShareException
            java.lang.String r2 = "Error change capture format"
            r1.<init>(r2, r14)
            java.lang.String r14 = "FrameCapturerImpl"
            java.lang.String r2 = ""
            r0.reportException(r14, r2, r1)
        L_0x00a9:
            return
        L_0x00aa:
            java.lang.Object r0 = r14.o
            cs0 r0 = (defpackage.cs0) r0
            int r1 = r14.b
            int r14 = r14.c
        L_0x00b2:
            int r2 = r0.j
            r3 = 0
            if (r2 >= 0) goto L_0x00b8
            r2 = r3
        L_0x00b8:
            ii5 r4 = r0.i
            int r5 = r0.e
            r4.getClass()
            fz6 r5 = defpackage.gwf.S(r3, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.q23.H(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x00d2:
            r7 = r5
            ez6 r7 = (defpackage.ez6) r7
            boolean r7 = r7.c
            if (r7 == 0) goto L_0x00ed
            r7 = r5
            ez6 r7 = (defpackage.ez6) r7
            int r7 = r7.a()
            int r7 = r7 + r2
            int r7 = r4.a(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L_0x00d2
        L_0x00ed:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r6.iterator()
        L_0x00f6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0117
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.util.Set r7 = r0.l
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x00f6
            r2.add(r5)
            goto L_0x00f6
        L_0x0117:
            java.util.Set r4 = defpackage.o23.w0(r2)
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            java.util.concurrent.ConcurrentHashMap r6 = r0.f
            java.util.Set r6 = r6.keySet()
            java.util.Set r6 = defpackage.z3d.F(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r2.iterator()
        L_0x012e:
            boolean r7 = r6.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x01c1
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.util.concurrent.ConcurrentHashMap r9 = r0.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r9 = r9.get(r10)
            if (r9 == 0) goto L_0x014c
            goto L_0x012e
        L_0x014c:
            int r9 = r0.j
            r10 = -1
            if (r9 == r10) goto L_0x015d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r4.contains(r9)
            if (r9 != 0) goto L_0x015d
            goto L_0x00b2
        L_0x015d:
            java.lang.Object r9 = r5.pollFirst()
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0169
            int r10 = r9.intValue()
        L_0x0169:
            java.util.concurrent.ConcurrentHashMap r9 = r0.f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r9 = r9.get(r11)
            bs0 r9 = (defpackage.bs0) r9
            r11 = 0
            if (r9 == 0) goto L_0x0181
            e13 r12 = r9.a
            if (r12 == 0) goto L_0x0181
            e13 r12 = r12.n()
            goto L_0x0182
        L_0x0181:
            r12 = r11
        L_0x0182:
            if (r12 == 0) goto L_0x0185
            goto L_0x019c
        L_0x0185:
            bs0 r9 = new bs0
            mxa r12 = r0.a
            r12.getClass()
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888
            e13 r12 = r12.c(r1, r14, r13)
            r13 = r12
            t54 r13 = (defpackage.t54) r13
            r9.<init>(r13)
            e13 r12 = r12.m()
        L_0x019c:
            r9.b = r8
            r0.f(r7, r12)     // Catch:{ all -> 0x01ba }
            defpackage.urd.l(r12, r11)
            java.util.concurrent.ConcurrentHashMap r8 = r0.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.remove(r10)
            r9.b = r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.concurrent.ConcurrentHashMap r8 = r0.f
            r8.put(r7, r9)
            goto L_0x012e
        L_0x01ba:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            defpackage.urd.l(r12, r14)
            throw r0
        L_0x01c1:
            boolean r14 = r2.isEmpty()
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r14 == 0) goto L_0x01cf
            int r14 = r0.e
            float r14 = (float) r14
            float r14 = r14 * r1
            int r14 = (int) r14
            goto L_0x01e5
        L_0x01cf:
            int r14 = r2.size()
            float r4 = (float) r14
            float r4 = r4 * r1
            int r1 = (int) r4
            int r14 = r14 - r8
            int r14 = defpackage.gwf.j(r1, r3, r14)
            java.lang.Object r14 = r2.get(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
        L_0x01e5:
            r0.g = r14
            r0.h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as0.run():void");
    }
}
