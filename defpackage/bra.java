package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatController;

/* renamed from: bra  reason: default package */
public final class bra extends l5e implements i26 {
    public final /* synthetic */ PickerChatController X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bra(PickerChatController pickerChatController, Continuation continuation) {
        super(2, continuation);
        this.X = pickerChatController;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((bra) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bra(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = PickerChatController.F0;
        ek8.g(this.X.n0(), PickerChatController.G0, (u16) null);
        return jue.a;
    }
}
