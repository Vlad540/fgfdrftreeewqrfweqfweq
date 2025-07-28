package defpackage;

import java.util.Collection;

/* renamed from: pi8  reason: default package */
public final class pi8 implements si8 {
    public final long a;
    public final ch2 b;
    public final Collection c;

    public pi8(long j, ch2 ch2, Collection collection) {
        this.a = j;
        this.b = ch2;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi8)) {
            return false;
        }
        pi8 pi8 = (pi8) obj;
        return this.a == pi8.a && this.b == pi8.b && hhd.f(this.c, pi8.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Add(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
