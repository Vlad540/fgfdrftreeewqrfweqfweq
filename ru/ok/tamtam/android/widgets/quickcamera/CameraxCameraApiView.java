package ru.ok.tamtam.android.widgets.quickcamera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView;", "Landroid/widget/FrameLayout;", "Los1;", "", "getStatusBarHeight", "()I", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "Lgkb;", "sizeSelector", "Ljue;", "setPictureSize", "(Lgkb;)V", "Ls7f;", "videoQuality", "setVideoQuality", "(Ls7f;)V", "Lju1;", "cameraListener", "setCameraListener", "(Lju1;)V", "", "flash", "setFlash", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class CameraxCameraApiView extends FrameLayout implements os1 {
    public static final /* synthetic */ int y0 = 0;
    public final Executor a;
    public final k3b b;
    public final rb7 c;
    public final iu1 o;
    public ju1 w0;
    public a6c x0;

    public CameraxCameraApiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    private final int getStatusBarHeight() {
        WindowInsets rootWindowInsets;
        Insets f;
        Window window;
        Context context = getContext();
        View view = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            view = window.getDecorView();
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = new Rect();
            if (view != null) {
                view.getWindowVisibleDisplayFrame(rect);
            }
            return rect.top;
        } else if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null || (f = d4.f(rootWindowInsets)) == null) {
            return 0;
        } else {
            return f.top;
        }
    }

    public final void a(File file) {
        Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
        udd.q(cls.getName(), "startRecordVideo");
        if (d8.d(getContext(), "android.permission.RECORD_AUDIO") != 0) {
            udd.U(cls.getName(), "No permission to record audio");
            return;
        }
        re5 h = new c9(file).h();
        jv1 jv1 = new jv1(0, this);
        rb7 rb7 = this.c;
        rb7.getClass();
        gt0.i();
        e07.p("Camera not initialized.", rb7.i());
        gt0.i();
        boolean z = false;
        e07.p("VideoCapture disabled.", (rb7.b & 4) != 0);
        gt0.i();
        a6c a6c = rb7.g;
        if (a6c != null && !a6c.a.get()) {
            z = true;
        }
        e07.p("Recording video. Only one recording can be active at a time.", !z);
        Context context = rb7.B;
        rt1 rt1 = new rt1(rb7, kq3.a(context), jv1);
        ew0 ew0 = new ew0(context, rb7.f.L(), h);
        if (z3d.k(context, "android.permission.RECORD_AUDIO") != -1) {
            ew0.x();
            a6c u = ew0.u(this.a, rt1);
            rb7.h.put(rt1, u);
            rb7.g = u;
            this.x0 = u;
            return;
        }
        throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [wt1, java.lang.Exception] */
    public final void b() {
        try {
            this.c.l(1);
        } catch (IllegalStateException e) {
            udd.s(CameraxCameraApiView.class.getName(), "failed to enable photo-mode", e);
            gvf gvf = this.w0;
            if (gvf != null) {
                gvf.i(new Exception(e));
            }
        }
    }

    public final void c() {
        udd.q(CameraxCameraApiView.class.getName(), "destroyCamera");
        rb7 rb7 = this.c;
        rb7.getClass();
        gt0.i();
        rb7.E = null;
        rb7.m = null;
        f4b f4b = rb7.n;
        if (f4b != null) {
            f4b.a.f();
        }
        this.o.b.d(nb7.ON_DESTROY);
    }

    public final void d(ExecutorService executorService) {
        udd.q(CameraxCameraApiView.class.getName(), "takePicture");
        lv1 lv1 = new lv1(0, (Object) this);
        rb7 rb7 = this.c;
        rb7.getClass();
        gt0.i();
        e07.p("Camera not initialized.", rb7.i());
        gt0.i();
        boolean z = true;
        if ((rb7.b & 1) == 0) {
            z = false;
        }
        e07.p("ImageCapture disabled.", z);
        gt0.i();
        if (rb7.d.H() == 3 && (rb7.f() == null || rb7.f().b == null)) {
            throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
        }
        rb7.d.J(executorService, lv1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [wt1, java.lang.Exception] */
    public final void e() {
        iu1 iu1 = this.o;
        rb7 rb7 = this.c;
        Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
        udd.q(cls.getName(), "startPreviewCamera");
        try {
            rb7.getClass();
            gt0.i();
            rb7.E = iu1;
            rb7.q((Runnable) null);
            iu1.b.d(nb7.ON_RESUME);
        } catch (IllegalStateException e) {
            udd.s(cls.getName(), "failed to bind camera controller, start preview aborted", e);
            rb7.getClass();
            gt0.i();
            rb7.E = null;
            rb7.m = null;
            f4b f4b = rb7.n;
            if (f4b != null) {
                f4b.a.f();
            }
            gvf gvf = this.w0;
            if (gvf != null) {
                gvf.i(new Exception(e));
            }
        }
    }

    public final void f(boolean z) {
        this.c.k(z ? wu1.b : wu1.c);
    }

    public final void g() {
        udd.q(CameraxCameraApiView.class.getName(), "stopRecordVideo");
        a6c a6c = this.x0;
        if (a6c != null) {
            a6c.close();
        }
        this.x0 = null;
    }

    public View getRootView() {
        return this;
    }

    public final void h() {
        udd.q(CameraxCameraApiView.class.getName(), "stopPreviewCamera");
        this.o.b.d(nb7.ON_STOP);
    }

    public final void i() {
        this.c.l(4);
    }

    public final boolean j() {
        rb7 rb7 = this.c;
        rb7.getClass();
        gt0.i();
        qb7 qb7 = rb7.m;
        mw5 mw5 = qb7 == null ? null : qb7.c.G0;
        return mw5 != null && mw5.a.g() == 0;
    }

    public void setCameraListener(ju1 ju1) {
        this.w0 = ju1;
    }

    public void setFlash(String str) {
        int ordinal = ns1.valueOf(str).ordinal();
        int i = 2;
        if (ordinal != 0) {
            int i2 = 1;
            if (ordinal != 1) {
                i2 = 0;
                if (!(ordinal == 2 || ordinal == 3)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i = i2;
        }
        this.c.m(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setPictureSize(gkb gkb) {
    }

    public void setVideoQuality(s7f s7f) {
        int ordinal = s7f.ordinal();
        rb7 rb7 = this.c;
        switch (ordinal) {
            case 0:
                rb7.n(v2b.i(ma0.h));
                return;
            case 1:
                rb7.n(v2b.i(ma0.i));
                return;
            case 2:
                rb7.n(v2b.i(ma0.h));
                return;
            case 3:
                rb7.n(v2b.i(ma0.d));
                return;
            case 4:
                rb7.n(v2b.i(ma0.e));
                return;
            case 5:
                rb7.n(v2b.i(ma0.f));
                return;
            case 6:
                rb7.n(v2b.i(ma0.g));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraxCameraApiView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.a = kq3.a(context);
        k3b k3b = new k3b(context);
        this.b = k3b;
        st1 st1 = new st1(context);
        this.c = st1;
        iu1 iu1 = new iu1();
        this.o = iu1;
        k3b.setKeepScreenOn(true);
        addView(k3b, new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels + getStatusBarHeight()));
        k3b.getPreviewStreamState().e(iu1, new kv1(0, new l(18, this)));
        k3b.setImplementationMode(h3b.c);
        st1.k(wu1.c);
        st1.l(1);
        k3b.getViewPort();
        gt0.i();
        st1.t = true;
        k3b.setController(st1);
    }
}
