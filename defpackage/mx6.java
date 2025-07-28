package defpackage;

import android.view.View;
import one.me.login.inputname.InputNameScreen;

/* renamed from: mx6  reason: default package */
public final /* synthetic */ class mx6 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ mx6(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = InputNameScreen.F0;
                inputNameScreen.q0();
                return jue;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                k77[] k77Arr2 = InputNameScreen.F0;
                boolean z = charSequence.length() > 0;
                String obj2 = charSequence.toString();
                k77 k77 = InputNameScreen.F0[5];
                inputNameScreen.D0.b(inputNameScreen, obj2);
                nf l0 = inputNameScreen.l0();
                l0.c = true;
                l0.setEnabled(z);
                sx6 p0 = inputNameScreen.p0();
                p0.getClass();
                taf.o(p0.w0, new uf6(1));
                return jue;
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                k77[] k77Arr3 = InputNameScreen.F0;
                sx6 p02 = inputNameScreen.p0();
                p02.getClass();
                taf.o(p02.w0, new uf6(2));
                String obj3 = charSequence2.toString();
                k77 k772 = InputNameScreen.F0[6];
                inputNameScreen.E0.b(inputNameScreen, obj3);
                inputNameScreen.p0().q(charSequence2.toString(), inputNameScreen.n0().a.isFocused());
                return jue;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                k77[] k77Arr4 = InputNameScreen.F0;
                if (!inputNameScreen.n0().c()) {
                    inputNameScreen.p0().q(inputNameScreen.o0(), booleanValue);
                }
                return jue;
        }
    }
}
