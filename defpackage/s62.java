package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s62  reason: default package */
public enum s62 implements Parcelable, jt0 {
    LOCAL_ID("local");
    
    public static final Parcelable.Creator<s62> CREATOR = null;
    public static final qr4 b = null;
    public final String a;

    static {
        s62[] s62Arr;
        X = new pz4(s62Arr);
        b = new qr4(8);
        CREATOR = new h6(23);
    }

    /* access modifiers changed from: public */
    s62(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        b.getClass();
        return qr4.r(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
