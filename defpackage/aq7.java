package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: aq7  reason: default package */
public final class aq7 extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((aq7) n((File) obj, (Continuation) obj2)).o(jue.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, aq7, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return new djc(new v9e(new s5c(((File) this.X).getAbsolutePath()), (Continuation) null));
    }
}
