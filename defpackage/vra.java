package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: vra  reason: default package */
public final class vra extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ wra Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vra(wra wra, Continuation continuation) {
        super(2, continuation);
        this.Z = wra;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vra) n((Set) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vra vra = new vra(this.Z, continuation);
        vra.Y = obj;
        return vra;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Set<Number> set = (Set) this.Y;
            boolean isEmpty = set.isEmpty();
            wra wra = this.Z;
            if (isEmpty) {
                wra.o.m((Object) null, iw4.a);
            } else {
                CharSequence charSequence = (CharSequence) wra.x0.getValue();
                if (!(charSequence == null || charSequence.length() == 0)) {
                    taf.o(wra.w0, yra.a);
                }
                ArrayList arrayList = new ArrayList(q23.H(set, 10));
                for (Number longValue : set) {
                    arrayList.add(wra.b.d(longValue.longValue()));
                }
                kf4 kf4 = new kf4((pj5[]) o23.s0(arrayList).toArray(new pj5[0]), 4);
                tg9 tg9 = new tg9(2, wra.o, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5);
                this.X = 1;
                if (ez3.q(kf4, tg9, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
