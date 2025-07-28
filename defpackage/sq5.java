package defpackage;

/* renamed from: sq5  reason: default package */
public final class sq5 implements pg7 {
    public final int a;

    public sq5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq5) && this.a == ((sq5) obj).a;
    }

    public final long getItemId() {
        return 9223372036854775806L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int l() {
        return this.a;
    }

    public final String toString() {
        return wn6.j(new StringBuilder("FolderMemberAddItem(viewType="), this.a, ")");
    }
}
