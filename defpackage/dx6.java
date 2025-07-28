package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* renamed from: dx6  reason: default package */
public class dx6 {
    public final InputConfiguration a;

    public dx6(Object obj) {
        this.a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dx6)) {
            return false;
        }
        return Objects.equals(this.a, ((dx6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
