package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pz7  reason: default package */
public final class pz7 implements wz7 {
    public final CharSequence a;
    public final List b;
    public final boolean c;

    public pz7(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz7)) {
            return false;
        }
        pz7 pz7 = (pz7) obj;
        return hhd.f(this.a, pz7.a) && hhd.f(this.b, pz7.b) && this.c == pz7.c;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishEditMessage(text=");
        sb.append(this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", mediaChanged=");
        return hr1.j(sb, this.c, ")");
    }
}
