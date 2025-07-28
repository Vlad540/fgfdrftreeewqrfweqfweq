package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

public class ExternalIdsResponse {
    public static final h67 INSTANCE = new h67() {
        private void parseIds(Map<ge1, ParticipantId> map, m67 m67, boolean z) throws IOException, JsonTypeMismatchException {
            m67.s();
            while (m67.hasNext()) {
                String T = m67.T();
                try {
                    map.put(ge1.a(T), ParticipantId.withoutDeviceId(m67.H(), z));
                } catch (NumberFormatException unused) {
                    GlobalRTCLogger.log(ExternalIdsResponse.LOG_TAG, "got not parsable internal id '" + T + "'");
                }
            }
            m67.q();
        }

        public ExternalIdsResponse parse(m67 m67) throws IOException, JsonParseException {
            HashMap hashMap = new HashMap();
            m67.s();
            while (m67.hasNext()) {
                String T = m67.T();
                T.getClass();
                if (T.equals("external_ids")) {
                    parseIds(hashMap, m67, false);
                } else if (!T.equals("anonym_ids")) {
                    m67.z();
                } else {
                    parseIds(hashMap, m67, true);
                }
            }
            m67.q();
            return new ExternalIdsResponse(hashMap);
        }
    };
    private static final String LOG_TAG = "ExternalIdsResponse";
    private final Map<ge1, ParticipantId> internalToExternal;

    public ExternalIdsResponse(Map<ge1, ParticipantId> map) {
        this.internalToExternal = map;
    }

    public Map<ge1, ParticipantId> getMapping() {
        return this.internalToExternal;
    }
}
