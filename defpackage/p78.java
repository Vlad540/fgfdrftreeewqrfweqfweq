package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: p78  reason: default package */
public final class p78 extends er3 {
    public final /* synthetic */ r78 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p78(r78 r78, Continuation continuation) {
        super(continuation);
        this.X = r78;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c((xm8) null, (Set) null, this);
    }
}
