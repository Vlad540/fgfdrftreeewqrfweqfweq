package defpackage;

import java.util.Objects;

/* renamed from: cn1  reason: default package */
public final class cn1 {
    public final dn1 a;
    public final y41 b;

    public cn1(dn1 dn1, y41 y41) {
        this.a = dn1;
        this.b = y41;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cn1.class != obj.getClass()) {
            return false;
        }
        cn1 cn1 = (cn1) obj;
        return this.a.equals(cn1.a) && Objects.equals(this.b, cn1.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "WaitingParticipant{waitingParticipantId=" + this.a + ", externalId=" + this.b + '}';
    }
}
