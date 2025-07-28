package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: p09  reason: default package */
public final class p09 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p09(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p09 p09 = new p09(continuation, this.Y);
        p09.X = obj;
        return p09;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final Object o(Object obj) {
        int J;
        wx3.H(obj);
        zue zue = (zue) this.X;
        long a = zue.a();
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        k77[] k77Arr2 = MessagesListWidget.b1;
        k77 k77 = k77Arr2[2];
        messagesListWidget.o.b(messagesListWidget, Long.valueOf(a));
        wue wue = messagesListWidget.J0;
        if (wue != null) {
            k77 k772 = k77Arr2[4];
            jr jrVar = messagesListWidget.Y;
            wue.c = ((Boolean) jrVar.a(messagesListWidget)).booleanValue() ? 0 : zue.a();
            k77 k773 = k77Arr2[3];
            if (((Boolean) messagesListWidget.X.a(messagesListWidget)).booleanValue()) {
                k77 k774 = k77Arr2[4];
                if (!((Boolean) jrVar.a(messagesListWidget)).booleanValue()) {
                    messagesListWidget.n0().t1(new z09(messagesListWidget, zue));
                }
            }
            messagesListWidget.q0().Y();
            if ((zue instanceof yue) && (J = messagesListWidget.E0.J(((yue) zue).a)) >= 0) {
                messagesListWidget.Q0.e = -1;
                messagesListWidget.q0().getLinearLayoutManager().n1(J, messagesListWidget.q0().getMeasuredHeight() - wue.i().getMeasuredHeight());
            }
        }
        return jue.a;
    }
}
