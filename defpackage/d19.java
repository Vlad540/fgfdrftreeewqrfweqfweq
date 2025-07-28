package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: d19  reason: default package */
public final class d19 extends o27 implements mhe {
    public final /* synthetic */ MessagesListWidget R0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d19(MessagesListWidget messagesListWidget, c7e c7e) {
        super(c7e);
        this.R0 = messagesListWidget;
    }

    public final void onThemeChanged(pda pda) {
        c7e c7e = this.R0.C0;
        if (c7e == null) {
            c7e = null;
        }
        c7e.onThemeChanged(pda);
    }
}
