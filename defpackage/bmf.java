package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bmf  reason: default package */
public final class bmf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kmf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bmf(kmf kmf, Continuation continuation) {
        super(2, continuation);
        this.Y = kmf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bmf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        kmf kmf = this.Y;
        if (i == 0) {
            wx3.H(obj);
            if (((Boolean) kmf.J0.getValue()).booleanValue()) {
                this.X = 1;
                obj = ez3.D(kmf.K0, this);
                if (obj == pu3) {
                    return pu3;
                }
            } else {
                taf.o(kmf.O0, new klf(false));
                return jue.a;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(kmf.O0, new qlf((String) obj));
        return jue.a;
    }
}
