package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* renamed from: m58  reason: default package */
public final class m58 implements e75, Closeable {
    public final e75 a;
    public final l58 b;
    public final Uri c;

    public m58(e75 e75, l58 l58) {
        this.a = e75;
        this.b = l58;
        Uri uri = l58.a.getUri();
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void S(i75 i75) {
        this.a.S(i75);
    }

    public final void close() {
        release();
    }

    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    public final int g(g75 g75, le4 le4) {
        return this.a.g(g75, le4);
    }

    public final boolean n(g75 g75) {
        return this.a.n(g75);
    }

    public final void release() {
        this.a.release();
        this.b.close();
    }
}
