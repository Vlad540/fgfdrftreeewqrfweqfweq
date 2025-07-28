package defpackage;

import java.nio.ByteBuffer;

/* renamed from: u0c  reason: default package */
public final class u0c implements zs0 {
    public final wr0 a = new Object();
    public boolean b;
    public final fjd c;

    /* JADX WARNING: type inference failed for: r1v1, types: [wr0, java.lang.Object] */
    public u0c(fjd fjd) {
        this.c = fjd;
    }

    public final zs0 A(int i) {
        if (!this.b) {
            this.a.x0(i);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 C(int i) {
        if (!this.b) {
            this.a.u0(i);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 E() {
        if (!this.b) {
            wr0 wr0 = this.a;
            long n = wr0.n();
            if (n > 0) {
                this.c.N(wr0, n);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 L(String str) {
        if (!this.b) {
            this.a.A0(str);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 M(uu0 uu0) {
        if (!this.b) {
            this.a.s0(uu0);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void N(wr0 wr0, long j) {
        if (!this.b) {
            this.a.N(wr0, j);
            E();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 P(long j) {
        if (!this.b) {
            this.a.w0(j);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 b0(int i, byte[] bArr, int i2) {
        if (!this.b) {
            this.a.write(bArr, i, i2);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        fjd fjd = this.c;
        if (!this.b) {
            try {
                wr0 wr0 = this.a;
                long j = wr0.b;
                if (j > 0) {
                    fjd.N(wr0, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                fjd.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.b) {
            wr0 wr0 = this.a;
            long j = wr0.b;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            fjd fjd = this.c;
            if (i > 0) {
                fjd.N(wr0, j);
            }
            fjd.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wr0 getBuffer() {
        return this.a;
    }

    public final zs0 i0(long j) {
        if (!this.b) {
            this.a.v0(j);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.b;
    }

    public final xje p() {
        return this.c.p();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.b) {
            int write = this.a.write(byteBuffer);
            E();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 x() {
        if (!this.b) {
            wr0 wr0 = this.a;
            long j = wr0.b;
            if (j > 0) {
                this.c.N(wr0, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 y(int i) {
        if (!this.b) {
            this.a.y0(i);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final zs0 write(byte[] bArr) {
        if (!this.b) {
            wr0 wr0 = this.a;
            wr0.getClass();
            wr0.write(bArr, 0, bArr.length);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
