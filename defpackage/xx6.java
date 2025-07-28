package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: xx6  reason: default package */
public final class xx6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xx6(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xx6 xx6 = new xx6(continuation, this.Y);
        xx6.X = obj;
        return xx6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        k77[] k77Arr = InputPhoneScreen.I0;
        this.Y.n0().setEnabled(booleanValue);
        return jue.a;
    }
}
