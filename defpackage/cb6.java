package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: cb6  reason: default package */
public final class cb6 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ eb6 Y;
    public final /* synthetic */ Bundle Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cb6(eb6 eb6, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.Y = eb6;
        this.Z = bundle;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cb6(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            String string = this.Z.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            this.X = 1;
            if (eb6.a(this.Y, string, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
