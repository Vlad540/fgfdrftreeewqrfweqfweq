package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ivd  reason: default package */
public final class ivd extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kvd Y;
    public int Z;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ivd(kvd kvd, Continuation continuation) {
        super(continuation);
        this.Y = kvd;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b((String) null, 0, 0, this);
    }
}
