package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: ysa  reason: default package */
public final class ysa extends l5e implements i26 {
    public final /* synthetic */ PickerChatsListWidget2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ysa(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2) {
        super(2, continuation);
        this.X = pickerChatsListWidget2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ysa) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ysa(continuation, this.X);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = PickerChatsListWidget2.G0;
        this.X.o0().Y();
        return jue.a;
    }
}
