package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ibb  reason: default package */
public final class ibb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ubb Y;
    public final /* synthetic */ i22 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ibb(ubb ubb, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Y = ubb;
        this.Z = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ibb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        ubb ubb = this.Y;
        if (i == 0) {
            wx3.H(obj);
            if (!((ed3) ubb.Z.getValue()).f()) {
                this.X = 1;
                if (ek8.q(500, this) == pu3) {
                    return pu3;
                }
            } else {
                i22 i22 = this.Z;
                ubb.B0.set(((gy9) ((pk) ubb.X.getValue())).l(i22.a, i22.b.a, 0, (String) null, true, (HashMap) null));
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hcd hcd = ubb.Y;
        aw3 aw3 = aw3.a;
        this.X = 2;
        return hcd.a(aw3, this) == pu3 ? pu3 : jue;
    }
}
