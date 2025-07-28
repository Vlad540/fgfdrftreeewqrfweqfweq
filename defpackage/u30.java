package defpackage;

import android.media.AudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

/* renamed from: u30  reason: default package */
public final /* synthetic */ class u30 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ AudioFocusRequestHelper a;

    public /* synthetic */ u30(AudioFocusRequestHelper audioFocusRequestHelper) {
        this.a = audioFocusRequestHelper;
    }

    public final void onAudioFocusChange(int i) {
        AudioFocusRequestHelper.requestFocus$lambda$0(this.a, i);
    }
}
