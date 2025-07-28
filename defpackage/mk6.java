package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: mk6  reason: default package */
public final class mk6 {
    public final ArrayList a = new ArrayList();
    public final v0c b;
    public re6[] c;
    public int d;
    public int e;
    public int f;
    public int g = 4096;

    public mk6(il6 il6) {
        this.b = new v0c(il6);
        this.c = new re6[8];
        this.d = 7;
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.c.length;
            while (true) {
                length--;
                i2 = this.d;
                if (length < i2 || i <= 0) {
                    re6[] re6Arr = this.c;
                    System.arraycopy(re6Arr, i2 + 1, re6Arr, i2 + 1 + i3, this.e);
                    this.d += i3;
                } else {
                    int i4 = this.c[length].a;
                    i -= i4;
                    this.f -= i4;
                    this.e--;
                    i3++;
                }
            }
            re6[] re6Arr2 = this.c;
            System.arraycopy(re6Arr2, i2 + 1, re6Arr2, i2 + 1 + i3, this.e);
            this.d += i3;
        }
        return i3;
    }

    public final uu0 b(int i) {
        if (i >= 0) {
            re6[] re6Arr = ok6.a;
            if (i <= re6Arr.length - 1) {
                return re6Arr[i].b;
            }
        }
        int length = this.d + 1 + (i - ok6.a.length);
        if (length >= 0) {
            re6[] re6Arr2 = this.c;
            if (length < re6Arr2.length) {
                return re6Arr2[length].b;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(re6 re6) {
        this.a.add(re6);
        int i = this.g;
        int i2 = re6.a;
        if (i2 > i) {
            cs.W(this.c, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            return;
        }
        a((this.f + i2) - i);
        int i3 = this.e + 1;
        re6[] re6Arr = this.c;
        if (i3 > re6Arr.length) {
            re6[] re6Arr2 = new re6[(re6Arr.length * 2)];
            System.arraycopy(re6Arr, 0, re6Arr2, re6Arr.length, re6Arr.length);
            this.d = this.c.length - 1;
            this.c = re6Arr2;
        }
        int i4 = this.d;
        this.d = i4 - 1;
        this.c[i4] = re6;
        this.e++;
        this.f += i2;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [wr0, java.lang.Object] */
    public final uu0 d() {
        int i;
        v0c v0c = this.b;
        byte readByte = v0c.readByte();
        byte[] bArr = nze.a;
        byte b2 = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e2 = (long) e(b2, 127);
        if (!z) {
            return v0c.e(e2);
        }
        ? obj = new Object();
        hw9 hw9 = zm6.c;
        hw9 hw92 = hw9;
        int i3 = 0;
        for (long j = 0; j < e2; j++) {
            int readByte2 = v0c.readByte();
            byte[] bArr2 = nze.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = i3 - 8;
                hw92 = ((hw9[]) hw92.o)[(i2 >>> i4) & 255];
                if (((hw9[]) hw92.o) == null) {
                    obj.u0(hw92.b);
                    i3 -= hw92.c;
                    hw92 = hw9;
                } else {
                    i3 = i4;
                }
            }
        }
        while (i3 > 0) {
            hw9 hw93 = ((hw9[]) hw92.o)[(i2 << (8 - i3)) & 255];
            if (((hw9[]) hw93.o) != null || (i = hw93.c) > i3) {
                break;
            }
            obj.u0(hw93.b);
            i3 -= i;
            hw92 = hw9;
        }
        return obj.e(obj.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.b.readByte();
            byte[] bArr = nze.a;
            byte b2 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (b2 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
