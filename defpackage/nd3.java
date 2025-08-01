package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: nd3  reason: default package */
public final class nd3 extends o3 {
    public static final Parcelable.Creator<nd3> CREATOR = new udf(29);
    public static final nd3 X = new nd3(0);
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String o;

    public nd3(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.o = str;
    }

    public static String b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return rf0.f(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.nd3) r5;
        r1 = r5.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.nd3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            nd3 r5 = (defpackage.nd3) r5
            int r1 = r5.b
            int r3 = r4.b
            if (r3 != r1) goto L_0x0027
            android.app.PendingIntent r1 = r4.c
            android.app.PendingIntent r3 = r5.c
            boolean r1 = x87.F(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.String r4 = r4.o
            java.lang.String r5 = r5.o
            boolean r4 = x87.F(r4, r5)
            if (r4 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.o});
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(b(this.b), "statusCode");
        mnVar.r(this.c, "resolution");
        mnVar.r(this.o, "message");
        return mnVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        ek8.j0(parcel, 3, this.c, i);
        ek8.k0(parcel, 4, this.o);
        ek8.o0(parcel, n0);
    }

    public nd3(int i) {
        this(1, i, (PendingIntent) null, (String) null);
    }

    public nd3(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, (String) null);
    }
}
