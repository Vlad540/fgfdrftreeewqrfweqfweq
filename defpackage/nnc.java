package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

/* renamed from: nnc  reason: default package */
public final class nnc {
    public final t97 a;
    public final grd b = hrd.a(Boolean.FALSE);

    public nnc(t97 t97) {
        this.a = t97;
    }

    public final void a(boolean z) {
        Object value;
        grd grd = this.b;
        do {
            value = grd.getValue();
            ((Boolean) value).getClass();
        } while (!grd.b(value, Boolean.valueOf(z)));
        Conversation a2 = ((bt3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = a2 != null ? a2.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setAudioCaptureEnabled(z);
        }
    }

    public final void b(boolean z) {
        Conversation a2 = ((bt3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = a2 != null ? a2.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setScreenCaptureEnabled(z, false);
        }
        if (z) {
            a(((Boolean) this.b.getValue()).booleanValue());
        } else {
            a(false);
        }
    }

    public final boolean c() {
        t97 t97 = this.a;
        Conversation a2 = ((bt3) t97.getValue()).a();
        if (a2 != null && a2.isPrepared()) {
            Conversation a3 = ((bt3) t97.getValue()).a();
            ScreenCaptureManager screenCaptureManager = a3 != null ? a3.getScreenCaptureManager() : null;
            return screenCaptureManager != null && screenCaptureManager.isScreenCaptureEnabled();
        }
    }
}
