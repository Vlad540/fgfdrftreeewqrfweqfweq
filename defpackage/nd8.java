package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: nd8  reason: default package */
public final class nd8 {
    public final String a;
    public final int b;
    public final int c;

    public nd8(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd8)) {
            return false;
        }
        nd8 nd8 = (nd8) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || nd8.b < 0) ? TextUtils.equals(str, nd8.a) && i == nd8.c : TextUtils.equals(str, nd8.a) && i2 == nd8.b && i == nd8.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.c)});
    }
}
