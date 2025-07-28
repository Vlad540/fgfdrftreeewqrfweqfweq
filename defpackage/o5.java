package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: o5  reason: default package */
public final class o5 extends dh0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v13, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public final void a(String str, oq6 oq6, Animatable animatable) {
        switch (this.b) {
            case 0:
                Point point = new Point(oq6.getWidth(), oq6.getHeight());
                ActAvatarCrop actAvatarCrop = (ActAvatarCrop) this.c;
                actAvatarCrop.e1 = point;
                actAvatarCrop.d1.setEnabled(true);
                return;
            case 1:
                ((az9) this.c).invalidateSelf();
                return;
            case 2:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                mz9 mz9 = (mz9) this.c;
                if (isCurrentThread) {
                    s16 s16 = mz9.G0;
                    if (s16 != null) {
                        s16.invoke();
                    }
                    mz9.invalidate();
                    return;
                }
                Handler handler = mz9.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new hz9(mz9, 0));
                    return;
                } else {
                    mz9.post(new hz9(mz9, 1));
                    return;
                }
            case 3:
                boolean isCurrentThread2 = Looper.getMainLooper().isCurrentThread();
                ? r8 = (OneMeDraweeView) this.c;
                if (isCurrentThread2) {
                    r8.p(oq6, animatable);
                    r8.requestLayout();
                    r8.invalidate();
                    return;
                }
                Handler handler2 = r8.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new m4a(r8, str, oq6, animatable, 0));
                    return;
                } else {
                    r8.post(new m4a(r8, str, oq6, animatable, 1));
                    return;
                }
            case 4:
                ((gye) this.c).invalidateSelf();
                return;
            default:
                ek8.T((ZoomableDraweeView) this.c, new zbe(this, 26, oq6));
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v12, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public void d(String str, Throwable th) {
        switch (this.b) {
            case 1:
                String str2 = ((az9) this.c).c;
                udd.U(str2, "Failed to load image. ID: " + str + ". Exception: " + th);
                return;
            case 2:
                mz9 mz9 = (mz9) this.c;
                String str3 = mz9.a;
                udd.S(str3, "Failed to load image. ID: " + str, th);
                mz9.postInvalidate();
                return;
            case 3:
                ? r3 = (OneMeDraweeView) this.c;
                String str4 = r3.B0;
                udd.U(str4, "Failed to load image. ID: " + str + ". Exception: " + th);
                if (Looper.getMainLooper().isCurrentThread()) {
                    r3.requestLayout();
                    r3.invalidate();
                    return;
                }
                Handler handler = r3.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new l4a(r3, 0));
                    return;
                } else {
                    r3.post(new l4a(r3, 1));
                    return;
                }
            case 4:
                u16 u16 = ((gye) this.c).c;
                if (u16 != null) {
                    u16.invoke(th);
                    return;
                }
                return;
            case 5:
                ek8.T((ZoomableDraweeView) this.c, new zbe(this, 27, th));
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public void g(String str) {
        switch (this.b) {
            case 5:
                ? r1 = (ZoomableDraweeView) this.c;
                ek8.T(r1, new cwf(r1, 1));
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v8, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public void h(String str, oq6 oq6) {
        switch (this.b) {
            case 1:
                ((az9) this.c).invalidateSelf();
                return;
            case 2:
                ((mz9) this.c).postInvalidate();
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                ? r1 = (OneMeDraweeView) this.c;
                if (isCurrentThread) {
                    r1.requestLayout();
                    r1.invalidate();
                    return;
                }
                Handler handler = r1.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new l4a(r1, 2));
                    return;
                } else {
                    r1.post(new l4a(r1, 3));
                    return;
                }
            case 5:
                ? r12 = (ZoomableDraweeView) this.c;
                r12.removeCallbacks(r12.F0);
                ek8.T(r12, r12.F0);
                return;
            default:
                return;
        }
    }
}
