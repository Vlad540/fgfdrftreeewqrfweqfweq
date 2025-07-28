package defpackage;

import one.me.chats.picker.AbstractPickerScreen;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: bbd  reason: default package */
public final /* synthetic */ class bbd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareDataPickerScreen b;

    public /* synthetic */ bbd(ShareDataPickerScreen shareDataPickerScreen, int i) {
        this.a = i;
        this.b = shareDataPickerScreen;
    }

    public final Object invoke() {
        jue jue = jue.a;
        AbstractPickerScreen abstractPickerScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ShareDataPickerScreen.H0;
                jq8 jq8 = new jq8(abstractPickerScreen.getContext());
                jq8.setId(bba.a);
                jq8.setInputHint(cba.a);
                jq8.setRightOuterIconActionState(cq8.a);
                jq8.setRightOuterIconTouchListener(xie.a(jq8.getContext(), new nya(abstractPickerScreen, 18, jq8)));
                jq8.setLeftInnerIconTouchListener(xie.a(jq8.getContext(), new bbd(abstractPickerScreen, 3)));
                return jq8;
            case 1:
                abstractPickerScreen.F0.m();
                return jue;
            case 2:
                return abstractPickerScreen.F0;
            default:
                k77[] k77Arr2 = ShareDataPickerScreen.H0;
                abstractPickerScreen.u0().c.k.K(0);
                return jue;
        }
    }
}
