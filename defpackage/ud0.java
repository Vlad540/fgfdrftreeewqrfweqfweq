package defpackage;

import java.util.List;

/* renamed from: ud0  reason: default package */
public final class ud0 {
    public static final List b = p23.B(new String[]{"space_light", "gradient_light"});
    public static final List c = p23.B(new String[]{"space_dark", "gradient_dark"});
    public final String a;

    public ud0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud0) && hhd.f(this.a, ((ud0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("BackgroundNameId(name="), this.a, ")");
    }
}
