package defpackage;

import java.util.Objects;

/* renamed from: gmd  reason: default package */
public final class gmd implements hhc {
    public ge1 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gmd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gmd) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "SpeakerChangedNotification{speaker=" + this.a + '}';
    }
}
