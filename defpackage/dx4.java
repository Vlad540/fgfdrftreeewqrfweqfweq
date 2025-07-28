package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: dx4  reason: default package */
public final class dx4 extends qjc implements ob6 {
    public static final ByteBuffer o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final xu5 e;
    public final long f;
    public final AtomicLong g = new AtomicLong();
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();
    public volatile boolean j;
    public long k;
    public boolean l;
    public long m;
    public n24 n;

    public dx4(xu5 xu5, iqe iqe, ad9 ad9, s39 s39, long j2) {
        super(xu5, ad9);
        this.e = xu5;
        this.f = j2;
        s39.h(iqe);
    }

    public final void b(gs4 gs4, long j2, xu5 xu5, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j2);
    }

    public final n24 d() {
        if (this.n == null) {
            n24 n24 = (n24) this.h.poll();
            this.n = n24;
            if (!this.l) {
                if (n24 == null) {
                    n24 n242 = new n24(2);
                    this.n = n242;
                    n242.X = o;
                } else {
                    long j2 = this.m;
                    ByteBuffer byteBuffer = n24.X;
                    byteBuffer.getClass();
                    this.m = j2 - ((long) byteBuffer.capacity());
                }
            }
        }
        return this.n;
    }

    public final boolean f() {
        n24 n24 = this.n;
        n24.getClass();
        this.n = null;
        if (n24.f(4)) {
            this.j = true;
        } else {
            n24.Z = this.k + this.f + n24.Z;
            this.i.add(n24);
        }
        if (!this.l) {
            int size = this.i.size() + this.h.size();
            long j2 = this.m;
            ByteBuffer byteBuffer = n24.X;
            byteBuffer.getClass();
            long capacity = j2 + ((long) byteBuffer.capacity());
            this.m = capacity;
            this.l = size >= 10 && (size >= 200 || capacity >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        return true;
    }

    public final ob6 j(gs4 gs4, xu5 xu5, int i2) {
        return this;
    }

    public final n24 k() {
        return (n24) this.i.peek();
    }

    public final xu5 l() {
        return this.e;
    }

    public final boolean m() {
        return this.j && this.i.isEmpty();
    }

    public final void o() {
    }

    public final void p() {
        n24 n24 = (n24) this.i.remove();
        n24.v();
        n24.Z = 0;
        this.h.add(n24);
    }
}
