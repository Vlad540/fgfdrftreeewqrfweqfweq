package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: cc5  reason: default package */
public final class cc5 {
    public final String a;
    public final Map b;

    public cc5(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static cc5 a(String str) {
        return new cc5(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc5)) {
            return false;
        }
        cc5 cc5 = (cc5) obj;
        return this.a.equals(cc5.a) && this.b.equals(cc5.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
