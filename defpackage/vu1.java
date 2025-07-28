package defpackage;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* renamed from: vu1  reason: default package */
public final class vu1 implements ucc {
    public final /* synthetic */ int b;
    public final ucc c;

    public vu1(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new ake(j, new uu1(j));
                return;
            default:
                this.c = new vu1(j, 1);
                return;
        }
    }

    public final long a() {
        switch (this.b) {
            case 0:
                return ((ake) ((vu1) this.c).c).b;
            default:
                return ((ake) this.c).b;
        }
    }

    public final tcc b(tu1 tu1) {
        switch (this.b) {
            case 0:
                if (((ake) ((vu1) this.c).c).b(tu1).b) {
                    return tcc.e;
                }
                Throwable th = (Throwable) tu1.c;
                return (!(th instanceof CameraValidator$CameraIdListIncorrectException) || ((CameraValidator$CameraIdListIncorrectException) th).a <= 0) ? tcc.d : tcc.f;
            default:
                return ((ake) this.c).b(tu1);
        }
    }

    public final ucc c(long j) {
        switch (this.b) {
            case 0:
                return new vu1(j, 0);
            default:
                return new vu1(j, 1);
        }
    }
}
