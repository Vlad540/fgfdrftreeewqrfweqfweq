package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: yxb  reason: default package */
public final class yxb implements zdd {
    public final HashSet a = new HashSet();

    public final void onRateCall(JSONObject jSONObject) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zdd) it.next()).onRateCall(jSONObject);
        }
    }
}
