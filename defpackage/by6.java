package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: by6  reason: default package */
public final class by6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public by6(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        by6 by6 = new by6(continuation, this.Y);
        by6.X = obj;
        return by6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        iv3 iv3 = (iv3) this.X;
        InputPhoneScreen inputPhoneScreen = this.Y;
        ((c70) inputPhoneScreen.F0.getValue()).a(new ibe("phone_country_changed", 3, llc.b(new wia[]{new wia("phoneCountry", iv3.a.a)})));
        v3a v3a = iv3.a;
        CharSequence charSequence = "";
        if (charSequence.equals(v3a.a)) {
            y7a o0 = inputPhoneScreen.o0();
            o0.A0.removeTextChangedListener(inputPhoneScreen.D0);
            inputPhoneScreen.D0 = null;
        } else {
            b07 b07 = inputPhoneScreen.D0;
            int i = v3a.b;
            String str = v3a.a;
            int i2 = iv3.b;
            if (b07 == null) {
                b07 b072 = new b07((loa) inputPhoneScreen.C0.getValue(), str, i, i2);
                inputPhoneScreen.D0 = b072;
                inputPhoneScreen.o0().A0.addTextChangedListener(b072);
            } else {
                b07.b(i, str);
                b07 b073 = inputPhoneScreen.D0;
                if (b073 != null) {
                    b073.Y = i2;
                }
            }
        }
        CharSequence a = iv3.c.a(inputPhoneScreen.getContext());
        if (a != null) {
            charSequence = a;
        }
        y7a o02 = inputPhoneScreen.o0();
        o02.setHint(charSequence);
        o02.setCountry(v3a);
        return jue.a;
    }
}
