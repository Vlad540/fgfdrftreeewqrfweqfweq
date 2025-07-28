package defpackage;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: uq8  reason: default package */
public final class uq8 extends ibe implements zq8 {
    public u16 X;
    public tq8 Y;
    public i26 o;

    public uq8() {
        super((u16) new xz6(18));
    }

    public final void Y(View view) {
        a24.a0((yq8) view, new eu5(16, this));
    }

    public final void c(dr0 dr0) {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            ((yq8) t97.getValue()).a(dr0);
        }
    }

    public final void l() {
        this.Y = null;
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            ((yq8) t97.getValue()).setVisibility(8);
        }
    }

    public final void setForwardClickListener(u16 u16) {
        this.X = u16;
    }

    public final void setLink(tq8 tq8) {
        this.Y = tq8;
        ViewGroup viewGroup = (ViewGroup) this.b;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        boolean z = false;
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new mp0(5, this));
        } else {
            ViewGroup viewGroup3 = (ViewGroup) this.b;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            int p = me4.p((float) 10, dh4.c().getDisplayMetrics().density, viewGroup3.getMeasuredWidth()) - L();
            if (p < 0) {
                p = 0;
            }
            ViewGroup viewGroup4 = (ViewGroup) this.b;
            if (viewGroup4 != null) {
                viewGroup2 = viewGroup4;
            }
            x87.I(p, Q(), viewGroup2);
        }
        qq8 qq8 = tq8.d;
        boolean z2 = qq8 != null;
        mq8 mq8 = tq8.e;
        if (mq8 != null) {
            z = true;
        }
        if (!z || z2) {
            Layout layout = tq8.c;
            if (z && (qq8 instanceof pq8)) {
                yq8 yq8 = (yq8) Q();
                if (layout != null) {
                    yq8.i(layout, ((pq8) qq8).a, mq8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (qq8 instanceof pq8) {
                yq8 yq82 = (yq8) Q();
                if (layout != null) {
                    yq82.j(layout, ((pq8) qq8).a);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (z && (qq8 instanceof oq8)) {
                yq8 yq83 = (yq8) Q();
                if (layout != null) {
                    yq83.g(layout, (oq8) qq8, mq8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (qq8 instanceof oq8) {
                yq8 yq84 = (yq8) Q();
                if (layout != null) {
                    yq84.h(layout, (oq8) qq8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (qq8 instanceof nq8) {
                yq8 yq85 = (yq8) Q();
                if (layout != null) {
                    yq85.f(layout, (nq8) qq8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        } else {
            ((yq8) Q()).setSingleForward(mq8);
        }
        u();
    }

    public final void setReplyClickListener(i26 i26) {
        this.o = i26;
    }
}
