package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: gb3  reason: default package */
public final class gb3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gb3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((String) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gb3 gb3 = new gb3(this.Y, continuation);
        gb3.X = obj;
        return gb3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        String str = (String) this.X;
        k77[] k77Arr = ConfirmPhoneScreen.G0;
        ConfirmPhoneScreen confirmPhoneScreen = this.Y;
        confirmPhoneScreen.getClass();
        g37 g37 = (g37) confirmPhoneScreen.F0.T0(confirmPhoneScreen, ConfirmPhoneScreen.G0[7]);
        jue jue = jue.a;
        if ((g37 != null && g37.isActive()) || confirmPhoneScreen.E0 != null) {
            return jue;
        }
        confirmPhoneScreen.r0(str);
        return jue;
    }
}
