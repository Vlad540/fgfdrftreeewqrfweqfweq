package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: yb2  reason: default package */
public final class yb2 implements i5e {
    public final /* synthetic */ zb2 a;

    public yb2(zb2 zb2) {
        this.a = zb2;
    }

    public final void a() {
        this.a.t(false);
    }

    public final Object c(float f, long j, long j2, Continuation continuation) {
        Object value;
        grd grd = this.a.A0;
        do {
            value = grd.getValue();
            ((Number) value).floatValue();
        } while (!grd.b(value, new Float(f)));
        return jue.a;
    }

    public final void e(boolean z, boolean z2) {
        this.a.t(z2);
    }

    public final Object f(File file, Continuation continuation) {
        zb2 zb2 = this.a;
        ob2 ob2 = (ob2) zb2.D0.getAndUpdate(new pb2(1));
        jue jue = jue.a;
        if (!(file == null || ob2 == null)) {
            o6a o6a = (u98) zb2.x0.getValue();
            xs7.E((ou3) o6a.k.getValue(), (hu3) null, (ru3) null, new n6a(o6a, file, (Continuation) null), 3);
            hcd hcd = zb2.y0;
            Uri fromFile = Uri.fromFile(file);
            String uri = fromFile.toString();
            int i = js.d;
            if (!uri.startsWith("content://")) {
                fromFile = ((bf5) zb2.w0.getValue()).f(zb2.b, gt0.N(fromFile));
            }
            hcd.g(new fk4(fromFile, ob2.d));
        }
        return jue;
    }

    public final String getDownloadContext() {
        ob2 ob2 = (ob2) this.a.D0.get();
        if (ob2 == null) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ob2.a);
        sb.append(ob2.b);
        return sb.toString();
    }
}
