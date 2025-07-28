package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: pf2  reason: default package */
public final class pf2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pf2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pf2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pf2 pf2 = new pf2(continuation, this.Y);
        pf2.X = obj;
        return pf2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        js3 js3 = (js3) this.X;
        k77[] k77Arr = ChatMediaViewerScreen.O0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        chatMediaViewerScreen.getClass();
        if (hhd.f(js3, fs3.a)) {
            if (chatMediaViewerScreen.K0 >= 0.0f) {
                chatMediaViewerScreen.z0().g(chatMediaViewerScreen.K0);
                chatMediaViewerScreen.K0 = -1.0f;
                chatMediaViewerScreen.y0().b(false);
            } else {
                chatMediaViewerScreen.K0 = chatMediaViewerScreen.z0().e();
                chatMediaViewerScreen.z0().g(0.0f);
                chatMediaViewerScreen.y0().b(true);
            }
        } else if (hhd.f(js3, hs3.a)) {
            chatMediaViewerScreen.L0 = true;
        } else if (js3 instanceof is3) {
            chatMediaViewerScreen.L0 = false;
            chatMediaViewerScreen.z0().I0((long) ((is3) js3).a);
        } else if (js3 instanceof gs3) {
            ah2 B0 = chatMediaViewerScreen.B0();
            int i = ((gs3) js3).a;
            qod D = xs7.D(B0.a, B0.x0.b(), ru3.b, new hg2(B0, i, (Continuation) null));
            B0.g1.o1(B0, ah2.h1[3], D);
        } else if (hhd.f(js3, es3.a)) {
            chatMediaViewerScreen.B0().E(a2a.c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
