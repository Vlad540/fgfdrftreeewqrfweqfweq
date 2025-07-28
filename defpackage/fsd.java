package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: fsd  reason: default package */
public final class fsd implements qz3 {
    public final qz3 a;
    public long b;
    public Uri c = Uri.EMPTY;

    public fsd(qz3 qz3) {
        qz3.getClass();
        this.a = qz3;
        Collections.emptyMap();
    }

    public final long G(yz3 yz3) {
        this.c = yz3.a;
        Collections.emptyMap();
        qz3 qz3 = this.a;
        long G = qz3.G(yz3);
        Uri uri = qz3.getUri();
        uri.getClass();
        this.c = uri;
        qz3.a();
        return G;
    }

    public final void H(cqe cqe) {
        cqe.getClass();
        this.a.H(cqe);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        this.a.close();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }
}
