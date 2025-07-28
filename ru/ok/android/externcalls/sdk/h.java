package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

public final /* synthetic */ class h implements of3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ pf3 b;
    public final /* synthetic */ pf3 c;

    public /* synthetic */ h(ConversationImpl conversationImpl, pf3 pf3, pf3 pf32) {
        this.a = conversationImpl;
        this.b = pf3;
        this.c = pf32;
    }

    public final void accept(Object obj) {
        this.a.lambda$prepareJoinByLink$9(this.b, this.c, (Prepare.PrepareResult) obj);
    }
}
