package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: il6  reason: default package */
public final class il6 implements tld {
    public int X;
    public final at0 Y;
    public int a;
    public int b;
    public int c;
    public int o;

    public il6(at0 at0) {
        this.Y = at0;
    }

    public final long c(wr0 wr0, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.o;
            at0 at0 = this.Y;
            if (i2 == 0) {
                at0.R((long) this.X);
                this.X = 0;
                if ((this.b & 4) != 0) {
                    return -1;
                }
                i = this.c;
                int s = nze.s(at0);
                this.o = s;
                this.a = s;
                byte readByte = at0.readByte() & 255;
                this.b = at0.readByte() & 255;
                Logger logger = jl6.X;
                if (logger.isLoggable(Level.FINE)) {
                    uu0 uu0 = vk6.a;
                    logger.fine(vk6.a(true, this.c, this.a, readByte, this.b));
                }
                readInt = at0.readInt() & Integer.MAX_VALUE;
                this.c = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long c2 = at0.c(wr0, Math.min(j, (long) i2));
                if (c2 == -1) {
                    return -1;
                }
                this.o -= (int) c2;
                return c2;
            }
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    public final void close() {
    }

    public final xje p() {
        return this.Y.p();
    }
}
