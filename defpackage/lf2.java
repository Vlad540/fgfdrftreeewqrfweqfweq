package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: lf2  reason: default package */
public final class lf2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lf2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((lf2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lf2 lf2 = new lf2(continuation, this.Y);
        lf2.X = obj;
        return lf2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        mge mge = ((bg2) this.X).a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        CharSequence a = mge != null ? mge.a(chatMediaViewerScreen.getContext()) : null;
        if (a == null) {
            a = BuildConfig.FLAVOR;
        }
        if (a.length() > 0) {
            k77[] k77Arr = ChatMediaViewerScreen.O0;
            chatMediaViewerScreen.A0().setTitle(a);
        }
        return jue.a;
    }
}
