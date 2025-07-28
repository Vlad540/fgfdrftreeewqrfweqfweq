package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: x6a  reason: default package */
public final class x6a extends er3 {
    public final /* synthetic */ y6a X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x6a(y6a y6a, Continuation continuation) {
        super(continuation);
        this.X = y6a;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0, (List) null, this);
    }
}
