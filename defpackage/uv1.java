package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import org.webrtc.PeerConnection;

/* renamed from: uv1  reason: default package */
public abstract class uv1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public uv1(zla zla) {
        this.a = 1;
        this.b = zla;
    }

    public static void b(itf itf, String str) {
        nuf nuf;
        boolean z;
        WorkDatabase workDatabase = itf.c;
        buf y = workDatabase.y();
        qe4 t = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            ctf j = y.j(str2);
            if (!(j == ctf.c || j == ctf.o)) {
                y.q(ctf.Y, str2);
            }
            linkedList.addAll(t.x(str2));
        }
        t4b t4b = itf.f;
        synchronized (t4b.A0) {
            try {
                a24 B = a24.B();
                String str3 = t4b.B0;
                B.t(str3, "Processor cancelling " + str);
                t4b.y0.add(str);
                nuf = (nuf) t4b.Y.remove(str);
                z = nuf != null;
                if (nuf == null) {
                    nuf = (nuf) t4b.Z.remove(str);
                }
                if (nuf != null) {
                    t4b.w0.remove(str);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        t4b.c(str, nuf);
        if (z) {
            t4b.i();
        }
        for (rmc d : itf.e) {
            d.d(str);
        }
    }

    public abstract void a(PeerConnection peerConnection);

    public abstract void c();

    public final void run() {
        switch (this.a) {
            case 0:
                otf otf = (otf) this.b;
                try {
                    c();
                    otf.L(aga.Q);
                    return;
                } catch (Throwable th) {
                    otf.L(new xfa(th));
                    return;
                }
            default:
                PeerConnection G = ((zla) this.b).G();
                if (G != null) {
                    a(G);
                    return;
                }
                return;
        }
    }

    public uv1() {
        this.a = 0;
        this.b = new otf(25);
    }
}
