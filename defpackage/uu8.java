package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: uu8  reason: default package */
public final class uu8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uu8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uu8 uu8 = new uu8(continuation, this.Y);
        uu8.X = obj;
        return uu8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jue jue = (jue) this.X;
        hge hge = new hge(rhc.h0);
        k77[] k77Arr = MessageWriteWidget.J0;
        this.Y.B0(hge, true);
        return jue.a;
    }
}
