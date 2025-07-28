package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: lv8  reason: default package */
public final class lv8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lv8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((st8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lv8 lv8 = new lv8(continuation, this.Y);
        lv8.X = obj;
        return lv8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        st8 st8 = (st8) this.X;
        boolean z = false;
        if (st8 != null && st8.a) {
            z = true;
        }
        k77[] k77Arr = MessageWriteWidget.J0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.p0().setLeftOuterIconVisible(z);
        if (z) {
            messageWriteWidget.p0().setLeftOuterIconOnClickListener(new e78(0, messageWriteWidget.u0(), nu8.class, "onMiniAppClick", "onMiniAppClick$message_write_widget_release()V", 0, 4));
            messageWriteWidget.p0().setLeftOuterIconText(st8 != null ? st8.b : null);
        }
        return jue.a;
    }
}
