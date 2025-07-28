package defpackage;

import java.util.NoSuchElementException;

/* renamed from: xx  reason: default package */
public final class xx implements ux, vx {
    public int X;
    public Object Y;
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public xx(int i, byte b2) {
        this(16);
        this.a = i;
        switch (i) {
            case 4:
                return;
            default:
                this.b = 0;
                this.c = -1;
                this.o = 0;
                int[] iArr = new int[16];
                this.Y = iArr;
                this.X = iArr.length - 1;
                return;
        }
    }

    public int a() {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return -1;
        }
    }

    public int b() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public int c() {
        switch (this.a) {
            case 0:
                yze yze = (yze) this.Y;
                int i = this.c;
                if (i == 8) {
                    return yze.v();
                }
                if (i == 16) {
                    return yze.A();
                }
                int i2 = this.o;
                this.o = i2 + 1;
                if (i2 % 2 != 0) {
                    return this.X & 15;
                }
                int v = yze.v();
                this.X = v;
                return (v & 240) >> 4;
            default:
                ija ija = (ija) this.Y;
                int i3 = this.c;
                if (i3 == 8) {
                    return ija.u();
                }
                if (i3 == 16) {
                    return ija.A();
                }
                int i4 = this.o;
                this.o = i4 + 1;
                if (i4 % 2 != 0) {
                    return this.X & 15;
                }
                int u = ija.u();
                this.X = u;
                return (u & 240) >> 4;
        }
    }

    public void d(int i) {
        int i2 = this.o;
        int[] iArr = (int[]) this.Y;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i3 = this.b;
                int i4 = length2 - i3;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                System.arraycopy((int[]) this.Y, 0, iArr2, i4, i3);
                this.b = 0;
                this.c = this.o - 1;
                this.Y = iArr2;
                this.X = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.c + 1) & this.X;
        this.c = i5;
        ((int[]) this.Y)[i5] = i;
        this.o++;
    }

    public void e(long j) {
        int i = this.o;
        long[] jArr = (long[]) this.Y;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i2 = this.b;
                int i3 = length2 - i2;
                System.arraycopy(jArr, i2, jArr2, 0, i3);
                System.arraycopy((long[]) this.Y, 0, jArr2, i3, i2);
                this.b = 0;
                this.c = this.o - 1;
                this.Y = jArr2;
                this.X = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i4 = (this.c + 1) & this.X;
        this.c = i4;
        ((long[]) this.Y)[i4] = j;
        this.o++;
    }

    public long f() {
        if (this.o != 0) {
            return ((long[]) this.Y)[this.b];
        }
        throw new NoSuchElementException();
    }

    public int g() {
        int i = this.o;
        if (i != 0) {
            int i2 = this.b;
            int i3 = ((int[]) this.Y)[i2];
            this.b = (i2 + 1) & this.X;
            this.o = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    public long h() {
        int i = this.o;
        if (i != 0) {
            int i2 = this.b;
            long j = ((long[]) this.Y)[i2];
            this.b = this.X & (i2 + 1);
            this.o = i - 1;
            return j;
        }
        throw new NoSuchElementException();
    }

    public xx(int i) {
        this.a = 4;
        oyb.d(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.b = 0;
        this.c = -1;
        this.o = 0;
        long[] jArr = new long[i];
        this.Y = jArr;
        this.X = jArr.length - 1;
    }

    public xx(int i, int i2, int i3, int i4, String str) {
        this.a = 2;
        this.Y = str;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = i4;
    }

    public xx(px pxVar) {
        this.a = 0;
        yze yze = pxVar.c;
        this.Y = yze;
        yze.H(12);
        this.c = yze.y() & 255;
        this.b = yze.y();
    }

    public xx(qx qxVar) {
        this.a = 1;
        ija ija = qxVar.c;
        this.Y = ija;
        ija.G(12);
        this.c = ija.y() & 255;
        this.b = ija.y();
    }
}
