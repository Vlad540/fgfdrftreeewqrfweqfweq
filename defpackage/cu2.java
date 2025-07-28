package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cu2  reason: default package */
public final class cu2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu2(fu2 fu2, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((cu2) n((zb9) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cu2 cu2 = new cu2(this.Y, continuation);
        cu2.X = obj;
        return cu2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        zb9 zb9 = (zb9) this.X;
        r59 r59 = (r59) this.Y.F0.getValue();
        r59.getClass();
        if (!zb9.i()) {
            List b = r59.b(zb9);
            if (!b.isEmpty()) {
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "MissedContactsController", wn6.i("requestForChatListScreen: ids=[", o23.c0(b, (String) null, (String) null, (String) null, (u16) null, 63), "]"), (Throwable) null);
                }
                r59.h().d(b);
            }
        }
        return jue.a;
    }
}
