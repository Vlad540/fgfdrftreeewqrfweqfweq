package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: bjd  reason: default package */
public final class bjd extends vf8 implements xid, h9f {
    public final m3f G0;
    public final sxa H0;
    public final ry7 I0;
    public boolean J0;
    public final OneMeDraweeView K0;
    public final t97 L0;
    public final c2f M0;
    public final t97 N0;
    public final int O0;
    public final int P0;
    public q40 Q0;
    public g37 R0;

    /* JADX WARNING: type inference failed for: r2v0, types: [ry7, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjd(Context context) {
        super(context);
        m3f m3f = new m3f();
        this.G0 = m3f;
        sxa sxa = new sxa(context);
        this.H0 = sxa;
        ? ry7 = new ry7(context);
        ry7.setUseMaxDimensionsOnMeasure(true);
        ry7.setOverlayDrawable(sxa);
        this.I0 = ry7;
        ? oneMeDraweeView = new OneMeDraweeView(context);
        this.K0 = oneMeDraweeView;
        this.L0 = ez3.O(3, new shd(context, 5));
        c2f c2f = new c2f(context);
        c2f.setDrawableEnabled(false);
        c2f.setBackgroundEnabled(true);
        this.M0 = c2f;
        this.N0 = ez3.O(3, new shd(context, 6));
        float f = (float) 4;
        this.O0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.P0 = a24.X(f * dh4.c().getDisplayMetrics().density);
        m3f.b = this;
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-1, -2));
        addView(ry7, new ViewGroup.LayoutParams(-1, -1));
        addView(c2f, new ViewGroup.LayoutParams(-2, -2));
        setTransitionGroup(true);
        oneMeDraweeView.setupNewController(true);
    }

    private final qo0 getBlurPostProcessor() {
        return (qo0) this.L0.getValue();
    }

    private final c2f getTransferStatusView() {
        return (c2f) this.N0.getValue();
    }

    public static final void x(bjd bjd, ez ezVar) {
        wid wid = (wid) bjd.getModel();
        Long l = null;
        Long valueOf = wid != null ? Long.valueOf(wid.a) : null;
        if (ezVar != null) {
            l = Long.valueOf(ezVar.a());
        }
        if (hhd.f(valueOf, l)) {
            if ((ezVar instanceof az) || (ezVar instanceof dz)) {
                jjd.e(bjd, bjd.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                bjd.getTransferStatusView().setVisibility(0);
                c2f transferStatusView = bjd.getTransferStatusView();
                CharSequence a = ezVar.b().a(bjd.getContext());
                if (a == null) {
                    a = "";
                }
                transferStatusView.setContent(a);
                return;
            }
            t97 t97 = bjd.N0;
            if (t97.a()) {
                ((c2f) t97.getValue()).setVisibility(8);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ry7, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final int b(int i, int i2) {
        ? r0 = this.I0;
        boolean r = r0.r();
        ? r2 = this.K0;
        int measuredHeight = r ? ((r2.getMeasuredHeight() - r0.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.J0 || r0.r()) ? i : (getMeasuredWidth() - r0.getMeasuredWidth()) / 2;
        if (this.J0) {
            n1g.D(r2, i, i2, 0, 12);
        }
        n1g.D(r0, measuredWidth, measuredHeight, 0, 12);
        m3f m3f = this.G0;
        if (ek8.L((t97) m3f.c)) {
            m3f.T(measuredWidth, measuredHeight);
        }
        t97 t97 = this.N0;
        boolean a = t97.a();
        int i3 = this.O0;
        int i4 = this.P0;
        if (a) {
            n1g.D((c2f) t97.getValue(), measuredWidth + i4, r0.getTop() + i3, 0, 12);
        }
        int measuredHeight2 = r0.getMeasuredHeight() + i2;
        c2f c2f = this.M0;
        n1g.D(c2f, i + i4, (measuredHeight2 - c2f.getMeasuredHeight()) - i3, 0, 12);
        return this.J0 ? r2.getMeasuredHeight() : r0.getMeasuredHeight();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.K0;
        if (view == oneMeDraweeView && !this.J0) {
            return false;
        }
        if (view != this.I0 && view != oneMeDraweeView && view != this.G0.R()) {
            return super.drawChild(canvas, view, j);
        }
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        float f = (float) 2;
        Matrix a = b28.a();
        a.reset();
        a.setScale((measuredWidth - ((dh4.c().getDisplayMetrics().density * 1.0f) * f)) / measuredWidth, (measuredHeight - ((1.0f * dh4.c().getDisplayMetrics().density) * f)) / measuredHeight, measuredWidth / 2.0f, measuredHeight / 2.0f);
        Path b = b28.b();
        b.reset();
        b.set(((on8) getBackground()).a());
        b.transform(b28.a());
        Path b2 = b28.b();
        int save = canvas.save();
        canvas.clipPath(b2);
        try {
            super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return true;
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ry7, android.view.View] */
    public View getPreviewView() {
        return this.I0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ry7, android.view.View] */
    public final boolean h(MotionEvent motionEvent) {
        return mcf.c(this.I0, this).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final boolean j() {
        return this.G0.j();
    }

    public final boolean m() {
        return ek8.L((t97) this.G0.c);
    }

    public final void o(b9f b9f, rz rzVar, long j, boolean z, boolean z2) {
        this.G0.o(b9f, rzVar, j, z, true);
    }

    public final boolean r() {
        return this.G0.r();
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [ry7, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v4, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final long s(int i, int i2, int i3, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        c2f c2f = this.M0;
        c2f.measure(makeMeasureSpec, i4);
        t97 t97 = this.N0;
        if (t97.a()) {
            ((c2f) t97.getValue()).measure(i3, i4);
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        ? r8 = this.I0;
        r8.measure(makeMeasureSpec2, i4);
        m3f m3f = this.G0;
        if (ek8.L((t97) m3f.c)) {
            m3f.U(View.MeasureSpec.makeMeasureSpec(r8.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r8.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = r8.getBlurOffset();
        ? r9 = this.K0;
        boolean z = true;
        if (blurOffset == 0) {
            if (r8.getMeasuredWidth() >= i) {
                z = false;
            }
            this.J0 = z;
            if (z) {
                r9.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(r8.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (r8.I0 > 0) {
                this.J0 = true;
                int blurOffset2 = (r8.getBlurOffset() * 2) + r8.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                r9.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(r8.getMeasuredHeight(), 1073741824));
            } else if (r8.r()) {
                this.J0 = true;
                r9.measure(View.MeasureSpec.makeMeasureSpec(r8.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((r8.getBlurOffset() * 2) + r8.getMeasuredHeight(), 1073741824));
            } else {
                this.J0 = false;
            }
        }
        return az6.a(Math.max(this.J0 ? r9.getMeasuredWidth() : r8.getMeasuredWidth(), Math.max(ek8.D(t97), c2f.getMeasuredWidth() + getDate$message_list_release().getMeasuredWidth())), Math.max(this.J0 ? r9.getMeasuredHeight() : r8.getMeasuredHeight(), Math.max(getDate$message_list_release().getMeasuredHeight(), ek8.C(t97))));
    }

    public void setVideoClickListener(i26 i26) {
        this.G0.o = i26;
    }

    public void setVideoLongClickListener(i26 i26) {
        this.G0.X = i26;
    }

    public final void t() {
        this.G0.t();
    }

    public final void u(sy7 sy7) {
        wid wid = (wid) sy7;
        q1f q1f = wid.c;
        wid wid2 = wid;
        tp6 tp6 = r2;
        tp6 tp62 = new tp6(0, q1f.b, q1f.c, q1f.d, false, q1f.e, q1f.h, q1f.i, false, (String) null, (Uri) null, 3328);
        this.I0.setImageAttach(tp6);
        OneMeDraweeView oneMeDraweeView = this.K0;
        q1f q1f2 = q1f;
        ur6 d = ur6.d(q1f2.b);
        d.d = q1f2.i;
        d.l = getBlurPostProcessor();
        oneMeDraweeView.o(d.a(), (tr6) null);
        oneMeDraweeView.getHierarchy().h(jlc.g);
        long e = zp4.e(q1f2.f);
        String[] strArr = dhe.b;
        this.M0.setContent(d8.a(e));
        zqd zqd = wid2.d;
        if (!(zqd.getValue() instanceof az) && !(zqd.getValue() instanceof dz)) {
            t97 t97 = this.N0;
            if (t97.a()) {
                ((c2f) t97.getValue()).setVisibility(8);
            }
        }
    }
}
