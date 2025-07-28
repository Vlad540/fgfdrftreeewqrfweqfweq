package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rj8  reason: default package */
public final class rj8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ uj8 Z;
    public final /* synthetic */ si8 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj8(si8 si8, uj8 uj8, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = uj8;
        this.w0 = si8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rj8(this.w0, this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        List<ei8> list = this.Y;
        if (i == 0) {
            wx3.H(obj);
            List U = myc.U(new vqe(myc.L(new es(2, list), new e98(1, this.w0)), new xz6(12)));
            if (U.isEmpty()) {
                return list;
            }
            this.X = 1;
            obj = this.Z.r(U, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable iterable = (Iterable) obj;
        int S = ju7.S(q23.H(iterable, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        for (Object next : iterable) {
            linkedHashMap.put(new Long(((ei8) next).a), next);
        }
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (ei8 ei8 : list) {
            ei8 ei82 = (ei8) linkedHashMap.get(new Long(ei8.a));
            if (ei82 != null) {
                ei8 = ei82;
            }
            arrayList.add(ei8);
        }
        return arrayList;
    }
}
