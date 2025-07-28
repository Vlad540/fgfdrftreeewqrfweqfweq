package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: uf5  reason: default package */
public final class uf5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AtomicBoolean Y;
    public final /* synthetic */ ag5 Z;
    public final /* synthetic */ AsynchronousFileChannel w0;
    public final /* synthetic */ AtomicReference x0;
    public final /* synthetic */ d5b y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf5(AtomicBoolean atomicBoolean, ag5 ag5, AsynchronousFileChannel asynchronousFileChannel, AtomicReference atomicReference, d5b d5b, Continuation continuation) {
        super(2, continuation);
        this.Y = atomicBoolean;
        this.Z = ag5;
        this.w0 = asynchronousFileChannel;
        this.x0 = atomicReference;
        this.y0 = d5b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((fle) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uf5 uf5 = new uf5(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
        uf5.X = obj;
        return uf5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        fle fle = (fle) this.X;
        boolean z = this.Y.get();
        jue jue = jue.a;
        if (!z) {
            return jue;
        }
        ag5 ag5 = this.Z;
        xs7.E(ag5.q, ag5.p, (ru3) null, new tf5(ag5, fle, this.w0, this.Y, this.x0, this.y0, (Continuation) null), 2);
        return jue;
    }
}
