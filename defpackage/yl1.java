package defpackage;

import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: yl1  reason: default package */
public final class yl1 {
    public static final /* synthetic */ k77[] k;
    public final s16 a;
    public final po1 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final e3 h = hwf.t();
    public final hcd i;
    public final s0c j;

    static {
        hc9 hc9 = new hc9(yl1.class, "actionHandlerJob", "getActionHandlerJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        k = new k77[]{hc9};
    }

    public yl1(s16 s16, po1 po1, t97 t97, t97 t972, t97 t973) {
        t97 t974 = mqc.l;
        t97 t975 = mqc.b;
        this.a = s16;
        this.b = po1;
        this.c = t974;
        this.d = t972;
        this.e = t97;
        this.f = t975;
        this.g = t973;
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 4);
        this.i = b2;
        this.j = new s0c(b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.g21 a(defpackage.le1 r22, android.graphics.Point r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            le1 r2 = defpackage.le1.c
            boolean r2 = r1.equals(r2)
            r3 = 0
            if (r2 != 0) goto L_0x02c3
            po1 r2 = r0.b
            grd r4 = r2.b()
            java.lang.Object r4 = r4.getValue()
            zw3 r4 = (defpackage.zw3) r4
            boolean r4 = r4.h
            if (r4 == 0) goto L_0x02c3
            grd r4 = r2.b()
            java.lang.Object r4 = r4.getValue()
            zw3 r4 = (defpackage.zw3) r4
            boolean r4 = r4.f
            if (r4 != 0) goto L_0x002d
            goto L_0x02c3
        L_0x002d:
            t0c r4 = r2.o
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            lm1 r4 = (defpackage.lm1) r4
            le1 r4 = r4.a
            boolean r4 = defpackage.hhd.f(r4, r1)
            qja r5 = r2.d()
            ne1 r5 = r5.a
            le1 r5 = r5.getId()
            boolean r5 = defpackage.hhd.f(r5, r1)
            if (r5 == 0) goto L_0x0052
            qja r1 = r2.d()
            goto L_0x0068
        L_0x0052:
            zqd r5 = r2.e()
            t0c r5 = (defpackage.t0c) r5
            zqd r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            bka r5 = (defpackage.bka) r5
            java.util.Map r5 = r5.c
            java.lang.Object r1 = r5.get(r1)
            qja r1 = (defpackage.qja) r1
        L_0x0068:
            t97 r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            jb5 r0 = (jb5) r0
            kb5 r0 = (kb5) r0
            boolean r0 = r0.p()
            qja r2 = r2.d()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            lg7 r6 = defpackage.hwf.c()
            ne1 r2 = r2.a
            le1 r7 = r2.getId()
            if (r1 == 0) goto L_0x0092
            ne1 r8 = r1.a
            le1 r8 = r8.getId()
            goto L_0x0093
        L_0x0092:
            r8 = r3
        L_0x0093:
            boolean r7 = defpackage.hhd.f(r7, r8)
            r8 = r7 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "message"
            r5.put(r9, r8)
            if (r7 == 0) goto L_0x00a5
            goto L_0x00c0
        L_0x00a5:
            pq3 r7 = new pq3
            int r11 = defpackage.o1a.E
            int r8 = defpackage.r1a.L1
            hge r12 = new hge
            r12.<init>(r8)
            int r8 = defpackage.n1a.a0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r6.add(r7)
        L_0x00c0:
            le1 r7 = r2.getId()
            if (r1 == 0) goto L_0x00cd
            ne1 r8 = r1.a
            le1 r8 = r8.getId()
            goto L_0x00ce
        L_0x00cd:
            r8 = r3
        L_0x00ce:
            boolean r7 = defpackage.hhd.f(r7, r8)
            if (r7 == 0) goto L_0x00f5
            boolean r7 = r2.a()
            if (r7 == 0) goto L_0x00f5
            pq3 r7 = new pq3
            int r9 = defpackage.o1a.A
            int r8 = defpackage.r1a.O1
            hge r10 = new hge
            r10.<init>(r8)
            int r8 = defpackage.n1a.j0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 20
            r12 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r6.add(r7)
        L_0x00f5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            java.lang.String r8 = "pin"
            r5.put(r8, r7)
            if (r4 == 0) goto L_0x011c
            pq3 r4 = new pq3
            int r10 = defpackage.o1a.D
            int r7 = defpackage.r1a.N1
            hge r11 = new hge
            r11.<init>(r7)
            int r7 = defpackage.n1a.v0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r14 = 20
            r13 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r6.add(r4)
            goto L_0x013a
        L_0x011c:
            pq3 r4 = new pq3
            int r16 = defpackage.o1a.C
            int r7 = defpackage.r1a.M1
            hge r8 = new hge
            r8.<init>(r7)
            int r7 = defpackage.n1a.d0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            r20 = 20
            r19 = 0
            r15 = r4
            r17 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            r6.add(r4)
        L_0x013a:
            r4 = 0
            if (r0 == 0) goto L_0x02a5
            boolean r0 = r2.m()
            r7 = 1
            if (r0 == 0) goto L_0x015f
            if (r1 == 0) goto L_0x015f
            ne1 r0 = r1.a
            le1 r8 = r0.getId()
            le1 r9 = r2.getId()
            boolean r8 = defpackage.hhd.f(r8, r9)
            if (r8 != 0) goto L_0x015f
            boolean r0 = r0.isScreenCaptureEnabled()
            if (r0 != 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r0 = r4
            goto L_0x0160
        L_0x015f:
            r0 = r7
        L_0x0160:
            r8 = r0 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "screenshare"
            r5.put(r9, r8)
            if (r0 == 0) goto L_0x016e
            goto L_0x0189
        L_0x016e:
            pq3 r0 = new pq3
            int r11 = defpackage.o1a.O0
            int r8 = defpackage.r1a.T0
            hge r12 = new hge
            r12.<init>(r8)
            int r8 = defpackage.n1a.p
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r6.add(r0)
        L_0x0189:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x01aa
            if (r1 == 0) goto L_0x01aa
            ne1 r0 = r1.a
            le1 r8 = r0.getId()
            le1 r9 = r2.getId()
            boolean r8 = defpackage.hhd.f(r8, r9)
            if (r8 != 0) goto L_0x01aa
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x01a8
            goto L_0x01aa
        L_0x01a8:
            r0 = r4
            goto L_0x01ab
        L_0x01aa:
            r0 = r7
        L_0x01ab:
            r8 = r0 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "microphone"
            r5.put(r9, r8)
            if (r0 == 0) goto L_0x01b9
            goto L_0x01d4
        L_0x01b9:
            pq3 r0 = new pq3
            int r11 = defpackage.o1a.N0
            int r8 = defpackage.r1a.S0
            hge r12 = new hge
            r12.<init>(r8)
            int r8 = defpackage.n1a.n
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r6.add(r0)
        L_0x01d4:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x01f5
            if (r1 == 0) goto L_0x01f5
            ne1 r0 = r1.a
            le1 r8 = r0.getId()
            le1 r9 = r2.getId()
            boolean r8 = defpackage.hhd.f(r8, r9)
            if (r8 != 0) goto L_0x01f5
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            r0 = r4
            goto L_0x01f6
        L_0x01f5:
            r0 = r7
        L_0x01f6:
            r8 = r0 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "camera"
            r5.put(r9, r8)
            if (r0 == 0) goto L_0x0204
            goto L_0x021f
        L_0x0204:
            pq3 r0 = new pq3
            int r11 = defpackage.o1a.M0
            int r8 = defpackage.r1a.R0
            hge r12 = new hge
            r12.<init>(r8)
            int r8 = defpackage.n1a.m
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 20
            r14 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r6.add(r0)
        L_0x021f:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x0259
            if (r1 == 0) goto L_0x0259
            ne1 r0 = r1.a
            le1 r8 = r0.getId()
            le1 r9 = r2.getId()
            boolean r8 = defpackage.hhd.f(r8, r9)
            if (r8 == 0) goto L_0x0238
            goto L_0x0259
        L_0x0238:
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0259
            pq3 r0 = new pq3
            int r9 = defpackage.o1a.B
            int r8 = defpackage.r1a.P0
            hge r10 = new hge
            r10.<init>(r8)
            int r8 = defpackage.n1a.r
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 20
            r12 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r6.add(r0)
        L_0x0259:
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x0273
            if (r1 == 0) goto L_0x0273
            ne1 r0 = r1.a
            le1 r0 = r0.getId()
            le1 r2 = r2.getId()
            boolean r0 = defpackage.hhd.f(r0, r2)
            if (r0 == 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r7 = r4
        L_0x0273:
            r0 = r7 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = "kick"
            r5.put(r2, r0)
            if (r7 == 0) goto L_0x0281
            goto L_0x02a5
        L_0x0281:
            int r9 = defpackage.o1a.L0
            int r0 = defpackage.r1a.Q0
            hge r10 = new hge
            r10.<init>(r0)
            int r0 = defpackage.n1a.o
            int r2 = j9a.F
            int r7 = j9a.J
            pq3 r14 = new pq3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r6.add(r14)
        L_0x02a5:
            lg7 r0 = defpackage.hwf.a(r6)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r4)
            if (r1 == 0) goto L_0x02b6
            ne1 r1 = r1.a
            le1 r3 = r1.getId()
        L_0x02b6:
            java.lang.String r1 = "call_participant_id"
            r2.putParcelable(r1, r3)
            g21 r1 = new g21
            r3 = r23
            r1.<init>(r2, r0, r5, r3)
            return r1
        L_0x02c3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl1.a(le1, android.graphics.Point):g21");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        r1 = (defpackage.py0) ((defpackage.vx0) r10.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        r1 = (defpackage.py0) ((defpackage.vx0) r10.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f9, code lost:
        r1 = (defpackage.py0) ((defpackage.vx0) r10.getValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 2
            r4 = 0
            int r5 = defpackage.o1a.L0
            po1 r6 = r0.b
            java.lang.String r7 = "call_participant_id"
            r8 = 1
            if (r1 != r5) goto L_0x0060
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r1 = r2.getParcelable(r7)
            le1 r1 = (defpackage.le1) r1
            if (r1 != 0) goto L_0x001c
            goto L_0x005d
        L_0x001c:
            zqd r2 = r6.e()
            t0c r2 = (defpackage.t0c) r2
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            bka r2 = (defpackage.bka) r2
            java.util.Map r2 = r2.c
            java.lang.Object r2 = r2.get(r1)
            qja r2 = (defpackage.qja) r2
            if (r2 == 0) goto L_0x005d
            vl1 r2 = r2.b
            java.lang.String r2 = r2.getName()
            if (r2 != 0) goto L_0x003d
            goto L_0x005d
        L_0x003d:
            hcd r3 = r0.i
            uh1 r4 = defpackage.wh1.b
            k61 r4 = new k61
            r4.<init>(r0, r1, r2, r8)
            vh1 r0 = new vh1
            int r1 = defpackage.r1a.I0
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            jge r5 = new jge
            java.util.List r2 = defpackage.cs.g0(r2)
            r5.<init>(r1, r2)
            r0.<init>(r5, r4)
            r3.g(r0)
        L_0x005d:
            r4 = r8
            goto L_0x01fb
        L_0x0060:
            int r5 = defpackage.o1a.M0
            k88 r9 = k88.b
            t97 r10 = r0.d
            if (r1 != r5) goto L_0x00a6
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r0 = r2.getParcelable(r7)
            le1 r0 = (defpackage.le1) r0
            if (r0 != 0) goto L_0x0073
            goto L_0x005d
        L_0x0073:
            java.lang.Object r1 = r10.getValue()
            vx0 r1 = (defpackage.vx0) r1
            py0 r1 = (defpackage.py0) r1
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r10 = r1.e()
            if (r10 == 0) goto L_0x005d
            ru.ok.android.externcalls.sdk.id.ParticipantId r12 = defpackage.xja.d(r0)
            ht7 r2 = new ht7
            r2.<init>()
            j88 r4 = j88.b
            r2.put(r4, r9)
            ht7 r11 = r2.b()
            wx0 r14 = new wx0
            r14.<init>(r1, r0, r3)
            dy0 r15 = new dy0
            r15.<init>(r1, r0, r3)
            r16 = 4
            r17 = 0
            r13 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForParticipant$default(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x005d
        L_0x00a6:
            int r3 = defpackage.o1a.N0
            if (r1 != r3) goto L_0x00e9
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r0 = r2.getParcelable(r7)
            le1 r0 = (defpackage.le1) r0
            if (r0 != 0) goto L_0x00b5
            goto L_0x005d
        L_0x00b5:
            java.lang.Object r1 = r10.getValue()
            vx0 r1 = (defpackage.vx0) r1
            py0 r1 = (defpackage.py0) r1
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r10 = r1.e()
            if (r10 == 0) goto L_0x005d
            ru.ok.android.externcalls.sdk.id.ParticipantId r12 = defpackage.xja.d(r0)
            ht7 r2 = new ht7
            r2.<init>()
            j88 r3 = j88.a
            r2.put(r3, r9)
            ht7 r11 = r2.b()
            wx0 r14 = new wx0
            r14.<init>(r1, r0, r8)
            dy0 r15 = new dy0
            r15.<init>(r1, r0, r8)
            r16 = 4
            r17 = 0
            r13 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForParticipant$default(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x005d
        L_0x00e9:
            int r3 = defpackage.o1a.O0
            if (r1 != r3) goto L_0x012d
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r0 = r2.getParcelable(r7)
            le1 r0 = (defpackage.le1) r0
            if (r0 != 0) goto L_0x00f9
            goto L_0x005d
        L_0x00f9:
            java.lang.Object r1 = r10.getValue()
            vx0 r1 = (defpackage.vx0) r1
            py0 r1 = (defpackage.py0) r1
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r10 = r1.e()
            if (r10 == 0) goto L_0x005d
            ru.ok.android.externcalls.sdk.id.ParticipantId r12 = defpackage.xja.d(r0)
            ht7 r2 = new ht7
            r2.<init>()
            j88 r3 = j88.c
            r2.put(r3, r9)
            ht7 r11 = r2.b()
            wx0 r14 = new wx0
            r14.<init>(r1, r0, r4)
            dy0 r15 = new dy0
            r15.<init>(r1, r0, r4)
            r16 = 4
            r17 = 0
            r13 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForParticipant$default(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x005d
        L_0x012d:
            int r3 = defpackage.o1a.C
            le1 r5 = defpackage.le1.c
            if (r1 != r3) goto L_0x015a
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r0 = r2.getParcelable(r7)
            le1 r0 = (defpackage.le1) r0
            if (r0 != 0) goto L_0x013f
            goto L_0x005d
        L_0x013f:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L_0x005d
            grd r1 = r6.b()
            java.lang.Object r1 = r1.getValue()
            zw3 r1 = (defpackage.zw3) r1
            boolean r1 = r1.h
            if (r1 != 0) goto L_0x0155
            goto L_0x005d
        L_0x0155:
            r6.h(r0, r4)
            goto L_0x005d
        L_0x015a:
            int r3 = defpackage.o1a.D
            if (r1 != r3) goto L_0x0185
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r0 = r2.getParcelable(r7)
            le1 r0 = (defpackage.le1) r0
            if (r0 != 0) goto L_0x016a
            goto L_0x005d
        L_0x016a:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L_0x005d
            grd r1 = r6.b()
            java.lang.Object r1 = r1.getValue()
            zw3 r1 = (defpackage.zw3) r1
            boolean r1 = r1.h
            if (r1 != 0) goto L_0x0180
            goto L_0x005d
        L_0x0180:
            r6.h(r0, r4)
            goto L_0x005d
        L_0x0185:
            int r3 = defpackage.o1a.A
            if (r1 != r3) goto L_0x018e
            r18.c()
            goto L_0x005d
        L_0x018e:
            int r3 = defpackage.o1a.E
            if (r1 != r3) goto L_0x01cd
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r1 = r2.getParcelable(r7)
            le1 r1 = (defpackage.le1) r1
            if (r1 != 0) goto L_0x019e
            goto L_0x005d
        L_0x019e:
            s16 r2 = r0.a
            java.lang.Object r2 = r2.invoke()
            ou3 r2 = (defpackage.ou3) r2
            t97 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            pae r3 = (pae) r3
            n3a r3 = (defpackage.n3a) r3
            ju3 r3 = r3.b()
            ru3 r5 = defpackage.ru3.b
            wl1 r6 = new wl1
            r7 = 0
            long r9 = r1.a
            r6.<init>(r0, r9, r7)
            qod r1 = defpackage.xs7.D(r2, r3, r5, r6)
            k77[] r2 = k
            r2 = r2[r4]
            e3 r3 = r0.h
            r3.o1(r0, r2, r1)
            goto L_0x005d
        L_0x01cd:
            int r0 = defpackage.o1a.B
            if (r1 != r0) goto L_0x01fb
            if (r2 == 0) goto L_0x005d
            android.os.Parcelable r0 = r2.getParcelable(r7)
            le1 r0 = (defpackage.le1) r0
            if (r0 != 0) goto L_0x01dd
            goto L_0x005d
        L_0x01dd:
            java.lang.Object r1 = r10.getValue()
            vx0 r1 = (defpackage.vx0) r1
            py0 r1 = (defpackage.py0) r1
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager r2 = r1.f()
            if (r2 == 0) goto L_0x01f2
            ru.ok.android.externcalls.sdk.id.ParticipantId r0 = defpackage.xja.d(r0)
            r2.lowerHandParticipant(r0)
        L_0x01f2:
            hcd r0 = r1.C0
            hb r1 = defpackage.hb.a
            r0.g(r1)
            goto L_0x005d
        L_0x01fb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl1.b(int, android.os.Bundle):boolean");
    }

    public final void c() {
        po1 po1 = this.b;
        iq1 iq1 = (iq1) po1.m.getValue();
        String str = po1.c().c;
        d11 d11 = po1.e;
        int i2 = 1;
        int i3 = d11.b() ? 2 : 1;
        boolean z = po1.c().h;
        iq1.getClass();
        iq1.c(iq1, "CAMERA_CHANGED", str, (String) null, Integer.valueOf(i3), (String) null, (String) null, z, 52);
        if (d11.b()) {
            i2 = 2;
        }
        CameraManager a2 = d11.a();
        if (a2 != null) {
            a2.switchCamera(new qu1(i2));
        }
    }
}
