package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: tg1  reason: default package */
public final class tg1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tg1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((tg1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tg1 tg1 = new tg1(continuation, this.Y);
        tg1.X = obj;
        return tg1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.media.projection.MediaProjectionManager} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r8v0, types: [one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet, rr3] */
    /* JADX WARNING: type inference failed for: r4v1, types: [sgc] */
    /* JADX WARNING: type inference failed for: r4v3, types: [sgc] */
    /* JADX WARNING: type inference failed for: r4v5, types: [sgc] */
    /* JADX WARNING: type inference failed for: r4v7, types: [sgc] */
    /* JADX WARNING: type inference failed for: r4v9, types: [sgc] */
    /* JADX WARNING: type inference failed for: r8v5, types: [one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet, rr3] */
    /* JADX WARNING: type inference failed for: r4v11, types: [sgc] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            defpackage.wx3.H(r15)
            java.lang.Object r15 = r14.X
            sg9 r15 = (sg9) r15
            boolean r3 = r15 instanceof defpackage.wh1
            if (r3 == 0) goto L_0x043e
            wh1 r15 = (defpackage.wh1) r15
            smc r3 = one.me.calls.ui.ui.call.CallScreen.T0
            one.me.calls.ui.ui.call.CallScreen r14 = r14.Y
            r14.getClass()
            boolean r3 = r15 instanceof defpackage.th1
            if (r3 == 0) goto L_0x004d
            th1 r15 = (defpackage.th1) r15
            g21 r15 = r15.C
            mq3 r0 = defpackage.pfa.a(r2)
            mq3 r0 = r0.d()
            android.os.Bundle r1 = r15.a
            mq3 r0 = r0.h(r1)
            mq3 r0 = r0.b()
            android.graphics.Point r1 = r15.d
            if (r1 == 0) goto L_0x003e
            int r2 = r1.x
            float r2 = (float) r2
            int r1 = r1.y
            float r1 = (float) r1
            r0.f(r2, r1)
        L_0x003e:
            java.util.List r15 = r15.b
            mq3 r15 = r0.e(r15)
            nq3 r15 = r15.build()
            r15.q(r14)
            goto L_0x0449
        L_0x004d:
            boolean r3 = r15 instanceof defpackage.uh1
            if (r3 == 0) goto L_0x0070
            oed r0 = r14.v0()
            uh1 r15 = (defpackage.uh1) r15
            rs3 r1 = r14.u0()
            ls3 r1 = r1.k
            int r1 = r1.b()
            r0.getClass()
            fh1 r0 = defpackage.fh1.a
            mz4 r3 = new mz4
            r3.<init>((java.lang.Object) r15, (java.lang.Object) r14, (int) r1, (int) r2)
            defpackage.oed.b(r0, r3)
            goto L_0x0449
        L_0x0070:
            boolean r3 = r15 instanceof defpackage.vh1
            if (r3 == 0) goto L_0x0093
            oed r0 = r14.v0()
            vh1 r15 = (defpackage.vh1) r15
            rs3 r2 = r14.u0()
            ls3 r2 = r2.k
            int r2 = r2.b()
            r0.getClass()
            fh1 r0 = defpackage.fh1.b
            mz4 r3 = new mz4
            r3.<init>((java.lang.Object) r14, (java.lang.Object) r15, (int) r2, (int) r1)
            defpackage.oed.b(r0, r3)
            goto L_0x0449
        L_0x0093:
            boolean r3 = r15 instanceof defpackage.jh1
            r4 = 0
            if (r3 == 0) goto L_0x00e7
            aj1 r15 = r14.z0()
            u81 r15 = r15.s()
            y11 r15 = r15.f
            if (r15 == 0) goto L_0x00a7
            java.lang.Long r15 = r15.a
            goto L_0x00a8
        L_0x00a7:
            r15 = r4
        L_0x00a8:
            if (r15 == 0) goto L_0x0449
            iq1 r5 = r14.t0()
            aj1 r0 = r14.z0()
            u81 r0 = r0.s()
            java.lang.String r7 = r0.a
            aj1 r14 = r14.z0()
            u81 r14 = r14.s()
            boolean r12 = r14.g
            r5.getClass()
            r10 = 0
            r11 = 0
            java.lang.String r6 = "PROFILE_OPENED"
            r8 = 0
            r9 = 0
            r13 = 60
            iq1.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            oc1 r14 = defpackage.oc1.c
            long r0 = r15.longValue()
            d34 r14 = r14.P1()
            java.lang.String r15 = ":profile?id="
            java.lang.String r2 = "&type=local_chat"
            java.lang.String r15 = us8.j(r0, r15, r2)
            r14.b(r15, r4)
            goto L_0x0449
        L_0x00e7:
            boolean r3 = r15 instanceof defpackage.ih1
            if (r3 == 0) goto L_0x0146
            aj1 r14 = r14.z0()
            u81 r15 = r14.s()
            y11 r15 = r15.f
            if (r15 == 0) goto L_0x0449
            java.lang.Long r15 = r15.a
            if (r15 == 0) goto L_0x0449
            long r0 = r15.longValue()
            t97 r15 = r14.z0
            java.lang.Object r15 = r15.getValue()
            r2 = r15
            iq1 r2 = (iq1) r2
            u81 r15 = r14.s()
            java.lang.String r4 = r15.a
            u81 r15 = r14.s()
            boolean r9 = r15.g
            r2.getClass()
            r6 = 0
            r10 = 60
            java.lang.String r3 = "CHAT_OPENED"
            r5 = 0
            r7 = 0
            r8 = 0
            iq1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            oc1 r15 = defpackage.oc1.c
            r15.getClass()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = ":chats?id="
            r15.<init>(r2)
            r15.append(r0)
            java.lang.String r0 = "&type=local"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            a34 r0 = new a34
            r0.<init>(r15)
            l05 r14 = r14.Q0
            taf.o(r14, r0)
            goto L_0x0449
        L_0x0146:
            boolean r3 = r15 instanceof defpackage.ch1
            if (r3 == 0) goto L_0x014f
            r14.p0(r2)
            goto L_0x0449
        L_0x014f:
            boolean r3 = r15 instanceof defpackage.rh1
            r5 = 0
            if (r3 == 0) goto L_0x01a5
            rh1 r15 = (defpackage.rh1) r15
            boolean r15 = r15.C
            aj1 r0 = r14.z0()
            u81 r0 = r0.s()
            ai1 r0 = r0.i
            boolean r0 = r0.a()
            if (r15 != 0) goto L_0x0173
            if (r0 == 0) goto L_0x0173
            aj1 r14 = r14.z0()
            r14.w(r5, r4)
            goto L_0x0449
        L_0x0173:
            if (r15 == 0) goto L_0x0179
            if (r0 == 0) goto L_0x0179
            goto L_0x0449
        L_0x0179:
            im r15 = r14.requireActivity()
            java.lang.String r0 = "media_projection"
            java.lang.Object r15 = r15.getSystemService(r0)
            boolean r0 = r15 instanceof android.media.projection.MediaProjectionManager
            if (r0 == 0) goto L_0x018a
            r4 = r15
            android.media.projection.MediaProjectionManager r4 = (android.media.projection.MediaProjectionManager) r4
        L_0x018a:
            if (r4 != 0) goto L_0x019c
            aj1 r14 = r14.z0()
            r14.getClass()
            uh1 r15 = defpackage.wh1.p
            l05 r14 = r14.Q0
            taf.o(r14, r15)
            goto L_0x0449
        L_0x019c:
            android.content.Intent r15 = r4.createScreenCaptureIntent()
            r14.startActivityForResult(r15, r2)
            goto L_0x0449
        L_0x01a5:
            boolean r3 = r15 instanceof defpackage.mh1
            if (r3 == 0) goto L_0x0226
            aj1 r14 = r14.z0()
            mh1 r15 = (defpackage.mh1) r15
            java.lang.CharSequence r15 = r15.C
            po1 r14 = r14.c
            r14.getClass()
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r0 = new ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder
            r0.<init>()
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r0 = r0.isStream(r5)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r15 = r0.withName(r15)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams r4 = r15.build()
            boc r14 = r14.i
            doc r14 = (defpackage.doc) r14
            r14.getClass()
            java.lang.String r15 = "startRecordBroadcast"
            java.lang.String r0 = "ScreenRecordControllerTag"
            defpackage.udd.P(r0, r15, new java.lang.Object[0])
            java.util.concurrent.locks.ReentrantLock r15 = r14.X
            r15.lock()
            grd r1 = r14.Z     // Catch:{ all -> 0x01f2 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x01f2 }
            eoc r1 = (defpackage.eoc) r1     // Catch:{ all -> 0x01f2 }
            foc r1 = r1.a     // Catch:{ all -> 0x01f2 }
            foc r3 = defpackage.foc.a     // Catch:{ all -> 0x01f2 }
            if (r1 != r3) goto L_0x01f4
            java.lang.String r14 = "startRecordBroadcast already started"
            defpackage.udd.P(r0, r14, new java.lang.Object[0])     // Catch:{ all -> 0x01f2 }
            r15.unlock()
            goto L_0x0449
        L_0x01f2:
            r14 = move-exception
            goto L_0x0222
        L_0x01f4:
            t97 r0 = r14.o     // Catch:{ all -> 0x01f2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01f2 }
            r5 = r0
            iq1 r5 = (iq1) r5     // Catch:{ all -> 0x01f2 }
            r5.getClass()     // Catch:{ all -> 0x01f2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01f2 }
            java.lang.String r6 = "CALL_RECORDING"
            r10 = 0
            r13 = 54
            r11 = 0
            r12 = 1
            r7 = 0
            r8 = 0
            iq1.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01f2 }
            ru.ok.android.externcalls.sdk.record.RecordManager r3 = r14.b()     // Catch:{ all -> 0x01f2 }
            if (r3 == 0) goto L_0x021d
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            ru.ok.android.externcalls.sdk.record.RecordManager.startRecord$default(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01f2 }
        L_0x021d:
            r15.unlock()
            goto L_0x0449
        L_0x0222:
            r15.unlock()
            throw r14
        L_0x0226:
            boolean r3 = r15 instanceof defpackage.eh1
            if (r3 == 0) goto L_0x022f
            r14.p0(r5)
            goto L_0x0449
        L_0x022f:
            boolean r3 = r15 instanceof defpackage.dh1
            if (r3 == 0) goto L_0x0242
            aj1 r14 = r14.z0()
            dh1 r15 = (defpackage.dh1) r15
            raf r15 = r15.C
            po1 r14 = r14.c
            r14.a(r15)
            goto L_0x0449
        L_0x0242:
            boolean r3 = r15 instanceof defpackage.sh1
            java.lang.String r6 = r14.w0
            if (r3 == 0) goto L_0x0259
            oc1 r14 = defpackage.oc1.c
            d34 r14 = r14.P1()
            java.lang.String r15 = ":call-opponents-list?arg_key_scope_id="
            java.lang.String r15 = r15.concat(r6)
            r14.b(r15, r4)
            goto L_0x0449
        L_0x0259:
            boolean r3 = r15 instanceof defpackage.gh1
            if (r3 == 0) goto L_0x0295
            gh1 r15 = (defpackage.gh1) r15
            java.lang.String r15 = r15.C
            android.content.Context r1 = r14.getContext()
            defpackage.hhd.q(r1, r15)
            boolean r15 = defpackage.hhd.y()
            if (r15 == 0) goto L_0x0449
            android.content.Context r15 = r14.getContext()
            int r1 = defpackage.ftb.call_link_share_dialog_share_link_copy
            java.lang.String r15 = r15.getString(r1)
            hba r1 = new hba
            r1.<init>(r14)
            r1.i(r15)
            bm1 r14 = new bm1
            r14.<init>(r0, r4)
            r1.d(r14)
            pba r14 = new pba
            r14.<init>(r5, r5, r0)
            r1.c(r14)
            r1.j()
            goto L_0x0449
        L_0x0295:
            boolean r0 = r15 instanceof defpackage.oh1
            java.lang.String r3 = "BottomSheetWidget"
            if (r0 == 0) goto L_0x02d5
            k77[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r8 = new one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet
            gc1 r15 = defpackage.gc1.b
            r8.<init>(r6, r15, r4)
            r8.setTargetController(r14)
        L_0x02a7:
            rr3 r15 = r14.getParentController()
            if (r15 == 0) goto L_0x02b2
            rr3 r14 = r14.getParentController()
            goto L_0x02a7
        L_0x02b2:
            boolean r15 = r14 instanceof ygc
            if (r15 == 0) goto L_0x02b9
            ygc r14 = (ygc) r14
            goto L_0x02ba
        L_0x02b9:
            r14 = r4
        L_0x02ba:
            if (r14 == 0) goto L_0x02c0
            sgc r4 = r14.S()
        L_0x02c0:
            if (r4 == 0) goto L_0x0449
            vgc r14 = new vgc
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            rf0.k(r5, r14, r2, r3)
            r4.G(r14)
            goto L_0x0449
        L_0x02d5:
            boolean r0 = r15 instanceof defpackage.lh1
            if (r0 == 0) goto L_0x0319
            k77[] r0 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet r8 = new one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet
            lh1 r15 = (defpackage.lh1) r15
            le1 r15 = r15.C
            r8.<init>(r6, r15, r4)
            r8.setTargetController(r14)
            r15 = r14
        L_0x02e8:
            rr3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x02f3
            rr3 r15 = r15.getParentController()
            goto L_0x02e8
        L_0x02f3:
            boolean r0 = r15 instanceof ygc
            if (r0 == 0) goto L_0x02fa
            ygc r15 = (ygc) r15
            goto L_0x02fb
        L_0x02fa:
            r15 = r4
        L_0x02fb:
            if (r15 == 0) goto L_0x0301
            sgc r4 = r15.S()
        L_0x0301:
            r8.y0(r14)
            if (r4 == 0) goto L_0x0449
            vgc r14 = new vgc
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            rf0.k(r5, r14, r2, r3)
            r4.G(r14)
            goto L_0x0449
        L_0x0319:
            boolean r0 = r15 instanceof defpackage.nh1
            if (r0 == 0) goto L_0x0359
            k77[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet r8 = new one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet
            r8.<init>(r6, r4)
            r8.setTargetController(r14)
            r15 = r14
        L_0x0328:
            rr3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x0333
            rr3 r15 = r15.getParentController()
            goto L_0x0328
        L_0x0333:
            boolean r0 = r15 instanceof ygc
            if (r0 == 0) goto L_0x033a
            ygc r15 = (ygc) r15
            goto L_0x033b
        L_0x033a:
            r15 = r4
        L_0x033b:
            if (r15 == 0) goto L_0x0341
            sgc r4 = r15.S()
        L_0x0341:
            r8.y0(r14)
            if (r4 == 0) goto L_0x0449
            vgc r14 = new vgc
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            rf0.k(r5, r14, r2, r3)
            r4.G(r14)
            goto L_0x0449
        L_0x0359:
            boolean r0 = r15 instanceof defpackage.ph1
            if (r0 == 0) goto L_0x039b
            k77[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r7 = new one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet
            y4c r15 = defpackage.y4c.b
            r7.<init>(r15, r4, r1, r4)
            r7.setTargetController(r14)
            r15 = r14
        L_0x036a:
            rr3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x0375
            rr3 r15 = r15.getParentController()
            goto L_0x036a
        L_0x0375:
            boolean r0 = r15 instanceof ygc
            if (r0 == 0) goto L_0x037c
            ygc r15 = (ygc) r15
            goto L_0x037d
        L_0x037c:
            r15 = r4
        L_0x037d:
            if (r15 == 0) goto L_0x0383
            sgc r4 = r15.S()
        L_0x0383:
            r7.y0(r14)
            if (r4 == 0) goto L_0x0449
            vgc r14 = new vgc
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            rf0.k(r5, r14, r2, r3)
            r4.G(r14)
            goto L_0x0449
        L_0x039b:
            boolean r0 = r15 instanceof defpackage.hh1
            if (r0 == 0) goto L_0x03dd
            k77[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r7 = new one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet
            y4c r15 = defpackage.y4c.a
            r7.<init>(r15, r4, r1, r4)
            r7.setTargetController(r14)
            r15 = r14
        L_0x03ac:
            rr3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x03b7
            rr3 r15 = r15.getParentController()
            goto L_0x03ac
        L_0x03b7:
            boolean r0 = r15 instanceof ygc
            if (r0 == 0) goto L_0x03be
            ygc r15 = (ygc) r15
            goto L_0x03bf
        L_0x03be:
            r15 = r4
        L_0x03bf:
            if (r15 == 0) goto L_0x03c5
            sgc r4 = r15.S()
        L_0x03c5:
            r7.y0(r14)
            if (r4 == 0) goto L_0x0449
            vgc r14 = new vgc
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            rf0.k(r5, r14, r2, r3)
            r4.G(r14)
            goto L_0x0449
        L_0x03dd:
            boolean r0 = r15 instanceof defpackage.kh1
            if (r0 == 0) goto L_0x041a
            k77[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r8 = new one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet
            gc1 r15 = defpackage.gc1.a
            r8.<init>(r6, r15, r4)
            r8.setTargetController(r14)
        L_0x03ed:
            rr3 r15 = r14.getParentController()
            if (r15 == 0) goto L_0x03f8
            rr3 r14 = r14.getParentController()
            goto L_0x03ed
        L_0x03f8:
            boolean r15 = r14 instanceof ygc
            if (r15 == 0) goto L_0x03ff
            ygc r14 = (ygc) r14
            goto L_0x0400
        L_0x03ff:
            r14 = r4
        L_0x0400:
            if (r14 == 0) goto L_0x0406
            sgc r4 = r14.S()
        L_0x0406:
            if (r4 == 0) goto L_0x0449
            vgc r14 = new vgc
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            rf0.k(r5, r14, r2, r3)
            r4.G(r14)
            goto L_0x0449
        L_0x041a:
            boolean r0 = r15 instanceof defpackage.qh1
            if (r0 == 0) goto L_0x0438
            oc1 r0 = defpackage.oc1.c
            android.content.Context r14 = r14.getContext()
            int r1 = defpackage.r1a.E1
            java.lang.String r14 = r14.getString(r1)
            qh1 r15 = (defpackage.qh1) r15
            java.lang.String r15 = r15.C
            java.lang.Class<one.me.calls.ui.ui.call.CallScreen> r1 = one.me.calls.ui.ui.call.CallScreen.class
            java.lang.String r1 = r1.getName()
            r0.Z1(r15, r14, r1)
            goto L_0x0449
        L_0x0438:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x043e:
            boolean r14 = r15 instanceof defpackage.a34
            if (r14 == 0) goto L_0x0449
            oc1 r14 = defpackage.oc1.c
            a34 r15 = (defpackage.a34) r15
            r14.R1(r15)
        L_0x0449:
            jue r14 = defpackage.jue.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg1.o(java.lang.Object):java.lang.Object");
    }
}
