package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;

/* renamed from: ubd  reason: default package */
public final class ubd extends ViewGroup implements i04, yxc, wfe, jg6, i0c, zq8, mha, vxc, jf7 {
    public boolean A0;
    public final t97 B0 = ez3.O(3, new sbd(this, 0));
    public final t97 C0 = ez3.O(3, new sbd(this, 1));
    public final zxc D0 = new zxc(this);
    public xz2 E0;
    public final ts8 F0;
    public final t97 G0;
    public final t97 H0;
    public final t97 I0;
    public final t97 J0;
    public final h04 K0;
    public final nzb a;
    public final uq8 b;
    public final nha c;
    public final txc o;
    public final u16 w0;
    public dr0 x0;
    public final Paint y0;
    public final Rect z0 = new Rect();

    /* JADX WARNING: type inference failed for: r2v0, types: [nha, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubd(Context context, h87 h87) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        ? obj = new Object();
        txc txc = new txc();
        this.a = nzb;
        this.b = uq8;
        this.c = obj;
        this.o = txc;
        this.w0 = h87;
        s59 s59 = km4.y0;
        this.x0 = s59.r(this).a().a(true);
        Paint paint = new Paint(1);
        paint.setColor(getInternalBubbleBackgroundColor());
        this.y0 = paint;
        ts8 ts8 = new ts8(context);
        ts8.setId(a7a.N);
        ts8.setLinkLongClickListener(new sic(10, this));
        ts8.setOnLongClickListener(new wk0(8, this));
        ts8.setSingleClickAction(new tbd(this, 0));
        ts8.setTryToSingleClickAction(new tbd(this, 1));
        this.F0 = ts8;
        this.G0 = ez3.O(3, new rbd(context, this, 1));
        this.H0 = ez3.O(3, new rbd(context, this, 2));
        this.I0 = ez3.O(3, new rbd(context, this, 3));
        this.J0 = ez3.O(3, new rbd(context, this, 0));
        h04 h04 = new h04(context);
        h04.setBackgroundEnabled$message_list_release(false);
        this.K0 = h04;
        nzb.b = this;
        uq8.b = this;
        txc.b = this;
        addView(ts8, new ViewGroup.LayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setClickable(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        lu7 lu7 = on8.y;
        pda r = s59.r(this);
        lu7.getClass();
        setBackground(lu7.g(r));
        setTransitionGroup(true);
    }

    public static AppCompatTextView a(Context context, ubd ubd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        nge nge = nte.a;
        jp2.k.b(appCompatTextView, yq4.b);
        appCompatTextView.setTextColor(ubd.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        ubd.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static RippleDrawable b(ubd ubd) {
        float f = dh4.c().getDisplayMetrics().density * 12.0f;
        int internalBubbleBackgroundContentColor = ubd.getInternalBubbleBackgroundContentColor();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        return new RippleDrawable(ColorStateList.valueOf(internalBubbleBackgroundContentColor), (Drawable) null, new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null)));
    }

    public static AppCompatTextView d(Context context, ubd ubd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        nge nge = nte.a;
        jp2.f.b(appCompatTextView, yq4.b);
        appCompatTextView.setTextColor(ubd.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(5);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        ubd.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    private final int getAdditionalTextColor() {
        return this.x0.b.e;
    }

    /* access modifiers changed from: private */
    public final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.C0.getValue();
    }

    private final int getInternalBubbleBackgroundBorderColor() {
        return this.x0.d.c;
    }

    private final int getInternalBubbleBackgroundColor() {
        return this.x0.a.h;
    }

    private final int getInternalBubbleBackgroundContentColor() {
        km4.y0.r(this).c().a.getClass();
        return -1907998;
    }

    /* access modifiers changed from: private */
    public final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.B0.getValue();
    }

    private final int getTitleColor() {
        return this.x0.b.d;
    }

    public static AppCompatTextView h(Context context, ubd ubd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        nge nge = nte.a;
        jp2.i.b(appCompatTextView, yq4.b);
        appCompatTextView.setTextColor(ubd.getTitleColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        ubd.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static ShapeDrawable i(ubd ubd) {
        float f = dh4.c().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(ubd.getInternalBubbleBackgroundBorderColor());
        shapeDrawable.getPaint().setStrokeWidth(dh4.c().getDisplayMetrics().density * 1.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        return shapeDrawable;
    }

    public final void c(dr0 dr0) {
        this.b.c(dr0);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RippleDrawable rippleDrawable = getRippleDrawable();
        Rect rect = this.z0;
        rippleDrawable.setBounds(rect);
        getRippleDrawable().draw(canvas);
        getBorderDrawable().setBounds(rect);
        getBorderDrawable().draw(canvas);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getRippleDrawable().setState(getDrawableState());
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    public final void e(List list, i26 i26) {
        ts8 ts8 = this.F0;
        CharSequence text = ts8.getText();
        if (text != null) {
            if (list == null || list.isEmpty() || i26 == null) {
                ts8.f(ts8);
            } else {
                ts8.g((List) i26.invoke(text.toString(), list));
            }
        }
    }

    public final void f(yr8 yr8, boolean z) {
        this.a.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.K0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.h0();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public xz2 getOnLinkLongClickListener() {
        return this.E0;
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void n(dr0 dr0) {
        this.x0 = dr0;
        t97 t97 = this.H0;
        if (t97.a()) {
            ((AppCompatTextView) t97.getValue()).setTextColor(getTitleColor());
        }
        t97 t972 = this.G0;
        if (t972.a()) {
            ((AppCompatTextView) t972.getValue()).setTextColor(getAdditionalTextColor());
        }
        t97 t973 = this.I0;
        if (t973.a()) {
            ((AppCompatTextView) t973.getValue()).setTextColor(getAdditionalTextColor());
        }
        this.y0.setColor(getInternalBubbleBackgroundColor());
        getRippleDrawable().setColor(ColorStateList.valueOf(getInternalBubbleBackgroundContentColor()));
        getBorderDrawable().getPaint().setColor(getInternalBubbleBackgroundBorderColor());
        setDateTextColor(dr0.b.f);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.z0;
        if (!rect.isEmpty()) {
            float f = dh4.c().getDisplayMetrics().density * 12.0f;
            canvas.drawRoundRect(new RectF(rect), f, f, this.y0);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f = (float) 10;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        float f2 = (float) 8;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f2);
        int X3 = a24.X(f2 * dh4.c().getDisplayMetrics().density);
        zxc zxc = this.D0;
        if (ek8.L(zxc.b)) {
            zxc.c(X, X3);
            i5 = me4.c((float) 4, dh4.c().getDisplayMetrics().density, zxc.a() + X3);
        } else {
            i5 = X;
        }
        txc txc = this.o;
        if (ek8.L((t97) txc.c) && ek8.L(zxc.b)) {
            txc.T((getMeasuredWidth() - X) - txc.L(), ((zxc.a() / 2) - (txc.K() / 2)) + X3);
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.T(X, i5);
            i5 += uq8.K();
        }
        ts8 ts8 = this.F0;
        n1g.D(ts8, X, i5, 0, 12);
        int X4 = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density) + ts8.getMeasuredHeight() + i5 + X2;
        int i7 = X + X2;
        t97 t97 = this.G0;
        if (ek8.L(t97)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) t97.getValue();
            n1g.D(appCompatTextView, i7, X4, 0, 12);
            i6 = appCompatTextView.getMeasuredHeight() + X4;
        } else {
            i6 = X4;
        }
        t97 t972 = this.H0;
        if (ek8.L(t972)) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) t972.getValue();
            n1g.D(appCompatTextView2, i7, i6, 0, 12);
            i6 += appCompatTextView2.getMeasuredHeight();
        }
        t97 t973 = this.I0;
        if (ek8.L(t973)) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) t973.getValue();
            n1g.D(appCompatTextView3, i7, i6, 0, 12);
            i6 += appCompatTextView3.getMeasuredHeight();
        }
        t97 t974 = this.J0;
        if (ek8.L(t974)) {
            on4 on4 = (xp6) t974.getValue();
            boolean z2 = this.A0;
            if (z2) {
                X4 = i6 + X2;
            }
            n1g.D(on4, z2 ? X : ((getMeasuredWidth() - X) - X2) - on4.getMeasuredWidth(), X4, 0, 12);
            float f3 = this.A0 ? 0.0f : dh4.c().getDisplayMetrics().density * 4.0f;
            float f4 = this.A0 ? dh4.c().getDisplayMetrics().density * 12.0f : 4.0f * dh4.c().getDisplayMetrics().density;
            on4.getHierarchy().n(pgc.a(f3, f3, f4, f4));
            on4.getMeasuredHeight();
        }
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.T(a24.X(f * dh4.c().getDisplayMetrics().density), me4.p((float) 2, dh4.c().getDisplayMetrics().density, me4.p(f, dh4.c().getDisplayMetrics().density, getMeasuredHeight())) - nzb.K());
        }
        int measuredWidth = getMeasuredWidth();
        h04 h04 = this.K0;
        n1g.D(h04, (measuredWidth - h04.getMeasuredWidth()) - X, me4.p((float) 4, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - h04.getMeasuredHeight()), 0, 12);
    }

    /* JADX WARNING: type inference failed for: r14v8, types: [android.view.View, xp6] */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : rf0.l((float) 10, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        float f = (float) 10;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        ts8 ts8 = this.F0;
        ts8.h();
        int i7 = X * 2;
        int max = Math.max(ts8.getMeasuredWidth() + i7, size);
        int i8 = max - i7;
        float f2 = (float) 8;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f2);
        txc txc = this.o;
        boolean L = ek8.L((t97) txc.c);
        zxc zxc = this.D0;
        if (L && ek8.L(zxc.b)) {
            txc.U(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i6);
            max = Math.max(max, txc.L());
        }
        if (ek8.L(zxc.b)) {
            zxc.d(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i6);
            max = Math.max(max, zxc.b() + i7 + txc.h0());
            i3 = me4.c((float) 4, dh4.c().getDisplayMetrics().density, zxc.a() + a24.X(dh4.c().getDisplayMetrics().density * f2));
        } else {
            i3 = X;
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i6);
            max = Math.max(max, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + uq8.L());
            i3 += uq8.K();
        }
        int b2 = rf0.b((float) 6, dh4.c().getDisplayMetrics().density, ts8.getMeasuredHeight(), i3);
        int i9 = X2 * 2;
        int i10 = i8 - i9;
        t97 t97 = this.J0;
        boolean z = false;
        boolean z2 = true;
        if (ek8.L(t97)) {
            ? r14 = (xp6) t97.getValue();
            boolean z3 = r14.getImageAttach().c * 2 >= i8;
            this.A0 = z3;
            if (z3) {
                r14.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(a24.X(((float) 128) * dh4.c().getDisplayMetrics().density), 1073741824));
            } else {
                int X3 = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
                r14.measure(View.MeasureSpec.makeMeasureSpec(X3, 1073741824), View.MeasureSpec.makeMeasureSpec(X3, 1073741824));
                i10 -= X3 + X2;
            }
            z = true;
        }
        t97 t972 = this.G0;
        if (ek8.L(t972)) {
            i4 = Integer.MIN_VALUE;
            ((AppCompatTextView) t972.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i6);
            z = true;
        } else {
            i4 = Integer.MIN_VALUE;
        }
        t97 t973 = this.H0;
        if (ek8.L(t973)) {
            ((AppCompatTextView) t973.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i10, i4), i6);
            z = true;
        }
        t97 t974 = this.I0;
        if (ek8.L(t974)) {
            ((AppCompatTextView) t974.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i10, i4), i6);
        } else {
            z2 = z;
        }
        if (z2) {
            int C = ek8.C(t974) + ek8.C(t973) + ek8.C(t972) + i9;
            if (this.A0) {
                i5 = ek8.C(t97) + C;
            } else {
                int C2 = ek8.C(t97) + i9;
                if (C < C2) {
                    C = C2;
                }
                i5 = C;
            }
            int i11 = i5 + b2;
            this.z0.set(X, b2, max - X, i11);
            b2 = i11;
        }
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i6);
            b2 = rf0.b(f, dh4.c().getDisplayMetrics().density, nzb.K(), b2);
            max = Math.max(max, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + nzb.L());
        }
        h04 h04 = this.K0;
        h04.measure(i, i6);
        setMeasuredDimension(max, b2 + (ek8.L((t97) nzb.c) ? a24.X(f * dh4.c().getDisplayMetrics().density) : me4.c(f2, dh4.c().getDisplayMetrics().density, h04.getMeasuredHeight() + a24.X(((float) 2) * dh4.c().getDisplayMetrics().density))));
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    public void setChipObserver(syb syb) {
        this.a.setChipObserver(syb);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.K0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.K0.setStatus$message_list_release(dcf);
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

    public void setOnLinkLongClickListener(xz2 xz2) {
        this.E0 = xz2;
    }

    public void setReplyClickListener(i26 i26) {
        this.b.o = i26;
    }

    public void setSenderName(Layout layout) {
        this.D0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.D0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    public void setTextMessageColors(dr0 dr0) {
        this.F0.setTextColors(dr0);
    }

    public void setTextMessageLayout(qs8 qs8) {
        this.F0.setLayout(qs8);
    }

    public void setTextMessageLinkClickListener(of7 of7) {
        this.F0.setLinkListener(of7);
    }
}
