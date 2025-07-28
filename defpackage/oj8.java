package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: oj8  reason: default package */
public final class oj8 extends er3 {
    public final /* synthetic */ uj8 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oj8(uj8 uj8, Continuation continuation) {
        super(continuation);
        this.X = uj8;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.r((Collection) null, this);
    }
}
