package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bp5  reason: default package */
public final class bp5 {
    public static final MeteringRectangle[] x = new MeteringRectangle[0];
    public final zq1 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public final za6 f;
    public boolean g = false;
    public Integer h = 0;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public long k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 1;
    public vo5 o = null;
    public xo5 p = null;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    public MeteringRectangle[] s;
    public sn1 t;
    public sn1 u;
    public boolean v;
    public ap5 w;

    public bp5(zq1 zq1, vd6 vd6, ryc ryc, xe6 xe6) {
        MeteringRectangle[] meteringRectangleArr = x;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = null;
        this.a = zq1;
        this.b = ryc;
        this.c = vd6;
        this.f = new za6((Object) xe6);
    }

    public final void a(boolean z, boolean z2) {
        if (this.d) {
            w30 w30 = new w30();
            w30.b = true;
            w30.c = this.n;
            fc9 c2 = fc9.c();
            if (z) {
                c2.j(js1.Q(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                c2.j(js1.Q(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            w30.c(new mv4(7, hga.a(c2)));
            this.a.z(Collections.singletonList(w30.d()));
        }
    }

    public final void b() {
        xo5 xo5 = this.p;
        zq1 zq1 = this.a;
        ((HashSet) zq1.b.b).remove(xo5);
        sn1 sn1 = this.u;
        if (sn1 != null) {
            sn1.d(new Exception("Cancelled by another cancelFocusAndMetering()"));
            this.u = null;
        }
        ((HashSet) zq1.b.b).remove(this.o);
        sn1 sn12 = this.t;
        if (sn12 != null) {
            sn12.d(new Exception("Cancelled by cancelFocusAndMetering()"));
            this.t = null;
        }
        this.u = null;
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture scheduledFuture2 = this.j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.j = null;
        }
        if (this.q.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = x;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.g = false;
        long A = zq1.A();
        if (this.u != null) {
            int i2 = 3;
            if (this.n != 3) {
                i2 = 4;
            }
            xo5 xo52 = new xo5(zq1.u(i2), A, this);
            this.p = xo52;
            zq1.p(xo52);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List c(java.util.List r21, int r22, android.util.Rational r23, android.graphics.Rect r24, int r25) {
        /*
            r20 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r21.isEmpty()
            if (r2 != 0) goto L_0x015b
            if (r0 != 0) goto L_0x000e
            goto L_0x015b
        L_0x000e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.util.Rational r3 = new android.util.Rational
            int r4 = r24.width()
            int r5 = r24.height()
            r3.<init>(r4, r5)
            java.util.Iterator r4 = r21.iterator()
        L_0x0024:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0156
            java.lang.Object r5 = r4.next()
            p39 r5 = (defpackage.p39) r5
            int r6 = r2.size()
            if (r6 != r0) goto L_0x0038
            goto L_0x0156
        L_0x0038:
            float r6 = r5.a
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0150
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 > 0) goto L_0x0150
            float r9 = r5.b
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0150
            int r7 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0150
            android.util.Rational r7 = r5.d
            if (r7 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r7 = r23
        L_0x0056:
            r10 = 1
            r11 = r20
            za6 r12 = r11.f
            r13 = r25
            if (r13 != r10) goto L_0x0073
            java.lang.Object r10 = r12.a
            xe6 r10 = (defpackage.xe6) r10
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk> r12 = androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class
            boolean r10 = r10.i(r12)
            if (r10 == 0) goto L_0x0076
            android.graphics.PointF r10 = new android.graphics.PointF
            float r6 = r8 - r6
            r10.<init>(r6, r9)
            goto L_0x007b
        L_0x0073:
            r12.getClass()
        L_0x0076:
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r6, r9)
        L_0x007b:
            boolean r6 = r7.equals(r3)
            if (r6 != 0) goto L_0x00bd
            int r6 = r7.compareTo(r3)
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r6 <= 0) goto L_0x00a5
            double r6 = r7.doubleValue()
            double r18 = r3.doubleValue()
            double r6 = r6 / r18
            float r6 = (float) r6
            double r8 = (double) r6
            double r8 = r8 - r16
            double r8 = r8 / r14
            float r7 = (float) r8
            float r8 = r10.y
            float r7 = r7 + r8
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 / r6
            float r8 = r8 * r7
            r10.y = r8
            goto L_0x00bd
        L_0x00a5:
            double r8 = r3.doubleValue()
            double r6 = r7.doubleValue()
            double r8 = r8 / r6
            float r6 = (float) r8
            double r7 = (double) r6
            double r7 = r7 - r16
            double r7 = r7 / r14
            float r7 = (float) r7
            float r8 = r10.x
            float r7 = r7 + r8
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 / r6
            float r8 = r8 * r7
            r10.x = r8
        L_0x00bd:
            int r6 = r1.left
            float r6 = (float) r6
            float r7 = r10.x
            int r8 = r24.width()
            float r8 = (float) r8
            float r7 = r7 * r8
            float r7 = r7 + r6
            int r6 = (int) r7
            int r7 = r1.top
            float r7 = (float) r7
            float r8 = r10.y
            int r9 = r24.height()
            float r9 = (float) r9
            float r8 = r8 * r9
            float r8 = r8 + r7
            int r7 = (int) r8
            int r8 = r24.width()
            float r8 = (float) r8
            float r5 = r5.c
            float r8 = r8 * r5
            int r8 = (int) r8
            int r9 = r24.height()
            float r9 = (float) r9
            float r5 = r5 * r9
            int r5 = (int) r5
            android.graphics.Rect r9 = new android.graphics.Rect
            int r8 = r8 / 2
            int r10 = r6 - r8
            int r5 = r5 / 2
            int r12 = r7 - r5
            int r6 = r6 + r8
            int r7 = r7 + r5
            r9.<init>(r10, r12, r6, r7)
            int r5 = r9.left
            int r6 = r1.right
            int r7 = r1.left
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = java.lang.Math.min(r5, r6)
            r9.left = r5
            int r5 = r9.right
            int r6 = r1.right
            int r7 = r1.left
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = java.lang.Math.min(r5, r6)
            r9.right = r5
            int r5 = r9.top
            int r6 = r1.bottom
            int r7 = r1.top
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = java.lang.Math.min(r5, r6)
            r9.top = r5
            int r5 = r9.bottom
            int r6 = r1.bottom
            int r7 = r1.top
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = java.lang.Math.min(r5, r6)
            r9.bottom = r5
            android.hardware.camera2.params.MeteringRectangle r5 = new android.hardware.camera2.params.MeteringRectangle
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.<init>(r9, r6)
            int r6 = r5.getWidth()
            if (r6 == 0) goto L_0x0024
            int r6 = r5.getHeight()
            if (r6 != 0) goto L_0x014b
            goto L_0x0024
        L_0x014b:
            r2.add(r5)
            goto L_0x0024
        L_0x0150:
            r11 = r20
            r13 = r25
            goto L_0x0024
        L_0x0156:
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            return r0
        L_0x015b:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp5.c(java.util.List, int, android.util.Rational, android.graphics.Rect, int):java.util.List");
    }

    public final void d(sn1 sn1) {
        if (!this.d) {
            sn1.d(new Exception("Camera is not active."));
            return;
        }
        w30 w30 = new w30();
        w30.c = this.n;
        w30.b = true;
        fc9 c2 = fc9.c();
        c2.j(js1.Q(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        w30.c(new mv4(7, hga.a(c2)));
        w30.b(new xr1(sn1, 2));
        this.a.z(Collections.singletonList(w30.d()));
    }

    public final void e(boolean z) {
        if (this.d) {
            w30 w30 = new w30();
            w30.c = this.n;
            w30.b = true;
            fc9 c2 = fc9.c();
            c2.j(js1.Q(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer valueOf = Integer.valueOf(zq1.t(this.a.e, 1));
                c2.g(js1.Q(key), ha3.b, valueOf);
            }
            w30.c(new mv4(7, hga.a(c2)));
            w30.b(new xr1());
            this.a.z(Collections.singletonList(w30.d()));
        }
    }
}
