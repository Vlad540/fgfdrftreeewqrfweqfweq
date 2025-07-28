package ru.ok.android.externcalls.sdk;

import org.json.JSONObject;

public final /* synthetic */ class m implements lfd {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fx0 c;
    public final /* synthetic */ pf3 o;

    public /* synthetic */ m(ConversationImpl conversationImpl, boolean z, fx0 fx0, pf3 pf3) {
        this.a = conversationImpl;
        this.b = z;
        this.c = fx0;
        this.o = pf3;
    }

    public final void k(JSONObject jSONObject) {
        this.a.lambda$setCallOptionEnabled$23(this.b, this.c, this.o, jSONObject);
    }
}
