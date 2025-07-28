package defpackage;

import org.webrtc.Size;

/* renamed from: y4f  reason: default package */
public final class y4f {
    public final boolean a;
    public final u16 b;
    public final int c;
    public volatile Integer d;
    public volatile Integer e;
    public zna f;
    public Integer g;
    public Integer h;
    public Integer i;

    public y4f(boolean z, int i2, h87 h87) {
        this.a = z;
        this.b = h87;
        this.c = gwf.j(i2 - (i2 % 16), 320, 4096);
    }

    public final zna a(int i2, int i3) {
        wia wia;
        float f2;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i3;
        Integer num = this.d;
        Integer num2 = this.e;
        int i12 = this.c;
        if (num != null && num2 != null) {
            i12 = Math.min(num.intValue(), num2.intValue());
        } else if (num != null) {
            i12 = num.intValue();
        } else if (num2 != null) {
            i12 = num2.intValue();
        }
        int max = Math.max(i2, i3);
        if (max > i12) {
            f2 = ((float) i12) / ((float) max);
            int min = Math.min(i2, i3);
            if (min > 0) {
                float f3 = (float) min;
                int X = a24.X(f2 * f3);
                int i13 = X % 16;
                if (i13 > 0) {
                    int i14 = (X - i13) + 16;
                    if (i13 > i14 - X) {
                        f2 = ((float) i14) / f3;
                    }
                }
            }
            wia = new wia(Integer.valueOf(a24.X(((float) i10) * f2)), Integer.valueOf(a24.X(((float) i11) * f2)));
            z = true;
        } else {
            wia = new wia(Integer.valueOf(i2), Integer.valueOf(i3));
            f2 = 1.0f;
            z = false;
        }
        int intValue = ((Number) wia.a).intValue();
        int intValue2 = ((Number) wia.b).intValue();
        int max2 = Math.max(intValue, intValue2);
        int max3 = max2 < 320 ? Math.max(320 / max2, 2) : 1;
        int i15 = max3 == 1 ? max2 : max2 * max3;
        int min2 = Math.min(intValue, intValue2);
        int i16 = max3 == 1 ? min2 : min2 * max3;
        if (i15 < i12) {
            i12 = i15 - (i15 % 16);
        }
        int i17 = i12 / 16;
        int i18 = i17 * 9;
        int a2 = i18 > i16 ? iu7.a(i16, i17, 0) : iu7.a(i18, i17, i16);
        if (max3 == 1) {
            max2 = i12;
        } else if (i12 != i15) {
            max2 = a24.X(((float) i12) / ((float) max3));
        }
        if (z) {
            max2 = a24.X(((float) max2) / f2);
        }
        if (max3 == 1) {
            min2 = a2;
        } else if (a2 != i16) {
            min2 = a24.X(((float) a2) / ((float) max3));
        }
        if (z) {
            min2 = a24.X(((float) min2) / f2);
        }
        if (i10 >= i11) {
            i9 = (i10 - max2) / 2;
            i8 = (i11 - min2) / 2;
            i5 = i12;
            i4 = a2;
            i6 = min2;
            i7 = max2;
        } else {
            i9 = (i10 - min2) / 2;
            i8 = (i11 - max2) / 2;
            i4 = i12;
            i5 = a2;
            i7 = min2;
            i6 = max2;
        }
        return new zna(i9, i8, i7, i6, i5, i4, this.a);
    }

    public final Size b(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            this.b.invoke(me4.g("Wrong frame size: ", i2, i3, "x"));
            return null;
        }
        zna a2 = a(i2, i3);
        return new Size(a2.g, a2.h);
    }
}
