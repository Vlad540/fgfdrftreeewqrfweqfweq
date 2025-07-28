package defpackage;

/* renamed from: bqa  reason: default package */
public final class bqa implements cqa {
    public final long a;

    public bqa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqa) && this.a == ((bqa) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OpenChat(chatId="), this.a, ")");
    }
}
