package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: dc5  reason: default package */
public final class dc5 extends fy {
    public final long X;
    public final String Y;
    public final fy Z;
    public final long o;
    public final String w0;

    public dc5(long j, long j2, String str, fy fyVar, boolean z, String str2, boolean z2) {
        super(e00.FILE, z, z2);
        this.o = j;
        this.X = j2;
        this.Y = str;
        this.Z = fyVar;
        this.w0 = str2;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.w0;
        if (!r1g.p(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("fileId", Long.valueOf(this.o));
        }
        return a;
    }
}
