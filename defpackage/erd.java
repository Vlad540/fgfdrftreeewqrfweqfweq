package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: erd  reason: default package */
public final class erd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ l7c w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public erd(gl5 gl5, l7c l7c, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = gl5;
        this.w0 = l7c;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        erd erd = new erd(this.Z, this.w0, this.x0, continuation);
        erd.Y = obj;
        return erd;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            long j = this.x0;
            drd drd = new drd(this.Z, this.w0, (rj5) this.Y, j, (Continuation) null);
            this.X = 1;
            if (n1g.f(drd, this) == pu3) {
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
