package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mdc  reason: default package */
public final class mdc extends er3 {
    public String X;
    public int Y;
    public /* synthetic */ Object Z;
    public udc o;
    public final /* synthetic */ udc w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mdc(udc udc, Continuation continuation) {
        super(continuation);
        this.w0 = udc;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return udc.g(this.w0, (String) null, 0, this);
    }
}
