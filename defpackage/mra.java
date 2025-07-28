package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: mra  reason: default package */
public final class mra extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xra Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mra(xra xra, Continuation continuation) {
        super(2, continuation);
        this.Z = xra;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mra) n((Set) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mra mra = new mra(this.Z, continuation);
        mra.Y = obj;
        return mra;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Set<Number> set = (Set) this.Y;
            boolean isEmpty = set.isEmpty();
            xra xra = this.Z;
            if (isEmpty) {
                grd grd = xra.Z;
                iw4 iw4 = iw4.a;
                grd.m((Object) null, iw4);
                xra.x0.m((Object) null, iw4);
            } else {
                ArrayList arrayList = new ArrayList(q23.H(set, 10));
                for (Number longValue : set) {
                    arrayList.add(((bv2) xra.o.getValue()).m(longValue.longValue()));
                }
                kf4 kf4 = new kf4((pj5[]) o23.s0(arrayList).toArray(new pj5[0]), 3);
                lra lra = new lra(xra, (Continuation) null);
                this.X = 1;
                if (ez3.q(kf4, lra, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
