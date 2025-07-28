package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: up4  reason: default package */
public final class up4 implements oz3 {
    public static final up4 a = new Object();

    public final long N(xz3 xz3) {
        throw new IOException("DummyDataSource cannot be opened");
    }

    public final void O(bqe bqe) {
    }

    public final void close() {
    }

    public final Uri getUri() {
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
