package androidx.camera.video.internal.compat.quirk;

import android.os.Build;

public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    public final boolean a(fu1 fu1, ma0 ma0) {
        String str = Build.BRAND;
        return "Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL) ? ma0 == ma0.f || ma0 == ma0.g : (("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-G610M".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str) && "SM-J710MN".equalsIgnoreCase(Build.MODEL))))))) && ma0 == ma0.f;
    }
}
