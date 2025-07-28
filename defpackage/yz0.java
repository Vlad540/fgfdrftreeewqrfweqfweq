package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: yz0  reason: default package */
public final /* synthetic */ class yz0 implements agc {
    public final /* synthetic */ int a;
    public final /* synthetic */ zz0 b;

    public /* synthetic */ yz0(zz0 zz0, int i) {
        this.a = i;
        this.b = zz0;
    }

    public final void b() {
        lv1 lv1;
        lv1 lv12;
        hy7 hy7 = hy7.b;
        hy7 hy72 = hy7.a;
        hy7 hy73 = hy7.c;
        hy7 hy74 = hy7.o;
        hy7 hy75 = hy7.X;
        zz0 zz0 = this.b;
        switch (this.a) {
            case 0:
                hy7 hy76 = zz0.R0;
                if (hy76 != null && (lv1 = zz0.Q0) != null) {
                    int ordinal = hy76.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            hy7 = hy72;
                        } else if (ordinal == 2) {
                            hy7 = hy73;
                        } else if (ordinal == 3) {
                            hy7 = hy74;
                        } else if (ordinal == 4) {
                            hy7 = hy75;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k77[] k77Arr = CallBottomPanelWidget.w0;
                    ((CallBottomPanelWidget) lv1.b).m0().s(hy7);
                    return;
                }
                return;
            case 1:
                hy7 hy77 = zz0.S0;
                if (hy77 != null && (lv12 = zz0.Q0) != null) {
                    int ordinal2 = hy77.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            hy7 = hy72;
                        } else if (ordinal2 == 2) {
                            hy7 = hy73;
                        } else if (ordinal2 == 3) {
                            hy7 = hy74;
                        } else if (ordinal2 == 4) {
                            hy7 = hy75;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k77[] k77Arr2 = CallBottomPanelWidget.w0;
                    ((CallBottomPanelWidget) lv12.b).m0().u(hy7);
                    return;
                }
                return;
            case 2:
                zz0.w(zz0);
                return;
            default:
                lv1 lv13 = zz0.Q0;
                if (lv13 != null) {
                    lv13.t();
                    return;
                }
                return;
        }
    }
}
