package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: a1a  reason: default package */
public final class a1a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ b1a o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1a(b1a b1a, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                y0a y0a = y0a.a;
                this.o = b1a;
                super(9, (Object) y0a);
                return;
            case 2:
                x0a x0a = x0a.a;
                this.o = b1a;
                super(9, (Object) x0a);
                return;
            default:
                this.o = b1a;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                pda pda = (pda) obj2;
                if (!hhd.f((pda) obj, pda)) {
                    b1a b1a = this.o;
                    if (pda == null) {
                        pda = km4.y0.r(b1a);
                    }
                    b1a.onThemeChanged(pda);
                    return;
                }
                return;
            case 1:
                y0a y0a = (y0a) obj2;
                if (((y0a) obj) != y0a) {
                    int i = z0a.$EnumSwitchMapping$0[y0a.ordinal()];
                    b1a b1a2 = this.o;
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else if (b1a2.getTextView().getParent() == null) {
                            b1a2.addView(b1a2.getTextView());
                            return;
                        } else {
                            return;
                        }
                    } else if (b1a2.getTextView().getParent() != null) {
                        b1a2.removeView(b1a2.getTextView());
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                x0a x0a = (x0a) obj2;
                if (((x0a) obj) != x0a) {
                    b1a b1a3 = this.o;
                    b1a3.c(b1a3, x0a);
                    return;
                }
                return;
        }
    }
}
