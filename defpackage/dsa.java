package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: dsa  reason: default package */
public final class dsa extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ksa Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsa(ksa ksa, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = ksa;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dsa) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dsa(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        ksa ksa = this.Y;
        if (i == 0) {
            wx3.H(obj);
            String str = this.Z;
            this.X = 1;
            zv1 zv1 = new zv1(1, urd.y(this));
            zv1.n();
            k77[] k77Arr = ksa.K0;
            ksa.r().d();
            ksa.r().h = new duf((Object) ksa, (Object) str, (Object) zv1);
            ksa.r().f(str);
            zv1.d(new ty0(8, ksa));
            obj = zv1.m();
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            ksa.F0.setValue((List) obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (List) obj) {
            prc prc = (prc) next;
            boolean z = false;
            boolean z2 = prc.a == 4;
            if (z2 && prc.X.t()) {
                z = true;
            }
            if (prc.a == 1 || z || (((Boolean) ksa.Y.invoke()).booleanValue() && z2)) {
                arrayList.add(next);
            }
        }
        ContextScope a = n1g.a(this.b);
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(xs7.d(a, (ju3) null, new csa(it.next(), (Continuation) null, ksa), 3));
        }
        this.X = 2;
        obj = lp.c(arrayList2, this);
        if (obj == pu3) {
            return pu3;
        }
        ksa.F0.setValue((List) obj);
        return jue.a;
    }
}
