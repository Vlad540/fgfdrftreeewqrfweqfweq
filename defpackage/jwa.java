package defpackage;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.services.PipWorker;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* renamed from: jwa  reason: default package */
public final class jwa implements ComponentCallbacks, nj5, ed9 {
    public final fwa A0;
    public final swa B0;
    public final tt0 C0;
    public final t52 D0;
    public final g15 E0;
    public fd9 F0;
    public FloatingVideoView G0;
    public mj5 H0;
    public jd9 I0;
    public o10 J0;
    public xm8 K0;
    public i22 L0;
    public final HashSet M0 = new HashSet();
    public long N0;
    public volatile boolean O0 = false;
    public final tg X;
    public final to8 Y;
    public final l8f Z;
    public final Context a;
    public final oa7 b;
    public final tf4 c;
    public final j2b o;
    public final zg4 w0;
    public final mbe x0;
    public final u97 y0;
    public final r10 z0;

    public jwa(Context context, oa7 oa7, tf4 tf4, j2b j2b, tg tgVar, to8 to8, l8f l8f, mbe mbe, mn mnVar, r10 r10, swa swa, tt0 tt0, t52 t52, g15 g15) {
        this.a = context;
        this.b = oa7;
        this.c = tf4;
        this.o = j2b;
        this.X = tgVar;
        this.Y = to8;
        this.Z = l8f;
        this.x0 = mbe;
        this.y0 = mnVar;
        this.z0 = r10;
        this.B0 = swa;
        this.A0 = new fwa(context, this);
        this.C0 = tt0;
        this.D0 = t52;
        this.E0 = g15;
        this.w0 = zg4.b();
        context.registerComponentCallbacks(this);
    }

    public final void H() {
        e(true);
    }

    public final void M() {
    }

    public final void P(int i, int i2, int i3) {
        FloatingVideoView floatingVideoView = this.G0;
        if (floatingVideoView != null) {
            floatingVideoView.c(i, i2);
        }
    }

    public final void T() {
        fd9 fd9 = this.F0;
        if (fd9 != null) {
            fd9.k1(true);
        }
    }

    public final void X() {
        if (this.L0 != null && this.J0 != null) {
            this.O0 = false;
        }
    }

    public final void Y(Throwable th) {
        Context context = this.a;
        a06.H(0, context, che.b(context, th));
    }

    public final int[] a(Context context) {
        int i;
        int i2;
        WindowManager F = ek8.F(context);
        this.c.getClass();
        Size i3 = tf4.i(context);
        int rotation = F.getDefaultDisplay().getRotation();
        if (rotation == 1 || rotation == 3) {
            i = i3.getHeight();
            i2 = i3.getWidth();
        } else {
            i = i3.getWidth();
            i2 = i3.getHeight();
        }
        return new int[]{i, i2};
    }

    public final void b(int i) {
        if (this.F0 != null && this.L0 != null) {
            int t = hr1.t(i);
            if (t == 0) {
                this.F0.S0();
                this.O0 = true;
            } else if (t == 1) {
                this.F0.pause();
                this.O0 = false;
            } else if (t == 2) {
                e(true);
            }
        }
    }

    public final void c(boolean z) {
        jd9 jd9 = this.I0;
        if (jd9 != null) {
            qe9 qe9 = (qe9) ((ge9) jd9.b);
            if (qe9.Z != z) {
                if (z) {
                    ie6.VIRTUAL_KEY.d(qe9.Y);
                }
                qe9.Z = z;
                qe9.c();
            }
        }
    }

    public final void d(Context context, i22 i22, xm8 xm8, o10 o10, Rect rect, boolean z) {
        fd9 fd9;
        Context context2 = context;
        i22 i222 = i22;
        xm8 xm82 = xm8;
        o10 o102 = o10;
        Rect rect2 = rect;
        e(false);
        this.N0 = SystemClock.elapsedRealtime();
        this.J0 = o102;
        this.K0 = xm82;
        this.L0 = i222;
        WindowManager F = ek8.F(context);
        FloatingVideoView floatingVideoView = new FloatingVideoView(context2);
        this.G0 = floatingVideoView;
        floatingVideoView.setListener(this);
        int[] a2 = a(context);
        FloatingVideoView floatingVideoView2 = this.G0;
        int i = a2[0];
        int i2 = a2[1];
        floatingVideoView2.o = i;
        floatingVideoView2.w0 = i2;
        a06.u().f(tr6.b((ete.L(o10) ? o102.j.d.d : o102.d).d), (m18) null);
        float f = (float) this.w0.f;
        gf9 gf9 = new gf9(context2, this.X, new float[]{f, f, f, f, f, f, f, f});
        g15 g15 = this.E0;
        tf4 tf4 = this.c;
        l8f l8f = this.Z;
        mbe mbe = this.x0;
        oa7 oa7 = this.b;
        g15 g152 = g15;
        fd9 fd92 = r0;
        l8f l8f2 = l8f;
        gf9 gf92 = gf9;
        gf9 gf93 = gf92;
        WindowManager windowManager = F;
        xm8 xm83 = xm82;
        fd9 fd93 = new fd9(gf9, (q98) this.y0.get(), l8f2, mbe, oa7, this.z0, this.Y, this.o, this, g152, tf4, false, true);
        fd9 fd94 = fd92;
        this.F0 = fd94;
        fd94.Z1(o10, i222.b.a, xm8.a, 1, true);
        this.G0.setVisibility(4);
        this.G0.addView((View) gf93.c);
        this.G0.c(this.F0.R(), this.F0.M0());
        int width = rect.width();
        int height = rect.height();
        if (!(this.G0 == null || (fd9 = this.F0) == null)) {
            int R = fd9.R();
            int M02 = this.F0.M0();
            if (R > 0 && M02 > 0) {
                width = R;
                height = M02;
            }
            this.G0.c(width, height);
        }
        j2b j2b = this.o;
        i03 i03 = j2b.a;
        i03.getClass();
        x97 x97 = i03.g;
        Point point = new Point(x97.getInt("app.video.pip.pos.x", 0), x97.getInt("app.video.pip.pos.y", 0));
        if (point.x == 0 && point.y == 0) {
            point.x = this.G0.getLeftMargin();
            point.y = this.G0.getTopMargin();
        }
        FloatingVideoView floatingVideoView3 = this.G0;
        int i3 = point.x;
        int i4 = point.y;
        WindowManager.LayoutParams layoutParams = floatingVideoView3.F0;
        layoutParams.x = i3;
        layoutParams.y = i4;
        floatingVideoView3.b(true);
        FloatingVideoView floatingVideoView4 = this.G0;
        WindowManager windowManager2 = windowManager;
        windowManager2.addView(floatingVideoView4, floatingVideoView4.getWindowManagerLayoutParams());
        Uri a3 = this.z0.a(o10);
        if (!j2b.c.s() || a3 == null || !z) {
            Context context3 = context;
            j(false);
        } else {
            this.G0.setVisibility(4);
            mj5 mj5 = new mj5(context);
            this.H0 = mj5;
            Rect rect3 = rect;
            mj5.b(a3, rect3.left, rect3.top, rect.width(), rect.height());
            this.H0.setListener(new iwa(this));
            mj5 mj52 = this.H0;
            windowManager2.addView(mj52, mj52.getWindowLayoutParams());
            this.H0.a(this.G0.getXPos(), this.G0.getYPos(), this.G0.getWindowWidth(), this.G0.getWindowHeight());
        }
        context.getApplicationContext();
        udd.q("PIP_WORKER", "start");
        ((mtf) vl.b().getAccessor().c(mtf.class)).b("PIP_WORKER", a35.b, new bfa(PipWorker.class).setExpedited(vga.a).build(), true).O();
        fwa fwa = this.A0;
        if (!fwa.d) {
            d8.z(fwa.a, fwa, fwa.c, (String) null, 4);
            fwa.d = true;
        }
        try {
            this.C0.d(this);
        } catch (Exception unused) {
        }
    }

    public final void e(boolean z) {
        udd.q("PIP_WORKER", "stop");
        ((mtf) vl.b().getAccessor().c(mtf.class)).c("PIP_WORKER");
        f(z);
        mj5 mj5 = this.H0;
        if (mj5 != null) {
            mj5.setListener((lj5) null);
            ValueAnimator valueAnimator = this.H0.z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            try {
                ek8.F(this.H0.getContext()).removeView(this.H0);
            } catch (Exception unused) {
            }
            this.H0 = null;
        }
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        Iterator it = this.M0.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public final void f(boolean z) {
        fd9 fd9 = this.F0;
        if (fd9 != null) {
            fd9.l1(z);
            this.F0 = null;
        }
        FloatingVideoView floatingVideoView = this.G0;
        if (floatingVideoView != null) {
            try {
                ek8.F(floatingVideoView.getContext()).removeView(this.G0);
            } catch (Exception unused) {
            }
            this.G0 = null;
        }
        jd9 jd9 = this.I0;
        if (jd9 != null) {
            View view = (View) ((qe9) ((ge9) jd9.b)).c;
            if (view != null) {
                try {
                    ek8.F(view.getContext()).removeView(view);
                } catch (Exception unused2) {
                }
            }
            this.I0 = null;
        }
        fwa fwa = this.A0;
        if (fwa.d) {
            fwa.a.unregisterReceiver(fwa);
            fwa.d = false;
        }
        try {
            this.C0.f(this);
        } catch (Exception unused3) {
        }
    }

    public final void g(String str) {
    }

    public final void h() {
        if (this.K0 != null && this.J0 != null && this.L0 != null && this.F0 != null) {
            this.O0 = false;
        }
    }

    public final void i() {
        if (this.K0 != null && this.J0 != null && this.L0 != null && this.F0 != null) {
            this.O0 = true;
        }
    }

    public final void j(boolean z) {
        FloatingVideoView floatingVideoView = this.G0;
        if (floatingVideoView != null) {
            floatingVideoView.setVisibility(0);
        }
        mj5 mj5 = this.H0;
        if (mj5 != null) {
            if (z) {
                this.X.g(mj5).F(new pe9(1, this));
                return;
            }
            try {
                ValueAnimator valueAnimator = mj5.z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ek8.F(this.H0.getContext()).removeView(this.H0);
            } catch (Exception unused) {
            }
            this.H0 = null;
        }
    }

    public final void m() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        FloatingVideoView floatingVideoView = this.G0;
        if (floatingVideoView != null) {
            int[] a2 = a(floatingVideoView.getContext());
            FloatingVideoView floatingVideoView2 = this.G0;
            int i = a2[0];
            int i2 = a2[1];
            floatingVideoView2.o = i;
            floatingVideoView2.w0 = i2;
            floatingVideoView2.b(true);
            floatingVideoView2.y0.updateViewLayout(floatingVideoView2, floatingVideoView2.F0);
            floatingVideoView2.a();
        }
    }

    @a1e
    public void onEvent(l89 l89) {
        xm8 xm8 = this.K0;
        if (xm8 != null && this.J0 != null && this.L0 != null && this.F0 != null && l89.X.contains(Long.valueOf(xm8.a.b))) {
            e(false);
        }
    }

    public final void onLowMemory() {
    }

    public final void r() {
        if (this.F0 != null && this.G0 != null && this.J0 != null && this.K0 != null) {
            oa7 oa7 = this.b;
            if (oa7.get() != null) {
                ((bd) oa7.get()).e(SystemClock.elapsedRealtime() - this.N0, "ACTION_PIP_DURATION", (String) null);
            }
            this.F0.X0();
            WindowManager.LayoutParams windowManagerLayoutParams = this.G0.getWindowManagerLayoutParams();
            if (this.o.c.s()) {
                Uri a2 = this.z0.a(this.J0);
                if (a2 != null) {
                    WindowManager F = ek8.F(this.G0.getContext());
                    Display defaultDisplay = F.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    mj5 mj5 = new mj5(this.G0.getContext());
                    this.H0 = mj5;
                    mj5.b(a2, windowManagerLayoutParams.x, windowManagerLayoutParams.y, windowManagerLayoutParams.width, windowManagerLayoutParams.height);
                    int[] s = at7.s(point.x, point.y, windowManagerLayoutParams.width, windowManagerLayoutParams.height);
                    int i = s[0];
                    int i2 = s[1];
                    xm8 xm8 = this.K0;
                    o10 o10 = this.J0;
                    f(false);
                    this.H0.setListener(new iwa(this, xm8, o10));
                    mj5 mj52 = this.H0;
                    F.addView(mj52, mj52.getWindowLayoutParams());
                    this.H0.a((point.x / 2) - (i / 2), (point.y / 2) - (i2 / 2), i, i2);
                    return;
                }
                this.G0.getContext();
                e(true);
                return;
            }
            this.G0.getContext();
            e(true);
        }
    }

    @a1e
    public void onEvent(x92 x92) {
        i22 i22;
        if (this.K0 != null && this.J0 != null && (i22 = this.L0) != null && this.F0 != null && x92.b == i22.a) {
            e(false);
        }
    }

    @a1e
    public void onEvent(mw2 mw2) {
        i22 i22;
        if (this.K0 != null && this.J0 != null && (i22 = this.L0) != null && this.F0 != null && mw2.b.contains(Long.valueOf(i22.a))) {
            m62 m62 = this.D0.B(this.L0.a).b.c;
            if (m62 == m62.o || m62 == m62.X) {
                e(false);
            }
        }
    }
}
