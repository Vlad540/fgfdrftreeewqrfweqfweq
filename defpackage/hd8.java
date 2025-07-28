package defpackage;

import android.os.RemoteException;
import android.util.SparseBooleanArray;

/* renamed from: hd8  reason: default package */
public final /* synthetic */ class hd8 implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ md8 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pd8 c;
    public final /* synthetic */ ld8 o;

    public /* synthetic */ hd8(md8 md8, int i, pd8 pd8, ld8 ld8, boolean z) {
        this.a = md8;
        this.b = i;
        this.c = pd8;
        this.o = ld8;
        this.X = z;
    }

    public final void run() {
        md8 md8 = this.a;
        cd8 cd8 = md8.f;
        if (!cd8.i()) {
            boolean isActive = md8.j.a.a.isActive();
            int i = this.b;
            pd8 pd8 = this.c;
            if (!isActive) {
                StringBuilder m = me4.m(i, "Ignore incoming player command before initialization. command=", ", pid=");
                m.append(pd8.a.b);
                ez3.j0(m.toString());
                return;
            }
            ic8 R = md8.R(pd8);
            if (md8.e.N(R, i)) {
                cd8.s(R);
                cd8.e.getClass();
                try {
                    this.o.b(R);
                } catch (RemoteException e) {
                    ez3.k0("Exception in " + R, e);
                }
                if (this.X) {
                    new SparseBooleanArray().append(i, true);
                    cd8.p(R);
                }
            } else if (i == 1 && !cd8.s.u()) {
                ez3.j0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            }
        }
    }
}
