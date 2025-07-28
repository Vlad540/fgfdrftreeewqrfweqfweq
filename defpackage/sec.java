package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: sec  reason: default package */
public final class sec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zec Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sec(zec zec, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = zec;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sec(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            dsd a = this.Y.a();
            this.X = 1;
            a.getClass();
            if (r1g.h(a.a, new bsd(a, this.Z, 0), this) == pu3) {
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
