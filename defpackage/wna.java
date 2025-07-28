package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* renamed from: wna  reason: default package */
public final class wna {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final dk a() {
        dk dkVar = new dk();
        dkVar.o = this.a;
        dkVar.X = this.b;
        dkVar.Y = this.c;
        dkVar.Z = this.d;
        dkVar.b = this.e;
        dkVar.c = this.f;
        return dkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof wna)) {
            return false;
        }
        wna wna = (wna) obj;
        String str = this.d;
        String str2 = wna.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(wna.a)) && Objects.equals(this.c, wna.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(wna.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(wna.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(new Object[]{this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }
}
