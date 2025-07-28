package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;

/* renamed from: z48  reason: default package */
public final class z48 extends Binder implements hn6 {
    public final WeakReference c;

    public z48(o48 o48) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.c = new WeakReference(o48);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hn6, java.lang.Object, gn6] */
    public static hn6 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof hn6)) {
            return (hn6) queryLocalInterface;
        }
        ? obj = new Object();
        obj.c = iBinder;
        return obj;
    }

    public final void A(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new v48(eya.c(bundle)));
            } catch (RuntimeException e) {
                ez3.k0("Ignoring malformed Bundle for Commands", e);
            }
        }
    }

    public final void D(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new hy5(20, n2d.b(bundle)));
            } catch (RuntimeException e) {
                ez3.k0("Ignoring malformed Bundle for SessionPositionInfo", e);
            }
        }
    }

    public final void F0(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                G0(i, p2d.a(bundle));
            } catch (RuntimeException e) {
                ez3.k0("Ignoring malformed Bundle for SessionResult", e);
            }
        }
    }

    public final void G0(int i, Object obj) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            o48 o48 = (o48) this.c.get();
            if (o48 != null) {
                o48.b.s(i, obj);
                o48.a.G(new n30(i, 11, o48));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f A[Catch:{ RuntimeException -> 0x0048 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020 A[Catch:{ RuntimeException -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(int r4, android.os.Bundle r5, android.os.Bundle r6) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x004e
            if (r6 != 0) goto L_0x0005
            goto L_0x004e
        L_0x0005:
            java.lang.ref.WeakReference r4 = r3.c     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Object r4 = r4.get()     // Catch:{ RuntimeException -> 0x0048 }
            o48 r4 = (defpackage.o48) r4     // Catch:{ RuntimeException -> 0x0048 }
            r0 = -1
            if (r4 != 0) goto L_0x0012
        L_0x0010:
            r4 = r0
            goto L_0x001d
        L_0x0012:
            m3d r4 = r4.k     // Catch:{ RuntimeException -> 0x0048 }
            if (r4 != 0) goto L_0x0017
            goto L_0x0010
        L_0x0017:
            l3d r4 = r4.a     // Catch:{ RuntimeException -> 0x0048 }
            int r4 = r4.f()     // Catch:{ RuntimeException -> 0x0048 }
        L_0x001d:
            if (r4 != r0) goto L_0x0020
            return
        L_0x0020:
            fza r4 = defpackage.fza.r(r4, r5)     // Catch:{ RuntimeException -> 0x0048 }
            dza r5 = new dza     // Catch:{ RuntimeException -> 0x0041 }
            java.lang.String r0 = defpackage.dza.d     // Catch:{ RuntimeException -> 0x0041 }
            r1 = 0
            boolean r0 = r6.getBoolean(r0, r1)     // Catch:{ RuntimeException -> 0x0041 }
            java.lang.String r2 = defpackage.dza.e     // Catch:{ RuntimeException -> 0x0041 }
            boolean r6 = r6.getBoolean(r2, r1)     // Catch:{ RuntimeException -> 0x0041 }
            r5.<init>(r0, r6)     // Catch:{ RuntimeException -> 0x0041 }
            e44 r6 = new e44
            r0 = 29
            r6.<init>(r4, r0, r5)
            r3.R(r6)
            return
        L_0x0041:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for BundlingExclusions"
            defpackage.ez3.k0(r4, r3)
            return
        L_0x0048:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for PlayerInfo"
            defpackage.ez3.k0(r4, r3)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z48.H(int, android.os.Bundle, android.os.Bundle):void");
    }

    public final void M(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                G0(i, gb7.a(bundle));
            } catch (RuntimeException e) {
                ez3.k0("Ignoring malformed Bundle for LibraryResult", e);
            }
        }
    }

    public final void R(y48 y48) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            o48 o48 = (o48) this.c.get();
            if (o48 != null) {
                oze.W(o48.a.X, new zo5(o48, 17, y48));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void b(int i) {
        R(new j67(26));
    }

    public final void c(int i) {
        R(new j67(27));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017f A[Catch:{ RuntimeException -> 0x019e }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0181 A[Catch:{ RuntimeException -> 0x019e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "androidx.media3.session.IMediaController"
            r1 = 1
            if (r4 < r1) goto L_0x000d
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r2) goto L_0x000d
            r5.enforceInterface(r0)
        L_0x000d:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r4 == r2) goto L_0x025f
            r0 = 4001(0xfa1, float:5.607E-42)
            java.lang.String r2 = "Ignoring malformed Bundle for LibraryParams"
            if (r4 == r0) goto L_0x0225
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r4 == r0) goto L_0x01e8
            r0 = 0
            switch(r4) {
                case 3001: goto L_0x01d7;
                case 3002: goto L_0x01c6;
                case 3003: goto L_0x01b5;
                case 3004: goto L_0x0157;
                case 3005: goto L_0x0123;
                case 3006: goto L_0x011a;
                case 3007: goto L_0x0102;
                case 3008: goto L_0x00f1;
                case 3009: goto L_0x00e0;
                case 3010: goto L_0x00a6;
                case 3011: goto L_0x009d;
                case 3012: goto L_0x007e;
                case 3013: goto L_0x0067;
                case 3014: goto L_0x0047;
                case 3015: goto L_0x0025;
                default: goto L_0x0020;
            }
        L_0x0020:
            boolean r3 = super.onTransact(r4, r5, r6, r7)
            return r3
        L_0x0025:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r4 = defpackage.a24.b(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            defpackage.f2d.a(r4)     // Catch:{ RuntimeException -> 0x003f }
            j67 r4 = new j67
            r5 = 24
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025e
        L_0x003f:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionError"
            defpackage.ez3.k0(r4, r3)
            goto L_0x025e
        L_0x0047:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.app.PendingIntent.CREATOR
            java.lang.Object r4 = defpackage.a24.b(r5, r4)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            if (r4 != 0) goto L_0x005b
            java.lang.String r3 = "Ignoring null session activity intent"
            defpackage.ez3.j0(r3)
            goto L_0x025e
        L_0x005b:
            j67 r4 = new j67
            r5 = 29
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025e
        L_0x0067:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r7 = defpackage.a24.b(r5, r6)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r5 = defpackage.a24.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.H(r4, r7, r5)
            goto L_0x025e
        L_0x007e:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r4 = defpackage.a24.b(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r4 != 0) goto L_0x0092
            java.lang.String r3 = "Ignoring null Bundle for extras"
            defpackage.ez3.j0(r3)
            goto L_0x025e
        L_0x0092:
            x48 r4 = new x48
            r5 = 0
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025e
        L_0x009d:
            int r4 = r5.readInt()
            r3.b(r4)
            goto L_0x025e
        L_0x00a6:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r6 = defpackage.a24.b(r5, r4)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.Object r4 = defpackage.a24.b(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r6 == 0) goto L_0x025e
            if (r4 != 0) goto L_0x00bd
            goto L_0x025e
        L_0x00bd:
            w1d r5 = defpackage.w1d.b(r6)     // Catch:{ RuntimeException -> 0x00d8 }
            eya r4 = defpackage.eya.c(r4)     // Catch:{ RuntimeException -> 0x00d0 }
            w48 r6 = new w48
            r7 = 0
            r6.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r4)
            r3.R(r6)
            goto L_0x025e
        L_0x00d0:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for Commands"
            defpackage.ez3.k0(r4, r3)
            goto L_0x025e
        L_0x00d8:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionCommands"
            defpackage.ez3.k0(r4, r3)
            goto L_0x025e
        L_0x00e0:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.a24.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.A(r4, r5)
            goto L_0x025e
        L_0x00f1:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.a24.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.D(r4, r5)
            goto L_0x025e
        L_0x0102:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r6 = defpackage.a24.b(r5, r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            int r5 = r5.readInt()
            if (r5 == 0) goto L_0x0115
            r0 = r1
        L_0x0115:
            r3.q0(r4, r6, r0)
            goto L_0x025e
        L_0x011a:
            int r4 = r5.readInt()
            r3.c(r4)
            goto L_0x025e
        L_0x0123:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r7 = defpackage.a24.b(r5, r6)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r5 = defpackage.a24.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            if (r7 == 0) goto L_0x0150
            if (r5 != 0) goto L_0x013a
            goto L_0x0150
        L_0x013a:
            v1d r6 = defpackage.v1d.a(r7)     // Catch:{ RuntimeException -> 0x0148 }
            x34 r7 = new x34
            r7.<init>((int) r4, (defpackage.v1d) r6, (android.os.Bundle) r5)
            r3.R(r7)
            goto L_0x025e
        L_0x0148:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionCommand"
            defpackage.ez3.k0(r4, r3)
            goto L_0x025e
        L_0x0150:
            java.lang.String r3 = "Ignoring custom command with null args."
            defpackage.ez3.j0(r3)
            goto L_0x025e
        L_0x0157:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.util.ArrayList r5 = r5.createTypedArrayList(r6)
            if (r5 != 0) goto L_0x0165
            goto L_0x025e
        L_0x0165:
            java.lang.ref.WeakReference r6 = r3.c     // Catch:{ RuntimeException -> 0x019e }
            java.lang.Object r6 = r6.get()     // Catch:{ RuntimeException -> 0x019e }
            o48 r6 = (defpackage.o48) r6     // Catch:{ RuntimeException -> 0x019e }
            r7 = -1
            if (r6 != 0) goto L_0x0172
        L_0x0170:
            r6 = r7
            goto L_0x017d
        L_0x0172:
            m3d r6 = r6.k     // Catch:{ RuntimeException -> 0x019e }
            if (r6 != 0) goto L_0x0177
            goto L_0x0170
        L_0x0177:
            l3d r6 = r6.a     // Catch:{ RuntimeException -> 0x019e }
            int r6 = r6.f()     // Catch:{ RuntimeException -> 0x019e }
        L_0x017d:
            if (r6 != r7) goto L_0x0181
            goto L_0x025e
        L_0x0181:
            ts6 r7 = defpackage.ws6.i()     // Catch:{ RuntimeException -> 0x019e }
        L_0x0185:
            int r2 = r5.size()     // Catch:{ RuntimeException -> 0x019e }
            if (r0 >= r2) goto L_0x01a0
            java.lang.Object r2 = r5.get(r0)     // Catch:{ RuntimeException -> 0x019e }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ RuntimeException -> 0x019e }
            r2.getClass()     // Catch:{ RuntimeException -> 0x019e }
            t33 r2 = defpackage.t33.b(r6, r2)     // Catch:{ RuntimeException -> 0x019e }
            r7.a(r2)     // Catch:{ RuntimeException -> 0x019e }
            int r0 = r0 + 1
            goto L_0x0185
        L_0x019e:
            r3 = move-exception
            goto L_0x01ae
        L_0x01a0:
            e8c r5 = r7.j()     // Catch:{ RuntimeException -> 0x019e }
            hc0 r6 = new hc0
            r6.<init>(r4, r5)
            r3.R(r6)
            goto L_0x025e
        L_0x01ae:
            java.lang.String r4 = "Ignoring malformed Bundle for CommandButton"
            defpackage.ez3.k0(r4, r3)
            goto L_0x025e
        L_0x01b5:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.a24.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.M(r4, r5)
            goto L_0x025e
        L_0x01c6:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.a24.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.F0(r4, r5)
            goto L_0x025e
        L_0x01d7:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.a24.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.r(r4, r5)
            goto L_0x025e
        L_0x01e8:
            r5.readInt()
            java.lang.String r4 = r5.readString()
            int r6 = r5.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.a24.b(r5, r7)
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0207
            java.lang.String r3 = "onSearchResultChanged(): Ignoring empty query"
            defpackage.ez3.j0(r3)
            goto L_0x025e
        L_0x0207:
            if (r6 >= 0) goto L_0x020f
            java.lang.String r3 = "onSearchResultChanged(): Ignoring negative itemCount: "
        L_0x020b:
            us8.l(r6, r3)
            goto L_0x025e
        L_0x020f:
            if (r5 != 0) goto L_0x0212
            goto L_0x0215
        L_0x0212:
            defpackage.h78.a(r5)     // Catch:{ RuntimeException -> 0x0220 }
        L_0x0215:
            j67 r4 = new j67
            r5 = 25
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025e
        L_0x0220:
            r3 = move-exception
            defpackage.ez3.k0(r2, r3)
            goto L_0x025e
        L_0x0225:
            r5.readInt()
            java.lang.String r4 = r5.readString()
            int r6 = r5.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.a24.b(r5, r7)
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0244
            java.lang.String r3 = "onChildrenChanged(): Ignoring empty parentId"
            defpackage.ez3.j0(r3)
            goto L_0x025e
        L_0x0244:
            if (r6 >= 0) goto L_0x0249
            java.lang.String r3 = "onChildrenChanged(): Ignoring negative itemCount: "
            goto L_0x020b
        L_0x0249:
            if (r5 != 0) goto L_0x024c
            goto L_0x024f
        L_0x024c:
            defpackage.h78.a(r5)     // Catch:{ RuntimeException -> 0x025a }
        L_0x024f:
            j67 r4 = new j67
            r5 = 28
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025e
        L_0x025a:
            r3 = move-exception
            defpackage.ez3.k0(r2, r3)
        L_0x025e:
            return r1
        L_0x025f:
            r6.writeString(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z48.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final void q0(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(dza.d, z);
        bundle2.putBoolean(dza.e, true);
        H(i, bundle, bundle2);
    }

    public final void r(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new hy5(19, sd3.a(bundle)));
            } catch (RuntimeException e) {
                ez3.k0("Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
                c(i);
            }
        }
    }
}
