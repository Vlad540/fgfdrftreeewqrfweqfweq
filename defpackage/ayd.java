package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ayd  reason: default package */
public final class ayd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kyd Y;
    public final /* synthetic */ Set Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayd(kyd kyd, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = kyd;
        this.Z = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ayd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        Set set = this.Z;
        kyd kyd = this.Y;
        if (i == 0) {
            wx3.H(obj);
            if (kyd.b == mvd.RECENT) {
                List s0 = o23.s0(set);
                this.X = 1;
                if (((v2c) kyd.Y.getValue()).c(s0, this) == pu3) {
                    return pu3;
                }
            } else {
                j73 d = ((fa5) kyd.Z.getValue()).d(o23.s0(set));
                this.X = 2;
                if (e07.c(d, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = sca.F;
        int size = set.size();
        k77[] k77Arr = kyd.G0;
        String s = kyd.s(size);
        taf.o(kyd.E0, new p6d(phc.x, new lge(kyd.o.getString(i2, new Object[]{s}))));
        return jue.a;
    }
}
