package defpackage;

import java.util.Set;

/* renamed from: jv5  reason: default package */
public final class jv5 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final CharSequence d;
    public final boolean e;

    public jv5(Set set, Long l, boolean z, CharSequence charSequence, boolean z2) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv5)) {
            return false;
        }
        jv5 jv5 = (jv5) obj;
        return hhd.f(this.a, jv5.a) && hhd.f(this.b, jv5.b) && this.c == jv5.c && hhd.f(this.d, jv5.d) && this.e == jv5.e;
    }

    public final int hashCode() {
        int i = 0;
        Set set = this.a;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Long l = this.b;
        int f = th2.f((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return Boolean.hashCode(this.e) + ((f + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardMessagesSendData(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", shouldHideAuthor=");
        return hr1.j(sb, this.e, ")");
    }
}
