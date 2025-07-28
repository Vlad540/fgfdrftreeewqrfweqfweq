package defpackage;

import android.view.View;
import one.me.startconversation.StartConversationScreen;

/* renamed from: ppd  reason: default package */
public final /* synthetic */ class ppd implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ ppd(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    public final Object invoke(Object obj) {
        StartConversationScreen startConversationScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = StartConversationScreen.L0;
                ex9 onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue.a;
            default:
                int intValue = ((Integer) obj).intValue();
                int j = startConversationScreen.G0.j() + startConversationScreen.B0.j();
                int j2 = startConversationScreen.C0.j() + j;
                cpf cpf = startConversationScreen.D0;
                int j3 = cpf.j() + j2;
                int j4 = startConversationScreen.H0.j();
                CharSequence l0 = startConversationScreen.l0();
                if (!(!(l0 == null || l0.length() == 0)) && intValue >= j && intValue >= j2 && intValue >= j4 && intValue < j3) {
                    return ((pg7) cpf.C(intValue - j2)).b;
                }
                return null;
        }
    }
}
