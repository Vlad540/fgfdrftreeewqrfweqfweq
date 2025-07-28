package defpackage;

/* renamed from: oh7  reason: default package */
public final class oh7 {
    public final Object a;
    public ui5 b = new ui5(0);
    public boolean c;

    public oh7(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oh7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((oh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
