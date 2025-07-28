package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: ru2  reason: default package */
public final class ru2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ru2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ru2 ru2 = new ru2(continuation, this.Y);
        ru2.X = obj;
        return ru2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [ig7, ur5] */
    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.I0.E((List) this.X);
        return jue.a;
    }
}
