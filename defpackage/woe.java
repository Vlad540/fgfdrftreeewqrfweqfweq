package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: woe  reason: default package */
public final class woe {
    public static final woe d = new woe(new uoe[0]);
    public static final String e = Integer.toString(0, 36);
    public final int a;
    public final e8c b;
    public int c;

    static {
        int i = oze.a;
    }

    public woe(uoe... uoeArr) {
        this.b = ws6.k(uoeArr);
        this.a = uoeArr.length;
        int i = 0;
        while (true) {
            e8c e8c = this.b;
            if (i < e8c.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < e8c.size(); i3++) {
                    if (((uoe) e8c.get(i)).equals(e8c.get(i3))) {
                        ez3.B(BuildConfig.FLAVOR, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final uoe a(int i) {
        return (uoe) this.b.get(i);
    }

    public final int b(uoe uoe) {
        int indexOf = this.b.indexOf(uoe);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || woe.class != obj.getClass()) {
            return false;
        }
        woe woe = (woe) obj;
        return this.a == woe.a && this.b.equals(woe.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
