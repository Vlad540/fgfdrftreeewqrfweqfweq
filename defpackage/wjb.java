package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: wjb  reason: default package */
public final class wjb implements yx4 {
    public static final HashMap o;
    public final yx4 a;
    public final fu1 b;
    public final xe6 c;

    static {
        HashMap hashMap = new HashMap();
        o = hashMap;
        hashMap.put(1, ma0.i);
        hashMap.put(8, ma0.g);
        hashMap.put(6, ma0.f);
        hashMap.put(5, ma0.e);
        hashMap.put(4, ma0.d);
        hashMap.put(0, ma0.h);
    }

    public wjb(fu1 fu1, yx4 yx4, xe6 xe6) {
        this.a = yx4;
        this.b = fu1;
        this.c = xe6;
    }

    public final boolean o(int i) {
        if (this.a.o(i)) {
            ma0 ma0 = (ma0) o.get(Integer.valueOf(i));
            if (ma0 != null) {
                Iterator it = this.c.k(VideoQualityQuirk.class).iterator();
                while (it.hasNext()) {
                    VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
                    if (videoQualityQuirk != null && videoQualityQuirk.a(this.b, ma0)) {
                        if ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).b()) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final zx4 r(int i) {
        if (!o(i)) {
            return null;
        }
        return this.a.r(i);
    }
}
