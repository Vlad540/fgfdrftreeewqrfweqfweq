package defpackage;

import java.util.List;

/* renamed from: afb  reason: default package */
public final class afb extends cfb {
    public final List a;

    public afb(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afb) && hhd.f(this.a, ((afb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowPhoneActionsMenu(actions=" + this.a + ")";
    }
}
