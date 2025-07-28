package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: tk2  reason: default package */
public final class tk2 extends l5e implements i26 {
    public final /* synthetic */ ChatScreen X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((tk2) n((q2e) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tk2(continuation, this.X);
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ChatScreen.n1;
        ? r11 = this.X;
        if (r11.I0().a() == null) {
            ax2 I0 = r11.I0();
            boolean f = hhd.f(I0.b(), "SuggestionsWidgetTag");
            String str = r11.O0;
            if (!f) {
                vgc vgc = new vgc(new SuggestionsWidget(str, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("SuggestionsWidgetTag");
                I0.a.R(vgc);
            }
            sgc childRouter = r11.getChildRouter(r11.H0());
            childRouter.e = 1;
            childRouter.Q(false);
            if (!childRouter.n()) {
                childRouter.R(n06.f(new SuggestionsWidget(str, (x54) null), (wr3) null, (wr3) null));
            }
        }
        return jue.a;
    }
}
