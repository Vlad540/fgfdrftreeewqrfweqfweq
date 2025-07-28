package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import kotlin.coroutines.Continuation;

/* renamed from: xf5  reason: default package */
public final class xf5 extends er3 {
    public fle X;
    public xve Y;
    public AsynchronousFileChannel Z;
    public ag5 o;
    public i26 w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ ag5 y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xf5(ag5 ag5, Continuation continuation) {
        super(continuation);
        this.y0 = ag5;
    }

    public final Object o(Object obj) {
        this.x0 = obj;
        this.z0 |= Integer.MIN_VALUE;
        return ag5.a(this.y0, (fle) null, (xve) null, (AsynchronousFileChannel) null, (sf5) null, this);
    }
}
