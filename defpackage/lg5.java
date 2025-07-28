package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* renamed from: lg5  reason: default package */
public final class lg5 extends er3 {
    public int A0;
    public InputStream X;
    public Closeable Y;
    public OutputStream Z;
    public Closeable o;
    public byte[] w0;
    public long x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ zl3 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lg5(zl3 zl3, Continuation continuation) {
        super(continuation);
        this.z0 = zl3;
    }

    public final Object o(Object obj) {
        this.y0 = obj;
        this.A0 |= Integer.MIN_VALUE;
        return this.z0.h((File) null, (InputStream) null, this);
    }
}
