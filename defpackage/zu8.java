package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: zu8  reason: default package */
public final class zu8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zu8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zu8 zu8 = new zu8(continuation, this.Y);
        zu8.X = obj;
        return zu8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        CharSequence charSequence = (CharSequence) this.X;
        k77[] k77Arr = MessageWriteWidget.J0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.p0().setText(charSequence);
        messageWriteWidget.p0().h(charSequence.length());
        return jue.a;
    }
}
