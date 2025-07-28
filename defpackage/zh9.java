package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: zh9  reason: default package */
public final class zh9 implements hhc {
    public final Map a;

    public zh9(HashMap hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zh9.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zh9) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "NetworkStatusNotification{networkStatus=" + this.a + '}';
    }
}
