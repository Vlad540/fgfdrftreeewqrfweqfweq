package defpackage;

/* renamed from: w23  reason: default package */
public final class w23 {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ ez2 j;

    public w23(ez2 ez2, int i2, int i3) {
        this.j = ez2;
        this.a = i2;
        this.b = i3;
        a();
    }

    public final void a() {
        ez2 ez2 = this.j;
        int[] iArr = (int[]) ez2.a;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = 0;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = this.a; i9 <= this.b; i9++) {
            int i10 = iArr[i9];
            i6 += ((int[]) ez2.b)[i10];
            int i11 = (i10 >> 10) & 31;
            int i12 = (i10 >> 5) & 31;
            int i13 = i10 & 31;
            if (i11 > i3) {
                i3 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i4) {
                i4 = i12;
            }
            if (i12 < i7) {
                i7 = i12;
            }
            if (i13 > i5) {
                i5 = i13;
            }
            if (i13 < i8) {
                i8 = i13;
            }
        }
        this.d = i2;
        this.e = i3;
        this.f = i7;
        this.g = i4;
        this.h = i8;
        this.i = i5;
        this.c = i6;
    }

    public final int b() {
        return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
    }
}
