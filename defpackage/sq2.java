package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: sq2  reason: default package */
public final class sq2 extends l5e implements u16 {
    public final /* synthetic */ kr2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sq2(kr2 kr2, Continuation continuation) {
        super(1, continuation);
        this.X = kr2;
    }

    public final Object invoke(Object obj) {
        sq2 sq2 = new sq2(this.X, (Continuation) obj);
        jue jue = jue.a;
        sq2.o(jue);
        return jue;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kr2 kr2 = this.X;
        ArrayList e = kr2.a.e();
        boolean z = o23.f0(e) instanceof qg6;
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof pi2) {
                arrayList.add(next);
            }
        }
        ArrayList i0 = o23.i0(kr2.A0, o23.m0(arrayList, new zo4(14)));
        hq2 hq2 = new hq2(i0, z);
        String str = kr2.D0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, wn6.h(i0.size(), "emitHistory "), (Throwable) null);
        }
        kr2.B0.m((Object) null, hq2);
        kr2.y0.set(e.isEmpty() && !z);
        return jue.a;
    }
}
