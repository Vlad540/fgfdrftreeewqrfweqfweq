package ru.ok.android.externcalls.sdk.feedback.internal.listeners;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001WB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u001d\u0010\u001b\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J1\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0&H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b.\u0010\u001fJ\u001f\u00103\u001a\u00020\u00102\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b6\u0010\u0018J\u0011\u00107\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0010¢\u0006\u0004\b9\u0010\u0014J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020:0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR:\u0010M\u001a&\u0012\b\u0012\u00060Jj\u0002`K\u0012\u0004\u0012\u00020\u000e0Ij\u0012\u0012\b\u0012\u00060Jj\u0002`K\u0012\u0004\u0012\u00020\u000e`L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0T8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "Ll51;", "Lru/ok/android/externcalls/sdk/Conversation;", "conversation", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "<init>", "(Lru/ok/android/externcalls/sdk/Conversation;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)V", "", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "newFeedback", "Ljue;", "updateActiveFeedback", "(Ljava/util/List;)V", "scheduleRemoving", "()V", "", "currentTime", "tryToRemoveOld", "(J)V", "list", "notifyFeedbackRemoved", "notifyFeedbackAdded", "", "isEnabled", "notifyFeedbackEnabledChanged", "(Z)V", "Lk51;", "feedback", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManagerImpl$CallParticipantFeedback;", "unrollReceivedFeedback", "(Lk51;)Ljava/util/List;", "mappedFeedbacks", "", "resolvedMappings", "processFeedbackForResolvedInternalIds", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "feedbacks", "notifyResolvedFeedbackItems", "onFeedback", "(Lk51;)V", "onFeedbackEnabledChanged", "", "key", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "source", "ownFeedbackSent", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;)V", "millis", "setTimeout", "getOwnCurrentFeedback", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "clear", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/Conversation;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lkotlin/collections/HashMap;", "activeFeedback", "Ljava/util/HashMap;", "timeout", "J", "Ljava/util/LinkedList;", "generations", "Ljava/util/LinkedList;", "", "getFeedback", "()Ljava/util/Set;", "CallParticipantFeedback", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class FeedbackListenerManagerImpl implements FeedbackListenerManager, l51 {
    private HashMap<ParticipantId, ParticipantFeedback> activeFeedback = new HashMap<>();
    private final Conversation conversation;
    private final LinkedList<Long> generations = new LinkedList<>();
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final CopyOnWriteArraySet<FeedbackListener> listeners = new CopyOnWriteArraySet<>();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final ParticipantStore store;
    private long timeout = 10000;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManagerImpl$CallParticipantFeedback;", "", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "feedbackId", "<init>", "(Lge1;Ljava/lang/String;)V", "Lge1;", "getParticipantId", "()Lge1;", "Ljava/lang/String;", "getFeedbackId", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class CallParticipantFeedback {
        private final String feedbackId;
        private final ge1 participantId;

        public CallParticipantFeedback(ge1 ge1, String str) {
            this.participantId = ge1;
            this.feedbackId = str;
        }

        public final String getFeedbackId() {
            return this.feedbackId;
        }

        public final ge1 getParticipantId() {
            return this.participantId;
        }
    }

    public FeedbackListenerManagerImpl(Conversation conversation2, ParticipantStore participantStore, IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2) {
        this.conversation = conversation2;
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
    }

    private final void notifyFeedbackAdded(List<ParticipantFeedback> list) {
        for (FeedbackListener onFeedbackAdded : this.listeners) {
            onFeedbackAdded.onFeedbackAdded(list);
        }
    }

    private final void notifyFeedbackEnabledChanged(boolean z) {
        for (FeedbackListener onFeedbackEnabledChanged : this.listeners) {
            onFeedbackEnabledChanged.onFeedbackEnabledChanged(z);
        }
    }

    private final void notifyFeedbackRemoved(List<ParticipantFeedback> list) {
        for (FeedbackListener onFeedbackRemoved : this.listeners) {
            onFeedbackRemoved.onFeedbackRemoved(list);
        }
    }

    private final void notifyResolvedFeedbackItems(List<ParticipantFeedback> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                ParticipantFeedback participantFeedback = (ParticipantFeedback) next;
                ParticipantFeedback participantFeedback2 = this.activeFeedback.get(participantFeedback.getParticipantId());
                if (!hhd.f(participantFeedback2 != null ? participantFeedback2.getKey() : null, participantFeedback.getKey())) {
                    arrayList.add(next);
                }
            }
            updateActiveFeedback(list);
            if (!arrayList.isEmpty()) {
                notifyFeedbackAdded(arrayList);
            }
            scheduleRemoving();
        }
    }

    /* access modifiers changed from: private */
    public static final void onFeedback$lambda$1(FeedbackListenerManagerImpl feedbackListenerManagerImpl, List list, List list2) {
        feedbackListenerManagerImpl.processFeedbackForResolvedInternalIds(list, list2);
        feedbackListenerManagerImpl.notifyResolvedFeedbackItems(list2);
    }

    /* access modifiers changed from: private */
    public static final void onFeedback$lambda$2(FeedbackListenerManagerImpl feedbackListenerManagerImpl, List list) {
        feedbackListenerManagerImpl.notifyResolvedFeedbackItems(list);
    }

    private final List<CallParticipantFeedback> processFeedbackForResolvedInternalIds(List<CallParticipantFeedback> list, List<ParticipantFeedback> list2) {
        ParticipantId byInternal;
        long currentTimeMillis = System.currentTimeMillis() + this.timeout;
        ArrayList arrayList = new ArrayList();
        for (CallParticipantFeedback callParticipantFeedback : list) {
            ConversationParticipant byInternal2 = this.store.getByInternal(callParticipantFeedback.getParticipantId());
            if (byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) {
                byInternal = this.idMappingWrapper.getByInternal(callParticipantFeedback.getParticipantId());
            }
            ParticipantId participantId = byInternal;
            ParticipantFeedback participantFeedback = participantId != null ? new ParticipantFeedback(callParticipantFeedback.getFeedbackId(), currentTimeMillis, participantId, (ParticipantFeedbackSource) null, 8, (x54) null) : null;
            if (participantFeedback != null) {
                list2.add(participantFeedback);
            } else {
                arrayList.add(callParticipantFeedback);
            }
        }
        this.generations.add(Long.valueOf(currentTimeMillis));
        return arrayList;
    }

    private final void scheduleRemoving() {
        LinkedList<Long> linkedList = this.generations;
        Long remove = linkedList.isEmpty() ? null : linkedList.remove(0);
        if (remove != null) {
            long longValue = remove.longValue();
            this.mainHandler.postDelayed(new q50(this, longValue, 4), longValue - System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: private */
    public static final void scheduleRemoving$lambda$4(FeedbackListenerManagerImpl feedbackListenerManagerImpl, long j) {
        feedbackListenerManagerImpl.tryToRemoveOld(j);
    }

    private final void tryToRemoveOld(long j) {
        Iterator<Map.Entry<ParticipantId, ParticipantFeedback>> it = this.activeFeedback.entrySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((ParticipantFeedback) next.getValue()).getFinishTimeMs() <= j) {
                it.remove();
                arrayList.add(next.getValue());
            }
        }
        if (!arrayList.isEmpty()) {
            notifyFeedbackRemoved(arrayList);
        }
        scheduleRemoving();
    }

    private final List<CallParticipantFeedback> unrollReceivedFeedback(k51 k51) {
        List<j51> list = k51.b;
        ArrayList arrayList = new ArrayList();
        for (j51 j51 : list) {
            List<ge1> list2 = j51.b;
            ArrayList arrayList2 = new ArrayList(q23.H(list2, 10));
            for (ge1 callParticipantFeedback : list2) {
                arrayList2.add(new CallParticipantFeedback(callParticipantFeedback, j51.a));
            }
            u23.K(arrayList2, arrayList);
        }
        return arrayList;
    }

    private final void updateActiveFeedback(List<ParticipantFeedback> list) {
        for (ParticipantFeedback participantFeedback : list) {
            this.activeFeedback.put(participantFeedback.getParticipantId(), participantFeedback);
        }
    }

    public void addListener(FeedbackListener feedbackListener) {
        this.listeners.add(feedbackListener);
    }

    public final void clear() {
        this.activeFeedback = new HashMap<>();
    }

    public final Set<ParticipantFeedback> getFeedback() {
        return o23.w0(this.activeFeedback.values());
    }

    public ParticipantFeedback getOwnCurrentFeedback() {
        return this.activeFeedback.get(this.conversation.getMe().getExternalId());
    }

    public void onFeedback(k51 k51) {
        if (hhd.f(k51.a, this.store.getActiveRoomId())) {
            List<CallParticipantFeedback> unrollReceivedFeedback = unrollReceivedFeedback(k51);
            if (!unrollReceivedFeedback.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                List<CallParticipantFeedback> processFeedbackForResolvedInternalIds = processFeedbackForResolvedInternalIds(unrollReceivedFeedback, arrayList);
                if (processFeedbackForResolvedInternalIds.isEmpty()) {
                    notifyResolvedFeedbackItems(arrayList);
                    return;
                }
                IdMappingResolver idMappingResolver2 = this.idMappingResolver;
                ArrayList arrayList2 = new ArrayList(q23.H(processFeedbackForResolvedInternalIds, 10));
                for (CallParticipantFeedback participantId : processFeedbackForResolvedInternalIds) {
                    arrayList2.add(participantId.getParticipantId());
                }
                idMappingResolver2.resolveExternalsByInternalsIds(arrayList2, new px4(this, processFeedbackForResolvedInternalIds, arrayList, 3), new ii4((Object) this, 24, (Object) arrayList));
            }
        }
    }

    public final void onFeedbackEnabledChanged(boolean z) {
        notifyFeedbackEnabledChanged(z);
    }

    public void ownFeedbackSent(String str, ParticipantFeedbackSource participantFeedbackSource) {
        ConversationParticipant me = this.conversation.getMe();
        if (me != null) {
            long currentTimeMillis = System.currentTimeMillis() + this.timeout;
            ParticipantFeedback participantFeedback = new ParticipantFeedback(str, currentTimeMillis, me.getExternalId(), participantFeedbackSource);
            this.generations.add(Long.valueOf(currentTimeMillis));
            updateActiveFeedback(Collections.singletonList(participantFeedback));
            notifyFeedbackAdded(Collections.singletonList(participantFeedback));
            scheduleRemoving();
        }
    }

    public void removeListener(FeedbackListener feedbackListener) {
        this.listeners.remove(feedbackListener);
    }

    public void setTimeout(long j) {
        this.timeout = j;
    }
}
