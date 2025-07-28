package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: qsd  reason: default package */
public final class qsd extends fy {
    public final String A0;
    public final int B0;
    public final long C0;
    public final String D0;
    public final boolean E0;
    public final int F0;
    public final String G0;
    public final int X;
    public final int Y;
    public final String Z;
    public final long o;
    public final long w0;
    public final String x0;
    public final String y0;
    public final List z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qsd(long j, int i, int i2, String str, long j2, String str2, String str3, List list, String str4, int i3, long j3, String str5, boolean z, int i4, boolean z2, boolean z3, String str6) {
        super(e00.STICKER, z2, z3);
        this.o = j;
        this.X = i;
        this.Y = i2;
        this.Z = str;
        this.w0 = j2;
        this.x0 = str2;
        this.y0 = str3;
        this.z0 = list;
        this.A0 = str4;
        this.B0 = i3;
        this.C0 = j3;
        this.D0 = str5;
        this.E0 = z;
        this.F0 = i4;
        this.G0 = str6;
    }

    public final HashMap a() {
        HashMap a = super.a();
        a.put("stickerId", Long.valueOf(this.o));
        return a;
    }
}
