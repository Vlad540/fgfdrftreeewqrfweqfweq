package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: uk2  reason: default package */
public final class uk2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((uk2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uk2 uk2 = new uk2(continuation, this.Y);
        uk2.X = obj;
        return uk2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wia wia = (wia) this.X;
        hp2 hp2 = (hp2) wia.a;
        yrc yrc = (yrc) wia.b;
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        if (hhd.f(chatScreen.J0().getRightActions(), yda.a)) {
            chatScreen.J0().setRightActions(hp2.g);
        }
        chatScreen.J0().setTitle(hp2.b);
        ChatScreen.u0(chatScreen, chatScreen.J0(), hp2.d);
        nea J0 = chatScreen.J0();
        mge mge = hp2.c;
        J0.setSubtitle(mge != null ? mge.a(chatScreen.getContext()) : null);
        chatScreen.J0().setAvatar(new eea(hp2.a, hp2.f, hp2.e));
        boolean z = yrc instanceof vrc;
        paa paa = paa.o;
        paa paa2 = paa.c;
        if (z) {
            if (chatScreen.G0().getState() == paa2 || chatScreen.G0().getState() == paa) {
                chatScreen.G0().b();
            }
        } else if (yrc instanceof wrc) {
            if (!(chatScreen.G0().getState() == paa2 || chatScreen.G0().getState() == paa)) {
                chatScreen.J0().f(false);
                raa G0 = chatScreen.G0();
                G0.setExpandWithAnimation(((wrc) yrc).a);
                G0.c(true);
            }
        } else if (!(yrc instanceof urc)) {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
