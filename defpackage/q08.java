package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: q08  reason: default package */
public final class q08 extends l5e implements i26 {
    public final /* synthetic */ MediaBarWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((q08) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q08(continuation, this.X);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = MediaBarWidget.h1;
        ek8.g(this.X.q0(), MediaBarWidget.i1, (u16) null);
        return jue.a;
    }
}
