package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: h01  reason: default package */
public final class h01 extends FrameLayout {
    public final t97 a = ez3.O(3, new a01(1));
    public final t97 b;
    public final t97 c;

    public h01(Context context) {
        super(context, (AttributeSet) null);
        this.b = ez3.O(3, new g01(context, this, 0));
        this.c = ez3.O(3, new g01(context, this, 1));
    }

    private final f01 getNewCallBottomPanel() {
        return (f01) this.b.getValue();
    }

    private final zz0 getOldCallBottomPanel() {
        return (zz0) this.c.getValue();
    }

    public final void a() {
        if (d()) {
            f01 newCallBottomPanel = getNewCallBottomPanel();
            jme jme = newCallBottomPanel.V0;
            if (jme != null) {
                jme.dismiss();
            }
            jme jme2 = newCallBottomPanel.W0;
            if (jme2 != null) {
                jme2.dismiss();
            }
            newCallBottomPanel.V0 = null;
            newCallBottomPanel.W0 = null;
            return;
        }
        getOldCallBottomPanel().y();
    }

    public final void b() {
        if (d()) {
            jme jme = getNewCallBottomPanel().V0;
            if (jme != null) {
                jme.a();
                return;
            }
            return;
        }
        jme jme2 = getOldCallBottomPanel().U0;
        if (jme2 != null) {
            jme2.a();
        }
    }

    public final void c() {
        jme jme;
        if (d() && (jme = getNewCallBottomPanel().W0) != null) {
            jme.a();
        }
    }

    public final boolean d() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void e(ArrayList arrayList) {
        if (!d()) {
            getOldCallBottomPanel().B(arrayList);
        }
    }

    public final void f() {
        if (d()) {
            f01 newCallBottomPanel = getNewCallBottomPanel();
            jme jme = newCallBottomPanel.V0;
            hge hge = new hge(r1a.I1);
            int i = n1a.V;
            f01 f01 = newCallBottomPanel;
            newCallBottomPanel.V0 = f01.x(jme, newCallBottomPanel.O0, hge, new c01(newCallBottomPanel, 1), Integer.valueOf(i));
            return;
        }
        getOldCallBottomPanel().C();
    }

    public final void g(lg7 lg7) {
        if (!d()) {
            getOldCallBottomPanel().F(lg7);
        }
    }

    public final void h() {
        if (d()) {
            f01 newCallBottomPanel = getNewCallBottomPanel();
            f01 f01 = newCallBottomPanel;
            newCallBottomPanel.W0 = f01.x(newCallBottomPanel.W0, newCallBottomPanel.Q0, new hge(r1a.J1), new c01(newCallBottomPanel, 2), (Integer) null);
        }
    }

    public final void setAudioInfo(l31 l31) {
        if (d()) {
            getNewCallBottomPanel().setAudioInfo(l31);
        } else {
            getOldCallBottomPanel().setAudioInfo(l31);
        }
    }

    public final void setClickListener(e01 e01) {
        if (d()) {
            getNewCallBottomPanel().setClickListener(e01);
        } else {
            getOldCallBottomPanel().setClickListener(e01);
        }
    }

    public final void setMicrophoneEnabled(hy7 hy7) {
        if (d()) {
            getNewCallBottomPanel().setMicrophoneEnabled(hy7);
        } else {
            getOldCallBottomPanel().setMicrophoneEnabled(hy7);
        }
    }

    public final void setRaiseHand(hy7 hy7) {
        if (d()) {
            getNewCallBottomPanel().setRaiseHand(hy7);
        }
    }

    public final void setVideoEnabled(hy7 hy7) {
        if (d()) {
            getNewCallBottomPanel().setVideoEnabled(hy7);
        } else {
            getOldCallBottomPanel().setVideoEnabled(hy7);
        }
    }

    public final void setVolumeMicrophone(float f) {
        if (d()) {
            getNewCallBottomPanel().setVolumeMicrophone(f);
        }
    }
}
