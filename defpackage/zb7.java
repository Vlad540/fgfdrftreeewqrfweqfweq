package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zb7  reason: default package */
public final class zb7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ac7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zb7(ac7 ac7, Continuation continuation) {
        super(2, continuation);
        this.Y = ac7;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zb7) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zb7 zb7 = new zb7(this.Y, continuation);
        zb7.X = obj;
        return zb7;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        ac7 ac7 = this.Y;
        if (ac7.a.d.compareTo(ob7.b) >= 0) {
            ac7.a.a(ac7);
        } else {
            lp.d(ou3.getCoroutineContext());
        }
        return jue.a;
    }
}
