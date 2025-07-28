package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.startconversation.StartConversationScreen;

/* renamed from: npd  reason: default package */
public final /* synthetic */ class npd implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;
    public final /* synthetic */ RecyclerView c;

    public /* synthetic */ npd(StartConversationScreen startConversationScreen, RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = startConversationScreen;
        this.c = recyclerView;
    }

    public final Object invoke(Object obj) {
        RecyclerView recyclerView = this.c;
        StartConversationScreen startConversationScreen = this.b;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                k77[] k77Arr = StartConversationScreen.L0;
                CharSequence l0 = startConversationScreen.l0();
                if (l0 == null || l0.length() == 0) {
                    return null;
                }
                int l = startConversationScreen.I0.l(intValue);
                if (l == p2a.m) {
                    return recyclerView.getResources().getString(rhc.x0);
                }
                if (l == p2a.p) {
                    return recyclerView.getResources().getString(rhc.z0);
                }
                if (l == p2a.s) {
                    return recyclerView.getResources().getString(rhc.A0);
                }
                return null;
            default:
                int intValue2 = num.intValue();
                k77[] k77Arr2 = StartConversationScreen.L0;
                CharSequence l02 = startConversationScreen.l0();
                if (!(!(l02 == null || l02.length() == 0)) && startConversationScreen.I0.l(intValue2) == p2a.s) {
                    return recyclerView.getResources().getString(lca.x);
                }
                return null;
        }
    }
}
