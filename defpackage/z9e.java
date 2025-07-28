package defpackage;

import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: z9e  reason: default package */
public final class z9e implements pw5 {
    public final ArrayList X;
    public boolean Y = false;
    public final ArrayDeque a = new ArrayDeque();
    public final c9 b;
    public s86 c;
    public xac o;

    public z9e(c9 c9Var) {
        gt0.i();
        this.b = c9Var;
        this.X = new ArrayList();
    }

    public final void a(lr6 lr6) {
        pa2.A().execute(new y9e(this, 1));
    }

    public final void b() {
        gt0.i();
        Exception exc = new Exception("Camera is closed.", (Throwable) null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            fb0 fb0 = (fb0) it.next();
            fb0.getClass();
            fb0.b.execute(new sbc(fb0, 27, exc));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.X).iterator();
        while (it2.hasNext()) {
            xac xac = (xac) it2.next();
            xac.getClass();
            gt0.i();
            if (!xac.d.b.isDone()) {
                gt0.i();
                xac.g = true;
                ch7 ch7 = xac.i;
                Objects.requireNonNull(ch7);
                ch7.cancel(true);
                xac.e.d(exc);
                xac.f.b((Object) null);
                gt0.i();
                fb0 fb02 = xac.a;
                fb02.getClass();
                fb02.b.execute(new sbc(fb02, 27, exc));
            }
        }
    }

    public final void c() {
        fb0 fb0;
        boolean z = false;
        gt0.i();
        if (this.o == null && !this.Y) {
            s86 s86 = this.c;
            s86.getClass();
            gt0.i();
            if (((j54) s86.c).C() != 0 && (fb0 = (fb0) this.a.poll()) != null) {
                xac xac = new xac(fb0, this);
                e07.p((String) null, !(this.o != null));
                this.o = xac;
                gt0.i();
                xac.c.b.c(new y9e(this, 0), pa2.j());
                this.X.add(xac);
                gt0.i();
                xac.d.b.c(new sbc(this, 26, xac), pa2.j());
                s86 s862 = this.c;
                gt0.i();
                vn1 vn1 = xac.c;
                s862.getClass();
                gt0.i();
                nw1 nw1 = (nw1) ((cq6) s862.a).d(cq6.o, new nw1(Arrays.asList(new xw1[]{new xw1()})));
                Objects.requireNonNull(nw1);
                int i = s86.Y;
                s86.Y = i + 1;
                ArrayList arrayList = new ArrayList();
                String valueOf = String.valueOf(nw1.hashCode());
                List<xw1> list = nw1.a;
                Objects.requireNonNull(list);
                for (xw1 xw1 : list) {
                    w30 w30 = new w30();
                    pw1 pw1 = (pw1) s862.b;
                    w30.c = pw1.c;
                    w30.c(pw1.b);
                    w30.a(fb0.i);
                    x80 x80 = (x80) s862.X;
                    cs6 cs6 = x80.b;
                    Objects.requireNonNull(cs6);
                    ((HashSet) w30.e).add(cs6);
                    w30.a = x80.c != null ? true : z;
                    if (am7.u(x80.e)) {
                        if (((ImageCaptureRotationOptionQuirk) wf4.a.j(ImageCaptureRotationOptionQuirk.class)) != null) {
                            z80 z80 = pw1.i;
                        } else {
                            ((fc9) w30.f).j(pw1.i, Integer.valueOf(fb0.f));
                        }
                        z80 z802 = pw1.j;
                        hqe.b(fb0.d, x80.d);
                        ((fc9) w30.f).j(z802, Integer.valueOf(fb0.g));
                    }
                    w30.c(xw1.a.b);
                    ((nc9) w30.g).a.put(valueOf, 0);
                    ((nc9) w30.g).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
                    w30.b(x80.a);
                    arrayList.add(w30.d());
                    z = false;
                }
                boolean z2 = z;
                qe4 qe4 = new qe4((Object) arrayList, 10, (Object) xac);
                s4b s4b = new s4b(nw1, fb0.d, fb0.f, fb0.g, fb0.e, xac, vn1, i);
                s86 s863 = this.c;
                s863.getClass();
                gt0.i();
                ((x80) s863.X).j.accept(s4b);
                gt0.i();
                bq6 bq6 = (bq6) this.b.b;
                synchronized (bq6.q) {
                    try {
                        if (bq6.q.get() == null) {
                            bq6.q.set(Integer.valueOf(bq6.H()));
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                bq6 bq62 = (bq6) this.b.b;
                bq62.getClass();
                gt0.i();
                oy1 N = ct0.N(bq62.d().i(arrayList, bq62.p, bq62.r), new e3(new sr1(6)), pa2.j());
                ct0.a(N, new f2b(this, 10, qe4), pa2.A());
                gt0.i();
                e07.p("CaptureRequestFuture can only be set once.", xac.i == null ? true : z2);
                xac.i = N;
            }
        }
    }
}
