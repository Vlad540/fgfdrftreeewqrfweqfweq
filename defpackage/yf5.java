package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import kotlin.coroutines.Continuation;

/* renamed from: yf5  reason: default package */
public final class yf5 extends er3 {
    public int A0;
    public fle X;
    public xve Y;
    public AsynchronousFileChannel Z;
    public ag5 o;
    public i26 w0;
    public int x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ ag5 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf5(ag5 ag5, Continuation continuation) {
        super(continuation);
        this.z0 = ag5;
    }

    public final Object o(Object obj) {
        this.y0 = obj;
        this.A0 |= Integer.MIN_VALUE;
        return this.z0.e((fle) null, (xve) null, (AsynchronousFileChannel) null, (i26) null, this);
    }
}
