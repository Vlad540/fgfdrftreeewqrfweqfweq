package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: ll6  reason: default package */
public final class ll6 implements tld {
    public boolean X;
    public final /* synthetic */ nl6 Y;
    public final wr0 a = new Object();
    public final wr0 b = new Object();
    public boolean c;
    public final long o;

    /* JADX WARNING: type inference failed for: r1v1, types: [wr0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [wr0, java.lang.Object] */
    public ll6(nl6 nl6, long j, boolean z) {
        this.Y = nl6;
        this.o = j;
        this.X = z;
    }

    public final void a(long j) {
        byte[] bArr = nze.a;
        this.Y.n.o(j);
    }

    public final long c(wr0 wr0, long j) {
        Throwable th;
        boolean z;
        long j2;
        long j3 = j;
        long j4 = 0;
        if (j3 >= 0) {
            while (true) {
                synchronized (this.Y) {
                    this.Y.i.i();
                    try {
                        if (this.Y.f() != 0) {
                            th = this.Y.l;
                            if (th == null) {
                                th = new StreamResetException(this.Y.f());
                            }
                        } else {
                            th = null;
                        }
                        if (!this.c) {
                            wr0 wr02 = this.b;
                            long j5 = wr02.b;
                            z = false;
                            if (j5 > j4) {
                                j2 = wr02.c(wr0, Math.min(j3, j5));
                                nl6 nl6 = this.Y;
                                long j6 = nl6.a + j2;
                                nl6.a = j6;
                                long j7 = j6 - nl6.b;
                                if (th == null && j7 >= ((long) (nl6.n.G0.a() / 2))) {
                                    nl6 nl62 = this.Y;
                                    nl62.n.e0(nl62.m, j7);
                                    nl6 nl63 = this.Y;
                                    nl63.b = nl63.a;
                                }
                            } else {
                                wr0 wr03 = wr0;
                                if (!this.X && th == null) {
                                    this.Y.k();
                                    z = true;
                                }
                                j2 = -1;
                            }
                        } else {
                            throw new IOException("stream closed");
                        }
                    } finally {
                        this.Y.i.m();
                    }
                }
                if (z) {
                    j4 = 0;
                } else if (j2 != -1) {
                    a(j2);
                    return j2;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            }
        } else {
            throw new IllegalArgumentException(us8.i(j3, "byteCount < 0: ").toString());
        }
    }

    public final void close() {
        long j;
        synchronized (this.Y) {
            this.c = true;
            wr0 wr0 = this.b;
            j = wr0.b;
            wr0.m();
            nl6 nl6 = this.Y;
            if (nl6 != null) {
                nl6.notifyAll();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
        if (j > 0) {
            a(j);
        }
        this.Y.a();
    }

    public final xje p() {
        return this.Y.i;
    }
}
