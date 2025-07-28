package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: cda  reason: default package */
public final class cda extends er3 {
    public Iterator X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dda Z;
    public dda o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cda(dda dda, Continuation continuation) {
        super(continuation);
        this.Z = dda;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.k((vca) null, (File) null, this);
    }
}
