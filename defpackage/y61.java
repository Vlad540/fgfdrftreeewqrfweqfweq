package defpackage;

import one.me.calllist.ui.CallHistoryScreen;
import one.me.sdk.arch.Widget;

/* renamed from: y61  reason: default package */
public final /* synthetic */ class y61 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ y61(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    public final Object invoke() {
        grd grd;
        Object value;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallHistoryScreen.G0;
                e71 m0 = widget.m0();
                do {
                    grd = m0.Z;
                    value = grd.getValue();
                    c71 c71 = (c71) value;
                } while (!grd.b(value, new c71()));
                ((nea) widget.Y.T0(widget, CallHistoryScreen.G0[1])).a();
                return jue.a;
            case 1:
                k77[] k77Arr2 = CallHistoryScreen.G0;
                t97 t97 = mqc.a;
                r7e d = nqc.a.getAccessor().d(jb5.class);
                return new e71(widget.b, d, new nxc(widget.a), (we1) widget.o.getValue());
            case 2:
                k77[] k77Arr3 = CallHistoryScreen.G0;
                return new we1(new r7e(new y61(widget, 3)), new jrf(widget, 0));
            default:
                k77[] k77Arr4 = CallHistoryScreen.G0;
                return widget.getRouter();
        }
    }
}
