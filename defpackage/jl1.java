package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: jl1  reason: default package */
public final class jl1 extends FrameLayout {
    public final t97 a = ez3.O(3, new di1(12));
    public final t97 b;
    public final t97 c;

    public jl1(Context context) {
        super(context, (AttributeSet) null);
        this.b = ez3.O(3, new il1(context, this, 0));
        this.c = ez3.O(3, new il1(context, this, 1));
    }

    private final hl1 getNewCallTopPanel() {
        return (hl1) this.b.getValue();
    }

    private final el1 getOldCallTopPanel() {
        return (el1) this.c.getValue();
    }

    public final void a() {
        hl1 newCallTopPanel = getNewCallTopPanel();
        newCallTopPanel.P0.removeCallbacks(newCallTopPanel.Q0);
        jme jme = newCallTopPanel.N0;
        if (jme != null) {
            jme.a();
        }
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        if (b()) {
            hl1 newCallTopPanel = getNewCallTopPanel();
            if (!hhd.f(newCallTopPanel.L0, Boolean.valueOf(z))) {
                newCallTopPanel.L0 = Boolean.valueOf(z);
                newCallTopPanel.U0.setIconTint(z ? -855638017 : qda.f.b.f);
            }
        }
    }

    public final void d(boolean z, gme gme) {
        if (b()) {
            getNewCallTopPanel().y(z, gme);
        }
    }

    public final void e(boolean z) {
        if (b()) {
            hl1 newCallTopPanel = getNewCallTopPanel();
            mt0.k(newCallTopPanel.S0, z, 0, (u16) null, 6);
            mt0.k(newCallTopPanel.T0, z, 0, (u16) null, 6);
        }
    }

    public final void setAddUserState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setAddUserState(z);
        }
    }

    public final void setClickListener(gl1 gl1) {
        if (b()) {
            getNewCallTopPanel().setClickListener(gl1);
        } else {
            getOldCallTopPanel().setClickListener(gl1);
        }
    }

    public final void setMode(raf raf) {
        if (!b()) {
            getOldCallTopPanel().setMode(raf);
        }
    }

    public final void setMoreState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setMoreButtonVisible(z);
        }
    }

    public final void setStatus(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setStatus(charSequence);
        } else {
            getOldCallTopPanel().setCallTime(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setTitle(charSequence);
        } else {
            getOldCallTopPanel().setTitle(charSequence);
        }
    }
}
