package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: y3c  reason: default package */
public final class y3c extends taf implements q4c {
    public static final /* synthetic */ k77[] N0;
    public final grd A0;
    public final t0c B0;
    public final grd C0;
    public final t0c D0;
    public final t0c E0;
    public final pj5 F0;
    public final l05 G0;
    public final l05 H0;
    public final r7e I0;
    public volatile AudioFocusRequest J0;
    public volatile qod K0;
    public final e3 L0;
    public final e3 M0;
    public long X;
    public long Y;
    public final t97 Z;
    public final z2c b;
    public final h3c c;
    public final qz0 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<y3c> cls = y3c.class;
        N0 = new k77[]{new hc9(cls, "longClickJob", "getLongClickJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "startRecordJob", "getStartRecordJob()Lkotlinx/coroutines/Job;")};
    }

    public y3c(z2c z2c, h3c h3c, t97 t97, r7e r7e, r7e r7e2) {
        xuf xuf = xuf.a;
        r7e d = xuf.getAccessor().d(pae.class);
        r7e d2 = xuf.getAccessor().d(Context.class);
        this.b = z2c;
        this.c = h3c;
        this.o = (qz0) xuf.getAccessor().c(qz0.class);
        this.Z = d;
        this.w0 = d2;
        this.x0 = t97;
        this.y0 = r7e;
        this.z0 = r7e2;
        grd a = hrd.a((Object) null);
        this.A0 = a;
        t0c t0c = new t0c(a);
        this.B0 = t0c;
        grd a2 = hrd.a((Object) null);
        this.C0 = a2;
        this.D0 = new t0c(a2);
        o60 o60 = (o60) r7e2.getValue();
        this.E0 = o60 != null ? o60.c : null;
        this.F0 = ((e40) ((bh7) r7e.getValue())).g;
        this.G0 = new l05(0);
        this.H0 = new l05(0);
        this.I0 = new r7e(new u5b(7, this));
        this.L0 = hwf.t();
        this.M0 = hwf.t();
        ez3.N(ez3.J(new ck5(new ik5(t0c, 2), new i3c(this, (Continuation) null), 5), ((pae) d.getValue()).a()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.y3c r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.q3c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            q3c r0 = (defpackage.q3c) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            q3c r0 = new q3c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            y3c r5 = r0.o
            wx3.H(r6)
            goto L_0x0053
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            wx3.H(r6)
            t97 r6 = r5.Z
            java.lang.Object r6 = r6.getValue()
            pae r6 = (defpackage.pae) r6
            n3a r6 = (n3a) r6
            zr7 r6 = r6.c()
            r3c r2 = new r3c
            r2.<init>(r5, r4)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r6 = xs7.U(r6, r2, r0)
            if (r6 != r1) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            r5.B()
            o3c r6 = new o3c
            r0 = 3
            r1 = 0
            r6.<init>(r0, r1, r1)
            grd r5 = r5.A0
            r5.m(r4, r6)
            jue r1 = jue.a
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3c.q(y3c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.y3c r6, defpackage.z2c r7, long r8, byte[] r10, kotlin.coroutines.Continuation r11) {
        /*
            r6.getClass()
            java.lang.String r0 = "Media for "
            boolean r1 = r11 instanceof defpackage.t3c
            if (r1 == 0) goto L_0x0018
            r1 = r11
            t3c r1 = (defpackage.t3c) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.w0 = r2
            goto L_0x001d
        L_0x0018:
            t3c r1 = new t3c
            r1.<init>(r6, r11)
        L_0x001d:
            java.lang.Object r11 = r1.Y
            pu3 r2 = pu3.a
            int r3 = r1.w0
            jue r4 = jue.a
            r5 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r5) goto L_0x0035
            z2c r7 = r1.X
            y3c r6 = r1.o
            wx3.H(r11)     // Catch:{ all -> 0x0032 }
            goto L_0x0067
        L_0x0032:
            r7 = move-exception
            goto L_0x00ab
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            wx3.H(r11)
            int r11 = r7.ordinal()     // Catch:{ all -> 0x0032 }
            if (r11 == 0) goto L_0x0054
            if (r11 != r5) goto L_0x004e
            r4c r11 = new r4c     // Catch:{ all -> 0x0032 }
            r11.<init>(r8, r10)     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x004e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0032 }
            r7.<init>()     // Catch:{ all -> 0x0032 }
            throw r7     // Catch:{ all -> 0x0032 }
        L_0x0054:
            s4c r11 = defpackage.s4c.a     // Catch:{ all -> 0x0032 }
        L_0x0056:
            u4c r8 = r6.v()     // Catch:{ all -> 0x0032 }
            r1.o = r6     // Catch:{ all -> 0x0032 }
            r1.X = r7     // Catch:{ all -> 0x0032 }
            r1.w0 = r5     // Catch:{ all -> 0x0032 }
            java.lang.Object r11 = r8.g(r11, r1)     // Catch:{ all -> 0x0032 }
            if (r11 != r2) goto L_0x0067
            goto L_0x00c9
        L_0x0067:
            o2 r11 = (defpackage.o2) r11     // Catch:{ all -> 0x0032 }
            if (r11 != 0) goto L_0x009b
            java.lang.Class r8 = r6.getClass()     // Catch:{ all -> 0x0032 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0032 }
            fn6 r9 = udd.e     // Catch:{ all -> 0x0032 }
            if (r9 != 0) goto L_0x0078
            goto L_0x0099
        L_0x0078:
            boolean r10 = r9.c()     // Catch:{ all -> 0x0032 }
            if (r10 == 0) goto L_0x0099
            tn7 r10 = defpackage.tn7.w0     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r7.name()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r11.<init>(r0)     // Catch:{ all -> 0x0032 }
            r11.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = " wasn't prepared, we cannot send message"
            r11.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x0032 }
            r11 = 0
            r9.d(r10, r8, r7, r11)     // Catch:{ all -> 0x0032 }
        L_0x0099:
            r2 = r4
            goto L_0x00c9
        L_0x009b:
            h3c r7 = r6.c     // Catch:{ all -> 0x0032 }
            r7.getClass()     // Catch:{ all -> 0x0032 }
            b3c r8 = new b3c     // Catch:{ all -> 0x0032 }
            r8.<init>(r11)     // Catch:{ all -> 0x0032 }
            l05 r7 = r7.b     // Catch:{ all -> 0x0032 }
            defpackage.taf.o(r7, r8)     // Catch:{ all -> 0x0032 }
            goto L_0x0099
        L_0x00ab:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = r7.getLocalizedMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "We couldn't send record due to "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            udd.s(r6, r8, r7)
            goto L_0x0099
        L_0x00c9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3c.r(y3c, z2c, long, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f6 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012a A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0148 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015f A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0165 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.y3c r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            java.lang.String r0 = "Recoding of "
            boolean r1 = r15 instanceof defpackage.v3c
            if (r1 == 0) goto L_0x0015
            r1 = r15
            v3c r1 = (defpackage.v3c) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.Z = r2
            goto L_0x001a
        L_0x0015:
            v3c r1 = new v3c
            r1.<init>(r12, r15)
        L_0x001a:
            java.lang.Object r15 = r1.X
            pu3 r2 = pu3.a
            int r3 = r1.Z
            r4 = 1
            r5 = 0
            java.lang.Class<y3c> r6 = defpackage.y3c.class
            r7 = 0
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            y3c r12 = r1.o
            wx3.H(r15)     // Catch:{ all -> 0x0030 }
            goto L_0x00e7
        L_0x0030:
            r13 = move-exception
            goto L_0x0168
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003b:
            wx3.H(r15)
            k77[] r15 = N0
            r15 = r15[r4]
            e3 r3 = r12.M0
            java.lang.Object r15 = r3.T0(r12, r15)
            g37 r15 = (g37) r15
            if (r15 == 0) goto L_0x0056
            boolean r15 = r15.isCancelled()
            if (r15 != r4) goto L_0x0056
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x018f
        L_0x0056:
            java.lang.String r15 = r6.getName()
            fn6 r3 = udd.e
            if (r3 != 0) goto L_0x005f
            goto L_0x0078
        L_0x005f:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x0078
            tn7 r8 = defpackage.tn7.X
            z2c r9 = r12.b
            java.lang.String r9 = r9.name()
            java.lang.String r10 = "Start recording of "
            java.lang.String r11 = " "
            java.lang.String r9 = defpackage.wn6.i(r10, r9, r11)
            r3.d(r8, r15, r9, r5)
        L_0x0078:
            bh7 r15 = r12.u()
            e40 r15 = (defpackage.e40) r15
            va9 r3 = r15.b()
            nb9 r3 = (defpackage.nb9) r3
            boolean r3 = r3.x
            if (r3 == 0) goto L_0x0091
            va9 r15 = r15.b()
            nb9 r15 = (defpackage.nb9) r15
            r15.t()
        L_0x0091:
            android.media.AudioFocusRequest$Builder r15 = new android.media.AudioFocusRequest$Builder
            r15.<init>(r4)
            android.media.AudioAttributes$Builder r3 = new android.media.AudioAttributes$Builder
            r3.<init>()
            android.media.AudioAttributes$Builder r3 = r3.setUsage(r4)
            r8 = 2
            android.media.AudioAttributes$Builder r3 = r3.setContentType(r8)
            android.media.AudioAttributes r3 = r3.build()
            android.media.AudioFocusRequest$Builder r15 = r15.setAudioAttributes(r3)
            android.media.AudioFocusRequest r15 = r15.build()
            r7e r3 = r12.I0
            java.lang.Object r3 = r3.getValue()
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            int r3 = r3.requestAudioFocus(r15)
            if (r3 != r4) goto L_0x00c0
            r12.J0 = r15
        L_0x00c0:
            u4c r15 = r12.v()
            boolean r15 = r15.b()
            if (r15 == 0) goto L_0x00cd
            r12.B()
        L_0x00cd:
            grd r15 = r12.A0     // Catch:{ all -> 0x0030 }
            n3c r3 = new n3c     // Catch:{ all -> 0x0030 }
            r3.<init>(r7, r7)     // Catch:{ all -> 0x0030 }
            r15.m(r5, r3)     // Catch:{ all -> 0x0030 }
            u4c r15 = r12.v()     // Catch:{ all -> 0x0030 }
            r1.o = r12     // Catch:{ all -> 0x0030 }
            r1.Z = r4     // Catch:{ all -> 0x0030 }
            java.lang.Object r13 = r15.f(r13, r1)     // Catch:{ all -> 0x0030 }
            if (r13 != r2) goto L_0x00e7
            goto L_0x018f
        L_0x00e7:
            u4c r13 = r12.v()     // Catch:{ all -> 0x0030 }
            r13.j(r12)     // Catch:{ all -> 0x0030 }
            java.lang.String r13 = r6.getName()     // Catch:{ all -> 0x0030 }
            fn6 r14 = udd.e     // Catch:{ all -> 0x0030 }
            if (r14 != 0) goto L_0x00f7
            goto L_0x0119
        L_0x00f7:
            boolean r15 = r14.c()     // Catch:{ all -> 0x0030 }
            if (r15 == 0) goto L_0x0119
            tn7 r15 = defpackage.tn7.X     // Catch:{ all -> 0x0030 }
            z2c r1 = r12.b     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r2.<init>(r0)     // Catch:{ all -> 0x0030 }
            r2.append(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = " started successfully "
            r2.append(r0)     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0030 }
            r14.d(r15, r13, r0, r5)     // Catch:{ all -> 0x0030 }
        L_0x0119:
            grd r13 = r12.C0     // Catch:{ all -> 0x0030 }
            java.lang.Long r14 = new java.lang.Long     // Catch:{ all -> 0x0030 }
            r0 = 0
            r14.<init>(r0)     // Catch:{ all -> 0x0030 }
            r13.m(r5, r14)     // Catch:{ all -> 0x0030 }
            qod r13 = r12.K0     // Catch:{ all -> 0x0030 }
            if (r13 == 0) goto L_0x012a
            goto L_0x013e
        L_0x012a:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            r12.Y = r13     // Catch:{ all -> 0x0030 }
            kotlinx.coroutines.internal.ContextScope r13 = r12.a     // Catch:{ all -> 0x0030 }
            w3c r14 = new w3c     // Catch:{ all -> 0x0030 }
            r14.<init>(r12, r5)     // Catch:{ all -> 0x0030 }
            r15 = 3
            qod r13 = xs7.E(r13, r5, r5, r14, r15)     // Catch:{ all -> 0x0030 }
            r12.K0 = r13     // Catch:{ all -> 0x0030 }
        L_0x013e:
            qz0 r13 = r12.o     // Catch:{ all -> 0x0030 }
            rz0 r13 = (rz0) r13     // Catch:{ all -> 0x0030 }
            ru.ok.android.externcalls.sdk.audio.MicrophoneManager r13 = r13.c()     // Catch:{ all -> 0x0030 }
            if (r13 == 0) goto L_0x014b
            r13.setMicEnabled(r7)     // Catch:{ all -> 0x0030 }
        L_0x014b:
            k77[] r13 = N0     // Catch:{ all -> 0x0030 }
            r13 = r13[r4]     // Catch:{ all -> 0x0030 }
            e3 r14 = r12.M0     // Catch:{ all -> 0x0030 }
            java.lang.Object r13 = r14.T0(r12, r13)     // Catch:{ all -> 0x0030 }
            g37 r13 = (g37) r13     // Catch:{ all -> 0x0030 }
            if (r13 == 0) goto L_0x0165
            boolean r13 = r13.isCancelled()     // Catch:{ all -> 0x0030 }
            if (r13 != r4) goto L_0x0165
            r12.A(r7)     // Catch:{ all -> 0x0030 }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0030 }
            goto L_0x018f
        L_0x0165:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0030 }
            goto L_0x018f
        L_0x0168:
            java.lang.Class r14 = r12.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = r13.getLocalizedMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recoding was failed due to '"
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = "'"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            udd.s(r14, r15, r13)
            r12.B()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L_0x018f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3c.s(y3c, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A(boolean z) {
        byte[] bArr;
        if ((this.B0.a.getValue() instanceof n3c) || (this.B0.a.getValue() instanceof m3c)) {
            Long l = (Long) this.C0.getValue();
            long longValue = l != null ? l.longValue() : 0;
            AudioFocusRequest audioFocusRequest = this.J0;
            if (audioFocusRequest != null) {
                ((AudioManager) this.I0.getValue()).abandonAudioFocusRequest(audioFocusRequest);
            }
            if (!z) {
                this.A0.m((Object) null, new o3c(false, false));
                B();
            } else if (longValue < 1000) {
                h3c h3c = this.c;
                z2c z2c = this.b;
                hge hge = new hge(z9a.g);
                h3c.getClass();
                taf.o(h3c.b, new f3c(z2c, hge));
                this.A0.m((Object) null, new o3c(w(), false));
                B();
            } else {
                t0c t0c = this.E0;
                if (t0c == null || (bArr = (byte[]) t0c.a.getValue()) == null) {
                    bArr = new byte[0];
                }
                byte[] bArr2 = bArr;
                B();
                xs7.E(this.a, sk9.a, (ru3) null, new x3c(this, longValue, bArr2, (Continuation) null), 2);
                this.A0.m((Object) null, new o3c(2, w(), false));
            }
        }
    }

    public final void B() {
        qod qod = this.K0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.K0 = null;
        this.X = 0;
        h3c h3c = this.c;
        z2c z2c = this.b;
        h3c.getClass();
        taf.o(h3c.b, new c3c(z2c, false));
        v().d();
        v().j((y3c) null);
        o60 o60 = (o60) this.z0.getValue();
        if (o60 != null) {
            o60.a.clear();
            o60.b.setValue((Object) null);
        }
        ((e40) u()).e = null;
        this.C0.setValue((Object) null);
    }

    public final void p() {
        e40 e40 = (e40) u();
        n1g.c(e40.b, (CancellationException) null);
        ((nb9) e40.b()).s(e40.d);
        B();
    }

    public final void t() {
        grd grd = this.A0;
        p3c p3c = (p3c) grd.getValue();
        if (p3c instanceof n3c) {
            try {
                v().h();
                z();
                grd.m((Object) null, new m3c(true));
            } catch (RuntimeException unused) {
                B();
                grd.m((Object) null, new o3c(3, false, false));
                return;
            }
        }
        if (p3c instanceof m3c) {
            grd.m((Object) null, new m3c(true));
        }
    }

    public final bh7 u() {
        return (bh7) this.y0.getValue();
    }

    public final u4c v() {
        return (u4c) this.x0.getValue();
    }

    public final boolean w() {
        p3c p3c = (p3c) this.A0.getValue();
        return p3c instanceof n3c ? ((n3c) p3c).b : p3c instanceof m3c;
    }

    public final void x() {
        grd grd = this.A0;
        if (((p3c) grd.getValue()) instanceof n3c) {
            try {
                v().h();
                z();
                grd.m((Object) null, new m3c(false));
            } catch (RuntimeException unused) {
                B();
                grd.m((Object) null, new o3c(3, false, false));
            }
        }
    }

    public final void y() {
        grd grd = this.A0;
        if (((p3c) grd.getValue()) instanceof m3c) {
            try {
                v().e();
                if (this.K0 == null) {
                    this.Y = System.currentTimeMillis();
                    this.K0 = xs7.E(this.a, (hu3) null, (ru3) null, new w3c(this, (Continuation) null), 3);
                }
                e40 e40 = (e40) u();
                if (((nb9) e40.b()).x) {
                    ((nb9) e40.b()).t();
                }
                grd.m((Object) null, new n3c(true, true));
                grd grd2 = ((e40) u()).f;
                ((ah7) grd2.getValue()).getClass();
                grd2.m((Object) null, new ah7((Float) null, false));
            } catch (RuntimeException unused) {
                B();
                grd.m((Object) null, new o3c(3, false, false));
            }
        }
    }

    public final void z() {
        qod qod = this.K0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.K0 = null;
        Long l = (Long) this.C0.getValue();
        this.X = l != null ? l.longValue() : 0;
    }
}
