package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: rsa  reason: default package */
public final class rsa extends l5e implements i26 {
    public final /* synthetic */ PickerChatsListWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rsa(PickerChatsListWidget pickerChatsListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerChatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((rsa) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rsa(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = PickerChatsListWidget.A0;
        this.X.n0().Y();
        return jue.a;
    }
}
