package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: qf2  reason: default package */
public final class qf2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((qf2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qf2 qf2 = new qf2(continuation, this.Y);
        qf2.X = obj;
        return qf2;
    }

    public final Object o(Object obj) {
        sf8 sf8;
        wx3.H(obj);
        if (((Boolean) this.X).booleanValue()) {
            ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
            qod qod = chatMediaViewerScreen.M0;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            chatMediaViewerScreen.y0().a((yf2) chatMediaViewerScreen.B0().W0.a.getValue());
            sf8 sf82 = chatMediaViewerScreen.E0;
            if (sf82 != null) {
                ek8.e(sf82.a(), (ViewGroup) sf82.b);
            }
            if (chatMediaViewerScreen.y0().getVisibility() == 0 && (sf8 = chatMediaViewerScreen.E0) != null) {
                sf8.c(true);
            }
            chatMediaViewerScreen.D0();
            chatMediaViewerScreen.B0().b1.g(Boolean.FALSE);
        }
        return jue.a;
    }
}
