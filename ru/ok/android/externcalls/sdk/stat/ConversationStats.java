package ru.ok.android.externcalls.sdk.stat;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.stat.connect.ConversationConnectedToSignalingStat;
import ru.ok.android.externcalls.sdk.stat.reconnect.ConversationReconnectStat;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "", "Lkotlin/Function0;", "Lw41;", "getEventualStatSender", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "statReporter", "Lct3;", "cidProvider", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Leje;", "timeProvider", "<init>", "(Ls16;Lru/ok/android/externcalls/sdk/log/ExtLogger;Lct3;Lru/ok/android/externcalls/sdk/Conversation$CallType;Leje;)V", "Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "connectedToSignalingStat", "Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "Lru/ok/android/externcalls/sdk/stat/reconnect/ConversationReconnectStat;", "reconnectStat", "Lru/ok/android/externcalls/sdk/stat/reconnect/ConversationReconnectStat;", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "preparedStat", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "startedStat", "Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingStat;", "wsSignalingStat", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingStat;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationStats {
    public final ConversationConnectedToSignalingStat connectedToSignalingStat;
    public final ConversationPreparedStat preparedStat;
    public final ConversationReconnectStat reconnectStat;
    public final ConversationStartedStat startedStat;
    public final SignalingStat wsSignalingStat;

    public ConversationStats(s16 s16, ExtLogger extLogger, ct3 ct3, Conversation.CallType callType, eje eje) {
        this.connectedToSignalingStat = new ConversationConnectedToSignalingStat(s16, eje);
        this.reconnectStat = new ConversationReconnectStat(extLogger, ct3);
        this.preparedStat = new ConversationPreparedStat(s16, eje);
        this.startedStat = new ConversationStartedStat(s16, callType, eje);
        this.wsSignalingStat = new SignalingStat(s16, eje);
    }
}
