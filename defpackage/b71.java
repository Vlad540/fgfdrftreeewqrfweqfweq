package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: b71  reason: default package */
public final class b71 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ e71 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b71(e71 e71, Continuation continuation) {
        super(2, continuation);
        this.Y = e71;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((b71) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b71 b71 = new b71(this.Y, continuation);
        b71.X = ((Boolean) obj).booleanValue();
        return b71;
    }

    public final Object o(Object obj) {
        List list;
        Object value;
        wx3.H(obj);
        if (this.X) {
            list = hw4.a;
        } else {
            pz4 pz4 = g71.Y;
            ArrayList arrayList = new ArrayList(q23.H(pz4, 10));
            u1 u1Var = new u1(0, pz4);
            while (u1Var.hasNext()) {
                g71 g71 = (g71) u1Var.next();
                arrayList.add(new h71(g71.ordinal(), g71.a, g71));
            }
            list = arrayList;
        }
        e71 e71 = this.Y;
        grd grd = e71.x0;
        do {
            value = grd.getValue();
        } while (!grd.b(value, sp1.a((sp1) value, list, ((Boolean) e71.Y.getValue()).booleanValue(), false, 4)));
        return jue.a;
    }
}
