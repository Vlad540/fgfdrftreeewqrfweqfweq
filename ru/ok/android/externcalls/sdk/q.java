package ru.ok.android.externcalls.sdk;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public final /* synthetic */ class q implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;

    public /* synthetic */ q(ConversationImpl conversationImpl, int i) {
        this.a = i;
        this.b = conversationImpl;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                return conversationImpl.getCallParticipantId((ParticipantId) obj);
            default:
                return conversationImpl.lambda$new$3((List) obj);
        }
    }
}
