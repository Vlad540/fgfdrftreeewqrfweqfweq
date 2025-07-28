package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a implements ok {
    public static final ib5[] N0 = new ib5[0];
    public y2g A0;
    public int B0;
    public final sbf C0;
    public final k2e D0;
    public final int E0;
    public final String F0;
    public volatile String G0;
    public nd3 H0;
    public boolean I0;
    public volatile p4g J0;
    public final AtomicInteger K0;
    public final Set L0;
    public final Account M0;
    public final p1g X;
    public final Object Y;
    public final Object Z;
    public volatile String a;
    public ns8 b;
    public final Context c;
    public final c6g o;
    public z0g w0;
    public mh0 x0;
    public IInterface y0;
    public final ArrayList z0;

    public a(Context context, Looper looper, int i, h2d h2d, oa6 oa6, pa6 pa6) {
        synchronized (c6g.h) {
            try {
                if (c6g.i == null) {
                    c6g.i = new c6g(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        c6g c6g = c6g.i;
        Object obj = ma6.c;
        a24.o(oa6);
        a24.o(pa6);
        sbf sbf = new sbf(oa6);
        k2e k2e = new k2e(pa6);
        this.a = null;
        this.Y = new Object();
        this.Z = new Object();
        this.z0 = new ArrayList();
        this.B0 = 1;
        this.H0 = null;
        this.I0 = false;
        this.J0 = null;
        this.K0 = new AtomicInteger(0);
        a24.p(context, "Context must not be null");
        this.c = context;
        a24.p(looper, "Looper must not be null");
        a24.p(c6g, "Supervisor must not be null");
        this.o = c6g;
        this.X = new p1g(this, looper);
        this.E0 = i;
        this.C0 = sbf;
        this.D0 = k2e;
        this.F0 = (String) h2d.X;
        this.M0 = (Account) h2d.a;
        Set<Scope> set = (Set) h2d.c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.L0 = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.Y) {
            try {
                if (aVar.B0 != i) {
                    return false;
                }
                aVar.v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set a() {
        return j() ? this.L0 : Collections.emptySet();
    }

    public final void b(String str) {
        this.a = str;
        disconnect();
    }

    public final boolean c() {
        boolean z;
        synchronized (this.Y) {
            int i = this.B0;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final void d() {
        if (!isConnected() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void disconnect() {
        this.K0.incrementAndGet();
        synchronized (this.z0) {
            try {
                int size = this.z0.size();
                for (int i = 0; i < size; i++) {
                    v0g v0g = (v0g) this.z0.get(i);
                    synchronized (v0g) {
                        v0g.a = null;
                    }
                }
                this.z0.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.Z) {
            this.w0 = null;
        }
        v(1, (IInterface) null);
    }

    public final void e(mh0 mh0) {
        this.x0 = mh0;
        v(2, (IInterface) null);
    }

    public final void f(vbe vbe) {
        ((dzf) vbe.a).o.B0.post(new lde(13, (Object) vbe));
    }

    public final ib5[] h() {
        p4g p4g = this.J0;
        if (p4g == null) {
            return null;
        }
        return p4g.b;
    }

    public final String i() {
        return this.a;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.Y) {
            z = this.B0 == 4;
        }
        return z;
    }

    public boolean j() {
        return false;
    }

    public final void k(an6 an6, Set set) {
        Set set2 = set;
        Bundle n = n();
        String str = this.G0;
        int i = na6.a;
        Scope[] scopeArr = x86.D0;
        Bundle bundle = new Bundle();
        int i2 = this.E0;
        ib5[] ib5Arr = x86.E0;
        x86 x86 = r3;
        x86 x862 = new x86(6, i2, i, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, ib5Arr, ib5Arr, true, 0, false, str);
        x86 x863 = x86;
        x863.o = this.c.getPackageName();
        x863.Z = n;
        if (set2 != null) {
            x863.Y = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (j()) {
            Account account = this.M0;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            x863.w0 = account;
            if (an6 != null) {
                x863.X = an6.asBinder();
            }
        }
        x863.x0 = N0;
        x863.y0 = m();
        if (t()) {
            x863.B0 = true;
        }
        try {
            synchronized (this.Z) {
                z0g z0g = this.w0;
                if (z0g != null) {
                    z0g.k(new n2g(this, this.K0.get()), x863);
                }
            }
        } catch (DeadObjectException unused) {
            int i3 = this.K0.get();
            p1g p1g = this.X;
            p1g.sendMessage(p1g.obtainMessage(6, i3, 3));
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            int i4 = this.K0.get();
            q3g q3g = new q3g(this, 8, (IBinder) null, (Bundle) null);
            p1g p1g2 = this.X;
            p1g2.sendMessage(p1g2.obtainMessage(1, i4, -1, q3g));
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract IInterface l(IBinder iBinder);

    public ib5[] m() {
        return N0;
    }

    public Bundle n() {
        return new Bundle();
    }

    public final IInterface o() {
        IInterface iInterface;
        synchronized (this.Y) {
            try {
                if (this.B0 == 5) {
                    throw new DeadObjectException();
                } else if (isConnected()) {
                    iInterface = this.y0;
                    a24.p(iInterface, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String p();

    public abstract String q();

    public boolean r() {
        return g() >= 211700000;
    }

    public void s() {
        System.currentTimeMillis();
    }

    public boolean t() {
        return this instanceof p2g;
    }

    public final void v(int i, IInterface iInterface) {
        ns8 ns8;
        boolean z = false;
        boolean z2 = i == 4;
        if (iInterface != null) {
            z = true;
        }
        if (z2 == z) {
            synchronized (this.Y) {
                try {
                    this.B0 = i;
                    this.y0 = iInterface;
                    if (i == 1) {
                        y2g y2g = this.A0;
                        if (y2g != null) {
                            c6g c6g = this.o;
                            String str = this.b.c;
                            a24.o(str);
                            this.b.getClass();
                            if (this.F0 == null) {
                                this.c.getClass();
                            }
                            c6g.a(str, y2g, this.b.b);
                            this.A0 = null;
                        }
                    } else if (i == 2 || i == 3) {
                        y2g y2g2 = this.A0;
                        if (!(y2g2 == null || (ns8 = this.b) == null)) {
                            String str2 = ns8.c;
                            c6g c6g2 = this.o;
                            a24.o(str2);
                            this.b.getClass();
                            if (this.F0 == null) {
                                this.c.getClass();
                            }
                            c6g2.a(str2, y2g2, this.b.b);
                            this.K0.incrementAndGet();
                        }
                        y2g y2g3 = new y2g(this, this.K0.get());
                        this.A0 = y2g3;
                        String q = q();
                        boolean r = r();
                        this.b = new ns8(q, r, 2);
                        if (r) {
                            if (g() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.c)));
                            }
                        }
                        c6g c6g3 = this.o;
                        String str3 = this.b.c;
                        a24.o(str3);
                        this.b.getClass();
                        String str4 = this.F0;
                        if (str4 == null) {
                            str4 = this.c.getClass().getName();
                        }
                        if (!c6g3.b(new k5g(str3, this.b.b), y2g3, str4)) {
                            String str5 = this.b.c;
                            int i2 = this.K0.get();
                            v3g v3g = new v3g(this, 16);
                            p1g p1g = this.X;
                            p1g.sendMessage(p1g.obtainMessage(7, i2, -1, v3g));
                        }
                    } else if (i == 4) {
                        a24.o(iInterface);
                        System.currentTimeMillis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
