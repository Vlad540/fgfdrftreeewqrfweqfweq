package defpackage;

/* renamed from: wab  reason: default package */
public final class wab extends abb {
    public final String a;

    public wab(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wab) && hhd.f(this.a, ((wab) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("CopyToClipboard(text="), this.a, ")");
    }
}
