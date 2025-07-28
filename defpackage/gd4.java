package defpackage;

import java.util.zip.Deflater;

/* renamed from: gd4  reason: default package */
public final class gd4 implements fjd {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public final Object o;

    public gd4(wr0 wr0, Deflater deflater) {
        this.c = new u0c(wr0);
        this.o = deflater;
    }

    public final void N(wr0 wr0, long j) {
        Object obj = this.o;
        switch (this.a) {
            case 0:
                oyb.i(wr0.b, 0, j);
                while (j > 0) {
                    kuc kuc = wr0.a;
                    int min = (int) Math.min(j, (long) (kuc.c - kuc.b));
                    ((Deflater) obj).setInput(kuc.a, kuc.b, min);
                    a(false);
                    long j2 = (long) min;
                    wr0.b -= j2;
                    int i = kuc.b + min;
                    kuc.b = i;
                    if (i == kuc.c) {
                        wr0.a = kuc.a();
                        bvc.a(kuc);
                    }
                    j -= j2;
                }
                return;
            default:
                if (!this.b) {
                    long j3 = wr0.b;
                    byte[] bArr = nze.a;
                    if (j < 0 || 0 > j3 || j3 < j) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    ((zs0) ((b9) obj).Z).N(wr0, j);
                    return;
                }
                throw new IllegalStateException("closed".toString());
        }
    }

    public void a(boolean z) {
        kuc r0;
        int i;
        zs0 zs0 = (zs0) this.c;
        wr0 buffer = zs0.getBuffer();
        while (true) {
            r0 = buffer.r0(1);
            Deflater deflater = (Deflater) this.o;
            byte[] bArr = r0.a;
            if (z) {
                int i2 = r0.c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                int i3 = r0.c;
                i = deflater.deflate(bArr, i3, 8192 - i3);
            }
            if (i > 0) {
                r0.c += i;
                buffer.b += (long) i;
                zs0.E();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (r0.b == r0.c) {
            buffer.a = r0.a();
            bvc.a(r0);
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                Deflater deflater = (Deflater) this.o;
                if (!this.b) {
                    try {
                        deflater.finish();
                        a(false);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ((zs0) this.c).close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.b = true;
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    b9 b9Var = (b9) this.o;
                    b9Var.getClass();
                    bx5 bx5 = (bx5) this.c;
                    xje xje = bx5.e;
                    bx5.e = xje.d;
                    xje.a();
                    xje.b();
                    b9Var.b = 3;
                    return;
                }
                return;
        }
    }

    public final void flush() {
        switch (this.a) {
            case 0:
                a(true);
                ((zs0) this.c).flush();
                return;
            default:
                if (!this.b) {
                    ((zs0) ((b9) this.o).Z).flush();
                    return;
                }
                return;
        }
    }

    public final xje p() {
        switch (this.a) {
            case 0:
                return ((zs0) this.c).p();
            default:
                return (bx5) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((zs0) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public gd4(b9 b9Var) {
        this.o = b9Var;
        this.c = new bx5(((zs0) b9Var.Z).p());
    }
}
