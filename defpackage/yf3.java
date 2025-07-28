package defpackage;

import java.util.HashMap;

/* renamed from: yf3  reason: default package */
public final class yf3 extends fy {
    public final long X;
    public final String Y;
    public final String Z;
    public final String o;
    public final String w0;
    public final String x0;
    public final String y0;

    public yf3(String str, long j, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        super(e00.CONTACT, z, z2);
        this.o = str;
        this.X = j;
        this.Y = str2;
        this.x0 = str5;
        this.y0 = str6;
        this.Z = str3;
        this.w0 = str4;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.o;
        if (!r1g.p(str)) {
            a.put("vcfBody", str);
        }
        long j = this.X;
        if (j != 0) {
            a.put("contactId", Long.valueOf(j));
        }
        return a;
    }
}
