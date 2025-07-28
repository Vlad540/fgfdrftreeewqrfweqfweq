package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: yo  reason: default package */
public final class yo extends at7 {
    public final /* synthetic */ int B0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo(int i) {
        super(17);
        this.B0 = i;
    }

    public static w05 Z(ija ija) {
        String p = ija.p();
        p.getClass();
        String p2 = ija.p();
        p2.getClass();
        return new w05(p, p2, ija.o(), ija.o(), Arrays.copyOfRange(ija.a, ija.b, ija.c));
    }

    public final a39 m(f39 f39, ByteBuffer byteBuffer) {
        int i = 2;
        switch (this.B0) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                wx1 wx1 = new wx1(byteBuffer.array(), byteBuffer.limit(), 2, (byte) 0);
                int i2 = 12;
                wx1.t(12);
                int f = (wx1.f() + wx1.i(12)) - 4;
                wx1.t(44);
                wx1.u(wx1.i(12));
                wx1.t(16);
                ArrayList arrayList = new ArrayList();
                while (wx1.f() < f) {
                    wx1.t(48);
                    int i3 = wx1.i(8);
                    wx1.t(4);
                    int f2 = wx1.f() + wx1.i(i2);
                    String str = null;
                    String str2 = null;
                    while (wx1.f() < f2) {
                        int i4 = wx1.i(8);
                        int i5 = wx1.i(8);
                        int f3 = wx1.f() + i5;
                        if (i4 == i) {
                            int i6 = wx1.i(16);
                            wx1.t(8);
                            if (i6 == 3) {
                                while (wx1.f() < f3) {
                                    int i7 = wx1.i(8);
                                    Charset charset = f22.a;
                                    byte[] bArr = new byte[i7];
                                    wx1.l(i7, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i8 = wx1.i(8);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        wx1.u(wx1.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i4 == 21) {
                            Charset charset2 = f22.a;
                            byte[] bArr2 = new byte[i5];
                            wx1.l(i5, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        wx1.q(f3 * 8);
                        i = 2;
                    }
                    wx1.q(f2 * 8);
                    if (!(str == null || str2 == null)) {
                        arrayList.add(new wo(i3, str.concat(str2)));
                    }
                    i = 2;
                    i2 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new a39((List) arrayList);
            default:
                return new a39(Z(new ija(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
