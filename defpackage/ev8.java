package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ev8  reason: default package */
public final class ev8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ev8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ev8 ev8 = new ev8(continuation, this.Y);
        ev8.X = obj;
        return ev8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        MessageWriteWidget.l0(this.Y, (nt8) this.X);
        return jue.a;
    }
}
