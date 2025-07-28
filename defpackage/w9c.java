package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w9c  reason: default package */
public final class w9c implements Serializable {
    public final List a;

    public w9c(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9c) && hhd.f(this.a, ((w9c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplyKeyboard(buttonAttaches=" + this.a + ")";
    }
}
