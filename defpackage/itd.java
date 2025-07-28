package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: itd  reason: default package */
public final class itd extends ViewGroup implements i04, etd, i0c, zq8 {
    public final etd a;
    public final nzb b;
    public final uq8 c;
    public final FrameLayout o;
    public final int w0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
    public final h04 x0;
    public final t97 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public itd(Context context, etd etd) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        this.a = etd;
        this.b = nzb;
        this.c = uq8;
        FrameLayout frameLayout = new FrameLayout(context);
        this.o = frameLayout;
        h04 h04 = new h04(context);
        h04.setBackgroundEnabled$message_list_release(true);
        this.x0 = h04;
        this.y0 = ez3.O(3, new u5b(27, this));
        nzb.b = this;
        uq8.b = this;
        etd.setParent(frameLayout);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
    }

    private final on8 getMessageBackground() {
        return (on8) this.y0.getValue();
    }

    public final void a(ktd ktd) {
        this.a.a(ktd);
    }

    public final void b(er7 er7) {
        this.a.b(er7);
    }

    public final void c(dr0 dr0) {
        this.c.c(dr0);
    }

    public final void f(yr8 yr8, boolean z) {
        this.b.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        k77[] k77Arr = h04.H0;
        this.x0.c(charSequence, false);
    }

    public final void k(dr0 dr0, boolean z) {
        this.b.k(dr0, z);
    }

    public final void l() {
        this.c.l();
        this.x0.setBackgroundEnabled$message_list_release(true);
        setBackground((Drawable) null);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        float f = (float) 10;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        uq8 uq8 = this.c;
        boolean L = ek8.L((t97) uq8.c);
        int i6 = this.w0;
        if (L) {
            uq8.T(X, i6);
            i5 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, uq8.K(), i6);
        } else {
            i5 = i6;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        rn8 rn8 = layoutParams instanceof rn8 ? (rn8) layoutParams : null;
        int i7 = 0;
        boolean z2 = rn8 != null && !rn8.a;
        FrameLayout frameLayout = this.o;
        t97 t97 = (t97) uq8.c;
        if (z2 && !ek8.L(t97)) {
            X = (getMeasuredWidth() - frameLayout.getMeasuredWidth()) - i6;
        }
        n1g.D(frameLayout, X, i5, 0, 12);
        int b2 = rf0.b((float) 2, dh4.c().getDisplayMetrics().density, frameLayout.getMeasuredHeight(), i5);
        boolean L2 = ek8.L(t97);
        h04 h04 = this.x0;
        if (L2 || z2) {
            measuredWidth = getMeasuredWidth() - h04.getMeasuredWidth();
        } else {
            measuredWidth = frameLayout.getMeasuredWidth();
            i6 = h04.getMeasuredWidth();
        }
        n1g.D(h04, measuredWidth - i6, b2, 0, 12);
        int c2 = b2 + (getBackground() != null ? me4.c((float) 4, dh4.c().getDisplayMetrics().density, h04.getMeasuredHeight()) : h04.getMeasuredHeight());
        nzb nzb = this.b;
        if (ek8.L((t97) nzb.c)) {
            if (nzb.Z) {
                i7 = getMeasuredWidth() - nzb.L();
            }
            nzb.T(i7, a24.X(f * dh4.c().getDisplayMetrics().density) + c2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.w0;
        int i4 = size - (i3 * 2);
        int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        FrameLayout frameLayout = this.o;
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
        int max = Math.max(0, frameLayout.getMeasuredWidth());
        int measuredHeight = frameLayout.getMeasuredHeight() + X;
        uq8 uq8 = this.c;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i2);
            max = Math.max(max, uq8.L());
            measuredHeight = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, uq8.K(), measuredHeight);
        }
        h04 h04 = this.x0;
        h04.measure(i, i2);
        int b2 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, h04.getMeasuredHeight() + a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), measuredHeight);
        int i5 = (i3 * 2) + max;
        nzb nzb = this.b;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            i5 = Math.max(i5, nzb.L());
            int c2 = me4.c((float) 10, dh4.c().getDisplayMetrics().density, nzb.K());
            b2 += c2;
            if (getBackground() != null) {
                ((on8) getBackground()).w = (float) c2;
            }
        } else if (getBackground() != null) {
            ((on8) getBackground()).w = 0.0f;
        }
        setMeasuredDimension(i5, b2);
    }

    public final void q(boolean z) {
        this.b.q(z);
    }

    public void setChipObserver(syb syb) {
        this.b.setChipObserver(syb);
    }

    public void setDateBackgroundColor(int i) {
        this.x0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.x0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.x0.setStatus$message_list_release(dcf);
    }

    public void setForwardClickListener(u16 u16) {
        this.c.X = u16;
    }

    public void setIsIncoming(boolean z) {
        this.b.o = z;
    }

    public void setLink(tq8 tq8) {
        this.c.setLink(tq8);
        this.x0.setBackgroundEnabled$message_list_release(false);
        if (getBackground() == null) {
            setBackground(getMessageBackground());
        }
    }

    public void setOnClickListener(u16 u16) {
        this.b.X = u16;
    }

    public void setParent(ViewGroup viewGroup) {
        this.a.setParent(viewGroup);
    }

    public void setReplyClickListener(i26 i26) {
        this.c.o = i26;
    }

    public void setStackFromEnd(boolean z) {
        this.b.Z = z;
    }
}
