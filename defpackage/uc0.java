package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uc0  reason: default package */
public final class uc0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public uc0(ArrayList arrayList, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f2, String str) {
        this.a = arrayList;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = f2;
        this.l = str;
    }

    public static uc0 a(ija ija) {
        byte[] bArr;
        String str;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ija ija2 = ija;
        try {
            ija2.H(4);
            int u = (ija.u() & 3) + 1;
            if (u != 3) {
                ArrayList arrayList = new ArrayList();
                int u2 = ija.u() & 31;
                int i10 = 0;
                while (true) {
                    bArr = a24.a;
                    if (i10 >= u2) {
                        break;
                    }
                    int A = ija.A();
                    int i11 = ija2.b;
                    ija2.H(A);
                    byte[] bArr2 = ija2.a;
                    byte[] bArr3 = new byte[(A + 4)];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i11, bArr3, 4, A);
                    arrayList.add(bArr3);
                    i10++;
                }
                int u3 = ija.u();
                for (int i12 = 0; i12 < u3; i12++) {
                    int A2 = ija.A();
                    int i13 = ija2.b;
                    ija2.H(A2);
                    byte[] bArr4 = ija2.a;
                    byte[] bArr5 = new byte[(A2 + 4)];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i13, bArr5, 4, A2);
                    arrayList.add(bArr5);
                }
                if (u2 > 0) {
                    yf9 A3 = pfa.A(u, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                    int i14 = A3.e;
                    int i15 = A3.f;
                    int i16 = A3.p;
                    int i17 = A3.q;
                    int i18 = A3.r;
                    int i19 = A3.s;
                    float f3 = A3.g;
                    str = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(A3.a), Integer.valueOf(A3.b), Integer.valueOf(A3.c)});
                    i4 = i17;
                    i3 = i18;
                    i2 = i19;
                    f2 = f3;
                    i8 = i15;
                    i7 = A3.h + 8;
                    i6 = A3.i + 8;
                    i5 = i16;
                    i9 = i14;
                } else {
                    i9 = -1;
                    i8 = -1;
                    i7 = -1;
                    i6 = -1;
                    i5 = -1;
                    i4 = -1;
                    i3 = -1;
                    f2 = 1.0f;
                    str = null;
                    i2 = 16;
                }
                return new uc0(arrayList, u, i9, i8, i7, i6, i5, i4, i3, i2, f2, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing AVC config");
        }
    }
}
