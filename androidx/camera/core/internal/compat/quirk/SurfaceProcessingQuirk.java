package androidx.camera.core.internal.compat.quirk;

import java.util.Iterator;

public interface SurfaceProcessingQuirk extends zkb {
    static boolean d(xe6 xe6) {
        Iterator it = xe6.k(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    boolean b() {
        return true;
    }
}
