package defpackage;

/* renamed from: ufd  reason: default package */
public final class ufd implements vfd {
    public final pfd a;

    public ufd(pfd pfd) {
        this.a = pfd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufd) && hhd.f(this.a, ((ufd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(command=" + this.a + ")";
    }
}
