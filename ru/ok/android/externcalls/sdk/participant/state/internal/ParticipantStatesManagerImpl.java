package ru.ok.android.externcalls.sdk.participant.state.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b%\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 r2\u00020\u0001:\u0003rstB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010 \u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010!J5\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b%\u0010&J7\u0010(\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b(\u0010)J;\u0010(\u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b(\u0010!J\u0015\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020+H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u00020+H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020\u00112\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\b;\u0010<J5\u0010B\u001a\u00020\u00112\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010=2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0011\u0018\u00010?H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\f\u0012\b\u0012\u000609j\u0002`:0GH\u0016¢\u0006\u0004\bH\u0010IJ\u001b\u0010J\u001a\u00020D2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bJ\u0010KJ\u001b\u0010L\u001a\u00020+2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020+H\u0016¢\u0006\u0004\bN\u00105J\u0017\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\bP\u00108J\u000f\u0010Q\u001a\u00020DH\u0016¢\u0006\u0004\bQ\u0010FJ\u001b\u0010N\u001a\u00020+2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bN\u0010MJ\u001b\u0010Q\u001a\u00020D2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bQ\u0010KJ\u0019\u0010R\u001a\f\u0012\b\u0012\u000609j\u0002`:0GH\u0016¢\u0006\u0004\bR\u0010IJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u0011¢\u0006\u0004\bU\u0010VJ#\u0010W\u001a\u00020+2\n\u0010\u000e\u001a\u000609j\u0002`:2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020D2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\u00020D2\n\u0010\u000e\u001a\u000609j\u0002`:2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020.H\u0002¢\u0006\u0004\b]\u0010^J;\u0010`\u001a\u00020\u00112\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b`\u0010!J#\u0010`\u001a\u00020\u00112\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u0019H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020+H\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010e\u001a\n\u0018\u000109j\u0004\u0018\u0001`:*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r*\u000609j\u0002`:H\u0002¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010jR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010kR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010lR0\u0010n\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020D0m0m8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020p0m8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010o¨\u0006u"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "participantStateChanger", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "stateListener", "Landroid/os/Handler;", "mainThreadHandler", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Landroid/os/Handler;)V", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "Lie1;", "newState", "Ljue;", "onStateChanged", "(Lge1;Lie1;)V", "", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participants", "onParticipantsRemoved", "(Ljava/util/List;)V", "", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "states", "Llfd;", "listener", "errorListener", "updateMyStates", "(Ljava/util/Map;Llfd;Llfd;)V", "state", "Lv2d;", "roomId", "resetStates", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lv2d;Llfd;Llfd;)V", "isOn", "updateOwnState", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;Llfd;Llfd;)V", "", "", "isOwnStateOn", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)Z", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;", "addAssistanceRequestListener", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "removeAssistanceRequestListener", "addHandListener", "removeHandListener", "isOwnHandRaised", "()Z", "isRaised", "setOwnHandRaised", "(Z)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "lowerHandParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "lowerHandForAll", "(Ls16;Lu16;)V", "", "getOwnHandRaiseTime", "()J", "", "getRaisedHandIds", "()Ljava/util/Set;", "getHandRaiseTime", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)J", "isHandRaised", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Z", "isAssistanceRequested", "isRequested", "setAssistanceRequested", "getAssistanceRequestTime", "getAssistanceRequestIds", "resetAssistanceRequests", "(Lv2d;)V", "release", "()V", "isParticipantStateOn", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)Z", "getOwnStateSetupTime", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)J", "getStateSetupTime", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)J", "notifyCurrentState", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "updates", "updateOwnStateInternal", "(Ljava/util/Map;)V", "flag", "mapBooleanFlagToStateValue", "(Z)Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "toExternal", "(Lge1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "toInternal", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lge1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Landroid/os/Handler;", "", "statesMap", "Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy;", "listenersMap", "Companion", "State", "StateValue", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ParticipantStatesManagerImpl implements ParticipantStatesManager {
    public static final Companion Companion = new Companion((x54) null);
    private static final String INTERNAL_STATE_OFF = "0";
    private static final String INTERNAL_STATE_ON = "1";
    /* access modifiers changed from: private */
    public static final StateValue STATE_OFF = StateValue.OFF;
    /* access modifiers changed from: private */
    public static final StateValue STATE_ON = StateValue.ON;
    private final Map<State, ParticipantStatesListenerProxy> listenersMap = new LinkedHashMap();
    private final Handler mainThreadHandler;
    private final ParticipantStateChanger participantStateChanger;
    private final ConversationEventsListener stateListener;
    private final Map<State, Map<ge1, Long>> statesMap = new LinkedHashMap();
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$Companion;", "", "()V", "INTERNAL_STATE_OFF", "", "INTERNAL_STATE_ON", "STATE_OFF", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "getSTATE_OFF", "()Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "STATE_ON", "getSTATE_ON", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final StateValue getSTATE_OFF() {
            return ParticipantStatesManagerImpl.STATE_OFF;
        }

        public final StateValue getSTATE_ON() {
            return ParticipantStatesManagerImpl.STATE_ON;
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "HAND_RAISED", "ASSISTANCE_REQUESTED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum State {
        HAND_RAISED("hand"),
        ASSISTANCE_REQUESTED("drat");
        
        private final String key;

        static {
            State[] $values;
            $ENTRIES = new pz4($values);
        }

        private State(String str) {
            this.key = str;
        }

        public static oz4 getEntries() {
            return $ENTRIES;
        }

        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ON", "OFF", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum StateValue {
        ON(ParticipantStatesManagerImpl.INTERNAL_STATE_ON),
        OFF(ParticipantStatesManagerImpl.INTERNAL_STATE_OFF);
        
        private final String value;

        static {
            StateValue[] $values;
            $ENTRIES = new pz4($values);
        }

        private StateValue(String str) {
            this.value = str;
        }

        public static oz4 getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public ParticipantStatesManagerImpl(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger2, ConversationEventsListener conversationEventsListener, Handler handler) {
        this.store = participantStore;
        this.participantStateChanger = participantStateChanger2;
        this.stateListener = conversationEventsListener;
        this.mainThreadHandler = handler;
    }

    private final long getOwnStateSetupTime(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return 0;
        }
        return getStateSetupTime(externalId, state);
    }

    private final long getStateSetupTime(ParticipantId participantId, State state) {
        Long l;
        Map map = this.statesMap.get(state);
        if (map == null || (l = (Long) map.get(toInternal(participantId))) == null) {
            return 0;
        }
        return l.longValue();
    }

    private final boolean isParticipantStateOn(ParticipantId participantId, State state) {
        Map map = this.statesMap.get(state);
        if (map != null) {
            return map.containsKey(toInternal(participantId));
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void lowerHandForAll$lambda$13(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void lowerHandForAll$lambda$14(u16 u16, JSONObject jSONObject) {
        if (u16 != null) {
            u16.invoke(new Exception(jSONObject.toString()));
        }
    }

    private final StateValue mapBooleanFlagToStateValue(boolean z) {
        return z ? STATE_ON : STATE_OFF;
    }

    private final void notifyCurrentState(State state, ParticipantStatesManager.Listener listener) {
        Map map = this.statesMap.get(state);
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                ParticipantId external = toExternal((ge1) entry.getKey());
                ParticipantStatesManager.ParticipantStateChange participantStateChange = external == null ? null : new ParticipantStatesManager.ParticipantStateChange(external, true, ((Number) entry.getValue()).longValue());
                if (participantStateChange != null) {
                    arrayList.add(participantStateChange);
                }
            }
            listener.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(arrayList));
        }
    }

    public static /* synthetic */ void resetStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, v2d v2d, lfd lfd, lfd lfd2, int i, Object obj) {
        if ((i & 4) != 0) {
            lfd = null;
        }
        if ((i & 8) != 0) {
            lfd2 = null;
        }
        participantStatesManagerImpl.resetStates(state, v2d, lfd, lfd2);
    }

    private final ParticipantId toExternal(ge1 ge1) {
        ConversationParticipant byInternal = this.store.getByInternal(ge1);
        if (byInternal != null) {
            return byInternal.getExternalId();
        }
        return null;
    }

    private final ge1 toInternal(ParticipantId participantId) {
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        if (conversationParticipant != null) {
            return conversationParticipant.getInternalId();
        }
        return null;
    }

    public static /* synthetic */ void updateMyStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, lfd lfd, lfd lfd2, int i, Object obj) {
        if ((i & 2) != 0) {
            lfd = null;
        }
        if ((i & 4) != 0) {
            lfd2 = null;
        }
        participantStatesManagerImpl.updateMyStates(map, lfd, lfd2);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, StateValue stateValue, lfd lfd, lfd lfd2, int i, Object obj) {
        if ((i & 4) != 0) {
            lfd = null;
        }
        if ((i & 8) != 0) {
            lfd2 = null;
        }
        participantStatesManagerImpl.updateOwnState(state, stateValue, lfd, lfd2);
    }

    private final void updateOwnStateInternal(Map<String, String> map, lfd lfd, lfd lfd2) {
        if (!map.isEmpty()) {
            this.participantStateChanger.changeMyState(map, new yw0(lfd, this, map, 2), lfd2);
        }
    }

    public static /* synthetic */ void updateOwnStateInternal$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, lfd lfd, lfd lfd2, int i, Object obj) {
        if ((i & 2) != 0) {
            lfd = null;
        }
        if ((i & 4) != 0) {
            lfd2 = null;
        }
        participantStatesManagerImpl.updateOwnStateInternal(map, lfd, lfd2);
    }

    /* access modifiers changed from: private */
    public static final void updateOwnStateInternal$lambda$19(lfd lfd, ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, JSONObject jSONObject) {
        if (lfd != null) {
            lfd.k(jSONObject);
        }
        participantStatesManagerImpl.updateOwnStateInternal(map);
    }

    public void addAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.ASSISTANCE_REQUESTED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this, this.mainThreadHandler);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    public void addHandListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.HAND_RAISED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this, this.mainThreadHandler);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    public Set<ParticipantId> getAssistanceRequestIds() {
        Map map = this.statesMap.get(State.ASSISTANCE_REQUESTED);
        Set<ParticipantId> set = null;
        Set<ge1> keySet = map != null ? map.keySet() : null;
        if (keySet != null) {
            ArrayList arrayList = new ArrayList();
            for (ge1 external : keySet) {
                ParticipantId external2 = toExternal(external);
                if (external2 != null) {
                    arrayList.add(external2);
                }
            }
            set = o23.w0(arrayList);
        }
        return set == null ? qw4.a : set;
    }

    public long getAssistanceRequestTime() {
        return getOwnStateSetupTime(State.ASSISTANCE_REQUESTED);
    }

    public long getHandRaiseTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.HAND_RAISED);
    }

    public long getOwnHandRaiseTime() {
        return getOwnStateSetupTime(State.HAND_RAISED);
    }

    public Set<ParticipantId> getRaisedHandIds() {
        Map map = this.statesMap.get(State.HAND_RAISED);
        Set<ParticipantId> set = null;
        Set<ge1> keySet = map != null ? map.keySet() : null;
        if (keySet != null) {
            ArrayList arrayList = new ArrayList();
            for (ge1 external : keySet) {
                ParticipantId external2 = toExternal(external);
                if (external2 != null) {
                    arrayList.add(external2);
                }
            }
            set = o23.w0(arrayList);
        }
        return set == null ? qw4.a : set;
    }

    public boolean isAssistanceRequested() {
        return isOwnStateOn(State.ASSISTANCE_REQUESTED);
    }

    public boolean isHandRaised(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.HAND_RAISED);
    }

    public boolean isOwnHandRaised() {
        return isOwnStateOn(State.HAND_RAISED);
    }

    public final boolean isOwnStateOn(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return false;
        }
        return isParticipantStateOn(externalId, state);
    }

    public void lowerHandForAll(s16 s16, u16 u16) {
        this.participantStateChanger.lowerHandForAll(new ps(7, s16), new qs(9, u16));
    }

    public void lowerHandParticipant(ParticipantId participantId) {
        ParticipantStateChanger participantStateChanger2 = this.participantStateChanger;
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        ge1 internalId = conversationParticipant != null ? conversationParticipant.getInternalId() : null;
        if (internalId != null) {
            ParticipantStateChanger.changeParticipantState$default(participantStateChanger2, internalId, Collections.singletonMap(State.HAND_RAISED.getKey(), INTERNAL_STATE_OFF), (lfd) null, (lfd) null, 8, (Object) null);
        }
    }

    public final void onParticipantsRemoved(List<? extends ConversationParticipant> list) {
        for (ConversationParticipant conversationParticipant : list) {
            for (Map remove : this.statesMap.values()) {
                remove.remove(conversationParticipant.getInternalId());
            }
        }
    }

    public final void onStateChanged(ge1 ge1, ie1 ie1) {
        ParticipantStatesListenerProxy participantStatesListenerProxy;
        ParticipantId external;
        x1 entries = State.getEntries();
        entries.getClass();
        u1 u1Var = new u1(0, entries);
        while (u1Var.hasNext()) {
            State state = (State) u1Var.next();
            he1 he1 = (he1) ie1.a.get(state.getKey());
            ParticipantStatesManager.ParticipantStateChange participantStateChange = null;
            String str = he1 != null ? he1.a : null;
            if (hhd.f(str, INTERNAL_STATE_ON)) {
                Map<State, Map<ge1, Long>> map = this.statesMap;
                Map<ge1, Long> map2 = map.get(state);
                if (map2 == null) {
                    map2 = new LinkedHashMap<>();
                    map.put(state, map2);
                }
                map2.put(ge1, Long.valueOf(he1.b));
                ParticipantId external2 = toExternal(ge1);
                if (external2 != null) {
                    participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external2, true, he1.b);
                }
            } else if (hhd.f(str, INTERNAL_STATE_OFF)) {
                Map map3 = this.statesMap.get(state);
                if (!((map3 != null ? (Long) map3.remove(ge1) : null) == null || (external = toExternal(ge1)) == null)) {
                    participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external, false, 0);
                }
            }
            if (!(participantStateChange == null || (participantStatesListenerProxy = this.listenersMap.get(state)) == null)) {
                participantStatesListenerProxy.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(Collections.singletonList(participantStateChange)));
            }
        }
    }

    public final void release() {
        for (ParticipantStatesListenerProxy release : this.listenersMap.values()) {
            release.release();
        }
        this.listenersMap.clear();
    }

    public void removeAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.ASSISTANCE_REQUESTED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    public void removeHandListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.HAND_RAISED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    public void resetAssistanceRequests(v2d v2d) {
        resetStates$default(this, State.ASSISTANCE_REQUESTED, v2d, (lfd) null, (lfd) null, 12, (Object) null);
    }

    public final void resetStates(State state, v2d v2d, lfd lfd, lfd lfd2) {
        Set keySet;
        Map map = this.statesMap.get(state);
        if (map != null && (keySet = map.keySet()) != null) {
            Collection<ConversationParticipant> participants = this.store.getParticipants(v2d);
            ArrayList arrayList = new ArrayList(q23.H(participants, 10));
            for (ConversationParticipant internalId : participants) {
                arrayList.add(internalId.getInternalId());
            }
            Set w0 = o23.w0(arrayList);
            ArrayList<ge1> arrayList2 = new ArrayList<>();
            for (Object next : keySet) {
                if (w0.contains((ge1) next)) {
                    arrayList2.add(next);
                }
            }
            for (ge1 changeParticipantState : arrayList2) {
                this.participantStateChanger.changeParticipantState(changeParticipantState, Collections.singletonMap(state.getKey(), INTERNAL_STATE_OFF), lfd, lfd2);
            }
        }
    }

    public void setAssistanceRequested(boolean z) {
        updateOwnState$default(this, State.ASSISTANCE_REQUESTED, z ? STATE_ON : STATE_OFF, (lfd) null, (lfd) null, 12, (Object) null);
    }

    public void setOwnHandRaised(boolean z) {
        updateOwnState$default(this, State.HAND_RAISED, z ? STATE_ON : STATE_OFF, (lfd) null, (lfd) null, 12, (Object) null);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map) {
        updateMyStates$default(this, map, (lfd) null, (lfd) null, 6, (Object) null);
    }

    public final void updateOwnState(Map<String, String> map) {
        updateOwnState$default(this, map, (lfd) null, (lfd) null, 6, (Object) null);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, lfd lfd, lfd lfd2, int i, Object obj) {
        if ((i & 2) != 0) {
            lfd = null;
        }
        if ((i & 4) != 0) {
            lfd2 = null;
        }
        participantStatesManagerImpl.updateOwnState((Map<String, String>) map, lfd, lfd2);
    }

    public long getAssistanceRequestTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.ASSISTANCE_REQUESTED);
    }

    public boolean isAssistanceRequested(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.ASSISTANCE_REQUESTED);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map, lfd lfd) {
        updateMyStates$default(this, map, lfd, (lfd) null, 4, (Object) null);
    }

    public final void updateOwnState(Map<String, String> map, lfd lfd) {
        updateOwnState$default(this, map, lfd, (lfd) null, 4, (Object) null);
    }

    private final void updateOwnStateInternal(Map<String, String> map) {
        ConversationParticipant me = this.store.getMe();
        ge1 internalId = me.getInternalId();
        ie1 ie1 = new ie1(internalId);
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry next : map.entrySet()) {
            ie1.a.put((String) next.getKey(), new he1((String) next.getValue(), currentTimeMillis));
        }
        this.stateListener.onStateChanged(me, ie1);
        onStateChanged(internalId, ie1);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map, lfd lfd, lfd lfd2) {
        ge1 internalId = this.store.getMe().getInternalId();
        if (internalId != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                Map map2 = this.statesMap.get(next.getKey());
                if (value != mapBooleanFlagToStateValue(map2 != null ? map2.containsKey(internalId) : false)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new wia(((State) entry.getKey()).getKey(), ((StateValue) entry.getValue()).getValue()));
            }
            updateOwnStateInternal(ju7.V(arrayList), lfd, lfd2);
        }
    }

    public final void updateOwnState(State state, StateValue stateValue) {
        updateOwnState$default(this, state, stateValue, (lfd) null, (lfd) null, 12, (Object) null);
    }

    public final void updateOwnState(State state, StateValue stateValue, lfd lfd) {
        updateOwnState$default(this, state, stateValue, lfd, (lfd) null, 8, (Object) null);
    }

    public final void updateOwnState(State state, StateValue stateValue, lfd lfd, lfd lfd2) {
        updateMyStates(Collections.singletonMap(state, stateValue), lfd, lfd2);
    }

    public final void updateOwnState(Map<String, String> map, lfd lfd, lfd lfd2) {
        updateOwnStateInternal(map, lfd, lfd2);
    }
}
