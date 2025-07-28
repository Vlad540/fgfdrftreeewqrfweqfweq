package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: sk6  reason: default package */
public final class sk6 extends qk6 {
    public boolean X = true;
    public final sm6 Y;
    public final /* synthetic */ b9 Z;
    public long o = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sk6(b9 b9Var, sm6 sm6) {
        super(b9Var);
        this.Z = b9Var;
        this.Y = sm6;
    }

    public final long c(wr0 wr0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(us8.i(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.X) {
            return -1;
        } else {
            long j2 = this.o;
            int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            b9 b9Var = this.Z;
            if (i == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((at0) b9Var.Y).X();
                }
                try {
                    this.o = ((at0) b9Var.Y).j0();
                    String obj = h0e.B0(((at0) b9Var.Y).X()).toString();
                    if (this.o < 0 || (obj.length() > 0 && !p0e.Q(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.o + obj + '\"');
                    }
                    if (this.o == 0) {
                        this.X = false;
                        im6.b(((qw9) b9Var.o).y0, this.Y, ((xw2) b9Var.c).Y());
                        m();
                    }
                    if (!this.X) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long c = super.c(wr0, Math.min(j, this.o));
            if (c != -1) {
                this.o -= c;
                return c;
            }
            ((c1c) b9Var.X).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
    }

    public final void close() {
        boolean z;
        if (!this.b) {
            if (this.X) {
                try {
                    z = nze.t(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    ((c1c) this.Z.X).k();
                    m();
                }
            }
            this.b = true;
        }
    }
}
