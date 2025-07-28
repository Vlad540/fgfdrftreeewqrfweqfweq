package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: b1c  reason: default package */
public final class b1c implements Closeable {
    public final at0 a;
    public final zs0 b;
    public final /* synthetic */ pd c;

    public b1c(pd pdVar, v0c v0c, u0c u0c) {
        this.c = pdVar;
        this.a = v0c;
        this.b = u0c;
    }

    public final void close() {
        this.c.a(true, true, (IOException) null);
    }
}
