package defpackage;

import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: wv5  reason: default package */
public final /* synthetic */ class wv5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ wv5(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    public final Object invoke() {
        jue jue = jue.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (this.a) {
            case 0:
                return forwardPickerScreen.J0;
            case 1:
                k77[] k77Arr = ForwardPickerScreen.M0;
                jq8 jq8 = new jq8(forwardPickerScreen.getContext());
                jq8.setId(c2a.a);
                jq8.setInputHint(e2a.a);
                jq8.setRightOuterIconActionState(cq8.a);
                jq8.setRightOuterIconTouchListener(xie.a(jq8.getContext(), new zu4(forwardPickerScreen, 11, jq8)));
                jq8.setLeftInnerIconTouchListener(xie.a(jq8.getContext(), new wv5(forwardPickerScreen, 3)));
                return jq8;
            case 2:
                forwardPickerScreen.J0.m();
                return jue;
            case 3:
                k77[] k77Arr2 = ForwardPickerScreen.M0;
                ((pv5) forwardPickerScreen.u0().c).r.K(0);
                return jue;
            default:
                k77[] k77Arr3 = ForwardPickerScreen.M0;
                ForwardPickerScreen.w0(forwardPickerScreen, forwardPickerScreen.y0(), new hge(rhc.h0), true);
                forwardPickerScreen.C0 = new fs5(6);
                return jue;
        }
    }
}
