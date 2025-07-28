package ru.ok.messages.views.fragments;

import ru.ok.messages.views.fragments.base.FrgBase;

public abstract class FrgSlideOut extends FrgBase implements ojd {
    public boolean F1 = true;

    public boolean D() {
        return true;
    }

    public void N(int i) {
        if (h1() != null) {
            c0().finish();
            c0().overridePendingTransition(0, 0);
        }
    }

    public void Q() {
        i16 s1 = s1();
        if (s1 != null) {
            this.F1 = s1.f();
            s1.c(false, true, true);
        }
    }

    public void n1(r5 r5Var) {
        this.r1 = false;
        if (!(r5Var instanceof i16)) {
            throw new RuntimeException("Parent activity must implement FrgSlideOut.Listener interface");
        }
    }

    public final void p() {
        i16 s1 = s1();
        if (s1 != null && this.F1) {
            s1.c(true, true, false);
        }
    }

    public i16 s1() {
        if (h1() != null) {
            return (i16) h1();
        }
        return null;
    }
}
