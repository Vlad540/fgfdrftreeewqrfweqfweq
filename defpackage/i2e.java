package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: i2e  reason: default package */
public final class i2e extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kd8 Y;
    public final /* synthetic */ Set Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i2e(kd8 kd8, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.Y = kd8;
        this.Z = linkedHashSet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i2e(this.Y, (LinkedHashSet) this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        kd8 kd8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            pn2 pn2 = new pn2(o23.t0(this.Z));
            this.X = 1;
            obj = ((gy9) ((pk) kd8.a)).K(pn2, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List c = ((wj3) obj).c();
        ArrayList arrayList = new ArrayList(q23.H(c, 10));
        Iterator it = ((ArrayList) c).iterator();
        while (it.hasNext()) {
            uj3 uj3 = (uj3) it.next();
            kd8.getClass();
            String c2 = ehe.c(uj3.A0);
            ArrayList arrayList2 = new ArrayList();
            kd8.n(arrayList2, uj3.X);
            arrayList.add(((f2b) kd8.b).f(uj3.a, arrayList2, c2, uj3.a(), uj3.d(fj0.c), (l2b) null, ((ywc) ((t97) kd8.X).getValue()).a(uj3.a)));
        }
        return arrayList;
    }
}
