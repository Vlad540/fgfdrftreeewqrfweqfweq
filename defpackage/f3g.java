package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f3g  reason: default package */
public final class f3g extends o3 {
    public static final Parcelable.Creator<f3g> CREATOR = new o1g(8);
    public final PendingIntent X;
    public final x5g Y;
    public final String Z;
    public final int a;
    public final e3g b;
    public final t6g c;
    public final m6g o;

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [vyf] */
    /* JADX WARNING: type inference failed for: r6v5, types: [vyf] */
    /* JADX WARNING: type inference failed for: r1v3, types: [vyf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f3g(int r4, defpackage.e3g r5, android.os.IBinder r6, android.os.IBinder r7, android.app.PendingIntent r8, android.os.IBinder r9, java.lang.String r10) {
        /*
            r3 = this;
            r0 = 2
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r4 = 0
            if (r6 == 0) goto L_0x0020
            int r5 = defpackage.s6g.d
            java.lang.String r5 = "com.google.android.gms.location.ILocationListener"
            android.os.IInterface r1 = r6.queryLocalInterface(r5)
            boolean r2 = r1 instanceof defpackage.t6g
            if (r2 == 0) goto L_0x001a
            t6g r1 = (defpackage.t6g) r1
            goto L_0x0021
        L_0x001a:
            q6g r1 = new q6g
            r1.<init>(r6, r5, r0)
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            r3.c = r1
            r3.X = r8
            if (r7 == 0) goto L_0x003c
            int r5 = defpackage.u2g.e
            java.lang.String r5 = "com.google.android.gms.location.ILocationCallback"
            android.os.IInterface r6 = r7.queryLocalInterface(r5)
            boolean r8 = r6 instanceof defpackage.m6g
            if (r8 == 0) goto L_0x0036
            m6g r6 = (defpackage.m6g) r6
            goto L_0x003d
        L_0x0036:
            h6g r6 = new h6g
            r6.<init>(r7, r5, r0)
            goto L_0x003d
        L_0x003c:
            r6 = r4
        L_0x003d:
            r3.o = r6
            if (r9 == 0) goto L_0x0055
            java.lang.String r4 = "com.google.android.gms.location.internal.IFusedLocationProviderCallback"
            android.os.IInterface r5 = r9.queryLocalInterface(r4)
            boolean r6 = r5 instanceof defpackage.x5g
            if (r6 == 0) goto L_0x004f
            r4 = r5
            x5g r4 = (defpackage.x5g) r4
            goto L_0x0055
        L_0x004f:
            n5g r5 = new n5g
            r5.<init>(r9, r4, r0)
            r4 = r5
        L_0x0055:
            r3.Y = r4
            r3.Z = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3g.<init>(int, e3g, android.os.IBinder, android.os.IBinder, android.app.PendingIntent, android.os.IBinder, java.lang.String):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.j0(parcel, 2, this.b, i);
        IBinder iBinder = null;
        t6g t6g = this.c;
        ek8.i0(parcel, 3, t6g == null ? null : t6g.asBinder());
        ek8.j0(parcel, 4, this.X, i);
        m6g m6g = this.o;
        ek8.i0(parcel, 5, m6g == null ? null : m6g.asBinder());
        x5g x5g = this.Y;
        if (x5g != null) {
            iBinder = x5g.asBinder();
        }
        ek8.i0(parcel, 6, iBinder);
        ek8.k0(parcel, 8, this.Z);
        ek8.o0(parcel, n0);
    }
}
