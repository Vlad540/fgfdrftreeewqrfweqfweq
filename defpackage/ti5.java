package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ti5  reason: default package */
public final class ti5 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Parcelable m;

    public ti5(byte[] bArr, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                wx1 wx1 = new wx1(bArr, bArr.length, 2, (byte) 0);
                wx1.q(i2 * 8);
                this.b = wx1.i(16);
                this.c = wx1.i(16);
                this.d = wx1.i(24);
                this.e = wx1.i(24);
                int i4 = wx1.i(20);
                this.f = i4;
                this.g = g(i4);
                this.h = wx1.i(3) + 1;
                int i5 = wx1.i(5) + 1;
                this.i = i5;
                this.j = b(i5);
                this.k = wx1.k(36);
                this.l = null;
                this.m = null;
                return;
            default:
                wx1 wx12 = new wx1(bArr, bArr.length, 1, (byte) 0);
                wx12.q(i2 * 8);
                this.b = wx12.i(16);
                this.c = wx12.i(16);
                this.d = wx12.i(24);
                this.e = wx12.i(24);
                int i6 = wx12.i(20);
                this.f = i6;
                this.g = f(i6);
                this.h = wx12.i(3) + 1;
                int i7 = wx12.i(5) + 1;
                this.i = i7;
                this.j = a(i7);
                int i8 = wx12.i(4);
                int i9 = wx12.i(32);
                int i10 = mze.a;
                this.k = ((((long) i8) & 4294967295L) << 32) | (((long) i9) & 4294967295L);
                this.l = null;
                this.m = null;
                return;
        }
    }

    public static int a(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int f(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        switch (this.a) {
            case 0:
                long j2 = this.k;
                if (j2 == 0) {
                    return -9223372036854775807L;
                }
                return (j2 * 1000000) / ((long) this.f);
            default:
                long j3 = this.k;
                if (j3 == 0) {
                    return -9223372036854775807L;
                }
                return (j3 * 1000000) / ((long) this.f);
        }
    }

    public vu5 d(byte[] bArr, y29 y29) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.e;
        if (i2 <= 0) {
            i2 = -1;
        }
        y29 y292 = (y29) this.m;
        if (y292 != null) {
            if (y29 != null) {
                w29[] w29Arr = y29.a;
                if (w29Arr.length != 0) {
                    int i3 = mze.a;
                    w29[] w29Arr2 = y292.a;
                    Object[] copyOf = Arrays.copyOf(w29Arr2, w29Arr2.length + w29Arr.length);
                    System.arraycopy(w29Arr, 0, copyOf, w29Arr2.length, w29Arr.length);
                    y292 = new y29((w29[]) copyOf);
                }
            }
            y29 = y292;
        }
        tu5 tu5 = new tu5();
        tu5.k = "audio/flac";
        tu5.l = i2;
        tu5.x = this.h;
        tu5.y = this.f;
        tu5.m = Collections.singletonList(bArr);
        tu5.i = y29;
        return new vu5(tu5);
    }

    public xu5 e(byte[] bArr, a39 a39) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.e;
        if (i2 <= 0) {
            i2 = -1;
        }
        a39 a392 = (a39) this.m;
        if (a392 != null) {
            a39 = a392.b(a39);
        }
        uu5 uu5 = new uu5();
        uu5.m = c49.l("audio/flac");
        uu5.n = i2;
        uu5.A = this.h;
        uu5.B = this.f;
        uu5.C = oze.C(this.i);
        uu5.p = Collections.singletonList(bArr);
        uu5.j = a39;
        return new xu5(uu5);
    }

    public ti5(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, b2b b2b, y29 y29) {
        this.a = 0;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = f(i6);
        this.h = i7;
        this.i = i8;
        this.j = a(i8);
        this.k = j2;
        this.l = b2b;
        this.m = y29;
    }

    public ti5(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, afc afc, a39 a39) {
        this.a = 1;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = g(i6);
        this.h = i7;
        this.i = i8;
        this.j = b(i8);
        this.k = j2;
        this.l = afc;
        this.m = a39;
    }
}
