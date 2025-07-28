package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: lk2  reason: default package */
public final class lk2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((lk2) n((iq0) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lk2 lk2 = new lk2(continuation, this.Y);
        lk2.X = obj;
        return lk2;
    }

    public final Object o(Object obj) {
        Object value;
        wx3.H(obj);
        iq0 iq0 = (iq0) this.X;
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        nx8 D0 = chatScreen.D0();
        boolean f = hhd.f(iq0.name(), "SEARCH");
        grd grd = D0.b;
        do {
            value = grd.getValue();
            ((Boolean) value).getClass();
        } while (!grd.b(value, Boolean.valueOf(f)));
        ChatScreen.v0(chatScreen, iq0);
        return jue.a;
    }
}
