package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: d96  reason: default package */
public final class d96 extends jj0 {
    public final bf5 j;
    public final o10 k;

    public d96(bf5 bf5, o10 o10) {
        super(-1, -1, 0, 0, 0, (xx) null, (String) null, false, true);
        this.j = bf5;
        this.k = o10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d96.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        d96 d96 = (d96) obj;
        return this.j.equals(d96.j) && this.k.equals(d96.k);
    }

    public final int getHeight() {
        return this.k.b.o;
    }

    public final int getWidth() {
        return this.k.b.c;
    }

    public final int hashCode() {
        int hashCode = this.j.hashCode();
        int hashCode2 = this.k.hashCode();
        return hr1.t(3) + ((hashCode2 + ((hashCode + (super.hashCode() * 31)) * 31)) * 31);
    }

    public final int j() {
        return 3;
    }

    public final Uri l() {
        o10 o10 = this.k;
        if (!r1g.p(o10.r)) {
            return Uri.parse(o10.r);
        }
        File k2 = ((mg5) this.j).k(o10.b.w0);
        return k2.exists() ? Uri.fromFile(k2) : Uri.fromFile(new File(o10.r));
    }
}
