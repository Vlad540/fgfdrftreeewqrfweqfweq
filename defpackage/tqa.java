package defpackage;

import android.util.AttributeSet;
import android.view.GestureDetector;
import one.me.chats.picker.PickerChatController;

/* renamed from: tqa  reason: default package */
public final /* synthetic */ class tqa implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatController b;

    public /* synthetic */ tqa(PickerChatController pickerChatController, int i) {
        this.a = i;
        this.b = pickerChatController;
    }

    public final Object invoke() {
        jue jue = jue.a;
        PickerChatController pickerChatController = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickerChatController.F0;
                xra o0 = pickerChatController.o0();
                tra tra = xra.J0;
                o0.F0.K(0);
                return jue;
            case 1:
                k77[] k77Arr2 = PickerChatController.F0;
                nea nea = new nea(pickerChatController.getContext(), 6);
                nea.setId(f2a.j);
                nea.setTransitionName(nea.getContext().getString(h2a.q));
                nea.setTitle(h2a.b0);
                nea.setForm(fea.a);
                nea.setLeftActions(new vda(new e98(14, pickerChatController)));
                return nea;
            case 2:
                k77[] k77Arr3 = PickerChatController.F0;
                x2a x2a = new x2a(pickerChatController.getContext(), (AttributeSet) null);
                x2a.getEditText().setHint(h2a.a0);
                x2a.setCallback(new b2b(pickerChatController, x2a, false, 29));
                x2a.getEditText().addTextChangedListener(new z2(8, pickerChatController));
                return x2a;
            case 3:
                k77[] k77Arr4 = PickerChatController.F0;
                jq8 jq8 = new jq8(pickerChatController.getContext());
                jq8.setId(f2a.e0);
                g33 g33 = new g33(pickerChatController, 4, jq8);
                jq8.setInputHint(h2a.Z);
                GestureDetector gestureDetector = new GestureDetector(jq8.getContext(), g33);
                jq8.setRightOuterIconActionState(cq8.a);
                jq8.setRightOuterIconTouchListener(new cg3(gestureDetector, 7));
                jq8.setLeftInnerIconTouchListener(xie.a(jq8.getContext(), new tqa(pickerChatController, 0)));
                return jq8;
            case 4:
                return pickerChatController.D0;
            default:
                k77[] k77Arr5 = PickerChatController.F0;
                pickerChatController.o0().F0.K(4);
                ek8.g(pickerChatController.n0(), PickerChatController.G0, (u16) null);
                ((jq8) pickerChatController.y0.getValue()).setLeftIcon(phc.Z0);
                return jue;
        }
    }
}
