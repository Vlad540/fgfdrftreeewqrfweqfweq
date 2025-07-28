package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: a6f  reason: default package */
public final class a6f extends ViewGroup implements i04, i0c, zq8, mha, h9f, g9f {
    public static final /* synthetic */ k77[] O0;
    public final t97 A0 = ez3.O(3, new v5f(this, 2));
    public final t97 B0 = ez3.O(3, new v5f(this, 3));
    public final int C0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final yj I0;
    public q40 J0;
    public qod K0;
    public qod L0;
    public ValueAnimator M0;
    public int N0;
    public final nzb a;
    public final uq8 b;
    public final nha c;
    public final m3f o;
    public final xp6 w0;
    public final c2f x0;
    public final h04 y0;
    public final t97 z0 = ez3.O(3, new v5f(this, 1));

    static {
        k77 hc9 = new hc9(a6f.class, "model", "getModel()Lone/me/messages/list/loader/model/VideoMessageAttach;");
        m7c.a.getClass();
        O0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [nha, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View, xp6] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a6f(Context context) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        ? obj = new Object();
        m3f m3f = new m3f();
        this.a = nzb;
        this.b = uq8;
        this.c = obj;
        this.o = m3f;
        ? xp6 = new xp6(context);
        xp6.setClipToOutline(true);
        xp6.setOutlineProvider(new i32(xp6, 6));
        this.w0 = xp6;
        c2f c2f = new c2f(context);
        c2f.setBackgroundEnabled(true);
        c2f.setDrawableEnabled(false);
        this.x0 = c2f;
        h04 h04 = new h04(context);
        h04.setBackgroundEnabled$message_list_release(true);
        this.y0 = h04;
        float f = (float) 4;
        this.C0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.D0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        this.E0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.F0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.G0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.H0 = a24.X(f * dh4.c().getDisplayMetrics().density);
        this.I0 = new yj(27, this);
        nzb.b = this;
        uq8.b = this;
        m3f.b = this;
        m3f.o = new bk(22, this);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(xp6, new ViewGroup.LayoutParams(-1, -1));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
        addView(c2f, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.N0 = a24.X(((float) 228) * dh4.c().getDisplayMetrics().density);
    }

    public static w5f a(a6f a6f) {
        w5f w5f = new w5f();
        w5f.b(a6f.getIconBackgroundColor(), Integer.valueOf(a24.X(((float) 52) * dh4.c().getDisplayMetrics().density)));
        d00 d00 = new d00();
        d00.a = gq3.b(a6f.getContext(), phc.m0);
        d00.invalidateSelf();
        d00.b(a6f.getIconColor());
        d00.e = true;
        d00.invalidateSelf();
        int X = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
        int iconColor = a6f.getIconColor();
        w5f.addLayer(d00);
        d00.setTint(iconColor);
        w5f.setLayerSize(1, X, X);
        w5f.setLayerGravity(1, 17);
        return w5f;
    }

    public static w5f b(a6f a6f) {
        w5f w5f = new w5f();
        w5f.b(a6f.getIconBackgroundColor(), (Integer) null);
        Drawable b2 = gq3.b(a6f.getContext(), phc.I1);
        int X = a24.X(((float) 48) * dh4.c().getDisplayMetrics().density);
        int iconColor = a6f.getIconColor();
        w5f.addLayer(b2);
        b2.setTint(iconColor);
        w5f.setLayerSize(1, X, X);
        w5f.setLayerGravity(1, 17);
        return w5f;
    }

    public static w5f d(a6f a6f) {
        w5f w5f = new w5f();
        w5f.b(a6f.getIconBackgroundColor(), Integer.valueOf(a24.X(((float) 52) * dh4.c().getDisplayMetrics().density)));
        Drawable b2 = gq3.b(a6f.getContext(), phc.u0);
        int X = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        int iconColor = a6f.getIconColor();
        w5f.addLayer(b2);
        b2.setTint(iconColor);
        w5f.setLayerSize(1, X, X);
        w5f.setLayerGravity(1, 17);
        return w5f;
    }

    private final int getIconBackgroundColor() {
        km4.y0.r(this).a().o().a.getClass();
        return 1543503872;
    }

    private final int getIconColor() {
        km4.y0.r(this).a().o().c.getClass();
        return -1;
    }

    private final h5f getModel() {
        k77 k77 = O0[0];
        return (h5f) this.I0.b;
    }

    private final w5f getNeedDownloadDrawable() {
        return (w5f) this.A0.getValue();
    }

    private final w5f getPauseDrawable() {
        return (w5f) this.z0.getValue();
    }

    private final w5f getProgressDownloadDrawable() {
        return (w5f) this.B0.getValue();
    }

    public static final void h(a6f a6f) {
        a6f a6f2 = a6f;
        h5f model = a6f.getModel();
        if (model != null) {
            q1f q1f = model.c;
            h5f h5f = model;
            tp6 tp6 = r2;
            tp6 tp62 = new tp6(0, q1f.b, q1f.c, q1f.d, false, q1f.e, q1f.h, q1f.i, false, (String) null, (Uri) null, 3328);
            a6f2.w0.setImageAttach(tp6);
            long e = zp4.e(q1f.f);
            String[] strArr = dhe.b;
            a6f2.x0.setContent(d8.a(e));
            a6f2.u(h5f.e);
            a6f.requestLayout();
            a6f.invalidate();
        }
    }

    public static final void i(a6f a6f, t6f t6f) {
        h5f model = a6f.getModel();
        if (hhd.f(model != null ? Long.valueOf(model.a) : null, t6f != null ? Long.valueOf(t6f.a) : null)) {
            m3f m3f = a6f.o;
            View R = m3f.R();
            if (R != null) {
                R.setForeground((Drawable) null);
            }
            int i = t6f != null ? t6f.Y : 0;
            int i2 = i == 0 ? -1 : x5f.$EnumSwitchMapping$0[hr1.t(i)];
            if (i2 == 1) {
                a6f.o.o(t6f, t6f.c, t6f.a, false, false);
            } else if (i2 == 2) {
                a6f.p(a24.X(((float) 228) * dh4.c().getDisplayMetrics().density), ((sn8) a6f.getParent()).getMaxAvailableWidth$message_list_release(), new v5f(a6f, 0));
            } else if (i2 == 3) {
                View R2 = m3f.R();
                if (R2 != null) {
                    R2.setForeground(a6f.getPauseDrawable());
                }
            } else if (i2 == 4) {
                m3f.t();
                a6f.p(a6f.N0, a24.X(((float) 228) * dh4.c().getDisplayMetrics().density), new opd(28));
            }
        }
    }

    private final void setModel(h5f h5f) {
        this.I0.o1(this, O0[0], h5f);
    }

    public final void c(dr0 dr0) {
        this.b.c(dr0);
    }

    public final float[] e(boolean z) {
        int max = Math.max(getMeasuredWidth(), getMeasuredHeight());
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = (float) max;
        }
        return fArr;
    }

    public final void f(yr8 yr8, boolean z) {
        this.a.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.y0.c(charSequence, z);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, xp6] */
    public View getPreviewView() {
        return this.w0;
    }

    public final boolean j() {
        return this.o.j();
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final boolean m() {
        return ek8.L((t97) this.o.c);
    }

    public final void n(h5f h5f) {
        q40 q40;
        setModel(h5f);
        this.J0 = new q40(this, 13, h5f);
        if (isAttachedToWindow() && (q40 = this.J0) != null) {
            q40.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.J0);
    }

    public final void o(b9f b9f, rz rzVar, long j, boolean z, boolean z2) {
        this.o.o(b9f, rzVar, j, z, true);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.view.View, xp6] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        uq8 uq8 = this.b;
        int i7 = 0;
        if (ek8.L((t97) uq8.c)) {
            int K = uq8.K();
            int i8 = this.D0;
            uq8.T(i8, i8);
            i5 = K + i8 + this.C0;
        } else {
            i5 = 0;
        }
        n1g.D(this.w0, 0, i5, 0, 12);
        m3f m3f = this.o;
        if (ek8.L((t97) m3f.c)) {
            m3f.T(0, i5);
        }
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            i6 = me4.p((float) 10, dh4.c().getDisplayMetrics().density, me4.p((float) 8, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - nzb.K()));
        } else {
            i6 = getMeasuredHeight();
        }
        int measuredWidth = getMeasuredWidth();
        h04 h04 = this.y0;
        n1g.D(h04, (measuredWidth - h04.getMeasuredWidth()) - this.F0, (i6 - h04.getMeasuredHeight()) - this.E0, 0, 12);
        c2f c2f = this.x0;
        n1g.D(c2f, this.H0, (i6 - c2f.getMeasuredHeight()) - this.G0, 0, 12);
        if (ek8.L((t97) nzb.c)) {
            int c2 = me4.c((float) 10, dh4.c().getDisplayMetrics().density, i6);
            if (nzb.Z) {
                i7 = getMeasuredWidth() - nzb.L();
            }
            nzb.T(i7, c2);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.view.View, xp6] */
    public final void onMeasure(int i, int i2) {
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : rf0.l((float) 10, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int i3 = 0;
        int i4 = getDependOnOutsideView() ? size : 0;
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            int L = uq8.L();
            int i5 = this.D0;
            i4 = Math.max(i4, (i5 * 2) + L);
            i3 = uq8.K() + i5 + this.C0;
        }
        h04 h04 = this.y0;
        h04.measure(i, i2);
        c2f c2f = this.x0;
        c2f.measure(i, i2);
        int max = Math.max(h04.getMeasuredHeight(), c2f.getMeasuredHeight()) + i3;
        int i6 = this.N0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        ? r10 = this.w0;
        r10.measure(makeMeasureSpec, makeMeasureSpec2);
        int max2 = Math.max(i4, Math.max(r10.getMeasuredWidth(), c2f.getMeasuredWidth() + h04.getMeasuredWidth()));
        int measuredHeight = r10.getMeasuredHeight() + max;
        m3f m3f = this.o;
        if (ek8.L((t97) m3f.c)) {
            m3f.U(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        }
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            max2 = Math.max(max2, nzb.L());
            measuredHeight = rf0.b((float) 8, dh4.c().getDisplayMetrics().density, nzb.K() + a24.X(((float) 10) * dh4.c().getDisplayMetrics().density), measuredHeight);
        }
        setMeasuredDimension(max2, measuredHeight);
    }

    public final void onStartTemporaryDetach() {
        this.o.t();
        p(this.N0, a24.X(((float) 228) * dh4.c().getDisplayMetrics().density), new opd(28));
        super.onStartTemporaryDetach();
    }

    public final void p(int i, int i2, s16 s16) {
        if (i == getMeasuredWidth()) {
            ValueAnimator valueAnimator = this.M0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.addUpdateListener(new c00(21, this));
            ofInt.setDuration(300);
            ofInt.addListener(new mf(8, s16));
            ofInt.start();
            this.M0 = ofInt;
        }
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public final boolean r() {
        return this.o.r();
    }

    public final void s(float f) {
        xp6 xp6 = this.w0;
        Drawable overlayDrawable = xp6.getOverlayDrawable();
        Drawable drawable = null;
        w5f w5f = overlayDrawable instanceof w5f ? (w5f) overlayDrawable : null;
        if (w5f != null) {
            drawable = w5f.getDrawable(1);
        }
        if (!(drawable instanceof d00)) {
            xp6.setOverlayDrawable(getProgressDownloadDrawable());
            drawable = xp6.getOverlayDrawable();
        }
        if (drawable != null) {
            drawable.setLevel((int) (f * ((float) 100)));
        }
    }

    public void setChipObserver(syb syb) {
        this.a.setChipObserver(syb);
    }

    public void setDateBackgroundColor(int i) {
        this.y0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.y0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.y0.setStatus$message_list_release(dcf);
    }

    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
    }

    public void setForwardClickListener(u16 u16) {
        this.b.X = u16;
    }

    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    public void setLink(tq8 tq8) {
        this.b.setLink(tq8);
    }

    public void setOnClickListener(u16 u16) {
        this.a.X = u16;
    }

    public void setReplyClickListener(i26 i26) {
        this.b.o = i26;
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    public void setVideoClickListener(i26 i26) {
        this.o.o = i26;
    }

    public void setVideoLongClickListener(i26 i26) {
        this.o.X = i26;
    }

    public final void t() {
        this.o.t();
    }

    public final void u(ez ezVar) {
        h5f model = getModel();
        if (hhd.f(model != null ? Long.valueOf(model.a) : null, ezVar != null ? Long.valueOf(ezVar.a()) : null) && ezVar != null) {
            if (ezVar instanceof az) {
                s(((az) ezVar).b);
            } else if (ezVar instanceof dz) {
                s(((dz) ezVar).b);
            } else {
                boolean z = ezVar instanceof bz;
                xp6 xp6 = this.w0;
                if (z) {
                    xp6.setOverlayDrawable(getNeedDownloadDrawable());
                } else if (ezVar instanceof cz) {
                    xp6.setOverlayDrawable((Drawable) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final void v(h5f h5f) {
        setModel(h5f);
    }
}
