package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: g12  reason: default package */
public final class g12 extends qg0 {
    public int[] i;
    public int[] j;

    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j2 = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i2 : iArr) {
                j2.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j2.flip();
    }

    public final g50 f(g50 g50) {
        int[] iArr = this.i;
        if (iArr == null) {
            return g50.e;
        }
        if (g50.c == 2) {
            int length = iArr.length;
            int i2 = g50.b;
            boolean z = i2 != length;
            int i3 = 0;
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 < i2) {
                    z |= i4 != i3;
                    i3++;
                } else {
                    throw new AudioProcessor$UnhandledAudioFormatException(g50);
                }
            }
            return z ? new g50(g50.a, iArr.length, 2) : g50.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(g50);
    }

    public final void g() {
        this.j = this.i;
    }

    public final void i() {
        this.j = null;
        this.i = null;
    }
}
