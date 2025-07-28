package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputname.InputNameScreen;

/* renamed from: fb3  reason: default package */
public final class fb3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fb3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((sg9) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fb3 fb3 = new fb3(this.Y, continuation);
        fb3.X = obj;
        return fb3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean z = a34 instanceof za3;
        jue jue = jue.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.Y;
        if (z) {
            ((uma) ko7.a.getAccessor().c(uma.class)).c();
            bm3.p(confirmPhoneScreen);
            cp7 cp7 = cp7.c;
            cp7.getClass();
            cp7.P1().b(":chat-list", (Bundle) null);
        } else if (a34 instanceof ab3) {
            sz6 sz6 = (sz6) confirmPhoneScreen.w0.getValue();
            ab3 ab3 = (ab3) a34;
            String str = ab3.b;
            k77 k77 = ConfirmPhoneScreen.G0[1];
            sz6.getClass();
            sz6.a(n06.f(new InputNameScreen(str, (String) confirmPhoneScreen.o.a(confirmPhoneScreen), ab3.c), (wr3) null, (wr3) null), "InputNameScreen");
        } else if (a34 instanceof a34) {
            bm3.p(confirmPhoneScreen);
            cp7.c.R1(a34);
        }
        return jue;
    }
}
