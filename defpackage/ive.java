package defpackage;

import java.util.Map;
import java.util.Objects;

/* renamed from: ive  reason: default package */
public final class ive implements khc {
    public final Map a;

    public ive(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ive.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ive) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "UpdateDisplayLayoutCommandV2Response{participantsToErrorMap=" + this.a + '}';
    }
}
