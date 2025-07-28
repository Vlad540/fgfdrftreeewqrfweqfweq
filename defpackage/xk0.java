package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: xk0  reason: default package */
public final class xk0 extends ViewGroup implements i04, wfe, i0c, zq8, mha {
    public final nzb a;
    public final uq8 b;
    public final nha c;
    public final ts8 o;
    public final h04 w0;
    public final int x0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
    public final t97 y0 = ez3.O(3, new c6(14, this));

    /* JADX WARNING: type inference failed for: r2v0, types: [nha, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xk0(Context context) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        ? obj = new Object();
        this.a = nzb;
        this.b = uq8;
        this.c = obj;
        ts8 ts8 = new ts8(context);
        ts8.setId(a7a.N);
        this.o = ts8;
        h04 h04 = new h04(context);
        this.w0 = h04;
        nzb.b = this;
        uq8.b = this;
        ts8.setSingleClickAction(new b(15, (Object) this));
        ts8.setOnLongClickListener(new wk0(0, this));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(ts8, new ViewGroup.LayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
    }

    private final on8 getMessageBackground() {
        return (on8) this.y0.getValue();
    }

    public final void c(dr0 dr0) {
        this.b.c(dr0);
    }

    public final void f(yr8 yr8, boolean z) {
        this.a.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.w0.c(charSequence, z);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final CharSequence getText() {
        return this.o.getText();
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void l() {
        this.b.l();
        this.w0.setBackgroundEnabled$message_list_release(true);
        setBackground((Drawable) null);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        uq8 uq8 = this.b;
        boolean L = ek8.L((t97) uq8.c);
        int i6 = this.x0;
        if (L) {
            uq8.T(i6, i6);
            i5 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, uq8.K(), i6);
        } else {
            i5 = i6;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        rn8 rn8 = layoutParams instanceof rn8 ? (rn8) layoutParams : null;
        int i7 = 0;
        boolean z2 = rn8 != null && !rn8.a;
        ts8 ts8 = this.o;
        t97 t97 = (t97) uq8.c;
        n1g.D(ts8, (!z2 || ek8.L(t97)) ? i6 : (getMeasuredWidth() - ts8.getMeasuredWidth()) - i6, i5, 0, 12);
        int measuredHeight = ts8.getMeasuredHeight() + (getBackground() == null ? a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) : 0) + i5;
        boolean L2 = ek8.L(t97);
        h04 h04 = this.w0;
        if (L2 || z2) {
            measuredWidth = getMeasuredWidth() - h04.getMeasuredWidth();
        } else {
            measuredWidth = ts8.getMeasuredWidth();
            i6 = h04.getMeasuredWidth();
        }
        n1g.D(h04, measuredWidth - i6, measuredHeight, 0, 12);
        int c2 = measuredHeight + (getBackground() != null ? me4.c((float) 4, dh4.c().getDisplayMetrics().density, h04.getMeasuredHeight()) : h04.getMeasuredHeight());
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            if (nzb.Z) {
                i7 = getMeasuredWidth() - nzb.L();
            }
            nzb.T(i7, a24.X(((float) 10) * dh4.c().getDisplayMetrics().density) + c2);
        }
    }

    public final void onMeasure(int i, int i2) {
        float f = (float) 10;
        int l = rf0.l(f, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        ts8 ts8 = this.o;
        ts8.h();
        int measuredWidth = getDependOnOutsideView() ? l : ts8.getMeasuredWidth();
        int measuredHeight = ts8.getMeasuredHeight() + (getBackground() == null ? a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) : 0);
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, uq8.L());
            measuredHeight = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, uq8.K(), measuredHeight);
        }
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, nzb.L());
            int c2 = me4.c(f, dh4.c().getDisplayMetrics().density, nzb.K());
            measuredHeight += c2;
            if (getBackground() != null) {
                ((on8) getBackground()).w = (float) c2;
            }
        } else if (getBackground() != null) {
            ((on8) getBackground()).w = 0.0f;
        }
        h04 h04 = this.w0;
        h04.measure(i, i2);
        setMeasuredDimension((a24.X(f * dh4.c().getDisplayMetrics().density) * 2) + Math.max(measuredWidth, h04.getMeasuredWidth()), (a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) * 2) + h04.getMeasuredHeight() + measuredHeight);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setChipObserver(syb syb) {
        this.a.setChipObserver(syb);
    }

    public void setDateBackgroundColor(int i) {
        this.w0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.w0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.w0.setStatus$message_list_release(dcf);
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
        this.w0.setBackgroundEnabled$message_list_release(false);
        if (getBackground() == null) {
            setBackground(getMessageBackground());
        }
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

    public void setTextMessageColors(dr0 dr0) {
        this.o.setTextColors(dr0);
    }

    public void setTextMessageLayout(qs8 qs8) {
        this.o.setLayout(qs8);
    }

    public /* bridge */ /* synthetic */ void setTextMessageLinkClickListener(of7 of7) {
    }
}
