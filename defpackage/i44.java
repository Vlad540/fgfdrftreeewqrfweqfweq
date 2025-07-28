package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;

/* renamed from: i44  reason: default package */
public final class i44 {
    public final boolean a;
    public final boolean b;
    public final SparseArray c = new SparseArray();
    public int d;
    public h50 e = h50.e;
    public int f = -1;
    public ir1[] g = new ir1[0];
    public long h = -9223372036854775807L;
    public long i = -1;
    public long j;
    public long k = Long.MAX_VALUE;
    public long l;

    public i44(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z) {
            this.l = Long.MAX_VALUE;
        }
    }

    public final int a(h50 h50, long j2) {
        c();
        c();
        h50 h502 = this.e;
        if (h50.a != h502.a || !n1g.b(h50) || !n1g.b(h502)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.e, h50);
        }
        long a0 = oze.a0(j2 - this.h, (long) h50.a, 1000000, RoundingMode.CEILING);
        int i2 = this.d;
        this.d = i2 + 1;
        this.c.append(i2, new h44(this, h50, j12.a(h50.b, this.e.b), a0));
        LinkedHashMap linkedHashMap = b24.a;
        synchronized (b24.class) {
        }
        return i2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [ir1, java.lang.Object] */
    public final ir1 b(long j2) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.f * this.e.d).order(ByteOrder.nativeOrder());
        order.mark();
        ? obj = new Object();
        obj.c = order;
        obj.a = j2;
        obj.b = ((long) this.f) + j2;
        return obj;
    }

    public final void c() {
        oyb.j("Audio mixer is not configured.", !this.e.equals(h50.e));
    }

    public final void d(h50 h50) {
        oyb.j("Audio mixer already configured.", this.e.equals(h50.e));
        if (n1g.b(h50)) {
            this.e = h50;
            this.f = (500 * h50.a) / 1000;
            this.h = 0;
            LinkedHashMap linkedHashMap = b24.a;
            synchronized (b24.class) {
            }
            this.g = new ir1[]{b(0), b((long) this.f)};
            this.i = Math.min(this.k, this.j + ((long) this.f));
            return;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", h50);
    }

    public final boolean e() {
        c();
        long j2 = this.j;
        return j2 >= this.k || (j2 >= this.l && this.c.size() == 0);
    }

    public final void f(int i2, ByteBuffer byteBuffer) {
        int i3;
        i44 i44 = this;
        int i4 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray sparseArray = i44.c;
            oyb.j("Source not found.", oze.l(sparseArray, i4));
            h44 h44 = (h44) sparseArray.get(i4);
            if (h44.a < i44.i) {
                long min = Math.min(h44.a + ((long) (byteBuffer.remaining() / h44.b.d)), i44.i);
                if (h44.c.d) {
                    h44.a(min, byteBuffer2);
                    return;
                }
                long j2 = h44.a;
                long j3 = i44.j;
                if (j2 < j3) {
                    h44.a(Math.min(min, j3), byteBuffer2);
                    if (h44.a == min) {
                        return;
                    }
                }
                ir1[] ir1Arr = i44.g;
                int length = ir1Arr.length;
                int i5 = 0;
                while (i5 < length) {
                    ir1 ir1 = ir1Arr[i5];
                    long j4 = h44.a;
                    if (j4 >= ir1.b) {
                        i3 = i5;
                    } else {
                        int i6 = ((int) (j4 - ir1.a)) * i44.e.d;
                        ByteBuffer byteBuffer3 = (ByteBuffer) ir1.c;
                        byteBuffer3.position(byteBuffer3.position() + i6);
                        long min2 = Math.min(min, ir1.b);
                        h50 h50 = i44.e;
                        oyb.d(min2 >= h44.a);
                        int i7 = (int) (min2 - h44.a);
                        boolean z = h44.d.b;
                        i3 = i5;
                        n1g.E(byteBuffer, h44.b, (ByteBuffer) ir1.c, h50, h44.c, i7, true, z);
                        h44.a = min2;
                        byteBuffer3.reset();
                        if (h44.a == min) {
                            return;
                        }
                    }
                    i5 = i3 + 1;
                    i44 = this;
                }
            }
        }
    }
}
