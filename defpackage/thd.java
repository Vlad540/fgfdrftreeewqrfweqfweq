package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: thd  reason: default package */
public final class thd extends u78 implements rhd, ho8, h9f {
    public final m3f A0;
    public final ry7 B0;
    public final OneMeDraweeView C0;
    public final t97 D0;
    public boolean E0;
    public final t97 F0;

    /* JADX WARNING: type inference failed for: r1v0, types: [ry7, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public thd(Context context) {
        super(context);
        m3f m3f = new m3f();
        this.A0 = m3f;
        ? ry7 = new ry7(context);
        this.B0 = ry7;
        ? oneMeDraweeView = new OneMeDraweeView(context);
        this.C0 = oneMeDraweeView;
        this.D0 = ez3.O(3, new t2a(context, 29));
        this.F0 = ez3.O(3, new shd(context, 0));
        m3f.b = this;
        addView(oneMeDraweeView, -1, -2);
        addView(ry7, new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setupNewController(true);
    }

    private final qo0 getBlurPostProcessor() {
        return (qo0) this.D0.getValue();
    }

    private final ih8 getMediaType() {
        return (ih8) this.F0.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ry7, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final int b(int i, int i2) {
        ? r0 = this.B0;
        boolean r = r0.r();
        ? r2 = this.C0;
        int measuredHeight = r ? ((r2.getMeasuredHeight() - r0.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.E0 || r0.r()) ? i : (getMeasuredWidth() - r0.getMeasuredWidth()) / 2;
        if (this.E0) {
            n1g.D(r2, i, i2, 0, 12);
        }
        n1g.D(r0, measuredWidth, measuredHeight, 0, 12);
        m3f m3f = this.A0;
        if (ek8.L((t97) m3f.c)) {
            m3f.T(measuredWidth, measuredHeight);
        }
        t97 t97 = this.F0;
        if (t97.a()) {
            float f = (float) 4;
            n1g.D((ih8) t97.getValue(), me4.c(f, dh4.c().getDisplayMetrics().density, r0.getLeft()), r0.getBottom() - (a24.X(f * dh4.c().getDisplayMetrics().density) + getMediaType().getMeasuredHeight()), 0, 12);
        }
        return this.E0 ? r2.getMeasuredHeight() : r0.getMeasuredHeight();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.C0;
        if (view == oneMeDraweeView && !this.E0) {
            return false;
        }
        if (view != this.B0 && view != oneMeDraweeView && view != this.A0.R()) {
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
        return this.B0;
    }

    public final boolean h(MotionEvent motionEvent) {
        return true;
    }

    public final boolean j() {
        return this.B0.getImageAttach().e;
    }

    public final boolean m() {
        return ek8.L((t97) this.A0.c);
    }

    public final void o(b9f b9f, rz rzVar, long j, boolean z, boolean z2) {
        this.A0.o(b9f, rzVar, j, z, true);
    }

    public final boolean r() {
        return this.A0.r();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ry7, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v4, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final long s(int i, int i2, int i3, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        ? r0 = this.B0;
        r0.measure(makeMeasureSpec, i4);
        t97 t97 = this.F0;
        if (t97.a()) {
            ((ih8) t97.getValue()).measure(i3, i4);
        }
        m3f m3f = this.A0;
        if (ek8.L((t97) m3f.c)) {
            m3f.U(View.MeasureSpec.makeMeasureSpec(r0.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r0.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = r0.getBlurOffset();
        ? r8 = this.C0;
        boolean z = true;
        if (blurOffset == 0) {
            if (r0.getMeasuredWidth() >= i) {
                z = false;
            }
            this.E0 = z;
            if (z) {
                r8.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(r0.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (r0.I0 > 0) {
                this.E0 = true;
                int blurOffset2 = (r0.getBlurOffset() * 2) + r0.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                r8.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(r0.getMeasuredHeight(), 1073741824));
            } else if (r0.r()) {
                this.E0 = true;
                r8.measure(View.MeasureSpec.makeMeasureSpec(r0.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((r0.getBlurOffset() * 2) + r0.getMeasuredHeight(), 1073741824));
            } else {
                this.E0 = false;
            }
        }
        return az6.a(Math.max(this.E0 ? r8.getMeasuredWidth() : r0.getMeasuredWidth(), getDate().getMeasuredWidth() + ek8.D(t97)), Math.max(this.E0 ? r8.getMeasuredHeight() : r0.getMeasuredHeight(), Math.max(getDate().getMeasuredHeight(), ek8.C(t97))));
    }

    public void setVideoClickListener(i26 i26) {
        this.A0.o = i26;
    }

    public void setVideoLongClickListener(i26 i26) {
        this.A0.X = i26;
    }

    public final void t() {
        this.A0.t();
    }

    public final void u(sy7 sy7) {
        tp6 tp6 = ((qhd) sy7).c;
        this.B0.setImageAttach(tp6);
        OneMeDraweeView oneMeDraweeView = this.C0;
        ur6 d = ur6.d(tp6.b);
        d.d = tp6.h;
        d.l = getBlurPostProcessor();
        oneMeDraweeView.o(d.a(), (tr6) null);
        oneMeDraweeView.getHierarchy().h(tp6.i);
        if (tp6.e) {
            jjd.e(this, getMediaType(), new ViewGroup.LayoutParams(-2, -2));
            getMediaType().setVisibility(0);
            return;
        }
        t97 t97 = this.F0;
        if (t97.a()) {
            ((ih8) t97.getValue()).setVisibility(8);
        }
    }
}
