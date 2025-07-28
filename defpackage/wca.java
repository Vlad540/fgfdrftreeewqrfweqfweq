package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: wca  reason: default package */
public final class wca extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dda Y;
    public int Z;
    public Iterator o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wca(dda dda, Continuation continuation) {
        super(continuation);
        this.Y = dda;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b((File) null, (String) null, this);
    }
}
