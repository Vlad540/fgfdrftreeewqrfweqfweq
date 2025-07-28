package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: inc  reason: default package */
public final class inc implements Parcelable {
    public static final Parcelable.Creator<inc> CREATOR = new x3b(17);
    public final String a;

    public /* synthetic */ inc(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof inc)) {
            return false;
        }
        return hhd.f(this.a, ((inc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ScopeId(value="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
