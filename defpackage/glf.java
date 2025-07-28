package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: glf  reason: default package */
public final class glf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;
    public final /* synthetic */ lpc Z;
    public final /* synthetic */ FrameLayout w0;
    public final /* synthetic */ LinearLayout x0;
    public final /* synthetic */ a9a y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public glf(WebAppRootScreen webAppRootScreen, lpc lpc, FrameLayout frameLayout, LinearLayout linearLayout, a9a a9a, Continuation continuation) {
        super(2, continuation);
        this.Y = webAppRootScreen;
        this.Z = lpc;
        this.w0 = frameLayout;
        this.x0 = linearLayout;
        this.y0 = a9a;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((pmf) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        glf glf = new glf(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
        glf.X = obj;
        return glf;
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [a9a, android.view.View] */
    public final Object o(Object obj) {
        wx3.H(obj);
        pmf pmf = (pmf) this.X;
        k77[] k77Arr = WebAppRootScreen.K0;
        WebAppRootScreen webAppRootScreen = this.Y;
        webAppRootScreen.x0().setTitle((CharSequence) pmf.a);
        WebAppRootScreen.C0(webAppRootScreen.x0(), pmf.b);
        mmf mmf = mmf.a;
        lmf lmf = pmf.c;
        boolean f = hhd.f(lmf, mmf);
        lpc lpc = this.Z;
        FrameLayout frameLayout = this.w0;
        if (f) {
            lpc.setVisibility(8);
            int childCount = frameLayout.getChildCount();
            View view = this.x0;
            if (childCount <= 1 || frameLayout.getChildAt(1) != view) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(view, 1);
            }
            webAppRootScreen.D0(false);
        } else if (hhd.f(lmf, nmf.a)) {
            lpc.setVisibility(8);
            int childCount2 = frameLayout.getChildCount();
            ? r7 = this.y0;
            if (childCount2 <= 1 || frameLayout.getChildAt(1) != r7) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(r7, 1);
            }
            webAppRootScreen.D0(false);
        } else if (lmf instanceof omf) {
            lpc.setVisibility(0);
            if (frameLayout.getChildCount() > 1) {
                frameLayout.removeViewAt(1);
            }
            webAppRootScreen.D0(((omf) lmf).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
