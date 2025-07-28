package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: l41  reason: default package */
public final class l41 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ r41 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l41(r41 r41, Continuation continuation) {
        super(2, continuation);
        this.Y = r41;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((l41) n((c41) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l41 l41 = new l41(this.Y, continuation);
        l41.X = obj;
        return l41;
    }

    public final Object o(Object obj) {
        Object value;
        Object obj2;
        wx3.H(obj);
        c41 c41 = (c41) this.X;
        r41 r41 = this.Y;
        grd grd = r41.o;
        do {
            value = grd.getValue();
            Map map = (Map) value;
            if (hhd.f(c41, n31.a) || hhd.f(c41, m31.a)) {
                obj2 = iw4.a;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(Integer.valueOf(c41.getPriority()), c41);
                obj2 = ju7.W(linkedHashMap);
            }
        } while (!grd.b(value, obj2));
        if ((c41 instanceof ndf) && ((ndf) c41).b != null) {
            xs7.E(r41.a, (hu3) null, (ru3) null, new m41(c41, r41, (Continuation) null), 3);
        }
        return jue.a;
    }
}
