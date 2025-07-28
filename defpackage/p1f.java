package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: p1f  reason: default package */
public final class p1f extends fy {
    public final String A0;
    public final byte[] B0;
    public final Long C0;
    public final String D0;
    public final m2f E0;
    public final Integer X;
    public final Long Y;
    public final String Z;
    public final Long o;
    public final Integer w0;
    public final Integer x0;
    public final boolean y0;
    public final String z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1f(long j, int i, Long l, String str, Integer num, Integer num2, boolean z, String str2, String str3, byte[] bArr, Long l2, boolean z2, String str4, m2f m2f, boolean z3) {
        super(e00.VIDEO, z2, z3);
        this.o = Long.valueOf(j);
        this.X = Integer.valueOf(i);
        this.Y = l;
        this.Z = str;
        this.w0 = num;
        this.x0 = num2;
        this.y0 = z;
        this.z0 = str2;
        this.A0 = str3;
        this.C0 = l2;
        this.B0 = bArr;
        this.D0 = str4;
        this.E0 = m2f;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.D0;
        if (!r1g.p(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("videoId", this.o);
        }
        a.put("videoType", this.X);
        return a;
    }
}
