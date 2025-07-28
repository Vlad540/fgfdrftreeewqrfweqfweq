package defpackage;

import android.app.PendingIntent;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.View;
import androidx.mediarouter.app.d;

/* renamed from: ma8  reason: default package */
public final class ma8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ ma8(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    public final void onClick(View view) {
        PendingIntent sessionActivity;
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return;
            case 1:
                d dVar = this.b;
                MediaControllerCompat mediaControllerCompat = dVar.g1;
                if (mediaControllerCompat != null && (sessionActivity = mediaControllerCompat.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        dVar.dismiss();
                        return;
                    } catch (PendingIntent.CanceledException unused) {
                        sessionActivity.toString();
                        return;
                    }
                } else {
                    return;
                }
            default:
                d dVar2 = this.b;
                boolean z = !dVar2.s1;
                dVar2.s1 = z;
                if (z) {
                    dVar2.S0.setVisibility(0);
                }
                dVar2.y1 = dVar2.s1 ? dVar2.z1 : dVar2.A1;
                dVar2.t(true);
                return;
        }
    }
}
