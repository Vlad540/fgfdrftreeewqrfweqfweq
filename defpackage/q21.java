package defpackage;

/* renamed from: q21  reason: default package */
public final class q21 implements r21 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public q21(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21 = (q21) obj;
        return this.a == q21.a && this.b == q21.b && this.c == q21.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + th2.f(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(userId=");
        sb.append(this.a);
        sb.append(", isVideoEnabled=");
        sb.append(this.b);
        sb.append(", isAudioEnabled=");
        return hr1.j(sb, this.c, ")");
    }
}
