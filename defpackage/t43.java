package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: t43  reason: default package */
public final class t43 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ a53 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t43(a53 a53, Continuation continuation) {
        super(2, continuation);
        this.Z = a53;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t43 t43 = new t43(this.Z, continuation);
        t43.Y = obj;
        return t43;
    }

    public final Object o(Object obj) {
        Throwable th;
        ou3 ou3;
        grd grd;
        Object value;
        d53 d53;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            k77[] k77Arr = a53.m;
            a53 a53 = this.Z;
            i53 i53 = (i53) a53.h.getValue();
            d53 d532 = i53 instanceof d53 ? (d53) i53 : null;
            Long l = d532 != null ? d532.c : null;
            do {
                grd = a53.h;
                value = grd.getValue();
                i53 i532 = (i53) value;
                i532.getClass();
                if (i532 instanceof d53) {
                    d53 d533 = (d53) i532;
                    List list = d533.a;
                    if (!(o23.f0(list) instanceof f53)) {
                        list = o23.j0(list, f53.a);
                    }
                    d53 = d53.a(d533, list, 6);
                } else {
                    d53 = new d53((Long) null, Collections.singletonList(f53.a), false);
                }
            } while (!grd.b(value, d53));
            try {
                pk pkVar = (pk) a53.d.getValue();
                long[] jArr = a53.g;
                pn2 pn2 = new pn2((dfa) null, 0);
                pn2.i("userIds", jArr);
                pn2.g(50, "count");
                if (l != null) {
                    ((HashMap) pn2.b).put("marker", l);
                }
                this.Y = ou32;
                this.X = 1;
                Object K = ((gy9) pkVar).K(pn2, this);
                if (K == pu3) {
                    return pu3;
                }
                ou3 ou33 = ou32;
                obj = K;
                ou3 = ou33;
            } catch (Throwable th2) {
                ou3 ou34 = ou32;
                th = th2;
                ou3 = ou34;
                if (th instanceof CancellationException) {
                    return null;
                }
                udd.s(ou3.getClass().getName(), "request error!", th);
                return null;
            }
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            try {
                wx3.H(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (qn2) obj;
    }
}
