package defpackage;

/* renamed from: ph7  reason: default package */
public final class ph7 {
    public final Object a;
    public ui5 b = new ui5(1);
    public boolean c;
    public boolean d;

    public ph7(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ph7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ph7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
