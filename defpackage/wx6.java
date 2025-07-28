package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: wx6  reason: default package */
public final class wx6 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ pda Y;
    public final /* synthetic */ InputPhoneScreen Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx6(InputPhoneScreen inputPhoneScreen, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                wx6 wx6 = new wx6(this.Z, (Continuation) obj3, 0);
                wx6.Y = (pda) obj2;
                jue jue = jue.a;
                wx6.o(jue);
                return jue;
            default:
                View view = (View) obj;
                wx6 wx62 = new wx6(this.Z, (Continuation) obj3, 1);
                wx62.Y = (pda) obj2;
                jue jue2 = jue.a;
                wx62.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        jue jue = jue.a;
        InputPhoneScreen inputPhoneScreen = this.Z;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                pda pda = this.Y;
                k77[] k77Arr = InputPhoneScreen.I0;
                inputPhoneScreen.o0().onThemeChanged(pda);
                return jue;
            default:
                wx3.H(obj);
                pda pda2 = this.Y;
                k77[] k77Arr2 = InputPhoneScreen.I0;
                inputPhoneScreen.getClass();
                Drawable background = ((View) inputPhoneScreen.x0.T0(inputPhoneScreen, InputPhoneScreen.I0[2])).getBackground();
                c59 c59 = background instanceof c59 ? (c59) background : null;
                if (c59 != null) {
                    c59.onThemeChanged(pda2);
                }
                return jue;
        }
    }
}
