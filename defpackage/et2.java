package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: et2  reason: default package */
public final class et2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fu2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public et2(fu2 fu2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((et2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new et2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            fu2 fu2 = this.Y;
            this.X = 1;
            obj = ((n22) fu2.C0.getValue()).a(this.Z, fu2.c, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) obj) {
            if (((k22) next) != k22.E0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ek8.l((k22) it.next()));
        }
        return arrayList2;
    }
}
