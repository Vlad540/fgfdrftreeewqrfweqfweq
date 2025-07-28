package androidx.camera.video.internal.compat.quirk;

import android.os.Build;

public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    public final boolean a(fu1 fu1, ma0 ma0) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && fu1.g() == 0 && ma0 == ma0.d;
    }
}
