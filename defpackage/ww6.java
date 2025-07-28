package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ww6  reason: default package */
public final class ww6 extends fy {
    public final String X;
    public final s77 o;

    public ww6(s77 s77, String str, boolean z, boolean z2) {
        super(e00.INLINE_KEYBOARD, z, z2);
        this.o = s77;
        this.X = str;
    }

    public final HashMap a() {
        HashMap a = super.a();
        ArrayList arrayList = new ArrayList();
        for (List<zt0> it : (List) this.o.a) {
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (zt0 zt0 : it) {
                zt0.getClass();
                HashMap hashMap = new HashMap();
                String str = zt0.o;
                if (str != null) {
                    hashMap.put("url", str);
                }
                hashMap.put("type", zt0.a.a);
                hashMap.put("text", zt0.b);
                hashMap.put("intent", zt0.c.a);
                hashMap.put(ApiProtocol.PARAM_PAYLOAD, zt0.X);
                hashMap.put("isQuick", Boolean.valueOf(zt0.Y));
                hashMap.put("contactId", Long.valueOf(zt0.Z));
                arrayList2.add(hashMap);
            }
        }
        a.put("buttons", arrayList);
        return a;
    }
}
