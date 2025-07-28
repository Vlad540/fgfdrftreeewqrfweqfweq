package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: tk6  reason: default package */
public final class tk6 extends qk6 {
    public final /* synthetic */ b9 X;
    public long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk6(b9 b9Var, long j) {
        super(b9Var);
        this.X = b9Var;
        this.o = j;
        if (j == 0) {
            m();
        }
    }

    public final long c(wr0 wr0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(us8.i(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            long j2 = this.o;
            if (j2 == 0) {
                return -1;
            }
            long c = super.c(wr0, Math.min(j2, j));
            if (c != -1) {
                long j3 = this.o - c;
                this.o = j3;
                if (j3 == 0) {
                    m();
                }
                return c;
            }
            ((c1c) this.X.X).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        boolean z;
        if (!this.b) {
            if (this.o != 0) {
                try {
                    z = nze.t(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    ((c1c) this.X.X).k();
                    m();
                }
            }
            this.b = true;
        }
    }
}
