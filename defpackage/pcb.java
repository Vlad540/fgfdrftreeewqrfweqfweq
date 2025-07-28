package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: pcb  reason: default package */
public final class pcb implements scb {
    public final mge a;
    public final mge b;
    public final List c;
    public final Bundle d;

    public pcb(mge mge, mge mge2, List list, Bundle bundle) {
        this.a = mge;
        this.b = mge2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcb)) {
            return false;
        }
        pcb pcb = (pcb) obj;
        return hhd.f(this.a, pcb.a) && hhd.f(this.b, pcb.b) && hhd.f(this.c, pcb.c) && hhd.f(this.d, pcb.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mge mge = this.b;
        return this.d.hashCode() + c3d.f(this.c, (hashCode + (mge == null ? 0 : mge.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowConfirmationDialog(title=" + this.a + ", subtitle=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
