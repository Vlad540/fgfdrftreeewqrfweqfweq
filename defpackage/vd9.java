package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: vd9  reason: default package */
public final class vd9 extends u2 implements nwc, mwc {
    public final pwc A0;
    public final bf5 B0;
    public final f94 C0;
    public final g15 D0;
    public final boolean E0;
    public final boolean F0;
    public pn1 G0;
    public pn1 H0;
    public tk7 X;
    public final n2f Y;
    public List Z;
    public final nd9 c;
    public ol7 o;
    public long w0;
    public f3f x0;
    public kpa y0;
    public final bd z0;

    /* JADX WARNING: type inference failed for: r3v1, types: [nl7, java.lang.Object] */
    public vd9(ze9 ze9, nd9 nd9, boolean z, boolean z2, bd bdVar, pwc pwc, mg5 mg5, f94 f94, g15 g15, n2f n2f) {
        super(0, (Object) ze9);
        this.c = nd9;
        this.E0 = z;
        this.F0 = z2;
        this.A0 = pwc;
        this.z0 = bdVar;
        this.B0 = mg5;
        this.C0 = f94;
        this.D0 = g15;
        this.Y = n2f;
        ze9.t(this);
        ? obj = new Object();
        obj.b = false;
        obj.d = z;
        obj.e = false;
        obj.a();
        obj.j = qjb.P_2160;
        obj.l = 0;
        obj.p = false;
        if (pwc.l == 2) {
            obj.b = false;
        }
        ol7 ol7 = new ol7(obj);
        this.o = ol7;
        ze9.A(ol7);
    }

    public final void B1(Set set) {
        f2(new od9(this, 4));
    }

    public final boolean Z1() {
        tk7 tk7 = this.X;
        return tk7 != null && tk7.a == 1 && !tk7.d();
    }

    public final void a2(tk7 tk7) {
        udd.p("vd9", "setLocalMedia: %s", new Object[]{tk7.c});
        this.X = tk7;
        this.y0 = this.A0.e(tk7);
        tic.b(this.G0);
        tic.b(this.H0);
        if (tk7.b()) {
            f2(new od9(this, 2));
            udd.q("vd9", "setupVideoLocalMedia");
            tic.b(this.G0);
            if ((!(tk7 instanceof mz) || !r1g.p(((mz) tk7).y0.r)) && this.F0) {
                f2(new sr1(14));
                udd.q("vd9", "initVideoLocalMedias");
                mhd mhd = new mhd(new mv9(1, new qd9(this, 1)).m(cnc.a()).i(de.a()), new qd9(this, 4), 2);
                f5 f5Var = new f5(14, this);
                pn1 pn1 = new pn1(z3d.j, 2, z3d.k);
                Objects.requireNonNull(pn1, "observer is null");
                try {
                    mhd.k(new i73(pn1, 7, f5Var));
                    this.G0 = pn1;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    ek8.a0(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else {
                udd.q("vd9", "localMedia instanceof EditAttachLocalMedia -> can't edit video -> hide controls");
                f2(new sr1(13));
            }
        } else if (tk7.a != 1 || tk7.d()) {
            f2(new sr1(12));
        } else {
            f2(new od9(this, 3));
            f2(new od9(this, 5));
            f2(new od9(this, 1));
            f2(new od9(this, 0));
        }
        f2(new od9(this, 4));
    }

    public final void b2(Uri uri, File file, Uri uri2, File file2, jw3 jw3) {
        udd.q("vd9", "startCrop()");
        kpa kpa = this.y0;
        Uri uri3 = kpa != null ? kpa.X : null;
        if (uri3 != null) {
            udd.q("vd9", "startCrop() media has overlay, processing");
            f94 f94 = this.C0;
            f94.getClass();
            new o73(new dhd[]{new mv9(1, new xz((Object) f94, (Object) uri, (Object) uri3, 21)), uri2 != null ? new mv9(1, new xz((Object) f94, (Object) uri2, (Object) uri3, 21)) : dhd.g(Uri.EMPTY)}, 6, new mb1(11, new dd9(5))).k(new pn1(new xz((Object) this, (Object) file, (Object) file2, 20), 2, new qd9(this, 3)));
            return;
        }
        ((ActLocalMedias) this.c).r0(uri, file, uri2, file2, jw3);
    }

    public final void c2() {
        Set<d66> set;
        tk7 tk7 = this.X;
        if (tk7 != null) {
            boolean b = tk7.b();
            pwc pwc = this.A0;
            if (!b) {
                tk7 tk72 = this.X;
                if (tk72.a != 1) {
                    pwc.r(tk72);
                } else if (pwc.j(tk72)) {
                    rwc h = pwc.h(this.X);
                    if (h != null) {
                        h.f = false;
                    }
                    pwc.n();
                    if (h != null && (set = pwc.e) != null) {
                        for (d66 a : set) {
                            try {
                                a.a(h);
                            } catch (Throwable th) {
                                throw new RuntimeException(th);
                            }
                        }
                    }
                } else {
                    pwc.r(this.X);
                }
            } else if (pwc.j(this.X)) {
                pwc.r(this.X);
            } else {
                e2();
            }
        }
    }

    public final void d2() {
        tk7 tk7 = this.X;
        kpa kpa = this.y0;
        pwc pwc = this.A0;
        pwc.a(tk7, pwc.a.size());
        rwc h = pwc.h(tk7);
        if (h != null) {
            h.c = kpa;
        }
        pwc.b.put(Long.valueOf(tk7.b), kpa);
        pwc.m(h);
    }

    public final void e2() {
        Object obj;
        boolean z;
        f3f f3f = this.x0;
        pwc pwc = this.A0;
        if (f3f == null) {
            pwc.q(this.X, (f3f) null);
            return;
        }
        List list = this.Z;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                try {
                    if (((rjb) obj).a == this.x0.a) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            rjb rjb = (rjb) obj;
            if (rjb == null || rjb.f) {
                f3f f3f2 = this.x0;
                if (f3f2.b == 0.0f && f3f2.c == 1.0f && !f3f2.d) {
                    pwc.q(this.X, (f3f) null);
                }
            }
            pwc.q(this.X, this.x0);
            return;
        }
        obj = null;
        rjb rjb2 = (rjb) obj;
        f3f f3f22 = this.x0;
        pwc.q(this.X, (f3f) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [nl7, java.lang.Object] */
    public final void f2(t26 t26) {
        ol7 ol7 = this.o;
        ? obj = new Object();
        obj.a = ol7.a;
        obj.b = ol7.b;
        obj.c = ol7.c;
        obj.d = ol7.o;
        obj.e = ol7.X;
        obj.f = ol7.Y;
        obj.g = ol7.Z;
        obj.h = ol7.w0;
        obj.i = ol7.x0;
        obj.j = ol7.y0;
        obj.k = ol7.z0;
        obj.l = ol7.A0;
        obj.m = ol7.B0;
        obj.n = ol7.C0;
        obj.o = ol7.D0;
        obj.p = ol7.E0;
        obj.q = ol7.F0;
        nl7 nl7 = (nl7) t26.apply(obj);
        nl7.getClass();
        ol7 ol72 = new ol7(nl7);
        if (!ol72.equals(this.o)) {
            udd.p("vd9", "updateViewState: %s", new Object[]{this.o});
            this.o = ol72;
            ((ze9) ((ge9) this.b)).A(ol72);
        }
    }

    public final void s1(rwc rwc) {
        f2(new od9(this, 0));
        f2(new od9(this, 1));
        f2(new od9(this, 5));
    }
}
