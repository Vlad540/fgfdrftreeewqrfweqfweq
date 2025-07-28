package defpackage;

/* renamed from: mk4  reason: default package */
public final class mk4 implements pk4 {
    public final boolean a;

    public mk4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk4) && this.a == ((mk4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("FileDownloadInterrupted(shouldRetry="), this.a, ")");
    }
}
