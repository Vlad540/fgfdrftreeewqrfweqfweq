package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: kf2  reason: default package */
public final class kf2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kf2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kf2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kf2 kf2 = new kf2(continuation, this.Y);
        kf2.X = obj;
        return kf2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ag2 ag2 = (ag2) this.X;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        int j = chatMediaViewerScreen.H0.j();
        List list = ag2.a;
        rf2 rf2 = new rf2(chatMediaViewerScreen, j, ag2);
        sd2 sd2 = chatMediaViewerScreen.H0;
        sd2.getClass();
        sd2.C0.b(list, new tg0(1, rf2));
        return jue.a;
    }
}
