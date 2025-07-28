package defpackage;

import android.animation.ValueAnimator;
import android.util.Rational;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: r6f  reason: default package */
public final class r6f implements u4c, j5f, j6f {
    public static final wu1 L0 = wu1.b;
    public qb7 A0;
    public final grd B0;
    public final t0c C0;
    public volatile a6c D0;
    public volatile a73 E0;
    public final grd F0;
    public final t0c G0;
    public float H0;
    public ValueAnimator I0;
    public iu1 J0;
    public final AtomicBoolean K0;
    public final t97 X;
    public e4b Y;
    public final r7e Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public b3b w0;
    public k5f x0;
    public y5c y0;
    public h2f z0;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0064, code lost:
        r4 = (yvf) (r4 = r4.b.r()).d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r6f(t97 r4, t97 r5, t97 r6, t97 r7) {
        /*
            r3 = this;
            xuf r0 = defpackage.xuf.a
            w4 r1 = r0.getAccessor()
            java.lang.Class<x4a> r2 = defpackage.x4a.class
            java.lang.Object r1 = r1.c(r2)
            x4a r1 = (defpackage.x4a) r1
            w4 r0 = r0.getAccessor()
            java.lang.Class<pae> r2 = defpackage.pae.class
            r7e r0 = r0.d(r2)
            r3.<init>()
            r3.a = r4
            r3.b = r6
            r3.c = r7
            r3.o = r5
            r3.X = r0
            v4a r4 = new v4a
            r5 = 2
            r4.<init>(r1, r5)
            r7e r5 = new r7e
            r5.<init>(r4)
            r3.Z = r5
            i5f r4 = new i5f
            r5 = 0
            r4.<init>(r5, r5)
            grd r4 = hrd.a(r4)
            r3.B0 = r4
            t0c r6 = new t0c
            r6.<init>(r4)
            r3.C0 = r6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            grd r4 = hrd.a(r4)
            r3.F0 = r4
            t0c r6 = new t0c
            r6.<init>(r4)
            r3.G0 = r6
            fu1 r4 = r3.m()
            if (r4 == 0) goto L_0x0071
            fcc r4 = (fcc) r4
            fu1 r4 = r4.b
            yh7 r4 = r4.r()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r4 = r4.d()
            yvf r4 = (yvf) r4
            if (r4 == 0) goto L_0x0071
            float r4 = r4.c()
            goto L_0x0073
        L_0x0071:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0073:
            r3.H0 = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r5)
            r3.K0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6f.<init>(t97, t97, t97, t97):void");
    }

    public final int a() {
        return 0;
    }

    public final boolean b() {
        return this.D0 != null;
    }

    public final void c() {
        String name = r6f.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, "onFirstVideoFrameRendered", (Throwable) null);
        }
    }

    public final void d() {
        String name = r6f.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, "stopRecording videoMessage", (Throwable) null);
        }
        iu1 iu1 = this.J0;
        if (iu1 != null) {
            iu1.b.d(nb7.ON_STOP);
        }
        a6c a6c = this.D0;
        if (a6c != null) {
            a6c.close();
        }
        this.D0 = null;
    }

    public final void e() {
        String name = r6f.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, "resumeRecording videoMessage", (Throwable) null);
        }
        iu1 iu1 = this.J0;
        if (iu1 != null) {
            iu1.b.d(nb7.ON_RESUME);
        }
        a6c a6c = this.D0;
        if (a6c != null) {
            a6c.n();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.l6f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            l6f r0 = (defpackage.l6f) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            l6f r0 = new l6f
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r7)
            goto L_0x0055
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            wx3.H(r7)
            t97 r7 = r4.b
            java.lang.Object r7 = r7.getValue()
            bf5 r7 = (defpackage.bf5) r7
            java.lang.String r5 = java.lang.String.valueOf(r5)
            mg5 r7 = (defpackage.mg5) r7
            java.io.File r5 = r7.n(r5)
            n6f r6 = new n6f
            r7 = 0
            r6.<init>(r4, r5, r7)
            r0.Y = r3
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = ez3.m0(r4, r6, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            jue r7 = (jue) r7
            if (r7 == 0) goto L_0x005c
            jue r4 = jue.a
            return r4
        L_0x005c:
            one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException r4 = new one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException
            r5 = 0
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6f.f(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c A[SYNTHETIC, Splitter:B:24:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.t4c r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r14 = r15 instanceof defpackage.q6f
            if (r14 == 0) goto L_0x0013
            r14 = r15
            q6f r14 = (defpackage.q6f) r14
            int r0 = r14.Z
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r14.Z = r0
            goto L_0x0018
        L_0x0013:
            q6f r14 = new q6f
            r14.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r14.X
            pu3 r0 = pu3.a
            int r1 = r14.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            r6f r13 = r14.o
            wx3.H(r15)     // Catch:{ all -> 0x002a }
            goto L_0x0047
        L_0x002a:
            r14 = move-exception
            goto L_0x0098
        L_0x002d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0035:
            wx3.H(r15)
            a73 r15 = r13.E0     // Catch:{ all -> 0x002a }
            if (r15 == 0) goto L_0x0097
            r14.o = r13     // Catch:{ all -> 0x002a }
            r14.Z = r2     // Catch:{ all -> 0x002a }
            java.lang.Object r15 = r15.awaitInternal(r14)     // Catch:{ all -> 0x002a }
            if (r15 != r0) goto L_0x0047
            return r0
        L_0x0047:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x002a }
            if (r15 != 0) goto L_0x004c
            goto L_0x0097
        L_0x004c:
            t97 r13 = r13.c     // Catch:{ all -> 0x005f }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x005f }
            u98 r13 = (defpackage.u98) r13     // Catch:{ all -> 0x005f }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x005f }
            xh0 r13 = (defpackage.xh0) r13     // Catch:{ all -> 0x005f }
            e7f r13 = r13.d(r14)     // Catch:{ all -> 0x005f }
            goto L_0x0066
        L_0x005f:
            r13 = move-exception
            kcc r14 = new kcc
            r14.<init>(r13)
            r13 = r14
        L_0x0066:
            boolean r14 = r13 instanceof kcc
            if (r14 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r3 = r13
        L_0x006c:
            e7f r3 = (defpackage.e7f) r3
            if (r3 == 0) goto L_0x0074
            java.lang.String r13 = r3.a
        L_0x0072:
            r5 = r13
            goto L_0x0079
        L_0x0074:
            java.lang.String r13 = r15.toString()
            goto L_0x0072
        L_0x0079:
            java.lang.String r4 = r15.toString()
            java.lang.String r13 = r15.toString()
            int r13 = r13.hashCode()
            long r2 = (long) r13
            tk7 r13 = new tk7
            r10 = 0
            r12 = 0
            r1 = 11
            r6 = 0
            r7 = 0
            java.lang.String r9 = "video/mp4"
            r0 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            return r13
        L_0x0097:
            return r3
        L_0x0098:
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r15 = "We couldn't get a video file after recording"
            udd.s(r13, r15, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6f.g(t4c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h() {
        String name = r6f.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, "pauseRecording videoMessage", (Throwable) null);
        }
        iu1 iu1 = this.J0;
        if (iu1 != null) {
            iu1.b.d(nb7.ON_PAUSE);
        }
        a6c a6c = this.D0;
        if (a6c != null) {
            a6c.m();
        }
    }

    public final boolean i() {
        return ((qna) this.o.getValue()).b(qna.p);
    }

    public final void j(y3c y3c) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, ybf] */
    public final void k(nc7 nc7, wu1 wu1) {
        e4b e4b = this.Y;
        if (e4b != null) {
            e4b.f();
        }
        qb7 qb7 = null;
        try {
            b3b b3b = this.w0;
            if (b3b != null) {
                h2f h2f = this.z0;
                if (h2f != null) {
                    k5f k5f = this.x0;
                    if (k5f != null) {
                        Rational rational = new Rational(1, 1);
                        int k = b3b.k();
                        ? obj = new Object();
                        obj.a = 1;
                        obj.b = rational;
                        obj.c = k;
                        obj.d = 0;
                        e4b e4b2 = this.Y;
                        if (e4b2 != null) {
                            tye tye = new tye();
                            tye.a(b3b);
                            tye.a(h2f);
                            tye.a = obj;
                            tye.c.add(k5f);
                            qb7 = e4b2.c(nc7, wu1, tye.b());
                        }
                        this.A0 = qb7;
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable th) {
            udd.s(r6f.class.getName(), "fail to bindCameraToLifecycle", th);
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, lb0] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(k3b r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = 2
            boolean r3 = r0 instanceof defpackage.k6f
            if (r3 == 0) goto L_0x0018
            r3 = r0
            k6f r3 = (defpackage.k6f) r3
            int r4 = r3.x0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0018
            int r4 = r4 - r5
            r3.x0 = r4
            goto L_0x001d
        L_0x0018:
            k6f r3 = new k6f
            r3.<init>(r1, r0)
        L_0x001d:
            java.lang.Object r0 = r3.Z
            pu3 r4 = pu3.a
            int r5 = r3.x0
            jue r6 = jue.a
            r7 = 0
            java.lang.String r8 = "Required value was null."
            r9 = 1
            if (r5 == 0) goto L_0x0054
            if (r5 == r9) goto L_0x0040
            if (r5 != r2) goto L_0x0038
            k3b r1 = r3.X
            r6f r3 = r3.o
            wx3.H(r0)
            goto L_0x0190
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            r6f r1 = r3.Y
            k3b r5 = r3.X
            r6f r10 = r3.o
            wx3.H(r0)     // Catch:{ all -> 0x0050 }
            r16 = r5
            r5 = r0
            r0 = r16
            goto L_0x00fe
        L_0x0050:
            r0 = move-exception
            r1 = r10
            goto L_0x0225
        L_0x0054:
            wx3.H(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.K0
            boolean r0 = r0.get()
            java.lang.Class<r6f> r5 = defpackage.r6f.class
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r5.getName()
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x006a
            goto L_0x0077
        L_0x006a:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0077
            tn7 r3 = defpackage.tn7.X
            java.lang.String r4 = "Resume camera preview"
            r2.d(r3, r0, r4, r7)
        L_0x0077:
            iu1 r0 = r1.J0
            if (r0 == 0) goto L_0x0092
            fu1 r2 = r17.m()
            if (r2 == 0) goto L_0x008b
            mw5 r2 = (mw5) r2
            fu1 r2 = r2.a
            wu1 r2 = r2.i()
            if (r2 != 0) goto L_0x008d
        L_0x008b:
            wu1 r2 = L0
        L_0x008d:
            r1.k(r0, r2)
            goto L_0x0206
        L_0x0092:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x009c:
            java.lang.String r0 = r5.getName()
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            boolean r10 = r5.c()
            if (r10 == 0) goto L_0x00b2
            tn7 r10 = defpackage.tn7.X
            java.lang.String r11 = "Start binding camera preview"
            r5.d(r10, r0, r11, r7)
        L_0x00b2:
            iu1 r0 = new iu1
            r0.<init>()
            r1.J0 = r0
            r3.o = r1     // Catch:{ all -> 0x0224 }
            r0 = r18
            r3.X = r0     // Catch:{ all -> 0x0224 }
            r3.getClass()     // Catch:{ all -> 0x0224 }
            r3.Y = r1     // Catch:{ all -> 0x0224 }
            r3.x0 = r9     // Catch:{ all -> 0x0224 }
            zv1 r5 = new zv1     // Catch:{ all -> 0x0224 }
            kotlin.coroutines.Continuation r10 = urd.y(r3)     // Catch:{ all -> 0x0224 }
            r5.<init>(r9, r10)     // Catch:{ all -> 0x0224 }
            r5.n()     // Catch:{ all -> 0x0224 }
            e4b r10 = e4b.f     // Catch:{ all -> 0x0224 }
            t97 r10 = r1.a     // Catch:{ all -> 0x0224 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x0224 }
            android.content.Context r10 = (android.content.Context) r10     // Catch:{ all -> 0x0224 }
            oy1 r10 = defpackage.x87.M(r10)     // Catch:{ all -> 0x0224 }
            ue3 r11 = new ue3     // Catch:{ all -> 0x0224 }
            r12 = 8
            r11.<init>(r5, r10, r1, r12)     // Catch:{ all -> 0x0224 }
            t97 r12 = r1.a     // Catch:{ all -> 0x0224 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0224 }
            android.content.Context r12 = (android.content.Context) r12     // Catch:{ all -> 0x0224 }
            java.util.concurrent.Executor r12 = kq3.a(r12)     // Catch:{ all -> 0x0224 }
            r10.c(r11, r12)     // Catch:{ all -> 0x0224 }
            java.lang.Object r5 = r5.m()     // Catch:{ all -> 0x0224 }
            if (r5 != r4) goto L_0x00fd
            return r4
        L_0x00fd:
            r10 = r1
        L_0x00fe:
            e4b r5 = (e4b) r5     // Catch:{ all -> 0x0050 }
            r1.Y = r5
            hs1 r1 = y5c.n0
            jg8 r5 = z90.a()
            r7e r11 = r10.Z
            java.lang.Object r11 = r11.getValue()
            java.util.concurrent.ExecutorService r11 = (java.util.concurrent.ExecutorService) r11
            java.lang.String r12 = "The specified executor can't be null."
            e07.o(r11, r12)
            ma0 r12 = ma0.d
            v2b r12 = defpackage.v2b.i(r12)
            java.lang.Object r13 = r5.c
            mb0 r13 = (mb0) r13
            if (r13 == 0) goto L_0x021c
            lb0 r14 = new lb0
            r14.<init>()
            v2b r15 = r13.a
            r14.a = r15
            android.util.Range r15 = r13.b
            r14.b = r15
            android.util.Range r15 = r13.c
            r14.c = r15
            int r13 = r13.d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.d = r13
            r14.a = r12
            mb0 r12 = r14.a()
            r5.c = r12
            y5c r12 = new y5c
            z90 r5 = r5.i()
            r12.<init>(r11, r5, r1, r1)
            r10.y0 = r12
            hp6 r1 = new hp6
            r1.<init>(r12)
            z80 r5 = br6.E
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            fc9 r12 = r1.b
            r12.j(r5, r11)
            h2f r5 = new h2f
            i2f r11 = new i2f
            fc9 r1 = r1.b
            hga r1 = hga.a(r1)
            r11.<init>(r1)
            r5.<init>(r11)
            r10.z0 = r5
            android.util.Size r1 = new android.util.Size
            int r5 = r0.getMeasuredWidth()
            int r11 = r0.getMeasuredHeight()
            r1.<init>(r5, r11)
            r3.o = r10
            r3.X = r0
            r3.getClass()
            r3.Y = r7
            r3.x0 = r2
            java.lang.Object r1 = r10.n(r1, r3)
            if (r1 != r4) goto L_0x018e
            return r4
        L_0x018e:
            r1 = r0
            r3 = r10
        L_0x0190:
            hp6 r0 = new hp6
            r0.<init>(r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L_0x01a6
            z80 r4 = br6.E
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            fc9 r5 = r0.b
            r5.j(r4, r2)
        L_0x01a6:
            zq4 r2 = zq4.d
            z80 r4 = qq6.A
            fc9 r5 = r0.b
            r5.j(r4, r2)
            b3b r0 = r0.b()
            a3b r1 = r1.getSurfaceProvider()
            r0.G(r1)
            r3.w0 = r0
            iu1 r0 = r3.J0
            if (r0 == 0) goto L_0x0212
            wu1 r1 = L0
            r3.k(r0, r1)
            grd r0 = r3.B0
            i5f r1 = new i5f
            fu1 r2 = r3.m()
            r4 = 0
            if (r2 == 0) goto L_0x01d9
            fcc r2 = (fcc) r2
            fu1 r2 = r2.b
            boolean r2 = r2.m()
            goto L_0x01da
        L_0x01d9:
            r2 = r4
        L_0x01da:
            fu1 r5 = r3.m()
            if (r5 == 0) goto L_0x01fa
            fcc r5 = (fcc) r5
            fu1 r5 = r5.b
            yh7 r5 = r5.e()
            if (r5 == 0) goto L_0x01fa
            java.lang.Object r5 = r5.d()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L_0x01f3
            goto L_0x01fa
        L_0x01f3:
            int r5 = r5.intValue()
            if (r5 != r9) goto L_0x01fa
            r4 = r9
        L_0x01fa:
            r1.<init>(r2, r4)
            r0.m(r7, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.K0
            r0.set(r9)
            r1 = r3
        L_0x0206:
            iu1 r0 = r1.J0
            if (r0 == 0) goto L_0x0211
            pc7 r0 = r0.b
            nb7 r1 = nb7.ON_RESUME
            r0.d(r1)
        L_0x0211:
            return r6
        L_0x0212:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x021c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Property \"videoSpec\" has not been set"
            r0.<init>(r1)
            throw r0
        L_0x0224:
            r0 = move-exception
        L_0x0225:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail to bindPreview"
            udd.s(r1, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6f.l(k3b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final fu1 m() {
        qb7 qb7 = this.A0;
        if (qb7 != null) {
            return qb7.c.G0;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(android.util.Size r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.o6f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            o6f r0 = (defpackage.o6f) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            o6f r0 = new o6f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            h6f r6 = r0.Y
            h6f r7 = r0.X
            r6f r0 = r0.o
            wx3.H(r8)
            goto L_0x0064
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            wx3.H(r8)
            h6f r8 = new h6f
            r8.<init>(r7)
            t97 r2 = r6.X
            java.lang.Object r2 = r2.getValue()
            pae r2 = (defpackage.pae) r2
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            p6f r4 = new p6f
            r5 = 0
            r4.<init>(r7, r5)
            r0.o = r6
            r0.X = r8
            r0.Y = r8
            r0.x0 = r3
            java.lang.Object r7 = xs7.U(r2, r4, r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r0 = r6
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0064:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L_0x0088
            r6.g(r8, r3)
            java.util.concurrent.CopyOnWriteArraySet r6 = r7.Y
            i6f r8 = new i6f
            r8.<init>(r0)
            r6.add(r8)
            k5f r6 = new k5f
            xe9 r8 = new xe9
            r1 = 22
            r8.<init>(r1)
            vd6 r1 = r7.X
            r6.<init>(r1, r7, r8)
            r0.x0 = r6
            jue r6 = jue.a
            return r6
        L_0x0088:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6f.n(android.util.Size, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
