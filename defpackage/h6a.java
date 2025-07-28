package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: h6a  reason: default package */
public final class h6a extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ i6a Y;
    public int Z;
    public Iterator o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h6a(i6a i6a, Continuation continuation) {
        super(continuation);
        this.Y = i6a;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.k(this);
    }
}
