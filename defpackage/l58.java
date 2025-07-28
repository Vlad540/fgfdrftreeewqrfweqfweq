package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;

/* renamed from: l58  reason: default package */
public final class l58 implements qz3 {
    public final qz3 a;
    public r74 b;

    public l58(Context context, Uri uri) {
        this.a = new h64(context);
        G(new yz3(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 0, (Object) null));
    }

    public final long G(yz3 yz3) {
        long G = this.a.G(yz3);
        this.b = new r74(this, yz3.f, G != -1 ? yz3.f + G : G);
        return G;
    }

    public final void H(cqe cqe) {
        this.a.H(cqe);
    }

    public final void close() {
        this.b = null;
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
