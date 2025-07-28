package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.BitSet;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* renamed from: rx0  reason: default package */
public final class rx0 extends chd {
    public final /* synthetic */ int J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx0(View view, int i) {
        super(view);
        this.J0 = i;
    }

    private final void G(pg7 pg7) {
    }

    private final void H(pg7 pg7) {
    }

    private final void I(pg7 pg7) {
    }

    private final void J(pg7 pg7) {
    }

    private final void K(pg7 pg7) {
    }

    private final void L(pg7 pg7) {
    }

    private final void M(pg7 pg7) {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [xu2, ne, java.lang.Object] */
    public final void A(pg7 pg7) {
        switch (this.J0) {
            case 0:
                if (pg7 instanceof xy0) {
                    View view = this.a;
                    ((TextView) view).setText(((xy0) pg7).a.a(((TextView) view).getContext()));
                    return;
                }
                return;
            case 1:
                if (pg7 instanceof wy0) {
                    View view2 = this.a;
                    ((TextView) view2).setText(((wy0) pg7).a.a(((TextView) view2).getContext()));
                    return;
                }
                return;
            case 2:
                ((r51) this.a).setOpponents(((vb1) pg7).b);
                return;
            case 3:
                return;
            case 4:
                u91 u91 = (u91) pg7;
                return;
            case 5:
                F((xb1) pg7);
                return;
            case 6:
                wu2 wu2 = (wu2) pg7;
                View view3 = this.a;
                yu2 yu2 = (yu2) view3;
                if (yu2.b == null) {
                    ? obj = new Object();
                    yu2.c.c(obj);
                    yu2.b = obj;
                }
                view3.requestLayout();
                view3.invalidate();
                return;
            case 7:
                nw4 nw4 = (nw4) pg7;
                EmptySearchView emptySearchView = this.a;
                emptySearchView.setTitle(rhc.c0);
                emptySearchView.setDescription(rhc.b0);
                emptySearchView.setIsButtonVisible(false);
                return;
            case 8:
                ow4 ow4 = (ow4) pg7;
                return;
            case 9:
                rj7 rj7 = (rj7) pg7;
                return;
            case 10:
                ezb ezb = (ezb) pg7;
                return;
            case 11:
                p2c p2c = (p2c) pg7;
                return;
            case 12:
                if (pg7 instanceof gtc) {
                    View view4 = this.a;
                    ((TextView) view4).setText(((gtc) pg7).a.a(((TextView) view4).getContext()));
                    return;
                }
                return;
            case 13:
                return;
            case 14:
                if (pg7 instanceof zsc) {
                    View view5 = this.a;
                    ((TextView) view5).setText(((zsc) pg7).a.a(((TextView) view5).getContext()));
                    return;
                }
                return;
            case 15:
            case 16:
                return;
            case 17:
                if (pg7 instanceof ysc) {
                    View view6 = this.a;
                    ((TextView) view6).setText(((ysc) pg7).a.a(((TextView) view6).getContext()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rx0, chd, b7c] */
    public void B(pg7 pg7, Object obj) {
        switch (this.J0) {
            case 2:
                vb1 vb1 = (vb1) pg7;
                ub1 ub1 = obj instanceof ub1 ? (ub1) obj : null;
                View view = this.a;
                if (ub1 == null) {
                    ((r51) view).setOpponents(vb1.b);
                    return;
                } else if (((BitSet) ub1.b).get(0)) {
                    ((r51) view).setOpponents(vb1.b);
                    return;
                } else {
                    return;
                }
            case 5:
                xb1 xb1 = (xb1) pg7;
                wb1 wb1 = obj instanceof wb1 ? (wb1) obj : null;
                if (wb1 != null) {
                    BitSet bitSet = (BitSet) wb1.b;
                    int i = 0;
                    boolean z = bitSet.get(0);
                    View view2 = this.a;
                    if (z) {
                        ai1 ai1 = xb1.c;
                        if (!ai1.a()) {
                            i = 8;
                        }
                        view2.setVisibility(i);
                        uj1 uj1 = (uj1) view2;
                        boolean z2 = uj1.L0;
                        boolean z3 = ai1.e;
                        if (z2 != z3) {
                            uj1.L0 = z3;
                            uj1.M0.setEndView(new z6d(z3, true));
                        }
                    }
                    if (bitSet.get(1)) {
                        ((uj1) view2).setTitle(xb1.b);
                        return;
                    }
                    return;
                }
                F(xb1);
                return;
            default:
                rx0.super.B(pg7, obj);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rx0, b7c] */
    public void D() {
        switch (this.J0) {
            case 6:
                yu2 yu2 = (yu2) this.a;
                xu2 xu2 = yu2.b;
                if (xu2 != null) {
                    yu2.c.f(xu2);
                }
                yu2.b = null;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rx0, b7c] */
    public void F(xb1 xb1) {
        ai1 ai1 = xb1.c;
        int i = ai1.a() ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        uj1 uj1 = (uj1) view;
        boolean z = uj1.L0;
        boolean z2 = ai1.e;
        if (z != z2) {
            uj1.L0 = z2;
            uj1.M0.setEndView(new z6d(z2, true));
        }
        uj1.setTitle(xb1.b);
    }
}
