package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j5d  reason: default package */
public final class j5d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ m5d Y;
    public final /* synthetic */ t3d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j5d(m5d m5d, t3d t3d, Continuation continuation) {
        super(2, continuation);
        this.Y = m5d;
        this.Z = t3d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j5d(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.b;
            q5d q5d = new q5d(this.Z);
            this.X = 1;
            if (hcd.a(q5d, this) == pu3) {
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
