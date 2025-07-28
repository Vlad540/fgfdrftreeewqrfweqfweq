package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.NoSuchElementException;

/* renamed from: kpd  reason: default package */
public enum kpd implements Parcelable, jt0 {
    CHAT("chat"),
    CHANNEL("channel");
    
    public static final Parcelable.Creator<kpd> CREATOR = null;
    public static final m54 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, m54] */
    static {
        kpd[] kpdArr;
        Y = new pz4(kpdArr);
        b = new Object();
        CREATOR = new xkd(10);
    }

    /* access modifiers changed from: public */
    kpd(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        kpd kpd;
        b.getClass();
        u1 it = Y.iterator();
        do {
            u1 u1Var = it;
            if (u1Var.hasNext()) {
                kpd = (kpd) u1Var.next();
            } else {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } while (!hhd.f(kpd.a, str));
        return kpd;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
