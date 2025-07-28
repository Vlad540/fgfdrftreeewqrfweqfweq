package defpackage;

/* renamed from: lm8  reason: default package */
public final class lm8 extends e07 {
    public final /* synthetic */ int g;
    public final pfd h;

    public /* synthetic */ lm8(pfd pfd, int i) {
        this.g = i;
        this.h = pfd;
    }

    public final vfd D(pfd pfd) {
        switch (this.g) {
            case 0:
                return pfd instanceof qfd ? new ufd((qfd) this.h) : sfd.a;
            default:
                return pfd instanceof rfd ? new ufd((rfd) this.h) : sfd.a;
        }
    }
}
