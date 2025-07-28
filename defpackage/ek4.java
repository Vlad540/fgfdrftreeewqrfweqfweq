package defpackage;

/* renamed from: ek4  reason: default package */
public final class ek4 implements gk4 {
    public final int a;

    public ek4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek4) && this.a == ((ek4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("DownloadFailed(textFailRes="), this.a, ")");
    }
}
