package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* renamed from: ewf  reason: default package */
public final class ewf {
    public final et1 a;
    public final fwf b;
    public boolean c = false;
    public boolean d = false;
    public final boolean e = false;
    public final boolean f = false;
    public yic g;
    public sw1 h;
    public cs6 i;
    public ImageWriter j;

    /* JADX WARNING: type inference failed for: r7v6, types: [ci9, fwf] */
    /* JADX WARNING: type inference failed for: r0v2, types: [hs1, java.lang.Object] */
    public ewf(et1 et1) {
        boolean z;
        boolean z2 = false;
        this.a = et1;
        int[] iArr = (int[]) et1.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (iArr[i2] == 4) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        z = false;
        this.e = z;
        this.f = zf4.a.j(ZslDisablerQuirk.class) != null ? true : z2;
        this.b = new ci9(3, (hs1) new Object());
    }
}
