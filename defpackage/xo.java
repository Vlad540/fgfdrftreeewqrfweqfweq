package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xo  reason: default package */
public final class xo extends xs7 {
    public final /* synthetic */ int E;

    public /* synthetic */ xo(int i) {
        this.E = i;
    }

    public static v05 V(yze yze) {
        String q = yze.q();
        q.getClass();
        String q2 = yze.q();
        q2.getClass();
        return new v05(q, q2, yze.p(), yze.p(), Arrays.copyOfRange(yze.a, yze.b, yze.c));
    }

    public final y29 k(e39 e39, ByteBuffer byteBuffer) {
        switch (this.E) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                wx1 wx1 = new wx1(byteBuffer.array(), byteBuffer.limit(), 1, (byte) 0);
                int i = 12;
                wx1.t(12);
                int f = (wx1.f() + wx1.i(12)) - 4;
                wx1.t(44);
                wx1.u(wx1.i(12));
                wx1.t(16);
                ArrayList arrayList = new ArrayList();
                while (wx1.f() < f) {
                    wx1.t(48);
                    int i2 = wx1.i(8);
                    wx1.t(4);
                    int f2 = wx1.f() + wx1.i(i);
                    String str = null;
                    String str2 = null;
                    while (wx1.f() < f2) {
                        int i3 = wx1.i(8);
                        int i4 = wx1.i(8);
                        int f3 = wx1.f() + i4;
                        if (i3 == 2) {
                            int i5 = wx1.i(16);
                            wx1.t(8);
                            if (i5 == 3) {
                                while (wx1.f() < f3) {
                                    int i6 = wx1.i(8);
                                    Charset charset = f22.a;
                                    byte[] bArr = new byte[i6];
                                    wx1.l(i6, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i7 = wx1.i(8);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        wx1.u(wx1.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i3 == 21) {
                            Charset charset2 = f22.a;
                            byte[] bArr2 = new byte[i4];
                            wx1.l(i4, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        wx1.q(f3 * 8);
                    }
                    wx1.q(f2 * 8);
                    if (!(str == null || str2 == null)) {
                        arrayList.add(new vo(i2, str2.length() != 0 ? str.concat(str2) : new String(str)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new y29((List) arrayList);
            default:
                return new y29(V(new yze(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
