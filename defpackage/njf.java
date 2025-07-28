package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: njf  reason: default package */
public final class njf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ pjf Y;
    public final /* synthetic */ sjf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public njf(pjf pjf, sjf sjf, Continuation continuation) {
        super(2, continuation);
        this.Y = pjf;
        this.Z = sjf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((jue) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new njf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (pjf.f(this.Y, this.Z, this) == pu3) {
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
