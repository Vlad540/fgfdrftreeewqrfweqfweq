package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: gma  reason: default package */
public final class gma {
    public final Map a;

    public gma(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public static final gma a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        int length = names.length();
        for (int i = 0; i < length; i++) {
            String string = names.getString(i);
            JSONArray jSONArray = jSONObject.getJSONArray(string);
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has("dimension") && jSONObject2.has("bitrate")) {
                    arrayList.add(new fma(jSONObject2.getInt("dimension"), jSONObject2.getInt("bitrate")));
                }
            }
            linkedHashMap.put(string.toLowerCase(Locale.ROOT), o23.m0(arrayList, new gu6(7)));
        }
        return new gma(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gma) && hhd.f(this.a, ((gma) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PeerVideoSettingsBitrateTable(bitrateTables=" + this.a + ")";
    }
}
