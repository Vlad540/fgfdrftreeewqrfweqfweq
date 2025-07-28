package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: sb1  reason: default package */
public final class sb1 extends ViewGroup implements i04, yxc, i0c, vxc {
    public final int A0;
    public final int B0;
    public boolean C0;
    public boolean D0;
    public final nzb a;
    public final txc b;
    public final r7e c = new r7e(new c6(26, this));
    public final zxc o = new zxc(this);
    public final TextView w0;
    public final TextView x0;
    public final AppCompatImageView y0;
    public final h04 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb1(Context context) {
        super(context);
        nzb nzb = new nzb();
        txc txc = new txc();
        this.a = nzb;
        this.b = txc;
        TextView textView = new TextView(context);
        nge nge = nte.a;
        jp2.i.b(textView, yq4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.w0 = textView;
        TextView textView2 = new TextView(context);
        jp2.f.b(textView2, yq4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.x0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(getIconBackground());
        int X = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        this.y0 = appCompatImageView;
        h04 h04 = new h04(context);
        h04.setBackgroundEnabled$message_list_release(false);
        this.z0 = h04;
        this.A0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        int X2 = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        this.B0 = X2;
        nzb.b = this;
        txc.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(X2, X2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        lu7 lu7 = on8.y;
        pda r = km4.y0.r(this);
        lu7.getClass();
        setBackground(lu7.g(r));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static ShapeDrawable a(sb1 sb1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dh4.c().getDisplayMetrics().density * 12.0f, dh4.c().getDisplayMetrics().density * 12.0f, dh4.c().getDisplayMetrics().density * 12.0f, dh4.c().getDisplayMetrics().density * 12.0f, dh4.c().getDisplayMetrics().density * 12.0f, dh4.c().getDisplayMetrics().density * 12.0f, dh4.c().getDisplayMetrics().density * 12.0f, dh4.c().getDisplayMetrics().density * 12.0f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(sb1.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final dr0 getColors() {
        return km4.y0.r(this).a().a(this.D0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.c.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.i;
    }

    private final int getIconColor() {
        boolean z = this.D0;
        s59 s59 = km4.y0;
        return (!z || !this.C0) ? z ? s59.r(this).getIcon().f : getColors().c.f : s59.r(this).getIcon().c;
    }

    private final int getSubtitleColor() {
        return getColors().b.e;
    }

    private final int getTitleColor() {
        return getColors().b.d;
    }

    private final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.y0;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.x0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.w0.setText(charSequence);
    }

    public final void b() {
        this.w0.setTextColor(getTitleColor());
        this.x0.setTextColor(getSubtitleColor());
        this.y0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.z0.setTextColor$message_list_release(getColors().c.a);
    }

    public final void c(pz0 pz0) {
        this.D0 = pz0.f;
        this.C0 = pz0.c;
        setTitle(pz0.a);
        setSubtitle(pz0.b);
        setIcon(pz0.d);
    }

    public final void f(yr8 yr8, boolean z) {
        this.a.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        k77[] k77Arr = h04.H0;
        this.z0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.b.h0();
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        zxc zxc = this.o;
        boolean L = ek8.L(zxc.b);
        int i6 = this.A0;
        if (L) {
            zxc.c(i6, i6);
            i5 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, zxc.a(), i6);
        } else {
            i5 = i6;
        }
        txc txc = this.b;
        if (ek8.L((t97) txc.c) && ek8.L(zxc.b)) {
            txc.T((getMeasuredWidth() - i6) - txc.L(), ((zxc.a() / 2) - (txc.K() / 2)) + i6);
        }
        AppCompatImageView appCompatImageView = this.y0;
        int i7 = this.B0;
        int i8 = i6 + i7;
        n1g.C(appCompatImageView, i6, i5, i8, i7 + i5);
        int i9 = i8 + i6;
        TextView textView = this.w0;
        n1g.D(textView, i9, i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight() + i5;
        TextView textView2 = this.x0;
        n1g.D(textView2, i9, measuredHeight, 0, 12);
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            float f = (float) 10;
            nzb.T(a24.X(f * dh4.c().getDisplayMetrics().density), me4.c(f, dh4.c().getDisplayMetrics().density, measuredHeight2));
        }
        int measuredWidth = getMeasuredWidth();
        h04 h04 = this.z0;
        n1g.D(h04, (measuredWidth - h04.getMeasuredWidth()) - i6, me4.p((float) 4, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - h04.getMeasuredHeight()), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int l = rf0.l(f, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) * 2;
        txc txc = this.b;
        boolean L = ek8.L((t97) txc.c);
        zxc zxc = this.o;
        if (L && ek8.L(zxc.b)) {
            txc.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
        }
        if (ek8.L(zxc.b)) {
            zxc.d(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            i3 = txc.h0() + zxc.b();
            X = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, zxc.a(), X);
        } else {
            i3 = 0;
        }
        h04 h04 = this.z0;
        h04.measure(i, i2);
        this.y0.measure(View.MeasureSpec.makeMeasureSpec(l, 1073741824), i2);
        int i4 = this.B0;
        int i5 = this.A0;
        int i6 = l - (i4 + i5);
        TextView textView = this.w0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
        TextView textView2 = this.x0;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
        int i7 = i5 * 2;
        int min = i7 + Math.min(l, h04.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), Math.max(textView2.getMeasuredWidth(), i3)) + i4);
        int measuredHeight = h04.getMeasuredHeight() + textView.getMeasuredHeight() + textView2.getMeasuredHeight() + X;
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            min = Math.max(min, nzb.L());
            measuredHeight = rf0.b(f, dh4.c().getDisplayMetrics().density, nzb.K(), measuredHeight);
        }
        setMeasuredDimension(min, measuredHeight);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.b.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.b.setAliasColor(i);
    }

    public void setChipObserver(syb syb) {
        this.a.setChipObserver(syb);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.z0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.z0.setStatus$message_list_release(dcf);
    }

    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    public void setOnClickListener(u16 u16) {
        this.a.X = u16;
    }

    public void setSenderName(Layout layout) {
        this.o.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.o.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
