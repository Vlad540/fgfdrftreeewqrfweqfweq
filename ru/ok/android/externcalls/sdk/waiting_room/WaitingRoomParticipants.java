package ru.ok.android.externcalls.sdk.waiting_room;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 b2\u00020\u0001:\u0003bcdB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0003¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,J!\u00102\u001a\f\u0012\b\u0012\u000600j\u0002`10/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\b\u0012\u0004\u0012\u0002060/2\u0006\u0010\r\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u0002042\u0006\u00109\u001a\u00020-2\n\u0010:\u001a\u000600j\u0002`1H\u0002¢\u0006\u0004\b;\u0010<JP\u0010D\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u001a\b\u0004\u0010A\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0=\u0012\u0004\u0012\u00020\u000e0@2\u0014\b\u0004\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000e0@H\b¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020-0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\f\u0012\b\u0012\u000600j\u0002`10=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bH\u0010GJ\u001d\u0010I\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000eH\u0002¢\u0006\u0004\bK\u0010'J\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0003¢\u0006\u0004\bQ\u0010'J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bR\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\"\u0010Y\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\u00110\u00110W8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010_R\u001e\u0010`\u001a\n X*\u0004\u0018\u00010*0*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants;", "Ljn1;", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "listener", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lxwb;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lxwb;)V", "Lgx0;", "call", "Ljue;", "setCall", "(Lgx0;)V", "", "isMeAdmin", "onIsMeAdminMayHaveChanged", "(Z)V", "isWaitingRoomEnabled", "onWaitingRoomEnabled", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Len1;", "event", "onAttendee", "(Len1;)V", "Lfn1;", "onFeedback", "(Lfn1;)V", "Lhn1;", "onPromotionUpdated", "(Lhn1;)V", "Lgn1;", "onHandUp", "(Lgn1;)V", "release", "()V", "update", "onWaitingRoomParticipantsMayHaveChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "loadWaitingParticipantIds", "()Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "waitingParticipantId", "Ldhd;", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "resolveInternalIdSingle", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;)Ldhd;", "Ldn1;", "fromId", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "loadWaitingParticipantIdsPageSingle", "(Lgx0;Ldn1;)Ldhd;", "participantId", "internalId", "fromInternalLong", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;Lge1;)Ldn1;", "", "Lcn1;", "waitingParticipants", "Lkotlin/Function1;", "onResult", "", "onError", "resolveInternalIds", "(Ljava/util/List;Lu16;Lu16;)V", "getResolvedWaitingParticipantIds", "(Ljava/util/List;)Ljava/util/List;", "getInternalIdsToResolve", "putIdMappingsToCache", "(Ljava/util/List;)V", "scheduleLoad", "data", "notifyListener", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "shouldSendWaitingList", "()Z", "notifyListenerWithEmptyList", "notifyIfListChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lxwb;", "Lajb;", "kotlin.jvm.PlatformType", "loadEventSubject", "Lajb;", "Ln83;", "compositeDisposable", "Ln83;", "Lgx0;", "Z", "lastSentParticipantIds", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Companion", "Listener", "WaitingParticipantsPage", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class WaitingRoomParticipants implements jn1 {
    public static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "WaitingRoomParticipants";
    private static final int PAGE_SIZE = 50;
    private volatile gx0 call;
    private final n83 compositeDisposable;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean isMeAdmin;
    private volatile boolean isWaitingRoomEnabled;
    private volatile WaitingRoomParticipantsUpdate lastSentParticipantIds;
    private final Listener listener;
    private final ajb loadEventSubject;
    private final xwb log;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Companion;", "", "()V", "LOG_TAG", "", "PAGE_SIZE", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "data", "Ljue;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface Listener {
        void onMeInWaitingRoomChanged(boolean z);

        void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "", "participantIds", "", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "hasMore", "", "(Ljava/util/List;Z)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getParticipantIds", "()Ljava/util/List;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WaitingParticipantsPage {
        private boolean hasMore;
        private final List<ConversationWaitingParticipantId> participantIds;

        public WaitingParticipantsPage(List<ConversationWaitingParticipantId> list, boolean z) {
            this.participantIds = list;
            this.hasMore = z;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final List<ConversationWaitingParticipantId> getParticipantIds() {
            return this.participantIds;
        }

        public final void setHasMore(boolean z) {
            this.hasMore = z;
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [n83, java.lang.Object] */
    public WaitingRoomParticipants(Listener listener2, IdMappingWrapper idMappingWrapper2, IdMappingResolver idMappingResolver2, xwb xwb) {
        this.listener = listener2;
        this.idMappingWrapper = idMappingWrapper2;
        this.idMappingResolver = idMappingResolver2;
        this.log = xwb;
        ajb ajb = new ajb();
        this.loadEventSubject = ajb;
        ? obj = new Object();
        this.compositeDisposable = obj;
        WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = WaitingRoomParticipantsUpdate.EMPTY;
        this.lastSentParticipantIds = waitingRoomParticipantsUpdate;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        qmc a = cnc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        au9 au9 = new au9(new dt9(ajb, timeUnit, a, 1).n(cnc.b()), new WaitingRoomParticipants$loadDisposable$1(this), 3);
        Objects.requireNonNull(waitingRoomParticipantsUpdate, "item is null");
        obj.a(new au9(au9, new b36(waitingRoomParticipantsUpdate), 5).n(de.a()).p(new WaitingRoomParticipants$loadDisposable$2(this)));
    }

    private final dn1 fromInternalLong(ConversationWaitingParticipantId conversationWaitingParticipantId, ge1 ge1) {
        return new dn1(ge1, conversationWaitingParticipantId.addedTs);
    }

    private final List<ge1> getInternalIdsToResolve(List<cn1> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (cn1 cn1 : list) {
            dn1 dn1 = cn1.a;
            IdMappingWrapper idMappingWrapper2 = this.idMappingWrapper;
            ge1 ge1 = dn1.b;
            if (idMappingWrapper2.getByInternal(ge1) == null) {
                arrayList.add(ge1);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final List<ConversationWaitingParticipantId> getResolvedWaitingParticipantIds(List<cn1> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (cn1 next : list) {
            ParticipantId byInternal = this.idMappingWrapper.getByInternal(next.a.b);
            if (byInternal != null) {
                arrayList.add(new ConversationWaitingParticipantId(ParticipantId.withoutDeviceId(byInternal.id, byInternal.isAnon), next.a.a));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final WaitingRoomParticipantsUpdate loadWaitingParticipantIds() {
        dn1 dn1;
        boolean z;
        gx0 gx0 = this.call;
        if (gx0 == null || !this.isMeAdmin || !this.isWaitingRoomEnabled) {
            return WaitingRoomParticipantsUpdate.EMPTY;
        }
        ArrayList arrayList = new ArrayList();
        ConversationWaitingParticipantId conversationWaitingParticipantId = null;
        do {
            if (conversationWaitingParticipantId != null) {
                try {
                    dn1 = fromInternalLong(conversationWaitingParticipantId, (ge1) resolveInternalIdSingle(conversationWaitingParticipantId).e());
                } catch (Throwable th) {
                    this.log.log(LOG_TAG, "can't resolve internal id for " + conversationWaitingParticipantId + ". Error: " + th.getMessage());
                }
            } else {
                dn1 = null;
            }
            try {
                WaitingParticipantsPage waitingParticipantsPage = (WaitingParticipantsPage) loadWaitingParticipantIdsPageSingle(gx0, dn1).e();
                for (ConversationWaitingParticipantId participantId : waitingParticipantsPage.getParticipantIds()) {
                    arrayList.add(participantId.getParticipantId());
                }
                z = waitingParticipantsPage.getHasMore() && (waitingParticipantsPage.getParticipantIds().isEmpty() ^ true);
                if (!waitingParticipantsPage.getParticipantIds().isEmpty()) {
                    conversationWaitingParticipantId = waitingParticipantsPage.getParticipantIds().get(waitingParticipantsPage.getParticipantIds().size() - 1);
                    continue;
                }
            } catch (Throwable th2) {
                this.log.log(LOG_TAG, "can't load next page. Error: " + th2.getMessage());
            }
        } while (z);
        HashSet hashSet = new HashSet(this.lastSentParticipantIds.participantsIds);
        HashSet hashSet2 = new HashSet(arrayList);
        hashSet.removeAll(arrayList);
        hashSet2.removeAll(this.lastSentParticipantIds.participantsIds);
        this.lastSentParticipantIds = new WaitingRoomParticipantsUpdate(arrayList, !hashSet2.isEmpty(), !hashSet.isEmpty());
        return this.lastSentParticipantIds;
    }

    private final dhd loadWaitingParticipantIdsPageSingle(gx0 gx0, dn1 dn1) {
        return new mv9(1, new cwe(gx0, dn1, this, 3));
    }

    /* access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6(gx0 gx0, dn1 dn1, WaitingRoomParticipants waitingRoomParticipants, nhd nhd) {
        sla sla = new sla(waitingRoomParticipants, 6, nhd);
        ief ief = new ief(nhd, 0);
        mfd mfd = gx0.Z;
        try {
            x66 d = x87.d((JSONObject) null, "get-waiting-hall");
            JSONObject jSONObject = d.a;
            jSONObject.put("backward", false);
            if (dn1 != null) {
                jSONObject.put("fromId", (Object) new JSONObject().put(ApiProtocol.KEY_ID, (Object) dn1.b.c()).put("addedTs", dn1.a));
            }
            d.b(PAGE_SIZE, "count");
            mfd.d(d, false, new yw0(gx0, sla, ief, 0), new ax0(0, ief));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4(WaitingRoomParticipants waitingRoomParticipants, nhd nhd, kn1 kn1) {
        List list = kn1.a;
        waitingRoomParticipants.putIdMappingsToCache(list);
        List<ge1> internalIdsToResolve = waitingRoomParticipants.getInternalIdsToResolve(list);
        if (!internalIdsToResolve.isEmpty()) {
            waitingRoomParticipants.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1(waitingRoomParticipants, list, nhd, kn1, nhd), new WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2(nhd));
            return;
        }
        ((ihd) nhd).a(new WaitingParticipantsPage(waitingRoomParticipants.getResolvedWaitingParticipantIds(list), kn1.b));
    }

    /* access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(nhd nhd) {
        ((ihd) nhd).c(new RuntimeException("Can't get waiting room partiicpants"));
    }

    private final void notifyIfListChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        this.listener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
    }

    /* access modifiers changed from: private */
    public final void notifyListener(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        if (shouldSendWaitingList()) {
            notifyIfListChanged(waitingRoomParticipantsUpdate);
        } else {
            notifyListenerWithEmptyList();
        }
    }

    private final void notifyListenerWithEmptyList() {
        this.lastSentParticipantIds = WaitingRoomParticipantsUpdate.EMPTY;
        notifyIfListChanged(this.lastSentParticipantIds);
    }

    private final void onWaitingRoomParticipantsMayHaveChanged() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        }
    }

    private final void putIdMappingsToCache(List<cn1> list) {
        for (cn1 next : list) {
            ParticipantId convert = CallExternalIdConverter.convert(next.b);
            if (convert != null) {
                this.idMappingWrapper.addMapping(convert, next.a.b);
            }
        }
    }

    private final dhd resolveInternalIdSingle(ConversationWaitingParticipantId conversationWaitingParticipantId) {
        return new mv9(1, new joc(this, 25, conversationWaitingParticipantId));
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1(WaitingRoomParticipants waitingRoomParticipants, ConversationWaitingParticipantId conversationWaitingParticipantId, nhd nhd) {
        waitingRoomParticipants.idMappingResolver.withInternalId(conversationWaitingParticipantId.getParticipantId(), new mf3(5, nhd), new ief(nhd, 1));
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1$lambda$0(nhd nhd) {
        ((ihd) nhd).onError(new RuntimeException());
    }

    private final void resolveInternalIds(List<cn1> list, u16 u16, u16 u162) {
        putIdMappingsToCache(list);
        List<ge1> internalIdsToResolve = getInternalIdsToResolve(list);
        if (!internalIdsToResolve.isEmpty()) {
            this.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new WaitingRoomParticipants$resolveInternalIds$1(this, list, u16, u162), new WaitingRoomParticipants$resolveInternalIds$2(u162));
        } else {
            u16.invoke(getResolvedWaitingParticipantIds(list));
        }
    }

    private final void scheduleLoad() {
        this.loadEventSubject.c(Boolean.TRUE);
    }

    private final boolean shouldSendWaitingList() {
        return this.isMeAdmin && this.isWaitingRoomEnabled;
    }

    private final void update() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        } else {
            notifyListenerWithEmptyList();
        }
    }

    public void onAttendee(en1 en1) {
        onWaitingRoomParticipantsMayHaveChanged();
    }

    public void onFeedback(fn1 fn1) {
    }

    public void onHandUp(gn1 gn1) {
    }

    public final void onIsMeAdminMayHaveChanged(boolean z) {
        if (this.isMeAdmin != z) {
            this.isMeAdmin = z;
            update();
        }
    }

    public void onMeInWaitingRoomChanged(boolean z) {
        this.listener.onMeInWaitingRoomChanged(z);
    }

    public void onPromotionUpdated(hn1 hn1) {
    }

    public final void onWaitingRoomEnabled(boolean z) {
        if (this.isWaitingRoomEnabled != z) {
            this.isWaitingRoomEnabled = z;
            update();
        }
    }

    public final void release() {
        this.compositeDisposable.f();
    }

    public final void setCall(gx0 gx0) {
        this.call = gx0;
    }
}
