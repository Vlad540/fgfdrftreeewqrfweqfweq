package defpackage;

import java.io.EOFException;

/* renamed from: qh4  reason: default package */
public final class qh4 implements bpe {
    public final byte[] a = new byte[4096];

    public final void a(long j, int i, int i2, int i3, zoe zoe) {
    }

    public final void b(ija ija, int i, int i2) {
        ija.H(i);
    }

    public final int c(jz3 jz3, int i, boolean z) {
        byte[] bArr = this.a;
        int read = jz3.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(xu5 xu5) {
    }
}
