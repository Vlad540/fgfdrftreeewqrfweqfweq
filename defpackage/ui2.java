package defpackage;

import java.util.Map;

/* renamed from: ui2  reason: default package */
public final class ui2 {
    public static final ui2 c = new ui2(0, iw4.a);
    public final Map a;
    public final int b;

    public ui2(int i, Map map) {
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui2)) {
            return false;
        }
        ui2 ui2 = (ui2) obj;
        return hhd.f(this.a, ui2.a) && this.b == ui2.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return ui2.class.getSimpleName().concat(".Empty");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sb.getClass().getSimpleName());
        sb.append('(');
        sb.append("size=");
        Map map = this.a;
        sb.append(map.size());
        sb.append(",totalUnreadMessagesCount=");
        sb.append(this.b);
        sb.append(",notifications=" + map);
        sb.append(')');
        return sb.toString();
    }
}
