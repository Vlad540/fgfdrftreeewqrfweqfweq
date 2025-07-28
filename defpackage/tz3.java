package defpackage;

import java.io.InputStream;

/* renamed from: tz3  reason: default package */
public final class tz3 extends InputStream {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a = 0;
    public final byte[] b;
    public boolean c = false;
    public boolean o = false;

    public tz3(oz3 oz3, xz3 xz3) {
        this.X = oz3;
        this.Y = xz3;
        this.b = new byte[1];
    }

    public final void close() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    ((oz3) this.X).close();
                    this.o = true;
                    return;
                }
                return;
            default:
                if (!this.o) {
                    ((qz3) this.X).close();
                    this.o = true;
                    return;
                }
                return;
        }
    }

    public final void m() {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    ((oz3) this.X).N((xz3) this.Y);
                    this.c = true;
                    return;
                }
                return;
            default:
                if (!this.c) {
                    ((qz3) this.X).G((yz3) this.Y);
                    this.c = true;
                    return;
                }
                return;
        }
    }

    public final int read() {
        switch (this.a) {
            case 0:
                byte[] bArr = this.b;
                if (read(bArr, 0, bArr.length) == -1) {
                    return -1;
                }
                return bArr[0] & 255;
            default:
                byte[] bArr2 = this.b;
                if (read(bArr2, 0, bArr2.length) == -1) {
                    return -1;
                }
                return bArr2[0] & 255;
        }
    }

    public final int read(byte[] bArr) {
        switch (this.a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return read(bArr, 0, bArr.length);
        }
    }

    public tz3(qz3 qz3, yz3 yz3) {
        this.X = qz3;
        this.Y = yz3;
        this.b = new byte[1];
    }

    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                swb.h(!this.o);
                m();
                int read = ((oz3) this.X).read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                return read;
            default:
                oyb.k(!this.o);
                m();
                int read2 = ((qz3) this.X).read(bArr, i, i2);
                if (read2 == -1) {
                    return -1;
                }
                return read2;
        }
    }
}
