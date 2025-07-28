package defpackage;

import java.util.UUID;
import kotlin.coroutines.Continuation;

/* renamed from: tp1  reason: default package */
public final class tp1 extends l5e implements i26 {
    public final /* synthetic */ nxc X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tp1(nxc nxc, Continuation continuation) {
        super(2, continuation);
        this.X = nxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tp1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tp1(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        String uuid = UUID.randomUUID().toString();
        gy9 gy9 = (pk) ((t97) this.X.a).getValue();
        return new Long(gy9.v(gy9, new nd7(gy9.z().a.n(), uuid)));
    }
}
