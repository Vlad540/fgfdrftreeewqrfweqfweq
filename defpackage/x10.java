package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: x10  reason: default package */
public final class x10 implements hhc {
    public List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x10.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((x10) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "AudioActivityNotification{participantIds=" + this.a + '}';
    }
}
