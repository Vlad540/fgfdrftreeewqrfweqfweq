package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: nxd  reason: default package */
public final class nxd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sxd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nxd(sxd sxd, Continuation continuation) {
        super(2, continuation);
        this.Z = sxd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wia) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nxd nxd = new nxd(this.Z, continuation);
        nxd.Y = obj;
        return nxd;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wia wia = (wia) this.Y;
            this.X = 1;
            if (sxd.q(this.Z, (List) wia.a, (nwd) wia.b, this) == pu3) {
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
