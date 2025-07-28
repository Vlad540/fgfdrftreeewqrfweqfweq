package defpackage;

/* renamed from: fb  reason: default package */
public final class fb implements kb {
    public final le1 a;
    public final boolean b;

    public fb(le1 le1, boolean z) {
        this.a = le1;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return hhd.f(this.a, fbVar.a) && this.b == fbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableCameraForParticipant(id=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        return hr1.j(sb, this.b, ")");
    }
}
