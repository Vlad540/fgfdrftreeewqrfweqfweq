package defpackage;

/* renamed from: vk1  reason: default package */
public final class vk1 extends ete {
    public final long c;
    public final boolean d;

    public vk1(long j, boolean z) {
        this.c = j;
        this.d = z;
    }

    public final boolean P() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk1)) {
            return false;
        }
        vk1 vk1 = (vk1) obj;
        return this.c == vk1.c && this.d == vk1.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(userId=");
        sb.append(this.c);
        sb.append(", isVideo=");
        return hr1.j(sb, this.d, ")");
    }
}
