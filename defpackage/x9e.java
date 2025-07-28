package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: x9e  reason: default package */
public final class x9e extends FilterInputStream {
    public final byte[] a;
    public int b;
    public int c;

    public x9e(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.a = bArr;
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.c = this.b;
        }
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        int i = this.b;
        byte[] bArr = this.a;
        if (i >= bArr.length) {
            return -1;
        }
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.b = this.c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        byte b2;
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int i4 = this.b;
            byte[] bArr2 = this.a;
            if (i4 >= bArr2.length) {
                b2 = -1;
            } else {
                this.b = i4 + 1;
                b2 = bArr2[i4] & 255;
            }
            if (b2 == -1) {
                break;
            }
            bArr[i + i3] = (byte) b2;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
