package defpackage;

/* renamed from: ajf  reason: default package */
public final class ajf extends e57 {
    public final String c;

    public ajf(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajf) && hhd.f(this.c, ((ajf) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("RequestDownloadFile(fileName="), this.c, ")");
    }
}
