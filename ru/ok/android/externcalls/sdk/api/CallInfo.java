package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;

public class CallInfo {
    public static final h67 PARSER = new ak0(8);
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isConcurrent;
    public final boolean isP2PForbidden;
    public final String joinLink;
    public final List<PeerConnection.IceServer> stunServer;
    public final String token;
    public final List<PeerConnection.IceServer> turnServer;

    private CallInfo(String str, String str2, String str3, String str4, String str5, boolean z, List<PeerConnection.IceServer> list, List<PeerConnection.IceServer> list2, boolean z2, int i) {
        this.token = str;
        this.clientType = str2;
        this.endpoint = str3;
        this.id = str4;
        this.joinLink = str5;
        this.isConcurrent = z;
        this.turnServer = list;
        this.stunServer = list2;
        this.isP2PForbidden = z2;
        this.deviceIndex = i;
    }

    public static CallInfo parse(m67 m67) throws IOException, JsonTypeMismatchException {
        List<PeerConnection.IceServer> emptyList = Collections.emptyList();
        List<PeerConnection.IceServer> emptyList2 = Collections.emptyList();
        m67.s();
        List<PeerConnection.IceServer> list = emptyList;
        List<PeerConnection.IceServer> list2 = emptyList2;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (m67.hasNext()) {
            String T = m67.T();
            T.getClass();
            char c = 65535;
            switch (T.hashCode()) {
                case -494324241:
                    if (T.equals(ApiProtocol.KEY_JOIN_LINK)) {
                        c = 0;
                        break;
                    }
                    break;
                case -173671634:
                    if (T.equals(ApiProtocol.KEY_CLIENT_TYPE)) {
                        c = 1;
                        break;
                    }
                    break;
                case -17633304:
                    if (T.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (T.equals(ApiProtocol.KEY_ID)) {
                        c = 3;
                        break;
                    }
                    break;
                case 110541305:
                    if (T.equals(ApiProtocol.KEY_TOKEN)) {
                        c = 4;
                        break;
                    }
                    break;
                case 781502804:
                    if (T.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                        c = 5;
                        break;
                    }
                    break;
                case 828977132:
                    if (T.equals(ApiProtocol.KEY_IS_CONCURRENT)) {
                        c = 6;
                        break;
                    }
                    break;
                case 836670789:
                    if (T.equals(ApiProtocol.KEY_TURN_SERVER)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1702739560:
                    if (T.equals(ApiProtocol.KEY_STUN_SERVER)) {
                        c = 8;
                        break;
                    }
                    break;
                case 1741102485:
                    if (T.equals(ApiProtocol.KEY_ENDPOINT)) {
                        c = 9;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str5 = m67.H();
                    break;
                case 1:
                    str2 = m67.H();
                    break;
                case 2:
                    z2 = m67.a0();
                    break;
                case 3:
                    str4 = m67.H();
                    break;
                case 4:
                    str = m67.H();
                    break;
                case 5:
                    i = m67.D();
                    break;
                case 6:
                    z = m67.a0();
                    break;
                case 7:
                    list = TurnStunParser.parseTurn(m67);
                    break;
                case 8:
                    list2 = TurnStunParser.parseStun(m67);
                    break;
                case 9:
                    str3 = m67.H();
                    break;
                default:
                    m67.z();
                    break;
            }
        }
        m67.q();
        return new CallInfo(str, str2, str3, str4, str5, z, list, list2, z2, i);
    }

    public String getFormattedJoinLink(String str) {
        StringBuilder l = hr1.l(str);
        l.append(this.joinLink);
        return l.toString();
    }

    public ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turnServer);
        linkedList.addAll(this.stunServer);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        return conversationParams;
    }
}
