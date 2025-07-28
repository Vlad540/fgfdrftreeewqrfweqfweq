package defpackage;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: ri4  reason: default package */
public final class ri4 {
    public final DisplayCutout a;

    public ri4(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ri4.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((ri4) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
