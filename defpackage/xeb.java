package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: xeb  reason: default package */
public final class xeb extends cfb {
    public final mge a;
    public final mge b;
    public final List c;
    public final Bundle d;

    public xeb(mge mge, mge mge2, List list, Bundle bundle) {
        this.a = mge;
        this.b = mge2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeb)) {
            return false;
        }
        xeb xeb = (xeb) obj;
        return hhd.f(this.a, xeb.a) && hhd.f(this.b, xeb.b) && hhd.f(this.c, xeb.c) && hhd.f(this.d, xeb.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        mge mge = this.b;
        int f = c3d.f(this.c, (hashCode + (mge == null ? 0 : mge.hashCode())) * 31, 31);
        Bundle bundle = this.d;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return f + i;
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
