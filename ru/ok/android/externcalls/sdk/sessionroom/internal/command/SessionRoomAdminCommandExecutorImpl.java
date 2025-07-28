package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJg\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001a\u0010\u0012\u001a\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u00060\u0010j\u0002`\u00110\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010!\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J=\u0010$\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020#2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020(2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b)\u0010*J=\u0010,\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020+2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "", "Lv2d;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addToRooms", "removeFromRooms", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "externalToInternalIdsMap", "Lrve;", "buildUpdateRoomsParams", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lrve;", "Lr7;", "params", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(Lr7;Ls16;Lu16;)V", "Lf9c;", "removeRooms", "(Lf9c;Ls16;Lu16;)V", "Lg7e;", "switchRoom", "(Lg7e;Ls16;Lu16;)V", "updateRooms", "(Lrve;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomAdminCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomAdminCommandExecutor {
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;
    private final SignalingProvider signalingProvider;

    public SessionRoomAdminCommandExecutorImpl(SignalingProvider signalingProvider2, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.signalingProvider = signalingProvider2;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    private static final void activateRooms$lambda$0(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    private static final void activateRooms$lambda$1(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("activateRooms", jSONObject, u16);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, pve] */
    private final rve buildUpdateRoomsParams(Map<v2d, ? extends List<ParticipantId>> map, Map<v2d, ? extends List<ParticipantId>> map2, Map<ParticipantId, ge1> map3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<v2d> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry next : map.entrySet()) {
            linkedHashSet.add(next.getKey());
            for (ParticipantId participantId : (List) next.getValue()) {
                ge1 ge1 = map3.get(participantId);
                if (ge1 != null) {
                    Object key = next.getKey();
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(key, obj);
                    }
                    ((List) obj).add(ge1);
                }
            }
        }
        for (Map.Entry next2 : map2.entrySet()) {
            linkedHashSet.add(next2.getKey());
            for (ParticipantId participantId2 : (List) next2.getValue()) {
                ge1 ge12 = map3.get(participantId2);
                if (ge12 != null) {
                    Object key2 = next2.getKey();
                    Object obj2 = linkedHashMap2.get(key2);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap2.put(key2, obj2);
                    }
                    ((List) obj2).add(ge12);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(q23.H(linkedHashSet, 10));
        for (v2d v2d : linkedHashSet) {
            ? obj3 = new Object();
            obj3.a = v2d;
            List list = (List) linkedHashMap.get(v2d);
            if (list != null) {
                obj3.b = list;
            }
            List list2 = (List) linkedHashMap2.get(v2d);
            if (list2 != null) {
                obj3.c = list2;
            }
            arrayList2.add(obj3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pve pve = (pve) it.next();
            arrayList3.add(new qve(pve.a, (List) pve.b, (List) pve.c));
        }
        return new rve(arrayList3);
    }

    private static final void removeRooms$lambda$2(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    private static final void removeRooms$lambda$3(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("removeRooms", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void switchRoom$lambda$4(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void switchRoom$lambda$5(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("switchRoom", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void updateRooms$lambda$6(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void updateRooms$lambda$7(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("updateRooms", jSONObject, u16);
    }

    public void activateRooms(r7 r7Var, s16 s16, u16 u16) {
        throw null;
    }

    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, s16 s16, u16 u16) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(q23.I(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap().values()));
            linkedHashSet.addAll(q23.I(assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap().values()));
            updateRooms(buildUpdateRoomsParams(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap(), assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap(), this.participantDataProvider.getInternalIdsByExternal(linkedHashSet)), s16, u16);
        } catch (Throwable th) {
            if (u16 != null) {
                u16.invoke(th);
            }
        }
    }

    public void moveParticipant(MoveParticipantParams moveParticipantParams, s16 s16, u16 u16) {
        ParticipantId participantId = moveParticipantParams.getParticipantId();
        if (participantId != null) {
            this.participantDataProvider.resolveInternalIdByExternal(participantId, new SessionRoomAdminCommandExecutorImpl$moveParticipant$1(this, moveParticipantParams, s16, u16), u16);
            return;
        }
        w2d toRoomId = moveParticipantParams.getToRoomId();
        if (toRoomId != null) {
            switchRoom(new g7e((ge1) null, toRoomId), s16, u16);
            return;
        }
        throw new IllegalArgumentException("Session room id is required".toString());
    }

    public void removeRooms(f9c f9c, s16 s16, u16 u16) {
        throw null;
    }

    public void switchRoom(g7e g7e, s16 s16, u16 u16) {
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null) {
            mfd.d(x87.C(g7e), false, new ps(10, s16), new r2d(this, u16, 0));
        }
    }

    public void updateRooms(rve rve, s16 s16, u16 u16) {
        x66 x66;
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-rooms");
            Collection<qve> collection = rve.a;
            if (collection == null) {
                x66 = new x66(jSONObject);
            } else {
                JSONArray jSONArray = new JSONArray();
                for (qve qve : collection) {
                    JSONObject jSONObject2 = new JSONObject();
                    v2d v2d = qve.a;
                    if (v2d != null) {
                        jSONObject2.put(ApiProtocol.KEY_ID, v2d.a);
                    }
                    Collection<ge1> collection2 = qve.b;
                    if (collection2 != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (ge1 c : collection2) {
                            jSONArray2.put((Object) c.c());
                        }
                        jSONObject2.put("addParticipantIds", (Object) jSONArray2);
                    }
                    Collection<ge1> collection3 = qve.c;
                    if (collection3 != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (ge1 c2 : collection3) {
                            jSONArray3.put((Object) c2.c());
                        }
                        jSONObject2.put("removeParticipantIds", (Object) jSONArray3);
                    }
                    jSONArray.put((Object) jSONObject2);
                }
                jSONObject.put("rooms", (Object) jSONArray);
                x66 = new x66(jSONObject);
            }
            mfd.d(x66, false, new ps(11, s16), new r2d(this, u16, 1));
        }
    }
}
