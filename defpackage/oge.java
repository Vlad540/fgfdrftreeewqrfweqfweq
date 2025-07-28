package defpackage;

import android.text.TextUtils;

/* renamed from: oge  reason: default package */
public final class oge {
    public final float a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final TextUtils.TruncateAt f;
    public final xm8 g;
    public final int h;
    public final int i;
    public final boolean j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oge(float f2, CharSequence charSequence, boolean z, boolean z2, int i2) {
        this(f2, charSequence, z, (i2 & 8) != 0 ? false : z2, Integer.MAX_VALUE, (TextUtils.TruncateAt) null, (xm8) null, 0, 0);
    }

    public static oge a(oge oge, CharSequence charSequence, int i2, int i3) {
        if ((i3 & 2) != 0) {
            charSequence = oge.b;
        }
        CharSequence charSequence2 = charSequence;
        boolean z = (i3 & 8) != 0 ? oge.d : false;
        if ((i3 & 16) != 0) {
            i2 = oge.e;
        }
        return new oge(oge.a, charSequence2, oge.c, z, i2, oge.f, oge.g, oge.h, oge.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oge)) {
            return false;
        }
        oge oge = (oge) obj;
        return Float.compare(this.a, oge.a) == 0 && hhd.f(this.b, oge.b) && this.c == oge.c && this.d == oge.d && this.e == oge.e && this.f == oge.f && hhd.f(this.g, oge.g) && this.h == oge.h && this.i == oge.i;
    }

    public final int hashCode() {
        int d2 = c3d.d(this.e, th2.f(th2.f(me4.f(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
        int i2 = 0;
        TextUtils.TruncateAt truncateAt = this.f;
        int hashCode = (d2 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        xm8 xm8 = this.g;
        if (xm8 != null) {
            i2 = xm8.hashCode();
        }
        return Integer.hashCode(this.i) + c3d.d(this.h, (hashCode + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreprocessTextResult(textSize=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", includeFontPadding=");
        sb.append(this.c);
        sb.append(", postProcessing=");
        sb.append(this.d);
        sb.append(", maxLines=");
        sb.append(this.e);
        sb.append(", truncateAt=");
        sb.append(this.f);
        sb.append(", replied=");
        sb.append(this.g);
        sb.append(", startPadding=");
        sb.append(this.h);
        sb.append(", endPadding=");
        return wn6.j(sb, this.i, ")");
    }

    public oge(float f2, CharSequence charSequence, boolean z, boolean z2, int i2, TextUtils.TruncateAt truncateAt, xm8 xm8, int i3, int i4) {
        this.a = f2;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = truncateAt;
        this.g = xm8;
        this.h = i3;
        this.i = i4;
        this.j = i2 != Integer.MAX_VALUE;
    }
}
