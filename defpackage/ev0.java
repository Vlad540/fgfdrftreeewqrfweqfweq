package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ev0  reason: default package */
public final class ev0 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final int c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public final Object i;
    public Object j;
    public BufferedOutputStream k;

    public ev0(bv0 bv0) {
        bv0.getClass();
        this.i = bv0;
        this.b = 5242880;
        this.c = 20480;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                OutputStream outputStream = this.f;
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        mze.h(this.f);
                        this.f = null;
                        File file = this.e;
                        this.e = null;
                        long j2 = this.g;
                        lgd lgd = (lgd) ((bv0) this.i);
                        synchronized (lgd) {
                            if (file.exists()) {
                                if (j2 == 0) {
                                    file.delete();
                                    return;
                                }
                                ogd b2 = ogd.b(file, j2, lgd.c);
                                b2.getClass();
                                cw0 d2 = lgd.c.d(b2.a);
                                d2.getClass();
                                swb.h(d2.b(b2.b, b2.c));
                                long a2 = yp3.a(d2.e);
                                if (a2 != -1) {
                                    swb.h(b2.b + b2.c <= a2);
                                }
                                lgd.getClass();
                                lgd.b(b2);
                                try {
                                    lgd.c.j();
                                    lgd.notifyAll();
                                    return;
                                } catch (IOException e2) {
                                    throw new IOException(e2);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        mze.h(this.f);
                        this.f = null;
                        File file2 = this.e;
                        this.e = null;
                        file2.delete();
                        throw th;
                    }
                } else {
                    return;
                }
            default:
                OutputStream outputStream2 = this.f;
                if (outputStream2 != null) {
                    try {
                        outputStream2.flush();
                        oze.h(this.f);
                        this.f = null;
                        File file3 = this.e;
                        this.e = null;
                        long j3 = this.g;
                        mgd mgd = (mgd) ((av0) this.i);
                        synchronized (mgd) {
                            if (file3.exists()) {
                                if (j3 == 0) {
                                    file3.delete();
                                    return;
                                }
                                pgd b3 = pgd.b(file3, j3, -9223372036854775807L, mgd.c);
                                b3.getClass();
                                dw0 f2 = mgd.c.f(b3.a);
                                f2.getClass();
                                oyb.k(f2.c(b3.b, b3.c));
                                long a3 = zp3.a(f2.e);
                                if (a3 != -1) {
                                    oyb.k(b3.b + b3.c <= a3);
                                }
                                if (mgd.d != null) {
                                    try {
                                        mgd.d.D(b3.c, file3.getName(), b3.Y);
                                    } catch (IOException e3) {
                                        throw new IOException(e3);
                                    } catch (IOException e4) {
                                        throw new IOException(e4);
                                    }
                                }
                                mgd.b(b3);
                                mgd.c.o();
                                mgd.notifyAll();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        oze.h(this.f);
                        this.f = null;
                        File file4 = this.e;
                        this.e = null;
                        file4.delete();
                        throw th2;
                    }
                } else {
                    return;
                }
        }
    }

    public void b(xz3 xz3) {
        File c2;
        xz3 xz32 = xz3;
        long j2 = xz32.g;
        long min = j2 == -1 ? -1 : Math.min(j2 - this.h, this.d);
        String str = xz32.h;
        int i2 = mze.a;
        long j3 = xz32.f + this.h;
        lgd lgd = (lgd) ((bv0) this.i);
        synchronized (lgd) {
            try {
                lgd.d();
                cw0 d2 = lgd.c.d(str);
                d2.getClass();
                swb.h(d2.b(j3, min));
                if (!lgd.a.exists()) {
                    lgd.e(lgd.a);
                    lgd.k();
                }
                ba7 ba7 = lgd.b;
                if (min != -1) {
                    ba7.a(lgd, min);
                } else {
                    ba7.getClass();
                }
                File file = new File(lgd.a, Integer.toString(lgd.e.nextInt(10)));
                if (!file.exists()) {
                    lgd.e(file);
                }
                c2 = ogd.c(file, d2.a, j3, System.currentTimeMillis());
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e = c2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            vcc vcc = (vcc) this.k;
            if (vcc == null) {
                this.k = new vcc(fileOutputStream, this.c, 0);
            } else {
                vcc.a(fileOutputStream);
            }
            this.f = (vcc) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0;
    }

    public void c(yz3 yz3) {
        File c2;
        yz3 yz32 = yz3;
        long j2 = yz32.g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = Math.min(j2 - this.h, this.d);
        }
        long j4 = j3;
        String str = yz32.h;
        int i2 = oze.a;
        long j5 = yz32.f + this.h;
        mgd mgd = (mgd) ((av0) this.i);
        synchronized (mgd) {
            try {
                mgd.d();
                dw0 f2 = mgd.c.f(str);
                f2.getClass();
                oyb.k(f2.c(j5, j4));
                if (!mgd.a.exists()) {
                    mgd.e(mgd.a);
                    mgd.n();
                }
                mgd.b.c(mgd, str, j5, j4);
                File file = new File(mgd.a, Integer.toString(mgd.f.nextInt(10)));
                if (!file.exists()) {
                    mgd.e(file);
                }
                c2 = pgd.c(file, f2.a, j5, System.currentTimeMillis());
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e = c2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            vcc vcc = (vcc) this.k;
            if (vcc == null) {
                this.k = new vcc(fileOutputStream, this.c, 1);
            } else {
                vcc.a(fileOutputStream);
            }
            this.f = (vcc) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0;
    }

    public ev0(av0 av0) {
        av0.getClass();
        this.i = av0;
        this.b = 5242880;
        this.c = 20480;
    }
}
