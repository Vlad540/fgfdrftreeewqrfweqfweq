package defpackage;

import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: p71  reason: default package */
public final class p71 extends taf implements qk1 {
    public final so1 X;
    public final vp1 Y;
    public final xk1 Z;
    public final boolean b;
    public final long c;
    public final n11 o;
    public final qz0 w0;
    public final grd x0;
    public final grd y0;

    public p71(boolean z, long j, String str, String str2, n11 n11, so1 so1, vp1 vp1, w6a w6a, xk1 xk1, qz0 qz0) {
        this.b = z;
        this.c = j;
        this.o = n11;
        this.X = so1;
        this.Y = vp1;
        this.Z = xk1;
        this.w0 = qz0;
        grd a = hrd.a(new l71(new y11((Long) null, (CharSequence) str, new mc0(new ub0(t5a.a(str, w6a), j), str2 != null ? new String(Base64.decode(str2, 0), StandardCharsets.UTF_8) : null), 9), z, xk1.b(z)));
        this.x0 = a;
        this.y0 = a;
        vp1.d(this);
        xs7.E(this.a, (hu3) null, (ru3) null, new o71(this, (Continuation) null), 3);
    }

    public final void onCallAccepted() {
        grd grd;
        Object value;
        p71.super.onCallAccepted();
        do {
            grd = this.x0;
            value = grd.getValue();
            n71 n71 = (n71) value;
        } while (!grd.b(value, new m71(true)));
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        grd grd;
        Object value;
        do {
            grd = this.x0;
            value = grd.getValue();
            n71 n71 = (n71) value;
        } while (!grd.b(value, new m71(false)));
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        grd grd;
        Object value;
        do {
            grd = this.x0;
            value = grd.getValue();
            n71 n71 = (n71) value;
        } while (!grd.b(value, new m71(true)));
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    public final void q() {
        grd grd;
        Object value;
        ((ep1) this.X).e();
        MicrophoneManager c2 = ((rz0) this.w0).c();
        if (c2 != null) {
            c2.setMicEnabled(true);
        }
        oc1.c.P1().b(":call-active?place=".concat(BuildConfig.FLAVOR), (Bundle) null);
        do {
            grd = this.x0;
            value = grd.getValue();
            n71 n71 = (n71) value;
        } while (!grd.b(value, new m71(true)));
    }
}
