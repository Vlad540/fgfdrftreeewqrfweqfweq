package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: z09  reason: default package */
public final class z09 implements iw8 {
    public final ue3 a;
    public final /* synthetic */ MessagesListWidget b;

    public z09(MessagesListWidget messagesListWidget, zue zue) {
        this.b = messagesListWidget;
        this.a = new ue3(messagesListWidget, this, zue, 4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final void a() {
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.b;
        ? q0 = messagesListWidget.q0();
        ue3 ue3 = this.a;
        q0.removeCallbacks(ue3);
        messagesListWidget.q0().postDelayed(ue3, 350);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final void b() {
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.b;
        ? q0 = messagesListWidget.q0();
        ue3 ue3 = this.a;
        q0.removeCallbacks(ue3);
        messagesListWidget.q0().postDelayed(ue3, 350);
    }

    public final String getTag() {
        return "AfterOnDetach scroll to new message";
    }
}
