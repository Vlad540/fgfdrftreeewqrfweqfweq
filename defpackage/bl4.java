package defpackage;

/* renamed from: bl4  reason: default package */
public final class bl4 implements dl4 {
    public final boolean a;

    public bl4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl4) && this.a == ((bl4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("FileDownloadInterrupted(shouldRetry="), this.a, ")");
    }
}
