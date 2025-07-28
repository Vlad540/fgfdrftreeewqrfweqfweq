package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: fcf  reason: default package */
public final class fcf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k26 Z;
    public final /* synthetic */ View w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fcf(k26 k26, View view, Continuation continuation) {
        super(2, continuation);
        this.Z = k26;
        this.w0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((pda) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fcf fcf = new fcf(this.Z, this.w0, continuation);
        fcf.Y = obj;
        return fcf;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Z.invoke(this.w0, (pda) this.Y, this) == pu3) {
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
