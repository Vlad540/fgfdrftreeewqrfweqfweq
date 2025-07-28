package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public class ExtraSupportedSurfaceCombinationsQuirk implements zkb {
    public static final i4e a;
    public static final i4e b;
    public static final HashSet c = new HashSet(Arrays.asList(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"}));
    public static final HashSet d = new HashSet(Arrays.asList(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"}));

    static {
        i4e i4e = new i4e();
        j4e j4e = j4e.VGA;
        c3d.l(2, j4e, 0, i4e);
        j4e j4e2 = j4e.PREVIEW;
        c3d.l(1, j4e2, 0, i4e);
        j4e j4e3 = j4e.MAXIMUM;
        c3d.l(2, j4e3, 0, i4e);
        a = i4e;
        i4e i4e2 = new i4e();
        i4e2.a(new xa0(1, j4e2, 0));
        i4e2.a(new xa0(1, j4e, 0));
        c3d.l(2, j4e3, 0, i4e2);
        b = i4e2;
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
