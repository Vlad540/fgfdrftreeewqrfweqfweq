package defpackage;

/* renamed from: n58  reason: default package */
public final class n58 implements bpe {
    public xu5 a;
    public final r7e b = new r7e(new ib7(19));

    public final void a(long j, int i, int i2, int i3, zoe zoe) {
    }

    public final void b(ija ija, int i, int i2) {
        while (i > 0) {
            r7e r7e = this.b;
            int min = Math.min(i, ((byte[]) r7e.getValue()).length);
            ija.e(0, (byte[]) r7e.getValue(), min);
            i -= min;
        }
    }

    public final int c(jz3 jz3, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            r7e r7e = this.b;
            int read = jz3.read((byte[]) r7e.getValue(), 0, Math.min(i2, ((byte[]) r7e.getValue()).length));
            if (read != -1) {
                i2 -= read;
            } else {
                throw new RuntimeException("Unexpected end of track");
            }
        }
        return i;
    }

    public final void e(xu5 xu5) {
        this.a = xu5;
    }
}
