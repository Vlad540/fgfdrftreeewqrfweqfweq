package defpackage;

import org.webrtc.PeerConnection;

/* renamed from: tyf  reason: default package */
public final class tyf extends uv1 {
    public final /* synthetic */ int c;
    public final pf3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tyf(zla zla, pf3 pf3, int i) {
        super(zla);
        this.c = i;
        switch (i) {
            case 1:
                super(zla);
                this.o = pf3;
                return;
            default:
                this.o = pf3;
                return;
        }
    }

    public final void a(PeerConnection peerConnection) {
        switch (this.c) {
            case 0:
                this.o.accept(peerConnection);
                return;
            default:
                this.o.accept(peerConnection);
                return;
        }
    }
}
