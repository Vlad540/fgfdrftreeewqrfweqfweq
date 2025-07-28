package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: t  reason: default package */
public final class t extends l5e implements i26 {
    public int X;
    public final /* synthetic */ v Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(v vVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            v vVar = this.Y;
            grd grd = vVar.o;
            int i2 = by9.b;
            hge hge = new hge(cy9.b);
            ((q0a) vVar.b.getValue()).getClass();
            List singletonList = Collections.singletonList(new igd(i2, hge, new lge("25.7.2")));
            this.X = 1;
            grd.setValue(singletonList);
            if (jue == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
