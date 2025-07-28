package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a6e  reason: default package */
public final class a6e extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ h6e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a6e(h6e h6e, Continuation continuation) {
        super(2, continuation);
        this.Y = h6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((wve) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a6e a6e = new a6e(this.Y, continuation);
        a6e.X = obj;
        return a6e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wve wve = (wve) this.X;
        String str = this.Y.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "uploadFile: " + wve, (Throwable) null);
        }
        return jue.a;
    }
}
