package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: a19  reason: default package */
public final class a19 implements iw8 {
    public final /* synthetic */ MessagesListWidget a;

    public a19(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final void b() {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "AutoPlayRegulator", "Player autoplay. Try start autoplay after recycler layout.", (Throwable) null);
        }
        MessagesListWidget messagesListWidget = this.a;
        k77[] k77Arr = MessagesListWidget.b1;
        ? q0 = messagesListWidget.q0();
        afa.a(q0, new s09(q0, this.a, 1));
        this.a.n0().I.f(this);
    }

    public final String getTag() {
        return "AutoPlayRegulator";
    }
}
