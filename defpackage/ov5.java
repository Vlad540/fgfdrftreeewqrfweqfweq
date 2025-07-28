package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ov5  reason: default package */
public final class ov5 extends l5e implements i26 {
    public Object X;
    public int Y;
    public final /* synthetic */ pv5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ov5(pv5 pv5, Continuation continuation) {
        super(2, continuation);
        this.Z = pv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ov5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ov5(this.Z, continuation);
    }

    public final Object o(Object obj) {
        iw5 iw5;
        mc9 mc9;
        pv5 pv5;
        mc9 mc92;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        pv5 pv52 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            Set set = pv52.a;
            this.X = pv52;
            this.Y = 1;
            obj = ((b29) dv5.a.getAccessor().c(b29.class)).b(set, this);
            if (obj == pu3) {
                return pu3;
            }
            pv5 = pv52;
        } else if (i == 1) {
            pv5 = (pv5) this.X;
            wx3.H(obj);
        } else if (i == 2) {
            mc9 = (mc9) this.X;
            wx3.H(obj);
            iw5 = (iw5) obj;
            mc9.setValue(iw5);
            return jue;
        } else if (i == 3) {
            mc92 = (mc9) this.X;
            wx3.H(obj);
            iw5 = (iw5) obj;
            mc9.setValue(iw5);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pv5.o = (List) obj;
        grd grd = pv52.m;
        Set set2 = pv52.a;
        int size = set2.size();
        lw5 lw5 = pv52.b;
        if (size > 1) {
            vo8 vo8 = (vo8) o23.X(pv52.o);
            if (vo8 == null) {
                return jue;
            }
            int size2 = set2.size();
            this.X = grd;
            this.Y = 2;
            Object b = lw5.b(size2, vo8.x0, this);
            if (b == pu3) {
                return pu3;
            }
            grd grd2 = grd;
            obj = b;
            mc9 = grd2;
            iw5 = (iw5) obj;
            mc9.setValue(iw5);
            return jue;
        }
        vo8 vo82 = (vo8) o23.X(pv52.o);
        if (vo82 == null) {
            return jue;
        }
        this.X = grd;
        this.Y = 3;
        Object a = lw5.a(vo82, pv52.d, this);
        if (a == pu3) {
            return pu3;
        }
        grd grd3 = grd;
        obj = a;
        mc92 = grd3;
        iw5 = (iw5) obj;
        mc9.setValue(iw5);
        return jue;
    }
}
