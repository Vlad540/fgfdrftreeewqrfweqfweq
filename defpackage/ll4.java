package defpackage;

import java.io.IOException;

/* renamed from: ll4  reason: default package */
public final class ll4 extends Thread implements sl4 {
    public final int X;
    public volatile jl4 Y;
    public volatile boolean Z;
    public final pl4 a;
    public final tl4 b;
    public final ol4 c;
    public final boolean o;
    public Exception w0;
    public long x0 = -1;

    public ll4(pl4 pl4, tl4 tl4, ol4 ol4, boolean z, int i, jl4 jl4) {
        this.a = pl4;
        this.b = tl4;
        this.c = ol4;
        this.o = z;
        this.X = i;
        this.Y = jl4;
    }

    public final void a(boolean z) {
        if (z) {
            this.Y = null;
        }
        if (!this.Z) {
            this.Z = true;
            this.b.cancel();
            interrupt();
        }
    }

    public final void b(float f, long j, long j2) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.x0) {
            this.x0 = j;
            jl4 jl4 = this.Y;
            if (jl4 != null) {
                jl4.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    public final void run() {
        long j;
        int i;
        try {
            if (this.o) {
                this.b.remove();
            } else {
                j = -1;
                i = 0;
                while (!this.Z) {
                    this.b.a(this);
                }
            }
        } catch (IOException e) {
            if (!this.Z) {
                long j2 = this.c.a;
                if (j2 != j) {
                    i = 0;
                    j = j2;
                }
                int i2 = i + 1;
                if (i2 <= this.X) {
                    Thread.sleep((long) Math.min(i * 1000, 5000));
                    i = i2;
                } else {
                    throw e;
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.w0 = e2;
        }
        jl4 jl4 = this.Y;
        if (jl4 != null) {
            jl4.obtainMessage(10, this).sendToTarget();
        }
    }
}
