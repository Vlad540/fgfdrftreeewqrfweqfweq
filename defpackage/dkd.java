package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dkd  reason: default package */
public final class dkd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t97 Y;
    public final /* synthetic */ fkd Z;
    public final /* synthetic */ t97 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dkd(t97 t97, fkd fkd, t97 t972, Continuation continuation) {
        super(2, continuation);
        this.Y = t97;
        this.Z = fkd;
        this.w0 = t972;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dkd(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ik5 ik5 = new ik5(((aw2) ((bv2) this.Y.getValue())).m(this.Z.a), 2);
            this.X = 1;
            obj = ez3.D(ik5, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r59 r59 = (r59) this.w0.getValue();
        this.X = 2;
        if (r59.o((i22) obj, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
