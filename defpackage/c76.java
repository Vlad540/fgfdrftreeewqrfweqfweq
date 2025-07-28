package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
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

/* renamed from: c76  reason: default package */
public final class c76 extends ViewGroup implements i04, yxc, i0c, zq8, vxc {
    public final AppCompatImageView A0;
    public final h04 B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final nzb a;
    public final uq8 b;
    public final txc c;
    public dr0 o;
    public final r7e w0 = new r7e(new gz3(17, this));
    public final zxc x0 = new zxc(this);
    public final TextView y0;
    public final TextView z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c76(Context context) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        txc txc = new txc();
        this.a = nzb;
        this.b = uq8;
        this.c = txc;
        s59 s59 = km4.y0;
        this.o = s59.r(this).a().c();
        TextView textView = new TextView(context);
        nge nge = nte.a;
        jp2.i.b(textView, yq4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.y0 = textView;
        TextView textView2 = new TextView(context);
        jp2.f.b(textView2, yq4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.z0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(getIconBackground());
        int X = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        this.A0 = appCompatImageView;
        h04 h04 = new h04(context);
        h04.setBackgroundEnabled$message_list_release(false);
        this.B0 = h04;
        this.C0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.D0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.E0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.F0 = a24.X(f * dh4.c().getDisplayMetrics().density);
        int X2 = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        this.G0 = X2;
        uq8.b = this;
        nzb.b = this;
        txc.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(X2, X2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        lu7 lu7 = on8.y;
        pda r = s59.r(this);
        lu7.getClass();
        setBackground(lu7.g(r));
    }

    public static ShapeDrawable a(c76 c76) {
        float f = dh4.c().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(c76.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.w0.getValue();
    }

    private final int getIconBackgroundColor() {
        return this.o.a.i;
    }

    private final int getIconColor() {
        return this.o.c.f;
    }

    private final int getSubtitleColor() {
        return this.o.b.e;
    }

    private final int getTitleColor() {
        return this.o.b.d;
    }

    public final void b(b76 b76, boolean z) {
        this.o = km4.y0.r(this).a().a(z);
        TextView textView = this.y0;
        textView.setText(b76.b);
        textView.setTextColor(getTitleColor());
        TextView textView2 = this.z0;
        textView2.setText(b76.c);
        textView2.setTextColor(getSubtitleColor());
        int i = phc.Q;
        AppCompatImageView appCompatImageView = this.A0;
        appCompatImageView.setImageResource(i);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    public final void c(dr0 dr0) {
        this.b.c(dr0);
    }

    public final void d(dr0 dr0) {
        this.o = dr0;
        this.y0.setTextColor(getTitleColor());
        this.z0.setTextColor(getSubtitleColor());
        this.A0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.B0.setTextColor$message_list_release(this.o.c.a);
    }

    public final void f(yr8 yr8, boolean z) {
        this.a.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        k77[] k77Arr = h04.H0;
        this.B0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        zxc zxc = this.x0;
        boolean L = ek8.L(zxc.b);
        int i6 = this.C0;
        if (L) {
            zxc.c(i6, i6);
            i5 = zxc.a() + this.D0 + i6;
        } else {
            i5 = i6;
        }
        txc txc = this.c;
        boolean L2 = ek8.L((t97) txc.c);
        int i7 = this.C0;
        if (L2 && ek8.L(zxc.b)) {
            txc.T((getMeasuredWidth() - i7) - txc.L(), ((zxc.a() / 2) - (txc.K() / 2)) + i7);
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.T(i6, i5);
            i5 += uq8.K() + this.F0;
        }
        AppCompatImageView appCompatImageView = this.A0;
        int i8 = this.G0;
        int i9 = i5;
        xy6.z(i6, i9, i6 + i8, i5 + i8, appCompatImageView, this);
        int i10 = i6 + i8 + i7;
        TextView textView = this.y0;
        int i11 = i10;
        xy6.z(i11, i9, textView.getMeasuredWidth() + i10, textView.getMeasuredHeight() + i5, textView, this);
        int measuredHeight = textView.getMeasuredHeight() + i5;
        TextView textView2 = this.z0;
        xy6.z(i11, measuredHeight, textView2.getMeasuredWidth() + i10, textView2.getMeasuredHeight() + measuredHeight, textView2, this);
        int bottom = appCompatImageView.getBottom();
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            float f = (float) 10;
            nzb.T(a24.X(f * dh4.c().getDisplayMetrics().density), me4.c(f, dh4.c().getDisplayMetrics().density, bottom));
            nzb.K();
        }
        int measuredWidth = getMeasuredWidth();
        h04 h04 = this.B0;
        int measuredWidth2 = (measuredWidth - h04.getMeasuredWidth()) - i7;
        int measuredHeight2 = (getMeasuredHeight() - h04.getMeasuredHeight()) - this.E0;
        h04 h042 = this.B0;
        xy6.z(measuredWidth2, measuredHeight2, h042.getMeasuredWidth() + measuredWidth2, h04.getMeasuredHeight() + measuredHeight2, h042, this);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.C0;
        int i5 = size - (i4 * 2);
        txc txc = this.c;
        boolean L = ek8.L((t97) txc.c);
        zxc zxc = this.x0;
        int i6 = 0;
        if (L && ek8.L(zxc.b)) {
            txc.U(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            i6 = Math.max(0, txc.L());
        }
        if (ek8.L(zxc.b)) {
            zxc.d(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            i6 = Math.max(i6, (i4 * 2) + zxc.b() + txc.h0());
            i3 = zxc.a() + this.D0 + i4;
        } else {
            i3 = i4;
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            i6 = Math.max(i6, (i4 * 2) + uq8.L());
            i3 += uq8.K() + this.F0;
        }
        h04 h04 = this.B0;
        h04.measure(i, i2);
        this.A0.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i2);
        int i7 = this.G0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i5 - i7) - (i4 * 2), Integer.MIN_VALUE);
        TextView textView = this.y0;
        textView.measure(makeMeasureSpec, i2);
        TextView textView2 = this.z0;
        textView2.measure(makeMeasureSpec, i2);
        int max = Math.max(Math.min(i5, h04.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), textView2.getMeasuredWidth()) + i7) + i4, i6);
        int measuredHeight = textView2.getMeasuredHeight();
        int measuredHeight2 = h04.getMeasuredHeight() + me4.c((float) 2, dh4.c().getDisplayMetrics().density, textView.getMeasuredHeight() + measuredHeight) + this.E0 + i3;
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            float f = (float) 10;
            max = Math.max(max, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + nzb.L());
            measuredHeight2 = rf0.b(f, dh4.c().getDisplayMetrics().density, nzb.K(), measuredHeight2);
        }
        setMeasuredDimension(max, measuredHeight2);
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
        this.B0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.B0.setStatus$message_list_release(dcf);
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
