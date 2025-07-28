package defpackage;

/* renamed from: uk6  reason: default package */
public final class uk6 extends qk6 {
    public boolean o;

    public final long c(wr0 wr0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(us8.i(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.o) {
            return -1;
        } else {
            long c = super.c(wr0, j);
            if (c != -1) {
                return c;
            }
            this.o = true;
            m();
            return -1;
        }
    }

    public final void close() {
        if (!this.b) {
            if (!this.o) {
                m();
            }
            this.b = true;
        }
    }
}
