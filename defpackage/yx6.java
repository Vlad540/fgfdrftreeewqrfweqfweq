package defpackage;

import android.widget.EditText;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: yx6  reason: default package */
public final class yx6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yx6(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yx6 yx6 = new yx6(continuation, this.Y);
        yx6.X = obj;
        return yx6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jue jue = (jue) this.X;
        k77[] k77Arr = InputPhoneScreen.I0;
        y7a o0 = this.Y.o0();
        if (o0.hasWindowFocus()) {
            EditText editText = o0.A0;
            editText.requestFocus();
            editText.post(new hg9(o0, 4, editText));
        } else {
            o0.setOnWindowFocusChanged(new ty0(5, o0));
        }
        return jue.a;
    }
}
