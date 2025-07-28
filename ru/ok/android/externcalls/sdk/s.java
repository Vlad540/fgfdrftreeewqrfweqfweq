package ru.ok.android.externcalls.sdk;

import java.util.Collection;

public final /* synthetic */ class s implements pf3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u16 d;
    public final /* synthetic */ u16 e;

    public /* synthetic */ s(ConversationImpl conversationImpl, Boolean bool, boolean z, u16 u16, u16 u162) {
        this.a = conversationImpl;
        this.b = bool;
        this.c = z;
        this.d = u16;
        this.e = u162;
    }

    public final void accept(Object obj) {
        this.a.lambda$addParticipants$30(this.b, this.c, this.d, this.e, (Collection) obj);
    }
}
