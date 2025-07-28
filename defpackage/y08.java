package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;

/* renamed from: y08  reason: default package */
public final class y08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((y08) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y08 y08 = new y08(continuation, this.Y);
        y08.X = obj;
        return y08;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget, rr3] */
    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        MediaBarWidget mediaBarWidget = this.Y;
        if (booleanValue) {
            k77[] k77Arr = MediaBarWidget.h1;
            mediaBarWidget.getClass();
            ax2 ax2 = (ax2) mediaBarWidget.E0.T0(mediaBarWidget, MediaBarWidget.h1[8]);
            if (!hhd.f(ax2.b(), "partial_media_access_widget")) {
                vgc vgc = new vgc(new PartialMediaAccessWidget((Bundle) null, 1, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("partial_media_access_widget");
                ax2.a.R(vgc);
            }
        } else {
            k77[] k77Arr2 = MediaBarWidget.h1;
            mediaBarWidget.getClass();
            k77 k77 = MediaBarWidget.h1[8];
            ((ax2) mediaBarWidget.E0.T0(mediaBarWidget, k77)).a.P(hw4.a, (wr3) null);
        }
        MediaBarWidget.n0(mediaBarWidget);
        return jue.a;
    }
}
