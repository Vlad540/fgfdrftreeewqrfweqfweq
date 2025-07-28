package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: gl2  reason: default package */
public final class gl2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gl2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((gl2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gl2 gl2 = new gl2(continuation, this.Y);
        gl2.X = obj;
        return gl2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        nt8 nt8 = (nt8) this.X;
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        if (chatScreen.L0().e1.a.getValue() != null) {
            if (nt8 == null) {
                ChatScreen.v0(chatScreen, iq0.c);
            } else {
                ChatScreen.v0(chatScreen, iq0.a);
            }
        }
        return jue.a;
    }
}
