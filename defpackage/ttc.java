package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ttc  reason: default package */
public final class ttc {
    public final ztc a;
    public final ztc b;

    public ttc(ztc ztc, ztc ztc2) {
        this.a = ztc;
        this.b = ztc2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ttc.class != obj.getClass()) {
            return false;
        }
        ttc ttc = (ttc) obj;
        return this.a.equals(ttc.a) && this.b.equals(ttc.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        ztc ztc = this.a;
        sb.append(ztc);
        ztc ztc2 = this.b;
        if (ztc.equals(ztc2)) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", " + ztc2;
        }
        return wn6.l(sb, str, "]");
    }
}
