package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: eu6  reason: default package */
public final class eu6 extends l5e implements i26 {
    public ConcurrentHashMap X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ bv6 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eu6(bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.w0 = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eu6 eu6 = new eu6(this.w0, continuation);
        eu6.Z = obj;
        return eu6;
    }

    public final Object o(Object obj) {
        dde dde;
        ConcurrentHashMap concurrentHashMap;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Z;
            String str = bv6.I0;
            dde dde2 = new dde("fetchAlbums");
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            List<h46> list = h46.e;
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (h46 du6 : list) {
                bv6 bv6 = this.w0;
                arrayList.add(xs7.E(ou3, bv6.c.b(), (ru3) null, new du6(du6, bv6, dde2, concurrentHashMap2, (Continuation) null), 2));
            }
            this.Z = dde2;
            this.X = concurrentHashMap2;
            this.Y = 1;
            if (lp.v(arrayList, this) == pu3) {
                return pu3;
            }
            dde = dde2;
            concurrentHashMap = concurrentHashMap2;
        } else if (i == 1) {
            concurrentHashMap = this.X;
            dde = (dde) this.Z;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dde.getClass();
        return o23.s0(concurrentHashMap.values());
    }
}
