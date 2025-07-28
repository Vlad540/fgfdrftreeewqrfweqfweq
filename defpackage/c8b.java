package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c8b  reason: default package */
public enum c8b implements Parcelable {
    CREATE("create");
    
    public static final Parcelable.Creator<c8b> CREATOR = null;
    public static final ns7 b = null;
    public final String a;

    static {
        c8b[] c8bArr;
        X = new pz4(c8bArr);
        b = new ns7(15);
        CREATOR = new x3b(6);
    }

    /* access modifiers changed from: public */
    c8b(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
