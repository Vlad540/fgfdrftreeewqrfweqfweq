package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: s2g  reason: default package */
public final class s2g extends bzf {
    public final /* synthetic */ Object d;
    public final /* synthetic */ vde e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s2g(Boolean bool, vde vde) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.d = bool;
        this.e = vde;
    }

    public final boolean G0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        kzf.b(parcel);
        ete.Y((Status) kzf.a(parcel, Status.CREATOR), this.d, this.e);
        return true;
    }
}
