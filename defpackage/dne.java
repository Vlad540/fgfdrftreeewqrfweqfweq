package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: dne  reason: default package */
public final /* synthetic */ class dne implements yq1 {
    public final /* synthetic */ ene a;

    public /* synthetic */ dne(ene ene) {
        this.a = ene;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        ene ene = this.a;
        if (ene.f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == ene.g) {
                ene.f.b((Object) null);
                ene.f = null;
            }
        }
        return false;
    }
}
