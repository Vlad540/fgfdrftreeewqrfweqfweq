package defpackage;

/* renamed from: r79  reason: default package */
public final class r79 implements bpe {
    public xu5 a;
    public final byte[] b = new byte[16000];

    public final void a(long j, int i, int i2, int i3, zoe zoe) {
    }

    public final void b(ija ija, int i, int i2) {
        while (i > 0) {
            byte[] bArr = this.b;
            int min = Math.min(i, bArr.length);
            ija.e(0, bArr, min);
            i -= min;
        }
    }

    public final int c(jz3 jz3, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = this.b;
            boolean z2 = false;
            int read = jz3.read(bArr, 0, Math.min(i2, bArr.length));
            if (read != -1) {
                z2 = true;
            }
            oyb.k(z2);
            i2 -= read;
        }
        return i;
    }

    public final void e(xu5 xu5) {
        this.a = xu5;
    }
}
