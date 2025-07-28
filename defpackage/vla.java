package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: vla  reason: default package */
public final class vla extends gwf {
    public final /* synthetic */ zla X;
    public final /* synthetic */ int c;
    public final /* synthetic */ SessionDescription o;

    public /* synthetic */ vla(zla zla, SessionDescription sessionDescription, int i) {
        this.c = i;
        this.X = zla;
        this.o = sessionDescription;
    }

    public final void onSetFailure(String str) {
        switch (this.c) {
            case 0:
                this.X.o(this.o, true, str);
                return;
            default:
                this.X.o(this.o, false, str);
                return;
        }
    }

    public final void onSetSuccess() {
        switch (this.c) {
            case 0:
                this.X.n(this.o, true);
                return;
            default:
                this.X.n(this.o, false);
                return;
        }
    }
}
