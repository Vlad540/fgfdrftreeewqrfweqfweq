package defpackage;

import android.view.Surface;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: of2  reason: default package */
public final class of2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public of2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((of2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        of2 of2 = new of2(continuation, this.Y);
        of2.X = obj;
        return of2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a34) {
            k77[] k77Arr = ChatMediaViewerScreen.O0;
            ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
            chatMediaViewerScreen.x0();
            if (ChatMediaViewerScreen.t0(chatMediaViewerScreen)) {
                k7f z0 = chatMediaViewerScreen.z0();
                z0.pause();
                z0.L0((Surface) null);
                z0.M0();
            }
            hf2.c.R1(a34);
        }
        return jue.a;
    }
}
