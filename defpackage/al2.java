package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: al2  reason: default package */
public final class al2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((al2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        al2 al2 = new al2(continuation, this.Y);
        al2.X = obj;
        return al2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chatscreen.videomsg.VideoMessageWidget] */
    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        chatScreen.K0().setVisibility(booleanValue ? 0 : 8);
        n0c n0c = chatScreen.a1;
        if (booleanValue) {
            ax2 ax2 = (ax2) n0c.T0(chatScreen, ChatScreen.n1[16]);
            if (!hhd.f(ax2.b(), "video_msg_controller")) {
                vgc vgc = new vgc(new VideoMessageWidget(), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("video_msg_controller");
                ax2.a.R(vgc);
            }
        } else {
            ((ax2) n0c.T0(chatScreen, ChatScreen.n1[16])).a.P(hw4.a, (wr3) null);
        }
        return jue.a;
    }
}
