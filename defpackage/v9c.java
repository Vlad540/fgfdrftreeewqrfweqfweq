package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v9c  reason: default package */
public final class v9c {
    public final List a;
    public final boolean b;

    public v9c(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9c)) {
            return false;
        }
        v9c v9c = (v9c) obj;
        return hhd.f(this.a, v9c.a) && this.b == v9c.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplyKeyboard(buttons=" + this.a + ", defaultInputDisabled=" + this.b + ")";
    }
}
