package defpackage;

/* renamed from: fse  reason: default package */
public final class fse {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public fse(int i) {
        switch (i) {
            case 1:
                this.a = new byte[10];
                return;
            default:
                this.a = new byte[10];
                return;
        }
    }

    public void a(ape ape, yoe yoe) {
        if (this.c > 0) {
            ape.b(this.d, this.e, this.f, this.g, yoe);
            this.c = 0;
        }
    }

    public void b(bpe bpe, zoe zoe) {
        if (this.c > 0) {
            bpe.a(this.d, this.e, this.f, this.g, zoe);
            this.c = 0;
        }
    }

    public void c(ape ape, long j, int i, int i2, int i3, yoe yoe) {
        if (!(this.g <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        } else if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(ape, yoe);
            }
        }
    }

    public void d(bpe bpe, long j, int i, int i2, int i3, zoe zoe) {
        oyb.j("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                b(bpe, zoe);
            }
        }
    }

    public void e(f75 f75) {
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            f75.m(0, bArr, 10);
            f75.y();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b2 = bArr[7];
                if ((b2 & 254) == 186) {
                    i = 40 << ((bArr[(b2 & 255) == 187 ? (char) 9 : 8] >> 4) & 7);
                }
            }
            if (i != 0) {
                this.b = true;
            }
        }
    }

    public void f(g75 g75) {
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            g75.m(0, bArr, 10);
            g75.y();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b2 = bArr[7];
                if ((b2 & 254) == 186) {
                    i = 40 << ((bArr[(b2 & 255) == 187 ? (char) 9 : 8] >> 4) & 7);
                }
            }
            if (i != 0) {
                this.b = true;
            }
        }
    }
}
