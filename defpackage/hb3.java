package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: hb3  reason: default package */
public final class hb3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hb3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((String) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hb3 hb3 = new hb3(this.Y, continuation);
        hb3.X = obj;
        return hb3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ConfirmPhoneScreen.G0;
        this.Y.o0().J0(0, (String) this.X);
        return jue.a;
    }
}
