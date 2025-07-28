package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qab  reason: default package */
public final class qab extends l5e implements i26 {
    public int X;
    public final /* synthetic */ sab Y;
    public final /* synthetic */ jh0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qab(sab sab, jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.Y = sab;
        this.Z = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qab(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            sab sab = this.Y;
            hcd hcd = sab.a;
            jh0 jh0 = this.Z;
            jab jab = new jab(new Long(jh0.a), sab.a(sab, jh0.b));
            this.X = 1;
            if (hcd.a(jab, this) == pu3) {
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
