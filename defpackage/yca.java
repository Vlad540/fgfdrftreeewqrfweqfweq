package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* renamed from: yca  reason: default package */
public final class yca extends er3 {
    public byte[] A0;
    public long B0;
    public /* synthetic */ Object C0;
    public final /* synthetic */ dda D0;
    public int E0;
    public File X;
    public File Y;
    public File Z;
    public dda o;
    public Closeable w0;
    public InputStream x0;
    public Closeable y0;
    public OutputStream z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yca(dda dda, Continuation continuation) {
        super(continuation);
        this.D0 = dda;
    }

    public final Object o(Object obj) {
        this.C0 = obj;
        this.E0 |= Integer.MIN_VALUE;
        return this.D0.d((File) null, (File) null, (String) null, this);
    }
}
