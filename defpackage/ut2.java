package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ut2  reason: default package */
public final class ut2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ fu2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut2(fu2 fu2, Continuation continuation) {
        super(2, continuation);
        this.Z = fu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ut2) n((ArrayList) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ut2 ut2 = new ut2(this.Z, continuation);
        ut2.Y = obj;
        return ut2;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        fu2 fu2 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ArrayList arrayList = (ArrayList) this.Y;
            fu2.L0.setValue(arrayList);
            if (fu2.q(fu2, (hq2) fu2.K0.a.getValue())) {
                fu2.M0.setValue(arrayList);
            }
            int i2 = zp4.o;
            long P = mt0.P(1, eq4.MINUTES);
            this.X = 1;
            if (ek8.r(P, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fu2.u();
        return jue.a;
    }
}
