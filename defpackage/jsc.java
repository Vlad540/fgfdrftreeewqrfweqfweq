package defpackage;

import android.view.View;

/* renamed from: jsc  reason: default package */
public final class jsc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jsc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Message} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: ul8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r10v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.String r0 = "There is no currently selected dynamic group route."
            java.lang.String r1 = "route must not be null"
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.Object r6 = r9.b
            int r9 = r9.a
            switch(r9) {
                case 0: goto L_0x0388;
                case 1: goto L_0x0382;
                case 2: goto L_0x0349;
                case 3: goto L_0x0317;
                case 4: goto L_0x0311;
                case 5: goto L_0x0301;
                case 6: goto L_0x02fb;
                case 7: goto L_0x02b2;
                case 8: goto L_0x025f;
                case 9: goto L_0x00df;
                case 10: goto L_0x00d9;
                case 11: goto L_0x005e;
                case 12: goto L_0x0058;
                case 13: goto L_0x0049;
                default: goto L_0x000f;
            }
        L_0x000f:
            com.google.android.exoplayer2.ui.TrackSelectionView r6 = (com.google.android.exoplayer2.ui.TrackSelectionView) r6
            android.widget.CheckedTextView r9 = r6.a
            android.util.SparseArray r0 = r6.c
            android.widget.CheckedTextView r1 = r6.b
            if (r10 != r9) goto L_0x001f
            r6.x0 = r5
            r0.clear()
            goto L_0x0026
        L_0x001f:
            if (r10 != r1) goto L_0x003c
            r6.x0 = r4
            r0.clear()
        L_0x0026:
            android.widget.CheckedTextView r9 = r6.a
            boolean r10 = r6.x0
            r9.setChecked(r10)
            boolean r9 = r6.x0
            if (r9 != 0) goto L_0x0038
            int r9 = r0.size()
            if (r9 != 0) goto L_0x0038
            r4 = r5
        L_0x0038:
            r1.setChecked(r4)
            throw r3
        L_0x003c:
            r6.x0 = r4
            java.lang.Object r9 = r10.getTag()
            r9.getClass()
            wn6.o(r9)
            throw r3
        L_0x0049:
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            rle r9 = r6.e1
            if (r9 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            ul8 r3 = r9.b
        L_0x0052:
            if (r3 == 0) goto L_0x0057
            r3.collapseActionView()
        L_0x0057:
            return
        L_0x0058:
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r6 = (one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet) r6
            r6.r0(r5)
            return
        L_0x005e:
            k77[] r9 = one.me.profile.ProfileScreen.H0
            one.me.profile.ProfileScreen r6 = (one.me.profile.ProfileScreen) r6
            fgb r9 = r6.q0()
            grd r10 = r9.R0
            java.lang.Object r10 = r10.getValue()
            l5b r10 = (l5b) r10
            if (r10 == 0) goto L_0x0073
            java.util.List r10 = r10.c
            goto L_0x0074
        L_0x0073:
            r10 = r3
        L_0x0074:
            h5b r0 = r9.T0
            if (r10 != 0) goto L_0x00cd
            boolean r10 = r0.b()
            if (r10 == 0) goto L_0x00d8
            t97 r10 = r9.L0
            java.lang.Object r10 = r10.getValue()
            q5b r10 = (q5b) r10
            r10.getClass()
            int r0 = l8a.Z
            hge r1 = new hge
            r1.<init>(r0)
            lg7 r0 = defpackage.hwf.c()
            kc3 r2 = new kc3
            int r5 = j8a.o
            int r6 = l8a.b0
            hge r7 = new hge
            r7.<init>(r6)
            r6 = 3
            r2.<init>(r5, r7, r6, r4)
            r0.add(r2)
            kc3 r2 = new kc3
            int r5 = j8a.n
            int r7 = l8a.a0
            hge r8 = new hge
            r8.<init>(r7)
            r2.<init>(r5, r8, r6, r4)
            r0.add(r2)
            kc3 r10 = r10.b()
            r0.add(r10)
            lg7 r10 = defpackage.hwf.a(r0)
            xeb r0 = new xeb
            r0.<init>(r1, r3, r10, r3)
            l05 r9 = r9.E0
            taf.o(r9, r0)
            goto L_0x00d8
        L_0x00cd:
            a34 r10 = r0.x()
            if (r10 == 0) goto L_0x00d8
            l05 r9 = r9.F0
            taf.o(r9, r10)
        L_0x00d8:
            return
        L_0x00d9:
            one.me.sdk.permissionhost.PermissionBottomSheet r6 = (one.me.sdk.permissionhost.PermissionBottomSheet) r6
            r6.r0(r5)
            return
        L_0x00df:
            androidx.mediarouter.app.g r6 = (androidx.mediarouter.app.g) r6
            xb8 r9 = r6.J0
            boolean r9 = r6.D(r9)
            r9 = r9 ^ r5
            xb8 r10 = r6.J0
            boolean r10 = r10.e()
            hb8 r3 = r6.W0
            if (r9 == 0) goto L_0x0141
            jb8 r7 = r3.B0
            yb8 r7 = r7.Y
            xb8 r8 = r6.J0
            r7.getClass()
            if (r8 == 0) goto L_0x013b
            defpackage.yb8.b()
            ub8 r1 = defpackage.yb8.c()
            nb8 r7 = r1.s
            boolean r7 = r7 instanceof defpackage.mb8
            if (r7 == 0) goto L_0x0135
            xb8 r0 = r1.r
            x3a r0 = r0.b(r8)
            xb8 r7 = r1.r
            java.util.ArrayList r7 = r7.u
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x0131
            if (r0 == 0) goto L_0x0131
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x0127
            goto L_0x0131
        L_0x0127:
            nb8 r0 = r1.s
            mb8 r0 = (defpackage.mb8) r0
            java.lang.String r1 = r8.b
            r0.m(r1)
            goto L_0x0195
        L_0x0131:
            r8.toString()
            goto L_0x0195
        L_0x0135:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r0)
            throw r9
        L_0x013b:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x0141:
            jb8 r7 = r3.B0
            yb8 r7 = r7.Y
            xb8 r8 = r6.J0
            r7.getClass()
            if (r8 == 0) goto L_0x0259
            defpackage.yb8.b()
            ub8 r1 = defpackage.yb8.c()
            nb8 r7 = r1.s
            boolean r7 = r7 instanceof defpackage.mb8
            if (r7 == 0) goto L_0x0253
            xb8 r0 = r1.r
            x3a r0 = r0.b(r8)
            xb8 r7 = r1.r
            java.util.ArrayList r7 = r7.u
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0192
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r0.b
            lb8 r0 = (defpackage.lb8) r0
            if (r0 == 0) goto L_0x0179
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x0192
        L_0x0179:
            xb8 r0 = r1.r
            java.util.ArrayList r0 = r0.u
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0188
            goto L_0x0195
        L_0x0188:
            nb8 r0 = r1.s
            mb8 r0 = (defpackage.mb8) r0
            java.lang.String r1 = r8.b
            r0.n(r1)
            goto L_0x0195
        L_0x0192:
            r8.toString()
        L_0x0195:
            r0 = r10 ^ 1
            r6.F(r9, r0)
            if (r10 == 0) goto L_0x01da
            jb8 r10 = r3.B0
            xb8 r10 = r10.x0
            java.util.ArrayList r10 = r10.u
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            xb8 r0 = r6.J0
            java.util.ArrayList r0 = r0.u
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x01b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01da
            java.lang.Object r1 = r0.next()
            xb8 r1 = (defpackage.xb8) r1
            boolean r7 = r10.contains(r1)
            if (r7 == r9) goto L_0x01b2
            jb8 r7 = r3.B0
            java.util.HashMap r7 = r7.K0
            java.lang.String r1 = r1.c
            java.lang.Object r1 = r7.get(r1)
            androidx.mediarouter.app.e r1 = (androidx.mediarouter.app.e) r1
            boolean r7 = r1 instanceof androidx.mediarouter.app.g
            if (r7 == 0) goto L_0x01b2
            androidx.mediarouter.app.g r1 = (androidx.mediarouter.app.g) r1
            r1.F(r9, r5)
            goto L_0x01b2
        L_0x01da:
            xb8 r10 = r6.J0
            jb8 r0 = r3.B0
            xb8 r1 = r0.x0
            java.util.ArrayList r1 = r1.u
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            int r6 = r1.size()
            int r6 = java.lang.Math.max(r5, r6)
            boolean r7 = r10.e()
            r8 = -1
            if (r7 == 0) goto L_0x0218
            java.util.ArrayList r10 = r10.u
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x01ff:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x021c
            java.lang.Object r7 = r10.next()
            xb8 r7 = (defpackage.xb8) r7
            boolean r7 = r1.contains(r7)
            if (r7 == r9) goto L_0x01ff
            if (r9 == 0) goto L_0x0215
            r7 = r5
            goto L_0x0216
        L_0x0215:
            r7 = r8
        L_0x0216:
            int r6 = r6 + r7
            goto L_0x01ff
        L_0x0218:
            if (r9 == 0) goto L_0x021b
            r8 = r5
        L_0x021b:
            int r6 = r6 + r8
        L_0x021c:
            jb8 r9 = r3.B0
            boolean r10 = r9.h1
            if (r10 == 0) goto L_0x0232
            xb8 r9 = r9.x0
            java.util.ArrayList r9 = r9.u
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            int r9 = r9.size()
            if (r9 <= r5) goto L_0x0232
            r9 = r5
            goto L_0x0233
        L_0x0232:
            r9 = r4
        L_0x0233:
            boolean r10 = r0.h1
            if (r10 == 0) goto L_0x023a
            if (r6 < r2) goto L_0x023a
            goto L_0x023b
        L_0x023a:
            r5 = r4
        L_0x023b:
            if (r9 == r5) goto L_0x0252
            androidx.recyclerview.widget.RecyclerView r9 = r0.H0
            b7c r9 = r9.M(r4)
            boolean r10 = r9 instanceof androidx.mediarouter.app.f
            if (r10 == 0) goto L_0x0252
            androidx.mediarouter.app.f r9 = (androidx.mediarouter.app.f) r9
            android.view.View r10 = r9.a
            if (r5 == 0) goto L_0x024f
            int r4 = r9.O0
        L_0x024f:
            r3.C(r10, r4)
        L_0x0252:
            return
        L_0x0253:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r0)
            throw r9
        L_0x0259:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x025f:
            eb8 r6 = (defpackage.eb8) r6
            hb8 r9 = r6.P0
            jb8 r9 = r9.B0
            yb8 r9 = r9.Y
            xb8 r10 = r6.O0
            r9.getClass()
            if (r10 == 0) goto L_0x02ac
            defpackage.yb8.b()
            ub8 r9 = defpackage.yb8.c()
            nb8 r1 = r9.s
            boolean r1 = r1 instanceof defpackage.mb8
            if (r1 == 0) goto L_0x02a6
            xb8 r0 = r9.r
            x3a r0 = r0.b(r10)
            if (r0 == 0) goto L_0x029a
            java.lang.Object r0 = r0.b
            lb8 r0 = (defpackage.lb8) r0
            if (r0 == 0) goto L_0x029a
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x029a
            nb8 r9 = r9.s
            mb8 r9 = (defpackage.mb8) r9
            java.lang.String r10 = r10.b
            java.util.List r10 = java.util.Collections.singletonList(r10)
            r9.o(r10)
        L_0x029a:
            android.widget.ImageView r9 = r6.K0
            r10 = 4
            r9.setVisibility(r10)
            android.widget.ProgressBar r9 = r6.L0
            r9.setVisibility(r4)
            return
        L_0x02a6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r0)
            throw r9
        L_0x02ac:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x02b2:
            androidx.mediarouter.app.e r6 = (androidx.mediarouter.app.e) r6
            jb8 r9 = r6.M0
            xb8 r0 = r9.L0
            if (r0 == 0) goto L_0x02bf
            fx r9 = r9.G0
            r9.removeMessages(r2)
        L_0x02bf:
            xb8 r9 = r6.J0
            jb8 r0 = r6.M0
            r0.L0 = r9
            boolean r9 = r10.isActivated()
            r9 = r9 ^ r5
            if (r9 == 0) goto L_0x02cd
            goto L_0x02e6
        L_0x02cd:
            java.util.HashMap r10 = r0.M0
            xb8 r1 = r6.J0
            java.lang.String r1 = r1.c
            java.lang.Object r10 = r10.get(r1)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x02dd
            r4 = r5
            goto L_0x02e6
        L_0x02dd:
            int r10 = r10.intValue()
            int r10 = java.lang.Math.max(r5, r10)
            r4 = r10
        L_0x02e6:
            r6.B(r9)
            androidx.mediarouter.app.MediaRouteVolumeSlider r9 = r6.L0
            r9.setProgress(r4)
            xb8 r9 = r6.J0
            r9.j(r4)
            fx r9 = r0.G0
            r0 = 500(0x1f4, double:2.47E-321)
            r9.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x02fb:
            ab8 r6 = (defpackage.ab8) r6
            r6.dismiss()
            return
        L_0x0301:
            com.google.android.material.datepicker.MaterialCalendar r6 = (com.google.android.material.datepicker.MaterialCalendar) r6
            int r9 = r6.t1
            if (r9 != r2) goto L_0x030b
            r6.g1(r5)
            goto L_0x0310
        L_0x030b:
            if (r9 != r5) goto L_0x0310
            r6.g1(r2)
        L_0x0310:
            return
        L_0x0311:
            one.me.dialogs.share.media.ChatMediaDownloadBottomSheet r6 = (one.me.dialogs.share.media.ChatMediaDownloadBottomSheet) r6
            r6.r0(r5)
            return
        L_0x0317:
            fq0 r6 = (defpackage.fq0) r6
            boolean r9 = r6.z0
            if (r9 == 0) goto L_0x0348
            boolean r9 = r6.isShowing()
            if (r9 == 0) goto L_0x0348
            boolean r9 = r6.B0
            if (r9 != 0) goto L_0x0341
            android.content.Context r9 = r6.getContext()
            r10 = 16843611(0x101035b, float:2.3695965E-38)
            int[] r10 = new int[]{r10}
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10)
            boolean r10 = r9.getBoolean(r4, r5)
            r6.A0 = r10
            r9.recycle()
            r6.B0 = r5
        L_0x0341:
            boolean r9 = r6.A0
            if (r9 == 0) goto L_0x0348
            r6.cancel()
        L_0x0348:
            return
        L_0x0349:
            sc r6 = (defpackage.sc) r6
            android.widget.Button r9 = r6.k
            if (r10 != r9) goto L_0x0358
            android.os.Message r9 = r6.m
            if (r9 == 0) goto L_0x0358
            android.os.Message r3 = android.os.Message.obtain(r9)
            goto L_0x0371
        L_0x0358:
            android.widget.Button r9 = r6.o
            if (r10 != r9) goto L_0x0365
            android.os.Message r9 = r6.q
            if (r9 == 0) goto L_0x0365
            android.os.Message r3 = android.os.Message.obtain(r9)
            goto L_0x0371
        L_0x0365:
            android.widget.Button r9 = r6.s
            if (r10 != r9) goto L_0x0371
            android.os.Message r9 = r6.u
            if (r9 == 0) goto L_0x0371
            android.os.Message r3 = android.os.Message.obtain(r9)
        L_0x0371:
            if (r3 == 0) goto L_0x0376
            r3.sendToTarget()
        L_0x0376:
            qc r9 = r6.K
            fn r10 = r6.b
            android.os.Message r9 = r9.obtainMessage(r5, r10)
            r9.sendToTarget()
            return
        L_0x0382:
            n7 r6 = (defpackage.n7) r6
            r6.a()
            return
        L_0x0388:
            tsc r6 = (defpackage.tsc) r6
            android.widget.ImageView r9 = r6.mSearchButton
            if (r10 != r9) goto L_0x0392
            r6.onSearchClicked()
            goto L_0x03b1
        L_0x0392:
            android.widget.ImageView r9 = r6.mCloseButton
            if (r10 != r9) goto L_0x039a
            r6.onCloseClicked()
            goto L_0x03b1
        L_0x039a:
            android.widget.ImageView r9 = r6.mGoButton
            if (r10 != r9) goto L_0x03a2
            r6.onSubmitQuery()
            goto L_0x03b1
        L_0x03a2:
            android.widget.ImageView r9 = r6.mVoiceButton
            if (r10 != r9) goto L_0x03aa
            r6.onVoiceClicked()
            goto L_0x03b1
        L_0x03aa:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r9 = r6.mSearchSrcTextView
            if (r10 != r9) goto L_0x03b1
            r6.forceSuggestionQuery()
        L_0x03b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsc.onClick(android.view.View):void");
    }
}
