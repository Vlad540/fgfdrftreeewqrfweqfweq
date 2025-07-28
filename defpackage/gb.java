package defpackage;

/* renamed from: gb  reason: default package */
public final class gb implements kb {
    public final le1 a;
    public final boolean b;

    public gb(le1 le1, boolean z) {
        this.a = le1;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return hhd.f(this.a, gbVar.a) && this.b == gbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableMicForParticipant(id=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        return hr1.j(sb, this.b, ")");
    }
}
