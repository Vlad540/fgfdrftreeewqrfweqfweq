package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: y56  reason: default package */
public final class y56 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m66 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y56(m66 m66, Continuation continuation) {
        super(2, continuation);
        this.Y = m66;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((wia) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y56 y56 = new y56(this.Y, continuation);
        y56.X = obj;
        return y56;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wia wia = (wia) this.X;
        List list = (List) wia.b;
        int size = list.size();
        udd.q("m66", "got album and items, items size = " + size);
        m66 m66 = this.Y;
        m66.D0.m((Object) null, Boolean.FALSE);
        m66.F0.setValue((o46) wia.a);
        m66.A0.m((Object) null, list);
        return jue.a;
    }
}
