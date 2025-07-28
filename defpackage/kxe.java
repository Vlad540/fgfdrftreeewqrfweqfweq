package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kxe  reason: default package */
public final class kxe extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ oxe Y;
    public int Z;
    public oxe o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kxe(oxe oxe, Continuation continuation) {
        super(continuation);
        this.Y = oxe;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.e((sm6) null, this);
    }
}
