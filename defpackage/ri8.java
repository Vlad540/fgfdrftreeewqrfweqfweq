package defpackage;

import java.util.Collection;

/* renamed from: ri8  reason: default package */
public final class ri8 implements si8 {
    public final long a;
    public final ch2 b;
    public final Collection c;

    public ri8(long j, ch2 ch2, Collection collection) {
        this.a = j;
        this.b = ch2;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri8)) {
            return false;
        }
        ri8 ri8 = (ri8) obj;
        return this.a == ri8.a && this.b == ri8.b && hhd.f(this.c, ri8.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Remove(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
