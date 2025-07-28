package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.tamtam.util.HandledException;

/* renamed from: mn8  reason: default package */
public class mn8 extends ViewGroup implements GestureDetector.OnGestureListener, ty, q77, ed9, vz {
    public static final Drawable Z0 = js.q(zhc.d0, -1, vl.o);
    public static final int a1 = ((int) vl.o.getResources().getDimension(mmb.attach_drawable));
    public static final float b1 = vl.o.getResources().getDimension(mmb.divider_item_collage);
    public jj7 A0;
    public o10 B0;
    public xm8 C0;
    public in8 D0;
    public x3a E0;
    public u2 F0;
    public o10 G0;
    public TextPaint H0;
    public Paint I0;
    public TextPaint J0;
    public Paint K0;
    public boolean L0;
    public boolean M0;
    public boolean N0 = true;
    public View O0;
    public Drawable P0;
    public r10 Q0;
    public hy R0;
    public lhd S0;
    public i22 T0;
    public boolean U0;
    public byc V0;
    public Drawable W0;
    public final ajb X0 = new ajb();
    public c97 Y0;
    public k93 a;
    public zg4 b;
    public int c;
    public final xp0 o = new xp0();
    public mg5 w0;
    public float[] x0;
    public List y0;
    public int z0 = 0;

    public mn8(Context context) {
        super(context);
        z();
    }

    public static boolean G(o10 o10, o10 o102) {
        g10 g10;
        g10 g102 = o102.n;
        g10 g103 = o10.n;
        return (g102 != g103 && !g103.c()) || (o10.f() && !TextUtils.isEmpty(o10.b.x0) && o102.n != (g10 = o10.n) && g10.c());
    }

    private float[] getCornersForVideo() {
        float[] w = w(0);
        if (w != null) {
            for (int i = 0; i < w.length; i++) {
                float f = w[i];
                if (f > 0.0f) {
                    w[i] = f - ((float) this.b.a);
                }
            }
        }
        return w;
    }

    public static void l(y66 y66, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        float f;
        float f2;
        vl vlVar = vl.o;
        zg4.b();
        float b2 = (float) dh4.b((int) 11.0f);
        float f3 = 0.0f;
        if (i2 != 1) {
            float f4 = (i == 0 && z3 && i3 == 1) ? b2 : 0.0f;
            f2 = f4;
            if (i == 0 && z3 && f4 == 0.0f) {
                f4 = b2;
            }
            if (i == 1 && i3 > 1 && !z && z3) {
                f2 = b2;
            }
            int i4 = i2 - 1;
            if (i == i4 && i3 == 1) {
                f = b2;
                f3 = f;
            } else {
                f = 0.0f;
            }
            if (i == i4 && i3 > 1) {
                f = b2;
            }
            if (i == i2 - 2 && !z2) {
                f3 = b2;
            }
            b2 = f4;
        } else if (z3) {
            f = b2;
            f3 = f;
            f2 = f3;
        } else {
            f = b2;
            f2 = 0.0f;
            b2 = 0.0f;
            f3 = f;
        }
        pgc a2 = pgc.a(b2, f2, f, f3);
        a2.h = true;
        y66.n(a2);
    }

    /* access modifiers changed from: private */
    public void setCornersForCollage(List<r13> list) {
        for (int i = 0; i < list.size(); i++) {
            if (this.A0.u(((s13) list.get(i).get(0)).c) != null) {
                O(list, i, ((s13) list.get(i).get(0)).c);
                if (list.get(i).size() > 1 && this.A0.u(((s13) list.get(i).get(1)).c) != null) {
                    O(list, i, ((s13) list.get(i).get(1)).c);
                }
            }
        }
    }

    public final void A(int i) {
        xp0 xp0 = this.o;
        Rect bounds = (i >= ((ArrayList) xp0.b).size() || ((ArrayList) xp0.b).size() <= 1) ? null : xp0.c(i).e().getBounds();
        if (bounds != null) {
            View view = new View(getContext());
            this.O0 = view;
            view.setLeft(bounds.left);
            this.O0.setTop(bounds.top);
            this.O0.setRight(bounds.right);
            this.O0.setBottom(bounds.bottom);
            addView(this.O0);
            return;
        }
        this.O0 = this;
    }

    public final boolean B() {
        o10 a2 = this.C0.a.a(j10.y0);
        if (ete.L(a2) || ete.J(a2)) {
            return true;
        }
        return TextUtils.isEmpty(this.C0.a.w0) && this.C0.c == null && !this.L0 && !this.M0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [fe9, u2] */
    public final boolean B0(int i, KeyEvent keyEvent) {
        ? r0 = this.F0;
        if (r0 == 0) {
            return false;
        }
        return r0.B0(i, keyEvent);
    }

    public final boolean C() {
        o10 x = this.A0.x(j10.c);
        o10 x2 = this.A0.x(j10.o);
        return ((x != null && x.b.w0 > 0) || (x2 != null && x2.d.a > 0)) && this.C0.a.r();
    }

    public final boolean D(o10 o10) {
        boolean isEmpty = TextUtils.isEmpty(o10.b.y0);
        a10 a10 = o10.b;
        File n = !isEmpty ? this.w0.n(a10.y0) : null;
        if (n == null || !n.exists()) {
            n = this.w0.k(a10.w0);
        }
        return o10.n.c() && n.exists();
    }

    public final boolean E(int i) {
        return !this.A0.u(i).s && (this.A0.u(i).a == j10.c || this.A0.u(i).a == j10.o);
    }

    public final boolean F(o10 o10) {
        if ((this.A0.v() <= 1 && this.N0 && !this.C0.a.r()) || this.D0 == null) {
            return false;
        }
        A(u(o10));
        this.D0.getClass();
        return true;
    }

    public final void H() {
    }

    public final boolean I() {
        return (!this.a.k().p() || this.C0 == null || this.a.e().B(this.C0.a.x0) == null) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [fe9, u2] */
    /* JADX WARNING: type inference failed for: r0v5, types: [fe9, u2] */
    public final void J() {
        if (this.F0 != null) {
            if (this.A0.v() == 1) {
                this.F0.u1().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            } else {
                this.F0.u1().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824));
            }
        }
    }

    public final void L(int i) {
        if (this.D0 != null) {
            A(i);
            o10 u = this.A0.u(i);
            if (this.A0.v() != 1 || !u.i()) {
                in8 in8 = this.D0;
                this.A0.u(i);
                in8.getClass();
                return;
            }
            d(u);
        }
    }

    public final void M() {
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [fe9, u2] */
    /* JADX WARNING: type inference failed for: r0v3, types: [fe9, u2] */
    public final void N() {
        if (this.F0 != null) {
            udd.q("mn8", "removeVideoView: ");
            this.F0.l1(false);
            removeView(this.F0.u1());
            this.F0 = null;
            R();
            this.B0 = null;
            this.G0 = null;
            requestLayout();
        }
    }

    public final void O(List list, int i, int i2) {
        y66 y66 = t(this.C0, i2, this.A0.u(i2)).o;
        y66.getClass();
        l(y66, i2, this.A0.v(), ((r13) list.get(i)).size(), ((r13) list.get(0)).size() == 1, ((r13) list.get(list.size() - 1)).size() == 1, B());
    }

    public final void Q(o10 o10, vy vyVar, boolean z) {
        gn4 gn4 = vyVar.X;
        boolean T = ete.T(o10, this.C0);
        this.U0 = T;
        boolean z2 = true;
        ywa c2 = vyVar.Z.c(gn4, z, true, T);
        Context context = getContext();
        jj7 jj7 = this.A0;
        if (jj7 == null || (jj7.v() <= 1 && swb.D(vl.o) != vf4.c)) {
            z2 = false;
        }
        z3d.d(context, o10, c2, z2, false);
        if (o10.a == j10.c || ete.J(o10)) {
            c2.h = new kn8(this, this.C0, o10);
        } else {
            this.U0 = false;
        }
        if (this.C0.a.r()) {
            po0 a2 = vl.b().a(9, 10);
            tr6 tr6 = (tr6) c2.e;
            if (tr6 != null) {
                ur6 b2 = ur6.b(tr6);
                b2.l = a2;
                c2.e = b2.a();
            }
            c2.j = false;
        }
        vyVar.i(c2.a());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v4, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v5, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    public final void R() {
        int u;
        o10 o10 = this.B0;
        if (o10 != null && (u = u(o10)) >= 0) {
            uy uyVar = this.o.c(u).Z;
            uyVar.o = true;
            ? r0 = uyVar.m;
            if (r0 != 0) {
                r0.setVisibility(0);
            }
            ? r02 = uyVar.n;
            if (r02 != 0) {
                r02.setVisibility(0);
            }
            if (uyVar.s != null && ete.a0(vl.b().n(), uyVar.i)) {
                uyVar.s.setVisibility(0);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [fe9, u2] */
    public final void S() {
        if (this.F0 != null) {
            udd.q("mn8", "switchVideoToFullScreen");
            this.F0.X0();
            at7.Q(new hn8(this, 1), this.a.c().a.b());
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [fe9, u2] */
    public final void T() {
        if (this.F0 != null) {
            if (!I()) {
                ? r0 = this.F0;
                if ((r0 instanceof fd9) && !r0.D0.a) {
                    r0.k1(true);
                    return;
                }
            }
            S();
        }
    }

    public final void U(xm8 xm8, o10 o10, g10 g10, boolean z) {
        if (u(o10) >= 0) {
            xm8 u = this.a.l().u(xm8.a, o10.q, g10);
            if (z) {
                n(u);
            }
        }
    }

    public final void W() {
        int u = this.A0.v() == 1 ? 0 : u(this.B0);
        in8 in8 = this.D0;
        this.A0.u(u);
        in8.getClass();
    }

    public final void X() {
        post(new hn8(this, 1));
    }

    public final void Y(Throwable th) {
        N();
        a06.H(0, getContext(), che.b(getContext(), th));
    }

    public final void a(o10 o10) {
        U(this.C0, o10, g10.b, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.o10 r8) {
        /*
            r7 = this;
            boolean r0 = r7.U0
            if (r0 == 0) goto L_0x001e
            k93 r0 = r7.a
            o2a r0 = (o2a) r0
            to8 r0 = r0.l()
            xm8 r7 = r7.C0
            vo8 r7 = r7.a
            r0.getClass()
            java.lang.String r8 = r8.q
            cz0 r1 = new cz0
            r1.<init>()
            r0.t(r7, r8, r1)
            return
        L_0x001e:
            int r0 = r7.u(r8)
            if (r0 < 0) goto L_0x0127
            xp0 r1 = r7.o
            java.lang.Object r2 = r1.b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x0127
            a10 r2 = r8.b
            java.lang.String r2 = r2.x0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            r4 = 0
            java.lang.String r5 = r8.r
            if (r2 != 0) goto L_0x004c
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x004c
            android.graphics.drawable.Animatable r2 = r7.s(r0)
            if (r2 != 0) goto L_0x004c
            r2 = r3
            goto L_0x004d
        L_0x004c:
            r2 = r4
        L_0x004d:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x005f
            int r6 = lp.i
            java.lang.String r6 = ".mp4"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x005f
            r5 = r3
            goto L_0x0060
        L_0x005f:
            r5 = r4
        L_0x0060:
            if (r2 != 0) goto L_0x00c2
            if (r5 == 0) goto L_0x0065
            goto L_0x00c2
        L_0x0065:
            android.graphics.drawable.Animatable r8 = r7.s(r0)
            mn4 r1 = r1.c(r0)
            if (r8 == 0) goto L_0x00b6
            boolean r2 = r8.isRunning()
            if (r2 == 0) goto L_0x00b1
            r8.stop()
            r8 = r1
            vy r8 = (defpackage.vy) r8
            uy r8 = r8.Z
            float[] r2 = r7.getCornersForVideo()
            r8.u = r2
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r8.s
            if (r3 != 0) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            r3.setCorners(r2)
        L_0x008b:
            jj7 r2 = r7.A0
            o10 r2 = r2.u(r0)
            xm8 r3 = r7.C0
            i22 r5 = r7.T0
            r8.f(r2, r3, r5)
            ln4 r2 = r1.o
            r2.getClass()
            y66 r2 = (y66) r2
            jlc r3 = jlc.g
            r8.a(r2, r3)
            jj7 r8 = r7.A0
            o10 r8 = r8.u(r0)
            vy r1 = (defpackage.vy) r1
            r7.Q(r8, r1, r4)
            goto L_0x0127
        L_0x00b1:
            r8.start()
            goto L_0x0127
        L_0x00b6:
            jj7 r8 = r7.A0
            o10 r8 = r8.u(r0)
            vy r1 = (defpackage.vy) r1
            r7.Q(r8, r1, r3)
            goto L_0x0127
        L_0x00c2:
            xm8 r0 = r7.C0
            vo8 r0 = r0.a
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x00d2
            in8 r7 = r7.D0
            r7.getClass()
            goto L_0x0127
        L_0x00d2:
            boolean r0 = r7.D(r8)
            if (r0 == 0) goto L_0x0124
            boolean r0 = r7.F(r8)
            if (r0 != 0) goto L_0x0127
            boolean r0 = r8.s
            if (r0 == 0) goto L_0x00e3
            goto L_0x0127
        L_0x00e3:
            r7.N()
            bf9 r0 = new bf9
            android.content.Context r1 = r7.getContext()
            float[] r2 = r7.getCornersForVideo()
            r0.<init>(r1, r2)
            kd9 r1 = new kd9
            mg5 r2 = r7.w0
            r3 = 0
            r1.<init>(r0, r3, r2, r7)
            r7.F0 = r1
            android.view.View r0 = r1.u1()
            r7.addView(r0)
            r7.G0 = r8
            u2 r7 = r7.F0
            kd9 r7 = (defpackage.kd9) r7
            d96 r0 = new d96
            bf5 r1 = r7.o
            r0.<init>(r1, r8)
            r7.Y = r0
            q98 r8 = r7.c
            al7 r8 = (defpackage.al7) r8
            r8.r(r0, r7)
            java.lang.Object r8 = r7.b
            ge9 r8 = (defpackage.ge9) r8
            lf9 r8 = (defpackage.lf9) r8
            r8.b(r7)
            goto L_0x0127
        L_0x0124:
            r7.o(r8)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn8.b(o10):void");
    }

    public final void c(o10 o10) {
        if (!o10.n.e()) {
            U(this.C0, o10, g10.a, true);
            return;
        }
        int u = u(o10);
        if (u >= 0) {
            xp0 xp0 = this.o;
            if (((ArrayList) xp0.b).size() > u) {
                Q(o10, xp0.c(u), true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v51, types: [fe9, u2] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (android.text.TextUtils.equals(r15.q, r14.B0.q) != false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.o10 r18) {
        /*
            r17 = this;
            r14 = r17
            r15 = r18
            o10 r0 = r14.B0
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r0 = r17.F(r18)
            if (r0 != 0) goto L_0x0032
            boolean r0 = r15.s
            if (r0 == 0) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            j2b r0 = r0.n()
            boolean r1 = ete.L(r18)
            n10 r2 = r15.d
            v00 r3 = r15.j
            if (r1 == 0) goto L_0x002b
            o10 r1 = r3.d
            n10 r1 = r1.d
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            boolean r0 = ete.O(r0, r1)
            if (r0 == 0) goto L_0x0035
        L_0x0032:
            r7 = r15
            goto L_0x012d
        L_0x0035:
            o10 r0 = r14.B0
            if (r0 == 0) goto L_0x0050
            u2 r0 = r14.F0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0050
            o10 r0 = r14.B0
            java.lang.String r0 = r0.q
            java.lang.String r1 = r15.q
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0050
            goto L_0x0032
        L_0x0050:
            r17.N()
            boolean r0 = ete.L(r18)
            if (r0 == 0) goto L_0x005d
            o10 r0 = r3.d
            n10 r2 = r0.d
        L_0x005d:
            boolean r0 = r17.I()
            if (r0 == 0) goto L_0x007e
            boolean r0 = r2.o
            if (r0 != 0) goto L_0x007e
            ie9 r0 = new ie9
            android.content.Context r1 = r17.getContext()
            k93 r2 = r14.a
            o2a r2 = (o2a) r2
            tg r2 = r2.c()
            float[] r3 = r17.getCornersForVideo()
            r0.<init>(r1, r2, r3)
        L_0x007c:
            r1 = r0
            goto L_0x0094
        L_0x007e:
            gf9 r0 = new gf9
            android.content.Context r1 = r17.getContext()
            k93 r2 = r14.a
            o2a r2 = (o2a) r2
            tg r2 = r2.c()
            float[] r3 = r17.getCornersForVideo()
            r0.<init>(r1, r2, r3)
            goto L_0x007c
        L_0x0094:
            fd9 r13 = new fd9
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            l8f r3 = r0.s()
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            mbe r4 = r0.q()
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            w4 r0 = r0.getAccessor()
            java.lang.Class<oa7> r2 = oa7.class
            java.lang.Object r0 = r0.c(r2)
            r5 = r0
            oa7 r5 = (oa7) r5
            r10 r6 = r14.Q0
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            to8 r7 = r0.l()
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            j2b r8 = r0.n()
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            g15 r10 = r0.g()
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            tf4 r11 = r0.f()
            r2 = 0
            r12 = 1
            r16 = 0
            r0 = r13
            r9 = r17
            r15 = r13
            r13 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.F0 = r15
            android.view.View r0 = r15.u1()
            r14.addView(r0)
            r7 = r18
            r14.B0 = r7
            r14.G0 = r7
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            t52 r0 = r0.e()
            xm8 r1 = r14.C0
            vo8 r1 = r1.a
            long r1 = r1.x0
            i22 r0 = r0.B(r1)
            r14.T0 = r0
            if (r0 == 0) goto L_0x0111
            o62 r0 = r0.b
            long r0 = r0.a
        L_0x010f:
            r2 = r0
            goto L_0x0114
        L_0x0111:
            r0 = 0
            goto L_0x010f
        L_0x0114:
            boolean r0 = r17.I()
            if (r0 == 0) goto L_0x011d
            r0 = 3
        L_0x011b:
            r5 = r0
            goto L_0x011f
        L_0x011d:
            r0 = 2
            goto L_0x011b
        L_0x011f:
            u2 r0 = r14.F0
            fd9 r0 = (defpackage.fd9) r0
            xm8 r1 = r14.C0
            vo8 r4 = r1.a
            r6 = 1
            r1 = r18
            r0.Z1(r1, r2, r4, r5, r6)
        L_0x012d:
            boolean r0 = r17.I()
            if (r0 == 0) goto L_0x014f
            k93 r0 = r14.a
            o2a r0 = (o2a) r0
            to8 r0 = r0.l()
            xm8 r1 = r14.C0
            vo8 r1 = r1.a
            r0.getClass()
            java.lang.String r2 = r7.q
            cz0 r3 = new cz0
            r4 = 0
            r5 = 11
            r3.<init>(r4, r5)
            r0.t(r1, r2, r3)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn8.d(o10):void");
    }

    public final void e(o10 o10, xm8 xm8) {
        this.a.p().getClass();
        nqc nqc = (nqc) oae.b();
        to8 n = nqc.n();
        n.getClass();
        tic.a(new oo8(n, xm8, o10.q, (zs8) nqc.getAccessor().c(zs8.class)), n.h, (j6) null, new be8(13), (qmc) null);
    }

    public final void g(String str) {
        N();
        swb.I(getContext(), str);
    }

    public List<View> getClickableChildren() {
        return myc.U(myc.L(pfa.o(this), new xz6(16)));
    }

    public final void j() {
        invalidate();
    }

    public final boolean k(o10 o10) {
        int u = u(o10);
        if (u < 0) {
            return false;
        }
        xp0 xp0 = this.o;
        return ((ArrayList) xp0.b).size() > u && xp0.c(u).X != null && xp0.c(u).X.c() != null && xp0.c(u).X.c().isRunning();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [fe9, u2] */
    /* JADX WARNING: type inference failed for: r0v5, types: [fe9, u2] */
    /* JADX WARNING: type inference failed for: r1v6, types: [fe9, u2] */
    /* JADX WARNING: type inference failed for: r1v7, types: [fe9, u2] */
    /* JADX WARNING: type inference failed for: r1v8, types: [fe9, u2] */
    public final void m() {
        Context context = getContext();
        String[] strArr = urd.c;
        if (context == null ? false : Settings.canDrawOverlays(context)) {
            ? r0 = this.F0;
            if (r0 != 0 && this.B0 != null) {
                View u1 = r0.u1();
                Rect rect = mcf.a;
                mcf.d(rect, u1);
                this.F0.F1();
                this.T0 = this.a.e().B(this.C0.a.x0);
                m00 j = this.B0.j();
                urd.K(j, this.F0.k(), this.F0.c(), this.F0.c0());
                this.B0 = j.a();
                this.a.k().y0.d(getContext(), this.T0, this.C0, this.B0, rect, true);
                R();
                N();
                return;
            }
            return;
        }
        udd.s("mn8", "Pip request listener is null", (Throwable) null);
    }

    public void n(xm8 xm8) {
        float[] fArr;
        i22 i22;
        n10 n10;
        int i;
        int i2;
        a10 a10;
        sv9 t = this.X0.t(1000, TimeUnit.MILLISECONDS);
        hy5 hy5 = new hy5(26, this);
        lu7 lu7 = z3d.k;
        z26 z26 = z3d.i;
        c97 c97 = new c97(hy5, lu7, z26);
        t.a(c97);
        this.Y0 = c97;
        View view = this.O0;
        if (view != null && !view.equals(this)) {
            removeView(this.O0);
            this.O0 = null;
        }
        xm8 xm82 = this.C0;
        jj7 jj7 = xm8.a.D0;
        this.A0 = jj7;
        this.C0 = xm8;
        int v = jj7.v();
        j10 j10 = j10.o;
        if (v == 1) {
            fArr = a06.c;
        } else {
            float[] fArr2 = new float[v];
            for (int i3 = 0; i3 < v; i3++) {
                o10 u = jj7.u(i3);
                if (u != null) {
                    j10 j102 = j10.c;
                    j10 j103 = u.a;
                    float f = 1.0f;
                    if (j103 != j102 ? !(j103 != j10 || (i = (n10 = u.d).f) == 0 || (i2 = n10.e) == 0) : !((i = (a10 = u.b).o) == 0 || (i2 = a10.c) == 0)) {
                        f = ((float) i2) / ((float) i);
                    }
                    fArr2[i3] = f;
                } else {
                    fArr2[i3] = 0.0f;
                }
            }
            fArr = fArr2;
        }
        this.x0 = fArr;
        xm8 xm83 = this.C0;
        boolean z = xm82 == null || xm82.a.b != xm83.a.b || ete.d(xm82, xm83);
        if (this.A0.v() == 1) {
            o10 u2 = this.A0.u(0);
            if (u2.a == j10 || ete.L(u2)) {
                b00 b00 = this.Q0.b;
                b00.getClass();
                if (!b00.d.containsKey(u2.q)) {
                    fx7 fx7 = new fx7(new zz(b00, u2, 2));
                    mbe mbe = b00.a;
                    mbe.getClass();
                    nbe nbe = (nbe) mbe;
                    vx7 f2 = fx7.h(nbe.a()).f(nbe.b());
                    pv0 pv0 = new pv0(24);
                    bx7 bx7 = new bx7(new zz(b00, u2, 1), new a00(b00), z26);
                    Objects.requireNonNull(bx7, "observer is null");
                    try {
                        f2.a(new i73(bx7, 1, pv0));
                        b00.f.a(bx7);
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th) {
                        ek8.a0(th);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                }
                i22 B = this.a.e().B(this.C0.a.x0);
                this.T0 = B;
                if (B != null) {
                    long j = this.T0.b.a;
                    long j2 = this.C0.a.c;
                    ((q7f) this.a.getAccessor().c(q7f.class)).getClass();
                }
                this.R0.a(this.C0.a);
            }
        }
        for (int i4 = 0; i4 < this.A0.v(); i4++) {
            o10 u3 = this.A0.u(i4);
            vy t2 = t(xm8, i4, u3);
            int v2 = this.A0.v();
            jlc jlc = jlc.g;
            if (v2 == 1) {
                if (ete.L(u3)) {
                    y66 y66 = t2.o;
                    y66.getClass();
                    y66.h(jlc.j);
                } else {
                    y66 y662 = t2.o;
                    y662.getClass();
                    y662.h(jlc);
                }
                y66 y663 = t2.o;
                y663.getClass();
                l(y663, i4, this.A0.v(), 1, false, false, B());
            } else {
                y66 y664 = t2.o;
                y664.getClass();
                y664.h(jlc);
            }
            i22 B2 = this.a.e().B(this.C0.a.x0);
            boolean z2 = (B2 == null || xm82 == null || ete.T(u3, this.C0) == ete.T(xm82.a.D0.u(i4), this.C0)) ? false : true;
            boolean z3 = (B2 == null || (i22 = this.T0) == null || !i22.J() || this.T0.k().a.c.k == B2.k().a.c.k) ? false : true;
            this.T0 = B2;
            if (z3 || z2 || z || xm82 == null || G(u3, xm82.a.D0.u(i4))) {
                Q(u3, t2, false);
            }
        }
        List list = this.y0;
        if (list == null) {
            this.y0 = new ArrayList();
        } else {
            list.clear();
        }
        if (z) {
            N();
            this.a.p().getClass();
            if (((hb2) ((nqc) oae.b()).getAccessor().c(hb2.class)).b(true)) {
                for (int i5 = 0; i5 < this.A0.v(); i5++) {
                    o10 u4 = this.A0.u(i5);
                    boolean f3 = u4.f();
                    a10 a102 = u4.b;
                    boolean z4 = f3 && !TextUtils.isEmpty(a102.y0) && this.w0.n(a102.y0).exists();
                    if (u4.f() && !TextUtils.isEmpty(a102.x0) && !z4) {
                        g10 g10 = u4.n;
                        if (g10.e() || g10.b() || !D(u4)) {
                            o(u4);
                        }
                    }
                }
            }
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [tde, java.lang.Object] */
    public final void o(o10 o10) {
        U(this.C0, o10, g10.X, true);
        ? obj = new Object();
        obj.a = this.C0.a.b;
        obj.b = o10.q;
        a10 a10 = o10.b;
        obj.e = a10.w0;
        obj.g = a10.x0;
        obj.h = true;
        ((jc5) this.a.getAccessor().c(jc5.class)).a(new ude(obj));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.r();
        this.Q0.g.add(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xp0 xp0 = this.o;
        xp0.t();
        for (int i = 0; i < ((ArrayList) xp0.b).size(); i++) {
            tic.b(xp0.c(i).Z.t);
        }
        N();
        this.Q0.g.remove(this);
        c97 c97 = this.Y0;
        if (c97 != null) {
            bj4.a(c97);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onDraw(Canvas canvas) {
        String str;
        byc byc;
        Canvas canvas2 = canvas;
        int v = this.A0.v();
        xp0 xp0 = this.o;
        if (v != 1) {
            for (r13 it : this.y0) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    s13 s13 = (s13) it2.next();
                    if (this.A0.u(s13.c) != null) {
                        int i = s13.c;
                        boolean E = E(i);
                        Rect rect = s13.d;
                        if (!E) {
                            p(canvas, y(i), rect.left, rect.top, rect.right, rect.bottom, s13.c);
                        } else {
                            lfc e = xp0.c(i).e();
                            if (e != null) {
                                e.setBounds(rect.left, rect.top, rect.right, rect.bottom);
                                e.draw(canvas2);
                                boolean T = ete.T(this.A0.u(i), this.C0);
                                if (T) {
                                    int i2 = rect.left;
                                    int intrinsicWidth = this.W0.getIntrinsicWidth();
                                    int i3 = s13.a;
                                    int i4 = ((i3 - intrinsicWidth) / 2) + i2;
                                    int i5 = rect.top;
                                    int intrinsicHeight = this.W0.getIntrinsicHeight();
                                    int i6 = s13.b;
                                    this.W0.setBounds(i4, ((i6 - intrinsicHeight) / 2) + i5, rect.right - ((i3 - this.W0.getIntrinsicWidth()) / 2), rect.bottom - ((i6 - this.W0.getIntrinsicHeight()) / 2));
                                    this.W0.draw(canvas2);
                                }
                                if (!C()) {
                                    xp0.c(i).Z.b(canvas2, e.getBounds(), T);
                                }
                            }
                        }
                    }
                }
            }
        } else if (E(0) || ((!this.A0.u(0).s && ete.L(this.A0.u(0))) || (!this.A0.u(0).s && ete.J(this.A0.u(0))))) {
            lfc e2 = xp0.c(0).e();
            if (e2 != null) {
                e2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                e2.draw(canvas2);
                if (this.U0 && (byc = this.V0) != null) {
                    byc.draw(canvas2);
                }
                if (!C()) {
                    xp0.c(0).Z.b(canvas2, e2.getBounds(), this.U0);
                }
            }
        } else {
            p(canvas, y(0), 0, 0, getMeasuredWidth(), getMeasuredHeight(), 0);
        }
        if (C()) {
            if (this.K0 == null) {
                Paint paint = new Paint();
                this.K0 = paint;
                Context context = getContext();
                r7e r7e = wce.a0;
                paint.setColor(fja.E(context).r);
                this.K0.setStyle(Paint.Style.FILL);
                this.K0.setAntiAlias(true);
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            canvas2.drawCircle(f, f2, ((float) a1) / 2.0f, this.K0);
            if (this.C0.a.R0 == 0) {
                if (this.J0 == null) {
                    TextPaint textPaint = new TextPaint();
                    this.J0 = textPaint;
                    textPaint.setTextSize(getContext().getResources().getDimension(yhc.a));
                    TextPaint textPaint2 = this.J0;
                    Context context2 = getContext();
                    r7e r7e2 = wce.a0;
                    textPaint2.setColor(fja.E(context2).t);
                    this.J0.setTypeface(Typeface.DEFAULT);
                    this.J0.setTextAlign(Paint.Align.CENTER);
                    this.J0.setAntiAlias(true);
                }
                Context context3 = getContext();
                int i7 = this.C0.a.Q0;
                int i8 = che.a;
                if (i7 < 60) {
                    str = context3.getString(cic.V2);
                } else {
                    str = context3.getString(cic.U2);
                    i7 = (int) TimeUnit.SECONDS.toMinutes((long) i7);
                }
                canvas2.drawText(context3.getString(cic.W2, new Object[]{Integer.valueOf(i7), str}), f, (float) ((int) (f2 - ((this.J0.ascent() + this.J0.descent()) / 2.0f))), this.J0);
                return;
            }
            if (this.P0 == null) {
                Drawable b2 = gq3.b(getContext(), zhc.u0);
                this.P0 = b2;
                Context context4 = getContext();
                r7e r7e3 = wce.a0;
                b2.setColorFilter(fja.E(context4).t, PorterDuff.Mode.SRC_IN);
            }
            Drawable drawable = this.P0;
            if (drawable != null) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight2 = this.P0.getIntrinsicHeight() / 2;
                this.P0.setBounds(measuredWidth - intrinsicWidth2, measuredHeight - intrinsicHeight2, measuredWidth + intrinsicWidth2, measuredHeight + intrinsicHeight2);
                this.P0.draw(canvas2);
            }
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.o.r();
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [fe9, u2] */
    /* JADX WARNING: type inference failed for: r1v8, types: [fe9, u2] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.F0 != null && this.G0 != null) {
            if (this.A0.v() == 1) {
                this.F0.u1().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int u = u(this.G0);
            int i5 = (u % 2) * measuredWidth;
            int i6 = (u / 2) * measuredWidth;
            this.F0.u1().layout(i5, i6, i5 + measuredWidth, measuredWidth + i6);
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        ie6.VIRTUAL_KEY.d(this);
        if (this.D0 != null) {
            int v = this.A0.v() == 1 ? 0 : v(motionEvent);
            if (v < this.A0.v()) {
                in8 in8 = this.D0;
                this.A0.u(v);
                in8.getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            jj7 r1 = r0.A0
            if (r1 == 0) goto L_0x0245
            int r1 = r1.v()
            if (r1 != 0) goto L_0x000e
            goto L_0x0245
        L_0x000e:
            jj7 r1 = r0.A0
            int r1 = r1.v()
            r2 = 1
            xp0 r3 = r0.o
            r4 = 0
            if (r1 != r2) goto L_0x0062
            super.onMeasure(r25, r26)
            jj7 r1 = r0.A0
            o10 r1 = r1.u(r4)
            j10 r1 = r1.a
            j10 r2 = defpackage.j10.c
            if (r1 == r2) goto L_0x004d
            jj7 r1 = r0.A0
            o10 r1 = r1.u(r4)
            j10 r1 = r1.a
            j10 r2 = defpackage.j10.o
            if (r1 == r2) goto L_0x004d
            jj7 r1 = r0.A0
            o10 r1 = r1.u(r4)
            boolean r1 = ete.L(r1)
            if (r1 != 0) goto L_0x004d
            jj7 r1 = r0.A0
            o10 r1 = r1.u(r4)
            boolean r1 = ete.J(r1)
            if (r1 == 0) goto L_0x0248
        L_0x004d:
            mn4 r1 = r3.c(r4)
            vy r1 = (defpackage.vy) r1
            uy r1 = r1.Z
            int r2 = r24.getMeasuredWidth()
            int r3 = r24.getMeasuredHeight()
            r1.d(r2, r3)
            goto L_0x0248
        L_0x0062:
            int r1 = android.view.View.MeasureSpec.getSize(r25)
            int r5 = r0.z0
            int r5 = java.lang.Math.max(r5, r4)
            r0.setMeasuredDimension(r1, r5)
            java.util.List r1 = r0.y0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01fa
            float[] r1 = r0.x0
            int r5 = r24.getMeasuredWidth()
            r13 r6 = new r13
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r1[r4]
            float r5 = (float) r5
            r9 = 1058642330(0x3f19999a, float:0.6)
            float r9 = r9 * r5
            r10 = 1055286886(0x3ee66666, float:0.45)
            float r10 = r10 * r5
            float r8 = r10 / r8
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x009a
            r8 = r9
            goto L_0x009f
        L_0x009a:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x009f
            r8 = r10
        L_0x009f:
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            r11 = r4
            r12 = r11
            r13 = r12
            r15 = r13
            r14 = 0
        L_0x00a9:
            int r2 = r1.length
            float r4 = b1
            if (r12 >= r2) goto L_0x01dc
            r2 = r1[r12]
            float r2 = r2 * r8
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r17 = 0
            r18 = r1[r17]
            r19 = 1065353216(0x3f800000, float:1.0)
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 <= 0) goto L_0x00c7
            if (r12 != 0) goto L_0x00c7
            r26 = r8
            r18 = 1
            goto L_0x00cb
        L_0x00c7:
            r26 = r8
            r18 = 0
        L_0x00cb:
            int r8 = r1.length
            r16 = 1
            int r8 = r8 + -1
            r19 = r3
            if (r12 != r8) goto L_0x00d7
            r8 = r16
            goto L_0x00d8
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            if (r18 != 0) goto L_0x012a
            if (r8 == 0) goto L_0x00dd
            goto L_0x012a
        L_0x00dd:
            int r8 = r12 + 1
            int r3 = r1.length
            int r3 = r3 + -1
            if (r8 > r3) goto L_0x00fc
            r3 = r1[r12]
            r8 = r1[r8]
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00fc
            int r3 = r6.size()
            if (r3 != 0) goto L_0x00fc
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r5 / r2
        L_0x00f6:
            r8 = r26
            r18 = r5
            r3 = 0
            goto L_0x0137
        L_0x00fc:
            float r3 = r5 - r14
            float r8 = r3 - r2
            r18 = 1053609165(0x3ecccccd, float:0.4)
            float r18 = r18 * r5
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x011e
        L_0x0109:
            float r8 = r3 - r2
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x00f6
            r8 = 1063675494(0x3f666666, float:0.9)
            float r2 = r2 * r8
            int r8 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x0109
            r8 = r26
            r2 = r3
        L_0x011a:
            r18 = r5
            r3 = 1
            goto L_0x0137
        L_0x011e:
            int r3 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f6
            r8 = r26
            r2 = r18
            r3 = 0
            r18 = r5
            goto L_0x0137
        L_0x012a:
            if (r18 == 0) goto L_0x0132
            int r2 = r1.length
            r3 = 3
            if (r2 <= r3) goto L_0x0132
            r8 = r9
            goto L_0x0134
        L_0x0132:
            r8 = r26
        L_0x0134:
            float r2 = r5 - r14
            goto L_0x011a
        L_0x0137:
            int r5 = r6.size()
            r0 = 1
            if (r5 != r0) goto L_0x0143
            if (r3 != 0) goto L_0x0143
            r16 = r0
            goto L_0x0145
        L_0x0143:
            r16 = r3
        L_0x0145:
            s13 r3 = new s13
            int r5 = java.lang.Math.round(r2)
            int r0 = java.lang.Math.round(r8)
            r20 = r9
            android.graphics.Rect r9 = new android.graphics.Rect
            int r21 = java.lang.Math.round(r2)
            r22 = r10
            int r10 = r21 + r11
            int r21 = java.lang.Math.round(r8)
            r23 = r1
            int r1 = r21 + r15
            r9.<init>(r11, r15, r10, r1)
            r3.<init>(r5, r0, r12, r9)
            float r0 = r2 + r4
            int r0 = (int) r0
            int r11 = r11 + r0
            r6.add(r3)
            int r0 = r6.size()
            r1 = 3
            if (r0 != r1) goto L_0x019d
            java.util.Locale r0 = java.util.Locale.UK
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Three items in Collage in one row. PossibleWidth: %f, RowWidth: %f, ShouldCompleteRow: %b"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            r3 = 0
            java.lang.String r9 = "CollageHelper"
            udd.R(r9, r3, r0, r2)
            goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            float r0 = (float) r5
            float r0 = r0 + r4
            float r0 = r0 + r14
            if (r16 == 0) goto L_0x01ca
            float r8 = r8 + r4
            int r0 = (int) r8
            int r15 = r15 + r0
            r7.add(r6)
            int r13 = r13 + r0
            r0 = r23[r12]
            float r10 = r22 / r0
            int r0 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b5
            r10 = r20
            goto L_0x01bb
        L_0x01b5:
            int r0 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            r10 = r22
        L_0x01bb:
            int r0 = java.lang.Math.round(r10)
            float r0 = (float) r0
            r13 r2 = new r13
            r2.<init>()
            r8 = r0
            r11 = r1
            r6 = r2
            r14 = 0
            goto L_0x01cb
        L_0x01ca:
            r14 = r0
        L_0x01cb:
            int r12 = r12 + 1
            r0 = r24
            r4 = r1
            r5 = r18
            r3 = r19
            r9 = r20
            r10 = r22
            r1 = r23
            goto L_0x00a9
        L_0x01dc:
            r19 = r3
            r1 = 0
            int r0 = (int) r4
            int r13 = r13 - r0
            r0 = r24
            r0.y0 = r7
            r0.z0 = r13
            int r2 = r24.getMeasuredWidth()
            int r3 = r0.z0
            r0.setMeasuredDimension(r2, r3)
            hn8 r2 = new hn8
            r3 = 0
            r2.<init>(r0, r3)
            r0.post(r2)
            goto L_0x01fd
        L_0x01fa:
            r19 = r3
            r1 = r4
        L_0x01fd:
            r2 = r1
        L_0x01fe:
            java.util.List r3 = r0.y0
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0248
            java.util.List r3 = r0.y0
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L_0x020f:
            int r5 = r3.size()
            if (r4 >= r5) goto L_0x0240
            java.lang.Object r5 = r3.get(r4)
            s13 r5 = (defpackage.s13) r5
            int r6 = r5.c
            r7 = r19
            java.lang.Object r8 = r7.b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            if (r6 < r8) goto L_0x022a
            goto L_0x023b
        L_0x022a:
            int r6 = r5.c
            mn4 r6 = r7.c(r6)
            vy r6 = (defpackage.vy) r6
            uy r6 = r6.Z
            int r8 = r5.a
            int r5 = r5.b
            r6.d(r8, r5)
        L_0x023b:
            int r4 = r4 + 1
            r19 = r7
            goto L_0x020f
        L_0x0240:
            r7 = r19
            int r2 = r2 + 1
            goto L_0x01fe
        L_0x0245:
            super.onMeasure(r25, r26)
        L_0x0248:
            r24.J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn8.onMeasure(int, int):void");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.A0.v() != 0) {
            int v = this.A0.v() == 1 ? 0 : v(motionEvent);
            if (v < this.A0.v()) {
                xp0 xp0 = this.o;
                if (v < ((ArrayList) xp0.b).size()) {
                    lfc e = xp0.c(v).e();
                    if (!xp0.c(v).Z.e(e.getBounds().centerX(), e.getBounds().centerY(), motionEvent)) {
                        this.X0.c(Integer.valueOf(v));
                    }
                }
            }
        }
        return true;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        byc byc = this.V0;
        if (byc != null) {
            byc.setBounds(0, 0, i, i2);
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.o.t();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.E0.b).onTouchEvent(motionEvent);
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0 && this.F0 != null) {
            N();
        }
    }

    public final void p(Canvas canvas, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        Canvas canvas2 = canvas;
        String str2 = str;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        if (this.H0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.H0 = textPaint;
            textPaint.setTextSize(getContext().getResources().getDimension(yhc.c));
            this.H0.setColor(getContext().getResources().getColor(xhc.f));
            this.H0.setTypeface(Typeface.DEFAULT);
        }
        if (this.I0 == null) {
            Paint paint = new Paint(1);
            this.I0 = paint;
            paint.setColor(getContext().getResources().getColor(xhc.d));
            this.I0.setStyle(Paint.Style.FILL);
        }
        float[] w = w(i5);
        if (w == null) {
            canvas.drawRect((float) i7, (float) i8, (float) i9, (float) i10, this.I0);
        } else {
            Path path = new Path();
            path.addRoundRect((float) i7, (float) i8, (float) i9, (float) i10, w, Path.Direction.CW);
            canvas2.drawPath(path, this.I0);
        }
        int i11 = i9 - i7;
        int i12 = i11 - (this.c * 2);
        if (i12 < 0) {
            this.a.g().c(new HandledException("when draw unknown attach, width < 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i12 = i7 - i9;
        }
        if (i12 < 0) {
            this.a.g().c(new HandledException("when draw unknown attach, width < 0, return 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i6 = 0;
        } else {
            i6 = i12;
        }
        StaticLayout staticLayout = new StaticLayout(str, this.H0, i6, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i13 = this.b.x;
        Drawable drawable = Z0;
        drawable.setBounds(0, 0, i13, i13);
        int height = staticLayout.getHeight();
        zg4 zg4 = this.b;
        int i14 = (zg4.d * 2) + height + zg4.x;
        canvas.save();
        int i15 = (i11 / 2) + i;
        int i16 = ((i4 - i2) / 2) + i2;
        int i17 = i14 / 2;
        canvas2.translate((float) (i15 - (this.b.x / 2)), (float) (i16 - i17));
        drawable.draw(canvas2);
        canvas.restore();
        canvas.save();
        canvas2.translate((float) (i15 - (staticLayout.getWidth() / 2)), (float) ((i16 + i17) - staticLayout.getHeight()));
        staticLayout.draw(canvas2);
        canvas.restore();
    }

    public final void r() {
        S();
    }

    public final Animatable s(int i) {
        xp0 xp0 = this.o;
        if (((ArrayList) xp0.b).size() <= i || xp0.c(i).X == null) {
            return null;
        }
        return xp0.c(i).X.c();
    }

    public void setAttachClickListener(in8 in8) {
        this.D0 = in8;
    }

    public void setAttachVideoListener(jn8 jn8) {
    }

    public void setEmbeddedPlayer(boolean z) {
        this.N0 = z;
    }

    public void setForwarded(boolean z) {
        this.M0 = z;
    }

    public void setPipRequestListener(ln8 ln8) {
    }

    public void setSenderVisible(boolean z) {
        this.L0 = z;
    }

    public final vy t(xm8 xm8, int i, o10 o10) {
        vy x = x(i);
        uy uyVar = x.Z;
        float[] cornersForVideo = getCornersForVideo();
        uyVar.u = cornersForVideo;
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = uyVar.s;
        if (liveVideoPlaceHolderView != null) {
            liveVideoPlaceHolderView.setCorners(cornersForVideo);
        }
        x.Z.f(o10, xm8, this.T0);
        uy uyVar2 = x.Z;
        y66 y66 = x.o;
        y66.getClass();
        uyVar2.a(y66, jlc.g);
        if (C()) {
            y66 y662 = x.o;
            y662.getClass();
            y662.m(-0.1f, true);
        }
        return x;
    }

    public int u(o10 o10) {
        for (int i = 0; i < this.A0.v(); i++) {
            if (this.A0.u(i).q.equals(o10.q)) {
                return i;
            }
        }
        return -1;
    }

    public final int v(MotionEvent motionEvent) {
        if (this.y0.size() == 0) {
            return 0;
        }
        int y = (int) (motionEvent.getY() / ((float) (getMeasuredHeight() / this.y0.size())));
        if (y >= this.y0.size()) {
            udd.p("mn8", "getAttachPosition: wrong calculated row: %d", new Object[]{Integer.valueOf(y)});
            y = this.y0.size() - 1;
        }
        if (((r13) this.y0.get(y)).size() == 0) {
            return 0;
        }
        int x = (int) (motionEvent.getX() / ((float) (getMeasuredWidth() / ((r13) this.y0.get(y)).size())));
        if (x >= ((r13) this.y0.get(y)).size()) {
            udd.p("mn8", "getAttachPosition: wrong calculated column: %d", new Object[]{Integer.valueOf(x)});
            x = ((r13) this.y0.get(y)).size() - 1;
        }
        return ((s13) ((r13) this.y0.get(y)).get(x)).c;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof u10) {
            return true;
        }
        int i = 0;
        while (true) {
            xp0 xp0 = this.o;
            if (i >= ((ArrayList) xp0.b).size()) {
                return super.verifyDrawable(drawable);
            }
            if (xp0.c(i).e() == drawable) {
                return true;
            }
            i++;
        }
    }

    public final float[] w(int i) {
        if (i < 0 || ((ArrayList) this.o.b).size() <= 0) {
            return null;
        }
        y66 y66 = x(i).o;
        y66.getClass();
        pgc pgc = y66.c;
        if (pgc != null) {
            return pgc.c;
        }
        return null;
    }

    public final mn4 x(int i) {
        xp0 xp0 = this.o;
        if (((ArrayList) xp0.b).size() > i) {
            return xp0.c(i);
        }
        z66 z66 = new z66(getContext().getResources());
        z66.b = 0;
        y66 a2 = z66.a();
        getContext();
        mn4 mn4 = new mn4(a2);
        mn4.e().setCallback(this);
        mn4.Z = new uy(this, this);
        xp0.b(mn4);
        return mn4;
    }

    public final String y(int i) {
        if (!this.A0.u(i).s) {
            return getContext().getString(cic.d3);
        }
        Context context = getContext();
        o10 u = this.A0.u(i);
        int i2 = che.a;
        j10 j10 = u.a;
        return j10 == j10.o ? context.getString(cic.T) : j10 == j10.c ? context.getString(cic.S) : context.getString(cic.R);
    }

    public final void z() {
        this.a = vl.b();
        getContext();
        this.b = zg4.b();
        this.w0 = this.a.h();
        this.Q0 = this.a.d();
        this.a.p().getClass();
        this.R0 = (hy) ((nqc) oae.b()).getAccessor().c(hy.class);
        this.c = this.b.i;
        this.S0 = new lhd(26, (Object) (knc) this.a.getAccessor().c(knc.class));
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.E0 = new x3a(getContext(), this);
        this.V0 = new byc(getContext(), this.b.j);
        Drawable b2 = gq3.b(getContext(), zhc.f0);
        this.W0 = b2;
        b2.setTint(-1);
    }

    public mn8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z();
    }
}
