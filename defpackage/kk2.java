package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: kk2  reason: default package */
public final class kk2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kk2) n((cg6) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kk2 kk2 = new kk2(continuation, this.Y);
        kk2.X = obj;
        return kk2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        cg6 cg6 = (cg6) this.X;
        wia wia = cg6 == null ? null : new wia(new Long(cg6.b), cg6.d);
        k77[] k77Arr = ChatScreen.n1;
        this.Y.D0().q(wia);
        return jue.a;
    }
}
