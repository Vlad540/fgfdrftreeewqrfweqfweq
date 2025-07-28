package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: kd8  reason: default package */
public final class kd8 implements h36, hc8, pg6, j2e {
    public Object X;
    public Object a;
    public Object b;
    public Object c;
    public long o;

    public static final List l(kd8 kd8, dh2 dh2, String str) {
        kd8.getClass();
        return myc.U(myc.L(new vqe(myc.L(new es(2, dh2.c), new ljc(10, kd8)), new lxc(kd8, str, 5)), new u1c(17)));
    }

    public static void n(ArrayList arrayList, List list) {
        String str = (String) myc.O(new vqe(myc.L(new es(2, list), new ljc()), new u1c(16)));
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = hhd.o(str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() > 0) {
                arrayList.add(str);
            }
        }
    }

    public void A() {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public void B(int i) {
        vc8 vc8 = ((md8) this.X).j;
        int n = qa7.n(i);
        qc8 qc8 = vc8.a;
        if (qc8.j != n) {
            qc8.j = n;
            synchronized (qc8.d) {
                for (int beginBroadcast = qc8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((jn6) qc8.f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(n);
                    } catch (RemoteException unused) {
                    }
                }
                qc8.f.finishBroadcast();
            }
        }
    }

    public void C(boolean z) {
        vc8 vc8 = ((md8) this.X).j;
        gt6 gt6 = qa7.a;
        qc8 qc8 = vc8.a;
        if (qc8.k != z) {
            qc8.k = z ? 1 : 0;
            synchronized (qc8.d) {
                for (int beginBroadcast = qc8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((jn6) qc8.f.getBroadcastItem(beginBroadcast)).onShuffleModeChanged(z);
                    } catch (RemoteException unused) {
                    }
                }
                qc8.f.finishBroadcast();
            }
        }
    }

    public void D(vje vje) {
        F(vje);
        E();
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, h36, kd8] */
    public void E() {
        Bitmap bitmap;
        a68 a68;
        md8 md8 = (md8) this.X;
        qza qza = md8.f.s;
        l68 W = qza.W();
        z78 i0 = qza.i0();
        long j = -9223372036854775807L;
        if ((!qza.t1(16) || !qza.K1()) && qza.t1(16)) {
            j = qza.c();
        }
        String str = W != null ? W.a : BuildConfig.FLAVOR;
        Uri uri = (W == null || (a68 = W.b) == null) ? null : a68.a;
        if (!Objects.equals((z78) this.a, i0) || !Objects.equals((String) this.b, str) || !Objects.equals((Uri) this.c, uri) || this.o != j) {
            this.b = str;
            this.c = uri;
            this.a = i0;
            this.o = j;
            cd8 cd8 = md8.f;
            ch7 h = cd8.m.h(i0);
            if (h != null) {
                md8.o = null;
                if (h.isDone()) {
                    try {
                        bitmap = (Bitmap) swb.u(h);
                    } catch (CancellationException | ExecutionException e) {
                        ez3.j0("Failed to load bitmap: " + e.getMessage());
                    }
                    md8.J(md8.j, qa7.l(i0, str, uri, j, bitmap));
                }
                ? obj = new Object();
                obj.X = this;
                obj.a = i0;
                obj.b = str;
                obj.c = uri;
                obj.o = j;
                md8.o = obj;
                Handler handler = cd8.l;
                Objects.requireNonNull(handler);
                h.c(new p36((Object) h, 0, (Object) obj), new y44(handler, 0));
            }
            bitmap = null;
            md8.J(md8.j, qa7.l(i0, str, uri, j, bitmap));
        }
    }

    public void F(vje vje) {
        md8 md8 = (md8) this.X;
        qza qza = md8.f.s;
        if (!(qza.X.a(17) && qza.s().a(17)) || vje.q()) {
            md8.L(md8.j, (ArrayList) null);
            return;
        }
        gt6 gt6 = qa7.a;
        ArrayList arrayList = new ArrayList();
        tje tje = new tje();
        for (int i = 0; i < vje.p(); i++) {
            arrayList.add(vje.n(i, tje, 0).c);
        }
        ArrayList arrayList2 = new ArrayList();
        co1 co1 = new co1(this, new AtomicInteger(0), arrayList, arrayList2, vje, 5);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((l68) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add((Object) null);
                co1.run();
            } else {
                cd8 cd8 = md8.f;
                ch7 n = cd8.m.n(bArr);
                arrayList2.add(n);
                Handler handler = cd8.l;
                Objects.requireNonNull(handler);
                n.c(co1, new y44(handler, 0));
            }
        }
    }

    public void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        kd8 kd8 = (kd8) this.X;
        md8 md8 = (md8) kd8.X;
        if (this == md8.o) {
            long j = this.o;
            md8.J(md8.j, qa7.l((z78) this.a, (String) this.b, (Uri) this.c, j, bitmap));
            cd8 cd8 = ((md8) kd8.X).f;
            oze.W(cd8.o, new wc8(cd8, 1));
        }
    }

    public List c() {
        return (List) ((pk) this.a).L(new dt(this.o, "MEMBER", 0, 100, (String) null), (qmc) this.c).h(new mb1(22, this)).e();
    }

    public void e(Throwable th) {
        if (this == ((md8) ((kd8) this.X).X).o) {
            ez3.j0("Failed to load bitmap: " + th.getMessage());
        }
    }

    public List g(String str) {
        return (List) new aid(((pk) this.a).L(new dt(this.o, "MEMBER", 0, 100, str == null ? null : (str.length() <= 1 || str.charAt(0) != '@') ? str : str.substring(1)), (qmc) this.c).h(new s5c(this, str, false, 5)), (j26) null, hw4.a).e();
    }

    public void h(int i, eya eya) {
        md8 md8 = (md8) this.X;
        qza qza = md8.f.s;
        md8.K(md8, qza);
        md8.S(qza);
    }

    public void j(int i, n2d n2d, boolean z, boolean z2, int i2) {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public og6 k() {
        int ordinal = ((md4) this.a).ordinal();
        if (ordinal == 0) {
            return (x1a) ((r7e) this.c).getValue();
        }
        if (ordinal == 1) {
            return (v1a) ((r7e) this.X).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public List m(LinkedHashSet linkedHashSet) {
        if (Looper.getMainLooper().isCurrentThread()) {
            udd.S("SuggestContactsNetworkRepository", "Load contacts was called from the main thread.", new IllegalStateException("Load contacts was called from the main thread."));
        }
        return (List) xs7.M(bw4.a, new i2e(this, linkedHashSet, (Continuation) null));
    }

    public void o(k20 k20) {
        md8 md8 = (md8) this.X;
        if (md8.f.s.I().a == 0) {
            int w = qa7.w(k20);
            qc8 qc8 = md8.j.a;
            qc8.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(w);
            qc8.a.setPlaybackToLocal(builder.build());
        }
    }

    public void onDisconnected() {
    }

    public void p() {
        oza oza;
        int i;
        md8 md8 = (md8) this.X;
        qza qza = md8.f.s;
        if (qza.I().a == 0) {
            oza = null;
        } else {
            eya s = qza.s();
            if (s.a.a(26, 34)) {
                i = s.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(qza.a.z1());
            int l = qza.t1(23) ? qza.l() : 0;
            uf4 I = qza.I();
            oza = new oza(qza, i, I.c, l, I.d, handler);
        }
        md8.m = oza;
        vc8 vc8 = md8.j;
        if (oza == null) {
            int w = qa7.w(qza.t1(21) ? qza.F() : k20.g);
            qc8 qc8 = vc8.a;
            qc8.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(w);
            qc8.a.setPlaybackToLocal(builder.build());
            return;
        }
        qc8 qc82 = vc8.a;
        qc82.getClass();
        qc82.a.setPlaybackToRemote(oza.a());
    }

    public void q(int i, boolean z) {
        oza oza = ((md8) this.X).m;
        if (oza != null) {
            if (z) {
                i = 0;
            }
            oza.d = i;
            rdf.a(oza.a(), i);
        }
    }

    public void r() {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public void s(l68 l68) {
        E();
        md8 md8 = (md8) this.X;
        if (l68 == null) {
            md8.j.a.a.setRatingType(0);
        } else {
            vc8 vc8 = md8.j;
            vc8.a.a.setRatingType(qa7.x(l68.d.i));
        }
        md8.S(md8.f.s);
    }

    public void t() {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public void u() {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public void v() {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public void w() {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public void x(int i, qza qza) {
        D(qza.c0());
        z(qza.t1(18) ? qza.k0() : z78.J);
        qza.i0();
        E();
        C(qza.E0());
        B(qza.getRepeatMode());
        qza.I();
        p();
        md8.K((md8) this.X, qza);
        s(qza.W());
    }

    public void y() {
        md8 md8 = (md8) this.X;
        md8.S(md8.f.s);
    }

    public void z(z78 z78) {
        md8 md8 = (md8) this.X;
        CharSequence queueTitle = ((v38) md8.j.b.b).a.getQueueTitle();
        CharSequence charSequence = z78.a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            qza qza = md8.f.s;
            if (!qza.X.a(17) || !qza.s().a(17)) {
                charSequence = null;
            }
            md8.j.a.a.setQueueTitle(charSequence);
        }
    }
}
