package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: y30  reason: default package */
public final class y30 implements ob6 {
    public final h50 a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public duf f;
    public n24 g;
    public f50 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;

    public y30(h50 h50, gs4 gs4, xu5 xu5) {
        h50 h502 = new h50(xu5);
        boolean z = false;
        oyb.c(h502, (h502.c == -1 || h502.a == -1 || h502.b == -1) ? false : true);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i2 = 0; i2 < 10; i2++) {
            n24 n24 = new n24(2);
            n24.X = order;
            this.b.add(n24);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        this.f = new duf(h502);
        f50 k2 = k(gs4, xu5, h502, h50);
        this.h = k2;
        k2.b();
        h50 h503 = this.h.d;
        this.a = h503;
        oyb.c(h503, h503.c == 2 ? true : z);
        this.e = new AtomicLong(-9223372036854775807L);
        this.l = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ms6, ts6] */
    public static f50 k(gs4 gs4, xu5 xu5, h50 h50, h50 h502) {
        int i2;
        a39 a39;
        ? ms6 = new ms6(4);
        if (!(!gs4.d || xu5 == null || (a39 = xu5.k) == null)) {
            ms6.a(new lmd(new rcc(a39)));
        }
        ms6.e(gs4.g.a);
        int i3 = h502.a;
        if (i3 != -1) {
            qld qld = new qld();
            qld.b = i3;
            ms6.a(qld);
        }
        int i4 = h502.b;
        if (i4 == 1 || i4 == 2) {
            i12 i12 = new i12();
            j12 a2 = j12.a(1, i4);
            SparseArray sparseArray = i12.i;
            sparseArray.put(a2.a, a2);
            j12 a3 = j12.a(2, i4);
            sparseArray.put(a3.a, a3);
            ms6.a(i12);
        }
        f50 f50 = new f50(ms6.j());
        h50 a4 = f50.a(h50);
        if ((i3 == -1 || i3 == a4.a) && ((i4 == -1 || i4 == a4.b) && ((i2 = h502.c) == -1 || i2 == a4.c))) {
            return f50;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", h50);
    }

    public final void b(gs4 gs4, long j2, xu5 xu5, boolean z) {
        boolean z2 = false;
        if (xu5 == null) {
            if (j2 != -9223372036854775807L) {
                z2 = true;
            }
            oyb.j("Could not generate silent audio because duration is unknown.", z2);
        } else {
            oyb.k(c49.h(xu5.n));
            h50 h50 = new h50(xu5);
            if (!(h50.c == -1 || h50.a == -1 || h50.b == -1)) {
                z2 = true;
            }
            oyb.j(h50, z2);
        }
        this.d.add(new x30(gs4, j2, xu5, z));
    }

    public final n24 d() {
        if (!this.d.isEmpty()) {
            return null;
        }
        return (n24) this.b.peek();
    }

    public final boolean f() {
        oyb.k(this.d.isEmpty());
        n24 n24 = (n24) this.b.remove();
        this.c.add(n24);
        this.e.compareAndSet(-9223372036854775807L, n24.Z);
        return true;
    }

    public final void i() {
        duf duf = this.f;
        long j2 = this.l;
        long j3 = this.m;
        h50 h50 = (h50) duf.a;
        long Y = j2 - oze.Y(h50.a, j3 / ((long) h50.d));
        h50 h502 = (h50) duf.a;
        ((AtomicLong) duf.c).addAndGet(((long) h502.d) * oze.a0(Y, (long) h502.a, 1000000, RoundingMode.CEILING));
        this.n = true;
        if (this.o) {
            this.k = true;
        }
    }

    public final void j(n24 n24) {
        n24.v();
        n24.Z = 0;
        this.b.add(n24);
    }

    public final ByteBuffer l() {
        ByteBuffer byteBuffer;
        h50 h50;
        boolean z = this.i;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        if (!z) {
            byteBuffer = k50.a;
        } else {
            boolean f2 = this.h.f();
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.c;
            if (f2) {
                while (true) {
                    if (this.f.q()) {
                        ByteBuffer h2 = this.f.h();
                        this.h.i(h2);
                        if (h2.hasRemaining()) {
                            break;
                        } else if (!this.f.q()) {
                            this.h.h();
                            break;
                        }
                    } else {
                        n24 n24 = (n24) concurrentLinkedQueue2.peek();
                        if (n24 == null) {
                            if (!concurrentLinkedQueue.isEmpty()) {
                                if (!n()) {
                                    this.h.h();
                                    break;
                                }
                                i();
                            } else {
                                break;
                            }
                        } else if (n24.f(4)) {
                            if (!n()) {
                                this.h.h();
                                this.j = true;
                                j((n24) concurrentLinkedQueue2.remove());
                                break;
                            }
                            i();
                            j((n24) concurrentLinkedQueue2.remove());
                        } else {
                            ByteBuffer byteBuffer2 = n24.X;
                            byteBuffer2.getClass();
                            this.h.i(byteBuffer2);
                            this.m += ((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining());
                            if (byteBuffer2.hasRemaining()) {
                                break;
                            }
                            j((n24) concurrentLinkedQueue2.remove());
                        }
                    }
                }
                byteBuffer = this.h.d();
            } else if (this.f.q()) {
                byteBuffer = this.f.h();
            } else {
                n24 n242 = this.g;
                if (n242 != null) {
                    byteBuffer = n242.X;
                    oyb.l(byteBuffer);
                    if (!byteBuffer.hasRemaining()) {
                        n24 n243 = this.g;
                        oyb.l(n243);
                        j(n243);
                        this.g = null;
                    }
                }
                n24 n244 = (n24) concurrentLinkedQueue2.poll();
                if (n244 == null) {
                    if (!concurrentLinkedQueue.isEmpty() && n()) {
                        i();
                    }
                    byteBuffer = k50.a;
                } else {
                    ByteBuffer byteBuffer3 = n244.X;
                    this.j = n244.f(4);
                    if (byteBuffer3 == null || !byteBuffer3.hasRemaining() || this.j) {
                        j(n244);
                        if (this.j && n()) {
                            i();
                        }
                        byteBuffer = k50.a;
                    } else {
                        this.g = n244;
                        this.m += (long) byteBuffer3.remaining();
                        byteBuffer = byteBuffer3;
                    }
                }
            }
        }
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        if (!m() && !concurrentLinkedQueue.isEmpty()) {
            x30 x30 = (x30) concurrentLinkedQueue.poll();
            oyb.l(x30);
            this.m = 0;
            this.o = x30.d;
            this.n = false;
            gs4 gs4 = x30.a;
            long j2 = x30.b;
            xu5 xu5 = x30.c;
            if (xu5 != null) {
                this.l = j2;
                h50 = new h50(xu5);
                this.f = new duf(h50);
            } else {
                if (gs4.g.a.isEmpty()) {
                    this.l = gs4.b(j2);
                } else {
                    this.l = j2;
                }
                this.e.compareAndSet(-9223372036854775807L, 0);
                i();
                h50 = (h50) this.f.a;
            }
            if (this.i) {
                this.h = k(gs4, xu5, h50, this.a);
            }
            this.h.b();
            this.j = false;
            this.i = true;
        }
        return k50.a;
    }

    public final boolean m() {
        ByteBuffer byteBuffer;
        if (!this.i) {
            return false;
        }
        n24 n24 = this.g;
        if ((n24 == null || (byteBuffer = n24.X) == null || !byteBuffer.hasRemaining()) && !this.f.q() && this.c.isEmpty()) {
            return this.h.f() && !this.h.e();
        }
        return true;
    }

    public final boolean n() {
        if (!this.n) {
            long j2 = this.l;
            if (j2 != -9223372036854775807L) {
                long j3 = this.m;
                h50 h50 = (h50) this.f.a;
                if (j2 - oze.Y(h50.a, j3 / ((long) h50.d)) > 2000) {
                    return true;
                }
            }
        }
        return false;
    }
}
