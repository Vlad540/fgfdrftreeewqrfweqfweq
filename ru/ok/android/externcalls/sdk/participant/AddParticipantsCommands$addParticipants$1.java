package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmfd;", "signaling", "Ljue;", "invoke", "(Lmfd;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class AddParticipantsCommands$addParticipants$1 extends b97 implements u16 {
    final /* synthetic */ boolean $isShowChatHistory;
    final /* synthetic */ Boolean $isUnban;
    final /* synthetic */ u16 $onError;
    final /* synthetic */ u16 $onSuccess;
    final /* synthetic */ Collection<ge1> $participantsIds;
    final /* synthetic */ AddParticipantsCommands this$0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        static {
            /*
                r0 = 2
                int[] r1 = hr1.w(r0)
                int r1 = r1.length
                int[] r1 = new int[r1]
                r2 = 0
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                $EnumSwitchMapping$0 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipants$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddParticipantsCommands$addParticipants$1(Collection<ge1> collection, Boolean bool, boolean z, u16 u16, AddParticipantsCommands addParticipantsCommands, u16 u162) {
        super(1);
        this.$participantsIds = collection;
        this.$isUnban = bool;
        this.$isShowChatHistory = z;
        this.$onError = u16;
        this.this$0 = addParticipantsCommands;
        this.$onSuccess = u162;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$4(AddParticipantsCommands addParticipantsCommands, u16 u16, u16 u162, JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has("participants")) {
                JSONArray jSONArray = jSONObject.getJSONArray("participants");
                int length = jSONObject.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        ge1 K = x87.K(optJSONObject);
                        int t = hr1.t(addParticipantsCommands.call.y(K, optJSONObject));
                        if (t == 0) {
                            arrayList.add(K);
                        } else if (t == 1) {
                            arrayList2.add(K);
                        }
                    }
                }
            }
            if (u16 != null) {
                ArrayList<ge1> P = x87.P(jSONObject, "rejectedParticipantIds");
                ArrayList<ge1> arrayList3 = hw4.a;
                if (P == null) {
                    P = arrayList3;
                }
                ArrayList P2 = x87.P(jSONObject, "bannedParticipantIds");
                if (P2 != null) {
                    arrayList3 = P2;
                }
                IdMappingWrapper access$getMappings$p = addParticipantsCommands.mappings;
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ParticipantId byInternal = access$getMappings$p.getByInternal((ge1) it.next());
                    if (byInternal != null) {
                        arrayList4.add(byInternal);
                    }
                }
                IdMappingWrapper access$getMappings$p2 = addParticipantsCommands.mappings;
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ParticipantId byInternal2 = access$getMappings$p2.getByInternal((ge1) it2.next());
                    if (byInternal2 != null) {
                        arrayList5.add(byInternal2);
                    }
                }
                IdMappingWrapper access$getMappings$p3 = addParticipantsCommands.mappings;
                ArrayList arrayList6 = new ArrayList();
                for (ge1 byInternal3 : P) {
                    ParticipantId byInternal4 = access$getMappings$p3.getByInternal(byInternal3);
                    if (byInternal4 != null) {
                        arrayList6.add(byInternal4);
                    }
                }
                IdMappingWrapper access$getMappings$p4 = addParticipantsCommands.mappings;
                ArrayList arrayList7 = new ArrayList();
                for (ge1 byInternal5 : arrayList3) {
                    ParticipantId byInternal6 = access$getMappings$p4.getByInternal(byInternal5);
                    if (byInternal6 != null) {
                        arrayList7.add(byInternal6);
                    }
                }
                u16.invoke(new AddParticipantsResult(arrayList4, arrayList5, arrayList6, arrayList7));
            }
        } catch (JSONException e) {
            if (u162 != null) {
                u162.invoke(new RuntimeException("add.participant.success", e));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$5(u16 u16, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        if (u16 != null) {
            u16.invoke(addParticipantsCommands.parseAddError(jSONObject));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((mfd) obj);
        return jue.a;
    }

    public final void invoke(mfd mfd) {
        try {
            x66 i = x87.i(this.$participantsIds, this.$isUnban, this.$isShowChatHistory);
            AddParticipantsCommands addParticipantsCommands = this.this$0;
            u16 u16 = this.$onSuccess;
            u16 u162 = this.$onError;
            mfd.d(i, false, new c(addParticipantsCommands, u16, u162), new b(u162, addParticipantsCommands, 1));
        } catch (JSONException e) {
            u16 u163 = this.$onError;
            if (u163 != null) {
                u163.invoke(new RuntimeException("add.participant", e));
            }
        }
    }
}
