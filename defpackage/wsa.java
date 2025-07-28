package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: wsa  reason: default package */
public final class wsa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wsa(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2) {
        super(2, continuation);
        this.Y = pickerChatsListWidget2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((wsa) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wsa wsa = new wsa(continuation, this.Y);
        wsa.X = obj;
        return wsa;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [rr3, one.me.chats.picker.chats.PickerChatsListWidget2] */
    /* JADX WARNING: type inference failed for: r1v0, types: [gra, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        ? r2 = this.Y;
        boolean m0 = PickerChatsListWidget2.m0(r2);
        r2.B0.E((List) this.X);
        if (r2.getView() != null) {
            r2.o0().setRefreshingNext(m0);
        }
        return jue.a;
    }
}
