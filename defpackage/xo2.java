package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: xo2  reason: default package */
public final class xo2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((yo2) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xo2 xo2 = new xo2(continuation, this.Y);
        xo2.X = obj;
        return xo2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((yo2) this.X, yo2.a)) {
            k77[] k77Arr = ChatTitleIconScreen.D0;
            ChatTitleIconScreen chatTitleIconScreen = this.Y;
            chatTitleIconScreen.o0().setProgressEnabled(false);
            hba hba = new hba((Widget) chatTitleIconScreen);
            hba.h(new hge(lca.b));
            hba.j();
        }
        return jue.a;
    }
}
