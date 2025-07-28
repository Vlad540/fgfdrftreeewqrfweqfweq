package defpackage;

/* renamed from: tu  reason: default package */
public final class tu extends uu {
    public final long a;
    public final boolean b;

    public tu(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu)) {
            return false;
        }
        tu tuVar = (tu) obj;
        return this.a == tuVar.a && this.b == tuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingPrev(time=");
        sb.append(this.a);
        sb.append(", isRemoteCaused=");
        return hr1.j(sb, this.b, ")");
    }
}
