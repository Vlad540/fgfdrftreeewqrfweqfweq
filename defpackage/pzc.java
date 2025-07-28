package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.server.ServerHostBottomSheet;

/* renamed from: pzc  reason: default package */
public final class pzc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ServerHostBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pzc(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet) {
        super(2, continuation);
        this.Y = serverHostBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pzc) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pzc pzc = new pzc(continuation, this.Y);
        pzc.X = obj;
        return pzc;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [mr5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.E0.E((List) this.X);
        return jue.a;
    }
}
