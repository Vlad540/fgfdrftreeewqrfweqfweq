package ru.ok.android.externcalls.sdk.participant;

import org.json.JSONObject;

public final /* synthetic */ class b implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddParticipantsCommands b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, AddParticipantsCommands addParticipantsCommands, int i) {
        this.a = i;
        this.c = obj;
        this.b = addParticipantsCommands;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                AddParticipantsCommands$addParticipantByLink$2.invoke$lambda$1((pf3) this.c, this.b, jSONObject);
                return;
            default:
                AddParticipantsCommands$addParticipants$1.invoke$lambda$5((u16) this.c, this.b, jSONObject);
                return;
        }
    }
}
