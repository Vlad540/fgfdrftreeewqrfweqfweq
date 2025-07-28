package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pxd  reason: default package */
public final class pxd extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sxd Y;
    public int Z;
    public red o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxd(sxd sxd, Continuation continuation) {
        super(continuation);
        this.Y = sxd;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.s((nwd) null, this);
    }
}
