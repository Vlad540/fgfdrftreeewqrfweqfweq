package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: kge  reason: default package */
public final class kge implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        return hhd.f(charSequence, "") ? mge.a : new lge(charSequence);
    }

    public final Object[] newArray(int i) {
        return new lge[i];
    }
}
