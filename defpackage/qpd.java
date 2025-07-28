package defpackage;

import one.me.startconversation.StartConversationScreen;

/* renamed from: qpd  reason: default package */
public final /* synthetic */ class qpd implements gk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ qpd(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    public final boolean c(int i) {
        boolean z = false;
        StartConversationScreen startConversationScreen = this.b;
        switch (this.a) {
            case 0:
                if (i != startConversationScreen.C0.j() + startConversationScreen.G0.j() + startConversationScreen.B0.j()) {
                    if (i != startConversationScreen.I0.j()) {
                        return false;
                    }
                    CharSequence l0 = startConversationScreen.l0();
                    if (!(l0 == null || l0.length() == 0)) {
                        return false;
                    }
                }
                return true;
            default:
                k77[] k77Arr = StartConversationScreen.L0;
                CharSequence l02 = startConversationScreen.l0();
                if (l02 == null || l02.length() == 0) {
                    z = true;
                }
                return !z;
        }
    }
}
