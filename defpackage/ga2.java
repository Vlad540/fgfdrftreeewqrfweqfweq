package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ga2  reason: default package */
public final class ga2 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Set<ta3> set;
        switch (this.a) {
            case 0:
                ma2 ma2 = (ma2) this.b;
                ma2.t.i(-1);
                ma2.v.i(-1);
                return;
            case 1:
                ua3 ua3 = (ua3) this.b;
                int diff = configuration.diff(ua3.b);
                ua3.b = new Configuration(configuration);
                ConcurrentHashMap concurrentHashMap = ua3.a;
                for (Integer num : concurrentHashMap.keySet()) {
                    if (!((num.intValue() & diff) == 0 || (set = (Set) concurrentHashMap.get(num)) == null)) {
                        for (ta3 a2 : set) {
                            a2.a();
                        }
                    }
                }
                return;
            default:
                ((v4b) this.b).getClass();
                int i = configuration.uiMode & 48;
                c33 c33 = i != 16 ? i != 32 ? c33.c : c33.b : c33.a;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.X;
                    String hexString = Integer.toHexString(configuration.uiMode & 48);
                    fn6.d(tn7, "SystemThemeObserver", "onConfigurationChanged scheme=" + c33 + ", uiMode=0x" + hexString, (Throwable) null);
                }
                ((grd) ((v4b) this.b).b).m((Object) null, c33);
                return;
        }
    }

    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                ma2 ma2 = (ma2) this.b;
                ma2.t.i(-1);
                ma2.v.i(-1);
                return;
            default:
                return;
        }
    }

    public ga2(ua3 ua3, Context context) {
        this.a = 1;
        this.b = ua3;
    }
}
