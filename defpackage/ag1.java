package defpackage;

import android.media.AudioManager;
import android.os.Vibrator;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ag1  reason: default package */
public final /* synthetic */ class ag1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg1 b;

    public /* synthetic */ ag1(cg1 cg1, int i) {
        this.a = i;
        this.b = cg1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (AudioManager) this.b.a.getSystemService("audio");
            case 1:
                return (Vibrator) this.b.a.getSystemService("vibrator");
            default:
                vqc vqc = this.b.c;
                vqc.getClass();
                return Boolean.valueOf(vqc.m(PmsKey.reconnect-call-ringtone, false));
        }
    }
}
