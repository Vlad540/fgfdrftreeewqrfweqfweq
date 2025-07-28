package defpackage;

/* renamed from: su  reason: default package */
public final class su extends uu {
    public final long a;
    public final boolean b;

    public su(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        return this.a == suVar.a && this.b == suVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingNext(time=");
        sb.append(this.a);
        sb.append(", isRemoteCaused=");
        return hr1.j(sb, this.b, ")");
    }
}
