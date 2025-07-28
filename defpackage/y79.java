package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: y79  reason: default package */
public class y79 extends jj0 {
    public final List j;

    public y79(String str, List list, long j2, long j3, long j4, xx xxVar, boolean z, int i, int i2) {
        super(i, i2, j3, j2, j4, xxVar, str, false, z);
        this.j = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.j.equals(((y79) obj).j);
    }

    public final int getHeight() {
        List list = this.j;
        if (list.isEmpty()) {
            return 0;
        }
        return ((w79) list.get(0)).c;
    }

    public final int getWidth() {
        List list = this.j;
        if (list.isEmpty()) {
            return 0;
        }
        return ((w79) list.get(0)).b;
    }

    public int hashCode() {
        return this.j.hashCode() + (super.hashCode() * 31);
    }

    public final int j() {
        return 2;
    }

    public final Uri l() {
        return Uri.parse(((w79) this.j.get(0)).a);
    }

    public y79(long j2, long j3, List list, boolean z) {
        this((String) null, list, j2, j3, 0, (xx) null, z, -1, -1);
    }
}
