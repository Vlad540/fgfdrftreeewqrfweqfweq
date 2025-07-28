package defpackage;

/* renamed from: voe  reason: default package */
public final class voe implements lt0 {
    public static final voe o = new voe(new toe[0]);
    public final int a;
    public final e8c b;
    public int c;

    public voe(toe... toeArr) {
        this.b = ws6.k(toeArr);
        this.a = toeArr.length;
        int i = 0;
        while (true) {
            e8c e8c = this.b;
            if (i < e8c.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < e8c.size(); i3++) {
                    if (((toe) e8c.get(i)).equals(e8c.get(i3))) {
                        oyb.u(new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final toe a(int i) {
        return (toe) this.b.get(i);
    }

    public final int b(toe toe) {
        int indexOf = this.b.indexOf(toe);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || voe.class != obj.getClass()) {
            return false;
        }
        voe voe = (voe) obj;
        return this.a == voe.a && this.b.equals(voe.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
