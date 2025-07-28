package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: fv8  reason: default package */
public final class fv8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fv8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fv8 fv8 = new fv8(continuation, this.Y);
        fv8.X = obj;
        return fv8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        MessageWriteWidget.m0(this.Y, (pt8) this.X);
        return jue.a;
    }
}
