package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: yq8  reason: default package */
public final class yq8 extends ViewGroup implements io2 {
    public static final /* synthetic */ k77[] G0;
    public int A0;
    public Layout B0;
    public final t97 C0;
    public final Paint D0;
    public final TextPaint E0;
    public final gi F0;
    public final yj a = new yj(this);
    public Layout b;
    public Layout c;
    public Layout o;
    public Layout w0;
    public final t97 x0;
    public Layout y0;
    public Layout z0;

    static {
        k77 hc9 = new hc9(yq8.class, "drawMode", "getDrawMode()Lone/me/messages/list/ui/view/delegates/views/MessageLinkView$Mode;");
        m7c.a.getClass();
        G0 = new k77[]{hc9};
    }

    public yq8(Context context) {
        super(context);
        this.x0 = ez3.O(3, new cc3(context, 17));
        this.C0 = ez3.O(3, new cc3(context, 18));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 2.0f);
        this.D0 = paint;
        TextPaint textPaint = new TextPaint();
        jp2.c.a(textPaint, context.getResources().getDisplayMetrics(), yq4.b);
        this.E0 = textPaint;
        this.F0 = new gi(2, this);
    }

    private final mz9 getAvatarView() {
        return (mz9) this.x0.getValue();
    }

    private final wq8 getDrawMode() {
        k77 k77 = G0[0];
        return (wq8) this.a.b;
    }

    private final OneMeDraweeView getImageView() {
        return (OneMeDraweeView) this.C0.getValue();
    }

    private final void setDrawMode(wq8 wq8) {
        this.a.o1(this, G0[0], wq8);
    }

    public final void a(dr0 dr0) {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        TextPaint paint4;
        TextPaint paint5;
        TextPaint paint6;
        TextPaint paint7;
        this.D0.setColor(dr0.d.a);
        Layout layout = this.b;
        gr0 gr0 = dr0.b;
        if (!(layout == null || (paint7 = layout.getPaint()) == null)) {
            paint7.setColor(gr0.h);
        }
        Layout layout2 = this.c;
        if (!(layout2 == null || (paint6 = layout2.getPaint()) == null)) {
            paint6.setColor(gr0.i);
        }
        Layout layout3 = this.c;
        if (layout3 != null) {
            CharSequence text = layout3.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(0, layout3.getText().length(), Object.class);
                if (spans != null) {
                    for (Object obj : spans) {
                        io2 io2 = obj instanceof io2 ? (io2) obj : null;
                        if (io2 != null) {
                            io2.a(dr0);
                        }
                    }
                }
            }
        }
        Layout layout4 = this.w0;
        if (!(layout4 == null || (paint5 = layout4.getPaint()) == null)) {
            paint5.setColor(gr0.i);
        }
        Layout layout5 = this.o;
        if (!(layout5 == null || (paint4 = layout5.getPaint()) == null)) {
            paint4.setColor(gr0.i);
        }
        Layout layout6 = this.y0;
        if (!(layout6 == null || (paint3 = layout6.getPaint()) == null)) {
            paint3.setColor(gr0.i);
        }
        Layout layout7 = this.z0;
        if (!(layout7 == null || (paint2 = layout7.getPaint()) == null)) {
            paint2.setColor(gr0.i);
        }
        Layout layout8 = this.B0;
        if (!(layout8 == null || (paint = layout8.getPaint()) == null)) {
            paint.setColor(gr0.i);
        }
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void b(Canvas canvas, float f) {
        if (this.A0 > 1) {
            float f2 = (float) 11;
            float X = f + ((float) a24.X(dh4.c().getDisplayMetrics().density * f2));
            float bottom = ((float) getImageView().getBottom()) - ((float) a24.X(f2 * dh4.c().getDisplayMetrics().density));
            TextPaint textPaint = this.E0;
            s59 s59 = km4.y0;
            textPaint.setColor(s59.r(this).b().d);
            canvas.drawCircle(X, bottom, (float) a24.X(((float) 9) * dh4.c().getDisplayMetrics().density), textPaint);
            textPaint.setColor(s59.r(this).a().o().b.a);
            float f3 = (float) 2;
            float measureText = X - (textPaint.measureText(String.valueOf(this.A0)) / f3);
            float descent = textPaint.descent();
            canvas.drawText(String.valueOf(this.A0), measureText, bottom - ((textPaint.ascent() + descent) / f3), textPaint);
        }
    }

    public final void c(Canvas canvas) {
        boolean w = xy6.w(this);
        Paint paint = this.D0;
        float measuredWidth = w ? ((float) getMeasuredWidth()) - (paint.getStrokeWidth() / ((float) 2)) : paint.getStrokeWidth() / ((float) 2);
        int save = canvas.save();
        try {
            canvas.drawLine(measuredWidth, dh4.c().getDisplayMetrics().density * 2.0f, measuredWidth, ((float) getMeasuredHeight()) - (dh4.c().getDisplayMetrics().density * 2.0f), paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void d(oq8 oq8) {
        jjd.g(getImageView(), this);
        ? imageView = getImageView();
        String str = oq8.a;
        int i = 0;
        if (!(!(str == null || str.length() == 0))) {
            i = 8;
        }
        imageView.setVisibility(i);
        OneMeDraweeView imageView2 = getImageView();
        tr6 tr6 = null;
        String str2 = oq8.a;
        tr6 b2 = str2 != null ? tr6.b(str2) : null;
        Uri uri = oq8.d;
        if (uri != null) {
            tr6 = tr6.a(uri);
        }
        imageView2.o(b2, tr6);
        this.A0 = oq8.b;
        this.B0 = oq8.c;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v38, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        super.dispatchDraw(canvas);
        wq8 drawMode = getDrawMode();
        wq8 wq8 = wq8.Y;
        Paint paint = this.D0;
        float f2 = 0.0f;
        if (drawMode == wq8 || getDrawMode() == wq8.c) {
            f = 0.0f;
        } else {
            c(canvas);
            f = paint.getStrokeWidth() + ((float) a24.X(((float) 6) * dh4.c().getDisplayMetrics().density)) + 0.0f;
            float X = ((float) a24.X(((float) 2) * dh4.c().getDisplayMetrics().density)) + 0.0f;
            int save = canvas.save();
            canvas.translate(f, X);
            try {
                Layout layout = this.b;
                if (layout != null) {
                    layout.draw(canvas);
                }
                canvas.restoreToCount(save);
                f2 = ((float) wx3.m(this.b)) + X;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        int ordinal = getDrawMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                float X2 = f2 + ((float) a24.X(((float) 2) * dh4.c().getDisplayMetrics().density));
                float c2 = f + ((float) me4.c((float) 6, dh4.c().getDisplayMetrics().density, a24.X(((float) 28) * dh4.c().getDisplayMetrics().density)));
                int save2 = canvas.save();
                canvas.translate(c2, X2);
                try {
                    Layout layout2 = this.o;
                    if (layout2 != null) {
                        layout2.draw(canvas);
                    }
                    canvas.restoreToCount(save2);
                    float m = X2 + ((float) wx3.m(this.o));
                    int save3 = canvas.save();
                    canvas.translate(c2, m);
                    try {
                        Layout layout3 = this.w0;
                        if (layout3 != null) {
                            layout3.draw(canvas);
                        }
                        return;
                    } finally {
                        canvas.restoreToCount(save3);
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(save2);
                    throw th2;
                }
            } else if (ordinal == 2) {
                c(canvas);
                float strokeWidth = paint.getStrokeWidth() + ((float) a24.X(((float) 6) * dh4.c().getDisplayMetrics().density)) + f;
                b(canvas, strokeWidth);
                float c3 = strokeWidth + ((float) me4.c((float) 4, dh4.c().getDisplayMetrics().density, a24.X(((float) 40) * dh4.c().getDisplayMetrics().density)));
                float f3 = (float) 2;
                float X3 = f2 + ((float) (a24.X(dh4.c().getDisplayMetrics().density * f3) * 2));
                float measuredHeight = (((((float) getMeasuredHeight()) - X3) / f3) - ((float) ((wx3.m(this.B0) + wx3.m(this.b)) / 2))) + X3;
                int save4 = canvas.save();
                canvas.translate(c3, measuredHeight);
                try {
                    Layout layout4 = this.b;
                    if (layout4 != null) {
                        layout4.draw(canvas);
                    }
                    canvas.restoreToCount(save4);
                    float m2 = measuredHeight + ((float) wx3.m(this.b));
                    int save5 = canvas.save();
                    canvas.translate(c3, m2);
                    try {
                        Layout layout5 = this.B0;
                        if (layout5 != null) {
                            layout5.draw(canvas);
                        }
                        return;
                    } finally {
                        canvas.restoreToCount(save5);
                    }
                } catch (Throwable th3) {
                    canvas.restoreToCount(save4);
                    throw th3;
                }
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    int save6 = canvas.save();
                    canvas.translate(f, f2);
                    try {
                        Layout layout6 = this.y0;
                        if (layout6 != null) {
                            layout6.draw(canvas);
                        }
                        canvas.restoreToCount(save6);
                        float m3 = f2 + ((float) wx3.m(this.y0));
                        b(canvas, f);
                        float c4 = f + ((float) me4.c((float) 4, dh4.c().getDisplayMetrics().density, getImageView().getMeasuredWidth()));
                        float X4 = m3 + ((float) a24.X(((float) 6) * dh4.c().getDisplayMetrics().density));
                        int save7 = canvas.save();
                        canvas.translate(c4, X4);
                        try {
                            Layout layout7 = this.z0;
                            if (layout7 != null) {
                                layout7.draw(canvas);
                            }
                            canvas.restoreToCount(save7);
                            float m4 = X4 + ((float) wx3.m(this.z0));
                            int save8 = canvas.save();
                            canvas.translate(c4, m4);
                            try {
                                Layout layout8 = this.B0;
                                if (layout8 != null) {
                                    layout8.draw(canvas);
                                }
                                return;
                            } finally {
                                canvas.restoreToCount(save8);
                            }
                        } catch (Throwable th4) {
                            canvas.restoreToCount(save7);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        canvas.restoreToCount(save6);
                        throw th5;
                    }
                } else if (ordinal == 5) {
                    int save9 = canvas.save();
                    canvas.translate(f, f2);
                    try {
                        Layout layout9 = this.y0;
                        if (layout9 != null) {
                            layout9.draw(canvas);
                        }
                        canvas.restoreToCount(save9);
                        float c5 = f2 + ((float) me4.c((float) 2, dh4.c().getDisplayMetrics().density, wx3.m(this.y0)));
                        int save10 = canvas.save();
                        canvas.translate(f, c5);
                        try {
                            Layout layout10 = this.z0;
                            if (layout10 != null) {
                                layout10.draw(canvas);
                            }
                            return;
                        } finally {
                            canvas.restoreToCount(save10);
                        }
                    } catch (Throwable th6) {
                        canvas.restoreToCount(save9);
                        throw th6;
                    }
                } else {
                    return;
                }
            }
        }
        if (getDrawMode() == wq8.o) {
            int save11 = canvas.save();
            canvas.translate(f, f2);
            try {
                Layout layout11 = this.y0;
                if (layout11 != null) {
                    layout11.draw(canvas);
                }
                canvas.restoreToCount(save11);
                float c6 = f2 + ((float) me4.c((float) 2, dh4.c().getDisplayMetrics().density, wx3.m(this.y0)));
                int save12 = canvas.save();
                canvas.translate(f, c6);
                try {
                    Layout layout12 = this.z0;
                    if (layout12 != null) {
                        layout12.draw(canvas);
                    }
                    canvas.restoreToCount(save12);
                    f2 = c6 + ((float) me4.c((float) 6, dh4.c().getDisplayMetrics().density, wx3.m(this.z0)));
                } catch (Throwable th7) {
                    canvas.restoreToCount(save12);
                    throw th7;
                }
            } catch (Throwable th8) {
                canvas.restoreToCount(save11);
                throw th8;
            }
        }
        int save13 = canvas.save();
        canvas.translate(f, f2);
        try {
            Layout layout13 = this.c;
            if (layout13 != null) {
                layout13.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save13);
        }
    }

    public final void f(Layout layout, nq8 nq8) {
        setDrawMode(wq8.b);
        this.b = layout;
        this.o = nq8.a;
        this.w0 = nq8.b;
        jjd.g(getAvatarView(), this);
        getAvatarView().setVisibility(0);
        getAvatarView().setAvatarUrl(nq8.e);
        getAvatarView().g(new ub0(nq8.d, nq8.c), true);
    }

    public final void g(Layout layout, oq8 oq8, mq8 mq8) {
        setDrawMode(wq8.X);
        this.b = layout;
        d(oq8);
        this.y0 = mq8.b();
        this.z0 = mq8.a();
    }

    public final void h(Layout layout, oq8 oq8) {
        setDrawMode(wq8.c);
        this.b = layout;
        d(oq8);
    }

    public final void i(Layout layout, Layout layout2, mq8 mq8) {
        setDrawMode(wq8.o);
        this.b = layout;
        this.c = layout2;
        this.y0 = mq8.b();
        this.z0 = mq8.a();
    }

    public final void j(Layout layout, Layout layout2) {
        setDrawMode(wq8.a);
        this.b = layout;
        this.c = layout2;
        a24.c0(this, layout2, this.F0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Layout layout = this.c;
        if (layout != null) {
            a24.c0(this, layout, this.F0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Layout layout = this.c;
        if (layout != null) {
            a24.d0(layout, this.F0);
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v5, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int c2 = me4.c((float) 6, dh4.c().getDisplayMetrics().density, (int) this.D0.getStrokeWidth());
        float f = (float) 2;
        int m = wx3.m(this.b) + a24.X(dh4.c().getDisplayMetrics().density * f);
        int ordinal = getDrawMode().ordinal();
        if (ordinal == 1) {
            n1g.D(getAvatarView(), c2, me4.c(f, dh4.c().getDisplayMetrics().density, m), 0, 12);
        } else if (ordinal == 2) {
            n1g.D(getImageView(), c2, (getMeasuredHeight() / 2) - (getImageView().getMeasuredHeight() / 2), 0, 12);
        } else if (ordinal == 4) {
            n1g.D(getImageView(), c2, wx3.m(this.y0) + m, 0, 12);
        }
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v16, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v20, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v26, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        if (xq8.$EnumSwitchMapping$0[getDrawMode().ordinal()] == 6) {
            i4 = wx3.m(this.z0) + me4.c((float) 2, dh4.c().getDisplayMetrics().density, wx3.m(this.y0));
            i3 = Math.max(wx3.n(this.y0), wx3.n(this.z0));
        } else {
            float f = (float) 2;
            int m = wx3.m(this.b) + (a24.X(dh4.c().getDisplayMetrics().density * f) * 2);
            float f2 = (float) 6;
            int c2 = me4.c(f2, dh4.c().getDisplayMetrics().density, a24.X(this.D0.getStrokeWidth()));
            int ordinal = getDrawMode().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                i4 = m;
                                i3 = c2;
                            }
                        }
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a24.X(((float) 40) * dh4.c().getDisplayMetrics().density), 1073741824);
                    getImageView().measure(makeMeasureSpec, makeMeasureSpec);
                    int max = getDrawMode() == wq8.c ? Math.max(wx3.n(this.b), wx3.n(this.B0)) + getImageView().getMeasuredWidth() + c2 : Math.max(wx3.n(this.z0) + getImageView().getMeasuredWidth(), wx3.n(this.y0)) + c2;
                    int max2 = Math.max(getImageView().getMeasuredHeight(), wx3.m(this.b) + wx3.m(this.B0)) + m;
                    int i5 = max;
                    i4 = getDrawMode() == wq8.X ? wx3.m(this.y0) + max2 : max2 - wx3.m(this.b);
                    i3 = i5;
                } else {
                    int X = a24.X(f * dh4.c().getDisplayMetrics().density);
                    float f3 = (float) 28;
                    i4 = rf0.b(f3, dh4.c().getDisplayMetrics().density, X, m);
                    i3 = Math.max(wx3.n(this.b), Math.max(wx3.n(this.w0), wx3.n(this.o)) + me4.c(f2, dh4.c().getDisplayMetrics().density, a24.X(dh4.c().getDisplayMetrics().density * f3))) + c2;
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(a24.X(f3 * dh4.c().getDisplayMetrics().density), 1073741824);
                    getAvatarView().measure(makeMeasureSpec2, makeMeasureSpec2);
                }
            }
            i4 = wx3.m(this.c) + m;
            int n = wx3.n(this.b);
            int[] iArr = {wx3.n(this.c), wx3.n(this.y0), wx3.n(this.z0)};
            for (int i6 = 0; i6 < 3; i6++) {
                n = Math.max(n, iArr[i6]);
            }
            i3 = n + c2;
            if (getDrawMode() == wq8.o) {
                i4 = rf0.b(f2, dh4.c().getDisplayMetrics().density, wx3.m(this.z0) + me4.c(f, dh4.c().getDisplayMetrics().density, wx3.m(this.y0)), i4);
            }
        }
        if (i3 <= size) {
            size = i3;
        }
        setMeasuredDimension(size, i4);
    }

    public final void setSingleForward(mq8 mq8) {
        setDrawMode(wq8.Y);
        this.y0 = mq8.b();
        this.z0 = mq8.a();
    }
}
