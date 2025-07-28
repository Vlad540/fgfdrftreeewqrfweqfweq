package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p65  reason: default package */
public final class p65 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ q65 Y;
    public final /* synthetic */ o65 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p65(q65 q65, Continuation continuation) {
        super(2, continuation);
        o65 o65 = o65.a;
        this.Y = q65;
        this.Z = o65;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p65) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p65(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.b;
            this.X = 1;
            if (hcd.a(this.Z, this) == pu3) {
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
