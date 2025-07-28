package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bf7  reason: default package */
public final class bf7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ef7 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf7(ef7 ef7, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ef7;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bf7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            jz jzVar = new jz(((td7) this.Y.i.getValue()).a, this.Z, 3);
            this.X = 1;
            obj = ez3.D(jzVar, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
