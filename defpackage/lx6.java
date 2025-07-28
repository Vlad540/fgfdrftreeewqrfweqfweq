package defpackage;

import one.me.login.inputname.InputNameScreen;

/* renamed from: lx6  reason: default package */
public final /* synthetic */ class lx6 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ lx6(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    public final Object invoke() {
        boolean z = false;
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = InputNameScreen.F0;
                return new sz6(inputNameScreen.getRouter());
            case 1:
                k77[] k77Arr2 = InputNameScreen.F0;
                k77[] k77Arr3 = InputNameScreen.F0;
                k77 k77 = k77Arr3[0];
                k77 k772 = k77Arr3[1];
                return new sx6((String) inputNameScreen.b.a(inputNameScreen), (String) inputNameScreen.c.a(inputNameScreen), ko7.a.getAccessor().d(ed3.class));
            default:
                k77[] k77Arr4 = InputNameScreen.F0;
                sx6 p0 = inputNameScreen.p0();
                k77 k773 = InputNameScreen.F0[5];
                String str = (String) inputNameScreen.D0.a(inputNameScreen);
                String o0 = inputNameScreen.o0();
                boolean r = p0.r(1, str);
                boolean r2 = p0.r(2, o0);
                if (r && r2) {
                    taf.o(p0.Y, new kx6(new z7c(p0.c, p0.o, str, o0, (Long) null)));
                }
                if (inputNameScreen.m0().c() || inputNameScreen.n0().c()) {
                    z = true;
                }
                inputNameScreen.l0().setActiveButtonLoaderState(!z);
                return jue.a;
        }
    }
}
