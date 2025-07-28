package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: jl2  reason: default package */
public final class jl2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jl2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((jl2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jl2 jl2 = new jl2(continuation, this.Y);
        jl2.X = obj;
        return jl2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        y99 y99 = (y99) this.X;
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        if (y99.a > 0) {
            chatScreen.J0().c(String.valueOf(y99.a), y99.b, new gk2(chatScreen, 3), new ik2(chatScreen, 1));
        } else if (chatScreen.J0().b()) {
            chatScreen.J0().a();
        }
        return jue.a;
    }
}
