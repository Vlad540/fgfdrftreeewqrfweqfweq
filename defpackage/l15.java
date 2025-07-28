package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: l15  reason: default package */
public final class l15 implements tld {
    public boolean X;
    public final long Y;
    public final /* synthetic */ pd Z;
    public final tld a;
    public long b;
    public boolean c = true;
    public boolean o;

    public l15(pd pdVar, tld tld, long j) {
        this.Z = pdVar;
        this.a = tld;
        this.Y = j;
        if (j == 0) {
            n((IOException) null);
        }
    }

    public final long c(wr0 wr0, long j) {
        if (!this.X) {
            try {
                long c2 = this.a.c(wr0, j);
                if (this.c) {
                    this.c = false;
                    ((j06) this.Z.o).getClass();
                }
                if (c2 == -1) {
                    n((IOException) null);
                    return -1;
                }
                long j2 = this.b + c2;
                long j3 = this.Y;
                if (j3 == -1 || j2 <= j3) {
                    this.b = j2;
                    if (j2 == j3) {
                        n((IOException) null);
                    }
                    return c2;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw n(e);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        if (!this.X) {
            this.X = true;
            try {
                m();
                n((IOException) null);
            } catch (IOException e) {
                throw n(e);
            }
        }
    }

    public final void m() {
        this.a.close();
    }

    public final IOException n(IOException iOException) {
        if (this.o) {
            return iOException;
        }
        this.o = true;
        pd pdVar = this.Z;
        if (iOException == null && this.c) {
            this.c = false;
            ((j06) pdVar.o).getClass();
        }
        return pdVar.a(true, false, iOException);
    }

    public final xje p() {
        return this.a.p();
    }

    public final String toString() {
        return l15.class.getSimpleName() + '(' + this.a + ')';
    }
}
