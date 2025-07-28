package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: pv8  reason: default package */
public final class pv8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pv8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pv8 pv8 = new pv8(continuation, this.Y);
        pv8.X = obj;
        return pv8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        k77[] k77Arr = MessageWriteWidget.J0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.p0().setKeyboardVisible(booleanValue);
        jme jme = messageWriteWidget.H0;
        if (jme != null) {
            jme.dismiss();
        }
        messageWriteWidget.H0 = null;
        return jue.a;
    }
}
