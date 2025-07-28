package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: zp2  reason: default package */
public final class zp2 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aq2 Y;
    public int Z;
    public aq2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp2(aq2 aq2, Continuation continuation) {
        super(continuation);
        this.Y = aq2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((Set) null, this);
    }
}
