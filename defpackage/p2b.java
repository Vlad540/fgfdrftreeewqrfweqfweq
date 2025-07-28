package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p2b  reason: default package */
public final class p2b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ q2b Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p2b(q2b q2b, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = q2b;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p2b(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            q2b q2b = this.Y;
            hcd hcd = q2b.x0;
            int i2 = zp4.o;
            q02 M = vx3.M(hcd, mt0.Q(this.Z, eq4.c));
            bw bwVar = new bw(10, (Object) q2b);
            this.X = 1;
            if (M.c(bwVar, this) == pu3) {
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
