package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

/* renamed from: t30  reason: default package */
public final /* synthetic */ class t30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioFocusRequestHelper b;

    public /* synthetic */ t30(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        this.a = i;
        this.b = audioFocusRequestHelper;
    }

    public final void run() {
        int i = this.a;
        AudioFocusRequestHelper audioFocusRequestHelper = this.b;
        switch (i) {
            case 0:
                AudioFocusRequestHelper.muteForever$lambda$6(audioFocusRequestHelper);
                return;
            case 1:
                AudioFocusRequestHelper.mute$lambda$4(audioFocusRequestHelper);
                return;
            default:
                AudioFocusRequestHelper.unmute$lambda$8(audioFocusRequestHelper);
                return;
        }
    }
}
