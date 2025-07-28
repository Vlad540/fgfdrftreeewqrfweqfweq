package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: u78  reason: default package */
public abstract class u78 extends ViewGroup implements i04, yxc, i0c, zq8, mha, vxc, f78 {
    public static final /* synthetic */ k77[] z0;
    public final nzb a;
    public final uq8 b;
    public final txc c;
    public final nha o;
    public final zxc w0 = new zxc(this);
    public final h04 x0;
    public final yj y0;

    static {
        k77 hc9 = new hc9(u78.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        m7c.a.getClass();
        z0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [nha, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u78(Context context) {
        super(context);
        nzb nzb = new nzb();
        uq8 uq8 = new uq8();
        ? obj = new Object();
        txc txc = new txc();
        this.a = nzb;
        this.b = uq8;
        this.c = txc;
        this.o = obj;
        h04 h04 = new h04(context);
        h04.setBackgroundEnabled$message_list_release(true);
        this.x0 = h04;
        this.y0 = new yj(11, this);
        uq8.b = this;
        nzb.b = this;
        txc.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(h04, new ViewGroup.LayoutParams(-2, -2));
        lu7 lu7 = on8.y;
        pda r = km4.y0.r(this);
        lu7.getClass();
        setBackground(lu7.g(r));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public void a(w13 w13) {
        setModel(w13);
    }

    public final void c(dr0 dr0) {
        this.b.c(dr0);
    }

    public final void f(yr8 yr8, boolean z) {
        this.a.f(yr8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.x0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final h04 getDate() {
        return this.x0;
    }

    public boolean getDependOnOutsideView() {
        return this.o.a;
    }

    public sy7 getModel() {
        k77 k77 = z0[0];
        return (sy7) this.y0.b;
    }

    public void i(wid wid) {
        setModel(wid);
    }

    public final void k(dr0 dr0, boolean z) {
        this.a.k(dr0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int X = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        zxc zxc = this.w0;
        int i6 = 0;
        if (ek8.L(zxc.b)) {
            int X2 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            zxc.c(X, X2);
            i5 = zxc.a() + X2;
        } else {
            i5 = 0;
        }
        txc txc = this.c;
        if (ek8.L((t97) txc.c) && ek8.L(zxc.b)) {
            txc.T((getMeasuredWidth() - X) - txc.L(), me4.c((float) 8, dh4.c().getDisplayMetrics().density, (zxc.a() / 2) - (txc.K() / 2)));
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            int X3 = i5 + a24.X((i5 == 0 ? (float) 8 : (float) 4) * dh4.c().getDisplayMetrics().density);
            uq8.T(X, X3);
            i5 = X3 + uq8.K();
        }
        float f = (float) 1;
        int X4 = a24.X(dh4.c().getDisplayMetrics().density * f) + (i5 == 0 ? 0 : a24.X(((float) 8) * dh4.c().getDisplayMetrics().density)) + i5;
        int b2 = b(a24.X(f * dh4.c().getDisplayMetrics().density), X4) + X4;
        int measuredWidth = getMeasuredWidth();
        h04 h04 = this.x0;
        float f2 = (float) 4;
        n1g.D(h04, me4.p(f2, dh4.c().getDisplayMetrics().density, measuredWidth - h04.getMeasuredWidth()), me4.p(f2, dh4.c().getDisplayMetrics().density, b2 - h04.getMeasuredHeight()), 0, 12);
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            int c2 = me4.c(f2, dh4.c().getDisplayMetrics().density, b2);
            if (nzb.Z) {
                i6 = getMeasuredWidth() - nzb.L();
            }
            nzb.T(i6, c2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int l = rf0.l(f, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int i4 = 0;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : 0;
        txc txc = this.c;
        boolean L = ek8.L((t97) txc.c);
        zxc zxc = this.w0;
        if (L && ek8.L(zxc.b)) {
            txc.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, txc.L());
        }
        if (ek8.L(zxc.b)) {
            zxc.d(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + zxc.b() + txc.h0());
            i3 = zxc.a() + a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        } else {
            i3 = 0;
        }
        uq8 uq8 = this.b;
        if (ek8.L((t97) uq8.c)) {
            uq8.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, (a24.X(f * dh4.c().getDisplayMetrics().density) * 2) + uq8.L());
            i3 += uq8.K() + a24.X((i3 == 0 ? (float) 8 : (float) 4) * dh4.c().getDisplayMetrics().density);
        }
        if (i3 != 0) {
            i4 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        }
        int i5 = i3 + i4;
        this.x0.measure(i, i2);
        nzb nzb = this.a;
        if (ek8.L((t97) nzb.c)) {
            nzb.U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, nzb.L());
            int c2 = me4.c((float) 8, dh4.c().getDisplayMetrics().density, nzb.K() + a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
            i5 += c2;
            ((on8) getBackground()).w = (float) c2;
        } else {
            ((on8) getBackground()).w = 0.0f;
        }
        float f2 = (float) 1;
        long s = s(rf0.l(f2, dh4.c().getDisplayMetrics().density, 2, size), rf0.l(f2, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(size, (a24.X(dh4.c().getDisplayMetrics().density * f2) * 2) + ((int) (s >> 32))), (a24.X(f2 * dh4.c().getDisplayMetrics().density) * 2) + ((int) (s & 4294967295L)) + i5);
    }

    public void p(qhd qhd) {
        setModel(qhd);
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
        this.x0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.x0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        this.x0.setStatus$message_list_release(dcf);
    }

    public void setDependOnOutsideView(boolean z) {
        this.o.a = z;
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

    public void setModel(sy7 sy7) {
        this.y0.o1(this, z0[0], sy7);
    }

    public void setOnClickListener(u16 u16) {
        this.a.X = u16;
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
}
