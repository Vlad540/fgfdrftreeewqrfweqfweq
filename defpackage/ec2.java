package defpackage;

/* renamed from: ec2  reason: default package */
public final class ec2 implements ic2 {
    public final long a;

    public ec2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec2) && this.a == ((ec2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("DownloadError(messageId="), this.a, ")");
    }
}
