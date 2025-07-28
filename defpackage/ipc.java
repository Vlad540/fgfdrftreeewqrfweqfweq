package defpackage;

/* renamed from: ipc  reason: default package */
public final class ipc {
    public final long a;
    public final long b;
    public final ryb c;

    public ipc(long j, long j2, ryb ryb) {
        this.a = j;
        this.b = j2;
        this.c = ryb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipc)) {
            return false;
        }
        ipc ipc = (ipc) obj;
        return this.a == ipc.a && this.b == ipc.b && hhd.f(this.c, ipc.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ReactionInfo(messageServerId=" + this.a + ", messageTime=" + this.b + ", reaction=" + this.c + ")";
    }
}
