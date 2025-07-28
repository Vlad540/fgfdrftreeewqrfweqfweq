package defpackage;

/* renamed from: vwc  reason: default package */
public final class vwc {
    public final long a;
    public final int b;

    public vwc(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwc)) {
            return false;
        }
        vwc vwc = (vwc) obj;
        return this.a == vwc.a && this.b == vwc.b;
    }

    public final int hashCode() {
        return hr1.t(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedMention(id=");
        sb.append(this.a);
        sb.append(", selectedMentionType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "NAME" : "SHORTLINK");
        sb.append(")");
        return sb.toString();
    }
}
