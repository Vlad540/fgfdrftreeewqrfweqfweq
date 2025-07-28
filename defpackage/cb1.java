package defpackage;

import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.arch.Widget;

/* renamed from: cb1  reason: default package */
public final /* synthetic */ class cb1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ cb1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    public final Object invoke() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallLinkInfoScreen.F0;
                return widget.getRouter();
            case 1:
                k77[] k77Arr2 = CallLinkInfoScreen.F0;
                return new rc0(gq3.b(widget.getContext(), h1a.c), fz9.a, km4.y0.n(widget.getContext()).g(), new o8(26), new o8(27));
            case 2:
                k77[] k77Arr3 = CallLinkInfoScreen.F0;
                return new oc0(gq3.b(widget.getContext(), h1a.a), dz9.a, widget.getContext(), new o8(21), new o8(22));
            default:
                k77[] k77Arr4 = CallLinkInfoScreen.F0;
                return new we1(new r7e(new cb1(widget, 0)), new jrf(widget, 0));
        }
    }
}
