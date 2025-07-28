package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: yw  reason: default package */
public final class yw implements fjd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ yw(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void N(wr0 wr0, long j) {
        switch (this.a) {
            case 0:
                oyb.i(wr0.b, 0, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        kuc kuc = wr0.a;
                        while (true) {
                            if (j2 < ((long) 65536)) {
                                j2 += (long) (kuc.c - kuc.b);
                                if (j2 >= j) {
                                    j2 = j;
                                } else {
                                    kuc = kuc.f;
                                }
                            }
                        }
                        ax axVar = (ax) this.b;
                        axVar.i();
                        try {
                            ((fjd) this.c).N(wr0, j2);
                            if (!axVar.j()) {
                                j -= j2;
                            } else {
                                throw axVar.k((IOException) null);
                            }
                        } catch (IOException e) {
                            e = e;
                            if (axVar.j()) {
                                e = axVar.k(e);
                            }
                            throw e;
                        } finally {
                            axVar.j();
                        }
                    } else {
                        return;
                    }
                }
            default:
                oyb.i(wr0.b, 0, j);
                while (j > 0) {
                    ((xje) this.c).f();
                    kuc kuc2 = wr0.a;
                    int min = (int) Math.min(j, (long) (kuc2.c - kuc2.b));
                    ((OutputStream) this.b).write(kuc2.a, kuc2.b, min);
                    int i = kuc2.b + min;
                    kuc2.b = i;
                    long j3 = (long) min;
                    j -= j3;
                    wr0.b -= j3;
                    if (i == kuc2.c) {
                        wr0.a = kuc2.a();
                        bvc.a(kuc2);
                    }
                }
                return;
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                ax axVar = (ax) this.b;
                axVar.i();
                try {
                    ((fjd) this.c).close();
                    if (axVar.j()) {
                        throw axVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (axVar.j()) {
                        e = axVar.k(e);
                    }
                    throw e;
                } finally {
                    axVar.j();
                }
            default:
                ((OutputStream) this.b).close();
                return;
        }
    }

    public final void flush() {
        switch (this.a) {
            case 0:
                ax axVar = (ax) this.b;
                axVar.i();
                try {
                    ((fjd) this.c).flush();
                    if (axVar.j()) {
                        throw axVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (axVar.j()) {
                        e = axVar.k(e);
                    }
                    throw e;
                } finally {
                    axVar.j();
                }
            default:
                ((OutputStream) this.b).flush();
                return;
        }
    }

    public final xje p() {
        switch (this.a) {
            case 0:
                return (ax) this.b;
            default:
                return (xje) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.sink(" + ((fjd) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }
}
