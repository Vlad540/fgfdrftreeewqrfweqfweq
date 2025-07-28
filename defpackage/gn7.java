package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gn7  reason: default package */
public final class gn7 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t97 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gn7(t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Z = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((List) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gn7 gn7 = new gn7(this.Z, continuation);
        gn7.Y = obj;
        return gn7;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            zec zec = (zec) this.Z.getValue();
            this.X = 1;
            Object U = xs7.U(zec.a.b(), new uec(zec, (List) this.Y, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
