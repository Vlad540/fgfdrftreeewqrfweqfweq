package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: k15  reason: default package */
public final class k15 implements fjd {
    public final long X;
    public final /* synthetic */ pd Y;
    public final fjd a;
    public boolean b;
    public long c;
    public boolean o;

    public k15(pd pdVar, fjd fjd, long j) {
        this.Y = pdVar;
        this.a = fjd;
        this.X = j;
    }

    public final void N(wr0 wr0, long j) {
        if (!this.o) {
            long j2 = this.X;
            if (j2 == -1 || this.c + j <= j2) {
                try {
                    this.a.N(wr0, j);
                    this.c += j;
                } catch (IOException e) {
                    throw n(e);
                }
            } else {
                StringBuilder k = hr1.k(j2, "expected ", " bytes but received ");
                k.append(this.c + j);
                throw new ProtocolException(k.toString());
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        if (!this.o) {
            this.o = true;
            long j = this.X;
            if (j == -1 || this.c == j) {
                try {
                    m();
                    n((IOException) null);
                } catch (IOException e) {
                    throw n(e);
                }
            } else {
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    public final void flush() {
        try {
            o();
        } catch (IOException e) {
            throw n(e);
        }
    }

    public final void m() {
        this.a.close();
    }

    public final IOException n(IOException iOException) {
        if (this.b) {
            return iOException;
        }
        this.b = true;
        return this.Y.a(false, true, iOException);
    }

    public final void o() {
        this.a.flush();
    }

    public final xje p() {
        return this.a.p();
    }

    public final String toString() {
        return k15.class.getSimpleName() + '(' + this.a + ')';
    }
}
