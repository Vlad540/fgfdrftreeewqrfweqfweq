package defpackage;

import android.graphics.RectF;

/* renamed from: zo2  reason: default package */
public final class zo2 {
    public final String a;
    public final String b;
    public final RectF c;

    public zo2(String str, String str2, RectF rectF) {
        this.a = str;
        this.b = str2;
        this.c = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo2)) {
            return false;
        }
        zo2 zo2 = (zo2) obj;
        return hhd.f(this.a, zo2.a) && hhd.f(this.b, zo2.b) && hhd.f(this.c, zo2.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RectF rectF = this.c;
        if (rectF != null) {
            i = rectF.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ChatTitleIconState(newIconPath=" + this.a + ", croppedIconPath=" + this.b + ", relativeCrop=" + this.c + ")";
    }
}
