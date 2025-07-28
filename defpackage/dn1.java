package defpackage;

import java.util.Objects;

/* renamed from: dn1  reason: default package */
public final class dn1 {
    public final long a;
    public final ge1 b;

    public dn1(ge1 ge1, long j) {
        this.a = j;
        this.b = ge1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dn1.class != obj.getClass()) {
            return false;
        }
        dn1 dn1 = (dn1) obj;
        return this.a == dn1.a && Objects.equals(this.b, dn1.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "WaitingParticipantId{addedTs=" + this.a + ", participantId=" + this.b + '}';
    }
}
