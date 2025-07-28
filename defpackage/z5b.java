package defpackage;

/* renamed from: z5b  reason: default package */
public final class z5b extends g6b {
    public final String b;

    public z5b(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5b) && hhd.f(this.b, ((z5b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("CopyToClipboard(link="), this.b, ")");
    }
}
