package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: dg2  reason: default package */
public final class dg2 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ah2 Y;
    public int Z;
    public ah2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dg2(ah2 ah2, Continuation continuation) {
        super(continuation);
        this.Y = ah2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ah2.q(this.Y, (List) null, this);
    }
}
