package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cv1  reason: default package */
public final /* synthetic */ class cv1 implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cv1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                bb0 bb0 = (bb0) obj;
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                return;
            case 1:
                za0 za0 = (za0) obj;
                bb4 bb4 = (bb4) obj3;
                bb4.getClass();
                q4e q4e = (q4e) obj2;
                q4e.close();
                Surface surface = (Surface) bb4.w0.remove(q4e);
                if (surface != null) {
                    vj4 vj4 = bb4.a;
                    w36.d((AtomicBoolean) vj4.c, true);
                    w36.c((Thread) vj4.e);
                    vj4.s(surface, true);
                    return;
                }
                return;
            case 2:
                za0 za02 = (za0) obj;
                pp4 pp4 = (pp4) obj3;
                pp4.getClass();
                q4e q4e2 = (q4e) obj2;
                q4e2.close();
                Surface surface2 = (Surface) pp4.w0.remove(q4e2);
                if (surface2 != null) {
                    np4 np4 = pp4.a;
                    w36.d((AtomicBoolean) np4.c, true);
                    w36.c((Thread) np4.e);
                    np4.s(surface2, true);
                    return;
                }
                return;
            case 3:
                fm7 fm7 = (fm7) obj;
                be9 be9 = (be9) obj3;
                be9.getClass();
                fm7.f = ((Boolean) obj2).booleanValue();
                be9.Y.getClass();
                udd.r("mm7", "background permissions is not supported yet");
                fm7.g = false;
                return;
            default:
                Throwable th = (Throwable) obj;
                y5c y5c = (y5c) obj3;
                if (y5c.W == null) {
                    if (th instanceof EncodeException) {
                        y5c.f0 = 5;
                    } else {
                        y5c.f0 = 6;
                    }
                    y5c.W = th;
                    y5c.H();
                    ((sn1) obj2).b((Object) null);
                    return;
                }
                return;
        }
    }
}
