package defpackage;

import java.util.List;

/* renamed from: vbb  reason: default package */
public final class vbb extends ncb {
    public final List a;
    public final List b;
    public final boolean c;

    public vbb(List list, List list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbb)) {
            return false;
        }
        vbb vbb = (vbb) obj;
        return hhd.f(this.a, vbb.a) && hhd.f(this.b, vbb.b) && this.c == vbb.c;
    }

    public final long getItemId() {
        return (long) 1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + c3d.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonsStack(buttons=");
        sb.append(this.a);
        sb.append(", contextMenuButtons=");
        sb.append(this.b);
        sb.append(", isMoreButtonEnabled=");
        return hr1.j(sb, this.c, ")");
    }
}
