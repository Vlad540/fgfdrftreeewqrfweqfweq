package defpackage;

/* renamed from: mc6  reason: default package */
public final class mc6 {
    public int a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc6)) {
            return false;
        }
        mc6 mc6 = (mc6) obj;
        return this.a == mc6.a && this.b == mc6.b && Float.compare(this.c, mc6.c) == 0 && this.d == mc6.d && this.e == mc6.e && this.f == mc6.f;
    }

    public final int hashCode() {
        return hr1.t(this.f) + th2.f(c3d.d(this.d, th2.e(c3d.d(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31), 31, this.e);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        float f2 = this.c;
        int i3 = this.d;
        boolean z = this.e;
        int i4 = this.f;
        StringBuilder i5 = rf0.i("PageState(pagesNumber=", i, ", selectedPageIndex=", i2, ", pageOffsetFraction=");
        i5.append(f2);
        i5.append(", selectedBigDotIndex=");
        i5.append(i3);
        i5.append(", wasShiftedFromZeroToZero=");
        i5.append(z);
        i5.append(", dotsAnimationType=");
        i5.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "ALL_DOTS_TO_RIGHT" : "ALL_DOTS_TO_LEFT" : "BIG_DOTS_CHANGE" : "NONE");
        i5.append(")");
        return i5.toString();
    }
}
