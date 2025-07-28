package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: hw2  reason: default package */
public final class hw2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hw2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hw2) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hw2 hw2 = new hw2(continuation, this.Y);
        hw2.X = obj;
        return hw2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        ChatsTabWidget chatsTabWidget = this.Y;
        chatsTabWidget.B0.i(list);
        chatsTabWidget.D0.M(list);
        return jue.a;
    }
}
