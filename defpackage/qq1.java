package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qq1  reason: default package */
public final /* synthetic */ class qq1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ew0 b;
    public final /* synthetic */ sn1 c;

    public /* synthetic */ qq1(ew0 ew0, sn1 sn1, int i) {
        this.a = i;
        this.b = ew0;
        this.c = sn1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ew0 ew0 = this.b;
                ew0.Y = true;
                Exception exc = new Exception("Camera2CameraControl was updated with new options.");
                sn1 sn1 = (sn1) ew0.w0;
                if (sn1 != null) {
                    sn1.d(exc);
                    ew0.w0 = null;
                }
                ew0.w0 = this.c;
                if (ew0.b) {
                    zq1 zq1 = (zq1) ew0.c;
                    zq1.getClass();
                    ct0.A(hwf.f(new rgc(22, zq1))).c(new b(25, ew0), (Executor) ew0.o);
                    ew0.Y = false;
                    return;
                }
                return;
            default:
                ew0 ew02 = this.b;
                ew02.Y = true;
                Exception exc2 = new Exception("Camera2CameraControl was updated with new options.");
                sn1 sn12 = (sn1) ew02.w0;
                if (sn12 != null) {
                    sn12.d(exc2);
                    ew02.w0 = null;
                }
                ew02.w0 = this.c;
                if (ew02.b) {
                    zq1 zq12 = (zq1) ew02.c;
                    zq12.getClass();
                    ct0.A(hwf.f(new rgc(22, zq12))).c(new b(25, ew02), (Executor) ew02.o);
                    ew02.Y = false;
                    return;
                }
                return;
        }
    }
}
