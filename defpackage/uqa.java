package defpackage;

import android.view.View;
import one.me.chats.picker.PickerChatController;

/* renamed from: uqa  reason: default package */
public final /* synthetic */ class uqa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatController b;

    public /* synthetic */ uqa(PickerChatController pickerChatController, int i) {
        this.a = i;
        this.b = pickerChatController;
    }

    public final void onClick(View view) {
        PickerChatController pickerChatController = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickerChatController.F0;
                xra o0 = pickerChatController.o0();
                if (!o0.I0) {
                    o0.I0 = true;
                    taf.o(o0.G0, new w03());
                    return;
                }
                return;
            default:
                k77[] k77Arr2 = PickerChatController.F0;
                xra o02 = pickerChatController.o0();
                if (!o02.I0) {
                    o02.I0 = true;
                    taf.o(o02.G0, new w03());
                    return;
                }
                return;
        }
    }
}
