package defpackage;

import java.util.List;

/* renamed from: tp5  reason: default package */
public final class tp5 implements up5 {
    public final List a;

    public tp5(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp5) && hhd.f(this.a, ((tp5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPicker(includes=" + this.a + ")";
    }
}
