package defpackage;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* renamed from: nke  reason: default package */
public final class nke extends er3 {
    public ByteBuffer X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cle Z;
    public cle o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nke(cle cle, Continuation continuation) {
        super(continuation);
        this.Z = cle;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.b((ByteBuffer) null, this);
    }
}
