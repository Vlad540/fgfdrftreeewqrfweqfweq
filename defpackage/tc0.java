package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tc0  reason: default package */
public final class tc0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public tc0(ArrayList arrayList, int i, int i2, int i3, float f2, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
        this.f = str;
    }

    public static tc0 a(yze yze) {
        byte[] bArr;
        String str;
        float f2;
        int i;
        int i2;
        try {
            yze.I(4);
            int v = (yze.v() & 3) + 1;
            if (v != 3) {
                ArrayList arrayList = new ArrayList();
                int v2 = yze.v() & 31;
                int i3 = 0;
                while (true) {
                    bArr = ez3.a;
                    if (i3 >= v2) {
                        break;
                    }
                    int A = yze.A();
                    int i4 = yze.b;
                    yze.I(A);
                    byte[] bArr2 = yze.a;
                    byte[] bArr3 = new byte[(A + 4)];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i4, bArr3, 4, A);
                    arrayList.add(bArr3);
                    i3++;
                }
                int v3 = yze.v();
                for (int i5 = 0; i5 < v3; i5++) {
                    int A2 = yze.A();
                    int i6 = yze.b;
                    yze.I(A2);
                    byte[] bArr4 = yze.a;
                    byte[] bArr5 = new byte[(A2 + 4)];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i6, bArr5, 4, A2);
                    arrayList.add(bArr5);
                }
                if (v2 > 0) {
                    xf9 H = kjd.H(v, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                    int i7 = H.e;
                    int i8 = H.f;
                    float f3 = H.g;
                    str = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(H.a), Integer.valueOf(H.b), Integer.valueOf(H.c)});
                    i2 = i7;
                    i = i8;
                    f2 = f3;
                } else {
                    i2 = -1;
                    i = -1;
                    f2 = 1.0f;
                    str = null;
                }
                return new tc0(arrayList, v, i2, i, f2, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing AVC config");
        }
    }
}
