package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: mv8  reason: default package */
public final class mv8 extends l5e implements i26 {
    public /* synthetic */ int X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mv8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        jue jue = jue.a;
        n(valueOf, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mv8 mv8 = new mv8(continuation, this.Y);
        mv8.X = ((Number) obj).intValue();
        return mv8;
    }

    public final Object o(Object obj) {
        Object value;
        wx3.H(obj);
        int i = this.X;
        k77[] k77Arr = MessageWriteWidget.J0;
        grd grd = this.Y.v0().L0;
        do {
            value = grd.getValue();
            ((Number) value).intValue();
        } while (!grd.b(value, Integer.valueOf(i)));
        return jue.a;
    }
}
