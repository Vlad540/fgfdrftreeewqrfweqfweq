package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gk8  reason: default package */
public final class gk8 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pk8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gk8(pk8 pk8, Continuation continuation) {
        super(2, continuation);
        this.Z = pk8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gk8) n((List) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gk8 gk8 = new gk8(this.Z, continuation);
        gk8.Y = obj;
        return gk8;
    }

    public final Object o(Object obj) {
        pk8 pk8;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            List list = (List) this.Y;
            zb9 zb9 = new zb9(list.size());
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                pk8 = this.Z;
                if (!hasNext) {
                    break;
                }
                tf3 tf3 = (tf3) it.next();
                ira a = !zb9.a(tf3.n()) ? null : ((mta) pk8.e.getValue()).a(tf3, false);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            ((kn3) pk8.c.getValue()).c(arrayList, new xz6(14));
            hcd hcd = pk8.l;
            this.X = 1;
            if (hcd.a(arrayList, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
