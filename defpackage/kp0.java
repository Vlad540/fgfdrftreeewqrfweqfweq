package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* renamed from: kp0  reason: default package */
public final class kp0 {
    public static final kp0 c = new kp0(false, false);
    public boolean a;
    public boolean b;

    public /* synthetic */ kp0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public kp0(xe6 xe6, int i) {
        boolean z;
        switch (i) {
            case 4:
                boolean z2 = false;
                this.b = false;
                this.a = xe6.j(AutoFlashUnderExposedQuirk.class) != null ? true : z2;
                return;
            case 6:
                Iterator it = xe6.k(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (it.hasNext()) {
                        z = ((CaptureIntentPreviewQuirk) it.next()).c() ? true : z;
                    } else {
                        z = false;
                    }
                }
                this.a = z;
                this.b = xe6.i(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.a = xe6.i(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = zf4.a.j(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                return;
        }
    }
}
