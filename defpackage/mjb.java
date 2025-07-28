package defpackage;

import android.graphics.Bitmap;

/* renamed from: mjb  reason: default package */
public final class mjb {
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;

    public mjb(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjb)) {
            return false;
        }
        mjb mjb = (mjb) obj;
        return hhd.f(this.a, mjb.a) && hhd.f(this.b, mjb.b) && hhd.f(this.c, mjb.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "QrCodeData(name=" + this.a + ", shortName=" + this.b + ", qrCode=" + this.c + ")";
    }
}
