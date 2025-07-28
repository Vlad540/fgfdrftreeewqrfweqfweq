package ru.ok.android.externcalls.sdk.participant;

import org.json.JSONObject;

public final /* synthetic */ class c implements lfd {
    public final /* synthetic */ AddParticipantsCommands a;
    public final /* synthetic */ u16 b;
    public final /* synthetic */ u16 c;

    public /* synthetic */ c(AddParticipantsCommands addParticipantsCommands, u16 u16, u16 u162) {
        this.a = addParticipantsCommands;
        this.b = u16;
        this.c = u162;
    }

    public final void k(JSONObject jSONObject) {
        AddParticipantsCommands$addParticipants$1.invoke$lambda$4(this.a, this.b, this.c, jSONObject);
    }
}
