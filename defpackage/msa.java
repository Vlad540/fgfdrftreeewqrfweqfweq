package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: msa  reason: default package */
public final class msa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public msa(PickerChatsListWidget pickerChatsListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((msa) n((wia) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        msa msa = new msa(this.Y, continuation);
        msa.X = obj;
        return msa;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        PickerChatsListWidget.m0(pickerChatsListWidget, (wia) this.X, pickerChatsListWidget.y0);
        return jue.a;
    }
}
