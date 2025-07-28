package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: q86  reason: default package */
public final class q86 extends er3 {
    public final /* synthetic */ s86 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q86(s86 s86, Continuation continuation) {
        super(continuation);
        this.X = s86;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return s86.e(this.X, 0, (List) null, this);
    }
}
