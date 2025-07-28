package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: r40  reason: default package */
public final class r40 extends ViewGroup implements yxc, i04, i0c, zq8, vxc {
    public static final int Z0 = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
    public static final int a1 = a24.X(((float) 36) * dh4.c().getDisplayMetrics().density);
    public static final int b1 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public final h04 F0;
    public final int G0;
    public final t60 H0;
    public final AppCompatTextView I0;
    public boolean J0;
    public dr0 K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    public Long S0;
    public Long T0;
    public x40 U0;
    public String V0;
    public g37 W0;
    public g37 X0;
    public q40 Y0;
    public final u16 a;
    public final s16 b;
    public final nzb c;
    public final uq8 o;
    public final txc w0;
    public final zxc x0 = new zxc(this);
    public final int y0;
    public final AppCompatImageView z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r40(Context context, h87 h87, a09 a09) {
        super(context);
        Context context2 = context;
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        txc txc = new txc();
        this.a = h87;
        this.b = a09;
        this.c = nzb;
        this.o = uq8;
        this.w0 = txc;
        int i = Z0;
        this.y0 = i;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2, (AttributeSet) null);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.z0 = appCompatImageView;
        this.A0 = ez3.O(3, new b5(context2, 1));
        this.B0 = ez3.O(3, new m(13));
        this.C0 = ez3.O(3, new c6(12, this));
        this.D0 = ez3.O(3, new b5(context2, 2));
        this.E0 = ez3.O(3, new b5(context2, 3));
        h04 h04 = new h04(context2);
        h04.setBackgroundEnabled$message_list_release(false);
        this.F0 = h04;
        int X = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        this.G0 = X;
        t60 t60 = new t60(context2);
        this.H0 = t60;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        nge nge = nte.a;
        jp2.d.b(appCompatTextView, yq4.b);
        this.I0 = appCompatTextView;
        s59 s59 = km4.y0;
        this.K0 = s59.r(this).a().a(this.J0);
        this.L0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.M0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        float f2 = (float) 8;
        this.N0 = a24.X(dh4.c().getDisplayMetrics().density * f2);
        this.O0 = a24.X(f2 * dh4.c().getDisplayMetrics().density);
        this.P0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.Q0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.R0 = a24.X(f * dh4.c().getDisplayMetrics().density);
        this.V0 = "";
        nzb.b = this;
        uq8.b = this;
        txc.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(i, i));
        addView(t60, new ViewGroup.LayoutParams(-1, X));
        lu7 lu7 = on8.y;
        pda r = s59.r(this);
        lu7.getClass();
        setBackground(lu7.g(r));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        t60.setListener(new mod(3, this));
    }

    public static LayerDrawable a(r40 r40) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{r40.getProgressDrawable(), r40.getDrawableInsideProgress()});
        int i = a1;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = b1;
        int i3 = (i - i2) / 2;
        layerDrawable.setLayerSize(1, i2, i2);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        return layerDrawable;
    }

    private final Drawable getDrawableInsideProgress() {
        return (Drawable) this.A0.getValue();
    }

    private final InsetDrawable getPauseDrawable() {
        return (InsetDrawable) this.E0.getValue();
    }

    private final InsetDrawable getPlayDrawable() {
        return (InsetDrawable) this.D0.getValue();
    }

    private final ov6 getProgressDrawable() {
        return (ov6) this.B0.getValue();
    }

    private final LayerDrawable getProgressDrawableWithIcon() {
        return (LayerDrawable) this.C0.getValue();
    }

    public final void b() {
        dr0 a2 = km4.y0.r(this).a().a(this.J0);
        this.K0 = a2;
        AppCompatImageView appCompatImageView = this.z0;
        appCompatImageView.setBackground(swb.H(Integer.valueOf(a2.a.e), (Integer) null, (Integer) null));
        appCompatImageView.setColorFilter(this.K0.c.c);
        Drawable drawableInsideProgress = getDrawableInsideProgress();
        if (drawableInsideProgress != null) {
            drawableInsideProgress.setTint(this.K0.c.c);
        }
        getProgressDrawable().b = new int[]{this.K0.c.c, 0};
        this.H0.setIncomingMessage(this.J0);
        this.I0.setTextColor(this.K0.b.c);
        this.F0.setTextColor$message_list_release(this.K0.c.a);
    }

    public final void c(dr0 dr0) {
        this.o.c(dr0);
    }

    public final void d(o20 o20) {
        boolean equals = o20.equals(zl3.a);
        AppCompatImageView appCompatImageView = this.z0;
        if (equals) {
            appCompatImageView.setImageDrawable(getProgressDrawableWithIcon());
        } else if (o20.equals(om3.a)) {
            appCompatImageView.setImageDrawable(getPauseDrawable());
        } else if (o20.equals(m54.b) || o20.equals(qr4.b)) {
            appCompatImageView.setImageDrawable(getPlayDrawable());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void f(yr8 yr8, boolean z) {
        this.c.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        k77[] k77Arr = h04.H0;
        this.F0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.w0.h0();
    }

    public final void k(dr0 dr0, boolean z) {
        this.c.k(dr0, z);
    }

    public final void l() {
        this.o.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        zxc zxc = this.x0;
        boolean L = ek8.L(zxc.b);
        int i5 = this.N0;
        int i6 = this.L0;
        int i7 = L ? i5 : i6;
        t97 t97 = zxc.b;
        if (ek8.L(t97)) {
            int a2 = zxc.a() + i7;
            zxc.c(i6, i7);
            i7 = this.R0 + a2;
        }
        txc txc = this.w0;
        if (ek8.L((t97) txc.c) && ek8.L(t97)) {
            txc.T((getMeasuredWidth() - i6) - txc.L(), ((zxc.a() / 2) - (txc.K() / 2)) + i5);
        }
        uq8 uq8 = this.o;
        if (ek8.L((t97) uq8.c)) {
            uq8.T(i6, i7);
            i7 += uq8.K() + this.Q0;
        }
        AppCompatImageView appCompatImageView = this.z0;
        int measuredWidth = appCompatImageView.getMeasuredWidth() + i6;
        int measuredHeight = appCompatImageView.getMeasuredHeight() + i7;
        View view = (View) appCompatImageView.getParent();
        if (xy6.w(appCompatImageView)) {
            appCompatImageView.layout(view.getMeasuredWidth() - measuredWidth, i7, view.getMeasuredWidth() - i6, measuredHeight);
        } else {
            appCompatImageView.layout(i6, i7, measuredWidth, measuredHeight);
        }
        int measuredWidth2 = appCompatImageView.getMeasuredWidth() + this.O0 + i6;
        int p = me4.p((float) 6, dh4.c().getDisplayMetrics().density, measuredWidth2);
        t60 t60 = this.H0;
        int measuredWidth3 = t60.getMeasuredWidth() + measuredWidth2;
        int measuredHeight2 = t60.getMeasuredHeight() + i7;
        View view2 = (View) t60.getParent();
        if (xy6.w(t60)) {
            t60.layout(view2.getMeasuredWidth() - measuredWidth3, i7, view2.getMeasuredWidth() - p, measuredHeight2);
        } else {
            t60.layout(p, i7, measuredWidth3, measuredHeight2);
        }
        int measuredHeight3 = t60.getMeasuredHeight() + this.P0 + i7;
        AppCompatTextView appCompatTextView = this.I0;
        int measuredWidth4 = appCompatTextView.getMeasuredWidth() + measuredWidth2;
        int measuredHeight4 = appCompatTextView.getMeasuredHeight() + measuredHeight3;
        View view3 = (View) appCompatTextView.getParent();
        if (xy6.w(appCompatTextView)) {
            appCompatTextView.layout(view3.getMeasuredWidth() - measuredWidth4, measuredHeight3, view3.getMeasuredWidth() - measuredWidth2, measuredHeight4);
        } else {
            appCompatTextView.layout(measuredWidth2, measuredHeight3, measuredWidth4, measuredHeight4);
        }
        int bottom = appCompatImageView.getBottom();
        nzb nzb = this.c;
        if (ek8.L((t97) nzb.c)) {
            float f = (float) 10;
            nzb.T(a24.X(f * dh4.c().getDisplayMetrics().density), me4.c(f, dh4.c().getDisplayMetrics().density, bottom));
        }
        int measuredWidth5 = getMeasuredWidth();
        h04 h04 = this.F0;
        int measuredWidth6 = (measuredWidth5 - h04.getMeasuredWidth()) - i6;
        int measuredHeight5 = (getMeasuredHeight() - h04.getMeasuredHeight()) - this.M0;
        int measuredWidth7 = h04.getMeasuredWidth() + measuredWidth6;
        int measuredHeight6 = h04.getMeasuredHeight() + measuredHeight5;
        View view4 = (View) h04.getParent();
        if (xy6.w(h04)) {
            h04.layout(view4.getMeasuredWidth() - measuredWidth7, measuredHeight5, view4.getMeasuredWidth() - measuredWidth6, measuredHeight6);
        } else {
            h04.layout(measuredWidth6, measuredHeight5, measuredWidth7, measuredHeight6);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        Long l = this.T0;
        if (l != null) {
            float f = (float) 192;
            i3 = (int) ((((float) me4.p(f, dh4.c().getDisplayMetrics().density, View.MeasureSpec.getSize(i))) * (((float) (gwf.k(l.longValue(), 1000, 30000) - 1000)) / ((float) 29000))) + ((float) a24.X(dh4.c().getDisplayMetrics().density * f)));
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        zxc zxc = this.x0;
        boolean L = ek8.L(zxc.b);
        int i4 = this.L0;
        int i5 = L ? this.N0 : i4;
        txc txc = this.w0;
        if (ek8.L((t97) txc.c) && ek8.L(zxc.b)) {
            txc.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
        }
        if (ek8.L(zxc.b)) {
            zxc.d(View.MeasureSpec.makeMeasureSpec(i3 - i4, Integer.MIN_VALUE), i2);
            i5 += zxc.a() + this.R0;
        }
        uq8 uq8 = this.o;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            i5 += uq8.K() + this.Q0;
        }
        this.F0.measure(i, i2);
        AppCompatTextView appCompatTextView = this.I0;
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
        AppCompatImageView appCompatImageView = this.z0;
        int i6 = this.y0;
        appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        float f2 = (float) 10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((a24.X(((float) 6) * dh4.c().getDisplayMetrics().density) * 2) + ((i3 - appCompatImageView.getMeasuredWidth()) - this.O0)) - (a24.X(dh4.c().getDisplayMetrics().density * f2) * 2), 1073741824);
        int i7 = this.G0;
        this.H0.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
        int max = Math.max(appCompatImageView.getMeasuredHeight() + i4, appCompatTextView.getMeasuredHeight() + i7 + this.P0 + this.M0) + i5;
        nzb nzb = this.c;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            max = rf0.b(f2, dh4.c().getDisplayMetrics().density, nzb.K(), max);
        }
        setMeasuredDimension(i3, max);
    }

    public final void q(boolean z) {
        this.c.q(z);
    }

    public void setAlias(Layout layout) {
        this.w0.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.w0.setAliasColor(i);
    }

    public final void setAudio(m40 m40) {
        q40 q40;
        this.S0 = Long.valueOf(m40.b);
        long j = m40.j;
        this.T0 = Long.valueOf(j);
        boolean z = m40.c;
        this.J0 = z;
        this.V0 = m40.d;
        t60 t60 = this.H0;
        t60.setIncomingMessage(z);
        t60.b(j, m40.h);
        this.I0.setText(m40.i);
        a24.a0(this.z0, new n40(this, m40, 1));
        this.Y0 = new q40(this, 0, m40);
        if (isAttachedToWindow() && (q40 = this.Y0) != null) {
            q40.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.Y0);
        requestLayout();
    }

    public void setChipObserver(syb syb) {
        this.c.setChipObserver(syb);
    }

    public void setDateBackgroundColor(int i) {
        this.F0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.F0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.F0.setStatus$message_list_release(dcf);
    }

    public void setForwardClickListener(u16 u16) {
        this.o.X = u16;
    }

    public void setIsIncoming(boolean z) {
        this.c.o = z;
    }

    public void setLink(tq8 tq8) {
        this.o.setLink(tq8);
    }

    public void setOnClickListener(u16 u16) {
        this.c.X = u16;
    }

    public void setReplyClickListener(i26 i26) {
        this.o.o = i26;
    }

    public void setSenderName(Layout layout) {
        this.x0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.x0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.c.Z = z;
    }
}
