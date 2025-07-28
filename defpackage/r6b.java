package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r6b  reason: default package */
public enum r6b implements Parcelable, jt0 {
    LOCAL_CHAT("local_chat"),
    SERVER_CHAT("server_chat"),
    CONTACT("contact");
    
    public static final Parcelable.Creator<r6b> CREATOR = null;
    public static final y76 b = null;
    public final String a;

    static {
        r6b[] r6bArr;
        Z = new pz4(r6bArr);
        b = new y76(15);
        CREATOR = new x3b(4);
    }

    /* access modifiers changed from: public */
    r6b(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        b.getClass();
        return y76.p(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
