package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: h12  reason: default package */
public final class h12 extends rg0 {
    public int[] i;
    public int[] j;

    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k = k(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i2 : iArr) {
                k.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        k.flip();
    }

    public final h50 g(h50 h50) {
        int[] iArr = this.i;
        if (iArr == null) {
            return h50.e;
        }
        if (h50.c == 2) {
            int length = iArr.length;
            int i2 = h50.b;
            boolean z = i2 != length;
            int i3 = 0;
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 < i2) {
                    z |= i4 != i3;
                    i3++;
                } else {
                    throw new AudioProcessor$UnhandledAudioFormatException(h50);
                }
            }
            return z ? new h50(h50.a, iArr.length, 2) : h50.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(h50);
    }

    public final void h() {
        this.j = this.i;
    }

    public final void j() {
        this.j = null;
        this.i = null;
    }
}
