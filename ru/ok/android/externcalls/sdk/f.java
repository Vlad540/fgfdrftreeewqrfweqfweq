package ru.ok.android.externcalls.sdk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public final /* synthetic */ class f implements pf3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pf3 b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ f(pf3 pf3, ArrayList arrayList) {
        this.b = pf3;
        this.c = arrayList;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ConversationImpl.lambda$withInternalIds$36(this.b, (ArrayList) this.c, (Map) obj);
                return;
            default:
                ConversationImpl.lambda$withInternalId$34((ParticipantId) this.c, this.b, (Map) obj);
                return;
        }
    }

    public /* synthetic */ f(ParticipantId participantId, pf3 pf3) {
        this.c = participantId;
        this.b = pf3;
    }
}
