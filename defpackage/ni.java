package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ni  reason: default package */
public final class ni implements nhc {
    public final bd4 a;
    public final h2d b;
    public az3 c;

    public ni(bd4 bd4, h2d h2d) {
        this.a = bd4;
        this.b = h2d;
    }

    public final void a(az3 az3, byte[] bArr, int i) {
        SystemClock.elapsedRealtime();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b2 = wrap.get();
        wrap.getShort();
        wrap.getInt();
        if (b2 == 1) {
            wrap.getShort();
        } else {
            wrap.getInt();
        }
        byte b3 = wrap.get();
        ByteBuffer slice = wrap.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        int i2 = 0;
        if (b2 == 1) {
            int remaining = slice.remaining() / 4;
            float[] fArr = new float[remaining];
            while (i2 < remaining) {
                fArr[i2] = slice.getFloat();
                i2++;
            }
        } else if (b3 == 0) {
            int remaining2 = slice.remaining();
            float[] fArr2 = new float[remaining2];
            while (i2 < remaining2) {
                fArr2[i2] = ((float) (slice.get() & 255)) * 0.003921569f;
                i2++;
            }
        } else if (b3 != 1 && b3 == 2) {
            Color.rgb(slice.get() & 255, slice.get() & 255, slice.get() & 255);
        }
        h2d h2d = this.b;
        ((AtomicInteger) h2d.Y).incrementAndGet();
        ((AtomicInteger) h2d.X).addAndGet(bArr.length);
        this.a.getClass();
    }
}
