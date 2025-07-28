package defpackage;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.util.LinkedHashMap;

/* renamed from: ic7  reason: default package */
public abstract class ic7 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final fc7 a(Activity activity, boolean z) {
        fc7 fc7;
        fc7 fc72 = (fc7) a.get(activity);
        if (fc72 == null) {
            fc72 = null;
            if (!z || !(activity instanceof b)) {
                Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
                if (findFragmentByTag instanceof fc7) {
                    fc7 = (fc7) findFragmentByTag;
                }
            } else {
                a E = ((b) activity).P().E("LifecycleHandler");
                if (E instanceof fc7) {
                    fc7 = (fc7) E;
                }
            }
            fc72 = fc7;
        }
        if (fc72 != null) {
            fc72.I(activity);
        }
        return fc72;
    }
}
