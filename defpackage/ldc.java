package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ldc  reason: default package */
public final class ldc extends er3 {
    public int A0;
    public Collection X;
    public Object Y;
    public s72 Z;
    public udc o;
    public Iterator w0;
    public int x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ udc z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ldc(udc udc, Continuation continuation) {
        super(continuation);
        this.z0 = udc;
    }

    public final Object o(Object obj) {
        this.y0 = obj;
        this.A0 |= Integer.MIN_VALUE;
        return udc.f(this.z0, (List) null, (Set) null, this);
    }
}
