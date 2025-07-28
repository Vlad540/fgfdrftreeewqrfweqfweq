package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: s82  reason: default package */
public final class s82 extends er3 {
    public Comparator X;
    public Collection Y;
    public Iterator Z;
    public b92 o;
    public /* synthetic */ Object w0;
    public final /* synthetic */ b92 x0;
    public int y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s82(b92 b92, Continuation continuation) {
        super(continuation);
        this.x0 = b92;
    }

    public final Object o(Object obj) {
        this.w0 = obj;
        this.y0 |= Integer.MIN_VALUE;
        return b92.b(this.x0, (ArrayList) null, false, this);
    }
}
