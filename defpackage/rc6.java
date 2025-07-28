package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rc6  reason: default package */
public final class rc6 extends er3 {
    public final /* synthetic */ tc6 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rc6(tc6 tc6, Continuation continuation) {
        super(continuation);
        this.X = tc6;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b((List) null, this);
    }
}
