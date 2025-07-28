package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: me8  reason: default package */
public final class me8 extends Binder implements nn6 {
    public static final /* synthetic */ int i = 0;
    public final WeakReference c;
    public final rd8 d;
    public final nxc e;
    public final Set f = Collections.synchronizedSet(new HashSet());
    public d8c g = d8c.y0;
    public int h;

    public me8(cd8 cd8) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.c = new WeakReference(cd8);
        this.d = rd8.a(cd8.f);
        this.e = new nxc(cd8);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [ch7, java.lang.Object] */
    public static ch7 I0(cd8 cd8, ic8 ic8, int i2, le8 le8, nf3 nf3) {
        if (cd8.i()) {
            return bs6.b;
        }
        ch7 ch7 = (ch7) le8.h(cd8, ic8, i2);
        ? obj = new Object();
        ch7.c(new wc3((Object) cd8, (Object) obj, (Object) nf3, (Object) ch7, 10), lh4.a);
        return obj;
    }

    public static void M0(ic8 ic8, int i2, p2d p2d) {
        try {
            hc8 hc8 = ic8.d;
            oyb.l(hc8);
            hc8.i(i2, p2d);
        } catch (RemoteException e2) {
            ez3.k0("Failed to send result to controller " + ic8, e2);
        }
    }

    public static hy5 N0(nf3 nf3) {
        return new hy5(24, new hy5(25, nf3));
    }

    public final void A0(hn6 hn6, int i2, int i3, int i4, int i5) {
        if (hn6 != null && i3 >= 0 && i4 >= i3 && i5 >= 0) {
            K0(hn6, i2, 20, N0(new ae8(i3, i4, i5)));
        }
    }

    public final void B(hn6 hn6, int i2, Bundle bundle) {
        if (hn6 != null && bundle != null) {
            try {
                K0(hn6, i2, 29, N0(new w48((Object) this, 3, (Object) mpe.b(bundle))));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for TrackSelectionParameters", e2);
            }
        }
    }

    public final void C(hn6 hn6, int i2) {
        ic8 x;
        if (hn6 != null && (x = this.e.x(hn6.asBinder())) != null) {
            L0(x, i2, 12, N0(new x48(21)));
        }
    }

    public final void C0(hn6 hn6, int i2, int i3, int i4) {
        if (hn6 != null && i3 >= 0 && i4 >= 0) {
            K0(hn6, i2, 20, N0(new a45(i3, i4, 4)));
        }
    }

    public final void D0(hn6 hn6, int i2, int i3, Bundle bundle) {
        if (hn6 != null && bundle != null && i3 >= 0) {
            try {
                K0(hn6, i2, 20, new ee8(new w48((Object) new zd8(1, l68.b(bundle)), 6, (Object) new yd8(this, i3, 2)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void E(hn6 hn6, int i2, int i3, Bundle bundle) {
        if (hn6 != null && bundle != null && i3 >= 0) {
            try {
                K0(hn6, i2, 20, new ee8(new w48((Object) new zd8(0, l68.b(bundle)), 6, (Object) new yd8(this, i3, 1)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void E0(hn6 hn6, int i2, boolean z) {
        if (hn6 != null) {
            K0(hn6, i2, 14, N0(new cz0(z, 9)));
        }
    }

    public final void F(hn6 hn6, int i2, int i3) {
        if (hn6 != null) {
            K0(hn6, i2, 34, N0(new x34(i3, 8)));
        }
    }

    public final void G(hn6 hn6, int i2) {
        ic8 x;
        if (hn6 != null && (x = this.e.x(hn6.asBinder())) != null) {
            L0(x, i2, 11, N0(new x48(16)));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [jn, fs6] */
    public final fza G0(fza fza) {
        ws6 a = fza.D.a();
        ts6 i2 = ws6.i();
        ? jnVar = new jn(4);
        for (int i3 = 0; i3 < a.size(); i3++) {
            rpe rpe = (rpe) a.get(i3);
            uoe b = rpe.b();
            String str = (String) this.g.get(b);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                int i4 = this.h;
                this.h = i4 + 1;
                int i5 = oze.a;
                sb.append(Integer.toString(i4, 36));
                sb.append("-");
                sb.append(b.b);
                str = sb.toString();
            }
            jnVar.J(b, str);
            i2.d(rpe.a(str));
        }
        this.g = jnVar.k();
        fza b2 = fza.b(new spe(i2.j()));
        mpe mpe = b2.E;
        if (mpe.A.isEmpty()) {
            return b2;
        }
        kpe c2 = mpe.a().c();
        rue g2 = mpe.A.values().iterator();
        while (g2.hasNext()) {
            fpe fpe = (fpe) g2.next();
            uoe uoe = fpe.a;
            String str2 = (String) this.g.get(uoe);
            if (str2 != null) {
                c2.a(new fpe(uoe.a(str2), fpe.b));
            } else {
                c2.a(fpe);
            }
        }
        return b2.o(c2.b());
    }

    public final nxc H0() {
        return this.e;
    }

    public final void I(hn6 hn6, int i2, int i3) {
        if (hn6 != null) {
            K0(hn6, i2, 34, N0(new x34(i3, 7)));
        }
    }

    public final void J(hn6 hn6, int i2, IBinder iBinder, boolean z) {
        if (hn6 != null && iBinder != null) {
            try {
                ws6 a = it0.a(iBinder);
                ts6 i3 = ws6.i();
                for (int i4 = 0; i4 < a.size(); i4++) {
                    Bundle bundle = (Bundle) a.get(i4);
                    bundle.getClass();
                    i3.a(l68.b(bundle));
                }
                K0(hn6, i2, 20, new ee8(new w48((Object) new eb4(i3.j(), z, 4), 5, (Object) new be8(5)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final int J0(ic8 ic8, qza qza, int i2) {
        if (qza.t1(17)) {
            nxc nxc = this.e;
            if (!nxc.N(ic8, 17) && nxc.N(ic8, 16)) {
                return qza.p0() + i2;
            }
        }
        return i2;
    }

    public final void K(hn6 hn6, int i2, int i3, int i4) {
        if (hn6 != null && i3 >= 0 && i4 >= i3) {
            K0(hn6, i2, 20, new hy5(24, new xd8(this, i3, i4)));
        }
    }

    public final void K0(hn6 hn6, int i2, int i3, le8 le8) {
        ic8 x = this.e.x(hn6.asBinder());
        if (x != null) {
            L0(x, i2, i3, le8);
        }
    }

    public final void L(hn6 hn6, int i2, int i3) {
        if (hn6 != null && i3 >= 0) {
            K0(hn6, i2, 20, new hy5(24, new yd8(this, i3, 4)));
        }
    }

    public final void L0(ic8 ic8, int i2, int i3, le8 le8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            cd8 cd8 = (cd8) this.c.get();
            if (cd8 != null) {
                if (!cd8.i()) {
                    oze.W(cd8.l, new de8(this, ic8, i3, i2, cd8, le8));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void N(hn6 hn6, int i2, int i3, int i4, IBinder iBinder) {
        if (hn6 != null && iBinder != null && i3 >= 0 && i4 >= i3) {
            try {
                ws6 a = it0.a(iBinder);
                ts6 i5 = ws6.i();
                for (int i6 = 0; i6 < a.size(); i6++) {
                    Bundle bundle = (Bundle) a.get(i6);
                    bundle.getClass();
                    i5.a(l68.b(bundle));
                }
                K0(hn6, i2, 20, new ee8(new w48((Object) new hy5(22, i5.j()), 6, (Object) new xd8(this, i3, i4)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void O(hn6 hn6, int i2) {
        ic8 x;
        if (hn6 != null && (x = this.e.x(hn6.asBinder())) != null) {
            L0(x, i2, 9, N0(new x48(22)));
        }
    }

    public final void P(hn6 hn6, int i2, int i3, long j) {
        if (hn6 != null && i3 >= 0) {
            K0(hn6, i2, 10, new hy5(24, new b44((Object) this, i3, j, 4)));
        }
    }

    public final void Q(hn6 hn6, int i2, IBinder iBinder) {
        if (hn6 != null && iBinder != null) {
            try {
                ws6 a = it0.a(iBinder);
                ts6 i3 = ws6.i();
                for (int i4 = 0; i4 < a.size(); i4++) {
                    Bundle bundle = (Bundle) a.get(i4);
                    bundle.getClass();
                    i3.a(l68.b(bundle));
                }
                K0(hn6, i2, 20, new ee8(new w48((Object) new d52(18, i3.j()), 6, (Object) new x48(24)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void R(hn6 hn6, int i2, v1d v1d, int i3, le8 le8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            cd8 cd8 = (cd8) this.c.get();
            if (cd8 != null) {
                if (!cd8.i()) {
                    ic8 x = this.e.x(hn6.asBinder());
                    if (x == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return;
                    }
                    oze.W(cd8.l, new ce8(this, x, v1d, i2, i3, le8, cd8));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void S(hn6 hn6, int i2) {
        if (hn6 != null) {
            K0(hn6, i2, 4, N0(new be8(1)));
        }
    }

    public final void U(hn6 hn6, int i2, int i3, IBinder iBinder) {
        if (hn6 != null && iBinder != null && i3 >= 0) {
            try {
                ws6 a = it0.a(iBinder);
                ts6 i4 = ws6.i();
                for (int i5 = 0; i5 < a.size(); i5++) {
                    Bundle bundle = (Bundle) a.get(i5);
                    bundle.getClass();
                    i4.a(l68.b(bundle));
                }
                K0(hn6, i2, 20, new ee8(new w48((Object) new d52(17, i4.j()), 6, (Object) new yd8(this, i3, 3)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void V(hn6 hn6, int i2) {
        if (hn6 != null) {
            K0(hn6, i2, 6, N0(new x48(19)));
        }
    }

    public final void X(hn6 hn6, int i2, long j) {
        if (hn6 != null) {
            K0(hn6, i2, 5, N0(new f00(j, 23)));
        }
    }

    public final void Y(hn6 hn6, int i2) {
        if (hn6 != null) {
            K0(hn6, i2, 2, N0(new be8(0)));
        }
    }

    public final void Z(hn6 hn6, int i2, int i3) {
        if (hn6 != null && i3 >= 0) {
            K0(hn6, i2, 10, new hy5(24, new yd8(this, i3, 0)));
        }
    }

    public final void a(hn6 hn6, int i2, Bundle bundle) {
        k96 k96;
        yc3 yc3;
        if (hn6 != null && bundle != null) {
            try {
                p2d a = p2d.a(bundle);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    nxc nxc = this.e;
                    IBinder asBinder = hn6.asBinder();
                    synchronized (nxc.a) {
                        ic8 x = nxc.x(asBinder);
                        k96 = null;
                        yc3 = x != null ? (yc3) ((yr) nxc.c).get(x) : null;
                    }
                    if (yc3 != null) {
                        k96 = yc3.b;
                    }
                    if (k96 == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return;
                    }
                    k96.s(i2, a);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for SessionResult", e2);
            }
        }
    }

    public final void a0(hn6 hn6, int i2) {
        if (hn6 != null) {
            K0(hn6, i2, 26, N0(new x48(25)));
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void c0(hn6 hn6, int i2, boolean z) {
        if (hn6 != null) {
            K0(hn6, i2, 1, N0(new cz0(z, 7)));
        }
    }

    public final void d(hn6 hn6, int i2, Bundle bundle, boolean z) {
        if (hn6 != null && bundle != null) {
            try {
                K0(hn6, i2, 35, N0(new eb4(k20.a(bundle), z, 3)));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for AudioAttributes", e2);
            }
        }
    }

    public final void d0(hn6 hn6, int i2, Bundle bundle) {
        l0(hn6, i2, bundle, true);
    }

    public final void e(hn6 hn6, int i2) {
        ic8 x;
        if (hn6 != null && (x = this.e.x(hn6.asBinder())) != null) {
            L0(x, i2, 1, N0(new x48(13)));
        }
    }

    public final void e0(hn6 hn6, int i2) {
        if (hn6 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                cd8 cd8 = (cd8) this.c.get();
                if (cd8 != null) {
                    if (!cd8.i()) {
                        oze.W(cd8.l, new zo5(this, 24, hn6));
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public final void i(hn6 hn6, int i2, Bundle bundle, long j) {
        if (hn6 != null && bundle != null) {
            try {
                K0(hn6, i2, 31, new ee8(new w48((Object) new sq1((Object) l68.b(bundle), j, 5), 5, (Object) new be8(5)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void i0(hn6 hn6, int i2, Surface surface) {
        if (hn6 != null) {
            K0(hn6, i2, 27, N0(new hy5(23, surface)));
        }
    }

    public final void j0(hn6 hn6, int i2, Bundle bundle) {
        if (hn6 != null && bundle != null) {
            try {
                md3 a = md3.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a.d;
                }
                try {
                    pd8 pd8 = new pd8(a.c, callingPid, callingUid);
                    k(hn6, new ic8(pd8, a.a, a.b, this.d.b(pd8), new ie8(hn6), a.e));
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for ConnectionRequest", e2);
            }
        }
    }

    public final void k(hn6 hn6, ic8 ic8) {
        if (hn6 != null) {
            cd8 cd8 = (cd8) this.c.get();
            if (cd8 == null || cd8.i()) {
                try {
                    hn6.c(0);
                } catch (RemoteException unused) {
                }
            } else {
                this.f.add(ic8);
                oze.W(cd8.l, new wc3((Object) this, (Object) ic8, (Object) cd8, (Object) hn6, 9));
            }
        }
    }

    public final void l0(hn6 hn6, int i2, Bundle bundle, boolean z) {
        if (hn6 != null && bundle != null) {
            try {
                K0(hn6, i2, 31, new ee8(new w48((Object) new eb4(l68.b(bundle), z, 2), 5, (Object) new be8(5)), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void m0(hn6 hn6) {
        if (hn6 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                cd8 cd8 = (cd8) this.c.get();
                if (cd8 != null) {
                    if (!cd8.i()) {
                        ic8 x = this.e.x(hn6.asBinder());
                        if (x != null) {
                            oze.W(cd8.l, new zo5(this, 25, x));
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public final void n0(hn6 hn6, int i2, int i3) {
        if (hn6 != null && i3 >= 0) {
            K0(hn6, i2, 25, N0(new x34(i3, 10)));
        }
    }

    public final void o0(hn6 hn6, int i2, Bundle bundle) {
        if (hn6 != null && bundle != null) {
            try {
                K0(hn6, i2, 13, N0(new e48(new wxa(bundle.getFloat(wxa.e, 1.0f), bundle.getFloat(wxa.f, 1.0f)), 2)));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for PlaybackParameters", e2);
            }
        }
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i2 != 1598968902) {
            boolean z = false;
            switch (i2) {
                case 3002:
                    y(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    break;
                case 3003:
                    n0(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3004:
                    z(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3005:
                    a0(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3006:
                    hn6 k = z48.k(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    w0(k, readInt, z);
                    break;
                case 3007:
                    l0(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR), true);
                    break;
                case 3008:
                    i(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR), parcel.readLong());
                    break;
                case 3009:
                    hn6 k2 = z48.k(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    Bundle bundle = (Bundle) a06.a(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    l0(k2, readInt2, bundle, z);
                    break;
                case 3010:
                    J(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                    break;
                case 3011:
                    hn6 k3 = z48.k(parcel.readStrongBinder());
                    int readInt3 = parcel.readInt();
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    J(k3, readInt3, readStrongBinder, z);
                    break;
                case 3012:
                    v(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    break;
                case 3013:
                    hn6 k4 = z48.k(parcel.readStrongBinder());
                    int readInt4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    c0(k4, readInt4, z);
                    break;
                case 3014:
                    a(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR));
                    break;
                case 3015:
                    j0(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR));
                    break;
                case 3016:
                    hn6 k5 = z48.k(parcel.readStrongBinder());
                    int readInt5 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    p0(k5, readInt5, (Bundle) a06.a(parcel, creator), (Bundle) a06.a(parcel, creator));
                    break;
                case 3017:
                    z0(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3018:
                    hn6 k6 = z48.k(parcel.readStrongBinder());
                    int readInt6 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    E0(k6, readInt6, z);
                    break;
                case 3019:
                    L(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3020:
                    K(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3021:
                    r0(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3022:
                    C0(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3023:
                    A0(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3024:
                    p(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3025:
                    e(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3026:
                    Y(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3027:
                    o0(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR));
                    break;
                case 3028:
                    x(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    break;
                case 3029:
                    hn6 k7 = z48.k(parcel.readStrongBinder());
                    int readInt7 = parcel.readInt();
                    Bundle bundle2 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                    if (!(k7 == null || bundle2 == null)) {
                        try {
                            K0(k7, readInt7, 20, new ee8(new w48((Object) new zd8(2, l68.b(bundle2)), 6, (Object) new x48(26)), 1));
                            break;
                        } catch (RuntimeException e2) {
                            ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
                            break;
                        }
                    }
                case 3030:
                    E(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR));
                    break;
                case 3031:
                    Q(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3032:
                    U(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3033:
                    u0(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR));
                    break;
                case 3034:
                    x0(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3035:
                    e0(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3036:
                    S(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3037:
                    Z(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3038:
                    X(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    break;
                case 3039:
                    P(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    break;
                case 3040:
                    G(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3041:
                    C(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3042:
                    V(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3043:
                    w(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3044:
                    i0(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Surface) a06.a(parcel, Surface.CREATOR));
                    break;
                case 3045:
                    m0(z48.k(parcel.readStrongBinder()));
                    break;
                case 3046:
                    v0(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3047:
                    O(z48.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3048:
                    B(z48.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR));
                    break;
                case 3049:
                    hn6 k8 = z48.k(parcel.readStrongBinder());
                    int readInt8 = parcel.readInt();
                    String readString = parcel.readString();
                    Bundle bundle3 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                    if (!(k8 == null || readString == null || bundle3 == null)) {
                        if (!TextUtils.isEmpty(readString)) {
                            try {
                                R(k8, readInt8, (v1d) null, 40010, new ee8(new x48(readString, 23, ayb.a(bundle3)), 1));
                                break;
                            } catch (RuntimeException e3) {
                                ez3.k0("Ignoring malformed Bundle for Rating", e3);
                                break;
                            }
                        } else {
                            ez3.j0("setRatingWithMediaId(): Ignoring empty mediaId");
                            break;
                        }
                    }
                case 3050:
                    hn6 k9 = z48.k(parcel.readStrongBinder());
                    int readInt9 = parcel.readInt();
                    Bundle bundle4 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                    if (!(k9 == null || bundle4 == null)) {
                        try {
                            ayb.a(bundle4);
                            R(k9, readInt9, (v1d) null, 40010, new ee8(new be8(6), 1));
                            break;
                        } catch (RuntimeException e4) {
                            ez3.k0("Ignoring malformed Bundle for Rating", e4);
                            break;
                        }
                    }
                case 3051:
                    s(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3052:
                    F(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3053:
                    I(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3054:
                    hn6 k10 = z48.k(parcel.readStrongBinder());
                    int readInt10 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    s0(k10, readInt10, z, parcel.readInt());
                    break;
                case 3055:
                    D0(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) a06.a(parcel, Bundle.CREATOR));
                    break;
                case 3056:
                    N(z48.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3057:
                    hn6 k11 = z48.k(parcel.readStrongBinder());
                    int readInt11 = parcel.readInt();
                    Bundle bundle5 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    d(k11, readInt11, bundle5, z);
                    break;
                default:
                    switch (i2) {
                        case 4001:
                            hn6 k12 = z48.k(parcel.readStrongBinder());
                            int readInt12 = parcel.readInt();
                            Bundle bundle6 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                            if (k12 != null) {
                                if (bundle6 != null) {
                                    try {
                                        h78.a(bundle6);
                                    } catch (RuntimeException e5) {
                                        ez3.k0("Ignoring malformed Bundle for LibraryParams", e5);
                                        break;
                                    }
                                }
                                R(k12, readInt12, (v1d) null, 50000, new ee8(new x48(29), 0));
                                break;
                            }
                            break;
                        case 4002:
                            hn6 k13 = z48.k(parcel.readStrongBinder());
                            int readInt13 = parcel.readInt();
                            String readString2 = parcel.readString();
                            if (k13 != null) {
                                if (!TextUtils.isEmpty(readString2)) {
                                    R(k13, readInt13, (v1d) null, 50004, new ee8(new x48(20), 0));
                                    break;
                                } else {
                                    ez3.j0("getItem(): Ignoring empty mediaId");
                                    break;
                                }
                            }
                            break;
                        case 4003:
                            hn6 k14 = z48.k(parcel.readStrongBinder());
                            int readInt14 = parcel.readInt();
                            String readString3 = parcel.readString();
                            int readInt15 = parcel.readInt();
                            int readInt16 = parcel.readInt();
                            Bundle bundle7 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                            if (k14 != null) {
                                if (!TextUtils.isEmpty(readString3)) {
                                    if (readInt15 >= 0) {
                                        if (readInt16 >= 1) {
                                            if (bundle7 != null) {
                                                try {
                                                    h78.a(bundle7);
                                                } catch (RuntimeException e6) {
                                                    ez3.k0("Ignoring malformed Bundle for LibraryParams", e6);
                                                    break;
                                                }
                                            }
                                            R(k14, readInt14, (v1d) null, 50003, new ee8(new x48(12), 0));
                                            break;
                                        } else {
                                            ez3.j0("getChildren(): Ignoring pageSize less than 1");
                                            break;
                                        }
                                    } else {
                                        ez3.j0("getChildren(): Ignoring negative page");
                                        break;
                                    }
                                } else {
                                    ez3.j0("getChildren(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        case 4004:
                            hn6 k15 = z48.k(parcel.readStrongBinder());
                            int readInt17 = parcel.readInt();
                            String readString4 = parcel.readString();
                            Bundle bundle8 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                            if (k15 != null) {
                                if (!TextUtils.isEmpty(readString4)) {
                                    if (bundle8 != null) {
                                        try {
                                            h78.a(bundle8);
                                        } catch (RuntimeException e7) {
                                            ez3.k0("Ignoring malformed Bundle for LibraryParams", e7);
                                            break;
                                        }
                                    }
                                    R(k15, readInt17, (v1d) null, 50005, new ee8(new be8(4), 0));
                                    break;
                                } else {
                                    ez3.j0("search(): Ignoring empty query");
                                    break;
                                }
                            }
                            break;
                        case 4005:
                            hn6 k16 = z48.k(parcel.readStrongBinder());
                            int readInt18 = parcel.readInt();
                            String readString5 = parcel.readString();
                            int readInt19 = parcel.readInt();
                            int readInt20 = parcel.readInt();
                            Bundle bundle9 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                            if (k16 != null) {
                                if (!TextUtils.isEmpty(readString5)) {
                                    if (readInt19 >= 0) {
                                        if (readInt20 >= 1) {
                                            if (bundle9 != null) {
                                                try {
                                                    h78.a(bundle9);
                                                } catch (RuntimeException e8) {
                                                    ez3.k0("Ignoring malformed Bundle for LibraryParams", e8);
                                                    break;
                                                }
                                            }
                                            R(k16, readInt18, (v1d) null, 50006, new ee8(new x48(27), 0));
                                            break;
                                        } else {
                                            ez3.j0("getSearchResult(): Ignoring pageSize less than 1");
                                            break;
                                        }
                                    } else {
                                        ez3.j0("getSearchResult(): Ignoring negative page");
                                        break;
                                    }
                                } else {
                                    ez3.j0("getSearchResult(): Ignoring empty query");
                                    break;
                                }
                            }
                            break;
                        case 4006:
                            hn6 k17 = z48.k(parcel.readStrongBinder());
                            int readInt21 = parcel.readInt();
                            String readString6 = parcel.readString();
                            Bundle bundle10 = (Bundle) a06.a(parcel, Bundle.CREATOR);
                            if (k17 != null) {
                                if (!TextUtils.isEmpty(readString6)) {
                                    if (bundle10 != null) {
                                        try {
                                            h78.a(bundle10);
                                        } catch (RuntimeException e9) {
                                            ez3.k0("Ignoring malformed Bundle for LibraryParams", e9);
                                            break;
                                        }
                                    }
                                    R(k17, readInt21, (v1d) null, 50001, new ee8(new be8(2), 0));
                                    break;
                                } else {
                                    ez3.j0("subscribe(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        case 4007:
                            hn6 k18 = z48.k(parcel.readStrongBinder());
                            int readInt22 = parcel.readInt();
                            String readString7 = parcel.readString();
                            if (k18 != null) {
                                if (!TextUtils.isEmpty(readString7)) {
                                    R(k18, readInt22, (v1d) null, 50002, new ee8(new x48(11), 0));
                                    break;
                                } else {
                                    ez3.j0("unsubscribe(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        default:
                            return super.onTransact(i2, parcel, parcel2, i3);
                    }
            }
            return true;
        }
        parcel2.writeString("androidx.media3.session.IMediaSession");
        return true;
    }

    public final void p(hn6 hn6, int i2) {
        ic8 x;
        if (hn6 != null && (x = this.e.x(hn6.asBinder())) != null) {
            L0(x, i2, 1, N0(new w48((Object) this, 4, (Object) x)));
        }
    }

    public final void p0(hn6 hn6, int i2, Bundle bundle, Bundle bundle2) {
        if (hn6 != null && bundle != null && bundle2 != null) {
            try {
                v1d a = v1d.a(bundle);
                R(hn6, i2, a, 0, new ee8(new x48(a, 17, bundle2), 1));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for SessionCommand", e2);
            }
        }
    }

    public final void r0(hn6 hn6, int i2) {
        if (hn6 != null) {
            K0(hn6, i2, 20, N0(new be8(3)));
        }
    }

    public final void s(hn6 hn6, int i2, int i3, int i4) {
        if (hn6 != null && i3 >= 0) {
            K0(hn6, i2, 33, N0(new a45(i3, i4, 3)));
        }
    }

    public final void s0(hn6 hn6, int i2, boolean z, int i3) {
        if (hn6 != null) {
            K0(hn6, i2, 34, N0(new bi3(z, i3)));
        }
    }

    public final void u0(hn6 hn6, int i2, Bundle bundle) {
        if (hn6 != null && bundle != null) {
            try {
                K0(hn6, i2, 19, N0(new y35(z78.b(bundle), 2)));
            } catch (RuntimeException e2) {
                ez3.k0("Ignoring malformed Bundle for MediaMetadata", e2);
            }
        }
    }

    public final void v(hn6 hn6, int i2, IBinder iBinder, int i3, long j) {
        if (hn6 != null && iBinder != null) {
            if (i3 == -1 || i3 >= 0) {
                try {
                    ws6 a = it0.a(iBinder);
                    ts6 i4 = ws6.i();
                    for (int i5 = 0; i5 < a.size(); i5++) {
                        Bundle bundle = (Bundle) a.get(i5);
                        bundle.getClass();
                        i4.a(l68.b(bundle));
                    }
                    K0(hn6, i2, 20, new ee8(new w48((Object) new b44((Object) i4.j(), i3, j, 5), 5, (Object) new be8(5)), 1));
                } catch (RuntimeException e2) {
                    ez3.k0("Ignoring malformed Bundle for MediaItem", e2);
                }
            }
        }
    }

    public final void v0(hn6 hn6, int i2) {
        ic8 x;
        if (hn6 != null && (x = this.e.x(hn6.asBinder())) != null) {
            L0(x, i2, 7, N0(new x48(18)));
        }
    }

    public final void w(hn6 hn6, int i2) {
        if (hn6 != null) {
            K0(hn6, i2, 8, N0(new x48(14)));
        }
    }

    public final void w0(hn6 hn6, int i2, boolean z) {
        if (hn6 != null) {
            K0(hn6, i2, 26, N0(new cz0(z, 8)));
        }
    }

    public final void x(hn6 hn6, int i2, float f2) {
        if (hn6 != null && f2 > 0.0f) {
            K0(hn6, i2, 13, N0(new u35(3, f2)));
        }
    }

    public final void x0(hn6 hn6, int i2) {
        ic8 x;
        if (hn6 != null && (x = this.e.x(hn6.asBinder())) != null) {
            L0(x, i2, 3, N0(new x48(28)));
        }
    }

    public final void y(hn6 hn6, int i2, float f2) {
        if (hn6 != null && f2 >= 0.0f && f2 <= 1.0f) {
            K0(hn6, i2, 24, N0(new u35(4, f2)));
        }
    }

    public final void z(hn6 hn6, int i2) {
        if (hn6 != null) {
            K0(hn6, i2, 26, N0(new x48(15)));
        }
    }

    public final void z0(hn6 hn6, int i2, int i3) {
        if (hn6 != null) {
            if (i3 == 2 || i3 == 0 || i3 == 1) {
                K0(hn6, i2, 15, N0(new x34(i3, 9)));
            }
        }
    }
}
