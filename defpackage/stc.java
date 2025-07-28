package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: stc  reason: default package */
public final class stc {
    public final ytc a;
    public final ytc b;

    public stc(ytc ytc, ytc ytc2) {
        this.a = ytc;
        this.b = ytc2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || stc.class != obj.getClass()) {
            return false;
        }
        stc stc = (stc) obj;
        return this.a.equals(stc.a) && this.b.equals(stc.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        ytc ytc = this.a;
        String valueOf = String.valueOf(ytc);
        ytc ytc2 = this.b;
        if (ytc.equals(ytc2)) {
            str = BuildConfig.FLAVOR;
        } else {
            String valueOf2 = String.valueOf(ytc2);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 2);
            sb.append(", ");
            sb.append(valueOf2);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(me4.e(valueOf.length() + 2, str));
        sb2.append("[");
        sb2.append(valueOf);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
