package defpackage;

import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: jid  reason: default package */
public final class jid implements gj7 {
    public final long a = yi7.b.getAndIncrement();
    public final yz3 b;
    public final fsd c;
    public byte[] o;

    public jid(qz3 qz3, yz3 yz3) {
        this.b = yz3;
        this.c = new fsd(qz3);
    }

    public final void a() {
    }

    public final void load() {
        fsd fsd = this.c;
        fsd.b = 0;
        try {
            fsd.G(this.b);
            int i = 0;
            while (i != -1) {
                int i2 = (int) fsd.b;
                byte[] bArr = this.o;
                if (bArr == null) {
                    this.o = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                } else if (i2 == bArr.length) {
                    this.o = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.o;
                i = fsd.read(bArr2, i2, bArr2.length - i2);
            }
            vx3.i(fsd);
        } catch (Throwable th) {
            vx3.i(fsd);
            throw th;
        }
    }
}
