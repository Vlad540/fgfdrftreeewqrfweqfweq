package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: iw2  reason: default package */
public final class iw2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iw2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((iw2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        iw2 iw2 = new iw2(continuation, this.Y);
        iw2.X = obj;
        return iw2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int intValue = ((Number) this.X).intValue();
        k77[] k77Arr = ChatsTabWidget.F0;
        ChatsTabWidget chatsTabWidget = this.Y;
        if (!(chatsTabWidget.m0().getCurrentItem() == intValue && chatsTabWidget.l0().getSelectedTabPosition() == intValue)) {
            chatsTabWidget.m0().e(intValue, false);
            chatsTabWidget.l0().q(intValue, 0.0f, true, true, true);
        }
        return jue.a;
    }
}
