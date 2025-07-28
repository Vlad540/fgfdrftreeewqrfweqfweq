package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002deBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010!J3\u0010#\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010!J3\u0010$\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010!J?\u0010(\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b*\u0010)J?\u0010+\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b+\u0010)J?\u0010,\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0017\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00182\u0006\u0010/\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00182\u0006\u0010/\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J?\u0010?\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b?\u0010)J?\u0010@\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b@\u0010)J?\u0010A\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bA\u0010)J#\u0010E\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`D2\n\u0010B\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&2\n\u0010G\u001a\u00060Cj\u0002`DH\u0002¢\u0006\u0004\bH\u0010IJ/\u0010M\u001a\u00020\u00182\u0010\u0010K\u001a\f\u0012\b\u0012\u00060Cj\u0002`D0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0002¢\u0006\u0004\bM\u0010NJA\u0010O\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bO\u0010)JI\u0010P\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d2\u0016\u0010L\u001a\u0012\u0012\b\u0012\u00060Cj\u0002`D\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\bP\u0010QJ1\u0010R\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u001a\u0010\\\u001a\u00020[8\u0016X\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R$\u0010a\u001a\u00020;2\u0006\u0010`\u001a\u00020;8\u0016@RX\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\ba\u0010c¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Ljn1;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "Lxwb;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idResolver", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "grantRolesRequest", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Leje;", "timeProvider", "<init>", "(Lxwb;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Leje;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "listener", "Ljue;", "removeListener", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestPromotion", "(Ls16;Lu16;)V", "cancelPromotionRequest", "acceptPromotion", "rejectPromotion", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ls16;Lu16;)V", "revokePromotion", "rejectPromotionRequest", "unpromoteParticipant", "addListener", "Len1;", "event", "onAttendee", "(Len1;)V", "Lgn1;", "onHandUp", "(Lgn1;)V", "Lfn1;", "onFeedback", "(Lfn1;)V", "Lhn1;", "onPromotionUpdated", "(Lhn1;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "grantAdmin", "revokeAdmin", "revokeRoles", "externalId", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lge1;", "internalId", "getExternalId", "(Lge1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "", "ids", "block", "resolveIdsAndThen", "(Ljava/util/List;Ls16;)V", "unpromoteParticipantImpl", "withInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lu16;Lu16;)V", "idNotResolved", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lu16;)V", "Lxwb;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "handsQueue", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "<set-?>", "isMePromoted", "Z", "()Z", "Companion", "GrantRolesRequest", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StereoRoomManagerImpl implements StereoRoomManager, jn1, StereoRoomListenerManager {
    private static final Companion Companion = new Companion((x54) null);
    @Deprecated
    public static final String LOG_TAG = "StereoRoomManagerImpl";
    /* access modifiers changed from: private */
    public final StereoRoomCommandExecutor commandExecutor;
    private final GrantRolesRequest grantRolesRequest;
    private final StereoRoomHandsQueueImpl handsQueue;
    private final IdMappingWrapper idMappingWrapper;
    private final IdMappingResolver idResolver;
    private boolean isMePromoted;
    /* access modifiers changed from: private */
    public final StereoRoomListenerManagerImpl listenersManager;
    private final xwb logger;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000e\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "revoke", "", "Lje1;", "roles", "Ljava/lang/Runnable;", "onSuccess", "onError", "Ljue;", "grantRoles", "(Lge1;Z[Lje1;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface GrantRolesRequest {
        void grantRoles(ge1 ge1, boolean z, je1[] je1Arr, Runnable runnable, Runnable runnable2);
    }

    public StereoRoomManagerImpl(xwb xwb, ParticipantStore participantStore, IdMappingResolver idMappingResolver, GrantRolesRequest grantRolesRequest2, StereoRoomCommandExecutor stereoRoomCommandExecutor, IdMappingWrapper idMappingWrapper2, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, eje eje) {
        this.logger = xwb;
        this.store = participantStore;
        this.idResolver = idMappingResolver;
        this.grantRolesRequest = grantRolesRequest2;
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idMappingWrapper = idMappingWrapper2;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.handsQueue = new StereoRoomHandsQueueImpl(stereoRoomCommandExecutor, new StereoRoomManagerImpl$handsQueue$1(this), new StereoRoomManagerImpl$handsQueue$2(this), stereoRoomListenerManagerImpl, eje);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getExternalId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.android.externcalls.sdk.id.ParticipantId getExternalId(defpackage.ge1 r2) {
        /*
            r1 = this;
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r0 = r1.store
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r0.getByInternal(r2)
            if (r0 == 0) goto L_0x000e
            ru.ok.android.externcalls.sdk.id.ParticipantId r0 = r0.getExternalId()
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r1 = r1.idMappingWrapper
            ru.ok.android.externcalls.sdk.id.ParticipantId r0 = r1.getByInternal(r2)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.getExternalId(ge1):ru.ok.android.externcalls.sdk.id.ParticipantId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getInternalId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ge1 getInternalId(ru.ok.android.externcalls.sdk.id.ParticipantId r2) {
        /*
            r1 = this;
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r0 = r1.store
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r0.getByExternal(r2)
            if (r0 == 0) goto L_0x000e
            ge1 r0 = r0.getInternalId()
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r1 = r1.idMappingWrapper
            ge1 r0 = r1.getByExternal(r2)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.getInternalId(ru.ok.android.externcalls.sdk.id.ParticipantId):ge1");
    }

    /* access modifiers changed from: private */
    public static final void grantAdmin$lambda$2$lambda$0(s16 s16) {
        s16.invoke();
    }

    /* access modifiers changed from: private */
    public static final void grantAdmin$lambda$2$lambda$1(u16 u16) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Grant admin failed"));
        }
    }

    private final void idNotResolved(ParticipantId participantId, u16 u16) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Can't resolve internal id of participant " + participantId));
        }
    }

    /* access modifiers changed from: private */
    public final void resolveIdsAndThen(List<ge1> list, s16 s16) {
        ArrayList arrayList = new ArrayList();
        for (ge1 ge1 : list) {
            if (getExternalId(ge1) == null) {
                arrayList.add(ge1);
            }
        }
        if (arrayList.isEmpty()) {
            s16.invoke();
        } else {
            this.idResolver.resolveExternalsByInternalsIds(arrayList, new tg0(9, s16), new wc3(this, arrayList, list, s16, 15));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$10(StereoRoomManagerImpl stereoRoomManagerImpl, List list, List list2, s16 s16) {
        stereoRoomManagerImpl.logger.log(LOG_TAG, "Something went wrong during internal to external id list resolution");
        if (list.size() < list2.size()) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$9(s16 s16) {
        s16.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeAdmin$lambda$5$lambda$3(s16 s16) {
        s16.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeAdmin$lambda$5$lambda$4(u16 u16) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Revoke admin failed"));
        }
    }

    private final void revokeRoles(ParticipantId participantId, s16 s16, u16 u16) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        ke1 callParticipant = byExternal != null ? byExternal.getCallParticipant() : null;
        if (callParticipant == null) {
            s16.invoke();
            return;
        }
        List list = callParticipant.e;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        je1 je1 = je1.b;
        if (list.contains(je1)) {
            linkedHashSet.add(je1);
        }
        je1 je12 = je1.c;
        if (list.contains(je12)) {
            linkedHashSet.add(je12);
        }
        if (linkedHashSet.isEmpty()) {
            s16.invoke();
            return;
        }
        GrantRolesRequest grantRolesRequest2 = this.grantRolesRequest;
        ge1 ge1 = callParticipant.a;
        if (ge1 != null) {
            grantRolesRequest2.grantRoles(ge1, true, (je1[]) linkedHashSet.toArray(new je1[0]), new tg0(8, s16), new x2d(1, u16));
        }
    }

    /* access modifiers changed from: private */
    public static final void revokeRoles$lambda$6(s16 s16) {
        s16.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeRoles$lambda$7(u16 u16) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Revoke all roles failed"));
        }
    }

    /* access modifiers changed from: private */
    public final void unpromoteParticipantImpl(ParticipantId participantId, s16 s16, u16 u16) {
        withInternalId(participantId, u16, new StereoRoomManagerImpl$unpromoteParticipantImpl$1(this, s16, u16));
    }

    private final void withInternalId(ParticipantId participantId, u16 u16, u16 u162) {
        this.idResolver.withInternalId(participantId, new mf3(4, u162), new ncd(this, participantId, u16, 3));
    }

    /* access modifiers changed from: private */
    public static final void withInternalId$lambda$11(u16 u16, ge1 ge1) {
        u16.invoke(ge1);
    }

    /* access modifiers changed from: private */
    public static final void withInternalId$lambda$12(StereoRoomManagerImpl stereoRoomManagerImpl, ParticipantId participantId, u16 u16) {
        stereoRoomManagerImpl.idNotResolved(participantId, u16);
    }

    public void acceptPromotion(s16 s16, u16 u16) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(false), s16, u16);
    }

    public void addListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.addListener(stereoRoomManagerListener);
        stereoRoomManagerListener.onOwnPromotionChanged(isMePromoted());
    }

    public void cancelPromotionRequest(s16 s16, u16 u16) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(true), s16, u16);
    }

    public void grantAdmin(ParticipantId participantId, s16 s16, u16 u16) {
        ge1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, false, new je1[]{je1.b}, new tg0(10, s16), new x2d(2, u16));
        }
    }

    public boolean isMePromoted() {
        return this.isMePromoted;
    }

    public void onAttendee(en1 en1) {
        resolveIdsAndThen(o23.i0(en1.b, en1.c), new StereoRoomManagerImpl$onAttendee$1(this, en1));
    }

    public void onFeedback(fn1 fn1) {
    }

    public void onHandUp(gn1 gn1) {
        getHandsQueue().onHandUp(gn1);
    }

    public void onMeInWaitingRoomChanged(boolean z) {
        this.isMePromoted = !z;
        this.listenersManager.onOwnPromotionChanged(isMePromoted());
    }

    public void onPromotionUpdated(hn1 hn1) {
        this.listenersManager.onPromotionRequestUpdated(new StereoRoomManagerListener.PromotionRequestUpdated(hn1.a));
    }

    public void promoteParticipant(ParticipantId participantId, s16 s16, u16 u16) {
        withInternalId(participantId, u16, new StereoRoomManagerImpl$promoteParticipant$1(this, s16, u16));
    }

    public void rejectPromotion(s16 s16, u16 u16) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(true), s16, u16);
    }

    public void rejectPromotionRequest(ParticipantId participantId, s16 s16, u16 u16) {
        unpromoteParticipantImpl(participantId, s16, u16);
    }

    public void removeListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.removeListener(stereoRoomManagerListener);
    }

    public void requestPromotion(s16 s16, u16 u16) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(false), s16, u16);
    }

    public void revokeAdmin(ParticipantId participantId, s16 s16, u16 u16) {
        ge1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, true, new je1[]{je1.b}, new tg0(11, s16), new x2d(3, u16));
        }
    }

    public void revokePromotion(ParticipantId participantId, s16 s16, u16 u16) {
        unpromoteParticipantImpl(participantId, s16, u16);
    }

    public void unpromoteParticipant(ParticipantId participantId, s16 s16, u16 u16) {
        revokeRoles(participantId, new StereoRoomManagerImpl$unpromoteParticipant$1(this, participantId, s16, u16), u16);
    }

    public StereoRoomHandsQueueImpl getHandsQueue() {
        return this.handsQueue;
    }
}
