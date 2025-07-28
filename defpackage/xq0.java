package defpackage;

import java.util.Arrays;

/* renamed from: xq0  reason: default package */
public final class xq0 {
    public final wq0 a;
    public final yq0 b;
    public final cr0 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int[] l;

    public xq0(wq0 wq0, yq0 yq0, cr0 cr0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        this.a = wq0;
        this.b = yq0;
        this.c = cr0;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq0)) {
            return false;
        }
        xq0 xq0 = (xq0) obj;
        return hhd.f(this.a, xq0.a) && hhd.f(this.b, xq0.b) && hhd.f(this.c, xq0.c) && this.d == xq0.d && this.e == xq0.e && this.f == xq0.f && this.g == xq0.g && this.h == xq0.h && this.i == xq0.i && this.j == xq0.j && this.k == xq0.k && hhd.f(this.l, xq0.l);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Arrays.hashCode(this.l) + c3d.d(this.k, c3d.d(this.j, c3d.d(this.i, c3d.d(this.h, c3d.d(this.g, c3d.d(this.f, c3d.d(this.e, c3d.d(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.l);
        return "BubbleBackgroundColors(botButton=" + this.a + ", focus=" + this.b + ", reaction=" + this.c + ", bubble=" + this.d + ", action=" + this.e + ", actionFade=" + this.f + ", actionSecondary=" + this.g + ", surfaceSecondary=" + this.h + ", iconItem=" + this.i + ", mention=" + this.j + ", mentionPressed=" + this.k + ", bubbleGradient=" + arrays + ")";
    }
}
