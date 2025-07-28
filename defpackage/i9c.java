package defpackage;

/* renamed from: i9c  reason: default package */
public final class i9c {
    public static final i9c b = new i9c(false);
    public final boolean a;

    public i9c(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i9c.class != obj.getClass()) {
            return false;
        }
        return this.a == ((i9c) obj).a;
    }

    public final int hashCode() {
        return this.a ^ true ? 1 : 0;
    }
}
