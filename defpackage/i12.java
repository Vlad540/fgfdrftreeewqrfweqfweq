package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: i12  reason: default package */
public final class i12 extends rg0 {
    public final SparseArray i = new SparseArray();

    public final void b(ByteBuffer byteBuffer) {
        j12 j12 = (j12) this.i.get(this.b.b);
        oyb.l(j12);
        int remaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer k = k(this.c.d * remaining);
        n1g.E(byteBuffer, this.b, k, this.c, j12, remaining, false, true);
        k.flip();
    }

    public final h50 g(h50 h50) {
        if (h50.c == 2) {
            j12 j12 = (j12) this.i.get(h50.b);
            if (j12 != null) {
                return j12.e ? h50.e : new h50(h50.a, j12.b, 2);
            }
            throw new AudioProcessor$UnhandledAudioFormatException("No mixing matrix for input channel count", h50);
        }
        throw new AudioProcessor$UnhandledAudioFormatException(h50);
    }
}
