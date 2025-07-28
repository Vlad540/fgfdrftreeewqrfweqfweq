package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: w08  reason: default package */
public final class w08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((w08) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w08 w08 = new w08(continuation, this.Y);
        w08.X = obj;
        return w08;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = MediaBarWidget.h1;
        this.Y.C0((jxc) this.X);
        return jue.a;
    }
}
