package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: cl5  reason: default package */
public final class cl5 extends l5e implements u16 {
    public final /* synthetic */ long X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cl5(long j, Continuation continuation) {
        super(1, continuation);
        this.X = j;
    }

    public final Object invoke(Object obj) {
        new cl5(this.X, (Continuation) obj).o(jue.a);
        throw null;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + zp4.j(this.X), (g37) null);
    }
}
