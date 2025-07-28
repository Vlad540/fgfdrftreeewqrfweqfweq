package defpackage;

/* renamed from: yx0  reason: default package */
public final /* synthetic */ class yx0 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yx0(py0 py0, boolean z, int i) {
        this.a = i;
        this.b = py0;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f8, code lost:
        r7 = (r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, (w2d) null, 1, (java.lang.Object) null)).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            py0 r0 = r6.b
            boolean r6 = r6.c
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            fn6 r1 = defpackage.udd.e
            r2 = 0
            if (r1 != 0) goto L_0x0011
            goto L_0x0038
        L_0x0011:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0038
            tn7 r3 = tn7.X
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Screen sharing in call wasn't changed on "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = " due to: "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = r4.toString()
            java.lang.String r7 = "CallAdminSettingsController"
            r1.d(r3, r7, r6, r2)
        L_0x0038:
            hcd r6 = r0.C0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r7 = r0.e()
            r0 = 0
            if (r7 == 0) goto L_0x0051
            r1 = 1
            l88 r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, r2, r1, r2)
            if (r7 == 0) goto L_0x0051
            k88 r7 = r7.c
            if (r7 == 0) goto L_0x0051
            boolean r7 = defpackage.py0.h(r7)
            goto L_0x0052
        L_0x0051:
            r7 = r0
        L_0x0052:
            eb r1 = new eb
            r1.<init>(r0, r7)
            r6.g(r1)
            jue r6 = defpackage.jue.a
            return r6
        L_0x005d:
            py0 r0 = r6.b
            boolean r6 = r6.c
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            fn6 r1 = defpackage.udd.e
            r2 = 0
            if (r1 != 0) goto L_0x0069
            goto L_0x0090
        L_0x0069:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0090
            tn7 r3 = tn7.X
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cameras in call wasn't changed on "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = " due to: "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = r4.toString()
            java.lang.String r7 = "CallAdminSettingsController"
            r1.d(r3, r7, r6, r2)
        L_0x0090:
            hcd r6 = r0.C0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r7 = r0.e()
            r0 = 0
            if (r7 == 0) goto L_0x00a9
            r1 = 1
            l88 r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, r2, r1, r2)
            if (r7 == 0) goto L_0x00a9
            k88 r7 = r7.b
            if (r7 == 0) goto L_0x00a9
            boolean r7 = defpackage.py0.h(r7)
            goto L_0x00aa
        L_0x00a9:
            r7 = r0
        L_0x00aa:
            ya r1 = new ya
            r1.<init>(r0, r7)
            r6.g(r1)
            jue r6 = defpackage.jue.a
            return r6
        L_0x00b5:
            py0 r0 = r6.b
            boolean r6 = r6.c
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            fn6 r1 = defpackage.udd.e
            r2 = 0
            if (r1 != 0) goto L_0x00c1
            goto L_0x00e8
        L_0x00c1:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x00e8
            tn7 r3 = tn7.X
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Microphone in call wasn't changed on "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = " due to: "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = r4.toString()
            java.lang.String r7 = "CallAdminSettingsController"
            r1.d(r3, r7, r6, r2)
        L_0x00e8:
            hcd r6 = r0.C0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r7 = r0.e()
            r0 = 0
            if (r7 == 0) goto L_0x0101
            r1 = 1
            l88 r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, r2, r1, r2)
            if (r7 == 0) goto L_0x0101
            k88 r7 = r7.a
            if (r7 == 0) goto L_0x0101
            boolean r7 = defpackage.py0.h(r7)
            goto L_0x0102
        L_0x0101:
            r7 = r0
        L_0x0102:
            ab r1 = new ab
            r1.<init>(r0, r7)
            r6.g(r1)
            jue r6 = defpackage.jue.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx0.invoke(java.lang.Object):java.lang.Object");
    }
}
