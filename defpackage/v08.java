package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: v08  reason: default package */
public final class v08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((v08) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v08 v08 = new v08(continuation, this.Y);
        v08.X = obj;
        return v08;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = MediaBarWidget.h1;
        this.Y.D0((qz) this.X);
        return jue.a;
    }
}
