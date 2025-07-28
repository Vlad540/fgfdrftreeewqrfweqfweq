package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ci2  reason: default package */
public final class ci2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ di2 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ci2(di2 di2, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = di2;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ci2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            di2 di2 = this.Y;
            i22 q = di2.q();
            if (q == null) {
                return jue2;
            }
            long j = q.b.a;
            boolean z = di2.z0.get();
            this.X = 1;
            ((ee4) di2.Z.getValue()).a(di2.b, j, this.Z, z);
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
