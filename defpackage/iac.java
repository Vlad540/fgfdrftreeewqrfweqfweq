package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iac  reason: default package */
public final class iac extends kac {
    public final String Y;
    public final nxb Z;
    public final za6 w0;

    public iac(long j, xu5 xu5, List list, uuc uuc, ArrayList arrayList) {
        super(xu5, list, uuc, arrayList);
        Uri.parse(((hj0) list.get(0)).a);
        long j2 = uuc.e;
        za6 za6 = null;
        nxb nxb = j2 <= 0 ? null : new nxb(uuc.d, (String) null, j2);
        this.Z = nxb;
        this.Y = null;
        this.w0 = nxb == null ? new za6((Object) new nxb(0, (String) null, -1)) : za6;
    }

    public final String a() {
        return this.Y;
    }

    public final wy3 c() {
        return this.w0;
    }

    public final nxb d() {
        return this.Z;
    }
}
