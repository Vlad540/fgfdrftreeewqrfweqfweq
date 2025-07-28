package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: d11  reason: default package */
public final class d11 {
    public final t97 a;

    public d11(t97 t97) {
        this.a = t97;
    }

    public final CameraManager a() {
        Conversation a2 = ((bt3) this.a.getValue()).a();
        if (a2 != null) {
            return a2.getCameraManager();
        }
        return null;
    }

    public final boolean b() {
        CameraManager a2 = a();
        return a2 != null && a2.isCapturingFromFrontCamera();
    }
}
