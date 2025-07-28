package defpackage;

import java.util.List;

/* renamed from: hv3  reason: default package */
public final class hv3 {
    public final List a;
    public final List b;

    public hv3(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hv3.class != obj.getClass()) {
            return false;
        }
        hv3 hv3 = (hv3) obj;
        List list = hv3.a;
        List list2 = this.a;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        List list3 = hv3.b;
        List list4 = this.b;
        return list4 != null ? list4.equals(list3) : list3 == null;
    }

    public final int hashCode() {
        int i = 0;
        List list = this.a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CountryCodeProxiesEntry{countries=" + this.a + ", connectionHosts=" + this.b + '}';
    }
}
