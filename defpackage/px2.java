package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: px2  reason: default package */
public final class px2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ km4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px2(km4 km4, Continuation continuation) {
        super(2, continuation);
        this.Y = km4;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((pda) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        px2 px2 = new px2(this.Y, continuation);
        px2.X = obj;
        return px2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        pda pda = (pda) this.X;
        ((grd) this.Y.Z).setValue(pda);
        String str = (String) this.Y.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "big_flow: onEach " + pda + ", isEmitted=true", (Throwable) null);
        }
        return jue.a;
    }
}
