package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: j09  reason: default package */
public final class j09 implements iw8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ j09(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                if (messagesListWidget.getView() == null) {
                    udd.U("ScrollEvent", "Can't process itemsChangedCallback because root view is null");
                    return;
                } else if (messagesListWidget.o0().b()) {
                    messagesListWidget.n0().I.f(this);
                    return;
                } else {
                    udd.U("ScrollEvent", "Can't process itemsChangedCallback because scroll is not meet requirements");
                    return;
                }
            default:
                MessagesListWidget messagesListWidget2 = this.b;
                e09 e09 = messagesListWidget2.S0;
                EndlessRecyclerView2 q0 = messagesListWidget2.q0();
                if (!e09.c) {
                    e09.b(q0, 0, 0);
                }
                messagesListWidget2.Q0.b(messagesListWidget2.q0(), 0, 0);
                return;
        }
    }

    public final String getTag() {
        switch (this.a) {
            case 0:
                return "ScrollEvent";
            default:
                return "ReadMarkUpdater";
        }
    }
}
