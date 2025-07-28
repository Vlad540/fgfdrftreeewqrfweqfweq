package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* renamed from: hha  reason: default package */
public class hha {
    public final Object a;

    public hha(Object obj) {
        this.a = obj;
    }

    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    public Object c() {
        Object obj = this.a;
        e07.k(obj instanceof gha);
        return ((gha) obj).a;
    }

    public final Surface d() {
        return ((OutputConfiguration) c()).getSurface();
    }

    public void e(long j) {
        ((gha) this.a).b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hha)) {
            return false;
        }
        return Objects.equals(this.a, ((hha) obj).a);
    }

    public void f(int i) {
    }

    public final void g(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }

    public void h(long j) {
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
