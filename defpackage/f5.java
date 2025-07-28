package defpackage;

/* renamed from: f5  reason: default package */
public final /* synthetic */ class f5 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 224 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x0214;
                case 1: goto L_0x020a;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01cb;
                case 4: goto L_0x019b;
                case 5: goto L_0x0193;
                case 6: goto L_0x018b;
                case 7: goto L_0x0181;
                case 8: goto L_0x0171;
                case 9: goto L_0x0163;
                case 10: goto L_0x015b;
                case 11: goto L_0x0108;
                case 12: goto L_0x00fe;
                case 13: goto L_0x00df;
                case 14: goto L_0x00d8;
                case 15: goto L_0x00c8;
                case 16: goto L_0x0080;
                case 17: goto L_0x0059;
                case 18: goto L_0x0051;
                case 19: goto L_0x0049;
                case 20: goto L_0x0039;
                case 21: goto L_0x0029;
                case 22: goto L_0x0019;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r0.b
            ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview r0 = (ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview) r0
            c97 r1 = r0.y0
            defpackage.tic.b(r1)
            ru.ok.messages.video.widgets.VideoFramePreview r0 = r0.c
            r0.a(r3)
            return
        L_0x0019:
            java.lang.Object r0 = r0.b
            z2f r0 = (defpackage.z2f) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "j3f"
            java.lang.String r2 = "putConversionInRepository: success, videoConversion = %s"
            udd.p(r1, r2, r0)
            return
        L_0x0029:
            java.lang.Object r0 = r0.b
            a3f r0 = (defpackage.a3f) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "j3f"
            java.lang.String r2 = "removeFromRepository: success, conversionData = %s"
            udd.p(r1, r2, r0)
            return
        L_0x0039:
            java.lang.Object r0 = r0.b
            wve r0 = (defpackage.wve) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ewe"
            java.lang.String r2 = "putUploadInRepository: finished for upload=%s"
            udd.p(r1, r2, r0)
            return
        L_0x0049:
            java.lang.Object r0 = r0.b
            mif r0 = (defpackage.mif) r0
            r0.getClass()
            return
        L_0x0051:
            java.lang.Object r0 = r0.b
            xce r0 = (defpackage.xce) r0
            r0.b(r2)
            return
        L_0x0059:
            java.lang.Object r0 = r0.b
            bce r0 = (defpackage.bce) r0
            t97 r0 = r0.i
            java.lang.Object r0 = r0.getValue()
            szc r0 = (defpackage.szc) r0
            nj4 r0 = r0.j
            java.lang.Object r0 = r0.get()
            yl9 r0 = (defpackage.yl9) r0
            r0.getClass()
            k77[] r1 = defpackage.yl9.b
            r1 = r1[r3]
            nj4 r0 = r0.a
            java.lang.Object r0 = r0.get()
            di7 r0 = (defpackage.di7) r0
            r0.getClass()
            return
        L_0x0080:
            java.lang.Object r0 = r0.b
            k3e r0 = (defpackage.k3e) r0
            i22 r1 = r0.n
            long r1 = r1.a
            t52 r3 = r0.c
            i22 r1 = r3.B(r1)
            r0.n = r1
            if (r1 != 0) goto L_0x0093
            goto L_0x00c7
        L_0x0093:
            xm8 r1 = r1.c
            if (r1 == 0) goto L_0x00c7
            vo8 r1 = r1.a
            boolean r2 = r1.v()
            if (r2 != 0) goto L_0x00a0
            goto L_0x00c7
        L_0x00a0:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.o
            long r2 = r2 - r4
            r4 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00af
            goto L_0x00c7
        L_0x00af:
            t00 r1 = r1.f()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00c7
        L_0x00b6:
            s00 r2 = defpackage.s00.c
            s00 r1 = r1.a
            if (r1 == r2) goto L_0x00c4
            s00 r2 = defpackage.s00.o
            if (r1 == r2) goto L_0x00c4
            s00 r2 = defpackage.s00.b
            if (r1 != r2) goto L_0x00c7
        L_0x00c4:
            r0.d()
        L_0x00c7:
            return
        L_0x00c8:
            java.lang.Object r0 = r0.b
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "lud"
            java.lang.String r2 = "storeStickerSetsFromServer: success: %s"
            udd.p(r1, r2, r0)
            return
        L_0x00d8:
            java.lang.Object r0 = r0.b
            vd9 r0 = (defpackage.vd9) r0
            r0.G0 = r1
            return
        L_0x00df:
            java.lang.Object r0 = r0.b
            md9 r0 = (defpackage.md9) r0
            r0.getClass()
            java.lang.String r1 = "md9"
            java.lang.String r2 = "Empty locations"
            udd.n(r1, r2)
            java.lang.Object r0 = r0.b
            ge9 r0 = (defpackage.ge9) r0
            te9 r0 = (defpackage.te9) r0
            r0.A(r3)
            java.util.List r1 = java.util.Collections.emptyList()
            r0.B(r1)
            return
        L_0x00fe:
            java.lang.Object r0 = r0.b
            zs8 r0 = (defpackage.zs8) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.d
            r0.set(r3)
            return
        L_0x0108:
            java.lang.Object r1 = r0.b
            vs7 r1 = (defpackage.vs7) r1
            java.util.ArrayList r4 = r1.m
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x014f
            java.util.ArrayList r4 = r1.m
            java.lang.Object r4 = r4.get(r3)
            prc r4 = (defpackage.prc) r4
            int r5 = r4.a
            if (r5 != r2) goto L_0x014d
            i22 r5 = r4.o
            long r5 = r5.a
            t52 r7 = r1.a
            i22 r12 = r7.B(r5)
            if (r12 == 0) goto L_0x0148
            boolean r5 = r12.e0()
            if (r5 == 0) goto L_0x0148
            prc r5 = new prc
            r15 = 0
            r17 = 0
            r9 = 1
            r10 = 0
            java.util.List r11 = r4.c
            r13 = 0
            r14 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            java.util.ArrayList r1 = r1.m
            r1.set(r3, r5)
            goto L_0x014d
        L_0x0148:
            java.util.ArrayList r1 = r1.m
            r1.remove(r3)
        L_0x014d:
            int r3 = r3 + r2
            goto L_0x0108
        L_0x014f:
            ms7 r0 = r1.h
            if (r0 == 0) goto L_0x015a
            java.util.ArrayList r2 = r1.m
            java.lang.String r1 = r1.q
            r0.g(r1, r2)
        L_0x015a:
            return
        L_0x015b:
            java.lang.Object r0 = r0.b
            ki7 r0 = (defpackage.ki7) r0
            r0.getClass()
            return
        L_0x0163:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.mediabar.FrgLocalVideo r0 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r0
            i16 r0 = r0.s1()
            if (r0 == 0) goto L_0x0170
            r0.e()
        L_0x0170:
            return
        L_0x0171:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.fragments.FrgAttachUnknown r0 = (ru.ok.messages.media.attaches.fragments.FrgAttachUnknown) r0
            v06 r0 = r0.s1()
            if (r0 == 0) goto L_0x0180
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            r0.e()
        L_0x0180:
            return
        L_0x0181:
            android.graphics.Typeface r2 = ru.ok.messages.media.attaches.FileAttachView.b1
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.FileAttachView r0 = (ru.ok.messages.media.attaches.FileAttachView) r0
            r0.getClass()
            throw r1
        L_0x018b:
            java.lang.Object r0 = r0.b
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0193:
            java.lang.Object r0 = r0.b
            oo3 r0 = (defpackage.oo3) r0
            r0.b()
            return
        L_0x019b:
            java.lang.Object r0 = r0.b
            dm3 r0 = (defpackage.dm3) r0
            em3 r1 = r0.N0
            cm3 r1 = r1.Z
            if (r1 == 0) goto L_0x01ca
            av7 r0 = r0.M0
            le9 r1 = (defpackage.le9) r1
            java.lang.Object r1 = r1.a
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x01b1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ca
            java.lang.Object r2 = r1.next()
            gd9 r2 = (defpackage.gd9) r2
            af9 r2 = r2.o
            if (r2 == 0) goto L_0x01b1
            bi0 r4 = new bi0
            r4.<init>(r0, r3)
            r2.o(r4)
            goto L_0x01b1
        L_0x01ca:
            return
        L_0x01cb:
            java.lang.Object r0 = r0.b
            r4 = r0
            uv0 r4 = (defpackage.uv0) r4
            monitor-enter(r4)
            r4.j = r1     // Catch:{ all -> 0x01d7 }
            monitor-exit(r4)
            return
        L_0x01d5:
            monitor-exit(r4)     // Catch:{ all -> 0x01d7 }
            throw r0
        L_0x01d7:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d9:
            java.lang.Object r0 = r0.b
            zo0 r0 = (defpackage.zo0) r0
            bf5 r0 = r0.a
            mg5 r0 = (defpackage.mg5) r0
            r0.getClass()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "botCommands"
            java.io.File r0 = defpackage.mg5.g(r0, r1)
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0202
            int r1 = r0.length
            if (r1 != 0) goto L_0x01f8
            goto L_0x0202
        L_0x01f8:
            int r1 = r0.length
        L_0x01f9:
            if (r3 >= r1) goto L_0x0209
            r4 = r0[r3]
            r4.delete()
            int r3 = r3 + r2
            goto L_0x01f9
        L_0x0202:
            java.lang.String r0 = "zo0"
            java.lang.String r1 = "deleteBotCommands: directory is empty"
            udd.q(r0, r1)
        L_0x0209:
            return
        L_0x020a:
            int r1 = ru.ok.messages.media.audio.AudioRecordView.S0
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.audio.AudioRecordView r0 = (ru.ok.messages.media.audio.AudioRecordView) r0
            r0.getClass()
            return
        L_0x0214:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            v10 r1 = r0.a1
            if (r1 == 0) goto L_0x0259
            androidx.viewpager.widget.ViewPager r2 = r0.j1
            int r2 = r2.getCurrentItem()
            yia r1 = r1.l(r2)
            if (r1 != 0) goto L_0x0229
            goto L_0x0259
        L_0x0229:
            java.lang.Object r2 = r1.a
            o10 r2 = (defpackage.o10) r2
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x0238
            a10 r2 = r2.b
            long r2 = r2.w0
            goto L_0x0250
        L_0x0238:
            boolean r3 = r2.i()
            if (r3 == 0) goto L_0x0243
            n10 r2 = r2.d
            long r2 = r2.a
            goto L_0x0250
        L_0x0243:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x024e
            v00 r2 = r2.j
            long r2 = r2.a
            goto L_0x0250
        L_0x024e:
            r2 = 0
        L_0x0250:
            java.lang.Object r1 = r1.b
            xm8 r1 = (defpackage.xm8) r1
            og0 r0 = r0.q1
            r0.s(r1, r2)
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5.run():void");
    }
}
