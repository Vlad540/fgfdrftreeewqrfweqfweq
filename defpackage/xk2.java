package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: xk2  reason: default package */
public final class xk2 extends l5e implements i26 {
    public final /* synthetic */ ChatScreen X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((xk2) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xk2(continuation, this.X);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ChatScreen.n1;
        this.X.w0();
        return jue.a;
    }
}
