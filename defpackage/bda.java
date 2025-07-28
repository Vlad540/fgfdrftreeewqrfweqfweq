package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: bda  reason: default package */
public final class bda extends er3 {
    public File A0;
    public Closeable B0;
    public InputStream C0;
    public Closeable D0;
    public OutputStream E0;
    public byte[] F0;
    public Iterator G0;
    public boolean H0;
    public long I0;
    public int J0;
    public /* synthetic */ Object K0;
    public final /* synthetic */ dda L0;
    public int M0;
    public xbc X;
    public vca Y;
    public File Z;
    public dda o;
    public Serializable w0;
    public Object x0;
    public k7c y0;
    public k7c z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bda(dda dda, Continuation continuation) {
        super(continuation);
        this.L0 = dda;
    }

    public final Object o(Object obj) {
        this.K0 = obj;
        this.M0 |= Integer.MIN_VALUE;
        return this.L0.i((xbc) null, (vca) null, (File) null, (File) null, false, this);
    }
}
