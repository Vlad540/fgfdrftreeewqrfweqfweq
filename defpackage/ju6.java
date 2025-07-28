package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ju6  reason: default package */
public final class ju6 extends l5e implements i26 {
    public final /* synthetic */ ArrayList X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ju6(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.X = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ju6(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            t23.J(arrayList, new gu6(2));
        }
        return jue.a;
    }
}
