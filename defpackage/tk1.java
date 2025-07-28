package defpackage;

/* renamed from: tk1  reason: default package */
public final class tk1 extends ete {
    public final long c;
    public final boolean d;

    public tk1(long j, boolean z) {
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
        if (!(obj instanceof tk1)) {
            return false;
        }
        tk1 tk1 = (tk1) obj;
        return this.c == tk1.c && this.d == tk1.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(chatId=");
        sb.append(this.c);
        sb.append(", isVideo=");
        return hr1.j(sb, this.d, ")");
    }
}
