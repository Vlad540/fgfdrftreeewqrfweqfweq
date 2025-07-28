package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xwc  reason: default package */
public final class xwc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ywc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xwc(ywc ywc, Continuation continuation) {
        super(2, continuation);
        this.Y = ywc;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xwc xwc = new xwc(this.Y, continuation);
        xwc.X = obj;
        return xwc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ywc ywc = this.Y;
        ywc.a.clear();
        for (vwc vwc : (List) this.X) {
            ywc.a.put(new Long(vwc.a), vwc);
        }
        return jue.a;
    }
}
