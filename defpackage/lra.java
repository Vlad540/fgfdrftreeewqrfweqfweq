package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: lra  reason: default package */
public final class lra extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xra Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lra(xra xra, Continuation continuation) {
        super(2, continuation);
        this.Y = xra;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((lra) n((Map) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lra lra = new lra(this.Y, continuation);
        lra.X = obj;
        return lra;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Map map = (Map) this.X;
        this.Y.Z.setValue(map);
        grd grd = this.Y.x0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ju7.S(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long longValue = ((Number) entry.getKey()).longValue();
            i22 i22 = (i22) entry.getValue();
            long e = i22.e();
            String p = i22.p();
            String f = i22.f(fj0.a, ej0.a);
            if (f == null) {
                f = BuildConfig.FLAVOR;
            }
            i22.i0();
            linkedHashMap.put(key, new kta(longValue, e, i22.B0, p, f));
        }
        grd.m((Object) null, linkedHashMap);
        return jue.a;
    }
}
