package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rra  reason: default package */
public final class rra extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xra Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rra(xra xra, Continuation continuation) {
        super(2, continuation);
        this.Z = xra;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rra) n((wia) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rra rra = new rra(this.Z, continuation);
        rra.Y = obj;
        return rra;
    }

    public final Object o(Object obj) {
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        xra xra = this.Z;
        if (i == 0) {
            wx3.H(obj);
            wia wia = (wia) this.Y;
            String str2 = (String) wia.a;
            List list = (List) wia.b;
            if (h0e.c0(str2)) {
                xra.D0.m((Object) null, xra.J0);
                return jue.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((prc) next).a == 1) {
                    arrayList.add(next);
                }
            }
            ContextScope a = n1g.a(this.b);
            ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(xs7.d(a, (ju3) null, new qra(it.next(), (Continuation) null, xra), 3));
            }
            this.Y = str2;
            this.X = 1;
            obj = lp.c(arrayList2, this);
            if (obj == pu3) {
                return pu3;
            }
            str = str2;
        } else if (i == 1) {
            str = (String) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xra.D0.m((Object) null, new tra(str, (List) obj));
        return jue.a;
    }
}
