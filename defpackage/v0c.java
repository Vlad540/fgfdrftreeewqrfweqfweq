package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: v0c  reason: default package */
public final class v0c implements at0 {
    public final wr0 a = new Object();
    public boolean b;
    public final tld c;

    /* JADX WARNING: type inference failed for: r1v1, types: [wr0, java.lang.Object] */
    public v0c(tld tld) {
        this.c = tld;
    }

    public final boolean B() {
        if (!this.b) {
            wr0 wr0 = this.a;
            if (wr0.B()) {
                if (this.c.c(wr0, (long) 8192) == -1) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [wr0, java.lang.Object] */
    public final String G(long j) {
        long j2 = j;
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            byte b2 = (byte) 10;
            long a2 = a(b2, 0, j3);
            int i = (a2 > -1 ? 1 : (a2 == -1 ? 0 : -1));
            wr0 wr0 = this.a;
            if (i != 0) {
                return es0.a(wr0, a2);
            }
            if (j3 < Long.MAX_VALUE && n(j3) && wr0.S(j3 - 1) == ((byte) 13) && n(1 + j3) && wr0.S(j3) == b2) {
                return es0.a(wr0, j3);
            }
            ? obj = new Object();
            wr0.o(obj, 0, Math.min((long) 32, wr0.b));
            throw new EOFException("\\n not found: limit=" + Math.min(wr0.b, j2) + " content=" + obj.e(obj.b).d() + "…");
        }
        throw new IllegalArgumentException(us8.i(j2, "limit < 0: ").toString());
    }

    public final long K(yw ywVar) {
        wr0 wr0;
        long j = 0;
        while (true) {
            tld tld = this.c;
            wr0 = this.a;
            if (tld.c(wr0, (long) 8192) == -1) {
                break;
            }
            long n = wr0.n();
            if (n > 0) {
                j += n;
                ywVar.N(wr0, n);
            }
        }
        long j2 = wr0.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        ywVar.N(wr0, j2);
        return j3;
    }

    public final String O(Charset charset) {
        wr0 wr0 = this.a;
        wr0.t0(this.c);
        return wr0.o0(wr0.b, charset);
    }

    public final void Q(wr0 wr0, long j) {
        wr0 wr02 = this.a;
        try {
            h0(j);
            wr02.Q(wr0, j);
        } catch (EOFException e) {
            wr0.t0(wr02);
            throw e;
        }
    }

    public final void R(long j) {
        if (!this.b) {
            while (j > 0) {
                wr0 wr0 = this.a;
                if (wr0.b == 0) {
                    if (this.c.c(wr0, (long) 8192) == -1) {
                        throw new EOFException();
                    }
                }
                long min = Math.min(j, wr0.b);
                wr0.R(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String X() {
        return G(Long.MAX_VALUE);
    }

    public final long a(byte b2, long j, long j2) {
        if (!this.b) {
            long j3 = 0;
            if (j2 >= 0) {
                while (j3 < j2) {
                    long U = this.a.U(b2, j3, j2);
                    if (U != -1) {
                        return U;
                    }
                    wr0 wr0 = this.a;
                    long j4 = wr0.b;
                    if (j4 >= j2) {
                        return -1;
                    }
                    if (this.c.c(wr0, (long) 8192) == -1) {
                        return -1;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1;
            }
            throw new IllegalArgumentException(us8.i(j2, "fromIndex=0 toIndex=").toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long c(wr0 wr0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(us8.i(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            wr0 wr02 = this.a;
            if (wr02.b == 0) {
                if (this.c.c(wr02, (long) 8192) == -1) {
                    return -1;
                }
            }
            return wr02.c(wr0, Math.min(j, wr02.b));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        if (!this.b) {
            this.b = true;
            this.c.close();
            this.a.m();
        }
    }

    public final int d0(gga gga) {
        if (!this.b) {
            while (true) {
                wr0 wr0 = this.a;
                int b2 = es0.b(wr0, gga, true);
                if (b2 == -2) {
                    if (this.c.c(wr0, (long) 8192) == -1) {
                        break;
                    }
                } else if (b2 != -1) {
                    wr0.R((long) gga.a[b2].c());
                    return b2;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final uu0 e(long j) {
        h0(j);
        return this.a.e(j);
    }

    public final wr0 getBuffer() {
        return this.a;
    }

    public final void h0(long j) {
        if (!n(j)) {
            throw new EOFException();
        }
    }

    public final boolean isOpen() {
        return !this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long j0() {
        /*
            r6 = this;
            r0 = 1
            r6.h0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.n(r2)
            wr0 r3 = r6.a
            if (r2 == 0) goto L_0x0052
            long r4 = (long) r0
            byte r2 = r3.S(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0020
            r4 = 57
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x0020:
            r4 = 97
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x002a
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x002a:
            r4 = 65
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0037
            r4 = 70
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0052
        L_0x003a:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.iu7.f(r0)
            defpackage.iu7.f(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L_0x0052:
            long r0 = r3.j0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0c.j0():long");
    }

    public final InputStream l0() {
        return new pr0(this, 1);
    }

    public final int m() {
        h0(4);
        int readInt = this.a.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean n(long j) {
        wr0 wr0;
        if (j < 0) {
            throw new IllegalArgumentException(us8.i(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            do {
                wr0 = this.a;
                if (wr0.b >= j) {
                    return true;
                }
            } while (this.c.c(wr0, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final xje p() {
        return this.c.p();
    }

    public final int read(ByteBuffer byteBuffer) {
        wr0 wr0 = this.a;
        if (wr0.b == 0) {
            if (this.c.c(wr0, (long) 8192) == -1) {
                return -1;
            }
        }
        return wr0.read(byteBuffer);
    }

    public final byte readByte() {
        h0(1);
        return this.a.readByte();
    }

    public final void readFully(byte[] bArr) {
        wr0 wr0 = this.a;
        try {
            h0((long) bArr.length);
            wr0.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = wr0.b;
                if (j > 0) {
                    int e0 = wr0.e0(bArr, i, (int) j);
                    if (e0 != -1) {
                        i += e0;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public final int readInt() {
        h0(4);
        return this.a.readInt();
    }

    public final long readLong() {
        h0(8);
        return this.a.readLong();
    }

    public final short readShort() {
        h0(2);
        return this.a.readShort();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }
}
