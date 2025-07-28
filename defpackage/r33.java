package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: r33  reason: default package */
public final class r33 {
    public final List a;

    public r33(List list) {
        this.a = list;
    }

    public final String a(Context context) {
        return o23.c0(this.a, "\n", (String) null, (String) null, new nc0(context, 2), 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r33) && hhd.f(this.a, ((r33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CombinedError(errors=" + this.a + ")";
    }
}
