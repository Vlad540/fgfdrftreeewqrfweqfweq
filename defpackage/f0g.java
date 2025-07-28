package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f0g  reason: default package */
public final class f0g extends o3 implements occ {
    public static final Parcelable.Creator<f0g> CREATOR = new udf(7);
    public final List a;
    public final String b;

    public f0g(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final Status a() {
        return this.b != null ? Status.X : Status.x0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        List list = this.a;
        if (list != null) {
            int n02 = ek8.n0(parcel, 1);
            parcel.writeStringList(list);
            ek8.o0(parcel, n02);
        }
        ek8.k0(parcel, 2, this.b);
        ek8.o0(parcel, n0);
    }
}
