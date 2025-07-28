package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: cb3  reason: default package */
public final /* synthetic */ class cb3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ cb3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    public final Object invoke() {
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ConfirmPhoneScreen.G0;
                confirmPhoneScreen.getClass();
                k77[] k77Arr2 = ConfirmPhoneScreen.G0;
                k77 k77 = k77Arr2[2];
                int intValue = ((Number) confirmPhoneScreen.X.a(confirmPhoneScreen)).intValue();
                k77 k772 = k77Arr2[0];
                k77 k773 = k77Arr2[1];
                ko7 ko7 = ko7.a;
                ko7.getClass();
                return new rb3(intValue, (String) confirmPhoneScreen.c.a(confirmPhoneScreen), (String) confirmPhoneScreen.o.a(confirmPhoneScreen), new r7e(new ib7(4)), new r7e(new ib7(6)), new r7e(new ib7(5)), ko7.getAccessor().d(pae.class), ko7.getAccessor().d(ed3.class));
            case 1:
                k77[] k77Arr3 = ConfirmPhoneScreen.G0;
                return new sz6(confirmPhoneScreen.getRouter());
            default:
                k77[] k77Arr4 = ConfirmPhoneScreen.G0;
                return d8.u(confirmPhoneScreen.getContext(), utb.oneme_login_confirm_timer);
        }
    }
}
