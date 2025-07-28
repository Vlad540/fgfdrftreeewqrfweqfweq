package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: hm3  reason: default package */
public final class hm3 extends ViewGroup implements i04, yxc, i0c, zq8, vxc {
    public final mz9 A0;
    public final t97 B0;
    public final t97 C0;
    public final h04 D0;
    public final int E0;
    public boolean F0;
    public final nzb a;
    public final uq8 b;
    public final txc c;
    public final u16 o;
    public final r7e w0 = new r7e(new nl1(21, this));
    public final zxc x0 = new zxc(this);
    public final TextView y0;
    public final TextView z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm3(Context context, h87 h87) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        txc txc = new txc();
        this.a = nzb;
        this.b = uq8;
        this.c = txc;
        this.o = h87;
        TextView textView = new TextView(context);
        nge nge = nte.a;
        jp2.i.b(textView, yq4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.y0 = textView;
        TextView textView2 = new TextView(context);
        jp2.f.b(textView2, yq4.b);
        textView2.setTextColor(getSubtitleColor());
        this.z0 = textView2;
        mz9 mz9 = new mz9(context);
        this.A0 = mz9;
        this.B0 = ez3.O(3, new gm3(context, this, 0));
        this.C0 = ez3.O(3, new gm3(context, this, 1));
        h04 h04 = new h04(context);
        h04.setBackgroundEnabled$message_list_release(false);
        this.D0 = h04;
        this.E0 = 4;
        nzb.b = this;
        uq8.b = this;
        txc.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        float f = (float) 44;
        addView(mz9, new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
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

    public static AppCompatImageView a(Context context, hm3 hm3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(hm3.getIconBackground());
        int X = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        float f = (float) 32;
        hm3.addView(appCompatImageView, new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static AppCompatImageView b(Context context, hm3 hm3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(hm3.getIconBackground());
        int X = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        float f = (float) 32;
        hm3.addView(appCompatImageView, new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static ShapeDrawable d(hm3 hm3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(hm3.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final dr0 getColors() {
        return km4.y0.r(this).a().a(this.F0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.w0.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.g;
    }

    private final int getIconColor() {
        return getColors().c.d;
    }

    private final int getSubtitleColor() {
        return getColors().b.e;
    }

    private final int getTitleColor() {
        return getColors().b.d;
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.z0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.y0.setText(charSequence);
    }

    public final void c(dr0 dr0) {
        this.b.c(dr0);
    }

    public final void e() {
        this.y0.setTextColor(getTitleColor());
        this.z0.setTextColor(getSubtitleColor());
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.D0.setTextColor$message_list_release(getColors().c.a);
        t97 t97 = this.C0;
        if (t97.a()) {
            ((AppCompatImageView) t97.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
        t97 t972 = this.B0;
        if (t972.a()) {
            ((AppCompatImageView) t972.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
    }

    public final void f(yr8 yr8, boolean z) {
        this.a.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        k77[] k77Arr = h04.H0;
        this.D0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final void h(t97 t97, Drawable drawable) {
        if (drawable != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) t97.getValue();
            int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            appCompatImageView.setPadding(X, X, X, X);
            appCompatImageView.setImageDrawable(drawable);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
            appCompatImageView.setVisibility(0);
        } else if (t97.a()) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) t97.getValue();
            appCompatImageView2.setImageDrawable((Drawable) null);
            appCompatImageView2.setVisibility(8);
        }
    }

    public final void i(ag3 ag3) {
        this.F0 = ag3.g;
        setTitle(ag3.b);
        setSubtitle(ag3.h);
        dz9 dz9 = dz9.a;
        mz9 mz9 = this.A0;
        mz9.setAvatarShape(dz9);
        mz9.g(new ub0(ag3.e, ag3.a), true);
        mz9.setAvatarUrl(ag3.d);
        t97 t97 = this.C0;
        h(t97, ag3.j);
        t97 t972 = this.B0;
        h(t972, ag3.i);
        if (t97.a()) {
            a24.a0((AppCompatImageView) t97.getValue(), new fm3(this, ag3, 0));
        }
        if (t972.a()) {
            a24.a0((AppCompatImageView) t972.getValue(), new fm3(this, ag3, 1));
        }
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int i6;
        int i7;
        float f2 = (float) 8;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f2);
        float f3 = (float) 10;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f3);
        int X3 = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
        int X4 = a24.X(dh4.c().getDisplayMetrics().density * f3);
        zxc zxc = this.x0;
        if (ek8.L(zxc.b)) {
            zxc.c(X4, X2);
            i5 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, zxc.a(), X2);
        } else {
            i5 = X2;
        }
        txc txc = this.c;
        if (ek8.L((t97) txc.c) && ek8.L(zxc.b)) {
            txc.T((getMeasuredWidth() - X4) - txc.L(), ((zxc.a() / 2) - (txc.K() / 2)) + X2);
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.T(X4, i5);
            i5 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, uq8.K(), i5);
        }
        mz9 mz9 = this.A0;
        int measuredWidth = mz9.getMeasuredWidth() + X + X4;
        TextView textView = this.y0;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.z0;
        if (textView2.getMeasuredHeight() + measuredHeight > mz9.getMeasuredHeight()) {
            n1g.D(textView, measuredWidth, i5, 0, 12);
            n1g.D(textView2, measuredWidth, textView.getBottom(), 0, 12);
            i6 = a24.X((((float) (textView2.getMeasuredHeight() + textView.getMeasuredHeight())) / 2.0f) + ((float) textView.getTop()));
            n1g.D(mz9, X4, i6 - (mz9.getMeasuredHeight() / 2), 0, 12);
            i7 = textView2.getMeasuredHeight() + textView.getMeasuredHeight() + i5;
            f = f3;
        } else {
            n1g.D(mz9, X4, i5, 0, 12);
            int measuredHeight2 = (mz9.getMeasuredHeight() / 2) + i5;
            f = f3;
            n1g.C(textView, measuredWidth, measuredHeight2 - textView.getMeasuredHeight(), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + measuredHeight2);
            n1g.D(textView2, measuredWidth, measuredHeight2, 0, 12);
            i7 = mz9.getMeasuredHeight() + i5;
            i6 = measuredHeight2;
        }
        int i8 = i6 - (X3 / 2);
        int measuredWidth2 = getMeasuredWidth() - X2;
        t97 t97 = this.C0;
        if (ek8.L(t97)) {
            int i9 = measuredWidth2 - X3;
            n1g.C((AppCompatImageView) t97.getValue(), i9, i8, measuredWidth2, i8 + X3);
            measuredWidth2 = i9 - X;
        }
        t97 t972 = this.B0;
        if (ek8.L(t972)) {
            n1g.C((AppCompatImageView) t972.getValue(), measuredWidth2 - X3, i8, measuredWidth2, X3 + i8);
        }
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.T(a24.X(dh4.c().getDisplayMetrics().density * f), me4.c(f2, dh4.c().getDisplayMetrics().density, i7));
            nzb.K();
        }
        int measuredWidth3 = getMeasuredWidth();
        h04 h04 = this.D0;
        int measuredWidth4 = (measuredWidth3 - h04.getMeasuredWidth()) - X;
        int p = me4.p((float) 6, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - h04.getMeasuredHeight());
        int measuredWidth5 = h04.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = h04.getMeasuredHeight() + p;
        View view = (View) h04.getParent();
        if (xy6.w(h04)) {
            h04.layout(view.getMeasuredWidth() - measuredWidth5, p, view.getMeasuredWidth() - measuredWidth4, measuredHeight3);
        } else {
            h04.layout(measuredWidth4, p, measuredWidth5, measuredHeight3);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        int size = View.MeasureSpec.getSize(i);
        float f = (float) 10;
        int l = rf0.l(f, dh4.c().getDisplayMetrics().density, 2, size);
        int X = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
        int X2 = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
        float f2 = (float) 8;
        int X3 = a24.X(dh4.c().getDisplayMetrics().density * f2);
        int X4 = a24.X(dh4.c().getDisplayMetrics().density * f);
        t97 t97 = this.C0;
        int i6 = X + X3;
        Integer valueOf = Integer.valueOf(i6);
        if (!ek8.L(t97)) {
            valueOf = 0;
        }
        int intValue = l - valueOf.intValue();
        t97 t972 = this.B0;
        Integer valueOf2 = Integer.valueOf(i6);
        if (!ek8.L(t972)) {
            valueOf2 = 0;
        }
        int intValue2 = (((intValue - valueOf2.intValue()) - (X2 + X3)) - X4) - X4;
        txc txc = this.c;
        boolean L = ek8.L((t97) txc.c);
        zxc zxc = this.x0;
        if (L && ek8.L(zxc.b)) {
            txc.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i5);
        }
        if (ek8.L(zxc.b)) {
            zxc.d(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i5);
            i3 = me4.c((float) this.E0, dh4.c().getDisplayMetrics().density, zxc.a() + X3);
        } else {
            i3 = a24.X(dh4.c().getDisplayMetrics().density * f);
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i5);
            i3 += uq8.K();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(X2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(X2, 1073741824);
        mz9 mz9 = this.A0;
        mz9.measure(makeMeasureSpec, makeMeasureSpec2);
        TextView textView = this.y0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(intValue2, 1073741824), i5);
        TextView textView2 = this.z0;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(intValue2, Integer.MIN_VALUE), i5);
        if (ek8.L(t97)) {
            ((AppCompatImageView) t97.getValue()).measure(View.MeasureSpec.makeMeasureSpec(X, 1073741824), i5);
        }
        if (ek8.L(t972)) {
            ((AppCompatImageView) t972.getValue()).measure(View.MeasureSpec.makeMeasureSpec(X, 1073741824), i5);
        }
        int max = Math.max(mz9.getMeasuredHeight(), textView2.getMeasuredHeight() + textView.getMeasuredHeight()) + i3;
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i5);
            max = rf0.b(f2, dh4.c().getDisplayMetrics().density, nzb.K(), max);
        }
        h04 h04 = this.D0;
        h04.measure(i, i5);
        float f3 = (float) 6;
        int c2 = me4.c(f, dh4.c().getDisplayMetrics().density, h04.getMeasuredWidth() + me4.c(f3, dh4.c().getDisplayMetrics().density, nzb.L()));
        if (!ek8.L((t97) nzb.c) || c2 >= l) {
            i4 = rf0.b(f3, dh4.c().getDisplayMetrics().density, h04.getMeasuredHeight(), max);
        } else {
            i4 = me4.c(f, dh4.c().getDisplayMetrics().density, max);
        }
        setMeasuredDimension(size, i4);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    public void setChipObserver(syb syb) {
        this.a.setChipObserver(syb);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.D0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.D0.setStatus$message_list_release(dcf);
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

    public void setSenderName(Layout layout) {
        this.x0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.x0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
