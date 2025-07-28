package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: m09  reason: default package */
public final class m09 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m09(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m09 m09 = new m09(continuation, this.Y);
        m09.X = obj;
        return m09;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bpc bpc = (bpc) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        String str = messagesListWidget.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Got new scrollEvent=" + bpc, (Throwable) null);
        }
        if (bpc.b) {
            messagesListWidget.o0().b();
        } else {
            messagesListWidget.n0().t1(new j09(messagesListWidget, 0));
        }
        return jue.a;
    }
}
