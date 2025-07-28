package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ea1  reason: default package */
public final class ea1 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ int w0;
    public final /* synthetic */ ga1 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ea1(List list, int i, ga1 ga1, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.w0 = i;
        this.x0 = ga1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ea1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ea1 ea1 = new ea1(this.Z, this.w0, this.x0, continuation);
        ea1.Y = obj;
        return ea1;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [i26, l5e] */
    public final Object o(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object obj3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        int i2 = 2;
        ArrayList arrayList = null;
        ga1 ga1 = this.x0;
        int i3 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            List<Number> list = this.Z;
            if (list.isEmpty() || i3 == 0) {
                grd grd = ga1.A0;
                do {
                    value2 = grd.getValue();
                } while (!grd.b(value2, y91.a((y91) value2, (mc0) null, (hy7) null, (hy7) null, false, (mge) null, (ArrayList) null, ga1.q(ga1, hw4.a, i3), 63)));
                return jue;
            }
            ArrayList arrayList2 = new ArrayList(q23.H(list, 10));
            for (Number longValue : list) {
                arrayList2.add(((ap3) ga1.w0.getValue()).c(longValue.longValue()));
            }
            da1 da1 = new da1((pj5[]) o23.s0(arrayList2).toArray(new pj5[0]), ou3, list, ga1, 0);
            int i4 = zp4.o;
            bc n = vx3.n(da1, zp4.e(mt0.P(5, eq4.SECONDS)), new l5e(2, (Continuation) null));
            this.X = 1;
            obj2 = ez3.D(n, this);
            if (obj2 == obj3) {
                return obj3;
            }
        } else if (i == 1) {
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj4 = ((mcc) obj2).a;
        if (obj4 instanceof kcc) {
            obj4 = null;
        }
        tf3[] tf3Arr = (tf3[]) obj4;
        if (tf3Arr != null) {
            arrayList = cs.X(tf3Arr);
        }
        if (arrayList == null) {
            return jue;
        }
        if (i3 <= 3) {
            i2 = i3;
        }
        List<tf3> n0 = o23.n0(arrayList, i2);
        ArrayList arrayList3 = new ArrayList();
        for (tf3 tf3 : n0) {
            arrayList3.add(new wia(new ub0(tf3.m(), tf3.n()), tf3.p(fj0.a)));
        }
        if (i3 > 3) {
            arrayList3.add(ga1.G0);
        }
        grd grd2 = ga1.A0;
        do {
            value = grd2.getValue();
        } while (!grd2.b(value, y91.a((y91) value, (mc0) null, (hy7) null, (hy7) null, false, (mge) null, arrayList3, ga1.q(ga1, arrayList, i3), 31)));
        return jue;
    }
}
