package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: j0b  reason: default package */
public final class j0b extends InputStream {
    public int X = 0;
    public boolean Y = false;
    public final InputStream a;
    public final byte[] b;
    public final nbc c;
    public int o = 0;

    public j0b(InputStream inputStream, byte[] bArr, nbc nbc) {
        this.a = inputStream;
        bArr.getClass();
        this.b = bArr;
        nbc.getClass();
        this.c = nbc;
    }

    public final int available() {
        ez3.o(this.X <= this.o);
        m();
        return this.a.available() + (this.o - this.X);
    }

    public final void close() {
        if (!this.Y) {
            this.Y = true;
            this.c.g(this.b);
            super.close();
        }
    }

    public final void finalize() {
        if (!this.Y) {
            if (m75.a.i(6)) {
                m75.a.e("PooledByteInputStream", "Finalized without closing");
            }
            close();
        }
        super.finalize();
    }

    public final void m() {
        if (this.Y) {
            throw new IOException("stream already closed");
        }
    }

    public final int read() {
        ez3.o(this.X <= this.o);
        m();
        int i = this.X;
        int i2 = this.o;
        byte[] bArr = this.b;
        if (i >= i2) {
            int read = this.a.read(bArr);
            if (read <= 0) {
                return -1;
            }
            this.o = read;
            this.X = 0;
        }
        int i3 = this.X;
        this.X = i3 + 1;
        return bArr[i3] & 255;
    }

    public final long skip(long j) {
        ez3.o(this.X <= this.o);
        m();
        int i = this.o;
        int i2 = this.X;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.X = (int) (((long) i2) + j);
            return j;
        }
        this.X = i;
        return this.a.skip(j - j2) + j2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        ez3.o(this.X <= this.o);
        m();
        int i3 = this.X;
        int i4 = this.o;
        byte[] bArr2 = this.b;
        if (i3 >= i4) {
            int read = this.a.read(bArr2);
            if (read <= 0) {
                return -1;
            }
            this.o = read;
            this.X = 0;
        }
        int min = Math.min(this.o - this.X, i2);
        System.arraycopy(bArr2, this.X, bArr, i, min);
        this.X += min;
        return min;
    }
}
