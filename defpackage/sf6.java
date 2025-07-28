package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: sf6  reason: default package */
public final class sf6 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final String j;

    public sf6(List list, int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8, String str) {
        this.a = list;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = f2;
        this.i = i8;
        this.j = str;
    }

    public static sf6 a(ija ija) {
        int i2;
        int i3;
        ija ija2 = ija;
        try {
            ija2.H(21);
            int u = ija.u() & 3;
            int u2 = ija.u();
            int i4 = ija2.b;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < u2; i7++) {
                ija2.H(1);
                int A = ija.A();
                for (int i8 = 0; i8 < A; i8++) {
                    int A2 = ija.A();
                    i6 += A2 + 4;
                    ija2.H(A2);
                }
            }
            ija2.G(i4);
            byte[] bArr = new byte[i6];
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            float f2 = 1.0f;
            String str = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < u2) {
                int u3 = ija.u() & 63;
                int A3 = ija.A();
                int i17 = i5;
                while (i17 < A3) {
                    int A4 = ija.A();
                    int i18 = u2;
                    System.arraycopy(pfa.b, i5, bArr, i16, 4);
                    int i19 = i16 + 4;
                    System.arraycopy(ija2.a, ija2.b, bArr, i19, A4);
                    if (u3 == 33 && i17 == 0) {
                        uf9 y = pfa.y(i19, bArr, i19 + A4);
                        int i20 = y.e + 8;
                        i10 = y.f + 8;
                        i11 = y.m;
                        int i21 = y.n;
                        int i22 = y.o;
                        float f3 = y.k;
                        int i23 = y.l;
                        i3 = u3;
                        i2 = A3;
                        i9 = i20;
                        str = a24.e(y.a, y.b, y.c, y.d, y.g, y.h);
                        float f4 = f3;
                        i13 = i22;
                        i12 = i21;
                        i14 = i23;
                        f2 = f4;
                    } else {
                        i3 = u3;
                        i2 = A3;
                    }
                    i16 = i19 + A4;
                    ija2.H(A4);
                    i17++;
                    u2 = i18;
                    u3 = i3;
                    A3 = i2;
                    i5 = 0;
                }
                int i24 = u2;
                i15++;
                i5 = 0;
            }
            return new sf6(i6 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), u + 1, i9, i10, i11, i12, i13, f2, i14, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing HEVC config");
        }
    }
}
