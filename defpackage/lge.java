package defpackage;

import android.os.Parcel;
import android.text.TextUtils;

/* renamed from: lge  reason: default package */
public final class lge extends mge {
    public static final kge CREATOR = new Object();
    public final CharSequence b;

    public lge(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lge) && hhd.f(this.b, ((lge) obj).b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "SimpleText(text=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
    }
}
