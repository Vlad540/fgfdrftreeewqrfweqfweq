package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: i59  reason: default package */
public final class i59 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bs Z;
    public final /* synthetic */ int w0 = 100;
    public final /* synthetic */ r59 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i59(bs bsVar, r59 r59, Continuation continuation) {
        super(2, continuation);
        this.Z = bsVar;
        this.x0 = r59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i59 i59 = new i59(this.Z, this.x0, continuation);
        i59.Y = obj;
        return i59;
    }

    public final Object o(Object obj) {
        long[] jArr;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            bs bsVar = this.Z;
            int i2 = bsVar.c;
            r59 r59 = this.x0;
            int i3 = this.w0;
            if (i2 <= i3) {
                long[] t0 = o23.t0(bsVar);
                this.Y = t0;
                this.X = 1;
                r59.getClass();
                Object f = n1g.f(new q59(r59, (Continuation) null, t0), this);
                if (f == pu3) {
                    return pu3;
                }
                long[] jArr2 = t0;
                obj = f;
                jArr = jArr2;
            } else {
                ArrayList x02 = o23.x0(bsVar, i3, i3);
                ContextScope a = n1g.a(this.b);
                ArrayList arrayList = new ArrayList(q23.H(x02, 10));
                Iterator it = x02.iterator();
                while (it.hasNext()) {
                    arrayList.add(xs7.d(a, (ju3) null, new h59(it.next(), (Continuation) null, ou3, r59), 3));
                }
                this.X = 2;
                obj = lp.c(arrayList, this);
                if (obj == pu3) {
                    return pu3;
                }
                return (List) obj;
            }
        } else if (i == 1) {
            jArr = (long[]) this.Y;
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                udd.s("MissedContactsController", "fail", th);
                return null;
            }
        } else if (i == 2) {
            wx3.H(obj);
            return (List) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Collections.singletonList(new wia(jArr, obj));
    }
}
