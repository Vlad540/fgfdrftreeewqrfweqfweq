package defpackage;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: hsf  reason: default package */
public abstract class hsf extends gsf {
    public hsf(nsf nsf, WindowInsets windowInsets) {
        super(nsf, windowInsets);
    }

    public nsf a() {
        return nsf.f((View) null, this.c.consumeDisplayCutout());
    }

    public ri4 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ri4(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsf)) {
            return false;
        }
        hsf hsf = (hsf) obj;
        return Objects.equals(this.c, hsf.c) && Objects.equals(this.g, hsf.g);
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
