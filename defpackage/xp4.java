package defpackage;

import java.io.EOFException;

/* renamed from: xp4  reason: default package */
public final class xp4 implements ape {
    public final byte[] a = new byte[4096];

    public final int a(iz3 iz3, int i, boolean z) {
        byte[] bArr = this.a;
        int read = iz3.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void b(long j, int i, int i2, int i3, yoe yoe) {
    }

    public final void c(int i, yze yze) {
        yze.I(i);
    }

    public final void d(vu5 vu5) {
    }
}
