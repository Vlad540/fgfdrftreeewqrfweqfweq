package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: y10  reason: default package */
public final class y10 extends fy {
    public final String X;
    public final Long Y;
    public final byte[] Z;
    public final Long o;
    public final String w0;
    public final String x0;
    public final int y0;

    public y10(long j, String str, long j2, byte[] bArr, boolean z, String str2, String str3, boolean z2, int i) {
        super(e00.AUDIO, z, z2);
        this.Y = Long.valueOf(j2);
        this.o = Long.valueOf(j);
        this.X = str;
        this.Z = bArr;
        this.w0 = str2;
        this.x0 = str3;
        this.y0 = i;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.w0;
        if (!r1g.p(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("audioId", this.o);
        }
        return a;
    }
}
