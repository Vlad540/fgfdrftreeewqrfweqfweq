package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: bp6  reason: default package */
public final class bp6 implements hhc {
    public final Map a;

    public bp6(HashMap hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bp6.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bp6) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "IdMappingsNotification{mapping=" + this.a + '}';
    }
}
