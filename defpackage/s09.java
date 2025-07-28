package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: s09  reason: default package */
public final class s09 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ s09(EndlessRecyclerView2 endlessRecyclerView2, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                vzb vzb = messagesListWidget.a1;
                if (vzb != null) {
                    messagesListWidget.q0().s0(vzb);
                    messagesListWidget.q0().m(vzb);
                    vzb vzb2 = messagesListWidget.a1;
                    if (vzb2 != null) {
                        vzb2.g = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                MessagesListWidget messagesListWidget2 = this.b;
                messagesListWidget2.U0.e(messagesListWidget2.q0(), true);
                return;
        }
    }
}
