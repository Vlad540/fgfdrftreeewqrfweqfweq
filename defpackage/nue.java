package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nue  reason: default package */
public final class nue extends l5e implements i26 {
    public int X;
    public final /* synthetic */ oue Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nue(oue oue, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = oue;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nue(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            ((ch3) this.Y.d.getValue()).a(this.Z);
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
