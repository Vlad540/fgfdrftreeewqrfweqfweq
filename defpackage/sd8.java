package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: sd8  reason: default package */
public final class sd8 {
    public final String a;
    public final int b;
    public final int c;

    public sd8(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd8)) {
            return false;
        }
        sd8 sd8 = (sd8) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || sd8.b < 0) ? TextUtils.equals(str, sd8.a) && i == sd8.c : TextUtils.equals(str, sd8.a) && i2 == sd8.b && i == sd8.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.c)});
    }
}
