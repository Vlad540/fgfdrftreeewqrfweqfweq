package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: ky0  reason: default package */
public final class ky0 implements MediaMuteManagerListener {
    public final /* synthetic */ py0 a;
    public final /* synthetic */ t97 b;
    public final /* synthetic */ t97 c;
    public final /* synthetic */ t97 d;
    public final /* synthetic */ t97 e;

    public ky0(py0 py0, t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = py0;
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
    }

    public final void onMuteChanged(oc9 oc9) {
        boolean z;
        Object value;
        Object value2;
        boolean z2;
        Object value3;
        oc9 oc92 = oc9;
        k88 k88 = (k88) oc92.a.get(j88.b);
        k88 k882 = k88.a;
        if (k88 != null) {
            py0 py0 = this.a;
            t97 t97 = this.b;
            py0.getClass();
            boolean z3 = k88 == k882;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, "CallAdminSettingsController", "Video was disabled by admin to " + k88, (Throwable) null);
            }
            if (!z3) {
                CameraManager a2 = ((d11) t97.getValue()).a();
                z2 = a2 != null && a2.isCameraEnabled();
                CameraManager a3 = ((d11) t97.getValue()).a();
                if (a3 != null) {
                    a3.setCameraEnabled(false);
                }
            } else {
                z2 = false;
            }
            grd grd = py0.E0;
            do {
                value3 = grd.getValue();
            } while (!grd.b(value3, ea.a((ea) value3, false, py0.h(k88), false, false, false, false, 125)));
            if (!py0.h(k88)) {
                py0.C0.g(new ya(true, false));
            } else if (z2) {
                py0.C0.g(ta.a);
            }
        }
        k88 k883 = (k88) oc92.a.get(j88.a);
        if (k883 != null) {
            py0 py02 = this.a;
            t97 t972 = this.c;
            py02.getClass();
            boolean z4 = k883 == k882;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, "CallAdminSettingsController", "Microphone was changed by admin to " + k883, (Throwable) null);
            }
            if (!z4) {
                ((rz0) ((qz0) t972.getValue())).d();
                MicrophoneManager c2 = ((rz0) ((qz0) t972.getValue())).c();
                if (c2 != null) {
                    c2.setMicEnabled(false);
                }
            }
            grd grd2 = py02.E0;
            do {
                value2 = grd2.getValue();
            } while (!grd2.b(value2, ea.a((ea) value2, false, false, py0.h(k883), false, false, false, 123)));
            Conversation a4 = py02.d().a();
            if (!(a4 != null ? a4.isMeCreatorOrAdmin() : false)) {
                if (!py0.h(k883)) {
                    py02.C0.g(new ab(true, false));
                } else if (!z4) {
                    py02.C0.g(ua.a);
                }
            }
        }
        k88 k884 = (k88) oc92.a.get(j88.c);
        if (k884 != null) {
            py0 py03 = this.a;
            t97 t973 = this.d;
            py03.getClass();
            boolean z5 = k884 == k882;
            fn6 fn63 = udd.e;
            if (fn63 != null && fn63.c()) {
                fn63.d(tn7.X, "CallAdminSettingsController", "Screen sharing was disabled by admin to " + k884, (Throwable) null);
            }
            if (!z5) {
                z = ((nnc) t973.getValue()).c();
                ((nnc) t973.getValue()).b(false);
            } else {
                z = false;
            }
            grd grd3 = py03.E0;
            do {
                value = grd3.getValue();
            } while (!grd3.b(value, ea.a((ea) value, false, false, false, py0.h(k884), false, false, 119)));
            if (!py0.h(k884) && z) {
                py03.C0.g(new eb(true, false));
            } else if (z) {
                py03.C0.g(xa.a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r5 = (r5 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r5, (w2d) null, 1, (java.lang.Object) null)).b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMuteStateInitialized(oc9 r18) {
        /*
            r17 = this;
            r0 = r17
            py0 r1 = r0.a
            grd r2 = r1.E0
        L_0x0006:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            ea r4 = (defpackage.ea) r4
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r5 = r1.e()
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0026
            l88 r5 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r5, r6, r7, r6)
            if (r5 == 0) goto L_0x0026
            k88 r5 = r5.b
            if (r5 == 0) goto L_0x0026
            boolean r5 = defpackage.py0.h(r5)
            r11 = r5
            goto L_0x0027
        L_0x0026:
            r11 = r8
        L_0x0027:
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r5 = r1.e()
            if (r5 == 0) goto L_0x003d
            l88 r5 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r5, r6, r7, r6)
            if (r5 == 0) goto L_0x003d
            k88 r5 = r5.a
            if (r5 == 0) goto L_0x003d
            boolean r5 = defpackage.py0.h(r5)
            r12 = r5
            goto L_0x003e
        L_0x003d:
            r12 = r8
        L_0x003e:
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r5 = r1.e()
            if (r5 == 0) goto L_0x0054
            l88 r5 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r5, r6, r7, r6)
            if (r5 == 0) goto L_0x0054
            k88 r5 = r5.c
            if (r5 == 0) goto L_0x0054
            boolean r5 = defpackage.py0.h(r5)
            r13 = r5
            goto L_0x0055
        L_0x0054:
            r13 = r8
        L_0x0055:
            ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager r5 = r1.g()
            if (r5 == 0) goto L_0x0061
            e51 r6 = e51.b
            ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles r6 = r5.getFeatureRoles(r6)
        L_0x0061:
            boolean r14 = r6 instanceof ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles.EnabledForAll
            t97 r5 = r0.e
            java.lang.Object r6 = r5.getValue()
            bt3 r6 = (defpackage.bt3) r6
            ru.ok.android.externcalls.sdk.Conversation r6 = r6.a()
            if (r6 == 0) goto L_0x0077
            boolean r6 = r6.isMeCreatorOrAdmin()
            r10 = r6
            goto L_0x0078
        L_0x0077:
            r10 = r8
        L_0x0078:
            java.lang.Object r5 = r5.getValue()
            bt3 r5 = (defpackage.bt3) r5
            ru.ok.android.externcalls.sdk.Conversation r5 = r5.a()
            if (r5 == 0) goto L_0x0088
            boolean r8 = r5.isWaitingRoomEnabled()
        L_0x0088:
            r16 = r8
            r4.getClass()
            ea r4 = new ea
            r15 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = r2.b(r3, r4)
            if (r3 == 0) goto L_0x0006
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky0.onMuteStateInitialized(oc9):void");
    }
}
