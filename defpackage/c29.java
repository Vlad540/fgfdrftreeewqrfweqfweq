package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: c29  reason: default package */
public final class c29 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ e29 Y;
    public int Z;
    public e29 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c29(e29 e29, Continuation continuation) {
        super(continuation);
        this.Y = e29;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((List) null, this);
    }
}
