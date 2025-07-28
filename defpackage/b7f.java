package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: b7f  reason: default package */
public final class b7f extends l5e implements i26 {
    public int X;
    public final /* synthetic */ VideoMessageWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b7f(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.Y = videoMessageWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b7f) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b7f(continuation, this.Y);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = VideoMessageWidget.y0;
            VideoMessageWidget videoMessageWidget = this.Y;
            r6f m0 = videoMessageWidget.m0();
            k77 k77 = VideoMessageWidget.y0[0];
            this.X = 1;
            if (m0.l((k3b) videoMessageWidget.c.T0(videoMessageWidget, k77), this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
