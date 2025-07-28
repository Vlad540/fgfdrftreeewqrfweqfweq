package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: nod  reason: default package */
public final class nod implements hhc {
    public List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nod.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((nod) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "StalledParticipantsNotification{participantIds=" + this.a + '}';
    }
}
