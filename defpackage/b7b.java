package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b7b  reason: default package */
public enum b7b implements Parcelable {
    SETUP_NEW_ADMIN("setup_new_admin"),
    CHANGE_ADMIN("change_admin");
    
    public static final Parcelable.Creator<b7b> CREATOR = null;
    public static final gf6 b = null;
    public final String a;

    static {
        b7b[] b7bArr;
        Y = new pz4(b7bArr);
        b = new gf6(15);
        CREATOR = new x3b(5);
    }

    /* access modifiers changed from: public */
    b7b(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
