package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: cj  reason: default package */
public final class cj extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cj(gj gjVar, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cj cjVar = new cj(this.Z, continuation);
        cjVar.Y = obj;
        return cjVar;
    }

    public final Object o(Object obj) {
        vt vtVar;
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        gj gjVar = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            pk pkVar = gjVar.a;
            dt dtVar = r8;
            dt dtVar2 = new dt(10, ((lqc) gjVar.c).g.getLong("user.reactionsLastSync", 0), 0, 0);
            this.X = 1;
            obj2 = ((gy9) pkVar).K(dtVar, this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
                obj2 = obj;
            } catch (Throwable th) {
                vtVar = new kcc(th);
            }
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vtVar = (vt) obj2;
        if (vtVar instanceof kcc) {
            vtVar = null;
        }
        vt vtVar2 = vtVar;
        if (vtVar2 == null) {
            return jue;
        }
        ((lqc) gjVar.c).k("user.reactionsLastSync", Long.valueOf(vtVar2.c));
        List list = vtVar2.o;
        Map map = vtVar2.w0;
        this.X = 2;
        return gj.c(gjVar, list, map, this) == pu3 ? pu3 : jue;
    }
}
