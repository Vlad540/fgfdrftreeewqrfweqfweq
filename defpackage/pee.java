package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: pee  reason: default package */
public final class pee implements oz3 {
    public final oz3 a;
    public final ev0 b;
    public boolean c;
    public long o;

    public pee(oz3 oz3, ev0 ev0) {
        oz3.getClass();
        this.a = oz3;
        ev0.getClass();
        this.b = ev0;
    }

    public final long N(xz3 xz3) {
        long N = this.a.N(xz3);
        this.o = N;
        if (N == 0) {
            return 0;
        }
        if (xz3.g == -1 && N != -1) {
            xz3 = xz3.c(0, N);
        }
        this.c = true;
        ev0 ev0 = this.b;
        ev0.getClass();
        xz3.h.getClass();
        int i = (xz3.g > -1 ? 1 : (xz3.g == -1 ? 0 : -1));
        int i2 = xz3.i;
        if (i == 0 && (i2 & 2) == 2) {
            ev0.j = null;
        } else {
            ev0.j = xz3;
            ev0.d = (i2 & 4) == 4 ? ev0.b : Long.MAX_VALUE;
            ev0.h = 0;
            try {
                ev0.b(xz3);
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
        return this.o;
    }

    public final void O(bqe bqe) {
        bqe.getClass();
        this.a.O(bqe);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        boolean z;
        xz3 xz3;
        ev0 ev0 = this.b;
        try {
            this.a.close();
            if (!z) {
                return;
            }
            if (xz3 != null) {
                try {
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        } finally {
            if (this.c) {
                this.c = false;
                if (((xz3) ev0.j) != null) {
                    try {
                        ev0.a();
                    } catch (IOException e2) {
                        throw new IOException(e2);
                    }
                }
            }
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.o == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            ev0 ev0 = this.b;
            xz3 xz3 = (xz3) ev0.j;
            if (xz3 != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (ev0.g == ev0.d) {
                            ev0.a();
                            ev0.b(xz3);
                        }
                        int min = (int) Math.min((long) (read - i3), ev0.d - ev0.g);
                        OutputStream outputStream = ev0.f;
                        int i4 = mze.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = (long) min;
                        ev0.g += j;
                        ev0.h += j;
                    } catch (IOException e) {
                        throw new IOException(e);
                    }
                }
            }
            long j2 = this.o;
            if (j2 != -1) {
                this.o = j2 - ((long) read);
            }
        }
        return read;
    }
}
