package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: vnc  reason: default package */
public final class vnc extends View {
    public st1 a;
    public Window b;
    public unc c;

    /* access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.b;
        if (window == null) {
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    /* access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.b != null && !Float.isNaN(f)) {
            WindowManager.LayoutParams attributes = this.b.getAttributes();
            attributes.screenBrightness = f;
            this.b.setAttributes(attributes);
        }
    }

    private void setScreenFlashUiInfo(aq6 aq6) {
        st1 st1 = this.a;
        if (st1 != null) {
            snc snc = snc.b;
            tnc tnc = new tnc(snc, aq6);
            tnc f = st1.f();
            st1.C.put(snc, tnc);
            tnc f2 = st1.f();
            if (f2 != null && !f2.equals(f)) {
                tnc f3 = st1.f();
                if (f3 == null) {
                    bq6 bq6 = st1.d;
                    qt1 qt1 = st1.D;
                    bq6.getClass();
                    wnc wnc = new wnc(qt1);
                    bq6.u = wnc;
                    bq6.d().g(wnc);
                    return;
                }
                bq6 bq62 = st1.d;
                bq62.getClass();
                wnc wnc2 = new wnc(f3.b);
                bq62.u = wnc2;
                bq62.d().g(wnc2);
                f3.a.name();
            }
        }
    }

    public aq6 getScreenFlash() {
        return this.c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000;
    }

    public void setController(st1 st1) {
        gt0.i();
        st1 st12 = this.a;
        if (!(st12 == null || st12 == st1)) {
            setScreenFlashUiInfo((aq6) null);
        }
        this.a = st1;
        if (st1 != null) {
            gt0.i();
            if (st1.d.H() == 3 && this.b == null) {
                throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
            }
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        gt0.i();
        if (this.b != window) {
            this.c = window == null ? null : new unc(this);
        }
        this.b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
