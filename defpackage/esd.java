package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: esd  reason: default package */
public final class esd implements oz3 {
    public final oz3 a;
    public long b;
    public Uri c = Uri.EMPTY;
    public Map o = Collections.emptyMap();

    public esd(oz3 oz3) {
        oz3.getClass();
        this.a = oz3;
    }

    public final long N(xz3 xz3) {
        this.c = xz3.a;
        this.o = Collections.emptyMap();
        oz3 oz3 = this.a;
        long N = oz3.N(xz3);
        Uri uri = oz3.getUri();
        uri.getClass();
        this.c = uri;
        this.o = oz3.a();
        return N;
    }

    public final void O(bqe bqe) {
        bqe.getClass();
        this.a.O(bqe);
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
