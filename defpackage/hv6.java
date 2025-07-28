package defpackage;

import java.util.Map;
import java.util.function.ToLongFunction;
import one.me.android.OneMeApplication;

/* renamed from: hv6  reason: default package */
public final /* synthetic */ class hv6 implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ hv6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                xy9 xy9 = xy9.a;
                return;
            default:
                return;
        }
    }

    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((fl9) ((Map.Entry) obj).getValue()).a;
            default:
                int i = OneMeApplication.w0;
                return ((Number) xy9.a.get(obj)).longValue();
        }
    }
}
