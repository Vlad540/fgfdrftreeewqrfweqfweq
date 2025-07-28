package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: vfe  reason: default package */
public class vfe extends ViewGroup implements yxc, i04, wfe, jg6, ho8, i0c, zq8, mha, vxc, jf7 {
    public final int A0;
    public final int B0;
    public final int C0;
    public xz2 D0;
    public final nzb a;
    public final uq8 b;
    public final nha c;
    public final txc o;
    public final zxc w0 = new zxc(this);
    public final ts8 x0;
    public final h04 y0;
    public final int z0;

    /* JADX WARNING: type inference failed for: r2v0, types: [nha, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfe(Context context) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        ? obj = new Object();
        txc txc = new txc();
        this.a = nzb;
        this.b = uq8;
        this.c = obj;
        this.o = txc;
        ts8 ts8 = new ts8(context);
        ts8.setId(a7a.N);
        this.x0 = ts8;
        h04 h04 = new h04(context);
        this.y0 = h04;
        this.z0 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        this.A0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.B0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.C0 = a24.X(f * dh4.c().getDisplayMetrics().density);
        nzb.b = this;
        uq8.b = this;
        txc.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(ts8, new ViewGroup.LayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
        lu7 lu7 = on8.y;
        pda r = km4.y0.r(this);
        lu7.getClass();
        setBackground(lu7.g(r));
        setWillNotDraw(false);
        ts8.setSingleClickAction(new ufe(this, 0));
        ts8.setTryToSingleClickAction(new ufe(this, 1));
        ts8.setOnLongClickListener(new wk0(9, this));
        ts8.setLinkLongClickListener(new sic(26, this));
    }

    public final void c(dr0 dr0) {
        this.b.c(dr0);
    }

    public final void e(List list, i26 i26) {
        CharSequence text = getText();
        if (text != null) {
            ts8 ts8 = this.x0;
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

    public void g(CharSequence charSequence, boolean z) {
        this.y0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.h0();
    }

    public final int getContentHorizontalPadding$message_list_release() {
        return this.A0;
    }

    public final int getContentTopPadding$message_list_release() {
        return this.z0;
    }

    public final h04 getDate$message_list_release() {
        return this.y0;
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final uq8 getMessageLinkDelegate() {
        return this.b;
    }

    public final ts8 getMessageTextView$message_list_release() {
        return this.x0;
    }

    public xz2 getOnLinkLongClickListener() {
        return this.D0;
    }

    public final nzb getReactionsDelegate() {
        return this.a;
    }

    public final txc getSenderAliasDelegate() {
        return this.o;
    }

    public final int getSenderBottomMargin$message_list_release() {
        return this.B0;
    }

    public final zxc getSenderNameViewStub$message_list_release() {
        return this.w0;
    }

    public final int getStatusBottomMargin$message_list_release() {
        return this.C0;
    }

    public final CharSequence getText() {
        return this.x0.getText();
    }

    public boolean h(MotionEvent motionEvent) {
        return false;
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void l() {
        this.b.l();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        zxc zxc = this.w0;
        boolean L = ek8.L(zxc.b);
        int i6 = this.A0;
        int i7 = this.z0;
        if (L) {
            zxc.c(i6, i7);
            i5 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, zxc.a(), i7);
        } else {
            i5 = i7;
        }
        txc txc = this.o;
        if (ek8.L((t97) txc.c) && ek8.L(zxc.b)) {
            txc.T((getMeasuredWidth() - i6) - txc.L(), ((zxc.a() / 2) - (txc.K() / 2)) + i7);
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.T(i6, i5);
            i5 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, uq8.K(), i5);
        }
        ts8 ts8 = this.x0;
        n1g.D(ts8, i6, i5, 0, 12);
        int measuredHeight = ts8.getMeasuredHeight() + i5;
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.T(i6, a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) + measuredHeight);
            nzb.K();
        }
        int measuredWidth = getMeasuredWidth();
        h04 h04 = this.y0;
        n1g.D(h04, (measuredWidth - h04.getMeasuredWidth()) - i6, me4.p((float) 4, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - h04.getMeasuredHeight()), 0, 12);
    }

    public void onMeasure(int i, int i2) {
        float f = (float) 10;
        int l = rf0.l(f, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        ts8 ts8 = this.x0;
        ts8.h();
        int measuredWidth = getDependOnOutsideView() ? l : ts8.getMeasuredWidth();
        int measuredHeight = ts8.getMeasuredHeight();
        txc txc = this.o;
        boolean L = ek8.L((t97) txc.c);
        zxc zxc = this.w0;
        if (L && ek8.L(zxc.b)) {
            txc.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, txc.L());
        }
        if (ek8.L(zxc.b)) {
            zxc.d(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, zxc.b() + txc.h0());
            measuredHeight = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, zxc.a(), measuredHeight);
        }
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
            measuredHeight = rf0.b(f, dh4.c().getDisplayMetrics().density, nzb.K(), measuredHeight);
        }
        h04 h04 = this.y0;
        h04.measure(i, i2);
        int c2 = me4.c(f, dh4.c().getDisplayMetrics().density, h04.getMeasuredWidth() + me4.c((float) 6, dh4.c().getDisplayMetrics().density, ek8.L((t97) nzb.c) ? nzb.L() : ts8.e(l)));
        if (c2 < l) {
            measuredWidth = Math.max(measuredWidth, c2);
        } else {
            measuredHeight = me4.c((float) 12, dh4.c().getDisplayMetrics().density, measuredHeight);
        }
        setMeasuredDimension((a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + measuredWidth, rf0.b(f, dh4.c().getDisplayMetrics().density, a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), measuredHeight));
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
        this.y0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.y0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.y0.setStatus$message_list_release(dcf);
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

    public final void setMaxHeightForClip(int i) {
        this.x0.setMaxHeightForClip(i);
    }

    public void setOnClickListener(u16 u16) {
        this.a.X = u16;
    }

    public void setOnLinkLongClickListener(xz2 xz2) {
        this.D0 = xz2;
    }

    public void setReplyClickListener(i26 i26) {
        this.b.o = i26;
    }

    public void setSenderName(Layout layout) {
        this.w0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.w0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    public void setTextMessageColors(dr0 dr0) {
        this.x0.setTextColors(dr0);
    }

    public void setTextMessageLayout(qs8 qs8) {
        this.x0.setLayout(qs8);
    }

    public void setTextMessageLinkClickListener(of7 of7) {
        this.x0.setLinkListener(of7);
    }
}
