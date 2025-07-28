package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: g21  reason: default package */
public final class g21 {
    public final Bundle a;
    public final List b;
    public final Map c;
    public final Point d;

    public g21(Bundle bundle, lg7 lg7, LinkedHashMap linkedHashMap, Point point) {
        this.a = bundle;
        this.b = lg7;
        this.c = linkedHashMap;
        this.d = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g21)) {
            return false;
        }
        g21 g21 = (g21) obj;
        return hhd.f(this.a, g21.a) && hhd.f(this.b, g21.b) && hhd.f(this.c, g21.c) && hhd.f(this.d, g21.d);
    }

    public final int hashCode() {
        int i = 0;
        Bundle bundle = this.a;
        int hashCode = (this.c.hashCode() + c3d.f(this.b, (bundle == null ? 0 : bundle.hashCode()) * 31, 31)) * 31;
        Point point = this.d;
        if (point != null) {
            i = point.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CallContextMenuInfo(bundle=" + this.a + ", actions=" + this.b + ", statParam=" + this.c + ", anchor=" + this.d + ")";
    }
}
