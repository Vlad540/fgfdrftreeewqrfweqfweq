package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: cl1  reason: default package */
public final /* synthetic */ class cl1 implements agc {
    public final /* synthetic */ int a;
    public final /* synthetic */ el1 b;

    public /* synthetic */ cl1(el1 el1, int i) {
        this.a = i;
        this.b = el1;
    }

    public final void b() {
        el1 el1 = this.b;
        switch (this.a) {
            case 0:
                lhd lhd = el1.P0;
                if (lhd != null) {
                    k77[] k77Arr = CallTopPanelWidget.o;
                    taf.o(((CallTopPanelWidget) lhd.b).m0().b.Q0, eh1.C);
                    return;
                }
                return;
            case 1:
                el1.w(el1);
                return;
            default:
                lhd lhd2 = el1.P0;
                if (lhd2 != null) {
                    k77[] k77Arr2 = CallTopPanelWidget.o;
                    taf.o(((CallTopPanelWidget) lhd2.b).m0().b.Q0, sh1.C);
                    return;
                }
                return;
        }
    }
}
