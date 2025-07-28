package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.JoinByIdResponse;

public final /* synthetic */ class t implements of3 {
    public final /* synthetic */ pf3 X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ pf3 c;
    public final /* synthetic */ ConversationParams o;

    public /* synthetic */ t(ConversationImpl conversationImpl, pf3 pf3, ConversationParams conversationParams, pf3 pf32) {
        this.b = conversationImpl;
        this.c = pf3;
        this.o = conversationParams;
        this.X = pf32;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$performConfroomJoin$11(this.o, this.c, this.X, (JoinByIdResponse) obj);
                return;
            default:
                this.b.lambda$runStartConversation$17(this.c, this.o, this.X, (CallInfo) obj);
                return;
        }
    }

    public /* synthetic */ t(ConversationImpl conversationImpl, ConversationParams conversationParams, pf3 pf3, pf3 pf32) {
        this.b = conversationImpl;
        this.o = conversationParams;
        this.c = pf3;
        this.X = pf32;
    }
}
