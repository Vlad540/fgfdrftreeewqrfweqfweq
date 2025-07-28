package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ol6  reason: default package */
public final class ol6 implements Closeable {
    public static final Logger Z = Logger.getLogger(vk6.class.getName());
    public final zs0 X;
    public final boolean Y;
    public final wr0 a;
    public int b = 16384;
    public boolean c;
    public final nk6 o;

    /* JADX WARNING: type inference failed for: r1v1, types: [wr0, java.lang.Object] */
    public ol6(zs0 zs0, boolean z) {
        this.X = zs0;
        this.Y = z;
        ? obj = new Object();
        this.a = obj;
        this.o = new nk6(obj);
    }

    public final synchronized void S(int i, long j) {
        if (this.c) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        } else {
            g(i, 4, 8, 0);
            this.X.A((int) j);
            this.X.flush();
        }
    }

    public final void U(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.b, j);
            j -= min;
            g(i, (int) min, 9, j == 0 ? 4 : 0);
            this.X.N(this.a, min);
        }
    }

    public final synchronized void a(y5d y5d) {
        try {
            if (!this.c) {
                int i = this.b;
                int i2 = y5d.a;
                if ((i2 & 32) != 0) {
                    i = y5d.b[5];
                }
                this.b = i;
                int i3 = -1;
                if (((i2 & 2) != 0 ? y5d.b[1] : -1) != -1) {
                    nk6 nk6 = this.o;
                    if ((i2 & 2) != 0) {
                        i3 = y5d.b[1];
                    }
                    nk6.getClass();
                    int min = Math.min(i3, 16384);
                    int i4 = nk6.c;
                    if (i4 != min) {
                        if (min < i4) {
                            nk6.a = Math.min(nk6.a, min);
                        }
                        nk6.b = true;
                        nk6.c = min;
                        int i5 = nk6.g;
                        if (min < i5) {
                            if (min == 0) {
                                cs.W(nk6.d, (Object) null);
                                nk6.e = nk6.d.length - 1;
                                nk6.f = 0;
                                nk6.g = 0;
                            } else {
                                nk6.a(i5 - min);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.X.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void close() {
        this.c = true;
        this.X.close();
    }

    public final synchronized void d(boolean z, int i, wr0 wr0, int i2) {
        if (!this.c) {
            g(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.X.N(wr0, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.c) {
            this.X.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = Z;
        if (logger.isLoggable(level)) {
            logger.fine(vk6.a(false, i, i2, i3, i4));
        }
        if (i2 > this.b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.b + ": " + i2).toString());
        } else if ((((int) 2147483648L) & i) == 0) {
            byte[] bArr = nze.a;
            zs0 zs0 = this.X;
            zs0.C((i2 >>> 16) & 255);
            zs0.C((i2 >>> 8) & 255);
            zs0.C(i2 & 255);
            zs0.C(i3 & 255);
            zs0.C(i4 & 255);
            zs0.A(i & Integer.MAX_VALUE);
        } else {
            throw new IllegalArgumentException(wn6.h(i, "reserved bit set: ").toString());
        }
    }

    public final synchronized void m(int i, byte[] bArr, int i2) {
        try {
            if (this.c) {
                throw new IOException("closed");
            } else if (hr1.t(i2) != -1) {
                boolean z = false;
                g(0, bArr.length + 8, 7, 0);
                this.X.A(i);
                this.X.A(hr1.t(i2));
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.X.write(bArr);
                }
                this.X.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(int i, int i2, boolean z) {
        if (!this.c) {
            g(0, 8, 6, z ? 1 : 0);
            this.X.A(i);
            this.X.A(i2);
            this.X.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void o(int i, int i2) {
        if (this.c) {
            throw new IOException("closed");
        } else if (hr1.t(i2) != -1) {
            g(i, 4, 3, 0);
            this.X.A(hr1.t(i2));
            this.X.flush();
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
