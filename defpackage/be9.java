package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.messages.location.FrgLocationMap;

/* renamed from: be9  reason: default package */
public final class be9 extends u2 implements km7 {
    public final av7 A0;
    public final di3 B0;
    public final duf C0;
    public final mbe D0;
    public final g2b E0;
    public final FrgLocationMap F0;
    public hm7 G0;
    public dm7 H0;
    public av7 I0;
    public boolean J0;
    public final ajb K0;
    public final ajb L0;
    public c97 M0;
    public final pn1 N0;
    public bx7 O0;
    public final n83 X;
    public final mm7 Y;
    public final wae Z;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap o = new ConcurrentHashMap();
    public final di7 w0;
    public final long x0;
    public final long y0;
    public final String z0;

    /* JADX WARNING: type inference failed for: r14v1, types: [n83, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public be9(defpackage.hm7 r17, defpackage.kt7 r18, defpackage.dm7 r19, boolean r20, defpackage.af9 r21, defpackage.mm7 r22, defpackage.wae r23, defpackage.di7 r24, long r25, long r27, java.lang.String r29, defpackage.av7 r30, ru.ok.messages.location.FrgLocationMap r31, defpackage.di3 r32, duf r33, defpackage.rf4 r34, defpackage.mbe r35, defpackage.g2b r36) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            r2 = r24
            r3 = r25
            r5 = r29
            r6 = r30
            r7 = r35
            r10 = 3
            r11 = 1
            r12 = 0
            r0.<init>((int) r12, (java.lang.Object) r1)
            java.util.concurrent.ConcurrentHashMap r13 = new java.util.concurrent.ConcurrentHashMap
            r13.<init>()
            r0.c = r13
            java.util.concurrent.ConcurrentHashMap r14 = new java.util.concurrent.ConcurrentHashMap
            r14.<init>()
            r0.o = r14
            n83 r14 = new n83
            r14.<init>()
            r0.X = r14
            r15 = r17
            r0.G0 = r15
            r15 = r19
            r0.H0 = r15
            r15 = r20
            r0.J0 = r15
            r15 = r22
            r0.Y = r15
            r15 = r23
            r0.Z = r15
            r0.w0 = r2
            r0.x0 = r3
            r8 = r27
            r0.y0 = r8
            r0.z0 = r5
            r0.A0 = r6
            r0.D0 = r7
            zu7 r8 = new zu7
            dm7 r9 = defpackage.dm7.Z
            r8.<init>(r9)
            r8.i = r11
            av7 r9 = new av7
            r9.<init>(r8)
            r0.I0 = r9
            r8 = r31
            r0.F0 = r8
            r8 = r32
            r0.B0 = r8
            r8 = r33
            r0.C0 = r8
            r8 = r36
            r0.E0 = r8
            hm7 r8 = r0.G0
            boolean r8 = r8.a
            ai0 r9 = new ai0
            r15 = 17
            r9.<init>(r15)
            r0.b2(r9)
            if (r6 == 0) goto L_0x0084
            long r11 = r6.c
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.put(r11, r6)
        L_0x0084:
            hm7 r6 = r0.G0
            int r6 = r6.d
            if (r6 != r10) goto L_0x00ab
            r11 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            dm7 r11 = r0.H0
            zu7 r12 = new zu7
            r12.<init>(r11)
            r12.b = r3
            r3 = 1
            r12.h = r3
            r12.e = r5
            ev7 r4 = defpackage.ev7.c
            r12.d = r4
            r12.k = r3
            av7 r3 = r12.a()
            r13.put(r6, r3)
        L_0x00ab:
            r1.t(r0)
            r3 = r18
            r1.P0 = r3
            ru.ok.messages.location.TamSupportMapFragment r3 = r1.F0
            r4 = 1117782016(0x42a00000, float:80.0)
            defpackage.zg4.a(r4)
            r3.getClass()
            x3e r4 = new x3e
            st7 r5 = r1.Z
            qmc r6 = r1.B0
            r4.<init>(r5, r6, r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r5 = android.os.Looper.myLooper()
            if (r1 != r5) goto L_0x01ab
            yha r1 = r3.p1
            java.lang.Object r3 = r1.a
            v2b r3 = (defpackage.v2b) r3
            if (r3 == 0) goto L_0x00db
            r3.k(r4)
            goto L_0x00e2
        L_0x00db:
            java.lang.Object r1 = r1.w0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r4)
        L_0x00e2:
            r1 = 0
            r0.h2(r1)
            r16.c2()
            r16.f2()
            ajb r1 = new ajb
            r1.<init>()
            r0.L0 = r1
            r3 = r7
            nbe r3 = (defpackage.nbe) r3
            qmc r4 = r3.a()
            nu9 r1 = r1.n(r4)
            dd9 r4 = new dd9
            r5 = 14
            r4.<init>((int) r5)
            ps9 r5 = new ps9
            r6 = 1
            r5.<init>(r1, r4, r6)
            yd9 r1 = new yd9
            r4 = 0
            r1.<init>(r0, r4)
            au9 r4 = new au9
            r4.<init>(r5, r1, r10)
            qmc r1 = de.a()
            nu9 r1 = r4.n(r1)
            yd9 r4 = new yd9
            r4.<init>(r0, r6)
            dd9 r5 = new dd9
            r6 = 8
            r5.<init>((int) r6)
            z26 r6 = z3d.i
            c97 r7 = new c97
            r7.<init>(r4, r5, r6)
            r1.a(r7)
            r14.a(r7)
            hm7 r1 = r0.G0
            int r1 = r1.c
            r4 = 1
            if (r1 != r4) goto L_0x0173
            ajb r1 = new ajb
            r1.<init>()
            r0.K0 = r1
            yd9 r4 = new yd9
            r5 = 2
            r4.<init>(r0, r5)
            dd9 r5 = new dd9
            r7 = 9
            r5.<init>((int) r7)
            c97 r7 = new c97
            r7.<init>(r4, r5, r6)
            r1.a(r7)
            r14.a(r7)
            ajb r1 = r0.K0
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r1.c(r4)
            r24.getClass()
            java.lang.String r1 = "be9"
            java.lang.String r5 = "onLiveLocationUpdate"
            udd.q(r1, r5)
            ajb r1 = r0.K0
            r1.c(r4)
        L_0x0173:
            if (r8 == 0) goto L_0x01aa
            r1 = r2
            ei7 r1 = (defpackage.ei7) r1
            r1.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            mv9 r1 = dhd.g(r1)
            qmc r2 = r3.a()
            yhd r1 = r1.m(r2)
            qmc r2 = de.a()
            yhd r1 = r1.i(r2)
            yd9 r2 = new yd9
            r3 = 8
            r2.<init>(r0, r3)
            dd9 r3 = new dd9
            r4 = 13
            r3.<init>((int) r4)
            pn1 r4 = new pn1
            r5 = 2
            r4.<init>(r2, r5, r3)
            r1.k(r4)
            r0.N0 = r4
        L_0x01aa:
            return
        L_0x01ab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getMapAsync must be called on the main thread."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.<init>(hm7, kt7, dm7, boolean, af9, mm7, wae, di7, long, long, java.lang.String, av7, ru.ok.messages.location.FrgLocationMap, di3, duf, rf4, mbe, g2b):void");
    }

    public final void U0() {
    }

    public final void Z1() {
        b2(new jv1(1, this));
        ConcurrentHashMap concurrentHashMap = this.c;
        h2((concurrentHashMap.size() < 1 || !concurrentHashMap.containsKey(0L)) ? null : new yd9(this, 4));
        f2();
    }

    public final void a2(int i) {
        ((j2b) this.E0).c.j(i, "app.location.map.type");
        af9 af9 = (af9) ((ge9) this.b);
        nt7 nt7 = af9.O0;
        if (nt7 != null && nt7.d.C() != i) {
            af9.O0.f(i);
        }
    }

    public final void b2(rf3 rf3) {
        hm7 hm7 = this.G0;
        hm7.getClass();
        fm7 fm7 = new fm7();
        fm7.a = hm7.a;
        fm7.b = hm7.b;
        fm7.c = hm7.c;
        fm7.d = hm7.d;
        fm7.e = hm7.e;
        fm7.f = hm7.f;
        fm7.g = hm7.g;
        fm7.h = hm7.h;
        fm7.i = hm7.i;
        fm7.j = hm7.j;
        fm7.k = hm7.k;
        fm7.l = hm7.l;
        fm7.m = hm7.m;
        fm7.n = hm7.n;
        fm7.o = hm7.o;
        fm7.p = hm7.p;
        fm7.q = hm7.q;
        fm7.r = hm7.r;
        rf3.accept(fm7);
        this.G0 = new hm7(fm7);
    }

    public final void c2() {
        yd9 yd9 = new yd9(this, 7);
        mm7 mm7 = this.Y;
        mm7.getClass();
        String[] strArr = urd.e;
        Context context = mm7.o;
        if (!urd.j(context, strArr)) {
            try {
                yd9.accept(Boolean.FALSE);
            } catch (Throwable th) {
                udd.s("mm7", "isServiceAvailable", th);
            }
        } else {
            e3 e3Var = new e3((Object) yd9);
            ((wa6) mm7.Z.get()).getClass();
            wa6.a(context, e3Var);
        }
    }

    public final void d2() {
        for (av7 c2 : this.c.values()) {
            this.L0.c(c2);
        }
        if (this.G0.d == 2) {
            zu7 a = this.I0.a();
            a.i = true;
            av7 av7 = new av7(a);
            this.I0 = av7;
            this.L0.c(av7);
            f2();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        if (r12.isEmpty() != false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e2() {
        /*
            r30 = this;
            r0 = r30
            r5 = 8
            java.lang.Object r6 = r0.b
            ge9 r6 = (defpackage.ge9) r6
            af9 r6 = (defpackage.af9) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.concurrent.ConcurrentHashMap r0 = r0.c
            java.util.Collection r0 = r0.values()
            r7.<init>(r0)
            r6.getClass()
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r8 = "af9"
            java.lang.String r9 = "Bind %d markers"
            udd.p(r8, r9, r0)
            long r9 = java.lang.System.nanoTime()
            gd9 r0 = r6.L0
            hm7 r11 = r6.S0
            java.util.Comparator r12 = r0.c
            java.util.Collections.sort(r7, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r7)
            java.util.Iterator r13 = r12.iterator()
        L_0x0041:
            boolean r14 = r13.hasNext()
            r15 = 0
            if (r14 == 0) goto L_0x0059
            java.lang.Object r14 = r13.next()
            av7 r14 = (defpackage.av7) r14
            long r1 = r14.c
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 != 0) goto L_0x0041
            r13.remove()
            goto L_0x0041
        L_0x0059:
            int r1 = r12.size()
            r2 = 1
            if (r1 > r2) goto L_0x0061
            r12 = 0
        L_0x0061:
            av7 r1 = r11.a(r7)
            java.lang.Object r0 = r0.b
            ge9 r0 = (defpackage.ge9) r0
            je9 r0 = (defpackage.je9) r0
            le9 r0 = (defpackage.le9) r0
            r14 = 0
            if (r12 == 0) goto L_0x0079
            r0.getClass()
            boolean r17 = r12.isEmpty()
            if (r17 == 0) goto L_0x007b
        L_0x0079:
            if (r1 == 0) goto L_0x0099
        L_0x007b:
            java.lang.Object r13 = r0.c
            android.view.View r13 = (android.view.View) r13
            if (r13 != 0) goto L_0x0091
            int r13 = defpackage.le9.H0
            android.view.ViewStub r3 = r0.Z
            r3.setLayoutResource(r13)
            android.view.View r3 = r3.inflate()
            r0.c = r3
            r0.n()
        L_0x0091:
            java.lang.Object r3 = r0.c
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r14)
            goto L_0x00a2
        L_0x0099:
            java.lang.Object r3 = r0.c
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00a2
            r3.setVisibility(r5)
        L_0x00a2:
            if (r12 == 0) goto L_0x00ac
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x00ac
            r3 = r2
            goto L_0x00ad
        L_0x00ac:
            r3 = r14
        L_0x00ad:
            r18 = -1
            if (r1 != 0) goto L_0x00b4
            r4 = r18
            goto L_0x00b6
        L_0x00b4:
            long r4 = r1.c
        L_0x00b6:
            if (r3 == 0) goto L_0x00ce
            androidx.recyclerview.widget.RecyclerView r3 = r0.E0
            r3.setVisibility(r14)
            android.view.View r3 = r0.F0
            r3.setVisibility(r14)
            em3 r3 = r0.G0
            r3.X = r12
            r3.Y = r4
            r3.m()
            r4 = 8
            goto L_0x00dc
        L_0x00ce:
            androidx.recyclerview.widget.RecyclerView r3 = r0.E0
            r4 = 8
            if (r3 == 0) goto L_0x00dc
            r3.setVisibility(r4)
            android.view.View r3 = r0.F0
            r3.setVisibility(r4)
        L_0x00dc:
            if (r1 != 0) goto L_0x00f8
            androidx.constraintlayout.widget.Group r1 = r0.x0
            if (r1 == 0) goto L_0x00ef
            r1.setVisibility(r4)
            android.widget.ImageView r1 = r0.z0
            r1.setVisibility(r4)
            android.widget.TextView r0 = r0.D0
            r0.setVisibility(r4)
        L_0x00ef:
            r14 = r6
            r20 = r7
            r16 = r8
            r21 = r9
            goto L_0x0367
        L_0x00f8:
            g2b r3 = r0.Y
            j2b r3 = (defpackage.j2b) r3
            i03 r4 = r3.a
            long r4 = r4.m()
            long r13 = r1.j
            long r4 = r4 - r13
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            yzc r2 = r3.b
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r15 = ru.ok.tamtam.android.prefs.PmsKey.f54livelocationsendtimeout
            r16 = r8
            r8 = 60
            r21 = r9
            long r8 = (long) r8
            long r8 = r2.o(r15, r8)
            int r2 = (int) r8
            long r8 = (long) r2
            long r8 = r12.toMillis(r8)
            long r10 = r11.o
            boolean r2 = r1.k
            boolean r15 = r1.h
            if (r15 == 0) goto L_0x0147
            if (r2 == 0) goto L_0x0147
            r23 = 2
            long r8 = r8 * r23
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0147
            r4 = 0
            int r8 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x0147
            rf4 r4 = r0.w0
            java.lang.String r4 = r4.a()
            java.lang.String r5 = r1.l
            boolean r4 = r1g.c(r5, r4)
            if (r4 != 0) goto L_0x0147
            r4 = 1
            goto L_0x0148
        L_0x0147:
            r4 = 0
        L_0x0148:
            if (r4 == 0) goto L_0x0158
            android.widget.ImageView r5 = r0.z0
            r8 = 8
            r5.setVisibility(r8)
            android.widget.ProgressBar r5 = r0.A0
            r8 = 0
            r5.setVisibility(r8)
            goto L_0x0171
        L_0x0158:
            r8 = 0
            if (r15 == 0) goto L_0x0165
            if (r2 == 0) goto L_0x0165
            android.widget.ImageView r5 = r0.z0
            r5.setVisibility(r8)
            r9 = 8
            goto L_0x016c
        L_0x0165:
            android.widget.ImageView r5 = r0.z0
            r9 = 8
            r5.setVisibility(r9)
        L_0x016c:
            android.widget.ProgressBar r5 = r0.A0
            r5.setVisibility(r9)
        L_0x0171:
            androidx.constraintlayout.widget.Group r5 = r0.x0
            r5.setVisibility(r8)
            i03 r3 = r3.a
            long r8 = r3.s()
            r23 = r13
            long r12 = r1.b
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0190
            if (r15 == 0) goto L_0x0190
            if (r2 == 0) goto L_0x0190
            android.widget.TextView r3 = r0.D0
            r5 = 8
            r3.setVisibility(r5)
            goto L_0x0196
        L_0x0190:
            android.widget.TextView r3 = r0.D0
            r5 = 0
            r3.setVisibility(r5)
        L_0x0196:
            android.widget.TextView r3 = r0.y0
            w6a r5 = r0.o
            nu4 r8 = r5.j
            java.lang.String r9 = r1.e
            java.lang.CharSequence r8 = r8.e(r9)
            r3.setText(r8)
            boolean r3 = r1.i
            java.lang.Object r8 = r0.b
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r9 = ""
            if (r3 == 0) goto L_0x01c4
            android.widget.TextView r1 = r0.D0
            r1.setText(r9)
            android.widget.TextView r1 = r0.C0
            int r3 = defpackage.cic.s0
            java.lang.String r3 = r8.getString(r3)
            r1.setText(r3)
        L_0x01bf:
            r14 = r6
            r20 = r7
            goto L_0x0237
        L_0x01c4:
            java.lang.String r3 = r1.f
            boolean r13 = r1g.p(r3)
            if (r13 == 0) goto L_0x01d8
            android.widget.TextView r3 = r0.C0
            int r13 = defpackage.cic.c3
            java.lang.String r13 = r8.getString(r13)
            r3.setText(r13)
            goto L_0x01dd
        L_0x01d8:
            android.widget.TextView r13 = r0.C0
            r13.setText(r3)
        L_0x01dd:
            float r1 = r1.g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x01eb
            android.widget.TextView r1 = r0.D0
            r1.setText(r9)
            goto L_0x01bf
        L_0x01eb:
            int r3 = defpackage.che.a
            java.text.DecimalFormatSymbols r3 = new java.text.DecimalFormatSymbols
            java.util.Locale r13 = java.util.Locale.ENGLISH
            r3.<init>(r13)
            r13 = 46
            r3.setDecimalSeparator(r13)
            r13 = 1148846080(0x447a0000, float:1000.0)
            int r14 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x0216
            java.text.DecimalFormat r13 = new java.text.DecimalFormat
            java.lang.String r14 = "0"
            r13.<init>(r14, r3)
            r14 = r6
            r20 = r7
            double r6 = (double) r1
            java.lang.String r1 = r13.format(r6)
            int r3 = defpackage.cic.B1
            java.lang.String r3 = r8.getString(r3)
            r6 = r3
            goto L_0x022c
        L_0x0216:
            r14 = r6
            r20 = r7
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            java.lang.String r7 = "0.#"
            r6.<init>(r7, r3)
            float r1 = r1 / r13
            double r12 = (double) r1
            java.lang.String r1 = r6.format(r12)
            int r6 = defpackage.cic.k0
            java.lang.String r6 = r8.getString(r6)
        L_0x022c:
            java.lang.String r7 = " "
            java.lang.String r1 = defpackage.me4.i(r1, r7, r6)
            android.widget.TextView r6 = r0.D0
            r6.setText(r1)
        L_0x0237:
            if (r4 == 0) goto L_0x0254
            android.widget.TextView r0 = r0.B0
            int r1 = defpackage.whc.w
            r6 = r23
            java.lang.String r2 = r5.d(r6)
            java.lang.String r2 = defpackage.dhe.e(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r8.getString(r1, r2)
            r0.setText(r1)
            goto L_0x0367
        L_0x0254:
            r6 = r23
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x026b
            android.widget.TextView r0 = r0.B0
            java.lang.String r1 = r5.d(r10)
            java.lang.String r1 = defpackage.dhe.e(r1)
            r0.setText(r1)
            goto L_0x0367
        L_0x026b:
            if (r15 == 0) goto L_0x035a
            if (r2 == 0) goto L_0x02e5
            android.widget.TextView r0 = r0.B0
            i03 r1 = r5.c
            long r10 = r1.m()
            sz0 r2 = xs7.v(r6, r10)
            java.util.Locale r1 = r1.u()
            java.lang.String[] r4 = defpackage.dhe.b
            int r4 = r2.b
            int r4 = hr1.t(r4)
            android.content.Context r5 = r5.a
            long r6 = r2.c
            switch(r4) {
                case 0: goto L_0x02da;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02ca;
                case 3: goto L_0x02b7;
                case 4: goto L_0x02af;
                case 5: goto L_0x02a7;
                case 6: goto L_0x029f;
                case 7: goto L_0x028f;
                default: goto L_0x028e;
            }
        L_0x028e:
            goto L_0x02e0
        L_0x028f:
            int r2 = defpackage.avb.tt_dates_full_last_update
            r4 = 1
            java.lang.String r1 = xs7.w(r1, r6, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r9 = r5.getString(r2, r1)
            goto L_0x02e0
        L_0x029f:
            int r1 = defpackage.fsb.tt_dates_months_last_update
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x02e0
        L_0x02a7:
            int r1 = defpackage.fsb.tt_dates_weeks_last_update
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x02e0
        L_0x02af:
            int r1 = defpackage.fsb.tt_dates_days_last_update
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x02e0
        L_0x02b7:
            int r2 = defpackage.avb.tt_dates_yesterday_last_update
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r1 = xs7.p(r5, r6, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r9 = java.lang.String.format(r2, r1)
            goto L_0x02e0
        L_0x02ca:
            int r1 = defpackage.fsb.tt_dates_hours_last_update
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x02e0
        L_0x02d2:
            int r1 = defpackage.fsb.tt_dates_minutes_last_update
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x02e0
        L_0x02da:
            int r1 = defpackage.avb.tt_dates_right_now_last_update
            java.lang.String r9 = r5.getString(r1)
        L_0x02e0:
            r0.setText(r9)
            goto L_0x0367
        L_0x02e5:
            android.widget.TextView r0 = r0.B0
            i03 r1 = r5.c
            long r10 = r1.m()
            sz0 r2 = xs7.v(r6, r10)
            java.util.Locale r1 = r1.u()
            java.lang.String[] r4 = defpackage.dhe.b
            int r4 = r2.b
            int r4 = hr1.t(r4)
            android.content.Context r5 = r5.a
            long r6 = r2.c
            switch(r4) {
                case 0: goto L_0x0350;
                case 1: goto L_0x0348;
                case 2: goto L_0x0340;
                case 3: goto L_0x032d;
                case 4: goto L_0x0325;
                case 5: goto L_0x031d;
                case 6: goto L_0x0315;
                case 7: goto L_0x0305;
                default: goto L_0x0304;
            }
        L_0x0304:
            goto L_0x0356
        L_0x0305:
            int r2 = defpackage.avb.tt_dates_full_live_location_end
            r4 = 1
            java.lang.String r1 = xs7.w(r1, r6, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r9 = r5.getString(r2, r1)
            goto L_0x0356
        L_0x0315:
            int r1 = defpackage.fsb.tt_dates_months_live_location_end
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x0356
        L_0x031d:
            int r1 = defpackage.fsb.tt_dates_weeks_live_location_end
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x0356
        L_0x0325:
            int r1 = defpackage.fsb.tt_dates_days_live_location_end
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x0356
        L_0x032d:
            int r2 = defpackage.avb.tt_dates_yesterday_live_location_end
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r1 = xs7.p(r5, r6, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r9 = java.lang.String.format(r2, r1)
            goto L_0x0356
        L_0x0340:
            int r1 = defpackage.fsb.tt_dates_hours_live_location_end
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x0356
        L_0x0348:
            int r1 = defpackage.fsb.tt_dates_minutes_live_location_end
            int r2 = (int) r6
            java.lang.String r9 = defpackage.dhe.s(r1, r2, r5)
            goto L_0x0356
        L_0x0350:
            int r1 = defpackage.avb.tt_dates_right_now_live_location_end
            java.lang.String r9 = r5.getString(r1)
        L_0x0356:
            r0.setText(r9)
            goto L_0x0367
        L_0x035a:
            android.widget.TextView r0 = r0.B0
            java.lang.String r1 = r5.d(r6)
            java.lang.String r1 = defpackage.dhe.e(r1)
            r0.setText(r1)
        L_0x0367:
            nt7 r0 = r14.O0
            if (r0 != 0) goto L_0x036d
            goto L_0x070c
        L_0x036d:
            java.util.Iterator r1 = r20.iterator()
        L_0x0371:
            boolean r2 = r1.hasNext()
            java.util.LinkedHashMap r4 = r0.a
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L_0x04d7
            java.lang.Object r2 = r1.next()
            av7 r2 = (defpackage.av7) r2
            long r6 = r2.c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r4.get(r6)
            sh0 r6 = (defpackage.sh0) r6
            dm7 r7 = r2.a
            double r8 = r7.a
            double r10 = r7.b
            r7 = 1073741824(0x40000000, float:2.0)
            ev7 r15 = r2.d
            long r12 = r2.c
            if (r6 != 0) goto L_0x03f7
            j67 r6 = r0.j
            java.lang.Object r6 = r6.b()
            dv7 r6 = (defpackage.dv7) r6
            com.google.android.gms.maps.model.LatLng r3 = new com.google.android.gms.maps.model.LatLng
            r3.<init>(r8, r10)
            cv7 r8 = r6.a
            r8.a = r3
            r3 = 0
            r8.Z = r3
            r23 = r12
            java.lang.String r3 = r2.e
            r8.b = r3
            java.lang.String r3 = r2.f
            r8.c = r3
            r9 = 0
            int r3 = (r23 > r9 ? 1 : (r23 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x03c0
            goto L_0x03c2
        L_0x03c0:
            float r7 = r15.a
        L_0x03c2:
            r8.C0 = r7
            r8.X = r5
            r3 = 1064514355(0x3f733333, float:0.95)
            r8.Y = r3
            r3 = 0
            r8.w0 = r3
            qr4 r3 = r0.h
            r3.getClass()
            om0 r3 = qr4.m()
            lhd r3 = r3.a
            r8.o = r3
            mod r3 = r0.d
            c9 r3 = r3.v(r6)
            java.lang.Long r5 = java.lang.Long.valueOf(r23)
            r3.x(r5)
            sh0 r6 = new sh0
            r6.<init>(r2, r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r23)
            r4.put(r3, r6)
            boolean r2 = r2.k
            goto L_0x0441
        L_0x03f7:
            r23 = r12
            av7 r3 = r6.b
            ev7 r4 = r3.d
            r6.b = r2
            c9 r2 = r6.a
            r2.getClass()
            com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng
            r5.<init>(r8, r10)
            java.lang.Object r8 = r2.b
            xu7 r8 = (xu7) r8
            r8.getClass()
            f1g r8 = r8.a
            r9 = r8
            d1g r9 = (d1g) r9     // Catch:{ RemoteException -> 0x04d0 }
            android.os.Parcel r10 = r9.G0()     // Catch:{ RemoteException -> 0x04d0 }
            u1g.b(r10, r5)     // Catch:{ RemoteException -> 0x04d0 }
            r5 = 3
            r9.H0(r10, r5)     // Catch:{ RemoteException -> 0x04d0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r23)
            r2.x(r5)
            r9 = 0
            int r2 = (r23 > r9 ? 1 : (r23 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x042e
            goto L_0x0430
        L_0x042e:
            float r7 = r15.a
        L_0x0430:
            d1g r8 = (d1g) r8     // Catch:{ RemoteException -> 0x04c9 }
            android.os.Parcel r2 = r8.G0()     // Catch:{ RemoteException -> 0x04c9 }
            r2.writeFloat(r7)     // Catch:{ RemoteException -> 0x04c9 }
            r5 = 27
            r8.H0(r2, r5)     // Catch:{ RemoteException -> 0x04c9 }
            boolean r2 = r3.k
            r15 = r4
        L_0x0441:
            xi4 r3 = r6.c
            if (r3 == 0) goto L_0x0456
            av7 r3 = r6.b
            ev7 r4 = r3.d
            if (r15 != r4) goto L_0x0456
            boolean r3 = r3.k
            if (r2 != r3) goto L_0x0456
            r4 = 2
            r7 = 27
            r9 = 0
            goto L_0x0371
        L_0x0456:
            av7 r2 = r6.b
            boolean r3 = r2.h
            java.lang.Object r4 = r14.b
            android.content.Context r4 = (android.content.Context) r4
            st7 r5 = r0.e
            if (r3 == 0) goto L_0x048b
            long r7 = r2.b
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x046b
            goto L_0x048d
        L_0x046b:
            r5.getClass()
            ot7 r3 = new ot7
            ev7 r11 = r2.d
            boolean r2 = r2.k
            r23 = r3
            r24 = r5
            r25 = r7
            r27 = r11
            r28 = r2
            r29 = r4
            r23.<init>(r24, r25, r27, r28, r29)
            n73 r2 = new n73
            r4 = 2
            r2.<init>(r4, r3)
            r4 = 2
            goto L_0x049f
        L_0x048b:
            r9 = 0
        L_0x048d:
            r5.getClass()
            xz r3 = new xz
            ev7 r2 = r2.d
            r7 = 14
            r3.<init>((java.lang.Object) r5, (java.lang.Object) r2, (java.lang.Object) r4, (int) r7)
            n73 r2 = new n73
            r4 = 2
            r2.<init>(r4, r3)
        L_0x049f:
            qmc r3 = r0.f
            ov9 r2 = r2.r(r3)
            qmc r3 = de.a()
            nu9 r2 = r2.n(r3)
            rgc r3 = new rgc
            r5 = 9
            r3.<init>(r5, r6)
            pv0 r5 = new pv0
            r7 = 27
            r5.<init>(r7)
            z26 r8 = z3d.i
            c97 r11 = new c97
            r11.<init>(r3, r5, r8)
            r2.a(r11)
            r6.c = r11
            goto L_0x0371
        L_0x04c9:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x04d0:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x04d7:
            java.util.Collection r0 = r4.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x04df:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0516
            java.lang.Object r1 = r0.next()
            sh0 r1 = (defpackage.sh0) r1
            java.util.Iterator r2 = r20.iterator()
        L_0x04ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0506
            java.lang.Object r3 = r2.next()
            av7 r3 = (defpackage.av7) r3
            long r3 = r3.c
            av7 r6 = r1.b
            long r6 = r6.c
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x04ef
            goto L_0x04df
        L_0x0506:
            r0.remove()
            xi4 r2 = r1.c
            if (r2 == 0) goto L_0x0510
            r2.f()
        L_0x0510:
            c9 r1 = r1.a
            r1.q()
            goto L_0x04df
        L_0x0516:
            hm7 r0 = r14.S0
            long r1 = r0.h
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x0525
            nt7 r0 = r14.O0
            r0.a()
            goto L_0x06ed
        L_0x0525:
            r1 = r20
            av7 r0 = r0.a(r1)
            if (r0 == 0) goto L_0x06e8
            boolean r1 = r0.h
            if (r1 == 0) goto L_0x06e8
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x06e8
            dm7 r0 = r0.a
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x053f
            goto L_0x06e8
        L_0x053f:
            java.lang.Object r1 = r14.c
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            r7e r2 = defpackage.wce.a0
            wce r1 = fja.E(r1)
            nt7 r2 = r14.O0
            float r3 = r0.o
            double r3 = (double) r3
            int r6 = r1.k
            r7 = 1036831949(0x3dcccccd, float:0.1)
            int r6 = n1g.c0(r6, r7)
            int r5 = defpackage.zg4.a(r5)
            float r5 = (float) r5
            gvf r7 = r2.s
            double r8 = r0.a
            double r10 = r0.b
            int r0 = r1.k
            r1 = 0
            if (r7 != 0) goto L_0x05e5
            j67 r7 = r2.m
            java.lang.Object r7 = r7.b()
            ny2 r7 = (defpackage.ny2) r7
            com.google.android.gms.maps.model.LatLng r14 = new com.google.android.gms.maps.model.LatLng
            r14.<init>(r8, r10)
            my2 r7 = r7.a
            r7.getClass()
            r7.a = r14
            r8 = 0
            r7.w0 = r8
            r7.X = r6
            r7.b = r3
            r7.o = r0
            r7.c = r5
            r0 = 1
            r7.Z = r0
            r7.Y = r1
            mod r0 = r2.d
            r0.getClass()
            java.lang.Object r0 = r0.b
            qe4 r0 = (qe4) r0
            r0.getClass()
            ly2 r1 = new ly2     // Catch:{ RemoteException -> 0x05de }
            java.lang.Object r0 = r0.b     // Catch:{ RemoteException -> 0x05de }
            x3g r0 = (x3g) r0     // Catch:{ RemoteException -> 0x05de }
            android.os.Parcel r3 = r0.G0()     // Catch:{ RemoteException -> 0x05de }
            u1g.b(r3, r7)     // Catch:{ RemoteException -> 0x05de }
            r4 = 35
            android.os.Parcel r0 = r0.R(r3, r4)     // Catch:{ RemoteException -> 0x05de }
            android.os.IBinder r3 = r0.readStrongBinder()     // Catch:{ RemoteException -> 0x05de }
            int r4 = c5g.d     // Catch:{ RemoteException -> 0x05de }
            if (r3 != 0) goto L_0x05b8
            r13 = 0
            goto L_0x05cd
        L_0x05b8:
            java.lang.String r4 = "com.google.android.gms.maps.model.internal.ICircleDelegate"
            android.os.IInterface r5 = r3.queryLocalInterface(r4)     // Catch:{ RemoteException -> 0x05de }
            boolean r6 = r5 instanceof i5g     // Catch:{ RemoteException -> 0x05de }
            if (r6 == 0) goto L_0x05c6
            r13 = r5
            i5g r13 = (i5g) r13     // Catch:{ RemoteException -> 0x05de }
            goto L_0x05cd
        L_0x05c6:
            z4g r5 = new z4g     // Catch:{ RemoteException -> 0x05de }
            r6 = 3
            r5.<init>(r3, r4, r6)     // Catch:{ RemoteException -> 0x05de }
            r13 = r5
        L_0x05cd:
            r0.recycle()     // Catch:{ RemoteException -> 0x05de }
            r1.<init>(r13)     // Catch:{ RemoteException -> 0x05de }
            gvf r0 = new gvf
            r3 = 8
            r0.<init>(r3, r1)
            r2.s = r0
            goto L_0x06ed
        L_0x05de:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x05e5:
            com.google.android.gms.maps.model.LatLng r14 = new com.google.android.gms.maps.model.LatLng
            r14.<init>(r8, r10)
            java.lang.Object r7 = r7.b
            ly2 r7 = (ly2) r7
            r7.getClass()
            i5g r7 = r7.a     // Catch:{ RemoteException -> 0x06e1 }
            z4g r7 = (z4g) r7     // Catch:{ RemoteException -> 0x06e1 }
            android.os.Parcel r8 = r7.G0()     // Catch:{ RemoteException -> 0x06e1 }
            u1g.b(r8, r14)     // Catch:{ RemoteException -> 0x06e1 }
            r9 = 3
            r7.H0(r8, r9)     // Catch:{ RemoteException -> 0x06e1 }
            gvf r7 = r2.s
            java.lang.Object r7 = r7.b
            ly2 r7 = (ly2) r7
            r7.getClass()
            i5g r7 = r7.a     // Catch:{ RemoteException -> 0x06da }
            z4g r7 = (z4g) r7     // Catch:{ RemoteException -> 0x06da }
            android.os.Parcel r8 = r7.G0()     // Catch:{ RemoteException -> 0x06da }
            r9 = 0
            r8.writeInt(r9)     // Catch:{ RemoteException -> 0x06da }
            r9 = 19
            r7.H0(r8, r9)     // Catch:{ RemoteException -> 0x06da }
            gvf r7 = r2.s
            java.lang.Object r7 = r7.b
            ly2 r7 = (ly2) r7
            r7.getClass()
            i5g r7 = r7.a     // Catch:{ RemoteException -> 0x06d3 }
            z4g r7 = (z4g) r7     // Catch:{ RemoteException -> 0x06d3 }
            android.os.Parcel r8 = r7.G0()     // Catch:{ RemoteException -> 0x06d3 }
            r8.writeInt(r6)     // Catch:{ RemoteException -> 0x06d3 }
            r6 = 11
            r7.H0(r8, r6)     // Catch:{ RemoteException -> 0x06d3 }
            gvf r6 = r2.s
            java.lang.Object r6 = r6.b
            ly2 r6 = (ly2) r6
            r6.getClass()
            i5g r6 = r6.a     // Catch:{ RemoteException -> 0x06cc }
            z4g r6 = (z4g) r6     // Catch:{ RemoteException -> 0x06cc }
            android.os.Parcel r7 = r6.G0()     // Catch:{ RemoteException -> 0x06cc }
            r7.writeDouble(r3)     // Catch:{ RemoteException -> 0x06cc }
            r3 = 5
            r6.H0(r7, r3)     // Catch:{ RemoteException -> 0x06cc }
            gvf r3 = r2.s
            java.lang.Object r3 = r3.b
            ly2 r3 = (ly2) r3
            r3.getClass()
            i5g r3 = r3.a     // Catch:{ RemoteException -> 0x06c5 }
            z4g r3 = (z4g) r3     // Catch:{ RemoteException -> 0x06c5 }
            android.os.Parcel r4 = r3.G0()     // Catch:{ RemoteException -> 0x06c5 }
            r4.writeInt(r0)     // Catch:{ RemoteException -> 0x06c5 }
            r0 = 9
            r3.H0(r4, r0)     // Catch:{ RemoteException -> 0x06c5 }
            gvf r0 = r2.s
            java.lang.Object r0 = r0.b
            ly2 r0 = (ly2) r0
            r0.getClass()
            i5g r0 = r0.a     // Catch:{ RemoteException -> 0x06be }
            z4g r0 = (z4g) r0     // Catch:{ RemoteException -> 0x06be }
            android.os.Parcel r3 = r0.G0()     // Catch:{ RemoteException -> 0x06be }
            r3.writeFloat(r5)     // Catch:{ RemoteException -> 0x06be }
            r4 = 7
            r0.H0(r3, r4)     // Catch:{ RemoteException -> 0x06be }
            gvf r0 = r2.s
            java.lang.Object r0 = r0.b
            ly2 r0 = (ly2) r0
            r0.getClass()
            i5g r0 = r0.a     // Catch:{ RemoteException -> 0x06b7 }
            z4g r0 = (z4g) r0     // Catch:{ RemoteException -> 0x06b7 }
            android.os.Parcel r3 = r0.G0()     // Catch:{ RemoteException -> 0x06b7 }
            r4 = 1
            r3.writeInt(r4)     // Catch:{ RemoteException -> 0x06b7 }
            r4 = 15
            r0.H0(r3, r4)     // Catch:{ RemoteException -> 0x06b7 }
            gvf r0 = r2.s
            java.lang.Object r0 = r0.b
            ly2 r0 = (ly2) r0
            r0.getClass()
            i5g r0 = r0.a     // Catch:{ RemoteException -> 0x06b0 }
            z4g r0 = (z4g) r0     // Catch:{ RemoteException -> 0x06b0 }
            android.os.Parcel r2 = r0.G0()     // Catch:{ RemoteException -> 0x06b0 }
            r2.writeFloat(r1)     // Catch:{ RemoteException -> 0x06b0 }
            r1 = 13
            r0.H0(r2, r1)     // Catch:{ RemoteException -> 0x06b0 }
            goto L_0x06ed
        L_0x06b0:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06b7:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06be:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06c5:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06cc:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06d3:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06da:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06e1:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06e8:
            nt7 r0 = r14.O0
            r0.a()
        L_0x06ed:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r21
            long r1 = java.lang.Math.abs(r1)
            long r0 = r0.toMillis(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "bindMarkers takes %dms"
            r2 = r16
            udd.p(r2, r1, r0)
        L_0x070c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.e2():void");
    }

    public final void f2() {
        hm7 hm7;
        av7 av7 = this.I0;
        ef9 ef9 = ((af9) ((ge9) this.b)).N0;
        if (ef9 != null && (hm7 = ef9.A0) != null && hm7.d == 2) {
            boolean z = av7.i;
            Context context = (Context) ef9.b;
            if (z) {
                ef9.x0.setSubtitle(context.getString(cic.s0));
                return;
            }
            String str = av7.f;
            if (r1g.p(str)) {
                ef9.x0.setSubtitle(context.getString(cic.c3));
            } else {
                ef9.x0.setSubtitle(str);
            }
        }
    }

    public final void g2(long j) {
        av7 av7;
        tic.b(this.O0);
        udd.p("be9", "Update track for message %d", new Object[]{Long.valueOf(j)});
        if (this.G0.d == 1) {
            ConcurrentHashMap concurrentHashMap = this.c;
            av7 av72 = (av7) concurrentHashMap.get(Long.valueOf(j));
            if (av72 != null && av72.h) {
                List list = (List) this.o.get(Long.valueOf(j));
                if (list == null) {
                    list = Collections.emptyList();
                }
                ((af9) ((ge9) this.b)).C(list, av72.k);
                hm7 hm7 = this.G0;
                if (!(hm7.o == -1 || (av7 = (av7) concurrentHashMap.get(Long.valueOf(hm7.h))) == null)) {
                    this.L0.c(av7);
                }
                udd.p("be9", "Update track for message %d: load track", new Object[]{Long.valueOf(j)});
                this.w0.getClass();
                hx7 hx7 = hx7.a;
                mbe mbe = this.D0;
                mbe.getClass();
                vx7 f = hx7.h(((nbe) mbe).a()).f(de.a());
                bx7 bx7 = new bx7(new b52((Object) this, j, (Object) av72, 9), new f00(j, 25), new f95(j, 6));
                f.a(bx7);
                this.O0 = bx7;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [zed, java.lang.Object] */
    public final void h2(yd9 yd9) {
        int i;
        af9 af9 = (af9) ((ge9) this.b);
        hm7 hm7 = this.G0;
        hm7 hm72 = af9.S0;
        af9.S0 = hm7;
        tg tgVar = af9.z0;
        if (tgVar.h()) {
            kre kre = new kre();
            kre.T(new cre());
            kre.V(200);
            kre.w0 = cre.p(kre.w0, yqb.layout_contact_location__rv_markers);
            kre.q(yqb.frg_location_map__top_no_permission_panel_anchor);
            if (hm72 == null || (((i = hm72.d) == 1 && hm7.d == 3) || (i == 3 && hm7.d == 1))) {
                fdf fdf = new fdf();
                fdf.X0 = mjd.a1;
                ? obj = new Object();
                obj.a = 3.0f;
                obj.b = 80;
                fdf.M0 = obj;
                kre.T(fdf);
            } else {
                kre.T(new fdf());
            }
            if (yd9 != null) {
                kre.R(new ei0(0, yd9));
            }
            ire.b((ViewGroup) ((View) af9.c));
            ire.a((ViewGroup) ((View) af9.c), kre);
        }
        hm7 hm73 = af9.S0;
        int t = hr1.t(hm73.d);
        if (t == 0) {
            View view = (View) af9.N0.c;
            if (view != null) {
                view.setVisibility(8);
            }
            af9.H0.setVisibility(8);
        } else if (t == 1) {
            ef9 ef9 = af9.N0;
            if (((View) ef9.c) == null) {
                int i2 = ef9.C0;
                ViewStub viewStub = af9.M0;
                viewStub.setLayoutResource(i2);
                ef9.c = viewStub.inflate();
                ef9.n();
                af9.N0.t(af9);
            }
            ((View) af9.N0.c).setVisibility(0);
            af9.N0.A(hm73);
            af9.H0.setVisibility(0);
        } else if (t == 2) {
            ef9 ef92 = af9.N0;
            if (((View) ef92.c) == null) {
                int i3 = ef9.C0;
                ViewStub viewStub2 = af9.M0;
                viewStub2.setLayoutResource(i3);
                ef92.c = viewStub2.inflate();
                ef92.n();
                af9.N0.t(af9);
            }
            ((View) af9.N0.c).setVisibility(0);
            af9.N0.A(hm73);
            af9.H0.setVisibility(8);
        }
        boolean z = af9.S0.j;
        af9.C0.e();
        hm7 hm74 = af9.S0;
        boolean z2 = hm74.m;
        if (hm74.f) {
            boolean z3 = hm74.g;
        }
        if ((!tgVar.h()) && yd9 != null) {
            be9 be9 = yd9.b;
            be9.c.remove(0L);
            be9.e2();
        }
    }

    public final void p1(dm7 dm7) {
        nt7 nt7;
        boolean a = this.H0.a();
        ge9 ge9 = (ge9) this.b;
        if (!a) {
            af9 af9 = (af9) ge9;
            nt7 nt72 = af9.O0;
            if (nt72 != null) {
                nt72.g((Context) af9.b, true);
            }
            if (!(this.G0.d == 1 || (nt7 = af9.O0) == null)) {
                Float valueOf = Float.valueOf(14.0f);
                Float valueOf2 = Float.valueOf(0.0f);
                Float valueOf3 = Float.valueOf(0.0f);
                nt7.d(dm7.a, dm7.b, valueOf, valueOf2, valueOf3);
            }
        }
        if (this.G0.d != 1 && this.J0 && this.H0.a()) {
            ((af9) ge9).B(dm7.a, dm7.b, false);
        }
        if (this.G0.d == 3) {
            ConcurrentHashMap concurrentHashMap = this.c;
            av7 av7 = (av7) concurrentHashMap.get(0L);
            if (av7 != null) {
                zu7 a2 = av7.a();
                a2.a = dm7;
                concurrentHashMap.put(Long.valueOf(av7.c), new av7(a2));
            } else {
                zu7 zu7 = new zu7(dm7);
                zu7.b = this.x0;
                zu7.h = true;
                zu7.e = this.z0;
                zu7.d = ev7.c;
                zu7.k = true;
                concurrentHashMap.put(0L, zu7.a());
            }
            e2();
        }
        if (this.G0.d == 2 && this.J0) {
            zu7 a3 = this.I0.a();
            a3.a = dm7;
            this.I0 = new av7(a3);
        }
        dm7 dm72 = this.H0;
        double d = dm72.a;
        if (!((od) this.Z).f(dm7.a, dm7.b, d, dm72.b)) {
            d2();
        }
        this.H0 = dm7;
        if (!this.I0.a.a()) {
            double[] D = ((af9) ge9).D();
            zu7 a4 = this.I0.a();
            a4.a = new dm7(D[0], D[1]);
            this.I0 = new av7(a4);
            if (this.G0.d == 2) {
                d2();
            }
        }
    }
}
