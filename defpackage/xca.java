package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: xca  reason: default package */
public final class xca extends er3 {
    public final /* synthetic */ dda A0;
    public int B0;
    public File X;
    public i5e Y;
    public File Z;
    public Object o;
    public Object w0;
    public vca x0;
    public boolean y0;
    public /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xca(dda dda, Continuation continuation) {
        super(continuation);
        this.A0 = dda;
    }

    public final Object o(Object obj) {
        this.z0 = obj;
        this.B0 |= Integer.MIN_VALUE;
        return this.A0.a((String) null, (File) null, (i5e) null, (String) null, false, this);
    }
}
