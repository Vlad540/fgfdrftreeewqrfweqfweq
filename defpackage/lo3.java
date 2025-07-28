package defpackage;

/* renamed from: lo3  reason: default package */
public final class lo3 implements pg7 {
    public final int a;
    public final Integer b;
    public final int c = p2a.o;

    public lo3(int i, int i2, int i3, Integer num) {
        this.a = i3;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo3)) {
            return false;
        }
        lo3 lo3 = (lo3) obj;
        lo3.getClass();
        int i = phc.a;
        int i2 = q2a.a;
        return this.a == lo3.a && hhd.f(this.b, lo3.b);
    }

    public final boolean g(pg7 pg7) {
        return pg7 instanceof lo3;
    }

    public final long getItemId() {
        return 0;
    }

    public final int hashCode() {
        int d = c3d.d(this.a, c3d.d(q2a.r, Integer.hashCode(phc.J0) * 31, 31), 31);
        Integer num = this.b;
        return d + (num == null ? 0 : num.hashCode());
    }

    public final int l() {
        return this.c;
    }

    public final Object n(Object obj) {
        lo3 lo3 = (pg7) obj;
        lo3 lo32 = lo3 instanceof lo3 ? lo3 : null;
        if (lo32 == null) {
            return null;
        }
        Integer num = this.b;
        Integer num2 = lo32.b;
        if (!hhd.f(num2, num)) {
            return new ko3(num2);
        }
        return null;
    }

    public final String toString() {
        return "ContactsEmptySearchResultItem(iconRes=" + phc.J0 + ", titleRes=" + q2a.r + ", descriptionRes=" + this.a + ", buttonTitleRes=" + this.b + ")";
    }
}
