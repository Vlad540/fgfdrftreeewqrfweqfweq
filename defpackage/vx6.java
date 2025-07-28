package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: vx6  reason: default package */
public final class vx6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vx6(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((sg9) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vx6 vx6 = new vx6(continuation, this.Y);
        vx6.X = obj;
        return vx6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof tx6) {
            sz6 sz6 = (sz6) this.Y.E0.getValue();
            tx6 tx6 = (tx6) a34;
            String str = tx6.b;
            sz6.getClass();
            sz6.a(n06.f(new ConfirmPhoneScreen(str, tx6.c, tx6.d), (wr3) null, (wr3) null), "ConfirmPhoneScreen");
        } else if (a34 instanceof a34) {
            cp7.c.R1(a34);
        }
        return jue.a;
    }
}
