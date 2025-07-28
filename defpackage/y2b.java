package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: y2b  reason: default package */
public final class y2b implements Parcelable {
    public static final Parcelable.Creator<y2b> CREATOR = new ch9(29);
    public final Map a;
    public final List b;
    public final mi9 c;

    public y2b(LinkedHashMap linkedHashMap, ArrayList arrayList, mi9 mi9) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = mi9;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2b)) {
            return false;
        }
        y2b y2b = (y2b) obj;
        return hhd.f(this.a, y2b.a) && hhd.f(this.b, y2b.b) && hhd.f(this.c, y2b.c);
    }

    public final int hashCode() {
        int f = c3d.f(this.b, this.a.hashCode() * 31, 31);
        mi9 mi9 = this.c;
        return f + (mi9 == null ? 0 : mi9.hashCode());
    }

    public final String toString() {
        return "PresetAvatarsModel(categories=" + this.a + ", avatars=" + this.b + ", selectedAvatar=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        List<mi9> list = this.b;
        parcel.writeInt(list.size());
        for (mi9 writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        mi9 mi9 = this.c;
        if (mi9 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        mi9.writeToParcel(parcel, i);
    }
}
