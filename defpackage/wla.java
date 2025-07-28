package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: wla  reason: default package */
public final class wla extends gwf {
    public final /* synthetic */ int c;
    public final /* synthetic */ zla o;

    public /* synthetic */ wla(zla zla, int i) {
        this.c = i;
        this.o = zla;
    }

    public final void onCreateFailure(String str) {
        switch (this.c) {
            case 0:
                this.o.h(str);
                return;
            default:
                this.o.h(str);
                return;
        }
    }

    public final void onCreateSuccess(SessionDescription sessionDescription) {
        switch (this.c) {
            case 0:
                this.o.m(sessionDescription);
                return;
            default:
                this.o.m(sessionDescription);
                return;
        }
    }
}
