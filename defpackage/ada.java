package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: ada  reason: default package */
public final class ada extends er3 {
    public IOException X;
    public vca Y;
    public File Z;
    public dda o;
    public Iterator w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ dda y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ada(dda dda, Continuation continuation) {
        super(continuation);
        this.y0 = dda;
    }

    public final Object o(Object obj) {
        this.x0 = obj;
        this.z0 |= Integer.MIN_VALUE;
        return this.y0.h((IOException) null, (lac) null, (vca) null, (File) null, this);
    }
}
