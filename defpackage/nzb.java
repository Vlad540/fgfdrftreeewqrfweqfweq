package defpackage;

import android.view.View;

/* renamed from: nzb  reason: default package */
public final class nzb extends ibe implements i0c {
    public u16 X;
    public syb Y;
    public boolean Z;
    public boolean o = true;

    public nzb() {
        super((u16) new qq9(28));
    }

    public final void f(yr8 yr8, boolean z) {
        ((xyb) Q()).setOnChipClickListener(this.X);
        syb syb = this.Y;
        if (syb != null) {
            ((xyb) Q()).setChipObserver(syb);
        }
        ((xyb) Q()).setStackFromEnd(this.Z);
        ((xyb) Q()).setIncoming(this.o);
        ((xyb) Q()).f(yr8, z);
        u();
    }

    public final void k(dr0 dr0, boolean z) {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            xyb xyb = (xyb) t97.getValue();
            xyb xyb2 = (xyb) Q();
            xyb2.getClass();
            int i = 0;
            while (i < xyb2.getChildCount()) {
                int i2 = i + 1;
                View childAt = xyb2.getChildAt(i);
                if (childAt != null) {
                    vyb vyb = (vyb) childAt;
                    gr0 gr0 = dr0.b;
                    xq0 xq0 = dr0.a;
                    if (z) {
                        cr0 cr0 = xq0.c;
                        vyb.w0 = cr0.a;
                        vyb.x0 = cr0.b;
                        hr0 hr0 = gr0.a;
                        vyb.y0 = hr0.a;
                        vyb.z0 = hr0.b;
                    } else {
                        cr0 cr02 = xq0.c;
                        vyb.w0 = cr02.c;
                        vyb.x0 = cr02.d;
                        hr0 hr02 = gr0.a;
                        vyb.y0 = hr02.c;
                        vyb.z0 = hr02.d;
                    }
                    vyb.invalidate();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
    }

    public final void q(boolean z) {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            xyb xyb = (xyb) t97.getValue();
            ((xyb) Q()).f((yr8) null, z);
        }
    }

    public final void setChipObserver(syb syb) {
        if (((t97) this.c).a()) {
            ((xyb) Q()).setChipObserver(syb);
        } else {
            this.Y = syb;
        }
    }

    public final void setIsIncoming(boolean z) {
        this.o = z;
    }

    public final void setOnClickListener(u16 u16) {
        this.X = u16;
    }

    public final void setStackFromEnd(boolean z) {
        this.Z = z;
    }
}
