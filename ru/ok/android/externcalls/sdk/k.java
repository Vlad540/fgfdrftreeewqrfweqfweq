package ru.ok.android.externcalls.sdk;

import org.json.JSONObject;

public final /* synthetic */ class k implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf3 b;

    public /* synthetic */ k(pf3 pf3, int i) {
        this.a = i;
        this.b = pf3;
    }

    public final void k(JSONObject jSONObject) {
        int i = this.a;
        pf3 pf3 = this.b;
        switch (i) {
            case 0:
                ConversationImpl.lambda$addParticipant$25(pf3, jSONObject);
                return;
            case 1:
                ConversationImpl.lambda$setCallOptionEnabled$24(pf3, jSONObject);
                return;
            default:
                ConversationImpl.lambda$addParticipant$27(pf3, jSONObject);
                return;
        }
    }
}
