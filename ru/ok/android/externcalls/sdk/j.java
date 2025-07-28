package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.api.InternalIdResponse;

public final /* synthetic */ class j implements of3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pf3 c;

    public /* synthetic */ j(ConversationImpl conversationImpl, boolean z, pf3 pf3) {
        this.a = conversationImpl;
        this.b = z;
        this.c = pf3;
    }

    public final void accept(Object obj) {
        this.a.lambda$addParticipant$28(this.b, this.c, (InternalIdResponse) obj);
    }
}
