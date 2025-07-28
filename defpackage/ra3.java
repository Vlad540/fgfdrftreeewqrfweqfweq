package defpackage;

import java.util.Map;

/* renamed from: ra3  reason: default package */
public final class ra3 {
    public final String a;
    public final zzc b;
    public final Map c;
    public final gze d;
    public final u72 e;

    public /* synthetic */ ra3(gze gze) {
        this((String) null, (zzc) null, (Map) null, gze, (u72) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra3)) {
            return false;
        }
        ra3 ra3 = (ra3) obj;
        return hhd.f(this.a, ra3.a) && hhd.f(this.b, ra3.b) && hhd.f(this.c, ra3.c) && hhd.f(this.d, ra3.d) && hhd.f(this.e, ra3.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        zzc zzc = this.b;
        int hashCode2 = (hashCode + (zzc == null ? 0 : zzc.hashCode())) * 31;
        Map map = this.c;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        gze gze = this.d;
        int hashCode4 = (hashCode3 + (gze == null ? 0 : gze.hashCode())) * 31;
        u72 u72 = this.e;
        if (u72 != null) {
            i = u72.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb;
        Integer num = null;
        Map map = this.c;
        if (map == null || map.isEmpty()) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append('[');
            for (Map.Entry entry : map.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                sb.append('#');
                sb.append(longValue);
                sb.append(':');
                sb.append((tn2) entry.getValue());
            }
            sb.append(']');
        }
        if (map != null) {
            num = Integer.valueOf(map.size());
        }
        return "Configuration: user=" + this.d + ", hash=" + this.a + ", chatsCount=" + num + ", chats=" + sb + ", server=" + this.b;
    }

    public ra3(String str, zzc zzc, Map map, gze gze, u72 u72) {
        this.a = str;
        this.b = zzc;
        this.c = map;
        this.d = gze;
        this.e = u72;
    }
}
