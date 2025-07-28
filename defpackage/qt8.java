package defpackage;

/* renamed from: qt8  reason: default package */
public final class qt8 {
    public final long a;
    public final boolean b;

    public qt8(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt8)) {
            return false;
        }
        qt8 qt8 = (qt8) obj;
        return this.a == qt8.a && this.b == qt8.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputEditData(messageId=");
        sb.append(this.a);
        sb.append(", shouldInsertOriginalText=");
        return hr1.j(sb, this.b, ")");
    }
}
