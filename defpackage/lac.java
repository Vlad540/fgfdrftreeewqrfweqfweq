package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: lac  reason: default package */
public final class lac {
    public dv0 a;
    public final sm6 b;
    public final String c;
    public final ye6 d;
    public final d8 e;
    public final Map f;

    public lac(sm6 sm6, String str, ye6 ye6, d8 d8Var, Map map) {
        this.b = sm6;
        this.c = str;
        this.d = ye6;
        this.e = d8Var;
        this.f = map;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [s86, java.lang.Object] */
    public final s86 a() {
        ? obj = new Object();
        obj.X = new LinkedHashMap();
        obj.a = this.b;
        obj.b = this.c;
        obj.o = this.e;
        Map map = this.f;
        obj.X = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        obj.c = this.d.c();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        ye6 ye6 = this.d;
        if (ye6.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : ye6) {
                int i2 = i + 1;
                if (i >= 0) {
                    wia wia = (wia) next;
                    String str = (String) wia.a;
                    String str2 = (String) wia.b;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i = i2;
                } else {
                    p23.G();
                    throw null;
                }
            }
            sb.append(']');
        }
        Map map = this.f;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
