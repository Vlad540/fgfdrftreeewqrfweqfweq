package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: n88  reason: default package */
public final class n88 {
    public static JSONObject a(Set set, ge1 ge1, w2d w2d) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ge1 != null ? ge1.c() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int i = m88.$EnumSwitchMapping$0[((j88) it.next()).ordinal()];
            if (i == 1) {
                str = "AUDIO";
            } else if (i == 2) {
                str = "VIDEO";
            } else if (i == 3) {
                str = "SCREEN_SHARING";
            } else if (i == 4) {
                str = "MOVIE_SHARING";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            jSONArray.put((Object) str);
        }
        jSONObject.put("requestedMedia", (Object) jSONArray);
        jSONObject.put("command", (Object) "mute-participant");
        if (w2d instanceof v2d) {
            jSONObject.put("roomId", ((v2d) w2d).a);
        }
        return jSONObject;
    }

    public static JSONObject b(Map map, ge1 ge1, w2d w2d) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ge1 != null ? ge1.c() : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AUDIO", (Object) x87.O((k88) map.get(j88.a)));
        jSONObject2.put("VIDEO", (Object) x87.O((k88) map.get(j88.b)));
        jSONObject2.put("SCREEN_SHARING", (Object) x87.O((k88) map.get(j88.c)));
        jSONObject2.put("MOVIE_SHARING", (Object) x87.O((k88) map.get(j88.o)));
        jSONObject.put("muteStates", (Object) jSONObject2);
        jSONObject.put("command", (Object) "mute-participant");
        if (w2d instanceof v2d) {
            jSONObject.put("roomId", ((v2d) w2d).a);
        }
        return jSONObject;
    }
}
