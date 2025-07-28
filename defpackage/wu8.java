package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: wu8  reason: default package */
public final class wu8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wu8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wu8 wu8 = new wu8(continuation, this.Y);
        wu8.X = obj;
        return wu8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        k77[] k77Arr = MessageWriteWidget.J0;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (messageWriteWidget.getView() != null) {
            messageWriteWidget.p0().setInputEnabled(!booleanValue);
        }
        return jue.a;
    }
}
