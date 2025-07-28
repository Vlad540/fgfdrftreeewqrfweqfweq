package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: rf6  reason: default package */
public final class rf6 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public rf6(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static rf6 a(yze yze) {
        int i;
        yze yze2 = yze;
        try {
            yze2.I(21);
            int v = yze.v() & 3;
            int v2 = yze.v();
            int i2 = yze2.b;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < v2; i5++) {
                yze2.I(1);
                int A = yze.A();
                for (int i6 = 0; i6 < A; i6++) {
                    int A2 = yze.A();
                    i4 += A2 + 4;
                    yze2.I(A2);
                }
            }
            yze2.H(i2);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < v2) {
                int v3 = yze.v() & 127;
                int A3 = yze.A();
                int i9 = i3;
                while (i9 < A3) {
                    int A4 = yze.A();
                    System.arraycopy(kjd.l, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(yze2.a, yze2.b, bArr, i10, A4);
                    if (v3 == 33 && i9 == 0) {
                        tf9 G = kjd.G(i10, bArr, i10 + A4);
                        i = v2;
                        str = ez3.g(G.a, G.b, G.c, G.d, G.e, G.f);
                        f = G.g;
                    } else {
                        i = v2;
                    }
                    i8 = i10 + A4;
                    yze2.I(A4);
                    i9++;
                    v2 = i;
                    i3 = 0;
                }
                int i11 = v2;
                i7++;
                i3 = 0;
            }
            return new rf6(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), v + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing HEVC config");
        }
    }
}
