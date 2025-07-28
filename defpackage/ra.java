package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: ra  reason: default package */
public final class ra extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sa Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ra(sa saVar, Continuation continuation) {
        super(2, continuation);
        this.Y = saVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ra) n((Map) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ra raVar = new ra(this.Y, continuation);
        raVar.X = obj;
        return raVar;
    }

    public final Object o(Object obj) {
        Object value;
        hge hge;
        ArrayList g;
        wx3.H(obj);
        Map map = (Map) this.X;
        sa saVar = this.Y;
        grd grd = saVar.o;
        do {
            value = grd.getValue();
            qa qaVar = (qa) value;
            hge = map.isEmpty() ? new hge(r1a.S1) : new dge(q1a.a, map.size());
            saVar.b.getClass();
            g = m54.g(map);
            qaVar.getClass();
        } while (!grd.b(value, new qa(hge, g)));
        return jue.a;
    }
}
