package defpackage;

/* renamed from: xe9  reason: default package */
public final /* synthetic */ class xe9 implements rf3 {
    public final /* synthetic */ int a;

    public /* synthetic */ xe9(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: mif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v82, resolved type: mif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v83, resolved type: mif} */
    /* JADX WARNING: type inference failed for: r15v10, types: [android.content.Context, java.lang.Object, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: type inference failed for: r15v13, types: [android.content.Context, java.lang.Object, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "jpg"
            r1 = 2
            java.lang.String r2 = "vd9"
            r3 = 0
            r4 = 0
            r5 = 1
            int r14 = r14.a
            switch(r14) {
                case 0: goto L_0x043b;
                case 1: goto L_0x0356;
                case 2: goto L_0x0305;
                case 3: goto L_0x02aa;
                case 4: goto L_0x0272;
                case 5: goto L_0x026c;
                case 6: goto L_0x0266;
                case 7: goto L_0x0260;
                case 8: goto L_0x025a;
                case 9: goto L_0x0241;
                case 10: goto L_0x01e3;
                case 11: goto L_0x01dd;
                case 12: goto L_0x017d;
                case 13: goto L_0x0172;
                case 14: goto L_0x0143;
                case 15: goto L_0x011c;
                case 16: goto L_0x0112;
                case 17: goto L_0x00f0;
                case 18: goto L_0x00bb;
                case 19: goto L_0x0037;
                case 20: goto L_0x002a;
                case 21: goto L_0x0027;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.String r14 = r15.getLocalizedMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed init camera effect due to "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "VideoMessageCameraEffect"
            udd.s(r0, r14, r15)
            return
        L_0x0027:
            android.net.Uri r15 = (android.net.Uri) r15
            return
        L_0x002a:
            lb0 r15 = (lb0) r15
            mb0 r14 = y5c.k0
            int r14 = r14.d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.d = r14
            return
        L_0x0037:
            jpa r15 = (defpackage.jpa) r15
            ls4 r14 = r15.b
            js4 r0 = r14.a()
            boolean r0 = r0.o
            r0 = r0 ^ r5
            npa r1 = r15.e
            r1.getClass()
            npa r2 = new npa
            boolean r12 = r1.Y
            boolean r13 = r1.Z
            boolean r7 = r1.a
            boolean r8 = r1.b
            boolean r9 = r1.c
            boolean r10 = r1.o
            r6 = r2
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r15.e = r2
            ppa r1 = r15.a
            r1.a(r2)
            ps4 r1 = r14.a
            r1.setDrawStickerEnabled(r0)
            js4 r1 = r14.a()
            bd4 r2 = r15.d
            r2.a(r14, r1, r4)
            ipa r14 = r15.c
            ru.ok.messages.photoeditor.ActPhotoEditor r14 = (ru.ok.messages.photoeditor.ActPhotoEditor) r14
            if (r0 == 0) goto L_0x0098
            e3 r15 = r14.b1
            if (r15 != 0) goto L_0x008c
            e3 r15 = new e3
            v2b r0 = r14.O0
            java.lang.Object r0 = r0.b
            k93 r0 = (defpackage.k93) r0
            o2a r0 = (o2a) r0
            bd r0 = r0.b()
            r15.<init>((java.lang.Object) r0)
            r14.b1 = r15
        L_0x008c:
            e3 r14 = r14.b1
            java.lang.Object r14 = r14.a
            bd r14 = (defpackage.bd) r14
            java.lang.String r15 = "DRAW_AS_STICKER_TAP"
            r14.f(r15)
            goto L_0x00ba
        L_0x0098:
            e3 r15 = r14.b1
            if (r15 != 0) goto L_0x00af
            e3 r15 = new e3
            v2b r0 = r14.O0
            java.lang.Object r0 = r0.b
            k93 r0 = (defpackage.k93) r0
            o2a r0 = (o2a) r0
            bd r0 = r0.b()
            r15.<init>((java.lang.Object) r0)
            r14.b1 = r15
        L_0x00af:
            e3 r14 = r14.b1
            java.lang.Object r14 = r14.a
            bd r14 = (defpackage.bd) r14
            java.lang.String r15 = "DRAW_REGULAR_TAP"
            r14.f(r15)
        L_0x00ba:
            return
        L_0x00bb:
            jpa r15 = (defpackage.jpa) r15
            ipa r14 = r15.c
            ru.ok.messages.photoeditor.ActPhotoEditor r14 = (ru.ok.messages.photoeditor.ActPhotoEditor) r14
            r14.getClass()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            int r0 = defpackage.cic.i2
            java.lang.String r1 = "ru.ok.tamtam.extra.CONTENT_RES_ID"
            r15.putInt(r1, r0)
            int r0 = defpackage.cic.l2
            java.lang.String r1 = "ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID"
            r15.putInt(r1, r0)
            int r0 = defpackage.cic.r
            java.lang.String r1 = "ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID"
            r15.putInt(r1, r0)
            ru.ok.messages.views.dialogs.ConfirmationDialog r0 = new ru.ok.messages.views.dialogs.ConfirmationDialog
            r0.<init>()
            r0.Y0(r15)
            vx5 r14 = r14.P()
            java.lang.String r15 = "ru.ok.messages.views.dialogs.ConfirmationDialog"
            r0.l1(r14, r15)
            return
        L_0x00f0:
            jpa r15 = (defpackage.jpa) r15
            ipa r14 = r15.c
            ru.ok.messages.photoeditor.ActPhotoEditor r14 = (ru.ok.messages.photoeditor.ActPhotoEditor) r14
            r7e r15 = r14.c1
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0108
            r14.j0(r3)
            goto L_0x0111
        L_0x0108:
            vx5 r14 = r14.P()
            java.lang.String r15 = "ru.ok.messages.photoeditor.ActPhotoEditor"
            ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment.r1(r15, r14)
        L_0x0111:
            return
        L_0x0112:
            jpa r15 = (defpackage.jpa) r15
            ipa r14 = r15.c
            ru.ok.messages.photoeditor.ActPhotoEditor r14 = (ru.ok.messages.photoeditor.ActPhotoEditor) r14
            r14.i0()
            return
        L_0x011c:
            jpa r15 = (defpackage.jpa) r15
            ls4 r14 = r15.b
            java.util.ArrayList r15 = r14.d
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0129
            goto L_0x0142
        L_0x0129:
            java.lang.Object r0 = defpackage.rf0.e(r15, r5)
            w9 r0 = (defpackage.w9) r0
            ps4 r1 = r14.a
            r0.a(r1)
            r15.remove(r0)
            java.util.ArrayList r15 = r14.e
            r15.add(r0)
            r1.invalidate()
            r14.b()
        L_0x0142:
            return
        L_0x0143:
            de9 r15 = (defpackage.de9) r15
            q98 r14 = r15.Y
            al7 r14 = (defpackage.al7) r14
            r14.n()
            c97 r14 = r15.B0
            defpackage.tic.b(r14)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            qmc r10 = de.a()
            r7 = 30
            r5 = r7
            ku9 r14 = ms9.k(r5, r7, r9, r10)
            ce9 r0 = new ce9
            r0.<init>(r15, r4)
            lu7 r1 = z3d.k
            z26 r2 = z3d.i
            c97 r3 = new c97
            r3.<init>(r0, r1, r2)
            r14.a(r3)
            r15.B0 = r3
            return
        L_0x0172:
            de9 r15 = (defpackage.de9) r15
            ru.ok.messages.media.trim.FrgTrimVideo r14 = r15.c
            r14.s1()
            r14.f1()
            return
        L_0x017d:
            de9 r15 = (defpackage.de9) r15
            long r0 = r15.w0
            r2 = 0
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r0 = r15.Z
            if (r14 != 0) goto L_0x0190
            long r4 = r15.x0
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0190
            goto L_0x01dc
        L_0x0190:
            r15.a2()
            r15.w0 = r2
            r15.x0 = r0
            java.lang.Object r14 = r15.b
            ge9 r14 = (defpackage.ge9) r14
            jf9 r14 = (defpackage.jf9) r14
            ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView r0 = r14.C0
            r0.setStartPosition(r2)
            long r0 = r15.x0
            ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView r2 = r14.C0
            r2.setEndPosition(r0)
            long r0 = r15.w0
            ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView r2 = r14.C0
            r2.setPointerPosition(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r15.w0
            long r1 = r0.toSeconds(r1)
            java.lang.String r1 = xs7.q(r1)
            android.widget.TextView r2 = r14.A0
            r2.setText(r1)
            long r1 = r15.x0
            long r0 = r0.toSeconds(r1)
            java.lang.String r0 = xs7.q(r0)
            android.widget.TextView r14 = r14.B0
            r14.setText(r0)
            long r0 = r15.w0
            q98 r14 = r15.Y
            al7 r14 = (defpackage.al7) r14
            r14.p(r0)
            r15.c2()
        L_0x01dc:
            return
        L_0x01dd:
            de9 r15 = (defpackage.de9) r15
            r15.pause()
            return
        L_0x01e3:
            de9 r15 = (defpackage.de9) r15
            bd r14 = r15.o
            java.lang.String r0 = "ACTION_LOCAL_MEDIA_TRIM_APPLY"
            r14.f(r0)
            java.lang.Object r14 = r15.b
            ge9 r14 = (defpackage.ge9) r14
            jf9 r14 = (defpackage.jf9) r14
            androidx.appcompat.widget.AppCompatImageButton r0 = r14.G0
            tg r2 = r14.Z
            r2.g(r0)
            android.widget.ProgressBar r0 = r14.H0
            r2.j(r0)
            java.lang.Object r14 = r14.c
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            at7.S(r14)
            long r9 = r15.w0
            ru.ok.messages.media.trim.FrgTrimVideo r7 = r15.c
            r7.getClass()
            b52 r14 = new b52
            java.lang.String r8 = r15.X
            r11 = 6
            r6 = r14
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (long) r9, (int) r11)
            mv9 r0 = new mv9
            r0.<init>(r5, r14)
            qmc r14 = cnc.a()
            yhd r14 = r0.m(r14)
            qmc r0 = de.a()
            yhd r14 = r14.i(r0)
            ce9 r0 = new ce9
            r0.<init>(r15, r5)
            dd9 r15 = new dd9
            r2 = 15
            r15.<init>((int) r2)
            pn1 r2 = new pn1
            r2.<init>(r0, r1, r15)
            r14.k(r2)
            return
        L_0x0241:
            de9 r15 = (defpackage.de9) r15
            boolean r14 = r15.C0
            r14 = r14 ^ r5
            r15.C0 = r14
            java.lang.Object r0 = r15.b
            ge9 r0 = (defpackage.ge9) r0
            jf9 r0 = (defpackage.jf9) r0
            q98 r15 = r15.Y
            al7 r15 = (defpackage.al7) r15
            boolean r15 = r15.j()
            r0.C(r14, r15)
            return
        L_0x025a:
            kf9 r15 = (defpackage.kf9) r15
            r15.I1()
            return
        L_0x0260:
            kf9 r15 = (defpackage.kf9) r15
            r15.J1()
            return
        L_0x0266:
            kf9 r15 = (defpackage.kf9) r15
            r15.V0()
            return
        L_0x026c:
            vd9 r15 = (defpackage.vd9) r15
            r15.c2()
            return
        L_0x0272:
            vd9 r15 = (defpackage.vd9) r15
            r15.getClass()
            java.lang.String r14 = "On mute button clicked"
            udd.n(r2, r14)
            f3f r14 = r15.x0
            boolean r0 = r14.d
            r1 = r0 ^ 1
            l10 r14 = r14.a()
            r14.d = r1
            f3f r14 = r14.a()
            r15.x0 = r14
            r15.e2()
            sd9 r14 = new sd9
            r14.<init>(r1)
            r15.f2(r14)
            nd9 r14 = r15.c
            if (r14 == 0) goto L_0x02a2
            ru.ok.messages.media.mediabar.ActLocalMedias r14 = (ru.ok.messages.media.mediabar.ActLocalMedias) r14
            r14.o0(r0, r5)
        L_0x02a2:
            bd r14 = r15.z0
            java.lang.String r15 = "MUTE_VIDEO_BEFORE_SEND"
            r14.d(r1, r15)
            return
        L_0x02aa:
            vd9 r15 = (defpackage.vd9) r15
            boolean r14 = r15.Z1()
            if (r14 != 0) goto L_0x02b3
            goto L_0x0304
        L_0x02b3:
            kpa r14 = r15.y0
            if (r14 == 0) goto L_0x02ba
            js4 r0 = r14.o
            goto L_0x02bb
        L_0x02ba:
            r0 = r3
        L_0x02bb:
            tk7 r1 = r15.X
            if (r14 == 0) goto L_0x02c5
            android.net.Uri r2 = r14.X
            if (r2 != 0) goto L_0x02c4
            goto L_0x02c5
        L_0x02c4:
            r3 = r0
        L_0x02c5:
            android.net.Uri r14 = defpackage.kpa.a(r14, r1)
            nd9 r15 = r15.c
            ru.ok.messages.media.mediabar.ActLocalMedias r15 = (ru.ok.messages.media.mediabar.ActLocalMedias) r15
            r15.getClass()
            java.lang.String r0 = "photo_editor:draw_sticker_enabled"
            java.lang.String r1 = "photo_editor:editor_state"
            java.lang.Class<ru.ok.messages.photoeditor.ActPhotoEditor> r2 = ru.ok.messages.photoeditor.ActPhotoEditor.class
            r6 = 3
            if (r14 != 0) goto L_0x02ef
            android.content.Intent r14 = new android.content.Intent
            r14.<init>(r15, r2)
            java.lang.String r2 = "photo_editor:is_drawing"
            r14.putExtra(r2, r5)
            if (r3 == 0) goto L_0x02e8
            r14.putExtra(r1, r3)
        L_0x02e8:
            r14.putExtra(r0, r4)
            r15.startActivityForResult(r14, r6)
            goto L_0x0304
        L_0x02ef:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r15, r2)
            java.lang.String r2 = "photo_editor:background_uri"
            r5.putExtra(r2, r14)
            if (r3 == 0) goto L_0x02fe
            r5.putExtra(r1, r3)
        L_0x02fe:
            r5.putExtra(r0, r4)
            r15.startActivityForResult(r5, r6)
        L_0x0304:
            return
        L_0x0305:
            vd9 r15 = (defpackage.vd9) r15
            r15.getClass()
            java.lang.String r14 = "onTrimButtonClicked"
            udd.n(r2, r14)
            tk7 r14 = r15.X
            if (r14 == 0) goto L_0x0355
            boolean r14 = r14.b()
            if (r14 == 0) goto L_0x0355
            tk7 r14 = r15.X
            java.lang.String r14 = r14.c
            f3f r0 = r15.x0
            float r1 = r0.b
            long r2 = r15.w0
            float r2 = (float) r2
            float r1 = r1 * r2
            long r3 = (long) r1
            float r1 = r0.c
            float r1 = r1 * r2
            long r1 = (long) r1
            nd9 r15 = r15.c
            ru.ok.messages.media.mediabar.ActLocalMedias r15 = (ru.ok.messages.media.mediabar.ActLocalMedias) r15
            r15.getClass()
            android.net.Uri r14 = android.net.Uri.parse(r14)
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<ru.ok.messages.media.trim.ActTrimVideo> r7 = ru.ok.messages.media.trim.ActTrimVideo.class
            r6.<init>(r15, r7)
            java.lang.String r7 = "ru.ok.tamtam.extra.VIDEO_URI"
            r6.putExtra(r7, r14)
            java.lang.String r14 = "ru.ok.tamtam.extra.START_POSITION"
            r6.putExtra(r14, r3)
            java.lang.String r14 = "ru.ok.tamtam.extra.END_POSITION"
            r6.putExtra(r14, r1)
            java.lang.String r14 = "ru.ok.tamtam.extra.MUTE"
            boolean r0 = r0.d
            r6.putExtra(r14, r0)
            r15.startActivityForResult(r6, r5)
        L_0x0355:
            return
        L_0x0356:
            r14 = r15
            vd9 r14 = (defpackage.vd9) r14
            r14.getClass()
            java.lang.String r15 = "onCropButtonClicked()"
            udd.q(r2, r15)
            boolean r15 = r14.Z1()
            if (r15 != 0) goto L_0x0369
            goto L_0x043a
        L_0x0369:
            bd r15 = r14.z0
            java.lang.String r2 = "LOCAL_MEDIA_CROP"
            r15.f(r2)
            bf5 r15 = r14.B0
            java.io.File r2 = r15.a(r0)
            tk7 r5 = r14.X
            java.lang.String r5 = r5.a()
            kpa r6 = r14.y0
            if (r6 == 0) goto L_0x0384
            android.net.Uri r7 = r6.Y
            r8 = r7
            goto L_0x0385
        L_0x0384:
            r8 = r3
        L_0x0385:
            if (r6 == 0) goto L_0x038b
            android.net.Uri r7 = r6.b
            r10 = r7
            goto L_0x038c
        L_0x038b:
            r10 = r3
        L_0x038c:
            if (r6 == 0) goto L_0x0391
            android.net.Uri r6 = r6.a
            goto L_0x0392
        L_0x0391:
            r6 = r3
        L_0x0392:
            if (r6 == 0) goto L_0x039a
            if (r10 != 0) goto L_0x039a
            java.lang.String r5 = r6.getPath()
        L_0x039a:
            kpa r6 = r14.y0
            if (r6 == 0) goto L_0x03a2
            jw3 r7 = r6.c
            r13 = r7
            goto L_0x03a3
        L_0x03a2:
            r13 = r3
        L_0x03a3:
            if (r6 == 0) goto L_0x03a7
            js4 r3 = r6.o
        L_0x03a7:
            if (r13 != 0) goto L_0x03ab
            if (r10 != 0) goto L_0x03af
        L_0x03ab:
            if (r13 == 0) goto L_0x03cd
            if (r3 == 0) goto L_0x03cd
        L_0x03af:
            if (r8 == 0) goto L_0x03c5
            if (r10 == 0) goto L_0x03bf
            java.io.File r11 = r15.a(r0)
            r7 = r14
            r9 = r2
            r12 = r13
            r7.b2(r8, r9, r10, r11, r12)
            goto L_0x043a
        L_0x03bf:
            java.lang.String r5 = r8.getPath()
            goto L_0x042e
        L_0x03c5:
            if (r10 == 0) goto L_0x042e
            java.lang.String r5 = r10.getPath()
            goto L_0x042e
        L_0x03cd:
            if (r8 == 0) goto L_0x042e
            if (r10 == 0) goto L_0x041f
            java.io.File r3 = r15.a(r0)
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            java.io.File r12 = r15.a(r0)
            android.net.Uri r15 = android.net.Uri.parse(r5)
            f94 r7 = r14.C0
            r7.getClass()
            q34 r0 = new q34
            r10 = 0
            r11 = 4
            r6 = r0
            r8 = r15
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            y63 r5 = new y63
            r5.<init>(r4, r0)
            qmc r0 = cnc.a()
            f73 r0 = r5.k(r0)
            qmc r5 = de.a()
            f73 r0 = r0.h(r5)
            rd9 r5 = new rd9
            r7 = r5
            r8 = r14
            r9 = r3
            r10 = r2
            r11 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            qd9 r15 = new qd9
            r15.<init>(r14, r1)
            pn1 r1 = new pn1
            r1.<init>(r15, r4, r5)
            r0.i(r1)
            r14.H0 = r1
            goto L_0x043a
        L_0x041f:
            android.net.Uri r10 = android.net.Uri.parse(r5)
            java.io.File r11 = r15.a(r0)
            r7 = r14
            r9 = r2
            r12 = r13
            r7.b2(r8, r9, r10, r11, r12)
            goto L_0x043a
        L_0x042e:
            android.net.Uri r8 = android.net.Uri.parse(r5)
            r10 = 0
            r11 = 0
            r7 = r14
            r9 = r2
            r12 = r13
            r7.b2(r8, r9, r10, r11, r12)
        L_0x043a:
            return
        L_0x043b:
            vd9 r15 = (defpackage.vd9) r15
            boolean r14 = r15.Z1()
            if (r14 != 0) goto L_0x0445
            goto L_0x04c2
        L_0x0445:
            kpa r14 = r15.y0
            if (r14 == 0) goto L_0x044e
            mif r14 = r14.c()
            goto L_0x0453
        L_0x044e:
            mif r14 = new mif
            r14.<init>()
        L_0x0453:
            kpa r1 = r15.y0
            java.lang.String r2 = "TOGGLE_PHOTO_SMOOTH_FILTER"
            bd r6 = r15.z0
            if (r1 == 0) goto L_0x0476
            android.net.Uri r1 = r1.Y
            if (r1 == 0) goto L_0x0476
            r14.Y = r3
            kpa r14 = r14.d()
            r15.y0 = r14
            r15.d2()
            od9 r14 = new od9
            r14.<init>(r15, r5)
            r15.f2(r14)
            r6.d(r4, r2)
            goto L_0x04c2
        L_0x0476:
            r11 = 1
            r6.d(r11, r2)
            kpa r1 = r15.y0
            tk7 r2 = r15.X
            android.net.Uri r9 = defpackage.kpa.a(r1, r2)
            bf5 r1 = r15.B0
            java.io.File r0 = r1.a(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            f94 r8 = r15.C0
            r8.getClass()
            q34 r1 = new q34
            r12 = 4
            r7 = r1
            r10 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            y63 r2 = new y63
            r2.<init>(r4, r1)
            qmc r1 = cnc.a()
            f73 r1 = r2.k(r1)
            qmc r2 = de.a()
            f73 r1 = r1.h(r2)
            pd9 r2 = new pd9
            r2.<init>(r15, r14, r0, r4)
            qd9 r14 = new qd9
            r14.<init>(r15, r4)
            pn1 r0 = new pn1
            r0.<init>(r14, r4, r2)
            r1.i(r0)
            r15.H0 = r0
        L_0x04c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe9.accept(java.lang.Object):void");
    }
}
