package ru.ok.android.externcalls.sdk.audio.internal;

import kotlin.Metadata;
import org.webrtc.PeerConnectionFactory;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqk9;", "builder", "Lrk9;", "invoke", "(Lqk9;)Lrk9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1 extends b97 implements u16 {
    final /* synthetic */ boolean $clientsideAnn;
    final /* synthetic */ boolean $clientsidePlatform;
    final /* synthetic */ PeerConnectionFactory.EnhancerKind $enhancerKind;
    final /* synthetic */ int $fallbackStutterCountMillis;
    final /* synthetic */ int $fallbackTimeLimitMillis;
    final /* synthetic */ int $fallbackTimeframeMillis;
    final /* synthetic */ String $filePath;
    final /* synthetic */ int $inputSampleRate;
    final /* synthetic */ boolean $logTimings;
    final /* synthetic */ Runnable $onNoiseSuppressorDisabledDueToStutter;
    final /* synthetic */ int $outputSampleRate;
    final /* synthetic */ boolean $serversideAnn;
    final /* synthetic */ boolean $serversideBasic;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable) {
        super(1);
        this.$serversideBasic = z;
        this.$serversideAnn = z2;
        this.$clientsidePlatform = z3;
        this.$clientsideAnn = z4;
        this.$enhancerKind = enhancerKind;
        this.$filePath = str;
        this.$inputSampleRate = i;
        this.$outputSampleRate = i2;
        this.$fallbackTimeLimitMillis = i3;
        this.$fallbackStutterCountMillis = i4;
        this.$fallbackTimeframeMillis = i5;
        this.$logTimings = z5;
        this.$onNoiseSuppressorDisabledDueToStutter = runnable;
    }

    public final rk9 invoke(qk9 qk9) {
        int i;
        tg0 tg0;
        boolean z;
        qk9 qk92 = qk9;
        qk92.a = this.$serversideBasic;
        qk92.b = this.$serversideAnn;
        qk92.c = this.$clientsidePlatform;
        qk92.d = this.$clientsideAnn;
        PeerConnectionFactory.EnhancerKind enhancerKind = this.$enhancerKind;
        qk92.f = enhancerKind;
        if (enhancerKind == null) {
            i = -1;
        } else {
            i = pk9.$EnumSwitchMapping$1[enhancerKind.ordinal()];
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 2) {
                i2 = i != 3 ? 0 : 2;
            }
        }
        qk92.e = i2;
        qk92.g = this.$filePath;
        qk92.h = this.$inputSampleRate;
        qk92.i = this.$outputSampleRate;
        qk92.j = this.$fallbackTimeLimitMillis;
        qk92.k = this.$fallbackStutterCountMillis;
        qk92.l = this.$fallbackTimeframeMillis;
        qk92.m = this.$logTimings;
        Runnable runnable = this.$onNoiseSuppressorDisabledDueToStutter;
        if (runnable != null) {
            qk92.n = new e78(0, runnable, Runnable.class, "run", "run()V", 0, 22);
        }
        boolean z2 = qk92.a;
        boolean z3 = qk92.b;
        boolean z4 = qk92.c;
        boolean z5 = qk92.d;
        PeerConnectionFactory.EnhancerKind enhancerKind2 = qk92.f;
        String str = qk92.g;
        int i3 = qk92.h;
        int i4 = qk92.i;
        int i5 = qk92.j;
        int i6 = qk92.k;
        int i7 = qk92.l;
        boolean z6 = qk92.m;
        e78 e78 = qk92.n;
        if (e78 != null) {
            z = z6;
            tg0 = new tg0(5, e78);
        } else {
            z = z6;
            tg0 = null;
        }
        return new rk9(z2, z3, z4, z5, enhancerKind2, str, i3, i4, i5, i6, i7, z, tg0, qk92.e);
    }
}
