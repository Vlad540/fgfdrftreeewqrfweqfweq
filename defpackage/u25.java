package defpackage;

import java.io.InputStream;

/* renamed from: u25  reason: default package */
public final class u25 extends q25 {
    public u25(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }

    public final void d(long j) {
        int i = this.c;
        if (((long) i) > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public u25(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
