package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* renamed from: ad8  reason: default package */
public final class ad8 implements hya {
    public final WeakReference a;
    public final WeakReference b;

    public ad8(cd8 cd8, qza qza) {
        this.a = new WeakReference(cd8);
        this.b = new WeakReference(qza);
    }

    public final void H(int i, l68 l68) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                fza fza2 = r2;
                n2d n2d2 = n2d;
                fza fza3 = new fza(fza.a, i, n2d2, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, fza.z, fza.A, fza.B, fza.C, fza.D, fza.E);
                a2.r = fza2;
                a2.c.a(true, true);
                try {
                    a2.h.h.s(l68);
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void O(boolean z) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.k(z);
                a2.c.a(true, true);
                try {
                    a2.h.h.C(z);
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void S(vw3 vw3) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                PlaybackException playbackException = fza.a;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                spe spe = fza.D;
                mpe mpe = fza.E;
                fza fza2 = r2;
                int i = fza.b;
                fza fza3 = new fza(playbackException, i, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, vw3, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, fza.z, fza.A, fza.B, fza.C, spe, mpe);
                a2.r = fza2;
                a2.c.a(true, true);
            }
        }
    }

    public final void X(spe spe) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.b(spe);
                a2.c.a(true, false);
                a2.c(new x48(8));
            }
        }
    }

    public final cd8 a() {
        return (cd8) this.a.get();
    }

    public final void a0(long j) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                fza fza2 = r2;
                fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, fza.z, j, fza.B, fza.C, fza.D, fza.E);
                a2.r = fza2;
                a2.c.a(true, true);
                try {
                    a2.h.h.getClass();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void b(int i) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                a2.r = fza.d(fza.u, i, fza.t);
                a2.c.a(true, true);
                try {
                    a2.h.h.w();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void b0(z78 z78) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                long j = fza.B;
                long j2 = fza.C;
                fza fza2 = r2;
                fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, z78, fza.A, j, j2, fza.D, fza.E);
                a2.r = fza2;
                a2.c.a(true, true);
                try {
                    a2.h.h.E();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void c(boolean z) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                fza fza2 = r2;
                fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, z, fza.z, fza.A, fza.B, fza.C, fza.D, fza.E);
                cd8 cd8 = a2;
                cd8.r = fza2;
                cd8.c.a(true, true);
                try {
                    cd8.h.h.getClass();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
                cd8.t();
            }
        }
    }

    public final void c0(z78 z78) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            a2.r = a2.r.g(z78);
            a2.c.a(true, true);
            try {
                a2.h.h.z(z78);
            } catch (RemoteException e) {
                ez3.B("Exception in using media1 API", e);
            }
        }
    }

    public final void d(int i, boolean z) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                a2.r = fza.d(i, fza.x, z);
                a2.c.a(true, true);
                try {
                    a2.h.h.t();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void d0(long j) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                fza fza2 = r2;
                fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, fza.z, fza.A, j, fza.C, fza.D, fza.E);
                a2.r = fza2;
                a2.c.a(true, true);
                try {
                    a2.h.h.getClass();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void f(float f) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            a2.r = a2.r.p(f);
            a2.c.a(true, true);
            try {
                a2.h.h.getClass();
            } catch (RemoteException e) {
                ez3.B("Exception in using media1 API", e);
            }
        }
    }

    public final void f0(vje vje, int i) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            qza qza = (qza) this.b.get();
            if (qza != null) {
                a2.r = a2.r.n(vje, qza.K(), i);
                a2.c.a(false, true);
                try {
                    a2.h.h.D(vje);
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void h(int i) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            qza qza = (qza) this.b.get();
            if (qza != null) {
                a2.r = a2.r.f(i, qza.X());
                a2.c.a(true, true);
                try {
                    kd8 kd8 = a2.h.h;
                    qza.X();
                    kd8.v();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void i(int i, boolean z) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.c(i, z);
                a2.c.a(true, true);
                try {
                    a2.h.h.q(i, z);
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void i0() {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            a2.c(new x48(10));
        }
    }

    public final void n(boolean z) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                fza fza2 = r2;
                fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, z, fza.w, fza.z, fza.A, fza.B, fza.C, fza.D, fza.E);
                cd8 cd8 = a2;
                cd8.r = fza2;
                cd8.c.a(true, true);
                try {
                    cd8.h.h.r();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
                cd8.t();
            }
        }
    }

    public final void onRepeatModeChanged(int i) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.i(i);
                a2.c.a(true, true);
                try {
                    a2.h.h.B(i);
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void p0(wxa wxa) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.e(wxa);
                a2.c.a(true, true);
                try {
                    a2.h.h.u();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void q(jya jya, jya jya2, int i) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.h(jya, jya2, i);
                a2.c.a(true, true);
                try {
                    a2.h.h.A();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void q0(eya eya) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.f(eya);
            }
        }
    }

    public final void t0(uf4 uf4) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                long j = fza.B;
                long j2 = fza.C;
                fza fza2 = r2;
                fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, uf4, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, fza.z, fza.A, j, j2, fza.D, fza.E);
                a2.r = fza2;
                a2.c.a(true, true);
                try {
                    a2.h.h.p();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void u0(long j) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                fza fza2 = r2;
                fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, fza.l, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, fza.z, fza.A, fza.B, j, fza.D, fza.E);
                a2.r = fza2;
                a2.c.a(true, true);
            }
        }
    }

    public final void v(k20 k20) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.a(k20);
                a2.c.a(true, true);
                try {
                    a2.h.h.o(k20);
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void w(r8f r8f) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            fza fza = a2.r;
            vje vje = fza.j;
            boolean q = vje.q();
            n2d n2d = fza.c;
            oyb.k(q || n2d.a.b < vje.p());
            long j = fza.B;
            long j2 = fza.C;
            fza fza2 = r2;
            fza fza3 = new fza(fza.a, fza.b, n2d, fza.d, fza.e, fza.f, fza.g, fza.h, fza.i, r8f, vje, fza.k, fza.m, fza.n, fza.o, fza.p, fza.q, fza.r, fza.s, fza.t, fza.u, fza.x, fza.y, fza.v, fza.w, fza.z, fza.A, j, j2, fza.D, fza.E);
            a2.r = fza2;
            a2.c.a(true, true);
            try {
                a2.h.h.getClass();
            } catch (RemoteException e) {
                ez3.B("Exception in using media1 API", e);
            }
        }
    }

    public final void x0(PlaybackException playbackException) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                fza fza = a2.r;
                vje vje = fza.j;
                boolean q = vje.q();
                n2d n2d = fza.c;
                oyb.k(q || n2d.a.b < vje.p());
                long j = fza.B;
                long j2 = fza.C;
                int i = fza.b;
                jya jya = fza.d;
                jya jya2 = fza.e;
                int i2 = fza.f;
                wxa wxa = fza.g;
                int i3 = fza.h;
                boolean z = fza.i;
                r8f r8f = fza.l;
                int i4 = fza.k;
                fza fza2 = r2;
                z78 z78 = fza.m;
                float f = fza.n;
                k20 k20 = fza.o;
                vw3 vw3 = fza.p;
                uf4 uf4 = fza.q;
                int i5 = fza.r;
                boolean z2 = fza.s;
                boolean z3 = fza.t;
                int i6 = fza.u;
                int i7 = fza.x;
                int i8 = fza.y;
                boolean z4 = fza.v;
                boolean z5 = fza.w;
                z78 z782 = fza.z;
                n2d n2d2 = n2d;
                mpe mpe = fza.E;
                n2d n2d3 = n2d2;
                fza fza3 = new fza(playbackException, i, n2d2, jya, jya2, i2, wxa, i3, z, r8f, vje, i4, z78, f, k20, vw3, uf4, i5, z2, z3, i6, i7, i8, z4, z5, z782, fza.A, j, j2, fza.D, mpe);
                a2.r = fza2;
                a2.c.a(true, true);
                try {
                    a2.h.h.y();
                } catch (RemoteException e) {
                    ez3.B("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void z(mpe mpe) {
        cd8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((qza) this.b.get()) != null) {
                a2.r = a2.r.o(mpe);
                a2.c.a(true, true);
                a2.c(new x48(9));
            }
        }
    }
}
