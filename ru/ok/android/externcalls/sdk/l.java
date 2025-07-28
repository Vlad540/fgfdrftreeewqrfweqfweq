package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

public final /* synthetic */ class l implements of3 {
    public final /* synthetic */ pf3 X;
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pf3 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ l(ConversationImpl conversationImpl, boolean z, pf3 pf3, boolean z2, pf3 pf32) {
        this.a = conversationImpl;
        this.b = z;
        this.c = pf3;
        this.o = z2;
        this.X = pf32;
    }

    public final void accept(Object obj) {
        this.a.lambda$prepare$7(this.b, this.c, this.o, this.X, (Prepare.PrepareResult) obj);
    }
}
