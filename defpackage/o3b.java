package defpackage;

/* renamed from: o3b  reason: default package */
public final class o3b {
    public static final o3b e = new o3b((String) null, (ete) null, w55.b, k11.g);
    public final String a;
    public final ete b;
    public final b65 c;
    public final k11 d;

    public o3b(String str, ete ete, b65 b65, k11 k11) {
        this.a = str;
        this.b = ete;
        this.c = b65;
        this.d = k11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3b)) {
            return false;
        }
        o3b o3b = (o3b) obj;
        return hhd.f(this.a, o3b.a) && hhd.f(this.b, o3b.b) && hhd.f(this.c, o3b.c) && hhd.f(this.d, o3b.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ete ete = this.b;
        if (ete != null) {
            i = ete.hashCode();
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousCallState(callId=" + this.a + ", recallTarget=" + this.b + ", state=" + this.c + ", chatInfo=" + this.d + ")";
    }
}
