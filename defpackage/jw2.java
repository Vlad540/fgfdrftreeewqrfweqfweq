package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: jw2  reason: default package */
public final class jw2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((jw2) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jw2 jw2 = new jw2(continuation, this.Y);
        jw2.X = obj;
        return jw2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int size = ((List) this.X).size();
        ChatsTabWidget chatsTabWidget = this.Y;
        if (size > 1) {
            k77[] k77Arr = ChatsTabWidget.F0;
            chatsTabWidget.l0().setVisibility(0);
            chatsTabWidget.m0().setUserInputEnabled(true);
        } else {
            k77[] k77Arr2 = ChatsTabWidget.F0;
            chatsTabWidget.l0().setVisibility(8);
            chatsTabWidget.m0().setUserInputEnabled(false);
        }
        return jue.a;
    }
}
