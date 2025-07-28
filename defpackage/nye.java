package defpackage;

import java.util.List;

/* renamed from: nye  reason: default package */
public final class nye {
    public final c2d a;
    public final pye b;
    public final va0 c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public nye(c2d c2d, pye pye, va0 va0, List list) {
        this.a = c2d;
        this.b = pye;
        this.c = va0;
        this.d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.c + ", mCaptureTypes=" + this.d + ", mAttached=" + this.e + ", mActive=" + this.f + '}';
    }
}
