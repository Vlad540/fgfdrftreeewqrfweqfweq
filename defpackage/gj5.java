package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: gj5  reason: default package */
public final class gj5 extends qg0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 == 536870912) {
            byteBuffer2 = j((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits == i4) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(floatToIntBits);
                position += 3;
            }
        } else if (i3 == 805306368) {
            byteBuffer2 = j(i2);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i4) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(floatToIntBits2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public final g50 f(g50 g50) {
        int i2 = g50.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new g50(g50.a, g50.b, 4) : g50.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(g50);
    }
}
