package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.SessionDescription;

/* renamed from: sl1  reason: default package */
public abstract class sl1 implements qx0, wm1, bc9, iy7 {
    public final ob1 A0;
    public final py7 B0;
    public rl1 C0;
    public int D0 = 0;
    public boolean E0;
    public ema F0;
    public final onc G0;
    public final axb X;
    public final xwb Y;
    public final sh5 Z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean b;
    public Runnable c;
    public final fe1 o;
    public final d w0;
    public final ArrayList x0 = new ArrayList();
    public final cc9 y0;
    public final pe1 z0;

    public sl1(pe1 pe1, cc9 cc9, fe1 fe1, xwb xwb, axb axb, sh5 sh5, d dVar, ob1 ob1, py7 py7, onc onc) {
        d59.e();
        this.o = fe1;
        this.Y = xwb;
        this.X = axb;
        this.Z = sh5;
        this.z0 = pe1;
        this.y0 = cc9;
        this.A0 = ob1;
        ob1.a.a.add(this);
        ob1.l.a.add(this);
        cc9.a.add(this);
        this.w0 = dVar;
        this.B0 = py7;
        this.G0 = onc;
    }

    public static String B(int i) {
        return i == 0 ? "PASSIVE" : "ACTIVE";
    }

    public Map A() {
        return null;
    }

    public void C(jsd jsd) {
    }

    public abstract String D();

    public void E(ge1 ge1, List list, boolean z, rw0 rw0) {
    }

    public void F() {
    }

    public void G() {
    }

    public final boolean H(ane ane) {
        return y().equals(ane);
    }

    public final boolean I() {
        return this.D0 == 1;
    }

    public final void J() {
        if (!this.b) {
            fe1 fe1 = this.o;
            fe1.b.getClass();
            if (this.c == null) {
                this.c = w();
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                Handler handler = this.a;
                fe1.b.getClass();
                handler.postDelayed(runnable, 10000);
            }
        }
    }

    public void K(ge1 ge1, w2d w2d, boolean z, sw0 sw0) {
    }

    public void L() {
        d59.e();
        py7 py7 = this.B0;
        if (py7 != null) {
            py7.d.log("MediaAdaptation", "Releasing media adaptation controller");
            py7.a.j.remove(py7);
        }
        this.y0.a.remove(this);
        this.A0.a.a.remove(this);
        this.C0 = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public void M(long j, long j2) {
    }

    public void N(zwb zwb) {
    }

    public void O(boolean z) {
    }

    public void P(zrd zrd) {
    }

    public void Q(List list) {
        d59.e();
        ArrayList arrayList = this.x0;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public void R(xm1 xm1, List list) {
    }

    public final void S(String str) {
        this.Y.log(D(), str);
    }

    public void T(List list) {
    }

    public abstract void U(ema ema);

    public final void V(String str) {
        this.Y.log(D(), str);
    }

    public void a(mod mod) {
    }

    public void j(cc9 cc9) {
    }

    public void onActiveParticipantUpdated(px0 px0) {
    }

    public void onActiveParticipantsAdded(lx0 lx0) {
    }

    public void onActiveParticipantsChanged(mx0 mx0) {
    }

    public void onActiveParticipantsDeAnonimized(nx0 nx0) {
    }

    public void onActiveParticipantsRemoved(ox0 ox0) {
    }

    public final void q(jy7 jy7) {
        if (I()) {
            ema ema = jy7.b;
            if (ema == null) {
                ema = this.F0;
            }
            U(ema);
        }
    }

    public void s() {
    }

    public void t(ge1 ge1, SessionDescription sessionDescription) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('@');
        boolean z = d59.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('{');
        sb.append(B(this.D0));
        sb.append('}');
        return sb.toString();
    }

    public void u(ke1 ke1, boolean z) {
    }

    public final void v(String str) {
        this.Y.log(D(), str);
    }

    public abstract Runnable w();

    public long x() {
        return -1;
    }

    public abstract ane y();

    public final ke1 z(ge1 ge1) {
        if (ge1 != null) {
            return this.z0.j(ge1);
        }
        return null;
    }
}
