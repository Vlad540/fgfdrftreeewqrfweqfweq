package defpackage;

import java.util.Arrays;

/* renamed from: tee  reason: default package */
public final class tee implements nk {
    public static final tee b = new tee((String) null);
    public final String a;

    public /* synthetic */ tee(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tee)) {
            return false;
        }
        return x87.F(this.a, ((tee) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
