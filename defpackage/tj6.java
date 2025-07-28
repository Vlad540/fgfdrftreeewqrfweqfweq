package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: tj6  reason: default package */
public final class tj6 implements x29 {
    public static final Parcelable.Creator<tj6> CREATOR = new ze6(2);
    public final String a;
    public final String b;
    public final List c;

    public tj6(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tj6.class != obj.getClass()) {
            return false;
        }
        tj6 tj6 = (tj6) obj;
        return TextUtils.equals(this.a, tj6.a) && TextUtils.equals(this.b, tj6.b) && this.c.equals(tj6.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb.append(str != null ? wn6.l(hr1.m(" [", str, ", "), this.b, "]") : BuildConfig.FLAVOR);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        List list = this.c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
    }

    public tj6(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((rj6) parcel.readParcelable(rj6.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }
}
