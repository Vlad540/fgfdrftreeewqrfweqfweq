package defpackage;

import android.view.View;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: bb3  reason: default package */
public final /* synthetic */ class bb3 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ bb3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = ConfirmPhoneScreen.G0;
                confirmPhoneScreen.getRouter().C();
                return jue;
            default:
                ec3 ec3 = (ec3) obj;
                k77[] k77Arr2 = ConfirmPhoneScreen.G0;
                if (ec3 == ec3.SUCCESS) {
                    confirmPhoneScreen.q0().F0.m((Object) null, Boolean.TRUE);
                }
                return jue;
        }
    }
}
