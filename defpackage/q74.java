package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: q74  reason: default package */
public final class q74 implements f75 {
    public byte[] X = new byte[65536];
    public int Y;
    public int Z;
    public final byte[] a = new byte[4096];
    public final iz3 b;
    public final long c;
    public long o;

    static {
        a55.a("goog.exo.extractor");
    }

    public q74(iz3 iz3, long j, long j2) {
        this.b = iz3;
        this.o = j;
        this.c = j2;
    }

    public final boolean b(int i, boolean z) {
        c(i);
        int i2 = this.Z - this.Y;
        while (i2 < i) {
            i2 = e(this.X, this.Y, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.Z = this.Y + i2;
        }
        this.Y += i;
        return true;
    }

    public final void c(int i) {
        int i2 = this.Y + i;
        byte[] bArr = this.X;
        if (i2 > bArr.length) {
            this.X = Arrays.copyOf(this.X, mze.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int d(int i, byte[] bArr, int i2) {
        int i3;
        c(i2);
        int i4 = this.Z;
        int i5 = this.Y;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = e(this.X, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.Z += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.X, this.Y, bArr, i, i3);
        this.Y += i3;
        return i3;
    }

    public final int e(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final int f() {
        int min = Math.min(this.Z, 1);
        h(min);
        if (min == 0) {
            byte[] bArr = this.a;
            min = e(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        if (min != -1) {
            this.o += (long) min;
        }
        return min;
    }

    public final long g() {
        return this.o;
    }

    public final void h(int i) {
        int i2 = this.Z - i;
        this.Z = i2;
        this.Y = 0;
        byte[] bArr = this.X;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.X = bArr2;
    }

    public final boolean i(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.Z;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.X, 0, bArr, i, i3);
            h(i3);
        }
        int i5 = i3;
        while (i5 < i2 && i5 != -1) {
            i5 = e(bArr, i, i2, i5, z);
        }
        if (i5 != -1) {
            this.o += (long) i5;
        }
        return i5 != -1;
    }

    public final void m(int i, byte[] bArr, int i2) {
        r(bArr, i, i2, false);
    }

    public final boolean r(byte[] bArr, int i, int i2, boolean z) {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.X, this.Y - i2, bArr, i, i2);
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.Z;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.X, 0, bArr, i, min);
            h(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = e(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.o += (long) i4;
        }
        return i4;
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        i(bArr, i, i2, false);
    }

    public final long s() {
        return this.o + ((long) this.Y);
    }

    public final void t(int i) {
        b(i, false);
    }

    public final long x() {
        return this.c;
    }

    public final void y() {
        this.Y = 0;
    }

    public final void z(int i) {
        int min = Math.min(this.Z, i);
        h(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = e(this.a, -i2, Math.min(i, this.a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.o += (long) i2;
        }
    }
}
