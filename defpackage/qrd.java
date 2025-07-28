package defpackage;

/* renamed from: qrd  reason: default package */
public final class qrd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public qrd(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        this.j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrd)) {
            return false;
        }
        qrd qrd = (qrd) obj;
        qrd.getClass();
        return this.a == qrd.a && this.b == qrd.b && this.c == qrd.c && this.d == qrd.d && this.e == qrd.e && this.f == qrd.f && this.g == qrd.g && this.h == qrd.h && this.i == qrd.i && this.j == qrd.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + c3d.d(this.i, c3d.d(this.h, c3d.d(this.g, c3d.d(this.f, c3d.d(this.e, c3d.d(this.d, c3d.d(-16751924, c3d.d(this.c, c3d.d(this.b, c3d.d(this.a, Integer.hashCode(-4473925) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatesTextColors(activeContrastStatic=-4473925, activeNegative=");
        sb.append(this.a);
        sb.append(", activeNeutralThemed=");
        sb.append(this.b);
        sb.append(", activePrimary=");
        sb.append(this.c);
        sb.append(", activeThemed=-16751924, disabledContrast=");
        sb.append(this.d);
        sb.append(", disabledContrastStatic=");
        sb.append(this.e);
        sb.append(", disabledNegative=");
        sb.append(this.f);
        sb.append(", disabledNeutralThemed=");
        sb.append(this.g);
        sb.append(", disabledPrimary=");
        sb.append(this.h);
        sb.append(", disabledPrimaryStatic=");
        sb.append(this.i);
        sb.append(", disabledThemed=");
        return wn6.j(sb, this.j, ")");
    }
}
