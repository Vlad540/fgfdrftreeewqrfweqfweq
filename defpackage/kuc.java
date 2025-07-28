package defpackage;

/* renamed from: kuc  reason: default package */
public final class kuc {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public kuc f;
    public kuc g;

    public kuc() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final kuc a() {
        kuc kuc = this.f;
        kuc kuc2 = kuc != this ? kuc : null;
        kuc kuc3 = this.g;
        kuc3.f = kuc;
        this.f.g = kuc3;
        this.f = null;
        this.g = null;
        return kuc2;
    }

    public final void b(kuc kuc) {
        kuc.g = this;
        kuc.f = this.f;
        this.f.g = kuc;
        this.f = kuc;
    }

    public final kuc c() {
        this.d = true;
        return new kuc(this.a, this.b, this.c, true, false);
    }

    public final void d(kuc kuc, int i) {
        if (kuc.e) {
            int i2 = kuc.c;
            int i3 = i2 + i;
            byte[] bArr = kuc.a;
            if (i3 > 8192) {
                if (!kuc.d) {
                    int i4 = kuc.b;
                    if (i3 - i4 <= 8192) {
                        cs.S(bArr, i4, bArr, i2);
                        kuc.c -= kuc.b;
                        kuc.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = kuc.c;
            int i6 = this.b;
            System.arraycopy(this.a, i6, bArr, i5, (i6 + i) - i6);
            kuc.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public kuc(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
