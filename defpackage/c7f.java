package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: c7f  reason: default package */
public final class c7f extends l5e implements i26 {
    public int X;
    public final /* synthetic */ VideoMessageWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c7f(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.Y = videoMessageWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c7f) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c7f(continuation, this.Y);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            VideoMessageWidget videoMessageWidget = this.Y;
            nc7 viewLifecycleOwner = videoMessageWidget.getViewLifecycleOwner();
            ob7 ob7 = ob7.X;
            b7f b7f = new b7f((Continuation) null, videoMessageWidget);
            this.X = 1;
            Object H = gt0.H(viewLifecycleOwner.R(), ob7, b7f, this);
            if (H != pu3) {
                H = jue;
            }
            if (H == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
