package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s3g  reason: default package */
public abstract class s3g {
    public static final /* synthetic */ int a = 0;

    static {
        s3g.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
