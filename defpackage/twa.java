package defpackage;

import android.view.ViewGroup;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: twa  reason: default package */
public final /* synthetic */ class twa implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipScreen b;

    public /* synthetic */ twa(PipScreen pipScreen, int i) {
        this.a = i;
        this.b = pipScreen;
    }

    public final Object invoke() {
        PipScreen pipScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PipScreen.o;
                cf1 cf1 = new cf1(pipScreen.getContext());
                cf1.setPipTheme(qda.a);
                cf1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                cf1.setVideoLayoutUpdatesControllerProvider(new twa(pipScreen, 2));
                cf1.setBackgroundCorners(0.0f);
                return cf1;
            case 1:
                k77[] k77Arr2 = PipScreen.o;
                z11 z11 = z11.a;
                return new nwa((aka) z11.getAccessor().c(aka.class), z11.c(), z11.b(), new gvf(22, (Object) pipScreen), bh1.a.getAccessor().d(xk1.class));
            default:
                k77[] k77Arr3 = PipScreen.o;
                return (f5f) ((nwa) pipScreen.b.getValue()).Y.getValue();
        }
    }
}
