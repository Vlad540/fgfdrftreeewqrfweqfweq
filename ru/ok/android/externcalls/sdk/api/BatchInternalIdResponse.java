package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public class BatchInternalIdResponse {
    public static final h67 PARSER = new ak0(0);
    public final Map<ParticipantId, ge1> externalToInternalIdsMap;

    public BatchInternalIdResponse(Map<ParticipantId, ge1> map) {
        this.externalToInternalIdsMap = map;
    }

    public static BatchInternalIdResponse parse(m67 m67) throws IOException, JsonTypeMismatchException {
        HashMap hashMap = new HashMap();
        m67.s();
        while (m67.hasNext()) {
            if (m67.T().equals("ids")) {
                readIdsArray(m67, hashMap);
            } else {
                m67.z();
            }
        }
        m67.q();
        return new BatchInternalIdResponse(hashMap);
    }

    private static ParticipantId readExternalId(m67 m67) throws IOException, JsonTypeMismatchException {
        m67.s();
        String str = null;
        Boolean bool = null;
        while (m67.hasNext()) {
            String T = m67.T();
            T.getClass();
            if (T.equals(ApiProtocol.KEY_ID)) {
                str = m67.H();
            } else if (!T.equals("ok_anonym")) {
                m67.z();
            } else {
                bool = Boolean.valueOf(m67.a0());
            }
        }
        m67.q();
        if (str == null || bool == null) {
            return null;
        }
        return ParticipantId.withoutDeviceId(str, bool.booleanValue());
    }

    private static void readIdMapping(m67 m67, Map<ParticipantId, ge1> map) throws IOException, JsonTypeMismatchException {
        m67.s();
        ge1 ge1 = null;
        ParticipantId participantId = null;
        while (m67.hasNext()) {
            String T = m67.T();
            T.getClass();
            if (T.equals("external_user_id")) {
                participantId = readExternalId(m67);
            } else if (!T.equals("ok_user_id")) {
                m67.z();
            } else {
                ge1 = ge1.a(m67.H());
            }
        }
        m67.q();
        if (ge1 != null && participantId != null) {
            map.put(participantId, ge1);
        }
    }

    private static void readIdsArray(m67 m67, Map<ParticipantId, ge1> map) throws IOException, JsonTypeMismatchException {
        m67.u();
        while (m67.hasNext()) {
            readIdMapping(m67, map);
        }
        m67.t();
    }
}
