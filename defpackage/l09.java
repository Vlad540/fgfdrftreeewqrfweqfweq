package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: l09  reason: default package */
public final class l09 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l09(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l09 l09 = new l09(continuation, this.Y);
        l09.X = obj;
        return l09;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        String str = this.Y.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            int size = list.size();
            Object X2 = o23.X(list);
            MessageModel messageModel = X2 instanceof MessageModel ? (MessageModel) X2 : null;
            String m = messageModel != null ? messageModel.m() : null;
            Object f0 = o23.f0(list);
            MessageModel messageModel2 = f0 instanceof MessageModel ? (MessageModel) f0 : null;
            String m2 = messageModel2 != null ? messageModel2.m() : null;
            fn6.d(tn7, str, "Got new messages on UI, size=" + size + ", first=" + m + ", last=" + m2, (Throwable) null);
        }
        this.Y.E0.E(list);
        return jue.a;
    }
}
