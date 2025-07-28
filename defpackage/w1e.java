package defpackage;

import java.io.EOFException;

/* renamed from: w1e  reason: default package */
public final class w1e implements bpe {
    public final bpe a;
    public final s1e b;
    public final m54 c = new Object();
    public final ija d = new ija();
    public int e = 0;
    public int f = 0;
    public byte[] g = oze.f;
    public u1e h;
    public xu5 i;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, m54] */
    public w1e(bpe bpe, s1e s1e) {
        this.a = bpe;
        this.b = s1e;
    }

    public final void a(long j, int i2, int i3, int i4, zoe zoe) {
        if (this.h == null) {
            this.a.a(j, i2, i3, i4, zoe);
            return;
        }
        oyb.c("DRM on subtitles is not supported", zoe == null);
        int i5 = (this.f - i4) - i3;
        this.h.Q(this.g, i5, i3, t1e.c, new b44((Object) this, j, i2, 6));
        int i6 = i5 + i3;
        this.e = i6;
        if (i6 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void b(ija ija, int i2, int i3) {
        if (this.h == null) {
            this.a.b(ija, i2, i3);
            return;
        }
        f(i2);
        ija.e(this.f, this.g, i2);
        this.f += i2;
    }

    public final int c(jz3 jz3, int i2, boolean z) {
        if (this.h == null) {
            return this.a.c(jz3, i2, z);
        }
        f(i2);
        int read = jz3.read(this.g, this.f, i2);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void e(xu5 xu5) {
        xu5.n.getClass();
        String str = xu5.n;
        oyb.d(c49.g(str) == 3);
        boolean equals = xu5.equals(this.i);
        s1e s1e = this.b;
        if (!equals) {
            this.i = xu5;
            this.h = s1e.b(xu5) ? s1e.d(xu5) : null;
        }
        u1e u1e = this.h;
        bpe bpe = this.a;
        if (u1e == null) {
            bpe.e(xu5);
            return;
        }
        uu5 a2 = xu5.a();
        a2.m = c49.l("application/x-media3-cues");
        a2.i = str;
        a2.r = Long.MAX_VALUE;
        a2.G = s1e.e(xu5);
        bpe.e(new xu5(a2));
    }

    public final void f(int i2) {
        int length = this.g.length;
        int i3 = this.f;
        if (length - i3 < i2) {
            int i4 = i3 - this.e;
            int max = Math.max(i4 * 2, i2 + i4);
            byte[] bArr = this.g;
            byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
            System.arraycopy(bArr, this.e, bArr2, 0, i4);
            this.e = 0;
            this.f = i4;
            this.g = bArr2;
        }
    }
}
