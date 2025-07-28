package defpackage;

/* renamed from: z22  reason: default package */
public final class z22 {
    public final long a;
    public final String b;

    public z22(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z22)) {
            return false;
        }
        z22 z22 = (z22) obj;
        return this.a == z22.a && hhd.f(this.b, z22.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatAndFolderCrossRef(chatId=");
        sb.append(this.a);
        sb.append(", folderId=");
        return wn6.l(sb, this.b, ")");
    }
}
