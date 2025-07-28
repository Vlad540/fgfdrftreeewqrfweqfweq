package defpackage;

import android.os.RemoteException;

/* renamed from: a0g  reason: default package */
public final class a0g implements h0g {
    public final /* synthetic */ int a;
    public final /* synthetic */ yha b;

    public /* synthetic */ a0g(yha yha, int i) {
        this.a = i;
        this.b = yha;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                v2b v2b = (v2b) this.b.a;
                v2b.getClass();
                try {
                    s4g s4g = (s4g) v2b.c;
                    s4g.H0(s4g.G0(), 15);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            default:
                v2b v2b2 = (v2b) this.b.a;
                v2b2.getClass();
                try {
                    s4g s4g2 = (s4g) v2b2.c;
                    s4g2.H0(s4g2.G0(), 5);
                    return;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}
