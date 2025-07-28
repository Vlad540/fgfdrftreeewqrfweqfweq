package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d8b  reason: default package */
public enum d8b implements Parcelable {
    LOCAL_CHAT("local_chat"),
    CONTACT("contact");
    
    public static final Parcelable.Creator<d8b> CREATOR = null;
    public static final lu7 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, lu7] */
    static {
        d8b[] d8bArr;
        Y = new pz4(d8bArr);
        b = new Object();
        CREATOR = new x3b(7);
    }

    /* access modifiers changed from: public */
    d8b(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
