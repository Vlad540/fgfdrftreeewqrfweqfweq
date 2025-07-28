package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: cse  reason: default package */
public final class cse extends qg0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    public final ByteBuffer a() {
        int i2;
        if (super.d() && (i2 = this.n) > 0) {
            j(i2).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            int min = Math.min(i2, this.l);
            this.o += (long) (min / this.b.d);
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l <= 0) {
                int i3 = i2 - min;
                int length = (this.n + i3) - this.m.length;
                ByteBuffer j2 = j(length);
                int j3 = mze.j(length, 0, this.n);
                j2.put(this.m, 0, j3);
                int j4 = mze.j(length - j3, 0, i3);
                byteBuffer.limit(byteBuffer.position() + j4);
                j2.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - j4;
                int i5 = this.n - j3;
                this.n = i5;
                byte[] bArr = this.m;
                System.arraycopy(bArr, j3, bArr, 0, i5);
                byteBuffer.get(this.m, this.n, i4);
                this.n += i4;
                j2.flip();
            }
        }
    }

    public final boolean d() {
        return super.d() && this.n == 0;
    }

    public final g50 f(g50 g50) {
        if (g50.c == 2) {
            this.k = true;
            return (this.i == 0 && this.j == 0) ? g50.e : g50;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(g50);
    }

    public final void g() {
        if (this.k) {
            this.k = false;
            int i2 = this.j;
            int i3 = this.b.d;
            this.m = new byte[(i2 * i3)];
            this.l = this.i * i3;
        }
        this.n = 0;
    }

    public final void h() {
        if (this.k) {
            int i2 = this.n;
            if (i2 > 0) {
                this.o += (long) (i2 / this.b.d);
            }
            this.n = 0;
        }
    }

    public final void i() {
        this.m = mze.f;
    }
}
