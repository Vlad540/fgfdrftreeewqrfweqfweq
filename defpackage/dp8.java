package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: dp8  reason: default package */
public final class dp8 implements Serializable {
    public final short X;
    public final Map Y;
    public final long a;
    public final String b;
    public final hp8 c;
    public final short o;

    public dp8(long j, String str, hp8 hp8, short s, short s2, Map map) {
        this.a = j;
        this.b = str;
        this.c = hp8;
        this.o = s;
        this.X = s2;
        this.Y = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp8)) {
            return false;
        }
        dp8 dp8 = (dp8) obj;
        return this.a == dp8.a && hhd.f(this.b, dp8.b) && this.c == dp8.c && this.o == dp8.o && this.X == dp8.X && hhd.f(this.Y, dp8.Y);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = (Short.hashCode(this.X) + ((Short.hashCode(this.o) + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31;
        Map map = this.Y;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "MessageElement(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + this.o + ", length=" + this.X + ", attributes=" + this.Y + ")";
    }
}
