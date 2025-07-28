package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: rbc  reason: default package */
public final class rbc {
    public final Resources a;
    public final Resources.Theme b;

    public rbc(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rbc.class != obj.getClass()) {
            return false;
        }
        rbc rbc = (rbc) obj;
        return this.a.equals(rbc.a) && Objects.equals(this.b, rbc.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
