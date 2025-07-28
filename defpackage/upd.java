package defpackage;

import one.me.startconversation.StartConversationScreen;

/* renamed from: upd  reason: default package */
public final class upd implements oaa {
    public final /* synthetic */ StartConversationScreen a;

    public upd(StartConversationScreen startConversationScreen) {
        this.a = startConversationScreen;
    }

    public final void I(CharSequence charSequence) {
        k77[] k77Arr = StartConversationScreen.L0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        k77[] k77Arr2 = StartConversationScreen.L0;
        k77 k77 = k77Arr2[0];
        startConversationScreen.c.b(startConversationScreen, Boolean.TRUE);
        k77 k772 = k77Arr2[1];
        startConversationScreen.o.b(startConversationScreen, charSequence);
        dqd m0 = startConversationScreen.m0();
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ((mc9) m0.x0.g.getValue()).setValue(obj);
    }

    public final void T() {
        k77[] k77Arr = StartConversationScreen.L0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        k77 k77 = StartConversationScreen.L0[2];
        startConversationScreen.X.b(startConversationScreen, Boolean.FALSE);
        startConversationScreen.K0.f(false);
    }

    public final void n() {
        k77[] k77Arr = StartConversationScreen.L0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        k77 k77 = StartConversationScreen.L0[2];
        startConversationScreen.X.b(startConversationScreen, Boolean.TRUE);
        startConversationScreen.K0.f(true);
    }
}
