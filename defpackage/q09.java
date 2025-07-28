package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: q09  reason: default package */
public final class q09 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q09(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q09 q09 = new q09(continuation, this.Y);
        q09.X = obj;
        return q09;
    }

    public final Object o(Object obj) {
        vzb vzb;
        wx3.H(obj);
        ozb ozb = (ozb) this.X;
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        if (ozb instanceof ozb) {
            if ((!ozb.e || messagesListWidget.o0().a(ozb.c)) && (vzb = messagesListWidget.a1) != null) {
                String str = ozb.d;
                vzb.e(ozb.b, ozb.a, str);
            }
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
