package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: spd  reason: default package */
public final class spd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public spd(StartConversationScreen startConversationScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((List) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        spd spd = new spd(this.Y, continuation);
        spd.X = obj;
        return spd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        k77[] k77Arr = StartConversationScreen.L0;
        StartConversationScreen startConversationScreen = this.Y;
        CharSequence l0 = startConversationScreen.l0();
        boolean z = !(l0 == null || l0.length() == 0);
        jue jue = jue.a;
        if (z) {
            return jue;
        }
        startConversationScreen.B0.E(list);
        return jue;
    }
}
