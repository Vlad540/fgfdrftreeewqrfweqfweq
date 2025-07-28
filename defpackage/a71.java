package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: a71  reason: default package */
public final class a71 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a71(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.Y = callHistoryScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((a71) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a71 a71 = new a71(continuation, this.Y);
        a71.X = obj;
        return a71;
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        wx3.H(obj);
        c71 c71 = (c71) this.X;
        k77[] k77Arr = CallHistoryScreen.G0;
        CallHistoryScreen callHistoryScreen = this.Y;
        boolean z = ((c71) callHistoryScreen.m0().Z.getValue()).a;
        n0c n0c = callHistoryScreen.Y;
        if (!z) {
            e71 m0 = callHistoryScreen.m0();
            do {
                grd = m0.Z;
                value = grd.getValue();
                c71 c712 = (c71) value;
            } while (!grd.b(value, new c71()));
            ((nea) n0c.T0(callHistoryScreen, CallHistoryScreen.G0[1])).a();
        } else {
            ((nea) n0c.T0(callHistoryScreen, CallHistoryScreen.G0[1])).c(String.valueOf(((c71) callHistoryScreen.m0().Z.getValue()).b.size()), Collections.singletonList(new kea(0, ctb.call_history_item_call_toolbar_action_remove, bnb.ic_delete_22)), new y61(callHistoryScreen, 0), new l(15, callHistoryScreen));
        }
        ((pea) ((nea) n0c.T0(callHistoryScreen, CallHistoryScreen.G0[1])).D0.getValue()).setSelectionTitle(String.valueOf(((c71) callHistoryScreen.m0().Z.getValue()).b.size()));
        return jue.a;
    }
}
