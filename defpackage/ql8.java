package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: ql8  reason: default package */
public final class ql8 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, gm8 {
    public pl8 a;
    public uc b;
    public rg7 c;

    public final void f(pl8 pl8, boolean z) {
        uc ucVar;
        if ((z || pl8 == this.a) && (ucVar = this.b) != null) {
            ucVar.dismiss();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        rg7 rg7 = this.c;
        if (rg7.Z == null) {
            rg7.Z = new qg7(rg7);
        }
        this.a.q(rg7.Z.getItem(i), (hm8) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.f(this.a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        pl8 pl8 = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                pl8.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return pl8.performShortcut(i, keyEvent, 0);
    }

    public final boolean x(pl8 pl8) {
        return false;
    }
}
