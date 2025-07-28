package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: rk2  reason: default package */
public final class rk2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((rk2) n((i05) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rk2 rk2 = new rk2(continuation, this.Y);
        rk2.X = obj;
        return rk2;
    }

    public final Object o(Object obj) {
        z68 z68;
        wx3.H(obj);
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        int t = hr1.t(((kt8) ((i05) this.X).a).a);
        if (t != 0) {
            ex8 ex8 = ex8.a;
            if (t == 1) {
                i22 i22 = (i22) chatScreen.L0().Z0.a.getValue();
                if (i22 != null) {
                    k77[] k77Arr2 = ChatScreen.n1;
                    k77 k77 = k77Arr2[13];
                    n0c n0c = chatScreen.W0;
                    if (!((sgc) n0c.T0(chatScreen, k77)).n()) {
                        MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(chatScreen.O0, i22.a, false, 4, (x54) null);
                        mediaKeyboardWidget.o = chatScreen.c1;
                        ((sgc) n0c.T0(chatScreen, k77Arr2[13])).R(n06.f(mediaKeyboardWidget, (wr3) null, (wr3) null));
                    }
                    int i = e87.a;
                    if (e87.b(e87.c)) {
                        taf.o(chatScreen.D0().w0, ex8);
                    }
                    if (chatScreen.M0()) {
                        eaf.l(chatScreen.x0(), (u12) null);
                        eaf.l((az1) chatScreen.P0.T0(chatScreen, k77Arr2[6]), (u12) null);
                        t9f.u(chatScreen.x0(), (uw9) null);
                    }
                    ax2 I0 = chatScreen.I0();
                    I0.a.P(hw4.a, (wr3) null);
                    z68 z682 = chatScreen.X0;
                    if (z682 != null) {
                        z682.f();
                    }
                }
            } else if (t == 2) {
                z68 z683 = chatScreen.X0;
                if (z683 != null && z683.l) {
                    taf.o(chatScreen.D0().w0, ex8);
                }
                MessageWriteWidget C0 = chatScreen.C0();
                if (C0 != null) {
                    C0.p0().e(true);
                }
                e07.B(new ck5(ez3.e0(new zi1(e87.f, 9), 1), new xk2((Continuation) null, chatScreen), 5), chatScreen.getViewLifecycleScope());
            } else if (t == 3 && (z68 = chatScreen.X0) != null && z68.l) {
                taf.o(chatScreen.D0().w0, ex8);
            }
        } else {
            z68 z684 = chatScreen.X0;
            if (z684 != null) {
                k77[] k77Arr3 = z68.m;
                z684.e(true);
            }
        }
        return jue.a;
    }
}
