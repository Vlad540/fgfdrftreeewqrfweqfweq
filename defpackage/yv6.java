package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: yv6  reason: default package */
public final class yv6 implements tld {
    public int a;
    public boolean b;
    public final at0 c;
    public final Inflater o;

    public yv6(v0c v0c, Inflater inflater) {
        this.c = v0c;
        this.o = inflater;
    }

    public final long a(wr0 wr0, long j) {
        Inflater inflater = this.o;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(us8.i(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                kuc r0 = wr0.r0(1);
                int min = (int) Math.min(j, (long) (8192 - r0.c));
                boolean needsInput = inflater.needsInput();
                at0 at0 = this.c;
                if (needsInput) {
                    if (!at0.B()) {
                        kuc kuc = at0.getBuffer().a;
                        int i2 = kuc.c;
                        int i3 = kuc.b;
                        int i4 = i2 - i3;
                        this.a = i4;
                        inflater.setInput(kuc.a, i3, i4);
                    }
                }
                int inflate = inflater.inflate(r0.a, r0.c, min);
                int i5 = this.a;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.a -= remaining;
                    at0.R((long) remaining);
                }
                if (inflate > 0) {
                    r0.c += inflate;
                    long j2 = (long) inflate;
                    wr0.b += j2;
                    return j2;
                }
                if (r0.b == r0.c) {
                    wr0.a = r0.a();
                    bvc.a(r0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    public final long c(wr0 wr0, long j) {
        do {
            long a2 = a(wr0, j);
            if (a2 > 0) {
                return a2;
            }
            Inflater inflater = this.o;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1;
            }
        } while (!this.c.B());
        throw new EOFException("source exhausted prematurely");
    }

    public final void close() {
        if (!this.b) {
            this.o.end();
            this.b = true;
            this.c.close();
        }
    }

    public final xje p() {
        return this.c.p();
    }
}
