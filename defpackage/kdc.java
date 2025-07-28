package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kdc  reason: default package */
public final class kdc extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ udc Y;
    public int Z;
    public udc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kdc(udc udc, Continuation continuation) {
        super(continuation);
        this.Y = udc;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return udc.c(this.Y, this);
    }
}
