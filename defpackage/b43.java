package defpackage;

import java.util.Arrays;

/* renamed from: b43  reason: default package */
public final class b43 {
    public final a43 a;
    public final c43 b;
    public final f43 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final int[] l;
    public final int[] m;

    public b43(a43 a43, c43 c43, f43 f43, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = a43;
        this.b = c43;
        this.c = f43;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = iArr;
        this.k = iArr2;
        this.l = iArr3;
        this.m = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b43)) {
            return false;
        }
        b43 b43 = (b43) obj;
        return hhd.f(this.a, b43.a) && hhd.f(this.b, b43.b) && hhd.f(this.c, b43.c) && this.d == b43.d && this.e == b43.e && this.f == b43.f && this.g == b43.g && this.h == b43.h && this.i == b43.i && hhd.f(this.j, b43.j) && hhd.f(this.k, b43.k) && hhd.f(this.l, b43.l) && hhd.f(this.m, b43.m);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int d2 = c3d.d(-1, c3d.d(this.i, c3d.d(1543503872, c3d.d(-871625458, c3d.d(this.h, c3d.d(this.g, c3d.d(this.f, c3d.d(this.e, c3d.d(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int hashCode3 = Arrays.hashCode(this.k);
        int hashCode4 = Arrays.hashCode(this.l);
        return Integer.hashCode(1392508927) + c3d.d(-1191182337, (Arrays.hashCode(this.m) + ((hashCode4 + ((hashCode3 + ((Arrays.hashCode(this.j) + d2) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.j);
        String arrays2 = Arrays.toString(this.k);
        String arrays3 = Arrays.toString(this.l);
        String arrays4 = Arrays.toString(this.m);
        StringBuilder sb = new StringBuilder("CommonBackgroundColors(chatBackground=");
        sb.append(this.a);
        sb.append(", fileType=");
        sb.append(this.b);
        sb.append(", skeleton=");
        sb.append(this.c);
        sb.append(", surfaceGround=");
        sb.append(this.d);
        sb.append(", capsule=");
        sb.append(this.e);
        sb.append(", capsuleSecondary=");
        sb.append(this.f);
        sb.append(", capsuleOutside=");
        sb.append(this.g);
        sb.append(", chatFab=");
        sb.append(this.h);
        sb.append(", overlayHard=-871625458, neutralFade=1543503872, stickerBlank=");
        sb.append(this.i);
        sb.append(", contrastStatic=-1, capsuleGradient=");
        sb.append(arrays);
        sb.append(", capsuleSecondaryGradient=");
        sb.append(arrays2);
        sb.append(", glassLightGradient=");
        sb.append(arrays3);
        sb.append(", spaceThemeGradient=");
        return wn6.l(sb, arrays4, ", timelineActive=-1191182337, timelinePassive=1392508927)");
    }
}
