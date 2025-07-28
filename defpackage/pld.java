package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: pld  reason: default package */
public final class pld implements i50 {
    public int b;
    public float c;
    public float d;
    public g50 e;
    public g50 f;
    public g50 g;
    public g50 h;
    public boolean i;
    public old j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public final ByteBuffer a() {
        old old = this.j;
        if (old != null) {
            int i2 = old.n;
            int i3 = old.c;
            int i4 = i2 * i3 * 2;
            if (i4 > 0) {
                if (this.k.capacity() < i4) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i3, old.n);
                int i5 = min * i3;
                shortBuffer.put(old.m, 0, i5);
                int i6 = old.n - min;
                old.n = i6;
                short[] sArr = old.m;
                System.arraycopy(sArr, i5, sArr, 0, i6 * i3);
                this.o += (long) i4;
                this.k.limit(i4);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = i50.a;
        return byteBuffer;
    }

    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            old old = this.j;
            old.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i2 = old.c;
            int i3 = remaining2 / i2;
            short[] c2 = old.c(old.k, old.l, i3);
            old.k = c2;
            asShortBuffer.get(c2, old.l * i2, ((i3 * i2) * 2) / 2);
            old.l += i3;
            old.g();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void c() {
        old old = this.j;
        if (old != null) {
            int i2 = old.l;
            float f2 = old.d;
            float f3 = old.e;
            int i3 = old.n + ((int) ((((((float) i2) / (f2 / f3)) + ((float) old.p)) / (old.f * f3)) + 0.5f));
            short[] sArr = old.k;
            int i4 = old.i * 2;
            old.k = old.c(sArr, i2, i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = old.c;
                if (i5 >= i4 * i6) {
                    break;
                }
                old.k[(i6 * i2) + i5] = 0;
                i5++;
            }
            old.l = i4 + old.l;
            old.g();
            if (old.n > i3) {
                old.n = i3;
            }
            old.l = 0;
            old.s = 0;
            old.p = 0;
        }
        this.p = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r1 = this;
            boolean r0 = r1.p
            if (r0 == 0) goto L_0x0013
            old r1 = r1.j
            if (r1 == 0) goto L_0x0011
            int r0 = r1.n
            int r1 = r1.c
            int r0 = r0 * r1
            int r0 = r0 * 2
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pld.d():boolean");
    }

    public final g50 e(g50 g50) {
        if (g50.c == 2) {
            int i2 = this.b;
            if (i2 == -1) {
                i2 = g50.a;
            }
            this.e = g50;
            g50 g502 = new g50(i2, g50.b, 2);
            this.f = g502;
            this.i = true;
            return g502;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(g50);
    }

    public final void flush() {
        if (isActive()) {
            g50 g50 = this.e;
            this.g = g50;
            g50 g502 = this.f;
            this.h = g502;
            if (this.i) {
                this.j = new old(g50.a, g50.b, this.c, this.d, g502.a, 0);
            } else {
                old old = this.j;
                if (old != null) {
                    old.l = 0;
                    old.n = 0;
                    old.p = 0;
                    old.q = 0;
                    old.r = 0;
                    old.s = 0;
                    old.t = 0;
                    old.u = 0;
                    old.v = 0;
                    old.w = 0;
                }
            }
        }
        this.m = i50.a;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }

    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }

    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        g50 g50 = g50.e;
        this.e = g50;
        this.f = g50;
        this.g = g50;
        this.h = g50;
        ByteBuffer byteBuffer = i50.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }
}
