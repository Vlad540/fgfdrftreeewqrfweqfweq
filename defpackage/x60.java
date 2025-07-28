package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: x60  reason: default package */
public final class x60 extends lbe {
    public final Map c;
    public final List o;

    public x60(LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.c = linkedHashMap;
        this.o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        x60 x60 = (x60) obj;
        return hhd.f(this.c, x60.c) && hhd.f(this.o, x60.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        String str;
        Map map = this.c;
        if (map == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("{");
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append(r1g.v((CharSequence) entry.getValue()));
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            str = sb.toString();
        }
        return wn6.i("{tokenTypes=", str, "}");
    }
}
