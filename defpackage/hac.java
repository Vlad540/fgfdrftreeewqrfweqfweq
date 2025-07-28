package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hac  reason: default package */
public final class hac extends jac {
    public final String Y;
    public final mxb Z;
    public final ea6 w0;

    public hac(long j, vu5 vu5, List list, tuc tuc, ArrayList arrayList) {
        super(vu5, list, tuc, arrayList);
        Uri.parse(((gj0) list.get(0)).a);
        long j2 = tuc.e;
        ea6 ea6 = null;
        mxb mxb = j2 <= 0 ? null : new mxb(tuc.d, (String) null, j2);
        this.Z = mxb;
        this.Y = null;
        this.w0 = mxb == null ? new ea6(27, new mxb(0, (String) null, -1)) : ea6;
    }

    public final String a() {
        return this.Y;
    }

    public final vy3 c() {
        return this.w0;
    }

    public final mxb d() {
        return this.Z;
    }
}
