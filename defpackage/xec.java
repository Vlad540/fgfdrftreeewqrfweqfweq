package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xec  reason: default package */
public final class xec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zec Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int w0 = 2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xec(zec zec, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zec;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xec(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            List singletonList = Collections.singletonList(new Long(this.Z));
            this.X = 1;
            zec zec = this.Y;
            Object U = xs7.U(zec.a.b(), new yec(zec, singletonList, this.w0, (Continuation) null), this);
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
