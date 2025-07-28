package ru.ok.android.externcalls.sdk.stereo.internal.command;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.externcalls.sdk.stereo.exception.ParticipantNotFoundException;
import ru.ok.android.externcalls.sdk.stereo.exception.PromotedLimitExceeded;
import ru.ok.android.externcalls.sdk.stereo.exception.StereoRoomException;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010#\u001a\u00020\u000e2$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u000e0\u001e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lxwb;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lxwb;)V", "", "method", "Lorg/json/JSONObject;", "errorResponse", "Lkotlin/Function1;", "", "Ljue;", "onError", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lu16;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "params", "Lkotlin/Function0;", "onSuccess", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "requestPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "acceptPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;Ls16;Lu16;)V", "Lkotlin/Function3;", "", "", "", "Ldn1;", "getHandsQueue", "(Lk26;Lu16;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lxwb;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StereoRoomCommandExecutorImpl implements StereoRoomCommandExecutor {
    private final xwb log;
    private final SignalingProvider signalingProvider;

    public StereoRoomCommandExecutorImpl(SignalingProvider signalingProvider2, xwb xwb) {
        this.signalingProvider = signalingProvider2;
        this.log = xwb;
    }

    /* access modifiers changed from: private */
    public static final void acceptPromotion$lambda$4(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void acceptPromotion$lambda$5(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("acceptPromotion", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void getHandsQueue$lambda$8(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, u16 u16, k26 k26, JSONObject jSONObject) {
        kn1 p = new gvf(5, stereoRoomCommandExecutorImpl.log).p(jSONObject);
        if (p != null) {
            Integer valueOf = Integer.valueOf(p.c);
            Boolean valueOf2 = Boolean.valueOf(p.b);
            List<cn1> list = p.a;
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (cn1 cn1 : list) {
                arrayList.add(cn1.a);
            }
            k26.invoke(valueOf, valueOf2, arrayList);
        } else if (u16 != null) {
            u16.invoke(new StereoRoomException("getHandsQueue: missing response", (Throwable) null, 2, (x54) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void getHandsQueue$lambda$9(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("getHandQueue", jSONObject, u16);
    }

    private final void parseErrorResponse(String str, JSONObject jSONObject, u16 u16) {
        Object obj;
        String optString = jSONObject.optString("error");
        if (hhd.f(optString, "chatRoom.partNotFound")) {
            obj = new ParticipantNotFoundException("Participant not found, " + str + " command " + jSONObject);
        } else if (hhd.f(optString, "chatRoom.promotedLimit")) {
            obj = new PromotedLimitExceeded();
        } else {
            obj = new StereoRoomException("Error response for " + str + " command " + jSONObject, (Throwable) null, 2, (x54) null);
        }
        if (u16 != null) {
            u16.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final void promoteParticipant$lambda$0(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void promoteParticipant$lambda$1(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("promoteParticipant", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void requestPromotion$lambda$2(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestPromotion$lambda$3(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("requestPromotion", jSONObject, u16);
    }

    public void acceptPromotion(StereoRoomCommandExecutor.AcceptPromotionParams acceptPromotionParams, s16 s16, u16 u16) {
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null) {
            boolean reject = acceptPromotionParams.getReject();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "accept-promotion");
            jSONObject.put("reject", reject);
            mfd.d(new x66(jSONObject), false, new ps(16, s16), new nsd(this, u16, 2));
        }
    }

    public void getHandsQueue(k26 k26, u16 u16) {
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "get-hand-queue");
            mfd.d(new x66(jSONObject), false, new yw0(this, u16, k26, 3), new nsd(this, u16, 0));
        }
    }

    public void promoteParticipant(StereoRoomCommandExecutor.PromoteParticipantParams promoteParticipantParams, s16 s16, u16 u16) {
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null) {
            mfd.d(x87.u(promoteParticipantParams.getParticipantId(), promoteParticipantParams.getPromote()), false, new ps(17, s16), new nsd(this, u16, 3));
        }
    }

    public void requestPromotion(StereoRoomCommandExecutor.RequestPromotionParams requestPromotionParams, s16 s16, u16 u16) {
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null) {
            boolean unrequest = requestPromotionParams.getUnrequest();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "request-promotion");
            jSONObject.put("unrequest", unrequest);
            mfd.d(new x66(jSONObject), false, new ps(15, s16), new nsd(this, u16, 1));
        }
    }
}
