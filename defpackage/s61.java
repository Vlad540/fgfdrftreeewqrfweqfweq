package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: s61  reason: default package */
public final class s61 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ CallHistoryPageScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s61(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callHistoryPageScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((s61) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s61 s61 = new s61(this.Y, continuation);
        s61.X = ((Boolean) obj).booleanValue();
        return s61;
    }

    public final Object o(Object obj) {
        Object value;
        wx3.H(obj);
        boolean z = this.X;
        kk9 kk9 = CallHistoryPageScreen.y0;
        grd grd = this.Y.n0().z0;
        do {
            value = grd.getValue();
            ((Boolean) value).getClass();
        } while (!grd.b(value, Boolean.valueOf(z)));
        return jue.a;
    }
}
