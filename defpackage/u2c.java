package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: u2c  reason: default package */
public final class u2c extends er3 {
    public List X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ v2c Z;
    public v2c o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u2c(v2c v2c, Continuation continuation) {
        super(continuation);
        this.Z = v2c;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.c((List) null, this);
    }
}
