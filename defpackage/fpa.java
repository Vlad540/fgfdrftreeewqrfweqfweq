package defpackage;

import java.util.HashMap;

/* renamed from: fpa  reason: default package */
public final class fpa extends fy {
    public final Long A0;
    public final String B0;
    public String X;
    public final Integer Y;
    public final Integer Z;
    public final String o;
    public final boolean w0;
    public final byte[] x0;
    public final String y0;
    public final String z0;

    public fpa(String str, String str2, Integer num, Integer num2, boolean z, byte[] bArr, Long l, String str3, String str4, boolean z2, boolean z3, String str5) {
        super(e00.PHOTO, z2, z3);
        this.o = str;
        this.X = str2;
        this.Y = num;
        this.Z = num2;
        this.w0 = z;
        this.x0 = bArr;
        this.A0 = l;
        this.z0 = str3;
        this.y0 = str4;
        this.B0 = str5;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.y0;
        if (!r1g.p(str)) {
            a.put("photoToken", str);
        }
        return a;
    }
}
