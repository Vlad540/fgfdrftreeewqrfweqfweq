package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: pr0  reason: default package */
public final class pr0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ at0 b;

    public /* synthetic */ pr0(at0 at0, int i) {
        this.a = i;
        this.b = at0;
    }

    private final void m() {
    }

    public final int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((wr0) this.b).b, (long) Integer.MAX_VALUE);
            default:
                v0c v0c = (v0c) this.b;
                if (!v0c.b) {
                    return (int) Math.min(v0c.a.b, (long) Integer.MAX_VALUE);
                }
                throw new IOException("closed");
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((v0c) this.b).close();
                return;
        }
    }

    public final int read() {
        switch (this.a) {
            case 0:
                wr0 wr0 = (wr0) this.b;
                if (wr0.b > 0) {
                    return wr0.readByte() & 255;
                }
                return -1;
            default:
                v0c v0c = (v0c) this.b;
                if (!v0c.b) {
                    wr0 wr02 = v0c.a;
                    if (wr02.b == 0) {
                        if (v0c.c.c(wr02, (long) 8192) == -1) {
                            return -1;
                        }
                    }
                    return wr02.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((wr0) this.b) + ".inputStream()";
            default:
                return ((v0c) this.b) + ".inputStream()";
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                return ((wr0) this.b).e0(bArr, i, i2);
            default:
                v0c v0c = (v0c) this.b;
                if (!v0c.b) {
                    oyb.i((long) bArr.length, (long) i, (long) i2);
                    wr0 wr0 = v0c.a;
                    if (wr0.b == 0) {
                        if (v0c.c.c(wr0, (long) 8192) == -1) {
                            return -1;
                        }
                    }
                    return wr0.e0(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
