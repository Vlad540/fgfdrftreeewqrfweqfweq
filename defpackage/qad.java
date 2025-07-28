package defpackage;

import java.util.HashMap;

/* renamed from: qad  reason: default package */
public final class qad extends fy {
    public final String X;
    public final String Y;
    public final String Z;
    public final long o;
    public final String w0;
    public final fpa x0;
    public final fy y0;

    public qad(long j, String str, String str2, String str3, String str4, fpa fpa, fy fyVar, boolean z, boolean z2) {
        super(e00.SHARE, z, z2);
        this.o = j;
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.w0 = str4;
        this.x0 = fpa;
        this.y0 = fyVar;
    }

    public final HashMap a() {
        HashMap a = super.a();
        a.put("shareId", Long.valueOf(this.o));
        a.put("url", this.X);
        return a;
    }
}
