package defpackage;

import java.util.List;

/* renamed from: zeb  reason: default package */
public final class zeb extends cfb {
    public final long a;
    public final List b;
    public final int c;

    public zeb(long j, lg7 lg7, int i) {
        this.a = j;
        this.b = lg7;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeb)) {
            return false;
        }
        zeb zeb = (zeb) obj;
        return this.a == zeb.a && hhd.f(this.b, zeb.b) && this.c == zeb.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.f(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "ShowParticipantActionsMenu(id=" + this.a + ", actions=" + this.b + ", position=" + this.c + ")";
    }
}
