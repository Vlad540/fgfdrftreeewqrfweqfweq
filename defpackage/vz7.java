package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vz7  reason: default package */
public final class vz7 implements wz7 {
    public final CharSequence a;
    public final List b;
    public final boolean c;

    public vz7(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz7)) {
            return false;
        }
        vz7 vz7 = (vz7) obj;
        return hhd.f(this.a, vz7.a) && hhd.f(this.b, vz7.b) && this.c == vz7.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + c3d.f(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMedia(caption=");
        sb.append(this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", sendAsFile=");
        return hr1.j(sb, this.c, ")");
    }
}
